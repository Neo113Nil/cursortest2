package androidx.compose.material3;

/* loaded from: classes3.dex */
public final class DisplayMode {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof DisplayMode) {
            return this.value == ((DisplayMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        int i = this.value;
        return i == 0 ? "Picker" : i == 1 ? "Input" : "Unknown";
    }
}
