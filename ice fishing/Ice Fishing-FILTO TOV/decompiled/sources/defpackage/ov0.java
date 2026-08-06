package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ov0 {
    public final int GWasM1elztuh;

    public final boolean equals(Object obj) {
        if (obj instanceof ov0) {
            return this.GWasM1elztuh == ((ov0) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        int i = this.GWasM1elztuh;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
