package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes15.dex */
public final /* synthetic */ class szy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzt0 b;
    public final /* synthetic */ ug3 c;

    public /* synthetic */ szy0(qzt0 qzt0Var, ug3 ug3Var, int i) {
        this.a = i;
        this.b = qzt0Var;
        this.c = ug3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ug3 ug3Var = this.c;
        qzt0 qzt0Var = this.b;
        switch (i) {
            case 0:
                Handler handler = (Handler) qzt0Var.x;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                ((w3c) qzt0Var.w).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = qzt0Var.b;
                if (j > elapsedRealtime) {
                    if (!qzt0Var.c) {
                        qzt0Var.c = handler.postDelayed(new szy0(qzt0Var, ug3Var, 1), j - elapsedRealtime);
                        break;
                    }
                } else {
                    qzt0Var.c = false;
                    handler.removeCallbacksAndMessages(null);
                    qzt0Var.b = elapsedRealtime + qzt0Var.a;
                    ug3Var.run();
                    break;
                }
                break;
            default:
                qzt0Var.c = false;
                ((w3c) qzt0Var.w).getClass();
                qzt0Var.b = SystemClock.elapsedRealtime() + qzt0Var.a;
                ug3Var.run();
                break;
        }
    }
}
