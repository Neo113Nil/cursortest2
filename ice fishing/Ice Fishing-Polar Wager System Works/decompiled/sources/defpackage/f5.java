package defpackage;

/* loaded from: classes.dex */
public final class f5 extends defpackage.i5 {
    public float IHQe1A4L2xu;
    public float oh6vYeIP;

    public f5(float f, float f2) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
    }

    @Override // defpackage.i5
    public final void F7NU4MC0GW() {
        this.IHQe1A4L2xu = 0.0f;
        this.oh6vYeIP = 0.0f;
    }

    @Override // defpackage.i5
    public final float IHQe1A4L2xu(int i) {
        if (i == 0) {
            return this.IHQe1A4L2xu;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.oh6vYeIP;
    }

    @Override // defpackage.i5
    public final void adDC3e2L(float f, int i) {
        if (i == 0) {
            this.IHQe1A4L2xu = f;
        } else {
            if (i != 1) {
                return;
            }
            this.oh6vYeIP = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.f5)) {
            return false;
        }
        defpackage.f5 f5Var = (defpackage.f5) obj;
        return f5Var.IHQe1A4L2xu == this.IHQe1A4L2xu && f5Var.oh6vYeIP == this.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }

    @Override // defpackage.i5
    public final int oh6vYeIP() {
        return 2;
    }

    @Override // defpackage.i5
    public final defpackage.i5 r1MBDhnF() {
        return new defpackage.f5(0.0f, 0.0f);
    }

    public final java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.IHQe1A4L2xu + ", v2 = " + this.oh6vYeIP;
    }
}
