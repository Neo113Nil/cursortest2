package defpackage;

/* loaded from: classes5.dex */
public abstract class zo61 {
    private static volatile zo61 a;

    public static void a(ab abVar, boolean z) {
        d().b(abVar, z);
    }

    public static zo61 c(zo61 zo61Var) {
        a = zo61Var;
        return zo61Var;
    }

    public static zo61 d() {
        if (a == null) {
            synchronized (zo61.class) {
                try {
                    if (a == null) {
                        a = new yo61();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract void b(ab abVar, boolean z);
}
