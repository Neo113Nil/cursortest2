package ru.CryptoPro.JCP.params;

import java.util.Vector;
import ru.CryptoPro.JCP.pref.JCPRes;

/* loaded from: classes4.dex */
public class OIDName {
    public static final Vector a = new Vector(0);
    public static final Vector b = new Vector(0);

    public static boolean addDescription(OID oid, String str) {
        boolean z;
        Vector vector = a;
        synchronized (vector) {
            try {
                if (vector.indexOf(oid.toString()) == -1) {
                    String oIDdecl = JCPRes.getOIDdecl(oid);
                    if (oIDdecl == null) {
                        vector.add(oid.toString());
                        b.add(str);
                        z = true;
                    } else {
                        vector.add(oid.toString());
                        b.add(oIDdecl);
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static String getName(OID oid) {
        String str;
        Vector vector = a;
        synchronized (vector) {
            try {
                int indexOf = vector.indexOf(oid);
                if (indexOf == -1) {
                    str = JCPRes.getOIDdecl(oid);
                    if (str != null) {
                        vector.add(oid.toString());
                        b.add(str);
                    } else {
                        str = oid.toString();
                    }
                } else {
                    str = (String) b.elementAt(indexOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String getName(String str) {
        return getName(new OID(str));
    }
}
