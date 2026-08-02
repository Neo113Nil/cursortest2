package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes3.dex */
public final class VbriSeeker implements Seeker {
    public final int bitrate;
    public final long dataEndPosition;
    public final long durationUs;
    public final long[] positions;
    public final long[] timesUs;

    public VbriSeeker(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
        this.dataEndPosition = j3;
        this.bitrate = i;
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
        long[] jArr = this.timesUs;
        int binarySearchFloor = Util.binarySearchFloor(jArr, j, true);
        long j2 = jArr[binarySearchFloor];
        long[] jArr2 = this.positions;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[binarySearchFloor]);
        if (j2 >= j || binarySearchFloor == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
