package ru.CryptoPro.JCP.tools.CertReader;

import java.util.Vector;

/* loaded from: classes4.dex */
public class SplitDirectName {
    public static final String[] a = {", CN=", ", L=", ", ST=", ", O=", ", OU=", ", C=", ", STREET=", ", DC=", ", UID=", ", EMAILADDRESS=", ", OID.0.9.2342.19200300.100.1.3=", ", OID.2.5.4.5=", ", OID.1.2.840.113549.1.9.2=", ", OID.1.2.840.113549.1.9.8="};
    public static final String[] b = {"OID.".concat("0.9.2342.19200300.100.1.3"), "OID.".concat("2.5.4.5"), "OID.".concat("1.2.840.113549.1.9.2"), "OID.".concat("1.2.840.113549.1.9.8")};
    public static final String[] c = {"MAIL", "SERIALNUMBER", "UNSTRUCTUREDNAME", "UNSTRUCTUREDADDRESS"};

    public static Vector getExtensionsOfNames(Vector vector) {
        Vector vector2 = new Vector(0);
        for (int i = 0; i < vector.size(); i++) {
            vector2.add(new Extension((String) vector.elementAt(i)));
        }
        return vector2;
    }

    public static Vector splitName(String str) {
        int i = 0;
        Vector vector = new Vector(0);
        for (int i2 = 0; i2 < 14; i2++) {
            int indexOf = str.indexOf(a[i2]);
            if (indexOf != -1) {
                vector.addAll(splitName(str.substring(0, indexOf)));
                vector.addAll(splitName(str.substring(indexOf + 2)));
                return vector;
            }
        }
        while (true) {
            String[] strArr = b;
            if (i >= strArr.length) {
                vector.add(str);
                return vector;
            }
            str = str.replaceFirst(strArr[i], c[i]);
            i++;
        }
    }
}
