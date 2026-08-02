package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes3.dex */
public final class ConstantBitrateSeeker implements Seeker, SeekMap {
    public final boolean allowSeeksIfLengthUnknown;
    public final boolean allowSeeksIfLengthUnknown$1;
    public final int bitrate;
    public final int bitrate$1;
    public final long dataEndPosition;
    public final long dataSize;
    public final long durationUs;
    public final long firstFrameBytePosition;
    public final long firstFramePosition;
    public final int frameSize;
    public final int frameSize$1;
    public final long inputLength;
    public final boolean isEstimated;

    public ConstantBitrateSeeker(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.inputLength = j;
        this.firstFrameBytePosition = j2;
        this.frameSize$1 = i2 == -1 ? 1 : i2;
        this.bitrate$1 = i;
        this.allowSeeksIfLengthUnknown$1 = z;
        this.isEstimated = z2;
        if (j == -1) {
            this.dataSize = -1L;
            this.durationUs = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.dataSize = j3;
            this.durationUs = (Math.max(0L, j3) * 8000000) / i;
        }
        this.firstFramePosition = j2;
        this.bitrate = i;
        this.frameSize = i2;
        this.allowSeeksIfLengthUnknown = z;
        this.dataEndPosition = j == -1 ? -1L : j;
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
        long j2 = this.dataSize;
        long j3 = this.firstFrameBytePosition;
        if (j2 == -1 && !this.allowSeeksIfLengthUnknown$1) {
            SeekPoint seekPoint = new SeekPoint(0L, j3);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = this.bitrate$1;
        long j4 = this.frameSize$1;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        SeekPoint seekPoint2 = new SeekPoint(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.inputLength) {
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.firstFrameBytePosition) * 8000000) / this.bitrate$1;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isEstimated() {
        return this.isEstimated;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown$1;
    }
}
