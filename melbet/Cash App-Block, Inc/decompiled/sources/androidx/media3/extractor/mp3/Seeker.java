package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap;

/* loaded from: classes3.dex */
public interface Seeker extends SeekMap {

    public final class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // androidx.media3.extractor.mp3.Seeker
        public final int getAverageBitrate() {
            return -2147483647;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public final long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public final long getTimeUs(long j) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getTimeUs(long j);
}
