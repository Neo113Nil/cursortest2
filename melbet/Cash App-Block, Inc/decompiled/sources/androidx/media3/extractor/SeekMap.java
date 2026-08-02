package androidx.media3.extractor;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.avi.AviExtractor;
import androidx.media3.extractor.avi.ChunkReader;
import coil3.svg.internal.AndroidSvg;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface SeekMap {

    public final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = seekPoint;
            this.second = seekPoint2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SeekPoints.class == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            SeekPoint seekPoint = this.first;
            sb.append(seekPoint);
            SeekPoint seekPoint2 = this.second;
            if (seekPoint.equals(seekPoint2)) {
                str = "";
            } else {
                str = ", " + seekPoint2;
            }
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str, "]");
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j);

    default boolean isEstimated() {
        return false;
    }

    boolean isSeekable();

    public class Unseekable implements SeekMap {
        public final /* synthetic */ int $r8$classId;
        public final long durationUs;
        public final Object startSeekPoints;

        public Unseekable(long j, long j2) {
            this.$r8$classId = 0;
            this.durationUs = j;
            SeekPoint seekPoint = j2 == 0 ? SeekPoint.START : new SeekPoint(0L, j2);
            this.startSeekPoints = new SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            switch (this.$r8$classId) {
                case 0:
                    return this.durationUs;
                case 1:
                    return ((FlacStreamMetadata) this.startSeekPoints).getDurationUs();
                default:
                    return this.durationUs;
            }
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekPoints getSeekPoints(long j) {
            int i = this.$r8$classId;
            int i2 = 1;
            Object obj = this.startSeekPoints;
            switch (i) {
                case 0:
                    return (SeekPoints) obj;
                case 1:
                    FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) obj;
                    flacStreamMetadata.seekTable.getClass();
                    AndroidSvg androidSvg = flacStreamMetadata.seekTable;
                    long[] jArr = (long[]) androidSvg.svg;
                    long[] jArr2 = (long[]) androidSvg.renderOptions;
                    int binarySearchFloor = Util.binarySearchFloor(jArr, Util.constrainValue((flacStreamMetadata.sampleRate * j) / 1000000, 0L, flacStreamMetadata.totalSamples - 1), false);
                    long j2 = binarySearchFloor == -1 ? 0L : jArr[binarySearchFloor];
                    long j3 = binarySearchFloor != -1 ? jArr2[binarySearchFloor] : 0L;
                    int i3 = flacStreamMetadata.sampleRate;
                    long j4 = (j2 * 1000000) / i3;
                    long j5 = this.durationUs;
                    SeekPoint seekPoint = new SeekPoint(j4, j3 + j5);
                    if (j4 == j || binarySearchFloor == jArr.length - 1) {
                        return new SeekPoints(seekPoint, seekPoint);
                    }
                    int i4 = binarySearchFloor + 1;
                    return new SeekPoints(seekPoint, new SeekPoint((jArr[i4] * 1000000) / i3, j5 + jArr2[i4]));
                default:
                    AviExtractor aviExtractor = (AviExtractor) obj;
                    SeekPoints seekPoints = aviExtractor.chunkReaders[0].getSeekPoints(j);
                    while (true) {
                        ChunkReader[] chunkReaderArr = aviExtractor.chunkReaders;
                        if (i2 >= chunkReaderArr.length) {
                            return seekPoints;
                        }
                        SeekPoints seekPoints2 = chunkReaderArr[i2].getSeekPoints(j);
                        if (seekPoints2.first.position < seekPoints.first.position) {
                            seekPoints = seekPoints2;
                        }
                        i2++;
                    }
            }
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            switch (this.$r8$classId) {
            }
            return true;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Unseekable(long j) {
            this(j, 0L);
            this.$r8$classId = 0;
        }

        public /* synthetic */ Unseekable(Object obj, long j, int i) {
            this.$r8$classId = i;
            this.startSeekPoints = obj;
            this.durationUs = j;
        }
    }
}
