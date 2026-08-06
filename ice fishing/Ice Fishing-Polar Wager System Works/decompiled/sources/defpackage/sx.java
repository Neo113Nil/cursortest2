package defpackage;

/* loaded from: classes.dex */
public final class sx {
    public final int IHQe1A4L2xu;

    public static java.lang.String IHQe1A4L2xu(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.sx) {
            return this.IHQe1A4L2xu == ((defpackage.sx) obj).IHQe1A4L2xu;
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
