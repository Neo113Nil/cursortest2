package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class FilterQuality {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m698toStringimpl(int i) {
        return i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FilterQuality) {
            return this.value == ((FilterQuality) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m698toStringimpl(this.value);
    }
}
