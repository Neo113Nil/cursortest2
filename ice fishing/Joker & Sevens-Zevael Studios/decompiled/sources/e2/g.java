package e2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f1956a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f1956a == ((g) obj).f1956a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1956a);
    }

    public final String toString() {
        int i10 = this.f1956a;
        return i10 == 0 ? "Button" : i10 == 1 ? "Checkbox" : i10 == 2 ? "Switch" : i10 == 3 ? "RadioButton" : i10 == 4 ? "Tab" : i10 == 5 ? "Image" : i10 == 6 ? "DropdownList" : i10 == 7 ? "Picker" : i10 == 8 ? "Carousel" : "Unknown";
    }
}
