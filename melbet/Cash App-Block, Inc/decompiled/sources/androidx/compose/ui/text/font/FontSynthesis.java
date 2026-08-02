package androidx.compose.ui.text.font;

/* loaded from: classes.dex */
public final class FontSynthesis {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof FontSynthesis) {
            return this.value == ((FontSynthesis) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        int i = this.value;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
