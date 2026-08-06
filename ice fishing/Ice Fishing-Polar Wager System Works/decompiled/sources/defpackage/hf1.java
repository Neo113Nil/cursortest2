package defpackage;

/* loaded from: classes.dex */
public final class hf1 {
    public final int IHQe1A4L2xu;

    public static java.lang.String IHQe1A4L2xu(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hf1) {
            return this.IHQe1A4L2xu == ((defpackage.hf1) obj).IHQe1A4L2xu;
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
