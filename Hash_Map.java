import java.util.ArrayList;
import java.util.HashMap;
class Hash_Map {
    public static void main(String[] args) {        
    // HashMap
        ArrayList<String> ListAndroid = new ArrayList<String>();
        ListAndroid.add("Samsung and OPPO run on Android");
        ListAndroid.add("Android is the best choice");
        ListAndroid.add("Android here");

        ArrayList<String> ListJava = new ArrayList<String>();
        ListJava.add("Java and oop");
        ListJava.add("java work for android");
        ListJava.add("java is very fast");

        ArrayList<String> ListIOS = new ArrayList<String>();
        ListIOS.add("Iphone run on IOS");
        ListIOS.add("New version of ios avilibe");
        ListIOS.add("All today news about ios");

        HashMap<String, ArrayList<String>> s = new HashMap<String, ArrayList<String>>();

        s.put("her", ListAndroid);
        s.put("Java", ListJava);
        s.put("IOS", ListIOS);

        System.out.println(s.get("IOS"));
    }
}