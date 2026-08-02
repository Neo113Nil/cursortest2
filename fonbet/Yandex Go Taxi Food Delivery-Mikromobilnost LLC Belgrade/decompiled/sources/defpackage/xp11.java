package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class xp11 implements a9b {
    public final Handler a = new Handler();
    public u2c0 b;

    public xp11(u2c0 u2c0Var) {
        this.b = u2c0Var;
    }

    @Override // defpackage.a9b
    public final void close() {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        this.b = null;
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        aq11 aq11Var = (aq11) ((m8g) s020Var).Q.get();
        z83.g(null, aq11Var.d.getLooper(), Looper.myLooper());
        if (aq11Var.c.n) {
            return e1k.M1;
        }
        aq11Var.a.b(this);
        aq11Var.a();
        return new xi3(10, aq11Var, this);
    }
}
