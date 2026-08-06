package defpackage;

/* loaded from: classes.dex */
final class ys0 extends defpackage.qj0 {
    public final float F7NU4MC0GW;
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;
    public final float r1MBDhnF;

    public ys0(float f, float f2, float f3, float f4) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = f3;
        this.F7NU4MC0GW = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || java.lang.Float.isNaN(f)) & (f2 >= 0.0f || java.lang.Float.isNaN(f2)) & (f3 >= 0.0f || java.lang.Float.isNaN(f3));
        if (f4 < 0.0f && !java.lang.Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            defpackage.v50.IHQe1A4L2xu("Padding must be non-negative");
        }
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.zs0 zs0Var = new defpackage.zs0();
        zs0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        zs0Var.fnWB2E7cs = this.oh6vYeIP;
        zs0Var.kNAkVymC = this.r1MBDhnF;
        zs0Var.V7bD7b8KA = this.F7NU4MC0GW;
        zs0Var.PAEGRtP0bX = true;
        return zs0Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.zs0 zs0Var = (defpackage.zs0) lj0Var;
        zs0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        zs0Var.fnWB2E7cs = this.oh6vYeIP;
        zs0Var.kNAkVymC = this.r1MBDhnF;
        zs0Var.V7bD7b8KA = this.F7NU4MC0GW;
        zs0Var.PAEGRtP0bX = true;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.ys0 ys0Var = obj instanceof defpackage.ys0 ? (defpackage.ys0) obj : null;
        return ys0Var != null && defpackage.uq.oh6vYeIP(this.IHQe1A4L2xu, ys0Var.IHQe1A4L2xu) && defpackage.uq.oh6vYeIP(this.oh6vYeIP, ys0Var.oh6vYeIP) && defpackage.uq.oh6vYeIP(this.r1MBDhnF, ys0Var.r1MBDhnF) && defpackage.uq.oh6vYeIP(this.F7NU4MC0GW, ys0Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + defpackage.fx0.IHQe1A4L2xu(this.F7NU4MC0GW, defpackage.fx0.IHQe1A4L2xu(this.r1MBDhnF, defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31), 31), 31);
    }
}
