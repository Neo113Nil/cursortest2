package defpackage;

/* loaded from: classes.dex */
public final class e5 extends defpackage.i5 {
    public float IHQe1A4L2xu;

    public e5(float f) {
        this.IHQe1A4L2xu = f;
    }

    @Override // defpackage.i5
    public final void F7NU4MC0GW() {
        this.IHQe1A4L2xu = 0.0f;
    }

    @Override // defpackage.i5
    public final float IHQe1A4L2xu(int i) {
        if (i == 0) {
            return this.IHQe1A4L2xu;
        }
        return 0.0f;
    }

    @Override // defpackage.i5
    public final void adDC3e2L(float f, int i) {
        if (i == 0) {
            this.IHQe1A4L2xu = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.e5) && ((defpackage.e5) obj).IHQe1A4L2xu == this.IHQe1A4L2xu;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.IHQe1A4L2xu);
    }

    @Override // defpackage.i5
    public final int oh6vYeIP() {
        return 1;
    }

    @Override // defpackage.i5
    public final defpackage.i5 r1MBDhnF() {
        return new defpackage.e5(0.0f);
    }

    public final java.lang.String toString() {
        return "AnimationVector1D: value = " + this.IHQe1A4L2xu;
    }
}
