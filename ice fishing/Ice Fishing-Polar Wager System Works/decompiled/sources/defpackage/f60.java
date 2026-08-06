package defpackage;

/* loaded from: classes.dex */
public final class f60 {
    public final int IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.f60) {
            return this.IHQe1A4L2xu == ((defpackage.f60) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
