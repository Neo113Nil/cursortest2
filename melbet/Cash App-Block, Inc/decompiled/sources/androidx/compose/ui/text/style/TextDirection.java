package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class TextDirection {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1014toStringimpl(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextDirection) {
            return this.value == ((TextDirection) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m1014toStringimpl(this.value);
    }
}
