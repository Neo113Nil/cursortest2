package defpackage;

/* loaded from: classes.dex */
final class bd extends defpackage.qj0 {
    public final boolean F7NU4MC0GW;
    public final defpackage.zk0 IHQe1A4L2xu;
    public final defpackage.vz adDC3e2L;
    public final defpackage.f50 oh6vYeIP;
    public final boolean r1MBDhnF;

    public bd(defpackage.vz vzVar, defpackage.f50 f50Var, defpackage.zk0 zk0Var, boolean z, boolean z2) {
        this.IHQe1A4L2xu = zk0Var;
        this.oh6vYeIP = f50Var;
        this.r1MBDhnF = z;
        this.F7NU4MC0GW = z2;
        this.adDC3e2L = vzVar;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        return new defpackage.dd(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF, this.F7NU4MC0GW, null, this.adDC3e2L);
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        ((defpackage.dd) lj0Var).LoQIcHWpPq(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF, this.F7NU4MC0GW, null, this.adDC3e2L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.bd.class != obj.getClass()) {
            return false;
        }
        defpackage.bd bdVar = (defpackage.bd) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, bdVar.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, bdVar.oh6vYeIP) && this.r1MBDhnF == bdVar.r1MBDhnF && this.F7NU4MC0GW == bdVar.F7NU4MC0GW && this.adDC3e2L == bdVar.adDC3e2L;
    }

    public final int hashCode() {
        defpackage.zk0 zk0Var = this.IHQe1A4L2xu;
        int hashCode = (zk0Var != null ? zk0Var.hashCode() : 0) * 31;
        defpackage.f50 f50Var = this.oh6vYeIP;
        return this.adDC3e2L.hashCode() + defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L((hashCode + (f50Var != null ? f50Var.hashCode() : 0)) * 31, 31, this.r1MBDhnF), 29791, this.F7NU4MC0GW);
    }
}
