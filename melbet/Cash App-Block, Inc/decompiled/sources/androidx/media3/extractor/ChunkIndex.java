package androidx.media3.extractor;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ChunkIndex implements SeekMap {
    public final long durationUs;
    public final long[] durationsUs;
    public final int length;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timesUs;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.sizes = iArr;
        this.offsets = jArr;
        this.durationsUs = jArr2;
        this.timesUs = jArr3;
        int length = iArr.length;
        this.length = length;
        if (length <= 0) {
            this.durationUs = 0L;
        } else {
            int i = length - 1;
            this.durationUs = jArr2[i] + jArr3[i];
        }
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
        long[] jArr2 = this.offsets;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[binarySearchFloor]);
        if (j2 >= j || binarySearchFloor == this.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.length + ", sizes=" + Arrays.toString(this.sizes) + ", offsets=" + Arrays.toString(this.offsets) + ", timeUs=" + Arrays.toString(this.timesUs) + ", durationsUs=" + Arrays.toString(this.durationsUs) + ")";
    }
}
