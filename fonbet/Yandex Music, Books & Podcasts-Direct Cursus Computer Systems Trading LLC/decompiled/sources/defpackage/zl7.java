package defpackage;

import kotlinx.coroutines.b;

/* loaded from: classes5.dex */
public abstract class zl7 {
    public static final xu7 a;

    static {
        String str;
        xu7 xu7Var;
        int i = f0s.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            dq7 dq7Var = ca8.a;
            bsd bsdVar = j5h.a;
            bsd bsdVar2 = bsdVar.g;
            xu7Var = bsdVar;
            if (bsdVar == null) {
                xu7Var = b.k;
            }
        } else {
            xu7Var = b.k;
        }
        a = xu7Var;
    }
}
