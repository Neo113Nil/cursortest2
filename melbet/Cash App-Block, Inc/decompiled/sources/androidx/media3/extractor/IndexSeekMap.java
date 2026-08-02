package androidx.media3.extractor;

import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.tracing.Trace;

/* loaded from: classes3.dex */
public final class IndexSeekMap implements SeekMap {
    public long durationUs;
    public final LongArray positions;
    public final LongArray timesUs;

    public IndexSeekMap(long j, long[] jArr, long[] jArr2) {
        Trace.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.positions = new LongArray(length);
            this.timesUs = new LongArray(length);
        } else {
            int i = length + 1;
            LongArray longArray = new LongArray(i);
            this.positions = longArray;
            LongArray longArray2 = new LongArray(i);
            this.timesUs = longArray2;
            longArray.add(0L);
            longArray2.add(0L);
        }
        this.positions.addAll(jArr);
        this.timesUs.addAll(jArr2);
        this.durationUs = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        LongArray longArray = this.timesUs;
        if (longArray.size == 0) {
            SeekPoint seekPoint = SeekPoint.START;
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int binarySearchFloor = Util.binarySearchFloor(longArray, j);
        long j2 = longArray.get(binarySearchFloor);
        LongArray longArray2 = this.positions;
        SeekPoint seekPoint2 = new SeekPoint(j2, longArray2.get(binarySearchFloor));
        if (j2 == j || binarySearchFloor == longArray.size - 1) {
            return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
        }
        int i = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(longArray.get(i), longArray2.get(i)));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.timesUs.size > 0;
    }
}
