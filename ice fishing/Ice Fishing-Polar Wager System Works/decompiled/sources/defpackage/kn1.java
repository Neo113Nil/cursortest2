package defpackage;

/* loaded from: classes.dex */
public final class kn1 {
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;

    public kn1(float f, float f2) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
    }

    public final float[] IHQe1A4L2xu() {
        float f = this.IHQe1A4L2xu;
        float f2 = this.oh6vYeIP;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kn1)) {
            return false;
        }
        defpackage.kn1 kn1Var = (defpackage.kn1) obj;
        return java.lang.Float.compare(this.IHQe1A4L2xu, kn1Var.IHQe1A4L2xu) == 0 && java.lang.Float.compare(this.oh6vYeIP, kn1Var.oh6vYeIP) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "WhitePoint(x=" + this.IHQe1A4L2xu + ", y=" + this.oh6vYeIP + ')';
    }
}
