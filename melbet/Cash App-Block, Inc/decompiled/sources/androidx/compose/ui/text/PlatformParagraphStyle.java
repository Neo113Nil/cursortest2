package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    public static final PlatformParagraphStyle Default = new PlatformParagraphStyle(0, false);
    public final int emojiSupportMatch;
    public final boolean includeFontPadding;

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && this.emojiSupportMatch == platformParagraphStyle.emojiSupportMatch;
    }

    public final int hashCode() {
        return Integer.hashCode(this.emojiSupportMatch) + (Boolean.hashCode(this.includeFontPadding) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m963toStringimpl(this.emojiSupportMatch)) + ')';
    }

    public PlatformParagraphStyle(int i, boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = i;
    }
}
