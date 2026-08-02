package androidx.compose.ui.text.input;

/* loaded from: classes.dex */
public final class ImeAction {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m998toStringimpl(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ImeAction) {
            return this.value == ((ImeAction) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m998toStringimpl(this.value);
    }
}
