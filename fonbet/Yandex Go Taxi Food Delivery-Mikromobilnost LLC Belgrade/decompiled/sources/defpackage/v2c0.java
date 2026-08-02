package defpackage;

import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class v2c0 implements e1k {
    public final u2c0 a;
    public final /* synthetic */ w2c0 b;

    public v2c0(w2c0 w2c0Var, u2c0 u2c0Var) {
        this.b = w2c0Var;
        this.a = u2c0Var;
        w2c0Var.g.b(this);
        z83.g(null, w2c0Var.f, Looper.myLooper());
        if (w2c0Var.c.e() != null && w2c0Var.j == null) {
            w2c0Var.j = w2c0Var.b.a(25L, TimeUnit.SECONDS, new dw10(1, w2c0Var));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w2c0 w2c0Var = this.b;
        z83.g(null, w2c0Var.f, Looper.myLooper());
        zq60 zq60Var = w2c0Var.g;
        zq60Var.d(this);
        if (zq60Var.isEmpty()) {
            w0j0 w0j0Var = w2c0Var.j;
            if (w0j0Var != null) {
                w0j0Var.cancel();
            }
            w2c0Var.j = null;
        }
    }
}
