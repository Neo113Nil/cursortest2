package defpackage;

/* loaded from: classes.dex */
public final class g5 extends defpackage.i5 {
    public float IHQe1A4L2xu;
    public float oh6vYeIP;
    public float r1MBDhnF;

    public g5(float f, float f2, float f3) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = f3;
    }

    @Override // defpackage.i5
    public final void F7NU4MC0GW() {
        this.IHQe1A4L2xu = 0.0f;
        this.oh6vYeIP = 0.0f;
        this.r1MBDhnF = 0.0f;
    }

    @Override // defpackage.i5
    public final float IHQe1A4L2xu(int i) {
        if (i == 0) {
            return this.IHQe1A4L2xu;
        }
        if (i == 1) {
            return this.oh6vYeIP;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.r1MBDhnF;
    }

    @Override // defpackage.i5
    public final void adDC3e2L(float f, int i) {
        if (i == 0) {
            this.IHQe1A4L2xu = f;
        } else if (i == 1) {
            this.oh6vYeIP = f;
        } else {
            if (i != 2) {
                return;
            }
            this.r1MBDhnF = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.g5)) {
            return false;
        }
        defpackage.g5 g5Var = (defpackage.g5) obj;
        return g5Var.IHQe1A4L2xu == this.IHQe1A4L2xu && g5Var.oh6vYeIP == this.oh6vYeIP && g5Var.r1MBDhnF == this.r1MBDhnF;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.r1MBDhnF) + defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31);
    }

    @Override // defpackage.i5
    public final int oh6vYeIP() {
        return 3;
    }

    @Override // defpackage.i5
    public final defpackage.i5 r1MBDhnF() {
        return new defpackage.g5(0.0f, 0.0f, 0.0f);
    }

    public final java.lang.String toString() {
        return "AnimationVector3D: v1 = " + this.IHQe1A4L2xu + ", v2 = " + this.oh6vYeIP + ", v3 = " + this.r1MBDhnF;
    }
}
