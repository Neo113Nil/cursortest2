package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class qb1 {
    private static volatile qb1 a;

    public static void a(tls tlsVar, String str) {
        d().e(tlsVar, str);
    }

    public static qb1 b(qb1 qb1Var) {
        a = qb1Var;
        return qb1Var;
    }

    public static qb1 d() {
        if (a == null) {
            synchronized (qb1.class) {
                try {
                    if (a == null) {
                        a = new pb1();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract u6 c(ma1 ma1Var, Context context, tt2 tt2Var, kb1 kb1Var, h3y h3yVar, dp60 dp60Var);

    public abstract void e(tls tlsVar, String str);
}
