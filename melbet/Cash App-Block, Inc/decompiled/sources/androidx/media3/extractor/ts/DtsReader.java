package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class DtsReader implements ElementaryStreamReader {
    public int bytesRead;

    /* renamed from: format, reason: collision with root package name */
    public Format f896format;
    public String formatId;
    public int frameType;
    public final ParsableByteArray headerScratchBytes;
    public final String language;
    public TrackOutput output;
    public final int roleFlags;
    public long sampleDurationUs;
    public int sampleSize;
    public int syncBytes;
    public int state = 0;
    public long timeUs = -9223372036854775807L;
    public final AtomicInteger uhdAudioChunkId = new AtomicInteger();
    public int extensionSubstreamHeaderSize = -1;
    public int uhdHeaderSize = -1;
    public final String containerMimeType = "video/mp2t";

    public DtsReader(String str, int i, int i2) {
        this.headerScratchBytes = new ParsableByteArray(new byte[i2]);
        this.language = str;
        this.roleFlags = i;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        long j2;
        int i10;
        int i11;
        int i12;
        this.output.getClass();
        while (parsableByteArray.bytesLeft() > 0) {
            int i13 = this.state;
            ParsableByteArray parsableByteArray2 = this.headerScratchBytes;
            switch (i13) {
                case 0:
                    while (true) {
                        if (parsableByteArray.bytesLeft() > 0) {
                            int i14 = this.syncBytes << 8;
                            this.syncBytes = i14;
                            int readUnsignedByte = i14 | parsableByteArray.readUnsignedByte();
                            this.syncBytes = readUnsignedByte;
                            int frameType = AacUtil.getFrameType(readUnsignedByte);
                            this.frameType = frameType;
                            if (frameType != 0) {
                                byte[] bArr = parsableByteArray2.data;
                                int i15 = this.syncBytes;
                                bArr[0] = (byte) ((i15 >> 24) & 255);
                                bArr[1] = (byte) ((i15 >> 16) & 255);
                                bArr[2] = (byte) ((i15 >> 8) & 255);
                                bArr[3] = (byte) (i15 & 255);
                                this.bytesRead = 4;
                                this.syncBytes = 0;
                                if (frameType != 3 && frameType != 4) {
                                    if (frameType == 1) {
                                        this.state = 1;
                                        break;
                                    } else {
                                        this.state = 2;
                                        break;
                                    }
                                } else {
                                    this.state = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!continueRead$3(parsableByteArray, parsableByteArray2.data, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = parsableByteArray2.data;
                        if (this.f896format == null) {
                            String str = this.formatId;
                            VorbisBitArray normalizedFrame = AacUtil.getNormalizedFrame(bArr2);
                            normalizedFrame.skipBits(60);
                            int i16 = AacUtil.CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
                            int i17 = AacUtil.SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
                            int readBits = normalizedFrame.readBits(5);
                            int i18 = readBits >= 29 ? -1 : (AacUtil.TWICE_BITRATE_KBPS_BY_RATE[readBits] * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) / 2;
                            normalizedFrame.skipBits(10);
                            int i19 = i16 + (normalizedFrame.readBits(2) > 0 ? 1 : 0);
                            Format.Builder builder = new Format.Builder();
                            builder.id = str;
                            builder.containerMimeType = MimeTypes.normalizeMimeType(this.containerMimeType);
                            builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/vnd.dts");
                            builder.averageBitrate = i18;
                            builder.channelCount = i19;
                            builder.sampleRate = i17;
                            builder.drmInitData = null;
                            builder.language = this.language;
                            builder.roleFlags = this.roleFlags;
                            Format format2 = new Format(builder);
                            this.f896format = format2;
                            this.output.format(format2);
                        }
                        this.sampleSize = AacUtil.getDtsFrameSize(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.sampleDurationUs = CompositeException.WrappedPrintStream.checkedCast(Util.sampleCountToDurationUs(this.f896format.sampleRate, (((i2 >> 2) | i) + 1) * 32));
                            parsableByteArray2.setPosition(0);
                            this.output.sampleData(18, parsableByteArray2);
                            this.state = 6;
                            break;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.sampleDurationUs = CompositeException.WrappedPrintStream.checkedCast(Util.sampleCountToDurationUs(this.f896format.sampleRate, (((i2 >> 2) | i) + 1) * 32));
                        parsableByteArray2.setPosition(0);
                        this.output.sampleData(18, parsableByteArray2);
                        this.state = 6;
                    }
                case 2:
                    if (continueRead$3(parsableByteArray, parsableByteArray2.data, 7)) {
                        VorbisBitArray normalizedFrame2 = AacUtil.getNormalizedFrame(parsableByteArray2.data);
                        normalizedFrame2.skipBits(42);
                        this.extensionSubstreamHeaderSize = normalizedFrame2.readBits(normalizedFrame2.readBit() ? 12 : 8) + 1;
                        this.state = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i20 = 8;
                    if (continueRead$3(parsableByteArray, parsableByteArray2.data, this.extensionSubstreamHeaderSize)) {
                        VorbisBitArray normalizedFrame3 = AacUtil.getNormalizedFrame(parsableByteArray2.data);
                        normalizedFrame3.skipBits(40);
                        int readBits2 = normalizedFrame3.readBits(2);
                        if (normalizedFrame3.readBit()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        normalizedFrame3.skipBits(i4);
                        int readBits3 = normalizedFrame3.readBits(i3) + 1;
                        boolean readBit = normalizedFrame3.readBit();
                        if (readBit) {
                            i5 = normalizedFrame3.readBits(2);
                            i6 = (normalizedFrame3.readBits(3) + 1) * 512;
                            if (normalizedFrame3.readBit()) {
                                normalizedFrame3.skipBits(36);
                            }
                            int readBits4 = normalizedFrame3.readBits(3) + 1;
                            int readBits5 = normalizedFrame3.readBits(3) + 1;
                            if (readBits4 != 1 || readBits5 != 1) {
                                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
                            }
                            int i21 = readBits2 + 1;
                            int readBits6 = normalizedFrame3.readBits(i21);
                            int i22 = 0;
                            while (i22 < i21) {
                                if (((readBits6 >> i22) & 1) == 1) {
                                    normalizedFrame3.skipBits(i20);
                                }
                                i22++;
                                i20 = 8;
                            }
                            if (normalizedFrame3.readBit()) {
                                normalizedFrame3.skipBits(2);
                                int readBits7 = (normalizedFrame3.readBits(2) + 1) << 2;
                                int readBits8 = normalizedFrame3.readBits(2) + 1;
                                for (int i23 = 0; i23 < readBits8; i23++) {
                                    normalizedFrame3.skipBits(readBits7);
                                }
                            }
                        } else {
                            i5 = -1;
                            i6 = 0;
                        }
                        normalizedFrame3.skipBits(i3);
                        normalizedFrame3.skipBits(12);
                        if (readBit) {
                            if (normalizedFrame3.readBit()) {
                                normalizedFrame3.skipBits(4);
                            }
                            if (normalizedFrame3.readBit()) {
                                normalizedFrame3.skipBits(24);
                            }
                            if (normalizedFrame3.readBit()) {
                                normalizedFrame3.skipBytes(normalizedFrame3.readBits(10) + 1);
                            }
                            normalizedFrame3.skipBits(5);
                            i8 = AacUtil.SAMPLE_RATE_BY_INDEX[normalizedFrame3.readBits(4)];
                            i7 = normalizedFrame3.readBits(8) + 1;
                        } else {
                            i7 = -1;
                            i8 = -2147483647;
                        }
                        if (readBit) {
                            if (i5 == 0) {
                                i9 = 32000;
                            } else if (i5 == 1) {
                                i9 = 44100;
                            } else {
                                if (i5 != 2) {
                                    throw ParserException.createForMalformedContainer(null, "Unsupported reference clock code in DTS HD header: " + i5);
                                }
                                i9 = 48000;
                            }
                            String str2 = Util.DEVICE_DEBUG_INFO;
                            j = Util.scaleLargeValue(i6, 1000000L, i9, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        updateFormatWithDtsHeaderInfo(new AacUtil.Config(i7, i8, readBits3, j, "audio/vnd.dts.hd;profile=lbr"));
                        this.sampleSize = readBits3;
                        this.sampleDurationUs = j == -9223372036854775807L ? 0L : j;
                        parsableByteArray2.setPosition(0);
                        this.output.sampleData(this.extensionSubstreamHeaderSize, parsableByteArray2);
                        this.state = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (continueRead$3(parsableByteArray, parsableByteArray2.data, 6)) {
                        VorbisBitArray normalizedFrame4 = AacUtil.getNormalizedFrame(parsableByteArray2.data);
                        normalizedFrame4.skipBits(32);
                        int parseUnsignedVarInt = AacUtil.parseUnsignedVarInt(normalizedFrame4, AacUtil.UHD_HEADER_SIZE_LENGTH_TABLE) + 1;
                        this.uhdHeaderSize = parseUnsignedVarInt;
                        int i24 = this.bytesRead;
                        if (i24 > parseUnsignedVarInt) {
                            int i25 = i24 - parseUnsignedVarInt;
                            this.bytesRead = i24 - i25;
                            parsableByteArray.setPosition(parsableByteArray.position - i25);
                        }
                        this.state = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (continueRead$3(parsableByteArray, parsableByteArray2.data, this.uhdHeaderSize)) {
                        byte[] bArr3 = parsableByteArray2.data;
                        VorbisBitArray normalizedFrame5 = AacUtil.getNormalizedFrame(bArr3);
                        int i26 = normalizedFrame5.readBits(32) == 1078008818 ? 1 : 0;
                        int parseUnsignedVarInt2 = AacUtil.parseUnsignedVarInt(normalizedFrame5, AacUtil.UHD_FTOC_PAYLOAD_LENGTH_TABLE);
                        int i27 = parseUnsignedVarInt2 + 1;
                        if (i26 == 0) {
                            j2 = -9223372036854775807L;
                            i10 = -2147483647;
                        } else {
                            if (!normalizedFrame5.readBit()) {
                                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
                            }
                            int i28 = parseUnsignedVarInt2 - 1;
                            int i29 = ((bArr3[i28] << 8) & 65535) | (bArr3[parseUnsignedVarInt2] & 255);
                            String str3 = Util.DEVICE_DEBUG_INFO;
                            int i30 = 65535;
                            for (int i31 = 0; i31 < i28; i31++) {
                                int unsignedInt = Byte.toUnsignedInt(bArr3[i31]);
                                int[] iArr = Util.CRC16_BYTES_MSBF;
                                int i32 = (iArr[(((i30 >> 12) & 255) ^ (unsignedInt >> 4)) & 255] ^ ((i30 << 4) & 65535)) & 65535;
                                i30 = (((i32 << 4) & 65535) ^ iArr[(((i32 >> 12) & 255) ^ (unsignedInt & 15)) & 255]) & 65535;
                            }
                            if (i29 != i30) {
                                throw ParserException.createForMalformedContainer(null, "CRC check failed");
                            }
                            int readBits9 = normalizedFrame5.readBits(2);
                            if (readBits9 == 0) {
                                i11 = 512;
                            } else if (readBits9 == 1) {
                                i11 = 480;
                            } else {
                                if (readBits9 != 2) {
                                    throw ParserException.createForMalformedContainer(null, "Unsupported base duration index in DTS UHD header: " + readBits9);
                                }
                                i11 = MLKEMEngine.KyberPolyBytes;
                            }
                            int readBits10 = (normalizedFrame5.readBits(3) + 1) * i11;
                            int readBits11 = normalizedFrame5.readBits(2);
                            if (readBits11 == 0) {
                                i12 = 32000;
                            } else if (readBits11 == 1) {
                                i12 = 44100;
                            } else {
                                if (readBits11 != 2) {
                                    throw ParserException.createForMalformedContainer(null, "Unsupported clock rate index in DTS UHD header: " + readBits11);
                                }
                                i12 = 48000;
                            }
                            if (normalizedFrame5.readBit()) {
                                normalizedFrame5.skipBits(36);
                            }
                            int readBits12 = (1 << normalizedFrame5.readBits(2)) * i12;
                            j2 = Util.scaleLargeValue(readBits10, 1000000L, i12, RoundingMode.DOWN);
                            i10 = readBits12;
                        }
                        int i33 = 0;
                        for (int i34 = 0; i34 < i26; i34++) {
                            i33 += AacUtil.parseUnsignedVarInt(normalizedFrame5, AacUtil.UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE);
                        }
                        AtomicInteger atomicInteger = this.uhdAudioChunkId;
                        if (i26 != 0) {
                            atomicInteger.set(AacUtil.parseUnsignedVarInt(normalizedFrame5, AacUtil.UHD_AUDIO_CHUNK_ID_LENGTH_TABLE));
                        }
                        int parseUnsignedVarInt3 = i33 + (atomicInteger.get() != 0 ? AacUtil.parseUnsignedVarInt(normalizedFrame5, AacUtil.UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE) : 0) + i27;
                        AacUtil.Config config = new AacUtil.Config(2, i10, parseUnsignedVarInt3, j2, "audio/vnd.dts.uhd;profile=p2");
                        if (this.frameType == 3) {
                            updateFormatWithDtsHeaderInfo(config);
                        }
                        this.sampleSize = parseUnsignedVarInt3;
                        this.sampleDurationUs = j2 == -9223372036854775807L ? 0L : j2;
                        parsableByteArray2.setPosition(0);
                        this.output.sampleData(this.uhdHeaderSize, parsableByteArray2);
                        this.state = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(min, parsableByteArray);
                    int i35 = this.bytesRead + min;
                    this.bytesRead = i35;
                    if (i35 != this.sampleSize) {
                        break;
                    } else {
                        Trace.checkState(this.timeUs != -9223372036854775807L);
                        this.output.sampleMetadata(this.timeUs, this.frameType == 4 ? 0 : 1, this.sampleSize, 0, null);
                        this.timeUs += this.sampleDurationUs;
                        this.state = 0;
                        break;
                    }
                default:
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
            }
        }
    }

    public final boolean continueRead$3(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        parsableByteArray.readBytes(this.bytesRead, min, bArr);
        int i2 = this.bytesRead + min;
        this.bytesRead = i2;
        return i2 == i;
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
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.timeUs = -9223372036854775807L;
        this.uhdAudioChunkId.set(0);
    }

    public final void updateFormatWithDtsHeaderInfo(AacUtil.Config config) {
        int i = config.sampleRateHz;
        String str = config.codecs;
        int i2 = config.channelCount;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        Format format2 = this.f896format;
        if (format2 != null && i2 == format2.channelCount && i == format2.sampleRate && str.equals(format2.sampleMimeType)) {
            return;
        }
        Format format3 = this.f896format;
        Format.Builder builder = format3 == null ? new Format.Builder() : format3.buildUpon();
        builder.id = this.formatId;
        builder.containerMimeType = MimeTypes.normalizeMimeType(this.containerMimeType);
        builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
        builder.channelCount = i2;
        builder.sampleRate = i;
        builder.language = this.language;
        builder.roleFlags = this.roleFlags;
        Format format4 = new Format(builder);
        this.f896format = format4;
        this.output.format(format4);
    }
}
