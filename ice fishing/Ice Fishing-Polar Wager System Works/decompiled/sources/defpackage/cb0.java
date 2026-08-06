package defpackage;

/* loaded from: classes.dex */
public final class cb0 extends defpackage.qj0 {
    public final float IHQe1A4L2xu;
    public final boolean oh6vYeIP;

    public cb0(float f, boolean z) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = z;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.db0 db0Var = new defpackage.db0();
        db0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        db0Var.fnWB2E7cs = this.oh6vYeIP;
        return db0Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.db0 db0Var = (defpackage.db0) lj0Var;
        db0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        db0Var.fnWB2E7cs = this.oh6vYeIP;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.cb0 cb0Var = obj instanceof defpackage.cb0 ? (defpackage.cb0) obj : null;
        return cb0Var != null && this.IHQe1A4L2xu == cb0Var.IHQe1A4L2xu && this.oh6vYeIP == cb0Var.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.oh6vYeIP) + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }
}
