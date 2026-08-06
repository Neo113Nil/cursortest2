package defpackage;

/* loaded from: classes.dex */
public final class r8 extends defpackage.qj0 {
    public final float IHQe1A4L2xu;
    public final defpackage.kb1 oh6vYeIP;
    public final defpackage.e91 r1MBDhnF;

    public r8(float f, defpackage.kb1 kb1Var, defpackage.e91 e91Var) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = kb1Var;
        this.r1MBDhnF = e91Var;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        return new defpackage.q8(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF);
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.q8 q8Var = (defpackage.q8) lj0Var;
        float f = q8Var.V7bD7b8KA;
        defpackage.sa saVar = q8Var.NHJTzaLwkd;
        float f2 = this.IHQe1A4L2xu;
        if (!defpackage.uq.oh6vYeIP(f, f2)) {
            q8Var.V7bD7b8KA = f2;
            saVar.UVjEelCZ();
        }
        defpackage.kb1 kb1Var = q8Var.PAEGRtP0bX;
        defpackage.kb1 kb1Var2 = this.oh6vYeIP;
        if (!defpackage.x70.QoRHpC4k(kb1Var, kb1Var2)) {
            q8Var.PAEGRtP0bX = kb1Var2;
            saVar.UVjEelCZ();
        }
        defpackage.e91 e91Var = q8Var.abhbClRa;
        defpackage.e91 e91Var2 = this.r1MBDhnF;
        if (defpackage.x70.QoRHpC4k(e91Var, e91Var2)) {
            return;
        }
        q8Var.abhbClRa = e91Var2;
        saVar.UVjEelCZ();
        defpackage.x80.C0U8sNJm(q8Var);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.r8)) {
            return false;
        }
        defpackage.r8 r8Var = (defpackage.r8) obj;
        return defpackage.uq.oh6vYeIP(this.IHQe1A4L2xu, r8Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(r8Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, r8Var.r1MBDhnF);
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "BorderModifierNodeElement(width=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.IHQe1A4L2xu)) + ", brush=" + this.oh6vYeIP + ", shape=" + this.r1MBDhnF + ')';
    }
}
