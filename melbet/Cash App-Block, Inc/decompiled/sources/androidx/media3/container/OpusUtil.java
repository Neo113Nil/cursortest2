package androidx.media3.container;

import androidx.camera.video.Recorder;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.extractor.wav.WavFormat;
import androidx.paging.PagingConfig;
import androidx.tracing.Trace;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.dynamite.zzo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.math.DoubleMath;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class OpusUtil {
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object scratchEscapePositionsLock = new Object();
    public static int[] scratchEscapePositions = new int[10];

    public static ArrayList buildInitializationData(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        Trace.checkState(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    clearPrefixFlags(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static String getNalStructureMimeType(Format format2) {
        String str = format2.sampleMimeType;
        String str2 = format2.codecs;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return format2.sampleMimeType;
    }

    public static long getPacketDurationUs(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static boolean isDependedOn(byte[] bArr, int i, Format format2) {
        int i2;
        if (Objects.equals(format2.sampleMimeType, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i2 = b & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(format2.sampleMimeType, "video/hevc")) {
            PagingConfig parseH265NalHeader = parseH265NalHeader(new WavFormat(bArr, 4, i + 4));
            int i3 = parseH265NalHeader.pageSize;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && parseH265NalHeader.initialLoadSize == format2.maxSubLayers - 1) {
                return false;
            }
        }
        return true;
    }

    public static int numberOfBytesInNalUnitHeader(Format format2) {
        String nalStructureMimeType = getNalStructureMimeType(format2);
        if (Objects.equals(nalStructureMimeType, "video/avc")) {
            return 1;
        }
        return (Objects.equals(nalStructureMimeType, "video/hevc") || Objects.equals(nalStructureMimeType, "video/vvc")) ? 2 : 0;
    }

    public static PagingConfig parseH265NalHeader(WavFormat wavFormat) {
        wavFormat.skipBit();
        return new PagingConfig(wavFormat.readBits(6), wavFormat.readBits(6), wavFormat.readBits(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NalUnitUtil$H265ProfileTierLevel parseH265ProfileTierLevel(WavFormat wavFormat, boolean z, int i, NalUnitUtil$H265ProfileTierLevel nalUnitUtil$H265ProfileTierLevel) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int readBits = wavFormat.readBits(2);
            z3 = wavFormat.readBit();
            i5 = wavFormat.readBits(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (wavFormat.readBit()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = wavFormat.readBits(8);
            }
            i2 = readBits;
        } else {
            if (nalUnitUtil$H265ProfileTierLevel == null) {
                iArr = iArr2;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z2 = false;
                int readBits2 = wavFormat.readBits(8);
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (wavFormat.readBit()) {
                        i9 += 88;
                    }
                    if (wavFormat.readBit()) {
                        i9 += 8;
                    }
                }
                wavFormat.skipBits(i9);
                if (i > 0) {
                    wavFormat.skipBits((8 - i) * 2);
                }
                return new NalUnitUtil$H265ProfileTierLevel(i2, i3, i4, iArr, z2, readBits2);
            }
            int i11 = nalUnitUtil$H265ProfileTierLevel.generalProfileSpace;
            z3 = nalUnitUtil$H265ProfileTierLevel.generalTierFlag;
            i5 = nalUnitUtil$H265ProfileTierLevel.generalProfileIdc;
            i6 = nalUnitUtil$H265ProfileTierLevel.generalProfileCompatibilityFlags;
            iArr2 = nalUnitUtil$H265ProfileTierLevel.constraintBytes;
            i2 = i11;
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int readBits22 = wavFormat.readBits(8);
        int i92 = 0;
        while (i10 < i) {
        }
        wavFormat.skipBits(i92);
        if (i > 0) {
        }
        return new NalUnitUtil$H265ProfileTierLevel(i2, i3, i4, iArr, z2, readBits22);
    }

    public static zzo parseH265Sei3dRefDisplayInfo(int i, int i2, byte[] bArr) {
        byte b;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        WavFormat wavFormat = new WavFormat(bArr, i3, i2 + 1);
        while (wavFormat.canReadBits(16)) {
            int readBits = wavFormat.readBits(8);
            int i4 = 0;
            while (readBits == 255) {
                i4 += 255;
                readBits = wavFormat.readBits(8);
            }
            int i5 = i4 + readBits;
            int readBits2 = wavFormat.readBits(8);
            int i6 = 0;
            while (readBits2 == 255) {
                i6 += 255;
                readBits2 = wavFormat.readBits(8);
            }
            int i7 = i6 + readBits2;
            if (i7 == 0 || !wavFormat.canReadBits(i7)) {
                return null;
            }
            if (i5 == 176) {
                int readExpGolombCodeNum = wavFormat.readExpGolombCodeNum();
                boolean readBit = wavFormat.readBit();
                int readExpGolombCodeNum2 = readBit ? wavFormat.readExpGolombCodeNum() : 0;
                int readExpGolombCodeNum3 = wavFormat.readExpGolombCodeNum();
                int i8 = -1;
                for (int i9 = 0; i9 <= readExpGolombCodeNum3; i9++) {
                    i8 = wavFormat.readExpGolombCodeNum();
                    wavFormat.readExpGolombCodeNum();
                    int readBits3 = wavFormat.readBits(6);
                    if (readBits3 == 63) {
                        return null;
                    }
                    wavFormat.readBits(readBits3 == 0 ? Math.max(0, readExpGolombCodeNum - 30) : Math.max(0, (readBits3 + readExpGolombCodeNum) - 31));
                    if (readBit) {
                        int readBits4 = wavFormat.readBits(6);
                        if (readBits4 == 63) {
                            return null;
                        }
                        wavFormat.readBits(readBits4 == 0 ? Math.max(0, readExpGolombCodeNum2 - 30) : Math.max(0, (readBits4 + readExpGolombCodeNum2) - 31));
                    }
                    if (wavFormat.readBit()) {
                        wavFormat.skipBits(10);
                    }
                }
                return new zzo((byte) 0, i8);
            }
            wavFormat.skipBits(i7 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NalUnitUtil$H265SpsData parseH265SpsNalUnit(byte[] bArr, int i, int i2, UnleashContext unleashContext) {
        int i3;
        int readExpGolombCodeNum;
        int i4;
        int i5;
        int i6;
        int readExpGolombCodeNum2;
        int i7;
        int i8;
        int readExpGolombCodeNum3;
        int i9;
        int i10;
        int readExpGolombCodeNum4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        NalUnitUtil$H265VideoSignalInfosAndIndices nalUnitUtil$H265VideoSignalInfosAndIndices;
        int i18;
        int i19;
        int i20;
        int i21;
        int readExpGolombCodeNum5;
        Recorder.AnonymousClass1 anonymousClass1;
        PagingConfig parseH265NalHeader = parseH265NalHeader(new WavFormat(bArr, i, i2));
        WavFormat wavFormat = new WavFormat(bArr, i + 2, i2);
        int i22 = 4;
        wavFormat.skipBits(4);
        int readBits = wavFormat.readBits(3);
        int i23 = parseH265NalHeader.prefetchDistance;
        boolean z = i23 != 0 && readBits == 7;
        if (unleashContext != null) {
            ImmutableList immutableList = (ImmutableList) unleashContext.userId;
            if (!immutableList.isEmpty()) {
                i3 = ((NalUnitUtil$H265LayerInfo) immutableList.get(Math.min(i23, immutableList.size() - 1))).layerIdInVps;
                NalUnitUtil$H265ProfileTierLevel nalUnitUtil$H265ProfileTierLevel = null;
                if (z) {
                    wavFormat.skipBit();
                    nalUnitUtil$H265ProfileTierLevel = parseH265ProfileTierLevel(wavFormat, true, readBits, null);
                } else if (unleashContext != null) {
                    NalUnitUtil$H265VideoSignalInfosAndIndices nalUnitUtil$H265VideoSignalInfosAndIndices2 = (NalUnitUtil$H265VideoSignalInfosAndIndices) unleashContext.sessionId;
                    int[] iArr = nalUnitUtil$H265VideoSignalInfosAndIndices2.indices;
                    ImmutableList immutableList2 = nalUnitUtil$H265VideoSignalInfosAndIndices2.videoSignalInfos;
                    int i24 = iArr[i3];
                    if (immutableList2.size() > i24) {
                        nalUnitUtil$H265ProfileTierLevel = (NalUnitUtil$H265ProfileTierLevel) immutableList2.get(i24);
                    }
                }
                wavFormat.readExpGolombCodeNum();
                if (z) {
                    readExpGolombCodeNum = wavFormat.readExpGolombCodeNum();
                    if (readExpGolombCodeNum == 3) {
                        wavFormat.skipBit();
                    }
                    int readExpGolombCodeNum6 = wavFormat.readExpGolombCodeNum();
                    int readExpGolombCodeNum7 = wavFormat.readExpGolombCodeNum();
                    if (wavFormat.readBit()) {
                        int readExpGolombCodeNum8 = wavFormat.readExpGolombCodeNum();
                        int readExpGolombCodeNum9 = wavFormat.readExpGolombCodeNum();
                        int readExpGolombCodeNum10 = wavFormat.readExpGolombCodeNum();
                        int readExpGolombCodeNum11 = wavFormat.readExpGolombCodeNum();
                        i5 = readExpGolombCodeNum6 - ((readExpGolombCodeNum8 + readExpGolombCodeNum9) * ((readExpGolombCodeNum == 1 || readExpGolombCodeNum == 2) ? 2 : 1));
                        i4 = readExpGolombCodeNum7 - ((readExpGolombCodeNum10 + readExpGolombCodeNum11) * (readExpGolombCodeNum == 1 ? 2 : 1));
                    } else {
                        i4 = readExpGolombCodeNum7;
                        i5 = readExpGolombCodeNum6;
                    }
                    i6 = i5;
                    readExpGolombCodeNum2 = wavFormat.readExpGolombCodeNum();
                    i7 = readExpGolombCodeNum7;
                    i8 = i4;
                    readExpGolombCodeNum3 = wavFormat.readExpGolombCodeNum();
                    i9 = readExpGolombCodeNum6;
                } else {
                    int readBits2 = wavFormat.readBit() ? wavFormat.readBits(8) : -1;
                    if (unleashContext != null && (anonymousClass1 = (Recorder.AnonymousClass1) unleashContext.remoteAddress) != null) {
                        ImmutableList immutableList3 = (ImmutableList) anonymousClass1.val$videoEncoderSession;
                        if (readBits2 == -1) {
                            readBits2 = ((int[]) anonymousClass1.this$0)[i3];
                        }
                        if (readBits2 != -1 && immutableList3.size() > readBits2) {
                            NalUnitUtil$H265RepFormat nalUnitUtil$H265RepFormat = (NalUnitUtil$H265RepFormat) immutableList3.get(readBits2);
                            readExpGolombCodeNum = nalUnitUtil$H265RepFormat.chromaFormatIdc;
                            i6 = nalUnitUtil$H265RepFormat.width;
                            i8 = nalUnitUtil$H265RepFormat.height;
                            readExpGolombCodeNum2 = nalUnitUtil$H265RepFormat.bitDepthLumaMinus8;
                            readExpGolombCodeNum3 = nalUnitUtil$H265RepFormat.bitDepthChromaMinus8;
                            i7 = i8;
                            i9 = i6;
                        }
                    }
                    readExpGolombCodeNum2 = 0;
                    i8 = 0;
                    readExpGolombCodeNum3 = 0;
                    readExpGolombCodeNum = 0;
                    i6 = 0;
                    i7 = 0;
                    i9 = 0;
                }
                int readExpGolombCodeNum12 = wavFormat.readExpGolombCodeNum();
                if (z) {
                    i10 = -1;
                    for (int i25 = wavFormat.readBit() ? 0 : readBits; i25 <= readBits; i25++) {
                        wavFormat.readExpGolombCodeNum();
                        i10 = Math.max(wavFormat.readExpGolombCodeNum(), i10);
                        wavFormat.readExpGolombCodeNum();
                    }
                } else {
                    i10 = -1;
                }
                wavFormat.readExpGolombCodeNum();
                wavFormat.readExpGolombCodeNum();
                wavFormat.readExpGolombCodeNum();
                wavFormat.readExpGolombCodeNum();
                wavFormat.readExpGolombCodeNum();
                wavFormat.readExpGolombCodeNum();
                if (wavFormat.readBit()) {
                    boolean readBit = z ? wavFormat.readBit() : false;
                    int i26 = 6;
                    if (readBit) {
                        wavFormat.skipBits(6);
                    } else if (wavFormat.readBit()) {
                        int i27 = 0;
                        while (i27 < i22) {
                            int i28 = 0;
                            while (i28 < i26) {
                                if (wavFormat.readBit()) {
                                    int min = Math.min(64, 1 << ((i27 << 1) + 4));
                                    if (i27 > 1) {
                                        wavFormat.readSignedExpGolombCodedInt();
                                    }
                                    for (int i29 = 0; i29 < min; i29++) {
                                        wavFormat.readSignedExpGolombCodedInt();
                                    }
                                } else {
                                    wavFormat.readExpGolombCodeNum();
                                }
                                i28 += i27 == 3 ? 3 : 1;
                                i26 = 6;
                            }
                            i27++;
                            i22 = 4;
                            i26 = 6;
                        }
                    }
                }
                wavFormat.skipBits(2);
                if (wavFormat.readBit()) {
                    wavFormat.skipBits(8);
                    wavFormat.readExpGolombCodeNum();
                    wavFormat.readExpGolombCodeNum();
                    wavFormat.skipBit();
                }
                readExpGolombCodeNum4 = wavFormat.readExpGolombCodeNum();
                i11 = 0;
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                int i30 = i3;
                int i31 = -1;
                int i32 = -1;
                while (i11 < readExpGolombCodeNum4) {
                    if (i11 == 0 || !wavFormat.readBit()) {
                        i18 = readExpGolombCodeNum4;
                        i19 = i11;
                        i20 = i10;
                        i21 = readExpGolombCodeNum2;
                        readExpGolombCodeNum5 = wavFormat.readExpGolombCodeNum();
                        int readExpGolombCodeNum13 = wavFormat.readExpGolombCodeNum();
                        int[] iArr4 = new int[readExpGolombCodeNum5];
                        int i33 = 0;
                        while (i33 < readExpGolombCodeNum5) {
                            iArr4[i33] = (i33 > 0 ? iArr4[i33 - 1] : 0) - (wavFormat.readExpGolombCodeNum() + 1);
                            wavFormat.skipBit();
                            i33++;
                        }
                        int[] iArr5 = new int[readExpGolombCodeNum13];
                        int i34 = 0;
                        while (i34 < readExpGolombCodeNum13) {
                            iArr5[i34] = wavFormat.readExpGolombCodeNum() + 1 + (i34 > 0 ? iArr5[i34 - 1] : 0);
                            wavFormat.skipBit();
                            i34++;
                        }
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                        i31 = readExpGolombCodeNum13;
                    } else {
                        i18 = readExpGolombCodeNum4;
                        int i35 = i32 + i31;
                        int readExpGolombCodeNum14 = (1 - ((wavFormat.readBit() ? 1 : 0) * 2)) * (wavFormat.readExpGolombCodeNum() + 1);
                        i19 = i11;
                        int i36 = i35 + 1;
                        i20 = i10;
                        boolean[] zArr = new boolean[i36];
                        for (int i37 = 0; i37 <= i35; i37++) {
                            if (wavFormat.readBit()) {
                                zArr[i37] = true;
                            } else {
                                zArr[i37] = wavFormat.readBit();
                            }
                        }
                        int[] iArr6 = new int[i36];
                        int[] iArr7 = new int[i36];
                        int i38 = 0;
                        for (int i39 = i31 - 1; i39 >= 0; i39--) {
                            int i40 = iArr3[i39] + readExpGolombCodeNum14;
                            if (i40 < 0 && zArr[i32 + i39]) {
                                iArr6[i38] = i40;
                                i38++;
                            }
                        }
                        if (readExpGolombCodeNum14 < 0 && zArr[i35]) {
                            iArr6[i38] = readExpGolombCodeNum14;
                            i38++;
                        }
                        readExpGolombCodeNum5 = i38;
                        i21 = readExpGolombCodeNum2;
                        for (int i41 = 0; i41 < i32; i41++) {
                            int i42 = iArr2[i41] + readExpGolombCodeNum14;
                            if (i42 < 0 && zArr[i41]) {
                                iArr6[readExpGolombCodeNum5] = i42;
                                readExpGolombCodeNum5++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, readExpGolombCodeNum5);
                        int i43 = 0;
                        for (int i44 = i32 - 1; i44 >= 0; i44--) {
                            int i45 = iArr2[i44] + readExpGolombCodeNum14;
                            if (i45 > 0 && zArr[i44]) {
                                iArr7[i43] = i45;
                                i43++;
                            }
                        }
                        if (readExpGolombCodeNum14 > 0 && zArr[i35]) {
                            iArr7[i43] = readExpGolombCodeNum14;
                            i43++;
                        }
                        int i46 = i43;
                        for (int i47 = 0; i47 < i31; i47++) {
                            int i48 = iArr3[i47] + readExpGolombCodeNum14;
                            if (i48 > 0 && zArr[i32 + i47]) {
                                iArr7[i46] = i48;
                                i46++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i46);
                        iArr2 = copyOf;
                        i31 = i46;
                    }
                    i32 = readExpGolombCodeNum5;
                    i11 = i19 + 1;
                    readExpGolombCodeNum4 = i18;
                    i10 = i20;
                    readExpGolombCodeNum2 = i21;
                }
                int i49 = i10;
                int i50 = readExpGolombCodeNum2;
                if (wavFormat.readBit()) {
                    int readExpGolombCodeNum15 = wavFormat.readExpGolombCodeNum();
                    for (int i51 = 0; i51 < readExpGolombCodeNum15; i51++) {
                        wavFormat.skipBits(readExpGolombCodeNum12 + 5);
                    }
                }
                wavFormat.skipBits(2);
                float f = 1.0f;
                if (wavFormat.readBit()) {
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                } else {
                    if (wavFormat.readBit()) {
                        int readBits3 = wavFormat.readBits(8);
                        if (readBits3 == 255) {
                            int readBits4 = wavFormat.readBits(16);
                            int readBits5 = wavFormat.readBits(16);
                            if (readBits4 != 0 && readBits5 != 0) {
                                f = readBits4 / readBits5;
                            }
                        } else if (readBits3 < 17) {
                            f = ASPECT_RATIO_IDC_VALUES[readBits3];
                        } else {
                            Fragment$5$$ExternalSyntheticOutline0.m(readBits3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (wavFormat.readBit()) {
                        wavFormat.skipBit();
                    }
                    if (wavFormat.readBit()) {
                        wavFormat.skipBits(3);
                        i17 = wavFormat.readBit() ? 1 : 2;
                        if (wavFormat.readBit()) {
                            int readBits6 = wavFormat.readBits(8);
                            int readBits7 = wavFormat.readBits(8);
                            wavFormat.skipBits(8);
                            i15 = ColorInfo.isoColorPrimariesToColorSpace(readBits6);
                            i16 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits7);
                        } else {
                            i15 = -1;
                            i16 = -1;
                        }
                    } else {
                        if (unleashContext != null && (nalUnitUtil$H265VideoSignalInfosAndIndices = (NalUnitUtil$H265VideoSignalInfosAndIndices) unleashContext.properties) != null) {
                            ImmutableList immutableList4 = nalUnitUtil$H265VideoSignalInfosAndIndices.videoSignalInfos;
                            int i52 = nalUnitUtil$H265VideoSignalInfosAndIndices.indices[i30];
                            if (immutableList4.size() > i52) {
                                NalUnitUtil$H265VideoSignalInfo nalUnitUtil$H265VideoSignalInfo = (NalUnitUtil$H265VideoSignalInfo) immutableList4.get(i52);
                                int i53 = nalUnitUtil$H265VideoSignalInfo.colorSpace;
                                int i54 = nalUnitUtil$H265VideoSignalInfo.colorRange;
                                i16 = nalUnitUtil$H265VideoSignalInfo.colorTransfer;
                                i15 = i53;
                                i17 = i54;
                            }
                        }
                        i15 = -1;
                        i16 = -1;
                        i17 = -1;
                    }
                    if (wavFormat.readBit()) {
                        wavFormat.readExpGolombCodeNum();
                        wavFormat.readExpGolombCodeNum();
                    }
                    wavFormat.skipBit();
                    if (wavFormat.readBit()) {
                        i8 *= 2;
                    }
                    i12 = i15;
                    i14 = i16;
                    i13 = i17;
                }
                return new NalUnitUtil$H265SpsData(readBits, nalUnitUtil$H265ProfileTierLevel, readExpGolombCodeNum, i50, readExpGolombCodeNum3, i6, i8, i9, i7, f, i49, i12, i13, i14);
            }
        }
        i3 = 0;
        NalUnitUtil$H265ProfileTierLevel nalUnitUtil$H265ProfileTierLevel2 = null;
        if (z) {
        }
        wavFormat.readExpGolombCodeNum();
        if (z) {
        }
        int readExpGolombCodeNum122 = wavFormat.readExpGolombCodeNum();
        if (z) {
        }
        wavFormat.readExpGolombCodeNum();
        wavFormat.readExpGolombCodeNum();
        wavFormat.readExpGolombCodeNum();
        wavFormat.readExpGolombCodeNum();
        wavFormat.readExpGolombCodeNum();
        wavFormat.readExpGolombCodeNum();
        if (wavFormat.readBit()) {
        }
        wavFormat.skipBits(2);
        if (wavFormat.readBit()) {
        }
        readExpGolombCodeNum4 = wavFormat.readExpGolombCodeNum();
        i11 = 0;
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        int i302 = i3;
        int i312 = -1;
        int i322 = -1;
        while (i11 < readExpGolombCodeNum4) {
        }
        int i492 = i10;
        int i502 = readExpGolombCodeNum2;
        if (wavFormat.readBit()) {
        }
        wavFormat.skipBits(2);
        float f2 = 1.0f;
        if (wavFormat.readBit()) {
        }
        return new NalUnitUtil$H265SpsData(readBits, nalUnitUtil$H265ProfileTierLevel2, readExpGolombCodeNum, i502, readExpGolombCodeNum3, i6, i8, i9, i7, f2, i492, i12, i13, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UnleashContext parseH265VpsNalUnit(int i, int i2, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        NalUnitUtil$H265VideoSignalInfosAndIndices nalUnitUtil$H265VideoSignalInfosAndIndices;
        int i3;
        int i4;
        int i5;
        int i6;
        RegularImmutableList regularImmutableList;
        boolean[][] zArr;
        int i7;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i8;
        int i9;
        boolean readBit;
        int i10;
        int i11;
        int i12;
        boolean readBit2;
        int i13;
        int i14;
        boolean z;
        boolean z2;
        WavFormat wavFormat = new WavFormat(bArr, i, i2);
        parseH265NalHeader(wavFormat);
        wavFormat.skipBits(4);
        boolean readBit3 = wavFormat.readBit();
        boolean readBit4 = wavFormat.readBit();
        int readBits = wavFormat.readBits(6);
        int i15 = readBits + 1;
        int readBits2 = wavFormat.readBits(3);
        wavFormat.skipBits(17);
        NalUnitUtil$H265ProfileTierLevel parseH265ProfileTierLevel = parseH265ProfileTierLevel(wavFormat, true, readBits2, null);
        for (int i16 = wavFormat.readBit() ? 0 : readBits2; i16 <= readBits2; i16++) {
            wavFormat.readExpGolombCodeNum();
            wavFormat.readExpGolombCodeNum();
            wavFormat.readExpGolombCodeNum();
        }
        int readBits3 = wavFormat.readBits(6);
        int readExpGolombCodeNum = wavFormat.readExpGolombCodeNum() + 1;
        int i17 = 6;
        NalUnitUtil$H265VideoSignalInfosAndIndices nalUnitUtil$H265VideoSignalInfosAndIndices2 = new NalUnitUtil$H265VideoSignalInfosAndIndices(ImmutableList.of((Object) parseH265ProfileTierLevel), new int[1], 1);
        boolean z3 = i15 >= 2 && readExpGolombCodeNum >= 2;
        boolean z4 = readBit3 && readBit4;
        int i18 = readBits3 + 1;
        boolean z5 = i18 >= i15;
        if (!z3 || !z4 || !z5) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, readExpGolombCodeNum, i18);
        int i19 = 1;
        int[] iArr6 = new int[readExpGolombCodeNum];
        int[] iArr7 = new int[readExpGolombCodeNum];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i20 = 1; i20 < readExpGolombCodeNum; i20++) {
            int i21 = 0;
            for (int i22 = 0; i22 <= readBits3; i22++) {
                if (wavFormat.readBit()) {
                    iArr5[i20][i21] = i22;
                    iArr7[i20] = i22;
                    i21++;
                }
                iArr6[i20] = i21;
            }
        }
        if (wavFormat.readBit()) {
            wavFormat.skipBits(64);
            if (wavFormat.readBit()) {
                wavFormat.readExpGolombCodeNum();
            }
            int readExpGolombCodeNum2 = wavFormat.readExpGolombCodeNum();
            int i23 = 0;
            while (i23 < readExpGolombCodeNum2) {
                wavFormat.readExpGolombCodeNum();
                if (i23 == 0 || wavFormat.readBit()) {
                    boolean readBit5 = wavFormat.readBit();
                    boolean readBit6 = wavFormat.readBit();
                    z2 = readBit5;
                    z = readBit6;
                    if (readBit5 || readBit6) {
                        readBit = wavFormat.readBit();
                        if (readBit) {
                            wavFormat.skipBits(19);
                        }
                        wavFormat.skipBits(8);
                        if (readBit) {
                            wavFormat.skipBits(4);
                        }
                        wavFormat.skipBits(15);
                        i11 = readBit5;
                        i10 = readBit6;
                        i12 = 0;
                        while (i12 <= readBits2) {
                            boolean readBit7 = wavFormat.readBit();
                            if (!readBit7) {
                                readBit7 = wavFormat.readBit();
                            }
                            if (readBit7) {
                                wavFormat.readExpGolombCodeNum();
                                readBit2 = false;
                            } else {
                                readBit2 = wavFormat.readBit();
                            }
                            if (readBit2) {
                                i13 = i23;
                                i14 = 0;
                            } else {
                                i13 = i23;
                                i14 = wavFormat.readExpGolombCodeNum();
                            }
                            int[][] iArr8 = iArr5;
                            int i24 = i11 + i10;
                            int[] iArr9 = iArr7;
                            int i25 = 0;
                            while (i25 < i24) {
                                int i26 = i24;
                                for (int i27 = 0; i27 <= i14; i27++) {
                                    wavFormat.readExpGolombCodeNum();
                                    wavFormat.readExpGolombCodeNum();
                                    if (readBit) {
                                        wavFormat.readExpGolombCodeNum();
                                        wavFormat.readExpGolombCodeNum();
                                    }
                                    wavFormat.skipBit();
                                }
                                i25++;
                                i24 = i26;
                            }
                            i12++;
                            i23 = i13;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i23++;
                    }
                } else {
                    z2 = false;
                    z = false;
                }
                readBit = false;
                i11 = z2;
                i10 = z;
                i12 = 0;
                while (i12 <= readBits2) {
                }
                i23++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!wavFormat.readBit()) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        int i28 = wavFormat.bitsPerSample;
        if (i28 > 0) {
            wavFormat.skipBits(8 - i28);
        }
        NalUnitUtil$H265ProfileTierLevel parseH265ProfileTierLevel2 = parseH265ProfileTierLevel(wavFormat, false, readBits2, parseH265ProfileTierLevel);
        boolean readBit8 = wavFormat.readBit();
        boolean[] zArr3 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean readBit9 = wavFormat.readBit();
            zArr3[i30] = readBit9;
            if (readBit9) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr3[1]) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        int[] iArr12 = new int[i29];
        for (int i31 = 0; i31 < i29 - (readBit8 ? 1 : 0); i31++) {
            iArr12[i31] = wavFormat.readBits(3);
        }
        int[] iArr13 = new int[i29 + 1];
        if (readBit8) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr14 = iArr13;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr14[i32] = iArr12[i33] + 1 + iArr14[i32];
                }
                i32++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i29] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i15, i29);
        int[] iArr16 = new int[i15];
        iArr16[0] = 0;
        boolean readBit10 = wavFormat.readBit();
        int i34 = 1;
        while (i34 < i15) {
            if (readBit10) {
                i9 = i34;
                iArr16[i9] = wavFormat.readBits(i17);
            } else {
                i9 = i34;
                iArr16[i9] = i9;
            }
            if (readBit8) {
                for (int i35 = 0; i35 < i29; i35++) {
                    iArr15[i9][i35] = (iArr16[i9] & ((1 << iArr[r30]) - 1)) >> iArr[i35];
                }
            } else {
                int i36 = 0;
                while (i36 < i29) {
                    int i37 = i36;
                    iArr15[i9][i37] = wavFormat.readBits(iArr12[i36] + 1);
                    i36 = i37 + 1;
                }
            }
            i34 = i9 + 1;
            i17 = 6;
        }
        int[] iArr17 = new int[i18];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i15) {
            iArr17[iArr16[i39]] = -1;
            int[] iArr18 = iArr17;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr3[i40]) {
                    if (i40 == i19) {
                        iArr18[iArr16[i39]] = iArr15[i39][i41];
                    }
                    i41++;
                }
                i40++;
                i19 = 1;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    int i43 = i42;
                    if (iArr18[iArr16[i39]] == iArr18[iArr16[i42]]) {
                        break;
                    }
                    i42 = i43 + 1;
                }
            }
            i39++;
            iArr17 = iArr18;
            i19 = 1;
        }
        int[] iArr19 = iArr17;
        int readBits4 = wavFormat.readBits(4);
        if (i38 < 2 || readBits4 == 0) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        int[] iArr20 = new int[i38];
        for (int i44 = 0; i44 < i38; i44++) {
            iArr20[i44] = wavFormat.readBits(readBits4);
        }
        int[] iArr21 = new int[i18];
        for (int i45 = 0; i45 < i15; i45++) {
            iArr21[Math.min(iArr16[i45], readBits3)] = i45;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i46 = 0;
        while (i46 <= readBits3) {
            int[] iArr22 = iArr21;
            int i47 = i38;
            int min = Math.min(iArr19[i46], i47 - 1);
            builder.m2032add((Object) new NalUnitUtil$H265LayerInfo(iArr22[i46], min >= 0 ? iArr20[min] : -1));
            i46++;
            iArr21 = iArr22;
            iArr16 = iArr16;
            i38 = i47;
        }
        int[] iArr23 = iArr16;
        RegularImmutableList build = builder.build();
        if (((NalUnitUtil$H265LayerInfo) build.get(0)).viewId == -1) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > readBits3) {
                i48 = -1;
                break;
            }
            if (((NalUnitUtil$H265LayerInfo) build.get(i48)).viewId != -1) {
                break;
            }
            i48++;
        }
        if (i48 == -1) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        for (int i49 = 1; i49 < i15; i49++) {
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr4[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean readBit11 = wavFormat.readBit();
                zArr7[i50] = readBit11;
                zArr6[i50] = readBit11;
            }
        }
        for (int i51 = 1; i51 < i15; i51++) {
            int i52 = 0;
            while (i52 < readBits) {
                boolean[][] zArr8 = zArr4;
                int i53 = 0;
                while (true) {
                    if (i53 < i51) {
                        boolean[] zArr9 = zArr5[i51];
                        if (zArr9[i53] && zArr5[i53][i52]) {
                            zArr9[i52] = true;
                            break;
                        }
                        i53++;
                    }
                }
                i52++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr24 = new int[i18];
        for (int i54 = 0; i54 < i15; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr10[i54][i56] ? 1 : 0;
            }
            iArr24[iArr23[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i15; i58++) {
            if (iArr24[iArr23[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        int[] iArr25 = new int[i15];
        int[] iArr26 = new int[readExpGolombCodeNum];
        if (wavFormat.readBit()) {
            iArr2 = iArr24;
            int i59 = 0;
            while (i59 < i15) {
                int i60 = i59;
                iArr25[i60] = wavFormat.readBits(3);
                i59 = i60 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i15, readBits2);
        }
        int i61 = 0;
        while (i61 < readExpGolombCodeNum) {
            int i62 = i61;
            boolean[][] zArr11 = zArr5;
            int[] iArr27 = iArr25;
            int i63 = 0;
            for (int i64 = 0; i64 < iArr6[i62]; i64++) {
                i63 = Math.max(i63, iArr27[((NalUnitUtil$H265LayerInfo) build.get(iArr10[i62][i64])).layerIdInVps]);
            }
            iArr26[i62] = i63 + 1;
            i61 = i62 + 1;
            zArr5 = zArr11;
            iArr25 = iArr27;
        }
        boolean[][] zArr12 = zArr5;
        if (wavFormat.readBit()) {
            int i65 = 0;
            while (i65 < readBits) {
                int i66 = i65 + 1;
                int i67 = i66;
                while (i67 < i15) {
                    if (zArr10[i67][i65]) {
                        i8 = readBits;
                        wavFormat.skipBits(3);
                    } else {
                        i8 = readBits;
                    }
                    i67++;
                    readBits = i8;
                }
                i65 = i66;
            }
        }
        wavFormat.skipBit();
        int readExpGolombCodeNum3 = wavFormat.readExpGolombCodeNum() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.m2032add((Object) parseH265ProfileTierLevel);
        if (readExpGolombCodeNum3 > 1) {
            builder2.m2032add((Object) parseH265ProfileTierLevel2);
            for (int i68 = 2; i68 < readExpGolombCodeNum3; i68++) {
                parseH265ProfileTierLevel2 = parseH265ProfileTierLevel(wavFormat, wavFormat.readBit(), readBits2, parseH265ProfileTierLevel2);
                builder2.m2032add((Object) parseH265ProfileTierLevel2);
            }
        }
        RegularImmutableList build2 = builder2.build();
        int readExpGolombCodeNum4 = wavFormat.readExpGolombCodeNum() + readExpGolombCodeNum;
        if (readExpGolombCodeNum4 > readExpGolombCodeNum) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        int readBits5 = wavFormat.readBits(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, readExpGolombCodeNum4, i18);
        int[] iArr28 = new int[readExpGolombCodeNum4];
        int i69 = 0;
        int[] iArr29 = new int[readExpGolombCodeNum4];
        int i70 = 0;
        while (i70 < readExpGolombCodeNum) {
            iArr28[i70] = i69;
            iArr29[i70] = iArr11[i70];
            if (readBits5 == 0) {
                i7 = i70;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                Arrays.fill(zArr13[i7], i69, iArr6[i7], true);
                iArr3[i7] = iArr6[i7];
            } else {
                i7 = i70;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                if (readBits5 == 1) {
                    int i71 = iArr11[i7];
                    for (int i72 = 0; i72 < iArr6[i7]; i72++) {
                        zArr2[i7][i72] = iArr10[i7][i72] == i71;
                    }
                    iArr3[i7] = 1;
                } else {
                    i69 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i70 = i7 + 1;
                    zArr13 = zArr2;
                    iArr28 = iArr3;
                    iArr26 = iArr4;
                }
            }
            i69 = 0;
            i70 = i7 + 1;
            zArr13 = zArr2;
            iArr28 = iArr3;
            iArr26 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr30 = iArr28;
        int[] iArr31 = iArr26;
        int[] iArr32 = new int[i18];
        int i73 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i18;
        iArr33[i69] = readExpGolombCodeNum4;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i74 = 1;
        int i75 = 0;
        while (i74 < readExpGolombCodeNum4) {
            if (readBits5 == i73) {
                for (int i76 = 0; i76 < iArr6[i74]; i76++) {
                    zArr14[i74][i76] = wavFormat.readBit();
                    int i77 = iArr30[i74];
                    boolean z6 = zArr14[i74][i76];
                    iArr30[i74] = i77 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr29[i74] = iArr10[i74][i76];
                    }
                }
            }
            if (i75 == 0 && iArr10[i74][0] == 0 && zArr14[i74][0]) {
                for (int i78 = 1; i78 < iArr6[i74]; i78++) {
                    if (iArr10[i74][i78] == i48 && zArr14[i74][i48]) {
                        i75 = i74;
                    }
                }
            }
            int i79 = 0;
            while (i79 < iArr6[i74]) {
                if (readExpGolombCodeNum3 > 1) {
                    zArr15[i74][i79] = zArr14[i74][i79];
                    regularImmutableList = build2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int log2 = DoubleMath.log2(readExpGolombCodeNum3);
                    if (!zArr[i74][i79]) {
                        int i80 = ((NalUnitUtil$H265LayerInfo) build.get(iArr10[i74][i79])).layerIdInVps;
                        int i81 = 0;
                        while (true) {
                            if (i81 >= i79) {
                                break;
                            }
                            int i82 = i81;
                            if (zArr12[i80][((NalUnitUtil$H265LayerInfo) build.get(iArr10[i74][i82])).layerIdInVps]) {
                                zArr[i74][i79] = true;
                                break;
                            }
                            i81 = i82 + 1;
                        }
                    }
                    if (zArr[i74][i79]) {
                        if (i75 <= 0 || i74 != i75) {
                            wavFormat.skipBits(log2);
                        } else {
                            iArr32[i79] = wavFormat.readBits(log2);
                        }
                    }
                } else {
                    regularImmutableList = build2;
                    zArr = zArr15;
                }
                i79++;
                build2 = regularImmutableList;
                zArr15 = zArr;
            }
            RegularImmutableList regularImmutableList2 = build2;
            boolean[][] zArr16 = zArr15;
            if (iArr30[i74] == 1 && iArr2[iArr29[i74]] > 0) {
                wavFormat.skipBit();
            }
            i74++;
            build2 = regularImmutableList2;
            zArr15 = zArr16;
            i73 = 2;
        }
        RegularImmutableList regularImmutableList3 = build2;
        boolean[][] zArr17 = zArr15;
        if (i75 == 0) {
            return new UnleashContext((RegularImmutableList) null, nalUnitUtil$H265VideoSignalInfosAndIndices2, (Recorder.AnonymousClass1) null, (NalUnitUtil$H265VideoSignalInfosAndIndices) null);
        }
        int readExpGolombCodeNum5 = wavFormat.readExpGolombCodeNum();
        int i83 = readExpGolombCodeNum5 + 1;
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(i83);
        int[] iArr34 = new int[i15];
        for (int i84 = 0; i84 < i83; i84 = i6 + 1) {
            int readBits6 = wavFormat.readBits(16);
            int readBits7 = wavFormat.readBits(16);
            if (wavFormat.readBit()) {
                i3 = wavFormat.readBits(2);
                if (i3 == 3) {
                    wavFormat.skipBit();
                }
                i4 = wavFormat.readBits(4);
                i5 = wavFormat.readBits(4);
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (wavFormat.readBit()) {
                int readExpGolombCodeNum6 = wavFormat.readExpGolombCodeNum();
                int readExpGolombCodeNum7 = wavFormat.readExpGolombCodeNum();
                int readExpGolombCodeNum8 = wavFormat.readExpGolombCodeNum();
                int readExpGolombCodeNum9 = wavFormat.readExpGolombCodeNum();
                i6 = i84;
                readBits6 -= (readExpGolombCodeNum6 + readExpGolombCodeNum7) * ((i3 == 1 || i3 == 2) ? 2 : 1);
                readBits7 -= (readExpGolombCodeNum8 + readExpGolombCodeNum9) * (i3 == 1 ? 2 : 1);
            } else {
                i6 = i84;
            }
            builderWithExpectedSize.m2032add((Object) new NalUnitUtil$H265RepFormat(i3, i4, i5, readBits6, readBits7));
        }
        if (i83 <= 1 || !wavFormat.readBit()) {
            for (int i85 = 1; i85 < i15; i85++) {
                iArr34[i85] = Math.min(i85, readExpGolombCodeNum5);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int log22 = DoubleMath.log2(i83);
            for (int i86 = 1; i86 < i15; i86++) {
                iArr34[i86] = wavFormat.readBits(log22);
            }
        }
        Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(builderWithExpectedSize.build(), iArr34);
        wavFormat.skipBits(2);
        for (int i87 = 1; i87 < i15; i87++) {
            if (iArr2[iArr23[i87]] == 0) {
                wavFormat.skipBit();
            }
        }
        for (int i88 = 1; i88 < readExpGolombCodeNum4; i88++) {
            boolean readBit12 = wavFormat.readBit();
            int i89 = 0;
            while (i89 < iArr31[i88]) {
                if ((i89 <= 0 || !readBit12) ? i89 == 0 : wavFormat.readBit()) {
                    for (int i90 = 0; i90 < iArr6[i88]; i90++) {
                        if (zArr17[i88][i90]) {
                            wavFormat.readExpGolombCodeNum();
                        }
                    }
                    wavFormat.readExpGolombCodeNum();
                    wavFormat.readExpGolombCodeNum();
                }
                i89++;
            }
        }
        int readExpGolombCodeNum10 = wavFormat.readExpGolombCodeNum() + 2;
        if (wavFormat.readBit()) {
            wavFormat.skipBits(readExpGolombCodeNum10);
        } else {
            for (int i91 = 1; i91 < i15; i91++) {
                for (int i92 = 0; i92 < i91; i92++) {
                    if (zArr10[i91][i92]) {
                        wavFormat.skipBits(readExpGolombCodeNum10);
                    }
                }
            }
        }
        int readExpGolombCodeNum11 = wavFormat.readExpGolombCodeNum();
        for (int i93 = 1; i93 <= readExpGolombCodeNum11; i93++) {
            wavFormat.skipBits(8);
        }
        if (wavFormat.readBit()) {
            int i94 = wavFormat.bitsPerSample;
            if (i94 > 0) {
                wavFormat.skipBits(8 - i94);
            }
            if (!wavFormat.readBit() ? wavFormat.readBit() : true) {
                wavFormat.skipBit();
            }
            boolean readBit13 = wavFormat.readBit();
            boolean readBit14 = wavFormat.readBit();
            if (readBit13 || readBit14) {
                for (int i95 = 0; i95 < readExpGolombCodeNum; i95++) {
                    for (int i96 = 0; i96 < iArr31[i95]; i96++) {
                        boolean readBit15 = readBit13 ? wavFormat.readBit() : false;
                        boolean readBit16 = readBit14 ? wavFormat.readBit() : false;
                        if (readBit15) {
                            wavFormat.skipBits(32);
                        }
                        if (readBit16) {
                            wavFormat.skipBits(18);
                        }
                    }
                }
            }
            boolean readBit17 = wavFormat.readBit();
            int readBits8 = readBit17 ? wavFormat.readBits(4) + 1 : i15;
            ImmutableList.Builder builderWithExpectedSize2 = ImmutableList.builderWithExpectedSize(readBits8);
            int[] iArr35 = new int[i15];
            for (int i97 = 0; i97 < readBits8; i97++) {
                wavFormat.skipBits(3);
                int i98 = wavFormat.readBit() ? 1 : 2;
                int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(wavFormat.readBits(8));
                int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(wavFormat.readBits(8));
                wavFormat.skipBits(8);
                builderWithExpectedSize2.m2032add((Object) new NalUnitUtil$H265VideoSignalInfo(isoColorPrimariesToColorSpace, i98, isoTransferCharacteristicsToColorTransfer));
            }
            if (readBit17 && readBits8 > 1) {
                for (int i99 = 0; i99 < i15; i99++) {
                    iArr35[i99] = wavFormat.readBits(4);
                }
            }
            nalUnitUtil$H265VideoSignalInfosAndIndices = new NalUnitUtil$H265VideoSignalInfosAndIndices(builderWithExpectedSize2.build(), iArr35, 0);
        } else {
            nalUnitUtil$H265VideoSignalInfosAndIndices = null;
        }
        return new UnleashContext(build, new NalUnitUtil$H265VideoSignalInfosAndIndices(regularImmutableList3, iArr32, 1), anonymousClass1, nalUnitUtil$H265VideoSignalInfosAndIndices);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NalUnitUtil$SpsData parseSpsNalUnit(int i, int i2, byte[] bArr) {
        int readExpGolombCodeNum;
        int readExpGolombCodeNum2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean readBit;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f;
        int i15;
        int i16;
        int i17;
        boolean readBit2;
        boolean readBit3;
        int i18;
        WavFormat wavFormat = new WavFormat(bArr, i + 1, i2);
        int readBits = wavFormat.readBits(8);
        int readBits2 = wavFormat.readBits(8);
        int readBits3 = wavFormat.readBits(8);
        int readExpGolombCodeNum3 = wavFormat.readExpGolombCodeNum();
        if (readBits == 100 || readBits == 110 || readBits == 122 || readBits == 244 || readBits == 44 || readBits == 83 || readBits == 86 || readBits == 118 || readBits == 128 || readBits == 138) {
            readExpGolombCodeNum = wavFormat.readExpGolombCodeNum();
            boolean readBit4 = readExpGolombCodeNum == 3 ? wavFormat.readBit() : false;
            int readExpGolombCodeNum4 = wavFormat.readExpGolombCodeNum();
            readExpGolombCodeNum2 = wavFormat.readExpGolombCodeNum();
            wavFormat.skipBit();
            if (wavFormat.readBit()) {
                int i19 = readExpGolombCodeNum != 3 ? 8 : 12;
                i3 = 16;
                int i20 = 0;
                while (i20 < i19) {
                    if (wavFormat.readBit()) {
                        int i21 = i20 < 6 ? 16 : 64;
                        int i22 = 8;
                        int i23 = 8;
                        for (int i24 = 0; i24 < i21; i24++) {
                            if (i22 != 0) {
                                i22 = ((wavFormat.readSignedExpGolombCodedInt() + i23) + 256) % 256;
                            }
                            if (i22 != 0) {
                                i23 = i22;
                            }
                        }
                    }
                    i20++;
                }
            } else {
                i3 = 16;
            }
            z = readBit4;
            i4 = readExpGolombCodeNum4;
        } else {
            readExpGolombCodeNum = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            readExpGolombCodeNum2 = 0;
        }
        int readExpGolombCodeNum5 = wavFormat.readExpGolombCodeNum() + 4;
        int readExpGolombCodeNum6 = wavFormat.readExpGolombCodeNum();
        if (readExpGolombCodeNum6 == 0) {
            i8 = wavFormat.readExpGolombCodeNum() + 4;
            i5 = readBits;
            i6 = readExpGolombCodeNum6;
            i7 = readExpGolombCodeNum2;
        } else {
            if (readExpGolombCodeNum6 == 1) {
                boolean readBit5 = wavFormat.readBit();
                wavFormat.readSignedExpGolombCodedInt();
                wavFormat.readSignedExpGolombCodedInt();
                i5 = readBits;
                long readExpGolombCodeNum7 = wavFormat.readExpGolombCodeNum();
                i6 = readExpGolombCodeNum6;
                for (int i25 = 0; i25 < readExpGolombCodeNum7; i25++) {
                    wavFormat.readExpGolombCodeNum();
                }
                i7 = readExpGolombCodeNum2;
                z2 = readBit5;
                i8 = 0;
                wavFormat.readExpGolombCodeNum();
                wavFormat.skipBit();
                int readExpGolombCodeNum8 = wavFormat.readExpGolombCodeNum() + 1;
                int readExpGolombCodeNum9 = wavFormat.readExpGolombCodeNum() + 1;
                readBit = wavFormat.readBit();
                int i26 = 2 - (readBit ? 1 : 0);
                int i27 = readExpGolombCodeNum9 * i26;
                if (!readBit) {
                    wavFormat.skipBit();
                }
                wavFormat.skipBit();
                int i28 = readExpGolombCodeNum8 * 16;
                int i29 = i27 * 16;
                if (wavFormat.readBit()) {
                    int readExpGolombCodeNum10 = wavFormat.readExpGolombCodeNum();
                    int readExpGolombCodeNum11 = wavFormat.readExpGolombCodeNum();
                    int readExpGolombCodeNum12 = wavFormat.readExpGolombCodeNum();
                    int readExpGolombCodeNum13 = wavFormat.readExpGolombCodeNum();
                    if (readExpGolombCodeNum == 0) {
                        i18 = 1;
                    } else {
                        i18 = readExpGolombCodeNum == 3 ? 1 : 2;
                        i26 *= readExpGolombCodeNum == 1 ? 2 : 1;
                    }
                    i28 -= (readExpGolombCodeNum10 + readExpGolombCodeNum11) * i18;
                    i29 -= (readExpGolombCodeNum12 + readExpGolombCodeNum13) * i26;
                }
                int i30 = i29;
                int i31 = i28;
                int i32 = i5;
                int i33 = ((i32 != 44 || i32 == 86 || i32 == 100 || i32 == 110 || i32 == 122 || i32 == 244) && (readBits2 & 16) != 0) ? 0 : i3;
                int i34 = -1;
                float f2 = 1.0f;
                if (wavFormat.readBit()) {
                    i9 = readExpGolombCodeNum5;
                    i10 = i7;
                    i11 = i33;
                    i12 = -1;
                    i13 = -1;
                    i14 = i8;
                    f = 1.0f;
                    i15 = -1;
                } else {
                    if (wavFormat.readBit()) {
                        int readBits4 = wavFormat.readBits(8);
                        if (readBits4 == 255) {
                            int i35 = i3;
                            int readBits5 = wavFormat.readBits(i35);
                            int readBits6 = wavFormat.readBits(i35);
                            if (readBits5 != 0 && readBits6 != 0) {
                                f2 = readBits5 / readBits6;
                            }
                        } else if (readBits4 < 17) {
                            f2 = ASPECT_RATIO_IDC_VALUES[readBits4];
                        } else {
                            i9 = readExpGolombCodeNum5;
                            Fragment$5$$ExternalSyntheticOutline0.m(readBits4, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (wavFormat.readBit()) {
                                wavFormat.skipBit();
                            }
                            if (wavFormat.readBit()) {
                                i16 = -1;
                                i17 = -1;
                            } else {
                                wavFormat.skipBits(3);
                                i16 = wavFormat.readBit() ? 1 : 2;
                                if (wavFormat.readBit()) {
                                    int readBits7 = wavFormat.readBits(8);
                                    int readBits8 = wavFormat.readBits(8);
                                    wavFormat.skipBits(8);
                                    i34 = ColorInfo.isoColorPrimariesToColorSpace(readBits7);
                                    i17 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits8);
                                } else {
                                    i17 = -1;
                                }
                            }
                            if (wavFormat.readBit()) {
                                wavFormat.readExpGolombCodeNum();
                                wavFormat.readExpGolombCodeNum();
                            }
                            if (wavFormat.readBit()) {
                                wavFormat.skipBits(65);
                            }
                            readBit2 = wavFormat.readBit();
                            if (readBit2) {
                                skipHrdParameters(wavFormat);
                            }
                            readBit3 = wavFormat.readBit();
                            if (readBit3) {
                                skipHrdParameters(wavFormat);
                            }
                            if (!readBit2 || readBit3) {
                                wavFormat.skipBit();
                            }
                            wavFormat.skipBit();
                            if (wavFormat.readBit()) {
                                wavFormat.skipBit();
                                wavFormat.readExpGolombCodeNum();
                                wavFormat.readExpGolombCodeNum();
                                wavFormat.readExpGolombCodeNum();
                                wavFormat.readExpGolombCodeNum();
                                i33 = wavFormat.readExpGolombCodeNum();
                                wavFormat.readExpGolombCodeNum();
                            }
                            int i36 = i34;
                            i14 = i8;
                            f = f2;
                            i15 = i36;
                            i12 = i16;
                            i13 = i17;
                            i10 = i7;
                            i11 = i33;
                        }
                    }
                    i9 = readExpGolombCodeNum5;
                    if (wavFormat.readBit()) {
                    }
                    if (wavFormat.readBit()) {
                    }
                    if (wavFormat.readBit()) {
                    }
                    if (wavFormat.readBit()) {
                    }
                    readBit2 = wavFormat.readBit();
                    if (readBit2) {
                    }
                    readBit3 = wavFormat.readBit();
                    if (readBit3) {
                    }
                    if (!readBit2) {
                    }
                    wavFormat.skipBit();
                    wavFormat.skipBit();
                    if (wavFormat.readBit()) {
                    }
                    int i362 = i34;
                    i14 = i8;
                    f = f2;
                    i15 = i362;
                    i12 = i16;
                    i13 = i17;
                    i10 = i7;
                    i11 = i33;
                }
                return new NalUnitUtil$SpsData(i32, readBits2, readBits3, readExpGolombCodeNum3, i31, i30, f, i4, i10, z, readBit, i9, i6, i14, z2, i15, i12, i13, i11);
            }
            i5 = readBits;
            i6 = readExpGolombCodeNum6;
            i7 = readExpGolombCodeNum2;
            i8 = 0;
        }
        z2 = false;
        wavFormat.readExpGolombCodeNum();
        wavFormat.skipBit();
        int readExpGolombCodeNum82 = wavFormat.readExpGolombCodeNum() + 1;
        int readExpGolombCodeNum92 = wavFormat.readExpGolombCodeNum() + 1;
        readBit = wavFormat.readBit();
        int i262 = 2 - (readBit ? 1 : 0);
        int i272 = readExpGolombCodeNum92 * i262;
        if (!readBit) {
        }
        wavFormat.skipBit();
        int i282 = readExpGolombCodeNum82 * 16;
        int i292 = i272 * 16;
        if (wavFormat.readBit()) {
        }
        int i302 = i292;
        int i312 = i282;
        int i322 = i5;
        if (i322 != 44) {
        }
        int i342 = -1;
        float f22 = 1.0f;
        if (wavFormat.readBit()) {
        }
        return new NalUnitUtil$SpsData(i322, readBits2, readBits3, readExpGolombCodeNum3, i312, i302, f, i4, i10, z, readBit, i9, i6, i14, z2, i15, i12, i13, i11);
    }

    public static void skipHrdParameters(WavFormat wavFormat) {
        int readExpGolombCodeNum = wavFormat.readExpGolombCodeNum() + 1;
        wavFormat.skipBits(8);
        for (int i = 0; i < readExpGolombCodeNum; i++) {
            wavFormat.readExpGolombCodeNum();
            wavFormat.readExpGolombCodeNum();
            wavFormat.skipBit();
        }
        wavFormat.skipBits(20);
    }

    public static ArrayList split(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = asReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = asReadOnlyBuffer.get();
                        remaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new ObuParser$Obu(i, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int unescapeStream(int i, byte[] bArr) {
        int i2;
        synchronized (scratchEscapePositionsLock) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = scratchEscapePositions;
                    if (iArr.length <= i4) {
                        scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    scratchEscapePositions[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = scratchEscapePositions[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
