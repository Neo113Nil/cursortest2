package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.MpegAudioUtil$Header;
import androidx.media3.extractor.TrackOutput;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class MpegAudioReader implements ElementaryStreamReader {
    public final String containerMimeType;
    public String formatId;
    public int frameBytesRead;
    public long frameDurationUs;
    public int frameSize;
    public boolean hasOutputFormat;
    public final MpegAudioUtil$Header header;
    public final ParsableByteArray headerScratch;
    public final String language;
    public boolean lastByteWasFF;
    public TrackOutput output;
    public final int roleFlags;
    public int state = 0;
    public long timeUs;

    public MpegAudioReader(String str, int i, String str2) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.headerScratch = parsableByteArray;
        parsableByteArray.data[0] = -1;
        this.header = new MpegAudioUtil$Header();
        this.timeUs = -9223372036854775807L;
        this.language = str;
        this.roleFlags = i;
        this.containerMimeType = str2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            ParsableByteArray parsableByteArray2 = this.headerScratch;
            if (i == 0) {
                byte[] bArr = parsableByteArray.data;
                int i2 = parsableByteArray.position;
                int i3 = parsableByteArray.limit;
                while (true) {
                    if (i2 >= i3) {
                        parsableByteArray.setPosition(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.lastByteWasFF && (b & 224) == 224;
                    this.lastByteWasFF = z;
                    if (z2) {
                        parsableByteArray.setPosition(i2 + 1);
                        this.lastByteWasFF = false;
                        parsableByteArray2.data[1] = bArr[i2];
                        this.frameBytesRead = 2;
                        this.state = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(parsableByteArray.bytesLeft(), 4 - this.frameBytesRead);
                parsableByteArray.readBytes(this.frameBytesRead, min, parsableByteArray2.data);
                int i4 = this.frameBytesRead + min;
                this.frameBytesRead = i4;
                if (i4 >= 4) {
                    parsableByteArray2.setPosition(0);
                    int readInt = parsableByteArray2.readInt();
                    MpegAudioUtil$Header mpegAudioUtil$Header = this.header;
                    if (mpegAudioUtil$Header.setForHeaderData(readInt)) {
                        this.frameSize = mpegAudioUtil$Header.frameSize;
                        if (!this.hasOutputFormat) {
                            this.frameDurationUs = (mpegAudioUtil$Header.samplesPerFrame * 1000000) / mpegAudioUtil$Header.sampleRate;
                            Format.Builder builder = new Format.Builder();
                            builder.id = this.formatId;
                            builder.containerMimeType = MimeTypes.normalizeMimeType(this.containerMimeType);
                            builder.sampleMimeType = MimeTypes.normalizeMimeType((String) mpegAudioUtil$Header.mimeType);
                            builder.maxInputSize = 4096;
                            builder.channelCount = mpegAudioUtil$Header.channels;
                            builder.sampleRate = mpegAudioUtil$Header.sampleRate;
                            builder.language = this.language;
                            builder.roleFlags = this.roleFlags;
                            this.output.format(new Format(builder));
                            this.hasOutputFormat = true;
                        }
                        parsableByteArray2.setPosition(0);
                        this.output.sampleData(4, parsableByteArray2);
                        this.state = 2;
                    } else {
                        this.frameBytesRead = 0;
                        this.state = 1;
                    }
                }
            } else {
                if (i != 2) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                int min2 = Math.min(parsableByteArray.bytesLeft(), this.frameSize - this.frameBytesRead);
                this.output.sampleData(min2, parsableByteArray);
                int i5 = this.frameBytesRead + min2;
                this.frameBytesRead = i5;
                if (i5 >= this.frameSize) {
                    Trace.checkState(this.timeUs != -9223372036854775807L);
                    this.output.sampleMetadata(this.timeUs, 1, this.frameSize, 0, null);
                    this.timeUs += this.frameDurationUs;
                    this.frameBytesRead = 0;
                    this.state = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        zzcjkVar.generateNewId();
        zzcjkVar.maybeThrowUninitializedError();
        this.formatId = (String) zzcjkVar.zza;
        zzcjkVar.maybeThrowUninitializedError();
        this.output = extractorOutput.track(zzcjkVar.zze, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished(boolean z) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetStarted(int i, long j) {
        this.timeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.state = 0;
        this.frameBytesRead = 0;
        this.lastByteWasFF = false;
        this.timeUs = -9223372036854775807L;
    }
}
