package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil$H265LayerInfo;
import androidx.media3.container.NalUnitUtil$H265ProfileTierLevel;
import androidx.media3.container.NalUnitUtil$H265SpsData;
import androidx.media3.container.OpusUtil;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.dynamite.zzo;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int decodedHeight;
    public final int decodedWidth;
    public final List initializationData;
    public final int maxNumReorderPics;
    public final int maxSubLayers;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;
    public final UnleashContext vpsData;

    public HevcConfig(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, UnleashContext unleashContext) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.maxSubLayers = i2;
        this.decodedWidth = i3;
        this.decodedHeight = i4;
        this.bitdepthLuma = i5;
        this.bitdepthChroma = i6;
        this.colorSpace = i7;
        this.colorRange = i8;
        this.colorTransfer = i9;
        this.stereoMode = i10;
        this.pixelWidthHeightRatio = f;
        this.maxNumReorderPics = i11;
        this.codecs = str;
        this.vpsData = unleashContext;
    }

    public static HevcConfig parseImpl(ParsableByteArray parsableByteArray, boolean z, UnleashContext unleashContext) {
        boolean z2;
        zzo parseH265Sei3dRefDisplayInfo;
        int i;
        int i2 = 4;
        try {
            if (z) {
                parsableByteArray.skipBytes(4);
            } else {
                parsableByteArray.skipBytes(21);
            }
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int i3 = parsableByteArray.position;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= readUnsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i7 = 0; i7 < readUnsignedShort; i7++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i6 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
                i5++;
            }
            parsableByteArray.setPosition(i3);
            byte[] bArr = new byte[i6];
            UnleashContext unleashContext2 = unleashContext;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String str = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < readUnsignedByte2) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                int i20 = i4;
                UnleashContext unleashContext3 = unleashContext2;
                while (i20 < readUnsignedShort3) {
                    boolean z3 = z2;
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    int i21 = readUnsignedByte;
                    System.arraycopy(OpusUtil.NAL_START_CODE, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(parsableByteArray.data, parsableByteArray.position, bArr, i22, readUnsignedShort4);
                    if (readUnsignedByte3 == 32 && i20 == 0) {
                        unleashContext3 = OpusUtil.parseH265VpsNalUnit(i22, i22 + readUnsignedShort4, bArr);
                    } else {
                        if (readUnsignedByte3 == 33 && i20 == 0) {
                            NalUnitUtil$H265SpsData parseH265SpsNalUnit = OpusUtil.parseH265SpsNalUnit(bArr, i22, i22 + readUnsignedShort4, unleashContext3);
                            i8 = parseH265SpsNalUnit.maxSubLayersMinus1 + 1;
                            i9 = parseH265SpsNalUnit.decodedWidth;
                            int i23 = parseH265SpsNalUnit.decodedHeight;
                            i11 = parseH265SpsNalUnit.bitDepthLumaMinus8 + 8;
                            i12 = parseH265SpsNalUnit.bitDepthChromaMinus8 + 8;
                            int i24 = parseH265SpsNalUnit.colorSpace;
                            i10 = i23;
                            int i25 = parseH265SpsNalUnit.colorRange;
                            int i26 = parseH265SpsNalUnit.colorTransfer;
                            float f2 = parseH265SpsNalUnit.pixelWidthHeightRatio;
                            int i27 = parseH265SpsNalUnit.maxNumReorderPics;
                            NalUnitUtil$H265ProfileTierLevel nalUnitUtil$H265ProfileTierLevel = parseH265SpsNalUnit.profileTierLevel;
                            if (nalUnitUtil$H265ProfileTierLevel != null) {
                                i = i27;
                                str = CodecSpecificDataUtil.buildHevcCodecString(nalUnitUtil$H265ProfileTierLevel.generalProfileSpace, nalUnitUtil$H265ProfileTierLevel.generalProfileIdc, nalUnitUtil$H265ProfileTierLevel.generalProfileCompatibilityFlags, nalUnitUtil$H265ProfileTierLevel.constraintBytes, nalUnitUtil$H265ProfileTierLevel.generalTierFlag, nalUnitUtil$H265ProfileTierLevel.generalLevelIdc);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (readUnsignedByte3 == 39 && i20 == 0 && (parseH265Sei3dRefDisplayInfo = OpusUtil.parseH265Sei3dRefDisplayInfo(i22, i22 + readUnsignedShort4, bArr)) != null && unleashContext3 != null) {
                            i4 = 0;
                            i16 = parseH265Sei3dRefDisplayInfo.zza == ((NalUnitUtil$H265LayerInfo) ((ImmutableList) unleashContext3.userId).get(0)).viewId ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                    i20++;
                    z2 = z3;
                    readUnsignedByte = i21;
                    i2 = 4;
                }
                i18++;
                unleashContext2 = unleashContext3;
                i2 = 4;
            }
            return new HevcConfig(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), readUnsignedByte + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str, unleashContext2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
