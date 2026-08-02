package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class Role {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m946toStringimpl(int i) {
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Role) {
            return this.value == ((Role) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m946toStringimpl(this.value);
    }
}
