package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes4.dex */
public class rc51 extends o2 {
    public static final Hashtable A;
    public static final Hashtable B = null;
    public static final Hashtable C = null;
    public static final Hashtable D;
    public static final Boolean E;
    public static final Boolean F;
    public oc51 a = null;
    public Vector b = new Vector();
    public Vector c = new Vector();
    public Vector w = new Vector();
    public i3 x;
    public boolean y;
    public int z;

    static {
        u2 u2Var = new u2("2.5.4.6");
        u2 u2Var2 = new u2("2.5.4.10");
        u2 u2Var3 = new u2("2.5.4.11");
        u2 u2Var4 = new u2("2.5.4.12");
        u2 u2Var5 = new u2("2.5.4.3");
        u2 u2Var6 = new u2("2.5.4.5");
        u2 u2Var7 = new u2("2.5.4.9");
        u2 u2Var8 = new u2("2.5.4.7");
        u2 u2Var9 = new u2("2.5.4.8");
        u2 u2Var10 = new u2("2.5.4.4");
        u2 u2Var11 = new u2("2.5.4.42");
        u2 u2Var12 = new u2("2.5.4.43");
        u2 u2Var13 = new u2("2.5.4.44");
        u2 u2Var14 = new u2("2.5.4.45");
        u2 u2Var15 = new u2("2.5.4.15");
        u2 u2Var16 = new u2("2.5.4.17");
        u2 u2Var17 = new u2("2.5.4.46");
        u2 u2Var18 = new u2("2.5.4.65");
        u2 u2Var19 = new u2("1.3.6.1.5.5.7.9.1");
        u2 u2Var20 = new u2("1.3.6.1.5.5.7.9.2");
        u2 u2Var21 = new u2("1.3.6.1.5.5.7.9.3");
        u2 u2Var22 = new u2("1.3.6.1.5.5.7.9.4");
        u2 u2Var23 = new u2("1.3.6.1.5.5.7.9.5");
        u2 u2Var24 = new u2("1.3.36.8.3.14");
        u2 u2Var25 = new u2("2.5.4.16");
        new u2("2.5.4.54");
        u2 u2Var26 = uc51.F4;
        u2 u2Var27 = uc51.G4;
        u2 u2Var28 = b490.r3;
        u2 u2Var29 = b490.s3;
        u2 u2Var30 = b490.y3;
        u2 u2Var31 = new u2("0.9.2342.19200300.100.1.25");
        u2 u2Var32 = new u2("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        A = hashtable;
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = new Hashtable();
        D = hashtable4;
        E = new Boolean(true);
        F = new Boolean(false);
        hashtable.put(u2Var, CA20Status.STATUS_REQUEST_C);
        hashtable.put(u2Var2, "O");
        hashtable.put(u2Var4, "T");
        hashtable.put(u2Var3, "OU");
        hashtable.put(u2Var5, "CN");
        hashtable.put(u2Var8, "L");
        hashtable.put(u2Var9, "ST");
        hashtable.put(u2Var6, "SERIALNUMBER");
        hashtable.put(u2Var28, "E");
        hashtable.put(u2Var31, "DC");
        hashtable.put(u2Var32, "UID");
        hashtable.put(u2Var7, "STREET");
        hashtable.put(u2Var10, "SURNAME");
        hashtable.put(u2Var11, "GIVENNAME");
        hashtable.put(u2Var12, "INITIALS");
        hashtable.put(u2Var13, "GENERATION");
        hashtable.put(u2Var30, "unstructuredAddress");
        hashtable.put(u2Var29, "unstructuredName");
        hashtable.put(u2Var14, "UniqueIdentifier");
        hashtable.put(u2Var17, "DN");
        hashtable.put(u2Var18, "Pseudonym");
        hashtable.put(u2Var25, "PostalAddress");
        hashtable.put(u2Var24, "NameAtBirth");
        hashtable.put(u2Var22, "CountryOfCitizenship");
        hashtable.put(u2Var23, "CountryOfResidence");
        hashtable.put(u2Var21, "Gender");
        hashtable.put(u2Var20, "PlaceOfBirth");
        hashtable.put(u2Var19, "DateOfBirth");
        hashtable.put(u2Var16, "PostalCode");
        hashtable.put(u2Var15, "BusinessCategory");
        hashtable.put(u2Var26, "TelephoneNumber");
        hashtable.put(u2Var27, PlusAcquisitionSmartOffer.Texts.NAME);
        hashtable2.put(u2Var, CA20Status.STATUS_REQUEST_C);
        hashtable2.put(u2Var2, "O");
        hashtable2.put(u2Var3, "OU");
        hashtable2.put(u2Var5, "CN");
        hashtable2.put(u2Var8, "L");
        hashtable2.put(u2Var9, "ST");
        hashtable2.put(u2Var7, "STREET");
        hashtable2.put(u2Var31, "DC");
        hashtable2.put(u2Var32, "UID");
        hashtable3.put(u2Var, CA20Status.STATUS_REQUEST_C);
        hashtable3.put(u2Var2, "O");
        hashtable3.put(u2Var3, "OU");
        hashtable3.put(u2Var5, "CN");
        hashtable3.put(u2Var8, "L");
        hashtable3.put(u2Var9, "ST");
        hashtable3.put(u2Var7, "STREET");
        hashtable4.put("c", u2Var);
        hashtable4.put("o", u2Var2);
        hashtable4.put("t", u2Var4);
        hashtable4.put("ou", u2Var3);
        hashtable4.put("cn", u2Var5);
        hashtable4.put("l", u2Var8);
        hashtable4.put("st", u2Var9);
        hashtable4.put("sn", u2Var6);
        hashtable4.put("serialnumber", u2Var6);
        hashtable4.put("street", u2Var7);
        hashtable4.put("emailaddress", u2Var28);
        hashtable4.put("dc", u2Var31);
        hashtable4.put("e", u2Var28);
        hashtable4.put("uid", u2Var32);
        hashtable4.put("surname", u2Var10);
        hashtable4.put("givenname", u2Var11);
        hashtable4.put("initials", u2Var12);
        hashtable4.put("generation", u2Var13);
        hashtable4.put("unstructuredaddress", u2Var30);
        hashtable4.put("unstructuredname", u2Var29);
        hashtable4.put("uniqueidentifier", u2Var14);
        hashtable4.put("dn", u2Var17);
        hashtable4.put("pseudonym", u2Var18);
        hashtable4.put("postaladdress", u2Var25);
        hashtable4.put("nameofbirth", u2Var24);
        hashtable4.put("countryofcitizenship", u2Var22);
        hashtable4.put("countryofresidence", u2Var23);
        hashtable4.put("gender", u2Var21);
        hashtable4.put("placeofbirth", u2Var20);
        hashtable4.put("dateofbirth", u2Var19);
        hashtable4.put("postalcode", u2Var16);
        hashtable4.put("businesscategory", u2Var15);
        hashtable4.put("telephonenumber", u2Var26);
        hashtable4.put("name", u2Var27);
    }

    public rc51(i3 i3Var) {
        Vector vector;
        this.x = i3Var;
        Enumeration B2 = i3Var.B();
        while (B2.hasMoreElements()) {
            m3 x = m3.x(((a2) B2.nextElement()).toASN1Primitive());
            int i = 0;
            while (true) {
                a2[] a2VarArr = x.a;
                if (i < a2VarArr.length) {
                    i3 z = i3.z(a2VarArr[i].toASN1Primitive());
                    if (z.size() != 2) {
                        ny61.g("badly sized pair");
                        throw null;
                    }
                    this.b.addElement(u2.A(z.A(0)));
                    a2 A2 = z.A(1);
                    if (!(A2 instanceof q3) || (A2 instanceof tqf)) {
                        try {
                            Vector vector2 = this.c;
                            StringBuilder sb = new StringBuilder();
                            sb.append(ShimmerDivHandler.NUMBER_SING);
                            byte[] encoded = A2.toASN1Primitive().getEncoded("DER");
                            agu aguVar = qfu.a;
                            byte[] c = qfu.c(encoded.length, encoded);
                            int length = c.length;
                            char[] cArr = new char[length];
                            for (int i2 = 0; i2 != length; i2++) {
                                cArr[i2] = (char) (c[i2] & 255);
                            }
                            sb.append(new String(cArr));
                            vector2.addElement(sb.toString());
                        } catch (IOException unused) {
                            ny61.g("cannot encode value");
                            throw null;
                        }
                    } else {
                        String f = ((q3) A2).f();
                        if (f.length() <= 0 || f.charAt(0) != '#') {
                            vector = this.c;
                        } else {
                            vector = this.c;
                            f = "\\".concat(f);
                        }
                        vector.addElement(f);
                    }
                    this.w.addElement(i != 0 ? E : F);
                    i++;
                }
            }
        }
    }

    public static void n(StringBuffer stringBuffer, Hashtable hashtable, u2 u2Var, String str) {
        String str2 = (String) hashtable.get(u2Var);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(u2Var.a);
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, CSPStore.UNIQUE_SEPARATOR);
            }
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        break;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    public static String o(String str) {
        String c = quu0.c(str.trim());
        if (c.length() <= 0 || c.charAt(0) != '#') {
            return c;
        }
        try {
            a2 r = b3.r(qfu.a(c.length() - 1, c));
            return r instanceof q3 ? quu0.c(((q3) r).f().trim()) : c;
        } catch (IOException e) {
            yci0.k(e, "unknown encoding in name: ");
            return null;
        }
    }

