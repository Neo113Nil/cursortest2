package defpackage;

/* loaded from: classes.dex */
public final class jd {
    public final float IHQe1A4L2xu;

    public jd(float f) {
        this.IHQe1A4L2xu = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.jd)) {
            return false;
        }
        float f = this.IHQe1A4L2xu;
        return (0.0f > f && 0.0f > ((defpackage.jd) obj).IHQe1A4L2xu) || f == ((defpackage.jd) obj).IHQe1A4L2xu;
    }

    public final int hashCode() {
        float f = this.IHQe1A4L2xu;
        if (0.0f > f) {
            return -1;
        }
        return java.lang.Float.hashCode(f) + (java.lang.Float.hashCode(0.0f) * 31);
    }

    public final java.lang.String toString() {
        return "0.0.." + this.IHQe1A4L2xu;
    }
}
