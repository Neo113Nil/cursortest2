package androidx.media3.extractor;

import androidx.media3.extractor.SeekMap;

/* loaded from: classes3.dex */
public abstract class ForwardingSeekMap implements SeekMap {
    public final SeekMap seekMap;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return this.seekMap.getSeekPoints(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isEstimated() {
        return this.seekMap.isEstimated();
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.seekMap.isSeekable();
    }
}
