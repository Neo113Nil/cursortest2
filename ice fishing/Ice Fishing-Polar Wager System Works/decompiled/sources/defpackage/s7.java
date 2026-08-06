package defpackage;

/* loaded from: classes.dex */
final class s7 extends defpackage.qj0 {
    public final long IHQe1A4L2xu;
    public final float oh6vYeIP = 1.0f;
    public final defpackage.e91 r1MBDhnF;

    public s7(long j, defpackage.e91 e91Var) {
        this.IHQe1A4L2xu = j;
        this.r1MBDhnF = e91Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        defpackage.t7 t7Var = new defpackage.t7();
        t7Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        t7Var.fnWB2E7cs = this.r1MBDhnF;
        t7Var.kNAkVymC = 9205357640488583168L;
        return t7Var;
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.t7 t7Var = (defpackage.t7) lj0Var;
        t7Var.EgCjBq0SZwJ = this.IHQe1A4L2xu;
        defpackage.e91 e91Var = t7Var.fnWB2E7cs;
        defpackage.e91 e91Var2 = this.r1MBDhnF;
        if (!defpackage.x70.QoRHpC4k(e91Var, e91Var2)) {
            t7Var.fnWB2E7cs = e91Var2;
            defpackage.x80.C0U8sNJm(t7Var);
        }
        defpackage.fm.D2vUnMij(t7Var);
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.s7 s7Var = obj instanceof defpackage.s7 ? (defpackage.s7) obj : null;
        return s7Var != null && defpackage.ae.r1MBDhnF(this.IHQe1A4L2xu, s7Var.IHQe1A4L2xu) && this.oh6vYeIP == s7Var.oh6vYeIP && defpackage.x70.QoRHpC4k(this.r1MBDhnF, s7Var.r1MBDhnF);
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return this.r1MBDhnF.hashCode() + defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Long.hashCode(this.IHQe1A4L2xu) * 961, 31);
    }
}
