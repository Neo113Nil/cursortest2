package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.ExtractorOutput;
import com.google.android.libraries.places.internal.zzcjk;

/* loaded from: classes3.dex */
public interface TsPayloadReader {

    public final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final String language;

        public DvbSubtitleInfo(String str, byte[] bArr) {
            this.language = str;
            this.initializationData = bArr;
        }
    }

    void consume(int i, ParsableByteArray parsableByteArray);

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, zzcjk zzcjkVar);

    void seek();
}
