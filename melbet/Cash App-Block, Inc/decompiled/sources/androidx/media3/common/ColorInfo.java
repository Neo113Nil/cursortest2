package androidx.media3.common;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ColorInfo {
    public static final ColorInfo SDR_BT709_LIMITED = new ColorInfo(1, 2, 3, -1, -1, null);
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public int hashCode;
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;

    static {
        Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
        Util.intToStringMaxRadix(5);
    }

    public ColorInfo(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i4;
        this.chromaBitdepth = i5;
    }

    public static String colorRangeToString(int i) {
        return i != -1 ? i != 1 ? i != 2 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String colorSpaceToString(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static int colorTransferToIsoTransferCharacteristics(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 13;
        }
        if (i == 6) {
            return 16;
        }
        if (i != 7) {
            return i != 10 ? 1 : 4;
        }
        return 18;
    }

    public static String colorTransferToString(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean isEquivalentToAssumedSdrDefault(ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i = colorInfo.colorSpace;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = colorInfo.colorRange;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = colorInfo.colorTransfer;
        if ((i3 != -1 && i3 != 3) || colorInfo.hdrStaticInfo != null) {
            return false;
        }
        int i4 = colorInfo.chromaBitdepth;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = colorInfo.lumaBitdepth;
        return i5 == -1 || i5 == 8;
    }

    public static int isoColorPrimariesToColorSpace(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((Arrays.hashCode(this.hdrStaticInfo) + ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31)) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.hashCode;
    }

    public final boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(colorSpaceToString(this.colorSpace));
        sb.append(", ");
        sb.append(colorRangeToString(this.colorRange));
        sb.append(", ");
        sb.append(colorTransferToString(this.colorTransfer));
        sb.append(", ");
        sb.append(this.hdrStaticInfo != null);
        sb.append(", ");
        int i = this.lumaBitdepth;
        sb.append(i != -1 ? Boxes$$ExternalSyntheticOutline1.m(i, "bit Luma") : "NA");
        sb.append(", ");
        int i2 = this.chromaBitdepth;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, i2 != -1 ? Boxes$$ExternalSyntheticOutline1.m(i2, "bit Chroma") : "NA", ")");
    }
}
