package defpackage;

/* loaded from: classes.dex */
public final class bz {
    public final int IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.bz) {
            return this.IHQe1A4L2xu == ((defpackage.bz) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
