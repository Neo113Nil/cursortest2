package defpackage;

import android.os.CancellationSignal;
import androidx.transition.Transition;

/* loaded from: classes10.dex */
public final class u18 {
    public boolean a;
    public t26 b;
    public CancellationSignal c;
    public boolean d;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                t26 t26Var = this.b;
                CancellationSignal cancellationSignal = this.c;
                if (t26Var != null) {
                    try {
                        Runnable runnable = (Runnable) t26Var.b;
                        Transition transition = (Transition) t26Var.c;
                        Runnable runnable2 = (Runnable) t26Var.w;
                        if (runnable == null) {
                            transition.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
