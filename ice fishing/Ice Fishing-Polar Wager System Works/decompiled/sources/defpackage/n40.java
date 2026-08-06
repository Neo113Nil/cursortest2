package defpackage;

/* loaded from: classes.dex */
public final class n40 {
    public final int IHQe1A4L2xu;

    public static java.lang.String IHQe1A4L2xu(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.n40) {
            return this.IHQe1A4L2xu == ((defpackage.n40) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return IHQe1A4L2xu(this.IHQe1A4L2xu);
    }
}
