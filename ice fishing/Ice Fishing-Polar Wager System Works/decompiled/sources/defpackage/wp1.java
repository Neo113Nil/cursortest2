package defpackage;

/* loaded from: classes.dex */
final class wp1 extends defpackage.qj0 {
    public final defpackage.up IHQe1A4L2xu;
    public final defpackage.k00 oh6vYeIP;
    public final java.lang.Object r1MBDhnF;

    public wp1(defpackage.up upVar, defpackage.k00 k00Var, java.lang.Object obj) {
        this.IHQe1A4L2xu = upVar;
        this.oh6vYeIP = k00Var;
        this.r1MBDhnF = obj;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.yp1 yp1Var = new defpackage.yp1();
        yp1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        yp1Var.fnWB2E7cs = this.oh6vYeIP;
        return yp1Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.yp1 yp1Var = (defpackage.yp1) lj0Var;
        yp1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        yp1Var.fnWB2E7cs = this.oh6vYeIP;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.wp1.class != obj.getClass()) {
            return false;
        }
        defpackage.wp1 wp1Var = (defpackage.wp1) obj;
        return this.IHQe1A4L2xu == wp1Var.IHQe1A4L2xu && this.r1MBDhnF.equals(wp1Var.r1MBDhnF);
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + defpackage.fx0.adDC3e2L(this.IHQe1A4L2xu.hashCode() * 31, 31, false);
    }
}
