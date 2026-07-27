package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBundleMVI {
    public final boolean CatchingFishParcelableFAB;

    public CatchingFishBundleMVI() {
        this.CatchingFishParcelableFAB = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishBundleMVI) {
            return this.CatchingFishParcelableFAB == ((CatchingFishBundleMVI) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.CatchingFishParcelableFAB) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.CatchingFishParcelableFAB + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public CatchingFishBundleMVI(boolean z) {
        this.CatchingFishParcelableFAB = z;
    }
}
