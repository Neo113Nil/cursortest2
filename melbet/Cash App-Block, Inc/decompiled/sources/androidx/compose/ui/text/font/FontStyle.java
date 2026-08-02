package androidx.compose.ui.text.font;

/* loaded from: classes.dex */
public final class FontStyle {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof FontStyle) {
            return this.value == ((FontStyle) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        int i = this.value;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
