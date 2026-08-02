package androidx.core.content.res;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class FontResourcesParserCompat$ProviderResourceEntry implements FontResourcesParserCompat$FamilyResourceEntry {
    public final ArrayList mRequests;
    public final int mStrategy;
    public final String mSystemFontFamilyName;
    public final int mTimeoutMs;

    public FontResourcesParserCompat$ProviderResourceEntry(ArrayList arrayList, int i, int i2, String str) {
        this.mRequests = arrayList;
        this.mStrategy = i;
        this.mTimeoutMs = i2;
        this.mSystemFontFamilyName = str;
    }

    public final int getFetchStrategy() {
        return this.mStrategy;
    }

    public final List getRequests() {
        return this.mRequests;
    }

    public final String getSystemFontFamilyName() {
        return this.mSystemFontFamilyName;
    }

    public final int getTimeout() {
        return this.mTimeoutMs;
    }
}
