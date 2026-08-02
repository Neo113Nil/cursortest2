package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import com.plaid.internal.EnumC0170g;
import java.util.Arrays;
import java.util.Collections;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes3.dex */
public final class AdtsReader implements ElementaryStreamReader {
    public static final byte[] ID3_IDENTIFIER = {73, 68, PnmConstants.PPM_TEXT_CODE};
    public final String containerMimeType;
    public int currentFrameVersion;
    public TrackOutput currentOutput;
    public long currentSampleDuration;
    public final boolean exposeId3;
    public String formatId;
    public boolean foundFirstFrame;
    public boolean hasCrc;
    public boolean hasOutputFormat;
    public TrackOutput id3Output;
    public final String language;
    public TrackOutput output;
    public final int roleFlags;
    public int sampleSize;
    public final VorbisBitArray adtsScratch = new VorbisBitArray(new byte[7], 7);
    public final ParsableByteArray id3HeaderBuffer = new ParsableByteArray(Arrays.copyOf(ID3_IDENTIFIER, 10));
    public int firstFrameVersion = -1;
    public int firstFrameSampleRateIndex = -1;
    public long sampleDurationUs = -9223372036854775807L;
    public long timeUs = -9223372036854775807L;
    public int state = 0;
    public int bytesRead = 0;
    public int matchState = 256;

