package defpackage;

/* loaded from: classes.dex */
final class tt extends defpackage.qj0 {
    public final defpackage.ut AARZUJiTa;
    public final defpackage.cu F7NU4MC0GW;
    public final defpackage.li1 IHQe1A4L2xu;
    public final defpackage.su adDC3e2L;
    public final defpackage.gi1 oh6vYeIP;
    public final defpackage.gi1 r1MBDhnF;
    public final defpackage.vz xiZrDbcSW0;

    public tt(defpackage.li1 li1Var, defpackage.gi1 gi1Var, defpackage.gi1 gi1Var2, defpackage.cu cuVar, defpackage.su suVar, defpackage.vz vzVar, defpackage.ut utVar) {
        this.IHQe1A4L2xu = li1Var;
        this.oh6vYeIP = gi1Var;
        this.r1MBDhnF = gi1Var2;
        this.F7NU4MC0GW = cuVar;
        this.adDC3e2L = suVar;
        this.xiZrDbcSW0 = vzVar;
        this.AARZUJiTa = utVar;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        return new defpackage.bu(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF, this.F7NU4MC0GW, this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa);
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.bu buVar = (defpackage.bu) lj0Var;
        buVar.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        buVar.fnWB2E7cs = this.oh6vYeIP;
        buVar.kNAkVymC = this.r1MBDhnF;
        buVar.V7bD7b8KA = this.F7NU4MC0GW;
        buVar.PAEGRtP0bX = this.adDC3e2L;
        buVar.abhbClRa = this.xiZrDbcSW0;
        buVar.NHJTzaLwkd = this.AARZUJiTa;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.tt)) {
            return false;
        }
        defpackage.tt ttVar = (defpackage.tt) obj;
        return ttVar.IHQe1A4L2xu == this.IHQe1A4L2xu && defpackage.x70.QoRHpC4k(ttVar.oh6vYeIP, this.oh6vYeIP) && defpackage.x70.QoRHpC4k(ttVar.r1MBDhnF, this.r1MBDhnF) && ttVar.F7NU4MC0GW.equals(this.F7NU4MC0GW) && defpackage.x70.QoRHpC4k(ttVar.adDC3e2L, this.adDC3e2L) && ttVar.xiZrDbcSW0 == this.xiZrDbcSW0 && defpackage.x70.QoRHpC4k(ttVar.AARZUJiTa, this.AARZUJiTa);
    }

    public final int hashCode() {
        int hashCode = this.IHQe1A4L2xu.hashCode() * 31;
        defpackage.gi1 gi1Var = this.oh6vYeIP;
        int hashCode2 = (hashCode + (gi1Var != null ? gi1Var.hashCode() : 0)) * 31;
        defpackage.gi1 gi1Var2 = this.r1MBDhnF;
        return this.AARZUJiTa.hashCode() + ((this.xiZrDbcSW0.hashCode() + ((this.adDC3e2L.IHQe1A4L2xu.hashCode() + ((this.F7NU4MC0GW.IHQe1A4L2xu.hashCode() + ((hashCode2 + (gi1Var2 != null ? gi1Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }
}
