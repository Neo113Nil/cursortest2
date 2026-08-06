package defpackage;

/* loaded from: classes.dex */
final class l4<S> extends defpackage.qj0 {
    public final defpackage.gi1 IHQe1A4L2xu;
    public final defpackage.sl0 oh6vYeIP;
    public final defpackage.p4 r1MBDhnF;

    public l4(defpackage.gi1 gi1Var, defpackage.sl0 sl0Var, defpackage.p4 p4Var) {
        this.IHQe1A4L2xu = gi1Var;
        this.oh6vYeIP = sl0Var;
        this.r1MBDhnF = p4Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.o4 o4Var = new defpackage.o4();
        o4Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        o4Var.fnWB2E7cs = this.oh6vYeIP;
        o4Var.kNAkVymC = this.r1MBDhnF;
        o4Var.V7bD7b8KA = -9223372034707292160L;
        return o4Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.o4 o4Var = (defpackage.o4) lj0Var;
        o4Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        o4Var.fnWB2E7cs = this.oh6vYeIP;
        o4Var.kNAkVymC = this.r1MBDhnF;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.l4)) {
            return false;
        }
        defpackage.l4 l4Var = (defpackage.l4) obj;
        return defpackage.x70.QoRHpC4k(l4Var.IHQe1A4L2xu, this.IHQe1A4L2xu) && l4Var.oh6vYeIP.equals(this.oh6vYeIP);
    }

    public final int hashCode() {
        int hashCode = this.r1MBDhnF.hashCode() * 31;
        defpackage.gi1 gi1Var = this.IHQe1A4L2xu;
        return this.oh6vYeIP.hashCode() + ((hashCode + (gi1Var != null ? gi1Var.hashCode() : 0)) * 31);
    }
}
