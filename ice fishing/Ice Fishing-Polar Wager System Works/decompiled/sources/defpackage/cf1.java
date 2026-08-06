package defpackage;

/* loaded from: classes.dex */
public final class cf1 {
    public final int IHQe1A4L2xu;

    public static java.lang.String IHQe1A4L2xu(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.cf1) {
            return this.IHQe1A4L2xu == ((defpackage.cf1) obj).IHQe1A4L2xu;
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
