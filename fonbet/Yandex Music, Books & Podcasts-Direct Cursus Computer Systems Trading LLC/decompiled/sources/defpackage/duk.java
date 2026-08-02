package defpackage;

/* loaded from: classes.dex */
public final class duk {
    public static final duk b = new duk(0, false);
    public final boolean a;

    public duk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof duk) {
            return this.a == ((duk) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ouj.r(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public duk(int i, boolean z) {
        this.a = z;
    }
}
