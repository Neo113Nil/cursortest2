package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ChapterTocFrame extends Id3Frame {
    public final String[] children;
    public final String elementId;
    public final boolean isOrdered;
    public final boolean isRoot;
    public final Id3Frame[] subFrames;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.elementId = str;
        this.isRoot = z;
        this.isOrdered = z2;
        this.children = strArr;
        this.subFrames = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.isRoot == chapterTocFrame.isRoot && this.isOrdered == chapterTocFrame.isOrdered && this.elementId.equals(chapterTocFrame.elementId) && Arrays.equals(this.children, chapterTocFrame.children) && Arrays.equals(this.subFrames, chapterTocFrame.subFrames);
    }

    public final int hashCode() {
        return this.elementId.hashCode() + ((((527 + (this.isRoot ? 1 : 0)) * 31) + (this.isOrdered ? 1 : 0)) * 31);
    }
}
