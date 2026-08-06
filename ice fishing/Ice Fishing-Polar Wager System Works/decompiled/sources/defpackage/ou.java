package defpackage;

/* loaded from: classes.dex */
public final class ou implements defpackage.nn1 {
    public final defpackage.nn1 IHQe1A4L2xu;
    public final defpackage.nn1 oh6vYeIP;

    public ou(defpackage.nn1 nn1Var, defpackage.nn1 nn1Var2) {
        this.IHQe1A4L2xu = nn1Var;
        this.oh6vYeIP = nn1Var2;
    }

    @Override // defpackage.nn1
    public final int F7NU4MC0GW(defpackage.qn qnVar, defpackage.w90 w90Var) {
        int F7NU4MC0GW = this.IHQe1A4L2xu.F7NU4MC0GW(qnVar, w90Var) - this.oh6vYeIP.F7NU4MC0GW(qnVar, w90Var);
        if (F7NU4MC0GW < 0) {
            return 0;
        }
        return F7NU4MC0GW;
    }

    @Override // defpackage.nn1
    public final int IHQe1A4L2xu(defpackage.qn qnVar) {
        int IHQe1A4L2xu = this.IHQe1A4L2xu.IHQe1A4L2xu(qnVar) - this.oh6vYeIP.IHQe1A4L2xu(qnVar);
        if (IHQe1A4L2xu < 0) {
            return 0;
        }
        return IHQe1A4L2xu;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ou)) {
            return false;
        }
        defpackage.ou ouVar = (defpackage.ou) obj;
        return defpackage.x70.QoRHpC4k(ouVar.IHQe1A4L2xu, this.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(ouVar.oh6vYeIP, this.oh6vYeIP);
    }

    public final int hashCode() {
        return this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31);
    }

    @Override // defpackage.nn1
    public final int oh6vYeIP(defpackage.qn qnVar) {
        int oh6vYeIP = this.IHQe1A4L2xu.oh6vYeIP(qnVar) - this.oh6vYeIP.oh6vYeIP(qnVar);
        if (oh6vYeIP < 0) {
            return 0;
        }
        return oh6vYeIP;
    }

    @Override // defpackage.nn1
    public final int r1MBDhnF(defpackage.qn qnVar, defpackage.w90 w90Var) {
        int r1MBDhnF = this.IHQe1A4L2xu.r1MBDhnF(qnVar, w90Var) - this.oh6vYeIP.r1MBDhnF(qnVar, w90Var);
        if (r1MBDhnF < 0) {
            return 0;
        }
        return r1MBDhnF;
    }

    public final java.lang.String toString() {
        return "(" + this.IHQe1A4L2xu + " - " + this.oh6vYeIP + ')';
    }
}
