package defpackage;

/* loaded from: classes.dex */
public final class l21 {
    public final int IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.l21) {
            return this.IHQe1A4L2xu == ((defpackage.l21) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
