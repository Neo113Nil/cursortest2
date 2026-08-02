package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes3.dex */
public final class XingSeeker implements Seeker {
    public final int bitrate;
    public final long dataEndPosition;
    public final long dataSize;
    public final long dataStartPosition;
    public final long durationUs;
    public final long[] tableOfContents;
    public final int xingFrameSize;

    public XingSeeker(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.dataStartPosition = j;
        this.xingFrameSize = i;
        this.durationUs = j2;
        this.bitrate = i2;
        this.dataSize = j3;
        this.tableOfContents = jArr;
        this.dataEndPosition = j3 != -1 ? j + j3 : -1L;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        double d;
        double d2;
        boolean isSeekable = isSeekable();
        int i = this.xingFrameSize;
        long j2 = this.dataStartPosition;
        if (!isSeekable) {
            SeekPoint seekPoint = new SeekPoint(0L, j2 + i);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long constrainValue = Util.constrainValue(j, 0L, this.durationUs);
        double d3 = (constrainValue * 100.0d) / this.durationUs;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.tableOfContents;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j3 = this.dataSize;
        SeekPoint seekPoint2 = new SeekPoint(constrainValue, j2 + Util.constrainValue(Math.round((d4 / d) * j3), i, j3 - 1));
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        long j2 = j - this.dataStartPosition;
        if (!isSeekable() || j2 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = this.tableOfContents;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.dataSize;
        int binarySearchFloor = Util.binarySearchFloor(jArr, (long) d, true);
        long j3 = this.durationUs;
        long j4 = (binarySearchFloor * j3) / 100;
        long j5 = jArr[binarySearchFloor];
        int i = binarySearchFloor + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (binarySearchFloor == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.tableOfContents != null;
    }
}
