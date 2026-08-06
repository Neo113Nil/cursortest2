package defpackage;

/* loaded from: classes.dex */
final class ch1 extends defpackage.qj0 {
    public final defpackage.l21 F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final defpackage.g00 adDC3e2L;
    public final defpackage.zk0 oh6vYeIP;
    public final boolean r1MBDhnF;

    public ch1(boolean z, defpackage.zk0 zk0Var, boolean z2, defpackage.l21 l21Var, defpackage.g00 g00Var) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = zk0Var;
        this.r1MBDhnF = z2;
        this.F7NU4MC0GW = l21Var;
        this.adDC3e2L = g00Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        return new defpackage.eh1(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF, this.F7NU4MC0GW, this.adDC3e2L);
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.eh1 eh1Var = (defpackage.eh1) lj0Var;
        boolean z = eh1Var.hkbnNdmy;
        boolean z2 = this.IHQe1A4L2xu;
        if (z != z2) {
            eh1Var.hkbnNdmy = z2;
            defpackage.x80.C0U8sNJm(eh1Var);
        }
        eh1Var.TFRaUu83X3E = this.adDC3e2L;
        eh1Var.LoQIcHWpPq(this.oh6vYeIP, null, false, this.r1MBDhnF, this.F7NU4MC0GW, eh1Var.WLpAkxCo);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.ch1.class != obj.getClass()) {
            return false;
        }
        defpackage.ch1 ch1Var = (defpackage.ch1) obj;
        return this.IHQe1A4L2xu == ch1Var.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, ch1Var.oh6vYeIP) && this.r1MBDhnF == ch1Var.r1MBDhnF && this.F7NU4MC0GW.equals(ch1Var.F7NU4MC0GW) && this.adDC3e2L == ch1Var.adDC3e2L;
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31;
        defpackage.zk0 zk0Var = this.oh6vYeIP;
        return this.adDC3e2L.hashCode() + defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW.IHQe1A4L2xu, defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L((hashCode + (zk0Var != null ? zk0Var.hashCode() : 0)) * 961, 31, false), 31, this.r1MBDhnF), 31);
    }
}
