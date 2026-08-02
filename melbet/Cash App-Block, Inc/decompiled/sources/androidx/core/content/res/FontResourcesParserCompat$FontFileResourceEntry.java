package androidx.core.content.res;

/* loaded from: classes3.dex */
public final class FontResourcesParserCompat$FontFileResourceEntry {
    public final boolean mItalic;
    public final int mResourceId;
    public final int mTtcIndex;
    public final String mVariationSettings;
    public final int mWeight;

    public FontResourcesParserCompat$FontFileResourceEntry(int i, boolean z, String str, int i2, int i3) {
        this.mWeight = i;
        this.mItalic = z;
        this.mVariationSettings = str;
        this.mTtcIndex = i2;
        this.mResourceId = i3;
    }

    public final int getResourceId() {
        return this.mResourceId;
    }

    public final int getTtcIndex() {
        return this.mTtcIndex;
    }

    public final String getVariationSettings() {
        return this.mVariationSettings;
    }

    public final int getWeight() {
        return this.mWeight;
    }

    public final boolean isItalic() {
        return this.mItalic;
    }
}
