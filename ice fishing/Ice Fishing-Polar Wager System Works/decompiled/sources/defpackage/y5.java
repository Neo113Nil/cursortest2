package defpackage;

/* loaded from: classes.dex */
public final class y5 extends defpackage.qj0 {
    public final boolean IHQe1A4L2xu;
    public final defpackage.g00 oh6vYeIP;

    public y5(defpackage.g00 g00Var, boolean z) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = g00Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.gj gjVar = new defpackage.gj();
        gjVar.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        gjVar.fnWB2E7cs = this.oh6vYeIP;
        return gjVar;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.gj gjVar = (defpackage.gj) lj0Var;
        gjVar.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        gjVar.fnWB2E7cs = this.oh6vYeIP;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.y5)) {
            return false;
        }
        defpackage.y5 y5Var = (defpackage.y5) obj;
        return this.IHQe1A4L2xu == y5Var.IHQe1A4L2xu && this.oh6vYeIP == y5Var.oh6vYeIP;
    }

    public final int hashCode() {
        return this.oh6vYeIP.hashCode() + (java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31);
    }
}
