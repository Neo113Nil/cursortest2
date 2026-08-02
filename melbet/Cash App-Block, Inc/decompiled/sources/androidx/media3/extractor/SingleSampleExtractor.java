package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SingleSampleExtractor implements Extractor {
    public ExtractorOutput extractorOutput;
    public final int fileSignature;
    public final int fileSignatureLength;
    public final String sampleMimeType;
    public int size;
    public int state;
    public TrackOutput trackOutput;

    public SingleSampleExtractor(int i, int i2, String str) {
        this.fileSignature = i;
        this.fileSignatureLength = i2;
        this.sampleMimeType = str;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput track = extractorOutput.track(1024, 4);
        this.trackOutput = track;
        Format.Builder builder = new Format.Builder();
        String str = this.sampleMimeType;
        builder.containerMimeType = MimeTypes.normalizeMimeType(str);
        builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
        NavAction$$ExternalSyntheticOutline0.m(builder, track);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SingleSampleSeekMap());
        this.state = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        int i = this.state;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            Path$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        TrackOutput trackOutput = this.trackOutput;
        trackOutput.getClass();
        int sampleData = trackOutput.sampleData((DataReader) extractorInput, 1024, true);
        if (sampleData != -1) {
            this.size += sampleData;
            return 0;
        }
        this.state = 2;
        this.trackOutput.sampleMetadata(0L, 1, this.size, 0, null);
        this.size = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0 || this.state == 1) {
            this.state = 1;
            this.size = 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        int i = this.fileSignatureLength;
        int i2 = this.fileSignature;
        Trace.checkState((i2 == -1 || i == -1) ? false : true);
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray.data, 0, i, false);
        return parsableByteArray.readUnsignedShort() == i2;
    }
}
