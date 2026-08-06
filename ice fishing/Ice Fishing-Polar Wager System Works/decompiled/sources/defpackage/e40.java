package defpackage;

/* loaded from: classes.dex */
public final class e40 extends defpackage.qj0 {
    public final defpackage.c8 IHQe1A4L2xu;

    public e40(defpackage.c8 c8Var) {
        this.IHQe1A4L2xu = c8Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.f40 f40Var = new defpackage.f40();
        f40Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        return f40Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        ((defpackage.f40) lj0Var).EgCjBq0SZwJ = this.IHQe1A4L2xu;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.e40 e40Var = obj instanceof defpackage.e40 ? (defpackage.e40) obj : null;
        if (e40Var == null) {
            return false;
        }
        return this.IHQe1A4L2xu.equals(e40Var.IHQe1A4L2xu);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.IHQe1A4L2xu.IHQe1A4L2xu);
    }
}
