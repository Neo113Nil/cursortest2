package defpackage;

/* loaded from: classes.dex */
public final class d6 extends defpackage.f70 {
    public static final defpackage.c6 AARZUJiTa = new defpackage.c6(0);
    public static volatile defpackage.d6 xiZrDbcSW0;
    public final defpackage.fn adDC3e2L = new defpackage.fn();

    public static defpackage.d6 p4kuH6PDtgom() {
        if (xiZrDbcSW0 != null) {
            return xiZrDbcSW0;
        }
        synchronized (defpackage.d6.class) {
            try {
                if (xiZrDbcSW0 == null) {
                    xiZrDbcSW0 = new defpackage.d6();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return xiZrDbcSW0;
    }
}
