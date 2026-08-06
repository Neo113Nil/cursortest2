package defpackage;

/* loaded from: classes.dex */
final class hc0 extends defpackage.qj0 {
    public final boolean F7NU4MC0GW;
    public final defpackage.vz IHQe1A4L2xu;
    public final defpackage.gc0 oh6vYeIP;
    public final defpackage.ks0 r1MBDhnF;

    public hc0(defpackage.vz vzVar, defpackage.gc0 gc0Var, defpackage.ks0 ks0Var, boolean z) {
        this.IHQe1A4L2xu = vzVar;
        this.oh6vYeIP = gc0Var;
        this.r1MBDhnF = ks0Var;
        this.F7NU4MC0GW = z;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        return new defpackage.kc0(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF, this.F7NU4MC0GW);
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.kc0 kc0Var = (defpackage.kc0) lj0Var;
        kc0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        kc0Var.fnWB2E7cs = this.oh6vYeIP;
        defpackage.ks0 ks0Var = kc0Var.kNAkVymC;
        defpackage.ks0 ks0Var2 = this.r1MBDhnF;
        if (ks0Var != ks0Var2) {
            kc0Var.kNAkVymC = ks0Var2;
            defpackage.x80.C0U8sNJm(kc0Var);
        }
        boolean z = kc0Var.V7bD7b8KA;
        boolean z2 = this.F7NU4MC0GW;
        if (z == z2) {
            return;
        }
        kc0Var.V7bD7b8KA = z2;
        kc0Var.UVjEelCZ();
        defpackage.x80.C0U8sNJm(kc0Var);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hc0)) {
            return false;
        }
        defpackage.hc0 hc0Var = (defpackage.hc0) obj;
        return this.IHQe1A4L2xu == hc0Var.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, hc0Var.oh6vYeIP) && this.r1MBDhnF == hc0Var.r1MBDhnF && this.F7NU4MC0GW == hc0Var.F7NU4MC0GW;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(false) + defpackage.fx0.adDC3e2L((this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31)) * 31, 31, this.F7NU4MC0GW);
    }
}
