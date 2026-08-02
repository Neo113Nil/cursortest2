package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes4.dex */
public abstract class ya {
    public static boolean a(jc51 jc51Var, jc51 jc51Var2) {
        if (jc51Var.w.length == jc51Var2.w.length) {
            v4i0[] n = jc51Var.n();
            v4i0[] n2 = jc51Var2.n();
            boolean z = (n[0].m() == null || n2[0].m() == null) ? false : !r0.a.q(r1.a);
            for (int i = 0; i != n.length; i++) {
                v4i0 v4i0Var = n[i];
                if (z) {
                    for (int length = n2.length - 1; length >= 0; length--) {
                        v4i0 v4i0Var2 = n2[length];
                        if (v4i0Var2 != null && c(v4i0Var, v4i0Var2)) {
                            n2[length] = null;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 != n2.length; i2++) {
                        v4i0 v4i0Var3 = n2[i2];
                        if (v4i0Var3 != null && c(v4i0Var, v4i0Var3)) {
                            n2[i2] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static Hashtable b(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public static boolean c(v4i0 v4i0Var, v4i0 v4i0Var2) {
        int i;
        if (v4i0Var.a.a.length == v4i0Var2.a.a.length) {
            zc3[] n = v4i0Var.n();
            zc3[] n2 = v4i0Var2.n();
            if (n.length == n2.length) {
                for (0; i != n.length; i + 1) {
                    zc3 zc3Var = n[i];
                    zc3 zc3Var2 = n2[i];
                    i = (zc3Var == zc3Var2 || (zc3Var != null && zc3Var2 != null && zc3Var.a.q(zc3Var2.a) && x2v.c(zc3Var.b).equals(x2v.c(zc3Var2.b)))) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    public abstract String d(jc51 jc51Var);
}
