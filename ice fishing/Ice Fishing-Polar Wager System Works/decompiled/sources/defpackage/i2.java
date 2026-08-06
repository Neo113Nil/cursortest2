package defpackage;

/* loaded from: classes.dex */
public final class i2 {
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;

    public i2(float f, float f2) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.i2)) {
            return false;
        }
        defpackage.i2 i2Var = (defpackage.i2) obj;
        return java.lang.Float.compare(this.IHQe1A4L2xu, i2Var.IHQe1A4L2xu) == 0 && java.lang.Float.compare(this.oh6vYeIP, i2Var.oh6vYeIP) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "FlingResult(distanceCoefficient=" + this.IHQe1A4L2xu + ", velocityCoefficient=" + this.oh6vYeIP + ')';
    }
}