    public AdtsReader(String str, String str2, int i, boolean z) {
        this.exposeId3 = z;
        this.language = str;
        this.roleFlags = i;
        this.containerMimeType = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        byte b;
        char c;
        ?? r4;
        int i3;
        char c2;
        int i4;
        char c3;
        int i5;
        this.output.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        while (parsableByteArray.bytesLeft() > 0) {
            int i6 = this.state;
            char c4 = 65535;
            ParsableByteArray parsableByteArray2 = this.id3HeaderBuffer;
            int i7 = 3;
            VorbisBitArray vorbisBitArray = this.adtsScratch;
            int i8 = 0;
            int i9 = 4;
            int i10 = 1;
            if (i6 == 0) {
                byte[] bArr = parsableByteArray.data;
                int i11 = parsableByteArray.position;
                int i12 = parsableByteArray.limit;
                while (true) {
                    if (i11 >= i12) {
                        parsableByteArray.setPosition(i11);
                        break;
                    }
                    i = i11 + 1;
                    i2 = i7;
                    b = bArr[i11];
                    int i13 = b & 255;
                    if (this.matchState != 512 || (((65280 | ((((byte) i13) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c = c4;
                        r4 = i10;
                    } else {
                        if (this.foundFirstFrame) {
                            break;
                        }
                        int i14 = i11 - 1;
                        parsableByteArray.setPosition(i11);
                        byte[] bArr2 = vorbisBitArray.data;
                        if (parsableByteArray.bytesLeft() >= i10) {
                            parsableByteArray.readBytes(i8, i10, bArr2);
                            vorbisBitArray.setPosition(i9);
                            int readBits = vorbisBitArray.readBits(i10);
                            int i15 = this.firstFrameVersion;
                            if (i15 == -1 || readBits == i15) {
                                if (this.firstFrameSampleRateIndex != -1) {
                                    byte[] bArr3 = vorbisBitArray.data;
                                    if (parsableByteArray.bytesLeft() < i10) {
                                        break;
                                    }
                                    parsableByteArray.readBytes(i8, i10, bArr3);
                                    vorbisBitArray.setPosition(2);
                                    i5 = 4;
                                    if (vorbisBitArray.readBits(4) == this.firstFrameSampleRateIndex) {
                                        parsableByteArray.setPosition(i);
                                    }
                                } else {
                                    i5 = 4;
                                }
                                byte[] bArr4 = vorbisBitArray.data;
                                if (parsableByteArray.bytesLeft() >= i5) {
                                    parsableByteArray.readBytes(i8, i5, bArr4);
                                    vorbisBitArray.setPosition(14);
                                    int readBits2 = vorbisBitArray.readBits(13);
                                    if (readBits2 >= 7) {
                                        byte[] bArr5 = parsableByteArray.data;
                                        int i16 = parsableByteArray.limit;
                                        int i17 = i14 + readBits2;
                                        if (i17 < i16) {
                                            byte b2 = bArr5[i17];
                                            c = 65535;
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i18 = i17 + 1;
                                                    if (i18 != i16) {
                                                        if (bArr5[i18] == 68) {
                                                            int i19 = i17 + 2;
                                                            if (i19 != i16) {
                                                                if (bArr5[i19] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i20 = i17 + 1;
                                                if (i20 != i16) {
                                                    byte b3 = bArr5[i20];
                                                    if ((((65280 | ((b3 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == readBits) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c = 65535;
                            }
                            r4 = true;
                        }
                        c = 65535;
                        r4 = true;
                    }
                    int i21 = this.matchState;
                    int i22 = i13 | i21;
                    if (i22 == 329) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.matchState = 768;
                    } else if (i22 == 511) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.matchState = 512;
                    } else if (i22 == 836) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.matchState = 1024;
                    } else {
                        if (i22 == 1075) {
                            this.state = 2;
                            this.bytesRead = 3;
                            this.sampleSize = 0;
                            parsableByteArray2.setPosition(0);
                            parsableByteArray.setPosition(i);
                            break;
                        }
                        c2 = 256;
                        if (i21 != 256) {
                            this.matchState = 256;
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                            i10 = r4;
                            c4 = c;
                            i9 = 4;
                            i8 = i4;
                            i7 = i3;
                        } else {
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                        }
                    }
                    i11 = i;
                    i10 = r4;
                    c4 = c;
                    i9 = 4;
                    i8 = i4;
                    i7 = i3;
                }
                this.currentFrameVersion = (b & 8) >> 3;
                this.hasCrc = (b & 1) == 0;
                if (this.foundFirstFrame) {
                    this.state = i2;
                    this.bytesRead = 0;
                } else {
                    this.state = 1;
                    this.bytesRead = 0;
                }
                parsableByteArray.setPosition(i);
            } else if (i6 != 1) {
                if (i6 == 2) {
                    byte[] bArr6 = parsableByteArray2.data;
                    int min = Math.min(parsableByteArray.bytesLeft(), 10 - this.bytesRead);
                    parsableByteArray.readBytes(this.bytesRead, min, bArr6);
                    int i23 = this.bytesRead + min;
                    this.bytesRead = i23;
                    if (i23 == 10) {
                        this.id3Output.sampleData(10, parsableByteArray2);
                        parsableByteArray2.setPosition(6);
                        TrackOutput trackOutput = this.id3Output;
                        int readSynchSafeInt = parsableByteArray2.readSynchSafeInt() + 10;
                        this.state = 4;
                        this.bytesRead = 10;
                        this.currentOutput = trackOutput;
                        this.currentSampleDuration = 0L;
                        this.sampleSize = readSynchSafeInt;
                    }
                } else if (i6 == 3) {
                    int i24 = this.hasCrc ? 7 : 5;
                    byte[] bArr7 = vorbisBitArray.data;
                    int min2 = Math.min(parsableByteArray.bytesLeft(), i24 - this.bytesRead);
                    parsableByteArray.readBytes(this.bytesRead, min2, bArr7);
                    int i25 = this.bytesRead + min2;
                    this.bytesRead = i25;
                    if (i25 == i24) {
                        vorbisBitArray.setPosition(0);
                        if (this.hasOutputFormat) {
                            vorbisBitArray.skipBits(10);
                        } else {
                            int readBits3 = vorbisBitArray.readBits(2) + 1;
                            if (readBits3 != 2) {
                                Log.w("AdtsReader", "Detected audio object type: " + readBits3 + ", but assuming AAC LC.");
                                readBits3 = 2;
                            }
                            vorbisBitArray.skipBits(5);
                            int readBits4 = vorbisBitArray.readBits(3);
                            int i26 = this.firstFrameSampleRateIndex;
                            byte[] bArr8 = {(byte) (((readBits3 << 3) & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) | ((i26 >> 1) & 7)), (byte) (((readBits4 << 3) & 120) | ((i26 << 7) & 128))};
                            AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(new VorbisBitArray(bArr8, 2), false);
                            Format.Builder builder = new Format.Builder();
                            builder.id = this.formatId;
                            builder.containerMimeType = MimeTypes.normalizeMimeType(this.containerMimeType);
                            builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/mp4a-latm");
                            builder.codecs = parseAudioSpecificConfig.codecs;
                            builder.channelCount = parseAudioSpecificConfig.channelCount;
                            builder.sampleRate = parseAudioSpecificConfig.sampleRateHz;
                            builder.initializationData = Collections.singletonList(bArr8);
                            builder.language = this.language;
                            builder.roleFlags = this.roleFlags;
                            Format format2 = new Format(builder);
                            this.sampleDurationUs = 1024000000 / format2.sampleRate;
                            this.output.format(format2);
                            this.hasOutputFormat = true;
                        }
                        vorbisBitArray.skipBits(4);
                        int readBits5 = vorbisBitArray.readBits(13);
                        int i27 = readBits5 - 7;
                        if (this.hasCrc) {
                            i27 = readBits5 - 9;
                        }
                        TrackOutput trackOutput2 = this.output;
                        long j = this.sampleDurationUs;
                        this.state = 4;
                        this.bytesRead = 0;
                        this.currentOutput = trackOutput2;
                        this.currentSampleDuration = j;
                        this.sampleSize = i27;
                    }
                } else {
                    if (i6 != 4) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return;
                    }
                    int min3 = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.currentOutput.sampleData(min3, parsableByteArray);
                    int i28 = this.bytesRead + min3;
                    this.bytesRead = i28;
                    if (i28 == this.sampleSize) {
                        Trace.checkState(this.timeUs != -9223372036854775807L);
                        this.currentOutput.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
                        this.timeUs += this.currentSampleDuration;
                        this.state = 0;
                        this.bytesRead = 0;
                        this.matchState = 256;
                    }
                }
            } else if (parsableByteArray.bytesLeft() != 0) {
                vorbisBitArray.data[0] = parsableByteArray.data[parsableByteArray.position];
                vorbisBitArray.setPosition(2);
                int readBits6 = vorbisBitArray.readBits(4);
                int i29 = this.firstFrameSampleRateIndex;
                if (i29 == -1 || readBits6 == i29) {
                    if (!this.foundFirstFrame) {
                        this.foundFirstFrame = true;
                        this.firstFrameVersion = this.currentFrameVersion;
                        this.firstFrameSampleRateIndex = readBits6;
                    }
                    this.state = 3;
                    this.bytesRead = 0;
                } else {
                    this.foundFirstFrame = false;
                    this.state = 0;
                    this.bytesRead = 0;
                    this.matchState = 256;
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
        TrackOutput track = extractorOutput.track(zzcjkVar.zze, 1);
        this.output = track;
        this.currentOutput = track;
        if (!this.exposeId3) {
            this.id3Output = new DiscardingTrackOutput();
            return;
        }
        zzcjkVar.generateNewId();
        zzcjkVar.maybeThrowUninitializedError();
        TrackOutput track2 = extractorOutput.track(zzcjkVar.zze, 5);
        this.id3Output = track2;
        Format.Builder builder = new Format.Builder();
        zzcjkVar.maybeThrowUninitializedError();
        builder.id = (String) zzcjkVar.zza;
        builder.containerMimeType = MimeTypes.normalizeMimeType(this.containerMimeType);
        builder.sampleMimeType = MimeTypes.normalizeMimeType("application/id3");
        NavAction$$ExternalSyntheticOutline0.m(builder, track2);
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
        this.timeUs = -9223372036854775807L;
        this.foundFirstFrame = false;
        this.state = 0;
        this.bytesRead = 0;
        this.matchState = 256;
    }
}
