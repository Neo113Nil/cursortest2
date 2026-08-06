package defpackage;

/* loaded from: classes.dex */
public final class jf1 {
    public static final defpackage.jf1 r1MBDhnF = new defpackage.jf1(1.0f, 0.0f);
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;

    public jf1(float f, float f2) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jf1)) {
            return false;
        }
        defpackage.jf1 jf1Var = (defpackage.jf1) obj;
        return this.IHQe1A4L2xu == jf1Var.IHQe1A4L2xu && this.oh6vYeIP == jf1Var.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "TextGeometricTransform(scaleX=" + this.IHQe1A4L2xu + ", skewX=" + this.oh6vYeIP + ')';
    }
}
