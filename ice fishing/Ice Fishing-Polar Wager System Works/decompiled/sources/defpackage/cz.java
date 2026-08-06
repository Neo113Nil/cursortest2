package defpackage;

/* loaded from: classes.dex */
public final class cz {
    public final int IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.cz) {
            return this.IHQe1A4L2xu == ((defpackage.cz) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
