package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes3.dex */
public final class MlltSeeker implements Seeker {
    public final long durationUs;
    public final long[] referencePositions;
    public final long[] referenceTimesMs;

    public MlltSeeker(long j, long[] jArr, long[] jArr2) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j == -9223372036854775807L ? Util.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair linearlyInterpolate(long j, long[] jArr, long[] jArr2) {
        int binarySearchFloor = Util.binarySearchFloor(jArr, j, true);
        long j2 = jArr[binarySearchFloor];
        long j3 = jArr2[binarySearchFloor];
        int i = binarySearchFloor + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int getAverageBitrate() {
        return -2147483647;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getDataEndPosition() {
        return -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        Pair linearlyInterpolate = linearlyInterpolate(Util.usToMs(Util.constrainValue(j, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        SeekPoint seekPoint = new SeekPoint(Util.msToUs(((Long) linearlyInterpolate.first).longValue()), ((Long) linearlyInterpolate.second).longValue());
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return Util.msToUs(((Long) linearlyInterpolate(j, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
