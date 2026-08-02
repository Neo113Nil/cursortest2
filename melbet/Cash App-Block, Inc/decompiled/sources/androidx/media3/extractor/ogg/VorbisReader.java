package androidx.media3.extractor.ogg;

import androidx.biometric.BiometricPrompt;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.MpegAudioUtil$Header;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.VorbisUtil$Mode;
import coil3.svg.internal.AndroidSvg;
import com.bugsnag.android.TraceParser;
import com.google.common.collect.ImmutableList;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class VorbisReader extends StreamReader {
    public BiometricPrompt commentHeader;
    public int previousPacketBlockSize;
    public boolean seenFirstAudioPacket;
    public MpegAudioUtil$Header vorbisIdHeader;
    public TraceParser vorbisSetup;

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void onSeekEnd(long j) {
        this.currentGranule = j;
        this.seenFirstAudioPacket = j != 0;
        MpegAudioUtil$Header mpegAudioUtil$Header = this.vorbisIdHeader;
        this.previousPacketBlockSize = mpegAudioUtil$Header != null ? mpegAudioUtil$Header.bitrate : 0;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long preparePayload(ParsableByteArray parsableByteArray) {
        byte b = parsableByteArray.data[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        TraceParser traceParser = this.vorbisSetup;
        traceParser.getClass();
        boolean z = ((VorbisUtil$Mode[]) traceParser.threadAttrs)[(b >> 1) & (255 >>> (8 - traceParser.state))].blockFlag;
        MpegAudioUtil$Header mpegAudioUtil$Header = (MpegAudioUtil$Header) traceParser.logger;
        int i = !z ? mpegAudioUtil$Header.bitrate : mpegAudioUtil$Header.samplesPerFrame;
        long j = this.seenFirstAudioPacket ? (this.previousPacketBlockSize + i) / 4 : 0;
        byte[] bArr = parsableByteArray.data;
        int length = bArr.length;
        int i2 = parsableByteArray.limit + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            parsableByteArray.reset(copyOf.length, copyOf);
        } else {
            parsableByteArray.setLimit(i2);
        }
        byte[] bArr2 = parsableByteArray.data;
        int i3 = parsableByteArray.limit;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = i;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean readHeaders(ParsableByteArray parsableByteArray, long j, AndroidSvg androidSvg) {
        TraceParser traceParser;
        if (this.vorbisSetup != null) {
            ((Format) androidSvg.svg).getClass();
            return false;
        }
        MpegAudioUtil$Header mpegAudioUtil$Header = this.vorbisIdHeader;
        int i = 4;
        if (mpegAudioUtil$Header == null) {
            AacUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
            parsableByteArray.readLittleEndianUnsignedIntToInt();
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            if (readLittleEndianInt <= 0) {
                readLittleEndianInt = -1;
            }
            int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
            int i2 = readLittleEndianInt2 > 0 ? readLittleEndianInt2 : -1;
            parsableByteArray.readLittleEndianInt();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int pow = (int) Math.pow(2.0d, readUnsignedByte2 & 15);
            int pow2 = (int) Math.pow(2.0d, (readUnsignedByte2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4);
            parsableByteArray.readUnsignedByte();
            ?? copyOf = Arrays.copyOf(parsableByteArray.data, parsableByteArray.limit);
            MpegAudioUtil$Header mpegAudioUtil$Header2 = new MpegAudioUtil$Header();
            mpegAudioUtil$Header2.version = readUnsignedByte;
            mpegAudioUtil$Header2.frameSize = readLittleEndianUnsignedIntToInt;
            mpegAudioUtil$Header2.sampleRate = readLittleEndianInt;
            mpegAudioUtil$Header2.channels = i2;
            mpegAudioUtil$Header2.bitrate = pow;
            mpegAudioUtil$Header2.samplesPerFrame = pow2;
            mpegAudioUtil$Header2.mimeType = copyOf;
            this.vorbisIdHeader = mpegAudioUtil$Header2;
        } else {
            BiometricPrompt biometricPrompt = this.commentHeader;
            if (biometricPrompt == null) {
                this.commentHeader = AacUtil.readVorbisCommentHeader(parsableByteArray, true, true);
            } else {
                int i3 = parsableByteArray.limit;
                byte[] bArr = new byte[i3];
                System.arraycopy(parsableByteArray.data, 0, bArr, 0, i3);
                int i4 = mpegAudioUtil$Header.version;
                int i5 = 5;
                AacUtil.verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() + 1;
                VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.data);
                int i6 = 8;
                vorbisBitArray.skipBits(parsableByteArray.position * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 16;
                    if (i7 < readUnsignedByte3) {
                        int i9 = i6;
                        if (vorbisBitArray.readBits(24) != 5653314) {
                            throw ParserException.createForMalformedContainer(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((vorbisBitArray.byteOffset * 8) + vorbisBitArray.bitOffset));
                        }
                        int readBits = vorbisBitArray.readBits(16);
                        int readBits2 = vorbisBitArray.readBits(24);
                        if (vorbisBitArray.readBit()) {
                            vorbisBitArray.skipBits(i5);
                            int i10 = 0;
                            while (i10 < readBits2) {
                                int i11 = 0;
                                for (int i12 = readBits2 - i10; i12 > 0; i12 >>>= 1) {
                                    i11++;
                                }
                                i10 += vorbisBitArray.readBits(i11);
                            }
                        } else {
                            boolean readBit = vorbisBitArray.readBit();
                            for (int i13 = 0; i13 < readBits2; i13++) {
                                if (!readBit) {
                                    vorbisBitArray.skipBits(i5);
                                } else if (vorbisBitArray.readBit()) {
                                    vorbisBitArray.skipBits(i5);
                                }
                            }
                        }
                        int readBits3 = vorbisBitArray.readBits(4);
                        if (readBits3 > 2) {
                            throw ParserException.createForMalformedContainer(null, "lookup type greater than 2 not decodable: " + readBits3);
                        }
                        if (readBits3 == 1 || readBits3 == 2) {
                            vorbisBitArray.skipBits(32);
                            vorbisBitArray.skipBits(32);
                            int readBits4 = vorbisBitArray.readBits(4) + 1;
                            vorbisBitArray.skipBits(1);
                            vorbisBitArray.skipBits((int) ((readBits3 == 1 ? readBits != 0 ? (long) Math.floor(Math.pow(readBits2, 1.0d / readBits)) : 0L : readBits * readBits2) * readBits4));
                        }
                        i7++;
                        i6 = i9;
                        i5 = 5;
                    } else {
                        int i14 = i6;
                        int i15 = 6;
                        int readBits5 = vorbisBitArray.readBits(6) + 1;
                        for (int i16 = 0; i16 < readBits5; i16++) {
                            if (vorbisBitArray.readBits(16) != 0) {
                                throw ParserException.createForMalformedContainer(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i17 = 1;
                        int readBits6 = vorbisBitArray.readBits(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < readBits6) {
                                int readBits7 = vorbisBitArray.readBits(i8);
                                if (readBits7 == 0) {
                                    int i20 = i14;
                                    vorbisBitArray.skipBits(i20);
                                    vorbisBitArray.skipBits(16);
                                    vorbisBitArray.skipBits(16);
                                    vorbisBitArray.skipBits(6);
                                    vorbisBitArray.skipBits(i20);
                                    int readBits8 = vorbisBitArray.readBits(4) + 1;
                                    int i21 = 0;
                                    while (i21 < readBits8) {
                                        vorbisBitArray.skipBits(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (readBits7 != i17) {
                                        throw ParserException.createForMalformedContainer(null, "floor type greater than 1 not decodable: " + readBits7);
                                    }
                                    int readBits9 = vorbisBitArray.readBits(5);
                                    int[] iArr = new int[readBits9];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < readBits9; i23++) {
                                        int readBits10 = vorbisBitArray.readBits(i);
                                        iArr[i23] = readBits10;
                                        if (readBits10 > i22) {
                                            i22 = readBits10;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr2 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        iArr2[i25] = vorbisBitArray.readBits(i19) + 1;
                                        int readBits11 = vorbisBitArray.readBits(2);
                                        int i26 = i14;
                                        if (readBits11 > 0) {
                                            vorbisBitArray.skipBits(i26);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i27 = 0;
                                        for (int i28 = 1; i27 < (i28 << readBits11); i28 = 1) {
                                            vorbisBitArray.skipBits(i26);
                                            i27++;
                                            i26 = 8;
                                        }
                                        i25++;
                                        iArr2 = iArr3;
                                        i14 = 8;
                                        i19 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    vorbisBitArray.skipBits(2);
                                    int readBits12 = vorbisBitArray.readBits(4);
                                    int i29 = 0;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < readBits9; i31++) {
                                        i29 += iArr4[iArr[i31]];
                                        while (i30 < i29) {
                                            vorbisBitArray.skipBits(readBits12);
                                            i30++;
                                        }
                                    }
                                }
                                i18++;
                                i14 = 8;
                                i15 = 6;
                                i8 = 16;
                                i = 4;
                                i17 = 1;
                            } else {
                                int readBits13 = vorbisBitArray.readBits(i15) + 1;
                                int i32 = 0;
                                while (i32 < readBits13) {
                                    if (vorbisBitArray.readBits(16) > 2) {
                                        throw ParserException.createForMalformedContainer(null, "residueType greater than 2 is not decodable");
                                    }
                                    vorbisBitArray.skipBits(24);
                                    vorbisBitArray.skipBits(24);
                                    vorbisBitArray.skipBits(24);
                                    int readBits14 = vorbisBitArray.readBits(i15) + 1;
                                    int i33 = 8;
                                    vorbisBitArray.skipBits(8);
                                    int[] iArr5 = new int[readBits14];
                                    for (int i34 = 0; i34 < readBits14; i34++) {
                                        iArr5[i34] = ((vorbisBitArray.readBit() ? vorbisBitArray.readBits(5) : 0) * 8) + vorbisBitArray.readBits(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < readBits14) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr5[i35] & (1 << i36)) != 0) {
                                                vorbisBitArray.skipBits(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i15 = 6;
                                }
                                int readBits15 = vorbisBitArray.readBits(i15) + 1;
                                for (int i37 = 0; i37 < readBits15; i37++) {
                                    int readBits16 = vorbisBitArray.readBits(16);
                                    if (readBits16 != 0) {
                                        Log.e("VorbisUtil", "mapping type other than 0 not supported: " + readBits16);
                                    } else {
                                        int readBits17 = vorbisBitArray.readBit() ? vorbisBitArray.readBits(4) + 1 : 1;
                                        if (vorbisBitArray.readBit()) {
                                            int readBits18 = vorbisBitArray.readBits(8) + 1;
                                            for (int i38 = 0; i38 < readBits18; i38++) {
                                                int i39 = i4 - 1;
                                                int i40 = 0;
                                                for (int i41 = i39; i41 > 0; i41 >>>= 1) {
                                                    i40++;
                                                }
                                                vorbisBitArray.skipBits(i40);
                                                int i42 = 0;
                                                while (i39 > 0) {
                                                    i42++;
                                                    i39 >>>= 1;
                                                }
                                                vorbisBitArray.skipBits(i42);
                                            }
                                        }
                                        if (vorbisBitArray.readBits(2) != 0) {
                                            throw ParserException.createForMalformedContainer(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (readBits17 > 1) {
                                            for (int i43 = 0; i43 < i4; i43++) {
                                                vorbisBitArray.skipBits(4);
                                            }
                                        }
                                        for (int i44 = 0; i44 < readBits17; i44++) {
                                            vorbisBitArray.skipBits(8);
                                            vorbisBitArray.skipBits(8);
                                            vorbisBitArray.skipBits(8);
                                        }
                                    }
                                }
                                int readBits19 = vorbisBitArray.readBits(6);
                                int i45 = readBits19 + 1;
                                VorbisUtil$Mode[] vorbisUtil$ModeArr = new VorbisUtil$Mode[i45];
                                for (int i46 = 0; i46 < i45; i46++) {
                                    boolean readBit2 = vorbisBitArray.readBit();
                                    vorbisBitArray.readBits(16);
                                    vorbisBitArray.readBits(16);
                                    vorbisBitArray.readBits(8);
                                    vorbisUtil$ModeArr[i46] = new VorbisUtil$Mode(readBit2, false);
                                }
                                if (!vorbisBitArray.readBit()) {
                                    throw ParserException.createForMalformedContainer(null, "framing bit after modes not set as expected");
                                }
                                int i47 = 0;
                                while (readBits19 > 0) {
                                    i47++;
                                    readBits19 >>>= 1;
                                }
                                traceParser = new TraceParser(mpegAudioUtil$Header, biometricPrompt, bArr, vorbisUtil$ModeArr, i47);
                            }
                        }
                    }
                }
            }
        }
        traceParser = null;
        this.vorbisSetup = traceParser;
        if (traceParser == null) {
            return true;
        }
        MpegAudioUtil$Header mpegAudioUtil$Header3 = (MpegAudioUtil$Header) traceParser.logger;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) mpegAudioUtil$Header3.mimeType);
        arrayList.add((byte[]) traceParser.currentThread);
        Metadata parseVorbisComments = AacUtil.parseVorbisComments(ImmutableList.copyOf((String[]) ((BiometricPrompt) traceParser.projectPackages).mClientFragmentManager));
        Format.Builder builder = new Format.Builder();
        builder.containerMimeType = MimeTypes.normalizeMimeType("audio/ogg");
        builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/vorbis");
        builder.averageBitrate = mpegAudioUtil$Header3.channels;
        builder.peakBitrate = mpegAudioUtil$Header3.sampleRate;
        builder.channelCount = mpegAudioUtil$Header3.version;
        builder.sampleRate = mpegAudioUtil$Header3.frameSize;
        builder.initializationData = arrayList;
        builder.metadata = parseVorbisComments;
        androidSvg.svg = new Format(builder);
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }
}
