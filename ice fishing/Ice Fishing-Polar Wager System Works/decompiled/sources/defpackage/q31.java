package defpackage;

/* loaded from: classes.dex */
public final class q31 implements defpackage.w01 {
    public java.lang.String AARZUJiTa;
    public java.lang.Object EXtogiMhuM;
    public defpackage.v5 SH1y5HwkJhh;
    public defpackage.l41 adDC3e2L;
    public final defpackage.e3 ez2rX8ReCYw = new defpackage.e3(13, this);
    public java.lang.Object[] riuEU0zW4;
    public defpackage.t31 xiZrDbcSW0;

    public q31(defpackage.l41 l41Var, defpackage.t31 t31Var, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        this.adDC3e2L = l41Var;
        this.xiZrDbcSW0 = t31Var;
        this.AARZUJiTa = str;
        this.EXtogiMhuM = obj;
        this.riuEU0zW4 = objArr;
    }

    @Override // defpackage.w01
    public final void IHQe1A4L2xu() {
        oh6vYeIP();
    }

    @Override // defpackage.w01
    public final void adDC3e2L() {
        defpackage.v5 v5Var = this.SH1y5HwkJhh;
        if (v5Var != null) {
            v5Var.fnWB2E7cs();
        }
    }

    public final void oh6vYeIP() {
        java.lang.String cnag84Bm;
        defpackage.t31 t31Var = this.xiZrDbcSW0;
        if (this.SH1y5HwkJhh != null) {
            defpackage.db.QoRHpC4k("entry(", this.SH1y5HwkJhh, ") is not null");
            return;
        }
        if (t31Var != null) {
            defpackage.e3 e3Var = this.ez2rX8ReCYw;
            java.lang.Object IHQe1A4L2xu = e3Var.IHQe1A4L2xu();
            if (IHQe1A4L2xu == null || t31Var.F7NU4MC0GW(IHQe1A4L2xu)) {
                this.SH1y5HwkJhh = t31Var.IHQe1A4L2xu(this.AARZUJiTa, e3Var);
                return;
            }
            if (IHQe1A4L2xu instanceof defpackage.ab1) {
                defpackage.ab1 ab1Var = (defpackage.ab1) IHQe1A4L2xu;
                if (ab1Var.F7NU4MC0GW() == defpackage.n.QPwENk36pDC || ab1Var.F7NU4MC0GW() == defpackage.ad1.xiZrDbcSW0 || ab1Var.F7NU4MC0GW() == defpackage.n.AsxAYCCkb3Hi) {
                    cnag84Bm = "MutableState containing " + ab1Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    cnag84Bm = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                cnag84Bm = defpackage.e90.cnag84Bm(IHQe1A4L2xu);
            }
            throw new java.lang.IllegalArgumentException(cnag84Bm);
        }
    }

    @Override // defpackage.w01
    public final void r1MBDhnF() {
        defpackage.v5 v5Var = this.SH1y5HwkJhh;
        if (v5Var != null) {
            v5Var.fnWB2E7cs();
        }
    }
}
