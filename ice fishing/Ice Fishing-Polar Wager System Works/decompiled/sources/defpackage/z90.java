package defpackage;

/* loaded from: classes.dex */
final class z90 extends defpackage.qj0 {
    public final java.lang.String IHQe1A4L2xu;

    public z90(java.lang.String str) {
        this.IHQe1A4L2xu = str;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.aa0 aa0Var = new defpackage.aa0();
        aa0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        return aa0Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        ((defpackage.aa0) lj0Var).EgCjBq0SZwJ = this.IHQe1A4L2xu;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.z90) && this.IHQe1A4L2xu.equals(((defpackage.z90) obj).IHQe1A4L2xu);
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        return "LayoutIdElement(layoutId=" + ((java.lang.Object) this.IHQe1A4L2xu) + ')';
    }
}
