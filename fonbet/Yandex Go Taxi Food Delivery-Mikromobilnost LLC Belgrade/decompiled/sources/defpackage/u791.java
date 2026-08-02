package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzcn;

/* loaded from: classes.dex */
public abstract class u791 {
    public static volatile zzcn d;
    public final tha1 a;
    public final na3 b;
    public volatile long c;

    public u791(tha1 tha1Var) {
        cvw.l(tha1Var);
        this.a = tha1Var;
        this.b = new na3(7, this, tha1Var);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            tha1 tha1Var = this.a;
            ((kl40) tha1Var.q4()).getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            tha1Var.B0().z.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        zzcn zzcnVar;
        if (d != null) {
            return d;
        }
        synchronized (u791.class) {
            try {
                if (d == null) {
                    d = new zzcn(this.a.N3().getMainLooper());
                }
                zzcnVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcnVar;
    }
}
