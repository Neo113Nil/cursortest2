package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class w0j0 implements x08, o5t0, Runnable {
    public final long a;
    public final o5t0 b;
    public final Handler c = new Handler();
    public x08 w;
    public final /* synthetic */ x0j0 x;

    public w0j0(x0j0 x0j0Var, long j, o5t0 o5t0Var) {
        this.x = x0j0Var;
        this.a = j;
        this.b = o5t0Var;
        this.w = x0j0Var.a.f(this);
    }

    @Override // defpackage.o5t0
    public final Object c(int i, int i2) {
        return this.b.c(i, i2);
    }

    @Override // defpackage.x08
    public final void cancel() {
        Handler handler = this.c;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        handler.removeCallbacksAndMessages(null);
        x08 x08Var = this.w;
        if (x08Var != null) {
            x08Var.cancel();
        }
        this.w = null;
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return this.b.e();
    }

    @Override // defpackage.o5t0
    public final String k() {
        return this.b.k();
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        int n = this.b.n(obj);
        if (n == 0) {
            this.w = null;
            this.c.postDelayed(this, this.a);
        }
        return n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z83.g(null, this.c.getLooper(), Looper.myLooper());
        z83.f(this.w, null);
        this.w = this.x.a.f(this);
    }
}
