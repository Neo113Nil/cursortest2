package androidx.media3.extractor.heif;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import net.idrnd.misnap.iad.IadFrame;
import okhttp3.internal.http1.HeadersReader;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class HeicMotionPhotoExtractor implements Extractor {
    public int atomHeaderBytesRead;
    public long atomSize;
    public int atomType;
    public ExtractorOutput extractorOutput;
    public ExtractorInput lastExtractorInput;
    public Mp4Extractor mp4Extractor;
    public HeadersReader mp4ExtractorStartOffsetExtractorInput;
    public final ParsableByteArray scratch = new ParsableByteArray(16);
    public long mp4StartPosition = -1;
    public int state = 0;

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        while (true) {
            int i = this.state;
            if (i == 0) {
                int i2 = this.atomHeaderBytesRead;
                ParsableByteArray parsableByteArray = this.scratch;
                if (i2 == 0) {
                    if (!extractorInput.readFully(parsableByteArray.data, 0, 8, true)) {
                        ExtractorOutput extractorOutput = this.extractorOutput;
                        extractorOutput.getClass();
                        extractorOutput.endTracks();
                        this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
                        this.state = 4;
                        return -1;
                    }
                    this.atomHeaderBytesRead = 8;
                    parsableByteArray.setPosition(0);
                    this.atomSize = parsableByteArray.readUnsignedInt();
                    this.atomType = parsableByteArray.readInt();
                }
                if (this.atomSize == 1) {
                    extractorInput.readFully(parsableByteArray.data, 8, 8);
                    this.atomHeaderBytesRead += 8;
                    this.atomSize = parsableByteArray.readUnsignedLongToLong();
                }
                if (this.atomType == 1836086884) {
                    long position = extractorInput.getPosition();
                    this.mp4StartPosition = position;
                    long j = this.atomHeaderBytesRead;
                    MotionPhotoMetadata motionPhotoMetadata = new MotionPhotoMetadata(0L, position - j, -9223372036854775807L, position, this.atomSize - j);
                    ExtractorOutput extractorOutput2 = this.extractorOutput;
                    extractorOutput2.getClass();
                    TrackOutput track = extractorOutput2.track(1024, 4);
                    Format.Builder builder = new Format.Builder();
                    builder.containerMimeType = MimeTypes.normalizeMimeType("image/heic");
                    builder.metadata = new Metadata(motionPhotoMetadata);
                    NavAction$$ExternalSyntheticOutline0.m(builder, track);
                    this.state = 2;
                } else {
                    this.state = 1;
                }
            } else if (i == 1) {
                extractorInput.skipFully((int) (this.atomSize - this.atomHeaderBytesRead));
                this.atomHeaderBytesRead = 0;
                this.state = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        Path$$ExternalSyntheticBUOutline0.m();
                        return 0;
                    }
                    if (this.mp4ExtractorStartOffsetExtractorInput == null || extractorInput != this.lastExtractorInput) {
                        this.lastExtractorInput = extractorInput;
                        this.mp4ExtractorStartOffsetExtractorInput = new HeadersReader(extractorInput, this.mp4StartPosition);
                    }
                    Mp4Extractor mp4Extractor = this.mp4Extractor;
                    mp4Extractor.getClass();
                    int read = mp4Extractor.read(this.mp4ExtractorStartOffsetExtractorInput, iadFrame);
                    if (read == 1) {
                        iadFrame.b += this.mp4StartPosition;
                    }
                    return read;
                }
                if (this.mp4Extractor == null) {
                    this.mp4Extractor = new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 8);
                }
                HeadersReader headersReader = new HeadersReader(extractorInput, this.mp4StartPosition);
                this.mp4ExtractorStartOffsetExtractorInput = headersReader;
                if (this.mp4Extractor.sniff(headersReader)) {
                    Mp4Extractor mp4Extractor2 = this.mp4Extractor;
                    long j2 = this.mp4StartPosition;
                    ExtractorOutput extractorOutput3 = this.extractorOutput;
                    extractorOutput3.getClass();
                    mp4Extractor2.init(new HeadersReader(j2, extractorOutput3, 4));
                    this.state = 3;
                } else {
                    ExtractorOutput extractorOutput4 = this.extractorOutput;
                    extractorOutput4.getClass();
                    extractorOutput4.endTracks();
                    this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
                    this.state = 4;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
            this.mp4Extractor = null;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j != 0) {
            if (this.state == 3) {
                Mp4Extractor mp4Extractor = this.mp4Extractor;
                mp4Extractor.getClass();
                mp4Extractor.seek(j, j2);
                return;
            }
            return;
        }
        this.state = 0;
        this.atomHeaderBytesRead = 0;
        this.mp4StartPosition = -1L;
        if (this.mp4Extractor != null) {
            this.mp4Extractor = null;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return HeifSniffer.sniff((DefaultExtractorInput) extractorInput, true);
    }
}
