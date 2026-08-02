package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class LineBreak {
    public static final int Simple = TextOverflow.access$packBytes(1, 3, 1);
    public final int mask;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1010toStringimpl(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i2 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i3 = (i >> 8) & 255;
        sb.append((Object) (i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str = "WordBreak.None";
        } else if (i4 == 2) {
            str = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LineBreak) {
            return this.mask == ((LineBreak) obj).mask;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.mask);
    }

    public final String toString() {
        return m1010toStringimpl(this.mask);
    }
}
