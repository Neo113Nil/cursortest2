package defpackage;

/* loaded from: classes.dex */
public final class mc extends defpackage.qj0 {
    public final defpackage.JX5fKip1C6 IHQe1A4L2xu;

    public mc(defpackage.JX5fKip1C6 jX5fKip1C6) {
        this.IHQe1A4L2xu = jX5fKip1C6;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.lc lcVar = new defpackage.lc();
        lcVar.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        return lcVar;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.lc lcVar = (defpackage.lc) lj0Var;
        lcVar.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        defpackage.x80.C0U8sNJm(lcVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mc) {
            return this.IHQe1A4L2xu == ((defpackage.mc) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }
}
