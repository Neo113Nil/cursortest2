package androidx.core.content.res;

/* loaded from: classes3.dex */
public final class FontResourcesParserCompat$FontFamilyFilesResourceEntry implements FontResourcesParserCompat$FamilyResourceEntry {
    public final FontResourcesParserCompat$FontFileResourceEntry[] mEntries;

    public FontResourcesParserCompat$FontFamilyFilesResourceEntry(FontResourcesParserCompat$FontFileResourceEntry[] fontResourcesParserCompat$FontFileResourceEntryArr) {
        this.mEntries = fontResourcesParserCompat$FontFileResourceEntryArr;
    }

    public final FontResourcesParserCompat$FontFileResourceEntry[] getEntries() {
        return this.mEntries;
    }
}
