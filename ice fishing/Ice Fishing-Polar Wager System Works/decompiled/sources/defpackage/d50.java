package defpackage;

/* loaded from: classes.dex */
final class d50 extends defpackage.qj0 {
    public final defpackage.zk0 IHQe1A4L2xu;
    public final defpackage.f50 oh6vYeIP;

    public d50(defpackage.zk0 zk0Var, defpackage.f50 f50Var) {
        this.IHQe1A4L2xu = zk0Var;
        this.oh6vYeIP = f50Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.kn IHQe1A4L2xu = this.oh6vYeIP.IHQe1A4L2xu(this.IHQe1A4L2xu);
        defpackage.e50 e50Var = new defpackage.e50();
        e50Var.kNAkVymC = IHQe1A4L2xu;
        e50Var.UVjEelCZ(IHQe1A4L2xu);
        return e50Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.e50 e50Var = (defpackage.e50) lj0Var;
        defpackage.kn IHQe1A4L2xu = this.oh6vYeIP.IHQe1A4L2xu(this.IHQe1A4L2xu);
        e50Var.H6IrRhrpWoH(e50Var.kNAkVymC);
        e50Var.kNAkVymC = IHQe1A4L2xu;
        e50Var.UVjEelCZ(IHQe1A4L2xu);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.d50)) {
            return false;
        }
        defpackage.d50 d50Var = (defpackage.d50) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, d50Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, d50Var.oh6vYeIP);
    }

    public final int hashCode() {
        return this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31);
    }
}
