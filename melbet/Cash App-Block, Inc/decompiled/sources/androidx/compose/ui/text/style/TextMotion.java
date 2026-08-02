package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class TextMotion {
    public final int linearity;
    public final boolean subpixelTextPositioning;
    public static final TextMotion Static = new TextMotion(2, false);
    public static final TextMotion Animated = new TextMotion(1, true);

    public final class Linearity {
        public final int value;

        public final boolean equals(Object obj) {
            if (obj instanceof Linearity) {
                return this.value == ((Linearity) obj).value;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value);
        }

        public final String toString() {
            int i = this.value;
            return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
        }
    }

    public TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return this.linearity == textMotion.linearity && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.subpixelTextPositioning) + (Integer.hashCode(this.linearity) * 31);
    }

    public final String toString() {
        return equals(Static) ? "TextMotion.Static" : equals(Animated) ? "TextMotion.Animated" : "Invalid";
    }
}
