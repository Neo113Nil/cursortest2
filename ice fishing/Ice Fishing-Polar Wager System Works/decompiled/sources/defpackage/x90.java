package defpackage;

/* loaded from: classes.dex */
final class x90 extends defpackage.qj0 {
    public final defpackage.l00 IHQe1A4L2xu;

    public x90(defpackage.l00 l00Var) {
        this.IHQe1A4L2xu = l00Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.ca0 ca0Var = new defpackage.ca0();
        ca0Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        return ca0Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        ((defpackage.ca0) lj0Var).EgCjBq0SZwJ = this.IHQe1A4L2xu;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.x90) {
            return this.IHQe1A4L2xu == ((defpackage.x90) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }
}
