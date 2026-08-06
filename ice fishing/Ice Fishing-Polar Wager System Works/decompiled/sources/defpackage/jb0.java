package defpackage;

/* loaded from: classes.dex */
final class jb0 extends defpackage.qj0 {
    public final defpackage.lc0 IHQe1A4L2xu;
    public final defpackage.f9 oh6vYeIP;
    public final defpackage.ks0 r1MBDhnF;

    public jb0(defpackage.lc0 lc0Var, defpackage.f9 f9Var, defpackage.ks0 ks0Var) {
        this.IHQe1A4L2xu = lc0Var;
        this.oh6vYeIP = f9Var;
        this.r1MBDhnF = ks0Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.mb0 mb0Var = new defpackage.mb0();
        mb0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        mb0Var.fnWB2E7cs = this.oh6vYeIP;
        mb0Var.kNAkVymC = this.r1MBDhnF;
        return mb0Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.mb0 mb0Var = (defpackage.mb0) lj0Var;
        mb0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        mb0Var.fnWB2E7cs = this.oh6vYeIP;
        mb0Var.kNAkVymC = this.r1MBDhnF;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jb0)) {
            return false;
        }
        defpackage.jb0 jb0Var = (defpackage.jb0) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, jb0Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, jb0Var.oh6vYeIP) && this.r1MBDhnF == jb0Var.r1MBDhnF;
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + defpackage.fx0.adDC3e2L((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31, 31, false);
    }
}
