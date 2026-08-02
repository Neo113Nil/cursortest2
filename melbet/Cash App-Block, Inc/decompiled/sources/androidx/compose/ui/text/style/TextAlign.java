package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class TextAlign {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1013toStringimpl(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextAlign) {
            return this.value == ((TextAlign) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m1013toStringimpl(this.value);
    }
}
