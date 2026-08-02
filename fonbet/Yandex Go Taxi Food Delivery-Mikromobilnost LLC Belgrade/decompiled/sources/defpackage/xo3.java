package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class xo3 implements o8j0, zi3 {
    public final String a;
    public final w920 b;
    public xi3 c;
    public jdf0 w;
    public final /* synthetic */ yo3 x;

    public xo3(yo3 yo3Var, String str, w920 w920Var) {
        this.x = yo3Var;
        this.a = str;
        this.b = w920Var;
        this.c = yo3Var.c.c(this);
    }

    @Override // defpackage.zi3
    public final void b(cn3 cn3Var, wl3 wl3Var, boolean z) {
        jdf0 jdf0Var = this.w;
        if (jdf0Var != null) {
            jdf0Var.cancel();
            this.w = null;
        }
        if (cn3Var.e()) {
            kdf0 kdf0Var = this.x.b;
            wo3 wo3Var = new wo3(this, this.b, cn3Var, z);
            Looper looper = kdf0Var.a;
            z83.g(null, looper, Looper.myLooper());
            hfy hfyVar = new hfy();
            z83.g(null, looper, Looper.myLooper());
            this.w = new jdf0(kdf0Var, this.a, wo3Var, hfyVar);
        }
    }

    @Override // defpackage.x08
    public final void cancel() {
        z83.g(null, this.x.a, Looper.myLooper());
        xi3 xi3Var = this.c;
        if (xi3Var != null) {
            xi3Var.close();
            this.c = null;
        }
        jdf0 jdf0Var = this.w;
        if (jdf0Var != null) {
            jdf0Var.cancel();
            this.w = null;
        }
    }
}
