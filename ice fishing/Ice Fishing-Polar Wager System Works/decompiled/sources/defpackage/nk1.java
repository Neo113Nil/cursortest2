package defpackage;

/* loaded from: classes.dex */
public final class nk1 implements defpackage.nn1 {
    public final defpackage.nn1 IHQe1A4L2xu;
    public final defpackage.nn1 oh6vYeIP;

    public nk1(defpackage.nn1 nn1Var, defpackage.nn1 nn1Var2) {
        this.IHQe1A4L2xu = nn1Var;
        this.oh6vYeIP = nn1Var2;
    }

    @Override // defpackage.nn1
    public final int F7NU4MC0GW(defpackage.qn qnVar, defpackage.w90 w90Var) {
        return java.lang.Math.max(this.IHQe1A4L2xu.F7NU4MC0GW(qnVar, w90Var), this.oh6vYeIP.F7NU4MC0GW(qnVar, w90Var));
    }

    @Override // defpackage.nn1
    public final int IHQe1A4L2xu(defpackage.qn qnVar) {
        return java.lang.Math.max(this.IHQe1A4L2xu.IHQe1A4L2xu(qnVar), this.oh6vYeIP.IHQe1A4L2xu(qnVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nk1)) {
            return false;
        }
        defpackage.nk1 nk1Var = (defpackage.nk1) obj;
        return defpackage.x70.QoRHpC4k(nk1Var.IHQe1A4L2xu, this.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(nk1Var.oh6vYeIP, this.oh6vYeIP);
    }

    public final int hashCode() {
        return (this.oh6vYeIP.hashCode() * 31) + this.IHQe1A4L2xu.hashCode();
    }

    @Override // defpackage.nn1
    public final int oh6vYeIP(defpackage.qn qnVar) {
        return java.lang.Math.max(this.IHQe1A4L2xu.oh6vYeIP(qnVar), this.oh6vYeIP.oh6vYeIP(qnVar));
    }

    @Override // defpackage.nn1
    public final int r1MBDhnF(defpackage.qn qnVar, defpackage.w90 w90Var) {
        return java.lang.Math.max(this.IHQe1A4L2xu.r1MBDhnF(qnVar, w90Var), this.oh6vYeIP.r1MBDhnF(qnVar, w90Var));
    }

    public final java.lang.String toString() {
        return "(" + this.IHQe1A4L2xu + " ∪ " + this.oh6vYeIP + ')';
    }
}
