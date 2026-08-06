package defpackage;

/* loaded from: classes.dex */
public final class h5 extends defpackage.i5 {
    public float F7NU4MC0GW;
    public float IHQe1A4L2xu;
    public float oh6vYeIP;
    public float r1MBDhnF;

    public h5(float f, float f2, float f3, float f4) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = f3;
        this.F7NU4MC0GW = f4;
    }

    @Override // defpackage.i5
    public final void F7NU4MC0GW() {
        this.IHQe1A4L2xu = 0.0f;
        this.oh6vYeIP = 0.0f;
        this.r1MBDhnF = 0.0f;
        this.F7NU4MC0GW = 0.0f;
    }

    @Override // defpackage.i5
    public final float IHQe1A4L2xu(int i) {
        if (i == 0) {
            return this.IHQe1A4L2xu;
        }
        if (i == 1) {
            return this.oh6vYeIP;
        }
        if (i == 2) {
            return this.r1MBDhnF;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.F7NU4MC0GW;
    }

    @Override // defpackage.i5
    public final void adDC3e2L(float f, int i) {
        if (i == 0) {
            this.IHQe1A4L2xu = f;
            return;
        }
        if (i == 1) {
            this.oh6vYeIP = f;
        } else if (i == 2) {
            this.r1MBDhnF = f;
        } else {
            if (i != 3) {
                return;
            }
            this.F7NU4MC0GW = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.h5)) {
            return false;
        }
        defpackage.h5 h5Var = (defpackage.h5) obj;
        return h5Var.IHQe1A4L2xu == this.IHQe1A4L2xu && h5Var.oh6vYeIP == this.oh6vYeIP && h5Var.r1MBDhnF == this.r1MBDhnF && h5Var.F7NU4MC0GW == this.F7NU4MC0GW;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.F7NU4MC0GW) + defpackage.fx0.IHQe1A4L2xu(this.r1MBDhnF, defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31), 31);
    }

    @Override // defpackage.i5
    public final int oh6vYeIP() {
        return 4;
    }

    @Override // defpackage.i5
    public final defpackage.i5 r1MBDhnF() {
        return new defpackage.h5(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final java.lang.String toString() {
        return "AnimationVector4D: v1 = " + this.IHQe1A4L2xu + ", v2 = " + this.oh6vYeIP + ", v3 = " + this.r1MBDhnF + ", v4 = " + this.F7NU4MC0GW;
    }
}
