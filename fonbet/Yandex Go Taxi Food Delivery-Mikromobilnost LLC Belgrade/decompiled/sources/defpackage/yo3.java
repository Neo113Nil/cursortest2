package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class yo3 {
    public final Looper a;
    public final kdf0 b;
    public final yi3 c;
    public final xqi0 d;
    public final rj21 e;

    public yo3(Looper looper, kdf0 kdf0Var, yi3 yi3Var, xqi0 xqi0Var, rj21 rj21Var) {
        this.a = looper;
        this.b = kdf0Var;
        this.c = yi3Var;
        this.d = xqi0Var;
        this.e = rj21Var;
    }

    public final xo3 a(String str, w920 w920Var) {
        z83.g(null, this.a, Looper.myLooper());
        return new xo3(this, str, w920Var);
    }
}
