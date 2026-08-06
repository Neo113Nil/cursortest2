package defpackage;

/* loaded from: classes.dex */
public final class r40 {
    public final int IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.r40) {
            return this.IHQe1A4L2xu == ((defpackage.r40) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}
