package defpackage;

/* loaded from: classes11.dex */
public abstract class u591 {
    public static i491 a;

    public static synchronized u591 a() {
        i491 i491Var;
        synchronized (u591.class) {
            try {
                if (a == null) {
                    a = new i491();
                }
                i491Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i491Var;
    }
}
