package defpackage;

/* loaded from: classes.dex */
public final class le0 implements defpackage.yy {
    public final float IHQe1A4L2xu;

    public le0(float f) {
        this.IHQe1A4L2xu = f;
    }

    @Override // defpackage.yy
    public final float IHQe1A4L2xu(float f) {
        return f / this.IHQe1A4L2xu;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.le0) && java.lang.Float.compare(this.IHQe1A4L2xu, ((defpackage.le0) obj).IHQe1A4L2xu) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.IHQe1A4L2xu);
    }

    @Override // defpackage.yy
    public final float oh6vYeIP(float f) {
        return f * this.IHQe1A4L2xu;
    }

    public final java.lang.String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.IHQe1A4L2xu + ')';
    }
}
