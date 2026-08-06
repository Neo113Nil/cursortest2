package defpackage;

/* loaded from: classes.dex */
final class w61 extends defpackage.qj0 {
    public final boolean F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final defpackage.vz adDC3e2L;
    public final defpackage.zk0 oh6vYeIP;
    public final defpackage.f50 r1MBDhnF;

    public w61(defpackage.vz vzVar, defpackage.f50 f50Var, defpackage.zk0 zk0Var, boolean z, boolean z2) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = zk0Var;
        this.r1MBDhnF = f50Var;
        this.F7NU4MC0GW = z2;
        this.adDC3e2L = vzVar;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.y61 y61Var = new defpackage.y61(this.oh6vYeIP, this.r1MBDhnF, false, this.F7NU4MC0GW, null, this.adDC3e2L);
        y61Var.hkbnNdmy = this.IHQe1A4L2xu;
        return y61Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.y61 y61Var = (defpackage.y61) lj0Var;
        boolean z = y61Var.hkbnNdmy;
        boolean z2 = this.IHQe1A4L2xu;
        if (z != z2) {
            y61Var.hkbnNdmy = z2;
            defpackage.x80.C0U8sNJm(y61Var);
        }
        y61Var.LoQIcHWpPq(this.oh6vYeIP, this.r1MBDhnF, false, this.F7NU4MC0GW, null, this.adDC3e2L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.w61.class != obj.getClass()) {
            return false;
        }
        defpackage.w61 w61Var = (defpackage.w61) obj;
        return this.IHQe1A4L2xu == w61Var.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(this.oh6vYeIP, w61Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, w61Var.r1MBDhnF) && this.F7NU4MC0GW == w61Var.F7NU4MC0GW && this.adDC3e2L == w61Var.adDC3e2L;
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31;
        defpackage.zk0 zk0Var = this.oh6vYeIP;
        int hashCode2 = (hashCode + (zk0Var != null ? zk0Var.hashCode() : 0)) * 31;
        defpackage.f50 f50Var = this.r1MBDhnF;
        return this.adDC3e2L.hashCode() + defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L((hashCode2 + (f50Var != null ? f50Var.hashCode() : 0)) * 31, 31, false), 961, this.F7NU4MC0GW);
    }
}
