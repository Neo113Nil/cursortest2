package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.paging.PagingConfig;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import java.util.Objects;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class Ac3Reader implements ElementaryStreamReader {
    public final /* synthetic */ int $r8$classId;
    public int bytesRead;
    public final String containerMimeType;

    /* renamed from: format, reason: collision with root package name */
    public Format f895format;
    public String formatId;
    public final VorbisBitArray headerScratchBits;
    public final ParsableByteArray headerScratchBytes;
    public final String language;
    public boolean lastByteWas0B;
    public TrackOutput output;
    public final int roleFlags;
    public long sampleDurationUs;
    public int sampleSize;
    public int state;
    public long timeUs;

    public Ac3Reader(String str, int i, String str2, int i2) {
        this.$r8$classId = i2;
        switch (i2) {
            case 1:
                VorbisBitArray vorbisBitArray = new VorbisBitArray(new byte[16], 16);
                this.headerScratchBits = vorbisBitArray;
                this.headerScratchBytes = new ParsableByteArray(vorbisBitArray.data);
                this.state = 0;
                this.bytesRead = 0;
                this.lastByteWas0B = false;
                this.timeUs = -9223372036854775807L;
                this.language = str;
                this.roleFlags = i;
                this.containerMimeType = str2;
                break;
            default:
                VorbisBitArray vorbisBitArray2 = new VorbisBitArray(new byte[128], 128);
                this.headerScratchBits = vorbisBitArray2;
                this.headerScratchBytes = new ParsableByteArray(vorbisBitArray2.data);
                this.state = 0;
                this.timeUs = -9223372036854775807L;
                this.language = str;
                this.roleFlags = i;
                this.containerMimeType = str2;
                break;
        }
    }

    private final void packetFinished$androidx$media3$extractor$ts$Ac3Reader(boolean z) {
    }

    private final void packetFinished$androidx$media3$extractor$ts$Ac4Reader(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ec  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void consume(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int i19 = this.$r8$classId;
        int i20 = this.roleFlags;
        String str2 = this.language;
        String str3 = this.containerMimeType;
        VorbisBitArray vorbisBitArray = this.headerScratchBits;
        long j2 = -9223372036854775807L;
        int i21 = 0;
        int i22 = 1;
        int i23 = 2;
        ParsableByteArray parsableByteArray3 = this.headerScratchBytes;
        int i24 = 16;
        switch (i19) {
            case 0:
                this.output.getClass();
                while (parsableByteArray2.bytesLeft() > 0) {
                    int i25 = this.state;
                    if (i25 == 0) {
                        while (true) {
                            if (parsableByteArray.bytesLeft() <= 0) {
                                parsableByteArray2 = parsableByteArray;
                                i21 = 0;
                                i22 = 1;
                                i23 = 2;
                            } else if (this.lastByteWas0B) {
                                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                                if (readUnsignedByte == 119) {
                                    this.lastByteWas0B = false;
                                    i22 = 1;
                                    this.state = 1;
                                    byte[] bArr = parsableByteArray3.data;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.bytesRead = 2;
                                    parsableByteArray2 = parsableByteArray;
                                    i23 = 2;
                                    i21 = 0;
                                } else {
                                    this.lastByteWas0B = readUnsignedByte == 11;
                                }
                            } else {
                                this.lastByteWas0B = parsableByteArray.readUnsignedByte() == 11;
                            }
                        }
                    } else if (i25 == i22) {
                        byte[] bArr2 = parsableByteArray3.data;
                        int min = Math.min(parsableByteArray2.bytesLeft(), 128 - this.bytesRead);
                        parsableByteArray2.readBytes(this.bytesRead, min, bArr2);
                        int i26 = this.bytesRead + min;
                        this.bytesRead = i26;
                        if (i26 == 128) {
                            vorbisBitArray.setPosition(i21);
                            int[] iArr = AacUtil.CHANNEL_COUNT_BY_ACMOD;
                            int[] iArr2 = AacUtil.SAMPLE_RATE_BY_FSCOD;
                            int position = vorbisBitArray.getPosition();
                            vorbisBitArray.skipBits(40);
                            int i27 = vorbisBitArray.readBits(5) > 10 ? i22 : 0;
                            vorbisBitArray.setPosition(position);
                            if (i27 != 0) {
                                vorbisBitArray.skipBits(i24);
                                int readBits = vorbisBitArray.readBits(i23);
                                int i28 = readBits != 0 ? readBits != i22 ? readBits != i23 ? -1 : i23 : i22 : 0;
                                vorbisBitArray.skipBits(3);
                                i5 = (vorbisBitArray.readBits(11) + i22) * i23;
                                int readBits2 = vorbisBitArray.readBits(i23);
                                if (readBits2 == 3) {
                                    i6 = AacUtil.SAMPLE_RATE_BY_FSCOD2[vorbisBitArray.readBits(i23)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int readBits3 = vorbisBitArray.readBits(i23);
                                    int i29 = AacUtil.BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[readBits3];
                                    i6 = iArr2[readBits2];
                                    i7 = readBits3;
                                    i8 = i29;
                                }
                                i4 = i8 * 256;
                                int i30 = (i5 * i6) / (i8 * 32);
                                int readBits4 = vorbisBitArray.readBits(3);
                                boolean readBit = vorbisBitArray.readBit();
                                int i31 = iArr[readBits4] + (readBit ? 1 : 0);
                                vorbisBitArray.skipBits(10);
                                if (vorbisBitArray.readBit()) {
                                    vorbisBitArray.skipBits(8);
                                }
                                if (readBits4 == 0) {
                                    vorbisBitArray.skipBits(5);
                                    if (vorbisBitArray.readBit()) {
                                        vorbisBitArray.skipBits(8);
                                    }
                                }
                                if (i28 == 1 && vorbisBitArray.readBit()) {
                                    vorbisBitArray.skipBits(16);
                                }
                                if (vorbisBitArray.readBit()) {
                                    if (readBits4 > 2) {
                                        vorbisBitArray.skipBits(2);
                                    }
                                    if ((readBits4 & 1) == 0 || readBits4 <= 2) {
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        vorbisBitArray.skipBits(6);
                                    }
                                    if ((readBits4 & 4) != 0) {
                                        vorbisBitArray.skipBits(i14);
                                    }
                                    if (readBit && vorbisBitArray.readBit()) {
                                        vorbisBitArray.skipBits(5);
                                    }
                                    if (i28 == 0) {
                                        if (vorbisBitArray.readBit()) {
                                            i15 = 6;
                                            vorbisBitArray.skipBits(6);
                                        } else {
                                            i15 = 6;
                                        }
                                        if (readBits4 == 0 && vorbisBitArray.readBit()) {
                                            vorbisBitArray.skipBits(i15);
                                        }
                                        if (vorbisBitArray.readBit()) {
                                            vorbisBitArray.skipBits(i15);
                                        }
                                        i9 = i31;
                                        int readBits5 = vorbisBitArray.readBits(2);
                                        if (readBits5 == 1) {
                                            vorbisBitArray.skipBits(5);
                                        } else if (readBits5 == 2) {
                                            vorbisBitArray.skipBits(12);
                                        } else if (readBits5 == 3) {
                                            int readBits6 = vorbisBitArray.readBits(5);
                                            if (vorbisBitArray.readBit()) {
                                                vorbisBitArray.skipBits(5);
                                                if (vorbisBitArray.readBit()) {
                                                    i17 = 4;
                                                    vorbisBitArray.skipBits(4);
                                                } else {
                                                    i17 = 4;
                                                }
                                                if (vorbisBitArray.readBit()) {
                                                    vorbisBitArray.skipBits(i17);
                                                }
                                                if (vorbisBitArray.readBit()) {
                                                    vorbisBitArray.skipBits(i17);
                                                }
                                                if (vorbisBitArray.readBit()) {
                                                    vorbisBitArray.skipBits(i17);
                                                }
                                                if (vorbisBitArray.readBit()) {
                                                    vorbisBitArray.skipBits(i17);
                                                }
                                                if (vorbisBitArray.readBit()) {
                                                    vorbisBitArray.skipBits(i17);
                                                }
                                                if (vorbisBitArray.readBit()) {
                                                    vorbisBitArray.skipBits(i17);
                                                }
                                                if (vorbisBitArray.readBit()) {
                                                    if (vorbisBitArray.readBit()) {
                                                        vorbisBitArray.skipBits(i17);
                                                    }
                                                    if (vorbisBitArray.readBit()) {
                                                        vorbisBitArray.skipBits(i17);
                                                    }
                                                }
                                            }
                                            if (vorbisBitArray.readBit()) {
                                                vorbisBitArray.skipBits(5);
                                                if (vorbisBitArray.readBit()) {
                                                    vorbisBitArray.skipBits(7);
                                                    if (vorbisBitArray.readBit()) {
                                                        vorbisBitArray.skipBits(8);
                                                        i16 = 2;
                                                        vorbisBitArray.skipBits((readBits6 + i16) * 8);
                                                        vorbisBitArray.byteAlign();
                                                        if (readBits4 < i16) {
                                                            if (vorbisBitArray.readBit()) {
                                                                vorbisBitArray.skipBits(14);
                                                            }
                                                            if (readBits4 == 0 && vorbisBitArray.readBit()) {
                                                                vorbisBitArray.skipBits(14);
                                                            }
                                                        }
                                                        i10 = i7;
                                                        if (vorbisBitArray.readBit()) {
                                                            if (i10 == 0) {
                                                                vorbisBitArray.skipBits(5);
                                                            } else {
                                                                int i32 = 0;
                                                                while (i32 < i8) {
                                                                    if (vorbisBitArray.readBit()) {
                                                                        i18 = i32;
                                                                        vorbisBitArray.skipBits(5);
                                                                    } else {
                                                                        i18 = i32;
                                                                    }
                                                                    i32 = i18 + 1;
                                                                }
                                                            }
                                                        }
                                                        if (vorbisBitArray.readBit()) {
                                                            i11 = 3;
                                                        } else {
                                                            vorbisBitArray.skipBits(5);
                                                            if (readBits4 == 2) {
                                                                vorbisBitArray.skipBits(4);
                                                            }
                                                            if (readBits4 >= 6) {
                                                                vorbisBitArray.skipBits(2);
                                                            }
                                                            if (vorbisBitArray.readBit()) {
                                                                i13 = 8;
                                                                vorbisBitArray.skipBits(8);
                                                            } else {
                                                                i13 = 8;
                                                            }
                                                            if (readBits4 == 0 && vorbisBitArray.readBit()) {
                                                                vorbisBitArray.skipBits(i13);
                                                            }
                                                            i11 = 3;
                                                            if (readBits2 < 3) {
                                                                vorbisBitArray.skipBit();
                                                            }
                                                        }
                                                        if (i28 == 0 && i10 != i11) {
                                                            vorbisBitArray.skipBit();
                                                        }
                                                        if (i28 == 2 || !(i10 == i11 || vorbisBitArray.readBit())) {
                                                            i12 = 6;
                                                        } else {
                                                            i12 = 6;
                                                            vorbisBitArray.skipBits(6);
                                                        }
                                                        str = (!vorbisBitArray.readBit() && vorbisBitArray.readBits(i12) == 1 && vorbisBitArray.readBits(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                        i = i30;
                                                        i3 = i9;
                                                    }
                                                }
                                            }
                                            i16 = 2;
                                            vorbisBitArray.skipBits((readBits6 + i16) * 8);
                                            vorbisBitArray.byteAlign();
                                            if (readBits4 < i16) {
                                            }
                                            i10 = i7;
                                            if (vorbisBitArray.readBit()) {
                                            }
                                            if (vorbisBitArray.readBit()) {
                                            }
                                            if (i28 == 0) {
                                                vorbisBitArray.skipBit();
                                            }
                                            if (i28 == 2) {
                                            }
                                            i12 = 6;
                                            if (!vorbisBitArray.readBit()) {
                                            }
                                            i = i30;
                                            i3 = i9;
                                        }
                                        i16 = 2;
                                        if (readBits4 < i16) {
                                        }
                                        i10 = i7;
                                        if (vorbisBitArray.readBit()) {
                                        }
                                        if (vorbisBitArray.readBit()) {
                                        }
                                        if (i28 == 0) {
                                        }
                                        if (i28 == 2) {
                                        }
                                        i12 = 6;
                                        if (!vorbisBitArray.readBit()) {
                                        }
                                        i = i30;
                                        i3 = i9;
                                    }
                                }
                                i9 = i31;
                                i10 = i7;
                                if (vorbisBitArray.readBit()) {
                                }
                                if (i28 == 0) {
                                }
                                if (i28 == 2) {
                                }
                                i12 = 6;
                                if (!vorbisBitArray.readBit()) {
                                }
                                i = i30;
                                i3 = i9;
                            } else {
                                vorbisBitArray.skipBits(32);
                                int readBits7 = vorbisBitArray.readBits(2);
                                String str4 = readBits7 == 3 ? null : "audio/ac3";
                                int readBits8 = vorbisBitArray.readBits(6);
                                i = AacUtil.BITRATE_BY_HALF_FRMSIZECOD[readBits8 / 2] * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                                int ac3SyncframeSize = AacUtil.getAc3SyncframeSize(readBits7, readBits8);
                                vorbisBitArray.skipBits(8);
                                int readBits9 = vorbisBitArray.readBits(3);
                                if ((readBits9 & 1) == 0 || readBits9 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    vorbisBitArray.skipBits(2);
                                }
                                if ((readBits9 & 4) != 0) {
                                    vorbisBitArray.skipBits(i2);
                                }
                                if (readBits9 == i2) {
                                    vorbisBitArray.skipBits(i2);
                                }
                                int i33 = readBits7 < 3 ? iArr2[readBits7] : -1;
                                i3 = iArr[readBits9] + (vorbisBitArray.readBit() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                i5 = ac3SyncframeSize;
                                i6 = i33;
                            }
                            Format format2 = this.f895format;
                            if (format2 == null || i3 != format2.channelCount || i6 != format2.sampleRate || !Objects.equals(str, format2.sampleMimeType)) {
                                Format.Builder builder = new Format.Builder();
                                builder.id = this.formatId;
                                builder.containerMimeType = MimeTypes.normalizeMimeType(str3);
                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
                                builder.channelCount = i3;
                                builder.sampleRate = i6;
                                builder.language = str2;
                                builder.roleFlags = i20;
                                builder.peakBitrate = i;
                                if ("audio/ac3".equals(str)) {
                                    builder.averageBitrate = i;
                                }
                                Format format3 = new Format(builder);
                                this.f895format = format3;
                                this.output.format(format3);
                            }
                            this.sampleSize = i5;
                            this.sampleDurationUs = (i4 * 1000000) / this.f895format.sampleRate;
                            parsableByteArray3.setPosition(0);
                            this.output.sampleData(128, parsableByteArray3);
                            this.state = 2;
                            parsableByteArray2 = parsableByteArray;
                            i23 = 2;
                            i21 = 0;
                            i22 = 1;
                        } else {
                            parsableByteArray2 = parsableByteArray;
                        }
                    } else if (i25 == i23) {
                        int min2 = Math.min(parsableByteArray2.bytesLeft(), this.sampleSize - this.bytesRead);
                        this.output.sampleData(min2, parsableByteArray2);
                        int i34 = this.bytesRead + min2;
                        this.bytesRead = i34;
                        if (i34 == this.sampleSize) {
                            Trace.checkState(this.timeUs != -9223372036854775807L ? i22 : i21);
                            this.output.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            this.state = i21;
                        }
                    }
                    i24 = 16;
                }
                break;
            default:
                this.output.getClass();
                while (parsableByteArray2.bytesLeft() > 0) {
                    int i35 = this.state;
                    if (i35 == 0) {
                        j = j2;
                        while (parsableByteArray2.bytesLeft() > 0) {
                            if (this.lastByteWas0B) {
                                int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
                                this.lastByteWas0B = readUnsignedByte2 == 172;
                                if (readUnsignedByte2 == 64 || readUnsignedByte2 == 65) {
                                    Object[] objArr = readUnsignedByte2 == 65;
                                    this.state = 1;
                                    byte[] bArr3 = parsableByteArray3.data;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.bytesRead = 2;
                                }
                            } else {
                                this.lastByteWas0B = parsableByteArray2.readUnsignedByte() == 172;
                            }
                        }
                    } else if (i35 == 1) {
                        j = j2;
                        byte[] bArr4 = parsableByteArray3.data;
                        int min3 = Math.min(parsableByteArray2.bytesLeft(), 16 - this.bytesRead);
                        parsableByteArray2.readBytes(this.bytesRead, min3, bArr4);
                        int i36 = this.bytesRead + min3;
                        this.bytesRead = i36;
                        if (i36 == 16) {
                            vorbisBitArray.setPosition(0);
                            PagingConfig parseAc4SyncframeInfo = AacUtil.parseAc4SyncframeInfo(vorbisBitArray);
                            int i37 = parseAc4SyncframeInfo.pageSize;
                            Format format4 = this.f895format;
                            if (format4 == null || 2 != format4.channelCount || i37 != format4.sampleRate || !"audio/ac4".equals(format4.sampleMimeType)) {
                                Format.Builder builder2 = new Format.Builder();
                                builder2.id = this.formatId;
                                builder2.containerMimeType = MimeTypes.normalizeMimeType(str3);
                                builder2.sampleMimeType = MimeTypes.normalizeMimeType("audio/ac4");
                                builder2.channelCount = 2;
                                builder2.sampleRate = i37;
                                builder2.language = str2;
                                builder2.roleFlags = i20;
                                Format format5 = new Format(builder2);
                                this.f895format = format5;
                                this.output.format(format5);
                            }
                            this.sampleSize = parseAc4SyncframeInfo.prefetchDistance;
                            this.sampleDurationUs = (parseAc4SyncframeInfo.initialLoadSize * 1000000) / this.f895format.sampleRate;
                            parsableByteArray3.setPosition(0);
                            this.output.sampleData(16, parsableByteArray3);
                            this.state = 2;
                        }
                    } else if (i35 == 2) {
                        int min4 = Math.min(parsableByteArray2.bytesLeft(), this.sampleSize - this.bytesRead);
                        this.output.sampleData(min4, parsableByteArray2);
                        int i38 = this.bytesRead + min4;
                        this.bytesRead = i38;
                        if (i38 == this.sampleSize) {
                            Trace.checkState(this.timeUs != j2);
                            j = j2;
                            this.output.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            this.state = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        switch (this.$r8$classId) {
            case 0:
                zzcjkVar.generateNewId();
                zzcjkVar.maybeThrowUninitializedError();
                this.formatId = (String) zzcjkVar.zza;
                zzcjkVar.maybeThrowUninitializedError();
                this.output = extractorOutput.track(zzcjkVar.zze, 1);
                break;
            default:
                zzcjkVar.generateNewId();
                zzcjkVar.maybeThrowUninitializedError();
                this.formatId = (String) zzcjkVar.zza;
                zzcjkVar.maybeThrowUninitializedError();
                this.output = extractorOutput.track(zzcjkVar.zze, 1);
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished(boolean z) {
        int i = this.$r8$classId;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetStarted(int i, long j) {
        switch (this.$r8$classId) {
            case 0:
                this.timeUs = j;
                break;
            default:
                this.timeUs = j;
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        switch (this.$r8$classId) {
            case 0:
                this.state = 0;
                this.bytesRead = 0;
                this.lastByteWas0B = false;
                this.timeUs = -9223372036854775807L;
                break;
            default:
                this.state = 0;
                this.bytesRead = 0;
                this.lastByteWas0B = false;
                this.timeUs = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ac3Reader(String str) {
        this(null, 0, str, 0);
        this.$r8$classId = 0;
    }
}
