package defpackage;

/* loaded from: classes.dex */
public final class eu0 implements defpackage.ij {
    public final float IHQe1A4L2xu;

    public eu0(float f) {
        this.IHQe1A4L2xu = f;
        if (f < 0.0f || f > 100.0f) {
            defpackage.a60.IHQe1A4L2xu("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.ij
    public final float IHQe1A4L2xu(long j, defpackage.qn qnVar) {
        return (this.IHQe1A4L2xu / 100.0f) * defpackage.z91.oh6vYeIP(j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.eu0) && java.lang.Float.compare(this.IHQe1A4L2xu, ((defpackage.eu0) obj).IHQe1A4L2xu) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.IHQe1A4L2xu + "%)";
    }
}
