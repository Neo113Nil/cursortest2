package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class o5w {
    public static final String a = jsg.n("WorkerWrapper");

    public static final Object a(lcg lcgVar, ucg ucgVar, aur aurVar) {
        Object obj;
        try {
            boolean z = false;
            if (!lcgVar.isDone()) {
                zt3 zt3Var = new zt3(1, qxe.b(aurVar));
                zt3Var.s();
                lcgVar.a(new uks(lcgVar, zt3Var, 0), d48.a);
                zt3Var.u(new kw1(7, ucgVar, lcgVar));
                Object q = zt3Var.q();
                nm6 nm6Var = nm6.a;
                return q;
            }
            while (true) {
                try {
                    obj = lcgVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
