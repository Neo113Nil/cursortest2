package defpackage;

/* loaded from: classes.dex */
final class n60 extends defpackage.qj0 {
    public final defpackage.nn1 IHQe1A4L2xu;

    public n60(defpackage.nn1 nn1Var) {
        this.IHQe1A4L2xu = nn1Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.p60 p60Var = new defpackage.p60();
        p60Var.kNAkVymC = this.IHQe1A4L2xu;
        return p60Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.p60 p60Var = (defpackage.p60) lj0Var;
        defpackage.nn1 nn1Var = p60Var.kNAkVymC;
        defpackage.nn1 nn1Var2 = this.IHQe1A4L2xu;
        if (defpackage.x70.QoRHpC4k(nn1Var2, nn1Var)) {
            return;
        }
        p60Var.kNAkVymC = nn1Var2;
        p60Var.H6IrRhrpWoH();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.n60) {
            return defpackage.x70.QoRHpC4k(((defpackage.n60) obj).IHQe1A4L2xu, this.IHQe1A4L2xu);
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }
}
