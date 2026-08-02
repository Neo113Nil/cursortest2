package com.google.zxing.qrcode.encoder;

import androidx.compose.runtime.OffsetApplier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.Version;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class MaskUtil {
    public static final int[][] POSITION_DETECTION_PATTERN = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] POSITION_ADJUSTMENT_PATTERN = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, -1}, new int[]{6, 30, 54, 78, 102, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, -1}, new int[]{6, 26, 52, 78, 104, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, -1}, new int[]{6, 30, 56, 82, 108, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, -1}, new int[]{6, 34, 60, 86, 112, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, -1}, new int[]{6, 30, 58, 86, 114, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, -1}, new int[]{6, 34, 62, 90, 118, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, -1}, new int[]{6, 30, 54, 78, 102, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 150}, new int[]{6, 24, 50, 76, 102, 128, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, new int[]{6, 28, 54, 80, 106, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, new int[]{6, 32, 58, 84, 110, 136, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, new int[]{6, 26, 54, 82, 110, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, new int[]{6, 30, 58, 86, 114, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}};
    public static final int[][] TYPE_INFO_COORDINATES = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int applyMaskPenaltyRule1Internal(OffsetApplier offsetApplier, boolean z) {
        int i = offsetApplier.offset;
        int i2 = offsetApplier.nesting;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) offsetApplier.applier;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void buildMatrix(BitArray bitArray, int i, Version version, int i2, OffsetApplier offsetApplier) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        byte[][] bArr = (byte[][]) offsetApplier.applier;
        int i11 = offsetApplier.offset;
        int i12 = offsetApplier.nesting;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = POSITION_DETECTION_PATTERN[0].length;
        embedPositionDetectionPattern(0, 0, offsetApplier);
        int i13 = i11 - length;
        embedPositionDetectionPattern(i13, 0, offsetApplier);
        embedPositionDetectionPattern(0, i13, offsetApplier);
        embedHorizontalSeparationPattern(0, 7, offsetApplier);
        int i14 = i11 - 8;
        embedHorizontalSeparationPattern(i14, 7, offsetApplier);
        embedHorizontalSeparationPattern(0, i14, offsetApplier);
        embedVerticalSeparationPattern(7, 0, offsetApplier);
        int i15 = i12 - 8;
        embedVerticalSeparationPattern(i15, 0, offsetApplier);
        int i16 = i12 - 7;
        embedVerticalSeparationPattern(7, i16, offsetApplier);
        if (offsetApplier.get(8, i15) == 0) {
            throw new WriterException();
        }
        offsetApplier.set(8, i15, 1);
        int i17 = version.versionNumber;
        if (i17 < 2) {
            i3 = 0;
        } else {
            i3 = 0;
            int[] iArr = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[i17 - 1];
            int length2 = iArr.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = iArr[i18];
                if (i19 >= 0) {
                    int length3 = iArr.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = iArr[i20];
                        if (i21 >= 0 && isEmpty(offsetApplier.get(i21, i19))) {
                            int i22 = i21 - 2;
                            int i23 = i19 - 2;
                            i4 = i18;
                            i5 = i11;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= 5) {
                                    break;
                                }
                                int[] iArr2 = POSITION_ADJUSTMENT_PATTERN[i24];
                                int i25 = i24;
                                int i26 = 0;
                                for (int i27 = 5; i26 < i27; i27 = 5) {
                                    int i28 = i26;
                                    offsetApplier.set(i22 + i26, i23 + i25, iArr2[i28]);
                                    i26 = i28 + 1;
                                    iArr = iArr;
                                }
                                i24 = i25 + 1;
                            }
                        } else {
                            i4 = i18;
                            i5 = i11;
                        }
                        i20++;
                        i18 = i4;
                        i11 = i5;
                        iArr = iArr;
                    }
                }
                i18++;
                i11 = i11;
                iArr = iArr;
            }
        }
        int i29 = i11;
        int i30 = 8;
        while (i30 < i14) {
            int i31 = i30 + 1;
            int i32 = i31 % 2;
            if (isEmpty(offsetApplier.get(i30, 6))) {
                offsetApplier.set(i30, 6, i32);
            }
            if (isEmpty(offsetApplier.get(6, i30))) {
                offsetApplier.set(6, i30, i32);
            }
            i30 = i31;
        }
        BitArray bitArray2 = new BitArray();
        if (i2 < 0 || i2 >= 8) {
            throw new WriterException("Invalid mask pattern");
        }
        if (i == 1) {
            i6 = 1;
        } else if (i == 2) {
            i6 = i3;
        } else if (i == 3) {
            i6 = 3;
        } else {
            if (i != 4) {
                throw null;
            }
            i6 = 2;
        }
        int i33 = (i6 << 3) | i2;
        bitArray2.appendBits(i33, 5);
        bitArray2.appendBits(calculateBCHCode(i33, 1335), 10);
        BitArray bitArray3 = new BitArray();
        bitArray3.appendBits(21522, 15);
        if (bitArray2.size != bitArray3.size) {
            a$$ExternalSyntheticBUOutline0.m$3("Sizes don't match");
            return;
        }
        int i34 = i3;
        while (true) {
            int[] iArr3 = bitArray2.bits;
            if (i34 >= iArr3.length) {
                break;
            }
            iArr3[i34] = iArr3[i34] ^ bitArray3.bits[i34];
            i34++;
        }
        if (bitArray2.size != 15) {
            throw new WriterException("should not happen but we got: " + bitArray2.size);
        }
        int i35 = i3;
        while (true) {
            int i36 = bitArray2.size;
            if (i35 >= i36) {
                break;
            }
            boolean z2 = bitArray2.get((i36 - 1) - i35);
            int[] iArr4 = TYPE_INFO_COORDINATES[i35];
            offsetApplier.set(iArr4[i3], iArr4[1], z2);
            if (i35 < 8) {
                i10 = (i29 - i35) - 1;
                i9 = 8;
            } else {
                i9 = (i35 - 8) + i16;
                i10 = 8;
            }
            offsetApplier.set(i10, i9, z2);
            i35++;
        }
        if (i17 >= 7) {
            BitArray bitArray4 = new BitArray();
            bitArray4.appendBits(i17, 6);
            bitArray4.appendBits(calculateBCHCode(i17, 7973), 12);
            if (bitArray4.size != 18) {
                throw new WriterException("should not happen but we got: " + bitArray4.size);
            }
            int i37 = 17;
            for (int i38 = i3; i38 < 6; i38++) {
                for (int i39 = i3; i39 < 3; i39++) {
                    boolean z3 = bitArray4.get(i37);
                    i37--;
                    int i40 = (i12 - 11) + i39;
                    offsetApplier.set(i38, i40, z3);
                    offsetApplier.set(i40, i38, z3);
                }
            }
        }
        int i41 = i29 - 1;
        int i42 = i12 - 1;
        int i43 = i3;
        int i44 = -1;
        while (i41 > 0) {
            if (i41 == 6) {
                i41--;
            }
            while (i42 >= 0 && i42 < i12) {
                for (int i45 = i3; i45 < 2; i45++) {
                    int i46 = i41 - i45;
                    if (isEmpty(offsetApplier.get(i46, i42))) {
                        if (i43 < bitArray.size) {
                            z = bitArray.get(i43);
                            i43++;
                        } else {
                            z = i3;
                        }
                        if (i2 != -1) {
                            switch (i2) {
                                case 0:
                                    i7 = i42 + i46;
                                    i8 = i7 & 1;
                                    if (i8 == 0) {
                                        z = !z;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i8 = i42 & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 2:
                                    i8 = i46 % 3;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 3:
                                    i8 = (i42 + i46) % 3;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 4:
                                    i8 = ((i46 / 3) + (i42 / 2)) & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 5:
                                    int i47 = i42 * i46;
                                    i8 = (i47 % 3) + (i47 & 1);
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 6:
                                    int i48 = i42 * i46;
                                    i8 = ((i48 % 3) + (i48 & 1)) & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 7:
                                    i7 = ((i42 * i46) % 3) + ((i42 + i46) & 1);
                                    i8 = i7 & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                default:
                                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Invalid mask pattern: "));
                                    return;
                            }
                        }
                        offsetApplier.set(i46, i42, z);
                    }
                }
                i42 += i44;
            }
            i44 = -i44;
            i42 += i44;
            i41 -= 2;
        }
        if (i43 == bitArray.size) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i43 + '/' + bitArray.size);
    }

    public static int calculateBCHCode(int i, int i2) {
        if (i2 == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("0 polynomial");
            return 0;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - numberOfLeadingZeros;
        int i4 = i << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i4) >= i3) {
            i4 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i4)) - i3);
        }
        return i4;
    }

    public static void embedHorizontalSeparationPattern(int i, int i2, OffsetApplier offsetApplier) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!isEmpty(offsetApplier.get(i4, i2))) {
                throw new WriterException();
            }
            offsetApplier.set(i4, i2, 0);
        }
    }

    public static void embedPositionDetectionPattern(int i, int i2, OffsetApplier offsetApplier) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = POSITION_DETECTION_PATTERN[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                offsetApplier.set(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void embedVerticalSeparationPattern(int i, int i2, OffsetApplier offsetApplier) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!isEmpty(offsetApplier.get(i, i4))) {
                throw new WriterException();
            }
            offsetApplier.set(i, i4, 0);
        }
    }

    public static boolean isEmpty(int i) {
        return i == -1;
    }
}
