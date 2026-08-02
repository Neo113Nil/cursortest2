package androidx.media3.extractor;

import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class BinarySearchSeeker$SeekOperationParams {
    public final long approxBytesPerFrame;
    public long ceilingBytePosition;
    public long ceilingTimePosition;
    public long floorBytePosition;
    public long floorTimePosition = 0;
    public long nextSearchBytePosition;
    public final long seekTimeUs;
    public final long targetTimePosition;

    public BinarySearchSeeker$SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6) {
        this.seekTimeUs = j;
        this.targetTimePosition = j2;
        this.ceilingTimePosition = j3;
        this.floorBytePosition = j4;
        this.ceilingBytePosition = j5;
        this.approxBytesPerFrame = j6;
        this.nextSearchBytePosition = calculateNextSearchBytePosition(j2, 0L, j3, j4, j5, j6);
    }

    public static long calculateNextSearchBytePosition(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return Util.constrainValue(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
