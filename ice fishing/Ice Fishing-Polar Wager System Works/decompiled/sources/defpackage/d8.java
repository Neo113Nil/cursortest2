package defpackage;

/* loaded from: classes.dex */
public final class d8 {
    public final float IHQe1A4L2xu;

    public d8(float f) {
        this.IHQe1A4L2xu = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.d8) && java.lang.Float.compare(this.IHQe1A4L2xu, ((defpackage.d8) obj).IHQe1A4L2xu) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return "Vertical(bias=" + this.IHQe1A4L2xu + ')';
    }
}
