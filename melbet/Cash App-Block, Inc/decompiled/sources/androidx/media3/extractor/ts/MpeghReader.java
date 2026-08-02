package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.ts.MpeghUtil;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class MpeghReader implements ElementaryStreamReader {
    public boolean configFound;
    public boolean dataPending;
    public int flags;
    public String formatId;
    public int frameBytes;
    public TrackOutput output;
    public int payloadBytesRead;
    public int syncBytes;
    public int truncationSamples;
    public int state = 0;
    public final ParsableByteArray headerScratchBytes = new ParsableByteArray(new byte[15], 2);
    public final VorbisBitArray headerScratchBits = new VorbisBitArray();
    public final ParsableByteArray dataScratchBytes = new ParsableByteArray();
    public final MpeghUtil.MhasPacketHeader header = new MpeghUtil.MhasPacketHeader();
    public int samplingRate = -2147483647;
    public int standardFrameLength = -1;
    public long mainStreamLabel = -1;
    public boolean rapPending = true;
    public boolean headerDataFinished = true;
    public double timeUs = -9.223372036854776E18d;
    public double timeUsPending = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041d  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void consume(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        long j;
        long j2;
        int i6;
        long j3;
        boolean z;
        int i7;
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            int i8 = this.state;
            int i9 = 8;
            int i10 = 3;
            int i11 = 1;
            if (i8 != 0) {
                ParsableByteArray parsableByteArray2 = this.dataScratchBytes;
                MpeghUtil.MhasPacketHeader mhasPacketHeader = this.header;
                if (i8 == 1) {
                    int bytesLeft = parsableByteArray.bytesLeft();
                    ParsableByteArray parsableByteArray3 = this.headerScratchBytes;
                    int min = Math.min(bytesLeft, parsableByteArray3.bytesLeft());
                    parsableByteArray.readBytes(parsableByteArray3.position, min, parsableByteArray3.data);
                    parsableByteArray3.skipBytes(min);
                    if (parsableByteArray3.bytesLeft() == 0) {
                        int i12 = parsableByteArray3.limit;
                        byte[] bArr2 = parsableByteArray3.data;
                        VorbisBitArray vorbisBitArray = this.headerScratchBits;
                        vorbisBitArray.reset(i12, bArr2);
                        vorbisBitArray.getBytePosition();
                        int readEscapedIntValue = MpeghUtil.readEscapedIntValue(vorbisBitArray, 3, 8, 8);
                        mhasPacketHeader.packetType = readEscapedIntValue;
                        if (readEscapedIntValue != -1) {
                            Trace.checkArgument(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (vorbisBitArray.bitsLeft() >= 2) {
                                long readBitsToLong = vorbisBitArray.readBitsToLong(2);
                                if (readBitsToLong == 3) {
                                    if (vorbisBitArray.bitsLeft() >= 8) {
                                        long readBitsToLong2 = vorbisBitArray.readBitsToLong(8);
                                        readBitsToLong += readBitsToLong2;
                                        if (readBitsToLong2 == 255) {
                                            if (vorbisBitArray.bitsLeft() >= 32) {
                                                readBitsToLong = vorbisBitArray.readBitsToLong(32) + readBitsToLong;
                                            }
                                        }
                                    }
                                }
                                j3 = readBitsToLong;
                                mhasPacketHeader.packetLabel = j3;
                                if (j3 != -1) {
                                    if (j3 > 16) {
                                        throw ParserException.createForUnsupportedContainerFeature("Contains sub-stream with an invalid packet label " + mhasPacketHeader.packetLabel);
                                    }
                                    if (j3 == 0) {
                                        int i13 = mhasPacketHeader.packetType;
                                        if (i13 == 1) {
                                            throw ParserException.createForMalformedContainer(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i13 == 2) {
                                            throw ParserException.createForMalformedContainer(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i13 == 17) {
                                            throw ParserException.createForMalformedContainer(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int readEscapedIntValue2 = MpeghUtil.readEscapedIntValue(vorbisBitArray, 11, 24, 24);
                                    mhasPacketHeader.packetLength = readEscapedIntValue2;
                                    if (readEscapedIntValue2 != -1) {
                                        z = true;
                                        if (z) {
                                            i7 = 0;
                                        } else {
                                            i7 = 0;
                                            this.payloadBytesRead = 0;
                                            this.frameBytes = mhasPacketHeader.packetLength + i12 + this.frameBytes;
                                        }
                                        if (z) {
                                            int i14 = parsableByteArray3.limit;
                                            if (i14 < 15) {
                                                parsableByteArray3.setLimit(i14 + 1);
                                                this.headerDataFinished = false;
                                            }
                                        } else {
                                            parsableByteArray3.setPosition(i7);
                                            this.output.sampleData(parsableByteArray3.limit, parsableByteArray3);
                                            parsableByteArray3.reset(2);
                                            parsableByteArray2.reset(mhasPacketHeader.packetLength);
                                            this.headerDataFinished = true;
                                            this.state = 2;
                                        }
                                    }
                                }
                            }
                            j3 = -1;
                            mhasPacketHeader.packetLabel = j3;
                            if (j3 != -1) {
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (z) {
                        }
                    } else {
                        this.headerDataFinished = false;
                    }
                } else {
                    if (i8 != 2) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return;
                    }
                    int i15 = mhasPacketHeader.packetType;
                    if (i15 == 1 || i15 == 17) {
                        int i16 = parsableByteArray.position;
                        int min2 = Math.min(parsableByteArray.bytesLeft(), parsableByteArray2.bytesLeft());
                        parsableByteArray.readBytes(parsableByteArray2.position, min2, parsableByteArray2.data);
                        parsableByteArray2.skipBytes(min2);
                        parsableByteArray.setPosition(i16);
                    }
                    int min3 = Math.min(parsableByteArray.bytesLeft(), mhasPacketHeader.packetLength - this.payloadBytesRead);
                    this.output.sampleData(min3, parsableByteArray);
                    int i17 = this.payloadBytesRead + min3;
                    this.payloadBytesRead = i17;
                    if (i17 != mhasPacketHeader.packetLength) {
                        continue;
                    } else {
                        int i18 = mhasPacketHeader.packetType;
                        if (i18 == 1) {
                            byte[] bArr3 = parsableByteArray2.data;
                            VorbisBitArray vorbisBitArray2 = new VorbisBitArray(bArr3, bArr3.length);
                            int readBits = vorbisBitArray2.readBits(8);
                            int readBits2 = vorbisBitArray2.readBits(5);
                            if (readBits2 != 31) {
                                switch (readBits2) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = 64000;
                                        break;
                                    case 3:
                                        i4 = 48000;
                                        break;
                                    case 4:
                                        i4 = 44100;
                                        break;
                                    case 5:
                                        i4 = 32000;
                                        break;
                                    case 6:
                                        i4 = 24000;
                                        break;
                                    case 7:
                                        i4 = 22050;
                                        break;
                                    case 8:
                                        i4 = 16000;
                                        break;
                                    case 9:
                                        i4 = 12000;
                                        break;
                                    case 10:
                                        i4 = 11025;
                                        break;
                                    case 11:
                                        i4 = 8000;
                                        break;
                                    case 12:
                                        i4 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate index " + readBits2);
                                    case 15:
                                        i4 = 57600;
                                        break;
                                    case 16:
                                        i4 = 51200;
                                        break;
                                    case 17:
                                        i4 = 40000;
                                        break;
                                    case 18:
                                        i4 = 38400;
                                        break;
                                    case 19:
                                        i4 = 34150;
                                        break;
                                    case 20:
                                        i4 = 28800;
                                        break;
                                    case 21:
                                        i4 = 25600;
                                        break;
                                    case 22:
                                        i4 = 20000;
                                        break;
                                    case 23:
                                        i4 = 19200;
                                        break;
                                    case 24:
                                        i4 = 17075;
                                        break;
                                    case 25:
                                        i4 = 14400;
                                        break;
                                    case 26:
                                        i4 = 12800;
                                        break;
                                    case 27:
                                        i4 = 9600;
                                        break;
                                }
                            } else {
                                i4 = vorbisBitArray2.readBits(24);
                            }
                            int readBits3 = vorbisBitArray2.readBits(3);
                            if (readBits3 == 0) {
                                i5 = 768;
                            } else if (readBits3 == 1) {
                                i5 = 1024;
                            } else if (readBits3 == 2 || readBits3 == 3) {
                                i5 = 2048;
                            } else {
                                if (readBits3 != 4) {
                                    throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + readBits3);
                                }
                                i5 = 4096;
                            }
                            int i19 = i5;
                            if (readBits3 == 0 || readBits3 == 1) {
                                c = 0;
                            } else if (readBits3 == 2) {
                                c = 2;
                            } else if (readBits3 == 3) {
                                c = 3;
                            } else {
                                if (readBits3 != 4) {
                                    throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + readBits3);
                                }
                                c = 1;
                            }
                            vorbisBitArray2.skipBits(2);
                            MpeghUtil.skipSpeakerConfig3d(vorbisBitArray2);
                            int readBits4 = vorbisBitArray2.readBits(5);
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                int i22 = i11;
                                int i23 = 16;
                                if (i20 < readBits4 + 1) {
                                    int readBits5 = vorbisBitArray2.readBits(3);
                                    i21 = MpeghUtil.readEscapedIntValue(vorbisBitArray2, 5, 8, 16) + 1 + i21;
                                    if ((readBits5 == 0 || readBits5 == 2) && vorbisBitArray2.readBit()) {
                                        MpeghUtil.skipSpeakerConfig3d(vorbisBitArray2);
                                    }
                                    i20++;
                                    i11 = i22;
                                } else {
                                    int readEscapedIntValue3 = MpeghUtil.readEscapedIntValue(vorbisBitArray2, 4, 8, 16) + 1;
                                    vorbisBitArray2.skipBit();
                                    int i24 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i24 < readEscapedIntValue3) {
                                            int readBits6 = vorbisBitArray2.readBits(2);
                                            if (readBits6 == 0) {
                                                vorbisBitArray2.skipBits(i10);
                                                if (vorbisBitArray2.readBit()) {
                                                    vorbisBitArray2.skipBits(13);
                                                }
                                                if (c > 0) {
                                                    MpeghUtil.skipSbrConfig(vorbisBitArray2);
                                                }
                                            } else if (readBits6 == i22) {
                                                vorbisBitArray2.skipBits(i10);
                                                boolean readBit = vorbisBitArray2.readBit();
                                                if (readBit) {
                                                    vorbisBitArray2.skipBits(13);
                                                }
                                                if (readBit) {
                                                    vorbisBitArray2.skipBit();
                                                }
                                                if (c > 0) {
                                                    MpeghUtil.skipSbrConfig(vorbisBitArray2);
                                                    i6 = vorbisBitArray2.readBits(2);
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (i6 > 0) {
                                                    vorbisBitArray2.skipBits(6);
                                                    int readBits7 = vorbisBitArray2.readBits(2);
                                                    vorbisBitArray2.skipBits(4);
                                                    if (vorbisBitArray2.readBit()) {
                                                        vorbisBitArray2.skipBits(5);
                                                    }
                                                    if (i6 == 2 || i6 == i10) {
                                                        vorbisBitArray2.skipBits(6);
                                                    }
                                                    if (readBits7 == 2) {
                                                        vorbisBitArray2.skipBit();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i21 - 1) / Math.log(2.0d))) + 1;
                                                int readBits8 = vorbisBitArray2.readBits(2);
                                                if (readBits8 > 0 && vorbisBitArray2.readBit()) {
                                                    vorbisBitArray2.skipBits(floor);
                                                }
                                                if (vorbisBitArray2.readBit()) {
                                                    vorbisBitArray2.skipBits(floor);
                                                }
                                                if (c == 0 && readBits8 == 0) {
                                                    vorbisBitArray2.skipBit();
                                                }
                                            } else if (readBits6 == i10) {
                                                MpeghUtil.readEscapedIntValue(vorbisBitArray2, 4, i9, i23);
                                                int readEscapedIntValue4 = MpeghUtil.readEscapedIntValue(vorbisBitArray2, 4, i9, i23);
                                                if (vorbisBitArray2.readBit()) {
                                                    MpeghUtil.readEscapedIntValue(vorbisBitArray2, i9, i23, 0);
                                                }
                                                vorbisBitArray2.skipBit();
                                                if (readEscapedIntValue4 > 0) {
                                                    vorbisBitArray2.skipBits(readEscapedIntValue4 * 8);
                                                }
                                            }
                                            i24++;
                                            i9 = 8;
                                            i10 = 3;
                                            i23 = 16;
                                            i22 = 1;
                                        } else {
                                            if (vorbisBitArray2.readBit()) {
                                                int i25 = 8;
                                                int readEscapedIntValue5 = MpeghUtil.readEscapedIntValue(vorbisBitArray2, 2, 4, 8) + 1;
                                                int i26 = 0;
                                                bArr = null;
                                                while (i26 < readEscapedIntValue5) {
                                                    int readEscapedIntValue6 = MpeghUtil.readEscapedIntValue(vorbisBitArray2, 4, i25, 16);
                                                    int readEscapedIntValue7 = MpeghUtil.readEscapedIntValue(vorbisBitArray2, 4, i25, 16);
                                                    if (readEscapedIntValue6 == 7) {
                                                        int readBits9 = vorbisBitArray2.readBits(4) + 1;
                                                        vorbisBitArray2.skipBits(4);
                                                        byte[] bArr4 = new byte[readBits9];
                                                        for (int i27 = 0; i27 < readBits9; i27++) {
                                                            bArr4[i27] = (byte) vorbisBitArray2.readBits(i25);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        vorbisBitArray2.skipBits(readEscapedIntValue7 * i25);
                                                    }
                                                    i26++;
                                                    i25 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i4) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.samplingRate = (int) (i4 * d);
                                                    this.standardFrameLength = (int) (i19 * d);
                                                    j = this.mainStreamLabel;
                                                    j2 = mhasPacketHeader.packetLabel;
                                                    if (j != j2) {
                                                        this.mainStreamLabel = j2;
                                                        String concat = readBits != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(readBits))) : "mhm1";
                                                        RegularImmutableList of = (bArr == null || bArr.length <= 0) ? null : ImmutableList.of((Object) Util.EMPTY_BYTE_ARRAY, (Object) bArr);
                                                        Format.Builder builder = new Format.Builder();
                                                        builder.id = this.formatId;
                                                        builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                                                        builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/mhm1");
                                                        builder.sampleRate = this.samplingRate;
                                                        builder.codecs = concat;
                                                        builder.initializationData = of;
                                                        this.output.format(new Format(builder));
                                                    }
                                                    i2 = 1;
                                                    this.configFound = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.samplingRate = (int) (i4 * d);
                                                    this.standardFrameLength = (int) (i19 * d);
                                                    j = this.mainStreamLabel;
                                                    j2 = mhasPacketHeader.packetLabel;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.configFound = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.samplingRate = (int) (i4 * d);
                                                    this.standardFrameLength = (int) (i19 * d);
                                                    j = this.mainStreamLabel;
                                                    j2 = mhasPacketHeader.packetLabel;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.configFound = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.samplingRate = (int) (i4 * d);
                                                    this.standardFrameLength = (int) (i19 * d);
                                                    j = this.mainStreamLabel;
                                                    j2 = mhasPacketHeader.packetLabel;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.configFound = true;
                                                    break;
                                                default:
                                                    throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate " + i4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i18 == 17) {
                                byte[] bArr5 = parsableByteArray2.data;
                                VorbisBitArray vorbisBitArray3 = new VorbisBitArray(bArr5, bArr5.length);
                                if (vorbisBitArray3.readBit()) {
                                    vorbisBitArray3.skipBits(2);
                                    i3 = vorbisBitArray3.readBits(13);
                                } else {
                                    i3 = 0;
                                }
                                this.truncationSamples = i3;
                            } else if (i18 == 2) {
                                if (this.configFound) {
                                    this.rapPending = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = ((this.standardFrameLength - this.truncationSamples) * 1000000.0d) / this.samplingRate;
                                long round = Math.round(this.timeUs);
                                if (this.dataPending) {
                                    this.dataPending = false;
                                    this.timeUs = this.timeUsPending;
                                } else {
                                    this.timeUs += d2;
                                }
                                this.output.sampleMetadata(round, i, this.frameBytes, 0, null);
                                this.configFound = false;
                                this.truncationSamples = 0;
                                this.frameBytes = 0;
                            }
                            i2 = 1;
                        }
                        this.state = i2;
                    }
                }
            } else {
                int i28 = this.flags;
                if ((i28 & 2) == 0) {
                    parsableByteArray.setPosition(parsableByteArray.limit);
                } else {
                    if ((i28 & 4) == 0) {
                        while (parsableByteArray.bytesLeft() > 0) {
                            int i29 = this.syncBytes << 8;
                            this.syncBytes = i29;
                            int readUnsignedByte = i29 | parsableByteArray.readUnsignedByte();
                            this.syncBytes = readUnsignedByte;
                            if ((readUnsignedByte & 16777215) == 12583333) {
                                parsableByteArray.setPosition(parsableByteArray.position - 3);
                                this.syncBytes = 0;
                            }
                        }
                    }
                    this.state = 1;
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
        this.flags = i;
        if (!this.rapPending && (this.frameBytes != 0 || !this.headerDataFinished)) {
            this.dataPending = true;
        }
        if (j != -9223372036854775807L) {
            if (this.dataPending) {
                this.timeUsPending = j;
            } else {
                this.timeUs = j;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.state = 0;
        this.syncBytes = 0;
        this.headerScratchBytes.reset(2);
        this.payloadBytesRead = 0;
        this.frameBytes = 0;
        this.samplingRate = -2147483647;
        this.standardFrameLength = -1;
        this.truncationSamples = 0;
        this.mainStreamLabel = -1L;
        this.configFound = false;
        this.dataPending = false;
        this.headerDataFinished = true;
        this.rapPending = true;
        this.timeUs = -9.223372036854776E18d;
        this.timeUsPending = -9.223372036854776E18d;
    }
}
