package defpackage;

/* loaded from: classes.dex */
public final class ct0 implements defpackage.at0 {
    public final float F7NU4MC0GW;
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;
    public final float r1MBDhnF;

    public ct0(float f, float f2, float f3, float f4) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = f3;
        this.F7NU4MC0GW = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            defpackage.v50.IHQe1A4L2xu("Padding must be non-negative");
        }
    }

    @Override // defpackage.at0
    public final float F7NU4MC0GW() {
        return this.oh6vYeIP;
    }

    @Override // defpackage.at0
    public final float IHQe1A4L2xu(defpackage.w90 w90Var) {
        return w90Var == defpackage.w90.adDC3e2L ? this.IHQe1A4L2xu : this.r1MBDhnF;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ct0)) {
            return false;
        }
        defpackage.ct0 ct0Var = (defpackage.ct0) obj;
        return defpackage.uq.oh6vYeIP(this.IHQe1A4L2xu, ct0Var.IHQe1A4L2xu) && defpackage.uq.oh6vYeIP(this.oh6vYeIP, ct0Var.oh6vYeIP) && defpackage.uq.oh6vYeIP(this.r1MBDhnF, ct0Var.r1MBDhnF) && defpackage.uq.oh6vYeIP(this.F7NU4MC0GW, ct0Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.F7NU4MC0GW) + defpackage.fx0.IHQe1A4L2xu(this.r1MBDhnF, defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31), 31);
    }

    @Override // defpackage.at0
    public final float oh6vYeIP(defpackage.w90 w90Var) {
        return w90Var == defpackage.w90.adDC3e2L ? this.r1MBDhnF : this.IHQe1A4L2xu;
    }

    @Override // defpackage.at0
    public final float r1MBDhnF() {
        return this.F7NU4MC0GW;
    }

    public final java.lang.String toString() {
        return "PaddingValues(start=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.IHQe1A4L2xu)) + ", top=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.oh6vYeIP)) + ", end=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.r1MBDhnF)) + ", bottom=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.F7NU4MC0GW)) + ')';
    }
}
