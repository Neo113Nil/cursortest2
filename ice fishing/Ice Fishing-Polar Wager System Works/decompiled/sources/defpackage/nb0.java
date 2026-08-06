package defpackage;

/* loaded from: classes.dex */
final class nb0 extends defpackage.qj0 {
    public final defpackage.qb0 IHQe1A4L2xu;

    public nb0(defpackage.qb0 qb0Var) {
        this.IHQe1A4L2xu = qb0Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.ob0 ob0Var = new defpackage.ob0();
        ob0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        return ob0Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.ob0 ob0Var = (defpackage.ob0) lj0Var;
        defpackage.qb0 qb0Var = ob0Var.EgCjBq0SZwJ;
        defpackage.qb0 qb0Var2 = this.IHQe1A4L2xu;
        if (defpackage.x70.QoRHpC4k(qb0Var, qb0Var2) || !ob0Var.adDC3e2L.kd6TUFXn) {
            return;
        }
        defpackage.qb0 qb0Var3 = ob0Var.EgCjBq0SZwJ;
        qb0Var3.r1MBDhnF();
        qb0Var3.oh6vYeIP = null;
        ob0Var.EgCjBq0SZwJ = qb0Var2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.nb0) && this.IHQe1A4L2xu == ((defpackage.nb0) obj).IHQe1A4L2xu;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.IHQe1A4L2xu + ')';
    }
}
