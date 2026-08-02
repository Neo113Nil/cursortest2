package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import java.util.Collections;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LatmReader implements ElementaryStreamReader {
    public int audioMuxVersionA;
    public int bytesRead;
    public int channelCount;
    public String codecs;

    /* renamed from: format, reason: collision with root package name */
    public Format f897format;
    public String formatId;
    public int frameLengthType;
    public final String language;
    public int numSubframes;
    public long otherDataLenBits;
    public boolean otherDataPresent;
    public TrackOutput output;
    public final int roleFlags;
    public final VorbisBitArray sampleBitArray;
    public final ParsableByteArray sampleDataBuffer;
    public long sampleDurationUs;
    public int sampleRateHz;
    public int sampleSize;
    public int secondHeaderByte;
    public int state;
    public boolean streamMuxRead;
    public long timeUs;

    public LatmReader(String str, int i) {
        this.language = str;
        this.roleFlags = i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.sampleDataBuffer = parsableByteArray;
        byte[] bArr = parsableByteArray.data;
        this.sampleBitArray = new VorbisBitArray(bArr, bArr.length);
        this.timeUs = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
    
        if (r23.streamMuxRead == false) goto L89;
     */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void consume(ParsableByteArray parsableByteArray) {
        int readBits;
        boolean readBit;
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    ParsableByteArray parsableByteArray2 = this.sampleDataBuffer;
                    VorbisBitArray vorbisBitArray = this.sampleBitArray;
                    if (i == 2) {
                        int readUnsignedByte = ((this.secondHeaderByte & (-225)) << 8) | parsableByteArray.readUnsignedByte();
                        this.sampleSize = readUnsignedByte;
                        if (readUnsignedByte > parsableByteArray2.data.length) {
                            parsableByteArray2.reset(readUnsignedByte);
                            byte[] bArr = parsableByteArray2.data;
                            vorbisBitArray.getClass();
                            vorbisBitArray.reset(bArr.length, bArr);
                        }
                        this.bytesRead = 0;
                        this.state = 3;
                    } else {
                        if (i != 3) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return;
                        }
                        int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                        parsableByteArray.readBytes(this.bytesRead, min, vorbisBitArray.data);
                        int i2 = this.bytesRead + min;
                        this.bytesRead = i2;
                        if (i2 == this.sampleSize) {
                            vorbisBitArray.setPosition(0);
                            if (!vorbisBitArray.readBit()) {
                                this.streamMuxRead = true;
                                int readBits2 = vorbisBitArray.readBits(1);
                                int readBits3 = readBits2 == 1 ? vorbisBitArray.readBits(1) : 0;
                                this.audioMuxVersionA = readBits3;
                                if (readBits3 != 0) {
                                    throw ParserException.createForMalformedContainer(null, null);
                                }
                                if (readBits2 == 1) {
                                    vorbisBitArray.readBits((vorbisBitArray.readBits(2) + 1) * 8);
                                }
                                if (!vorbisBitArray.readBit()) {
                                    throw ParserException.createForMalformedContainer(null, null);
                                }
                                this.numSubframes = vorbisBitArray.readBits(6);
                                int readBits4 = vorbisBitArray.readBits(4);
                                int readBits5 = vorbisBitArray.readBits(3);
                                if (readBits4 != 0 || readBits5 != 0) {
                                    throw ParserException.createForMalformedContainer(null, null);
                                }
                                if (readBits2 == 0) {
                                    int position = vorbisBitArray.getPosition();
                                    int bitsLeft = vorbisBitArray.bitsLeft();
                                    AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(vorbisBitArray, true);
                                    this.codecs = parseAudioSpecificConfig.codecs;
                                    this.sampleRateHz = parseAudioSpecificConfig.sampleRateHz;
                                    this.channelCount = parseAudioSpecificConfig.channelCount;
                                    int bitsLeft2 = bitsLeft - vorbisBitArray.bitsLeft();
                                    vorbisBitArray.setPosition(position);
                                    byte[] bArr2 = new byte[(bitsLeft2 + 7) / 8];
                                    vorbisBitArray.readBits(bitsLeft2, bArr2);
                                    Format.Builder builder = new Format.Builder();
                                    builder.id = this.formatId;
                                    builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                                    builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/mp4a-latm");
                                    builder.codecs = this.codecs;
                                    builder.channelCount = this.channelCount;
                                    builder.sampleRate = this.sampleRateHz;
                                    builder.initializationData = Collections.singletonList(bArr2);
                                    builder.language = this.language;
                                    builder.roleFlags = this.roleFlags;
                                    Format format2 = new Format(builder);
                                    if (!format2.equals(this.f897format)) {
                                        this.f897format = format2;
                                        this.sampleDurationUs = 1024000000 / format2.sampleRate;
                                        this.output.format(format2);
                                    }
                                } else {
                                    int bitsLeft3 = vorbisBitArray.bitsLeft();
                                    AacUtil.Config parseAudioSpecificConfig2 = AacUtil.parseAudioSpecificConfig(vorbisBitArray, true);
                                    this.codecs = parseAudioSpecificConfig2.codecs;
                                    this.sampleRateHz = parseAudioSpecificConfig2.sampleRateHz;
                                    this.channelCount = parseAudioSpecificConfig2.channelCount;
                                    vorbisBitArray.skipBits(vorbisBitArray.readBits((vorbisBitArray.readBits(2) + 1) * 8) - (bitsLeft3 - vorbisBitArray.bitsLeft()));
                                }
                                int readBits6 = vorbisBitArray.readBits(3);
                                this.frameLengthType = readBits6;
                                if (readBits6 == 0) {
                                    vorbisBitArray.skipBits(8);
                                } else if (readBits6 == 1) {
                                    vorbisBitArray.skipBits(9);
                                } else if (readBits6 == 3 || readBits6 == 4 || readBits6 == 5) {
                                    vorbisBitArray.skipBits(6);
                                } else {
                                    if (readBits6 != 6 && readBits6 != 7) {
                                        Path$$ExternalSyntheticBUOutline0.m();
                                        return;
                                    }
                                    vorbisBitArray.skipBits(1);
                                }
                                boolean readBit2 = vorbisBitArray.readBit();
                                this.otherDataPresent = readBit2;
                                this.otherDataLenBits = 0L;
                                if (readBit2) {
                                    if (readBits2 == 1) {
                                        this.otherDataLenBits = vorbisBitArray.readBits((vorbisBitArray.readBits(2) + 1) * 8);
                                    } else {
                                        do {
                                            readBit = vorbisBitArray.readBit();
                                            this.otherDataLenBits = (this.otherDataLenBits << 8) + vorbisBitArray.readBits(8);
                                        } while (readBit);
                                    }
                                }
                                if (vorbisBitArray.readBit()) {
                                    vorbisBitArray.skipBits(8);
                                }
                            }
                            if (this.audioMuxVersionA != 0) {
                                throw ParserException.createForMalformedContainer(null, null);
                            }
                            if (this.numSubframes != 0) {
                                throw ParserException.createForMalformedContainer(null, null);
                            }
                            if (this.frameLengthType != 0) {
                                throw ParserException.createForMalformedContainer(null, null);
                            }
                            int i3 = 0;
                            do {
                                readBits = vorbisBitArray.readBits(8);
                                i3 += readBits;
                            } while (readBits == 255);
                            int position2 = vorbisBitArray.getPosition();
                            if ((position2 & 7) == 0) {
                                parsableByteArray2.setPosition(position2 >> 3);
                            } else {
                                vorbisBitArray.readBits(i3 * 8, parsableByteArray2.data);
                                parsableByteArray2.setPosition(0);
                            }
                            this.output.sampleData(i3, parsableByteArray2);
                            Trace.checkState(this.timeUs != -9223372036854775807L);
                            this.output.sampleMetadata(this.timeUs, 1, i3, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            if (this.otherDataPresent) {
                                vorbisBitArray.skipBits((int) this.otherDataLenBits);
                            }
                            this.state = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if ((readUnsignedByte2 & 224) == 224) {
                        this.secondHeaderByte = readUnsignedByte2;
                        this.state = 2;
                    } else if (readUnsignedByte2 != 86) {
                        this.state = 0;
                    }
                }
            } else if (parsableByteArray.readUnsignedByte() == 86) {
                this.state = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        zzcjkVar.generateNewId();
        zzcjkVar.maybeThrowUninitializedError();
        this.output = extractorOutput.track(zzcjkVar.zze, 1);
        zzcjkVar.maybeThrowUninitializedError();
        this.formatId = (String) zzcjkVar.zza;
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
        this.timeUs = -9223372036854775807L;
        this.streamMuxRead = false;
    }
}
