package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class rvw extends xx4 {
    public xo3 w;

    @Override // defpackage.xx4, defpackage.hr
    public final void b() {
        i(null);
        xo3 xo3Var = this.w;
        if (xo3Var != null) {
            xo3Var.cancel();
            this.w = null;
        }
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        return hrVar instanceof rvw;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        dt20 d = ((d9g) cl21Var).d();
        dhv dhvVar = new dhv(10, this);
        z83.g(null, (Looper) d.b, Looper.myLooper());
        to3 to3Var = (to3) d.w;
        this.w = to3Var.a.a(new oo3(to3Var, new h2r(25, d, dhvVar), 1));
    }
}
