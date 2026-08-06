package defpackage;

/* loaded from: classes.dex */
final class mi extends defpackage.qj0 {
    public final defpackage.g00 IHQe1A4L2xu;

    public mi(defpackage.g00 g00Var) {
        this.IHQe1A4L2xu = g00Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.ni niVar = new defpackage.ni();
        niVar.kNAkVymC = this.IHQe1A4L2xu;
        return niVar;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.ni niVar = (defpackage.ni) lj0Var;
        defpackage.g00 g00Var = niVar.kNAkVymC;
        defpackage.g00 g00Var2 = this.IHQe1A4L2xu;
        if (g00Var2 != g00Var) {
            niVar.kNAkVymC = g00Var2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.mi) && ((defpackage.mi) obj).IHQe1A4L2xu == this.IHQe1A4L2xu;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }
}
