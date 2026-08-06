package defpackage;

/* loaded from: classes.dex */
public final class x31 implements defpackage.t31, defpackage.i41 {
    public defpackage.F7NU4MC0GW AARZUJiTa;
    public final /* synthetic */ defpackage.u31 adDC3e2L;
    public defpackage.xd0 xiZrDbcSW0;

    public x31(defpackage.u31 u31Var) {
        this.adDC3e2L = u31Var;
        java.lang.Object xiZrDbcSW0 = u31Var.xiZrDbcSW0("androidx.savedstate.SavedStateRegistry");
        android.os.Bundle bundle = xiZrDbcSW0 instanceof android.os.Bundle ? (android.os.Bundle) xiZrDbcSW0 : null;
        if (bundle != null && this.AARZUJiTa == null) {
            defpackage.F7NU4MC0GW f7nu4mc0gw = new defpackage.F7NU4MC0GW(new defpackage.h41(this, new defpackage.e3(16, this)));
            this.AARZUJiTa = f7nu4mc0gw;
            f7nu4mc0gw.PAEGRtP0bX(bundle);
        }
        u31Var.IHQe1A4L2xu("androidx.savedstate.SavedStateRegistry", new defpackage.e3(14, this));
    }

    @Override // defpackage.ud0
    public final defpackage.xd0 EXtogiMhuM() {
        defpackage.xd0 xd0Var = this.xiZrDbcSW0;
        if (xd0Var != null) {
            return xd0Var;
        }
        defpackage.xd0 xd0Var2 = new defpackage.xd0(this, false);
        this.xiZrDbcSW0 = xd0Var2;
        return xd0Var2;
    }

    @Override // defpackage.t31
    public final boolean F7NU4MC0GW(java.lang.Object obj) {
        return this.adDC3e2L.F7NU4MC0GW(obj);
    }

    @Override // defpackage.t31
    public final defpackage.v5 IHQe1A4L2xu(java.lang.String str, defpackage.vz vzVar) {
        return this.adDC3e2L.IHQe1A4L2xu(str, vzVar);
    }

    @Override // defpackage.t31
    public final java.util.Map adDC3e2L() {
        return this.adDC3e2L.adDC3e2L();
    }

    @Override // defpackage.i41
    public final defpackage.F7NU4MC0GW r1MBDhnF() {
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.AARZUJiTa;
        if (f7nu4mc0gw == null) {
            defpackage.F7NU4MC0GW f7nu4mc0gw2 = new defpackage.F7NU4MC0GW(new defpackage.h41(this, new defpackage.e3(16, this)));
            this.AARZUJiTa = f7nu4mc0gw2;
            f7nu4mc0gw2.PAEGRtP0bX(null);
            f7nu4mc0gw = f7nu4mc0gw2;
        }
        return (defpackage.F7NU4MC0GW) f7nu4mc0gw.AARZUJiTa;
    }

    @Override // defpackage.t31
    public final java.lang.Object xiZrDbcSW0(java.lang.String str) {
        return this.adDC3e2L.xiZrDbcSW0(str);
    }
}
