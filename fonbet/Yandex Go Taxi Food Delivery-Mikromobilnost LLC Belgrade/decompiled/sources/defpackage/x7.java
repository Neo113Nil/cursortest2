package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public abstract class x7 implements euy {
    public static final Object w = new Object();
    public static final c7y x = new c7y();
    public static final boolean y;
    public static final qha1 z;
    public volatile Object a;
    public volatile o7 b;
    public volatile w7 c;

    static {
        boolean z2;
        qha1 q7Var;
        Throwable th;
        qha1 qha1Var;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        y = z2;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains("Android")) {
            try {
                qha1Var = new v7();
            } catch (Error | Exception e2) {
                try {
                    q7Var = new p7();
                } catch (Error | Exception e3) {
                    e = e3;
                    q7Var = new q7();
                }
                qha1 qha1Var2 = q7Var;
                th = e2;
                qha1Var = qha1Var2;
            }
        } else {
            try {
                qha1Var = new p7();
            } catch (NoClassDefFoundError unused2) {
                qha1Var = new q7();
            }
        }
        th = null;
        z = qha1Var;
        if (e != null) {
            c7y c7yVar = x;
            Logger a = c7yVar.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            c7yVar.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
    }

    public final void a(w7 w7Var) {
        w7Var.a = null;
        while (true) {
            w7 w7Var2 = this.c;
            if (w7Var2 == w7.c) {
                return;
            }
            w7 w7Var3 = null;
            while (w7Var2 != null) {
                w7 w7Var4 = w7Var2.b;
                if (w7Var2.a != null) {
                    w7Var3 = w7Var2;
                } else if (w7Var3 != null) {
                    w7Var3.b = w7Var4;
                    if (w7Var3.a == null) {
                        break;
                    }
                } else if (!z.d(this, w7Var2, w7Var4)) {
                    break;
                }
                w7Var2 = w7Var4;
            }
            return;
        }
    }

    public abstract Throwable b();
}
