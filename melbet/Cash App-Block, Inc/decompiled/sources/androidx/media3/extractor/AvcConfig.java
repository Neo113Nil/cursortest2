package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil$SpsData;
import androidx.media3.container.OpusUtil;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final ArrayList initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public AvcConfig(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.initializationData = arrayList;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.bitdepthLuma = i4;
        this.bitdepthChroma = i5;
        this.colorSpace = i6;
        this.colorRange = i7;
        this.colorTransfer = i8;
        this.maxNumReorderFrames = i9;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i9 = 0; i9 < readUnsignedByte2; i9++) {
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int i10 = parsableByteArray.position;
                parsableByteArray.skipBytes(readUnsignedShort);
                byte[] bArr = parsableByteArray.data;
                byte[] bArr2 = new byte[readUnsignedShort + 4];
                System.arraycopy(CodecSpecificDataUtil.NAL_START_CODE, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, readUnsignedShort);
                arrayList.add(bArr2);
            }
            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i11 = 0; i11 < readUnsignedByte3; i11++) {
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                int i12 = parsableByteArray.position;
                parsableByteArray.skipBytes(readUnsignedShort2);
                byte[] bArr3 = parsableByteArray.data;
                byte[] bArr4 = new byte[readUnsignedShort2 + 4];
                System.arraycopy(CodecSpecificDataUtil.NAL_START_CODE, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, readUnsignedShort2);
                arrayList.add(bArr4);
            }
            if (readUnsignedByte2 > 0) {
                NalUnitUtil$SpsData parseSpsNalUnit = OpusUtil.parseSpsNalUnit(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = parseSpsNalUnit.width;
                int i14 = parseSpsNalUnit.height;
                int i15 = parseSpsNalUnit.bitDepthLumaMinus8 + 8;
                int i16 = parseSpsNalUnit.bitDepthChromaMinus8 + 8;
                int i17 = parseSpsNalUnit.colorSpace;
                int i18 = parseSpsNalUnit.colorRange;
                int i19 = parseSpsNalUnit.colorTransfer;
                int i20 = parseSpsNalUnit.maxNumReorderFrames;
                float f2 = parseSpsNalUnit.pixelWidthHeightRatio;
                int i21 = parseSpsNalUnit.profileIdc;
                int i22 = parseSpsNalUnit.constraintsFlagsAndReservedZero2Bits;
                int i23 = parseSpsNalUnit.levelIdc;
                byte[] bArr5 = CodecSpecificDataUtil.NAL_START_CODE;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new AvcConfig(arrayList, readUnsignedByte, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer(e, "Error parsing AVC config");
        }
    }
}
