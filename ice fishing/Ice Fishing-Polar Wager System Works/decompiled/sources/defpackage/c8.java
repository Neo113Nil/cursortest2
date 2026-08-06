package defpackage;

/* loaded from: classes.dex */
public final class c8 {
    public final float IHQe1A4L2xu;

    public c8(float f) {
        this.IHQe1A4L2xu = f;
    }

    public final int IHQe1A4L2xu(int i, int i2, defpackage.w90 w90Var) {
        float f = (i2 - i) / 2.0f;
        defpackage.w90 w90Var2 = defpackage.w90.adDC3e2L;
        float f2 = this.IHQe1A4L2xu;
        if (w90Var != w90Var2) {
            f2 *= -1.0f;
        }
        return java.lang.Math.round((1.0f + f2) * f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.c8) && java.lang.Float.compare(this.IHQe1A4L2xu, ((defpackage.c8) obj).IHQe1A4L2xu) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return "Horizontal(bias=" + this.IHQe1A4L2xu + ')';
    }
}
