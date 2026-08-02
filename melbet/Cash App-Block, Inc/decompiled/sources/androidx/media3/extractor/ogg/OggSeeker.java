package androidx.media3.extractor.ogg;

import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;

/* loaded from: classes3.dex */
public interface OggSeeker {
    SeekMap createSeekMap();

    long read(ExtractorInput extractorInput);

    void startSeek(long j);
}
