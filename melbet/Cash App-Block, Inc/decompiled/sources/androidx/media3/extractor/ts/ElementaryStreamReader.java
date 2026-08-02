package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import com.google.android.libraries.places.internal.zzcjk;

/* loaded from: classes3.dex */
public interface ElementaryStreamReader {
    void consume(ParsableByteArray parsableByteArray);

    void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar);

    void packetFinished(boolean z);

    void packetStarted(int i, long j);

    void seek();
}
