package defpackage;

/* loaded from: classes.dex */
final class ug1 extends defpackage.qj0 {
    public final defpackage.zk0 IHQe1A4L2xu;
    public final boolean oh6vYeIP;
    public final defpackage.ub1 r1MBDhnF;

    public ug1(defpackage.zk0 zk0Var, boolean z, defpackage.ub1 ub1Var) {
        this.IHQe1A4L2xu = zk0Var;
        this.oh6vYeIP = z;
        this.r1MBDhnF = ub1Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.xg1 xg1Var = new defpackage.xg1();
        xg1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        xg1Var.fnWB2E7cs = this.oh6vYeIP;
        xg1Var.kNAkVymC = this.r1MBDhnF;
        xg1Var.NHJTzaLwkd = Float.NaN;
        xg1Var.QQUzIjv3iOC5 = Float.NaN;
        return xg1Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.xg1 xg1Var = (defpackage.xg1) lj0Var;
        xg1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        boolean z = xg1Var.fnWB2E7cs;
        boolean z2 = this.oh6vYeIP;
        if (z != z2) {
            defpackage.a70.EgCjBq0SZwJ(xg1Var);
        }
        xg1Var.fnWB2E7cs = z2;
        xg1Var.kNAkVymC = this.r1MBDhnF;
        if (xg1Var.abhbClRa == null && !java.lang.Float.isNaN(xg1Var.QQUzIjv3iOC5)) {
            xg1Var.abhbClRa = defpackage.w70.IHQe1A4L2xu(xg1Var.QQUzIjv3iOC5);
        }
        if (xg1Var.PAEGRtP0bX != null || java.lang.Float.isNaN(xg1Var.NHJTzaLwkd)) {
            return;
        }
        xg1Var.PAEGRtP0bX = defpackage.w70.IHQe1A4L2xu(xg1Var.NHJTzaLwkd);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ug1)) {
            return false;
        }
        defpackage.ug1 ug1Var = (defpackage.ug1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, ug1Var.IHQe1A4L2xu) && this.oh6vYeIP == ug1Var.oh6vYeIP && this.r1MBDhnF.equals(ug1Var.r1MBDhnF);
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + defpackage.fx0.adDC3e2L(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP);
    }

    public final java.lang.String toString() {
        return "ThumbElement(interactionSource=" + this.IHQe1A4L2xu + ", checked=" + this.oh6vYeIP + ", animationSpec=" + this.r1MBDhnF + ')';
    }
}
