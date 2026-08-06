package defpackage;

/* loaded from: classes.dex */
final class o51 extends defpackage.qj0 {
    public final defpackage.e2 AARZUJiTa;
    public final defpackage.qm F7NU4MC0GW;
    public final defpackage.b61 IHQe1A4L2xu;
    public final defpackage.zk0 adDC3e2L;
    public final defpackage.ks0 oh6vYeIP;
    public final boolean r1MBDhnF;
    public final boolean xiZrDbcSW0;

    public o51(defpackage.e2 e2Var, defpackage.qm qmVar, defpackage.zk0 zk0Var, defpackage.ks0 ks0Var, defpackage.b61 b61Var, boolean z, boolean z2) {
        this.IHQe1A4L2xu = b61Var;
        this.oh6vYeIP = ks0Var;
        this.r1MBDhnF = z;
        this.F7NU4MC0GW = qmVar;
        this.adDC3e2L = zk0Var;
        this.xiZrDbcSW0 = z2;
        this.AARZUJiTa = e2Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.p51 p51Var = new defpackage.p51();
        p51Var.kNAkVymC = this.IHQe1A4L2xu;
        p51Var.V7bD7b8KA = this.oh6vYeIP;
        p51Var.PAEGRtP0bX = this.r1MBDhnF;
        p51Var.abhbClRa = this.F7NU4MC0GW;
        p51Var.NHJTzaLwkd = this.adDC3e2L;
        p51Var.QQUzIjv3iOC5 = this.xiZrDbcSW0;
        p51Var.C0U8sNJm = this.AARZUJiTa;
        return p51Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        ((defpackage.p51) lj0Var).fzubgBFo(this.AARZUJiTa, this.F7NU4MC0GW, this.adDC3e2L, this.oh6vYeIP, this.IHQe1A4L2xu, this.xiZrDbcSW0, this.r1MBDhnF);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.o51.class != obj.getClass()) {
            return false;
        }
        defpackage.o51 o51Var = (defpackage.o51) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, o51Var.IHQe1A4L2xu) && this.oh6vYeIP == o51Var.oh6vYeIP && this.r1MBDhnF == o51Var.r1MBDhnF && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, o51Var.F7NU4MC0GW) && defpackage.x70.QoRHpC4k(this.adDC3e2L, o51Var.adDC3e2L) && this.xiZrDbcSW0 == o51Var.xiZrDbcSW0 && defpackage.x70.QoRHpC4k(this.AARZUJiTa, o51Var.AARZUJiTa);
    }

    public final int hashCode() {
        int adDC3e2L = defpackage.fx0.adDC3e2L(defpackage.fx0.adDC3e2L((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31, 31, this.r1MBDhnF), 31, false);
        defpackage.qm qmVar = this.F7NU4MC0GW;
        int hashCode = (adDC3e2L + (qmVar != null ? qmVar.hashCode() : 0)) * 31;
        defpackage.zk0 zk0Var = this.adDC3e2L;
        int adDC3e2L2 = defpackage.fx0.adDC3e2L((hashCode + (zk0Var != null ? zk0Var.hashCode() : 0)) * 961, 31, this.xiZrDbcSW0);
        defpackage.e2 e2Var = this.AARZUJiTa;
        return adDC3e2L2 + (e2Var != null ? e2Var.hashCode() : 0);
    }
}
