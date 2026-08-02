package androidx.media3.extractor.wav;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class WavSeekMap implements SeekMap {
    public final long blockCount;
    public final long durationUs;
    public final long firstBlockPosition;
    public final int framesPerBlock;
    public final WavFormat wavFormat;

    public WavSeekMap(WavFormat wavFormat, int i, long j, long j2) {
        this.wavFormat = wavFormat;
        this.framesPerBlock = i;
        this.firstBlockPosition = j;
        long j3 = (j2 - j) / wavFormat.blockSize;
        this.blockCount = j3;
        this.durationUs = blockIndexToTimeUs(j3);
    }

    public final long blockIndexToTimeUs(long j) {
        long j2 = j * this.framesPerBlock;
        long j3 = this.wavFormat.frameRateHz;
        String str = Util.DEVICE_DEBUG_INFO;
        return Util.scaleLargeValue(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        WavFormat wavFormat = this.wavFormat;
        long j2 = this.blockCount - 1;
        long constrainValue = Util.constrainValue((wavFormat.frameRateHz * j) / (this.framesPerBlock * 1000000), 0L, j2);
        int i = wavFormat.blockSize;
        long j3 = this.firstBlockPosition;
        long blockIndexToTimeUs = blockIndexToTimeUs(constrainValue);
        SeekPoint seekPoint = new SeekPoint(blockIndexToTimeUs, (i * constrainValue) + j3);
        if (blockIndexToTimeUs >= j || constrainValue == j2) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long j4 = constrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(blockIndexToTimeUs(j4), (i * j4) + j3));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