    public static rc51 p(Object obj) {
        if (obj instanceof rc51) {
            return (rc51) obj;
        }
        if (obj instanceof jc51) {
            return new rc51(i3.z(((jc51) obj).x));
        }
        if (obj != null) {
            return new rc51(i3.z(obj));
        }
        return null;
    }

    public static String q(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.o2
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        Vector vector = this.b;
        if (obj != this) {
            if ((obj instanceof rc51) || (obj instanceof i3)) {
                if (!toASN1Primitive().q(((a2) obj).toASN1Primitive())) {
                    try {
                        rc51 p = p(obj);
                        int size = vector.size();
                        Vector vector2 = p.b;
                        if (size == vector2.size()) {
                            boolean[] zArr = new boolean[size];
                            if (vector.elementAt(0).equals(vector2.elementAt(0))) {
                                i3 = 1;
                                i2 = size;
                                i = 0;
                            } else {
                                i = size - 1;
                                i2 = -1;
                                i3 = -1;
                            }
                            while (i != i2) {
                                u2 u2Var = (u2) vector.elementAt(i);
                                String str = (String) this.c.elementAt(i);
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (!zArr[i4] && u2Var.q((u2) vector2.elementAt(i4))) {
                                        String str2 = (String) p.c.elementAt(i4);
                                        String o = o(str);
                                        String o2 = o(str2);
                                        if (o.equals(o2) || q(o).equals(q(o2))) {
                                            zArr[i4] = true;
                                            i += i3;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.o2
    public final int hashCode() {
        Vector vector = this.b;
        if (this.y) {
            return this.z;
        }
        this.y = true;
        for (int i = 0; i != vector.size(); i++) {
            String q = q(o((String) this.c.elementAt(i)));
            int hashCode = this.z ^ vector.elementAt(i).hashCode();
            this.z = hashCode;
            this.z = q.hashCode() ^ hashCode;
        }
        return this.z;
    }

    public final void m(Hashtable hashtable, String str, Boolean bool) {
        u2 u2Var;
        String trim;
        int i;
        mc51 mc51Var = new mc51('=', 1, str);
        String b = mc51Var.b();
        if (mc51Var.c == str.length()) {
            ny61.g("badly formatted directory string");
            return;
        }
        String b2 = mc51Var.b();
        String trim2 = b.trim();
        if (quu0.e(trim2).startsWith("OID.")) {
            u2Var = new u2(trim2.substring(4));
        } else if (trim2.charAt(0) < '0' || trim2.charAt(0) > '9') {
            u2Var = (u2) hashtable.get(quu0.c(trim2));
            if (u2Var == null) {
                ny61.g(oyr.p("Unknown object id - ", trim2, " - passed to distinguished name"));
                return;
            }
        } else {
            u2Var = new u2(trim2);
        }
        this.b.addElement(u2Var);
        Vector vector = this.c;
        if (b2.length() == 0 || (b2.indexOf(92) < 0 && b2.indexOf(34) < 0)) {
            trim = b2.trim();
        } else {
            char[] charArray = b2.toCharArray();
            StringBuffer stringBuffer = new StringBuffer(b2.length());
            if (charArray[0] == '\\' && charArray[1] == '#') {
                stringBuffer.append("\\#");
                i = 2;
            } else {
                i = 0;
            }
            boolean z = false;
            int i2 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i != charArray.length) {
                char c = charArray[i];
                if (c != ' ') {
                    z3 = true;
                }
                if (c != '\"') {
                    if (c == '\\' && !z && !z2) {
                        i2 = stringBuffer.length();
                        z = true;
                    } else if (c == ' ' && !z && !z3) {
                    }
                    i++;
                } else if (!z) {
                    z2 = !z2;
                    z = false;
                    i++;
                }
                stringBuffer.append(c);
                z = false;
                i++;
            }
            if (stringBuffer.length() > 0) {
                while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                    stringBuffer.setLength(stringBuffer.length() - 1);
                }
            }
            trim = stringBuffer.toString();
        }
        vector.addElement(trim);
        this.w.addElement(bool);
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        b3 xpfVar;
        b3 b3Var;
        jqf jqfVar;
        Vector vector = this.b;
        if (this.x == null) {
            c2 c2Var = new c2();
            c2 c2Var2 = new c2();
            u2 u2Var = null;
            int i = 0;
            while (i != vector.size()) {
                c2 c2Var3 = new c2(2);
                u2 u2Var2 = (u2) vector.elementAt(i);
                c2Var3.a(u2Var2);
                String str = (String) this.c.elementAt(i);
                this.a.getClass();
                if (str.length() == 0 || str.charAt(0) != '#') {
                    if (str.length() != 0 && str.charAt(0) == '\\') {
                        str = str.substring(1);
                    }
                    if (u2Var2.q(xc4.i) || u2Var2.q(xc4.j)) {
                        xpfVar = new xpf(str);
                    } else if (u2Var2.q(xc4.g)) {
                        xpfVar = new tpf(str);
                    } else if (u2Var2.q(xc4.c) || u2Var2.q(xc4.e) || u2Var2.q(xc4.f) || u2Var2.q(xc4.h)) {
                        xpfVar = new hqf(str);
                    } else {
                        String str2 = quu0.a;
                        char[] charArray = str.toCharArray();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            quu0.d(charArray, byteArrayOutputStream);
                            xpfVar = new rqf(byteArrayOutputStream.toByteArray());
                        } catch (IOException unused) {
                            ny61.r("cannot encode string to byte array!");
                            throw null;
                        }
                    }
                    b3Var = xpfVar;
                } else {
                    try {
                        b3Var = b3.r(qfu.a(str.length() - 1, str));
                    } catch (IOException unused2) {
                        dy31.l(u2Var2.a, "can't recode value for oid ");
                        return null;
                    }
                }
                c2Var3.a(b3Var);
                if (u2Var == null || ((Boolean) this.w.elementAt(i)).booleanValue()) {
                    jqfVar = new jqf(c2Var3);
                } else {
                    c2Var.a(new lqf(c2Var2));
                    c2Var2 = new c2();
                    jqfVar = new jqf(c2Var3);
                }
                c2Var2.a(jqfVar);
                i++;
                u2Var = u2Var2;
            }
            c2Var.a(new lqf(c2Var2));
            this.x = new jqf(c2Var);
        }
        return this.x;
    }

    public final String toString() {
        Vector vector = this.c;
        Vector vector2 = this.b;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector3 = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i = 0; i < vector2.size(); i++) {
            boolean booleanValue = ((Boolean) this.w.elementAt(i)).booleanValue();
            Hashtable hashtable = A;
            if (booleanValue) {
                stringBuffer2.append('+');
                n(stringBuffer2, hashtable, (u2) vector2.elementAt(i), (String) vector.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                n(stringBuffer2, hashtable, (u2) vector2.elementAt(i), (String) vector.elementAt(i));
                vector3.addElement(stringBuffer2);
            }
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector3.size(); i2++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(HexString.CHAR_COMMA);
            }
            stringBuffer.append(vector3.elementAt(i2).toString());
        }
        return stringBuffer.toString();
    }
}
