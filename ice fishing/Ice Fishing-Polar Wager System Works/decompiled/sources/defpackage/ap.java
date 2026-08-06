package defpackage;

/* loaded from: classes.dex */
public final class ap {
    public final defpackage.a01 F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final defpackage.zo oh6vYeIP;
    public final java.lang.String r1MBDhnF;

    public ap(int i, defpackage.zo zoVar, java.lang.String str, defpackage.a01 a01Var) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = zoVar;
        this.r1MBDhnF = str;
        this.F7NU4MC0GW = a01Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ap)) {
            return false;
        }
        defpackage.ap apVar = (defpackage.ap) obj;
        return this.IHQe1A4L2xu == apVar.IHQe1A4L2xu && this.oh6vYeIP == apVar.oh6vYeIP && this.r1MBDhnF.equals(apVar.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, apVar.F7NU4MC0GW);
    }

    public final int hashCode() {
        int F7NU4MC0GW = defpackage.fx0.F7NU4MC0GW((this.oh6vYeIP.hashCode() + (java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31)) * 31, 31, this.r1MBDhnF);
        defpackage.a01 a01Var = this.F7NU4MC0GW;
        return F7NU4MC0GW + (a01Var == null ? 0 : a01Var.hashCode());
    }

    public final java.lang.String toString() {
        return "DigCellUi(index=" + this.IHQe1A4L2xu + ", kind=" + this.oh6vYeIP + ", caption=" + this.r1MBDhnF + ", relic=" + this.F7NU4MC0GW + ")";
    }
}
