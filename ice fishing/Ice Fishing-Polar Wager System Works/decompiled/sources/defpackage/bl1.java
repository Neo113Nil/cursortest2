package defpackage;

/* loaded from: classes.dex */
final class bl1 extends defpackage.qj0 {
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;

    public bl1(float f, float f2) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.cl1 cl1Var = new defpackage.cl1();
        cl1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        cl1Var.fnWB2E7cs = this.oh6vYeIP;
        return cl1Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.cl1 cl1Var = (defpackage.cl1) lj0Var;
        cl1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        cl1Var.fnWB2E7cs = this.oh6vYeIP;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bl1)) {
            return false;
        }
        defpackage.bl1 bl1Var = (defpackage.bl1) obj;
        return defpackage.uq.oh6vYeIP(this.IHQe1A4L2xu, bl1Var.IHQe1A4L2xu) && defpackage.uq.oh6vYeIP(this.oh6vYeIP, bl1Var.oh6vYeIP);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }
}
