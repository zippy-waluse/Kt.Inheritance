fun main() {
    val banker = Banker("Kevin",24)
    val doctor = Doctor("Anne",30)
    val farmer = Farmer("Scarlet",22)


    banker.introduction()
    farmer.introduction()
    doctor.introduction()


    banker.eat()
    banker.countMoney(arrayOf(100,50,200,100))
    banker.sleep()
    banker.talk("Right turn")

    doctor.eat()
    doctor.sleep()
    doctor.talk("")


    farmer.eat()
    farmer.sleep()
    farmer.cultivateLand()
//
//    banker.name
//    banker.age

}

open class Person(var name:String,var age:Int){

        fun talk(words:String){
            println(words)
        }

       open fun eat(){
            println("yum")
        }

        fun sleep(){
            println("zzzzz")
        }

   open fun introduction(){
        println("Hi, I am $name")
    }

    }





class Banker(name:String, age:Int):Person(name,age){


        fun countMoney(notes: Array<Int>): Int {
        var sum = 0
        notes.forEach {note-> sum+=note}
        return sum
    }

    override fun introduction() {
      println("Hi, I am $name,C.P.A")
    }
}

class Doctor(name:String, age:Int):Person(name,age){



    fun treatPatient(patient:String,disease:String){
        println("Treat $patient for $ disease")
    }

    override fun introduction(){
        println("Hi,I am $name")
    }


    }

class Farmer(name:String, age:Int):Person(name,age){




    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        super.eat()
        println("I'm eating the food that I have grown")
    }

//    funadultingForHowLong(age:Int=12){
//        var diff = age-18
//        println("You have been an adult for $years")
//    }

    }


