package defpackage;

/* loaded from: classes.dex */
public final class ie0 {
    public final int IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ie0) {
            return this.IHQe1A4L2xu == ((defpackage.ie0) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
