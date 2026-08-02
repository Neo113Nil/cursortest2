package androidx.compose.ui.text.input;

/* loaded from: classes.dex */
public final class KeyboardCapitalization {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m999toStringimpl(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyboardCapitalization) {
            return this.value == ((KeyboardCapitalization) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m999toStringimpl(this.value);
    }
}
