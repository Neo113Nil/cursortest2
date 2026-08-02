package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ChapterFrame extends Id3Frame {
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    public final Id3Frame[] subFrames;

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.chapterId = str;
        this.startTimeMs = i;
        this.endTimeMs = i2;
        this.startOffset = j;
        this.endOffset = j2;
        this.subFrames = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && this.chapterId.equals(chapterFrame.chapterId) && Arrays.equals(this.subFrames, chapterFrame.subFrames);
    }

    public final int hashCode() {
        return this.chapterId.hashCode() + ((((((((527 + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31);
    }
}
