package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes5.dex */
public final class zh2 extends jf0 {
    public static final Hashtable A;
    public static final Hashtable B;
    public static final zh2 C;
    public static final n0 s;
    public static final n0 t;
    public static final n0 u;
    public static final n0 v;
    public static final n0 w;
    public static final n0 x;
    public static final n0 y;
    public static final n0 z;
    public final Hashtable q;
    public final Hashtable r;

    static {
        n0 d = vz1.d("2.5.4.6");
        s = d;
        n0 d2 = vz1.d("2.5.4.10");
        n0 d3 = vz1.d("2.5.4.11");
        n0 d4 = vz1.d("2.5.4.12");
        n0 d5 = vz1.d("2.5.4.3");
        t = d5;
        u = vz1.d("2.5.4.5");
        n0 d6 = vz1.d("2.5.4.9");
        n0 d7 = vz1.d("2.5.4.5");
        n0 d8 = vz1.d("2.5.4.7");
        n0 d9 = vz1.d("2.5.4.8");
        n0 d10 = vz1.d("2.5.4.4");
        n0 d11 = vz1.d("2.5.4.42");
        n0 d12 = vz1.d("2.5.4.43");
        n0 d13 = vz1.d("2.5.4.44");
        n0 d14 = vz1.d("2.5.4.45");
        n0 d15 = vz1.d("2.5.4.13");
        n0 d16 = vz1.d("2.5.4.15");
        n0 d17 = vz1.d("2.5.4.17");
        n0 d18 = vz1.d("2.5.4.46");
        v = d18;
        n0 d19 = vz1.d("2.5.4.65");
        n0 d20 = vz1.d("2.5.4.72");
        n0 d21 = vz1.d("1.3.6.1.5.5.7.9.1");
        w = d21;
        n0 d22 = vz1.d("1.3.6.1.5.5.7.9.2");
        n0 d23 = vz1.d("1.3.6.1.5.5.7.9.3");
        n0 d24 = vz1.d("1.3.6.1.5.5.7.9.4");
        n0 d25 = vz1.d("1.3.6.1.5.5.7.9.5");
        n0 d26 = vz1.d("1.3.36.8.3.14");
        n0 d27 = vz1.d("2.5.4.16");
        new n0("2.5.4.54").G();
        n0 n0Var = s6w.a;
        x = n0Var;
        n0 n0Var2 = s6w.b;
        n0 n0Var3 = s6w.c;
        n0 n0Var4 = zzj.b;
        y = n0Var4;
        n0 n0Var5 = zzj.c;
        n0 n0Var6 = zzj.d;
        n0 n0Var7 = new n0("0.9.2342.19200300.100.1.25");
        z = n0Var7;
        n0 n0Var8 = new n0("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        A = hashtable;
        Hashtable hashtable2 = new Hashtable();
        B = hashtable2;
        hashtable.put(d, "C");
        hashtable.put(d2, "O");
        hashtable.put(d4, "T");
        hashtable.put(d3, "OU");
        hashtable.put(d5, "CN");
        hashtable.put(d8, "L");
        hashtable.put(d9, "ST");
        hashtable.put(d7, "SERIALNUMBER");
        hashtable.put(n0Var4, "E");
        hashtable.put(n0Var7, "DC");
        hashtable.put(n0Var8, "UID");
        hashtable.put(d6, "STREET");
        hashtable.put(d10, "SURNAME");
        hashtable.put(d11, "GIVENNAME");
        hashtable.put(d12, "INITIALS");
        hashtable.put(d13, "GENERATION");
        hashtable.put(d15, "DESCRIPTION");
        hashtable.put(d20, "ROLE");
        hashtable.put(n0Var6, "unstructuredAddress");
        hashtable.put(n0Var5, "unstructuredName");
        hashtable.put(d14, "UniqueIdentifier");
        hashtable.put(d18, "DN");
        hashtable.put(d19, "Pseudonym");
        hashtable.put(d27, "PostalAddress");
        hashtable.put(d26, "NameAtBirth");
        hashtable.put(d24, "CountryOfCitizenship");
        hashtable.put(d25, "CountryOfResidence");
        hashtable.put(d23, "Gender");
        hashtable.put(d22, "PlaceOfBirth");
        hashtable.put(d21, "DateOfBirth");
        hashtable.put(d17, "PostalCode");
        hashtable.put(d16, "BusinessCategory");
        hashtable.put(n0Var, "TelephoneNumber");
        hashtable.put(n0Var2, "Name");
        hashtable.put(n0Var3, "organizationIdentifier");
        hashtable2.put("c", d);
        hashtable2.put("o", d2);
        hashtable2.put("t", d4);
        hashtable2.put("ou", d3);
        hashtable2.put("cn", d5);
        hashtable2.put("l", d8);
        hashtable2.put("st", d9);
        hashtable2.put("sn", d10);
        hashtable2.put("serialnumber", d7);
        hashtable2.put("street", d6);
        hashtable2.put("emailaddress", n0Var4);
        hashtable2.put("dc", n0Var7);
        hashtable2.put("e", n0Var4);
        hashtable2.put("uid", n0Var8);
        hashtable2.put("surname", d10);
        hashtable2.put("givenname", d11);
        hashtable2.put("initials", d12);
        hashtable2.put("generation", d13);
        hashtable2.put(DeviceService.KEY_DESC, d15);
        hashtable2.put("role", d20);
        hashtable2.put("unstructuredaddress", n0Var6);
        hashtable2.put("unstructuredname", n0Var5);
        hashtable2.put("uniqueidentifier", d14);
        hashtable2.put("dn", d18);
        hashtable2.put("pseudonym", d19);
        hashtable2.put("postaladdress", d27);
        hashtable2.put("nameatbirth", d26);
        hashtable2.put("countryofcitizenship", d24);
        hashtable2.put("countryofresidence", d25);
        hashtable2.put("gender", d23);
        hashtable2.put("placeofbirth", d22);
        hashtable2.put("dateofbirth", d21);
        hashtable2.put("postalcode", d17);
        hashtable2.put("businesscategory", d16);
        hashtable2.put("telephonenumber", n0Var);
        hashtable2.put("name", n0Var2);
        hashtable2.put("organizationidentifier", n0Var3);
        C = new zh2();
    }

    public zh2() {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = A;
        Enumeration keys = hashtable2.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable.put(nextElement, hashtable2.get(nextElement));
        }
        this.r = hashtable;
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = B;
        Enumeration keys2 = hashtable4.keys();
        while (keys2.hasMoreElements()) {
            Object nextElement2 = keys2.nextElement();
            hashtable3.put(nextElement2, hashtable4.get(nextElement2));
        }
        this.q = hashtable3;
    }

    public final n0 h0(String str) {
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z2 = true;
            }
        }
        if ((z2 ? new String(charArray) : str).startsWith("OID.")) {
            return new n0(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new n0(str);
        }
        n0 n0Var = (n0) this.q.get(fxf.a0(str));
        if (n0Var != null) {
            return n0Var;
        }
        xq0.x(hrg.q("Unknown object id - ", str, " - passed to distinguished name"));
        return null;
    }
}
