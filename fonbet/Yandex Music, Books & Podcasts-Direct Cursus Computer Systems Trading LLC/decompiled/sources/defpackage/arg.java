package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class arg implements Runnable {
    public static final Logger b = Logger.getLogger(arg.class.getName());
    public final Runnable a;

    public arg(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        try {
            runnable.run();
        } catch (Throwable th) {
            b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            fgs.a(th);
            xq0.w(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.a + ")";
    }
}
