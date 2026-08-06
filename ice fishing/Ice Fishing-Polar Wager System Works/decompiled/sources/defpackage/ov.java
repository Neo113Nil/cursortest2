package defpackage;

/* loaded from: classes.dex */
final class ov extends defpackage.qj0 {
    public final defpackage.up IHQe1A4L2xu;

    public ov(defpackage.up upVar) {
        this.IHQe1A4L2xu = upVar;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.pv pvVar = new defpackage.pv();
        pvVar.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        pvVar.fnWB2E7cs = 1.0f;
        return pvVar;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.pv pvVar = (defpackage.pv) lj0Var;
        pvVar.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        pvVar.fnWB2E7cs = 1.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ov) {
            return this.IHQe1A4L2xu == ((defpackage.ov) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(1.0f) + (this.IHQe1A4L2xu.hashCode() * 31);
    }
}
