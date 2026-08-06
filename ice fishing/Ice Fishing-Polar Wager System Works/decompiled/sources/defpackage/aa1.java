package defpackage;

/* loaded from: classes.dex */
final class aa1 extends defpackage.qj0 {
    public final float F7NU4MC0GW;
    public final float IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public final float oh6vYeIP;
    public final float r1MBDhnF;

    public aa1(float f, float f2, float f3, float f4, boolean z) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = f3;
        this.F7NU4MC0GW = f4;
        this.adDC3e2L = z;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.ca1 ca1Var = new defpackage.ca1();
        ca1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        ca1Var.fnWB2E7cs = this.oh6vYeIP;
        ca1Var.kNAkVymC = this.r1MBDhnF;
        ca1Var.V7bD7b8KA = this.F7NU4MC0GW;
        ca1Var.PAEGRtP0bX = this.adDC3e2L;
        return ca1Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.ca1 ca1Var = (defpackage.ca1) lj0Var;
        ca1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        ca1Var.fnWB2E7cs = this.oh6vYeIP;
        ca1Var.kNAkVymC = this.r1MBDhnF;
        ca1Var.V7bD7b8KA = this.F7NU4MC0GW;
        ca1Var.PAEGRtP0bX = this.adDC3e2L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aa1)) {
            return false;
        }
        defpackage.aa1 aa1Var = (defpackage.aa1) obj;
        return defpackage.uq.oh6vYeIP(this.IHQe1A4L2xu, aa1Var.IHQe1A4L2xu) && defpackage.uq.oh6vYeIP(this.oh6vYeIP, aa1Var.oh6vYeIP) && defpackage.uq.oh6vYeIP(this.r1MBDhnF, aa1Var.r1MBDhnF) && defpackage.uq.oh6vYeIP(this.F7NU4MC0GW, aa1Var.F7NU4MC0GW) && this.adDC3e2L == aa1Var.adDC3e2L;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.adDC3e2L) + defpackage.fx0.IHQe1A4L2xu(this.F7NU4MC0GW, defpackage.fx0.IHQe1A4L2xu(this.r1MBDhnF, defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31), 31), 31);
    }
}
