package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class Hyphens {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1008toStringimpl(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Hyphens) {
            return this.value == ((Hyphens) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m1008toStringimpl(this.value);
    }
}
