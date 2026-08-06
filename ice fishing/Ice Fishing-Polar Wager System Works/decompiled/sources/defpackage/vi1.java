package defpackage;

/* loaded from: classes.dex */
final class vi1 extends defpackage.qj0 {
    public final defpackage.ec0 IHQe1A4L2xu;

    public vi1(defpackage.ec0 ec0Var) {
        this.IHQe1A4L2xu = ec0Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.wi1 wi1Var = new defpackage.wi1();
        wi1Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        return wi1Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        ((defpackage.wi1) lj0Var).EgCjBq0SZwJ = this.IHQe1A4L2xu;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.vi1) && defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, ((defpackage.vi1) obj).IHQe1A4L2xu);
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.IHQe1A4L2xu + ')';
    }
}
