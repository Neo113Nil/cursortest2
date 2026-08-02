package com.google.zxing.oned;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Result;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class Code128Writer implements Writer {
    static {
        Pattern.compile("[0-9]+");
    }

    public static int findCType(int i, String str) {
        char charAt;
        int length = str.length();
        if (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 == 241) {
                return 4;
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                int i2 = i + 1;
                return (i2 < length && (charAt = str.charAt(i2)) >= '0' && charAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    public static boolean[] produceResult(int i, ArrayList arrayList) {
        int i2 = i % 103;
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Unable to compute a valid input checksum");
            return null;
        }
        int[][] iArr = Code128Reader.CODE_PATTERNS;
        arrayList.add(iArr[i2]);
        arrayList.add(iArr[106]);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            for (int i4 : (int[]) it.next()) {
                i3 += i4;
            }
        }
        boolean[] zArr = new boolean[i3];
        Iterator it2 = arrayList.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            boolean z = true;
            int i6 = 0;
            int i7 = i5;
            for (int i8 : (int[]) it2.next()) {
                int i9 = 0;
                while (i9 < i8) {
                    zArr[i7] = z;
                    i9++;
                    i7++;
                }
                i6 += i8;
                z = !z;
            }
            i5 += i6;
        }
        return zArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0278, code lost:
    
        if (r15 > 244) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0293, code lost:
    
        if (r15 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02e1, code lost:
    
        if (r15 == 3) goto L183;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00b3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00c3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    @Override // com.google.zxing.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        int i3;
        int i4;
        int i5;
        int length;
        int i6;
        char c;
        int i7;
        int length2;
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
        int length3;
        int i18;
        int i19;
        char c2;
        boolean[] zArr = null;
        if (str.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Found empty contents");
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        Set singleton = Collections.singleton(BarcodeFormat.CODE_128);
        if (singleton != null && !singleton.contains(barcodeFormat)) {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Can only encode ", singleton, ", but got ", barcodeFormat);
            return null;
        }
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                i3 = Integer.parseInt(map.get(encodeHintType).toString());
                i4 = 2;
                boolean z = false;
                if (map != null) {
                    EncodeHintType encodeHintType2 = EncodeHintType.FORCE_CODE_SET;
                    if (map.containsKey(encodeHintType2)) {
                        String obj = map.get(encodeHintType2).toString();
                        obj.getClass();
                        switch (obj.hashCode()) {
                            case 65:
                                if (obj.equals(GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS)) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66:
                                if (obj.equals("B")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 67:
                                if (obj.equals("C")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                i5 = 101;
                                length = str.length();
                                for (i6 = 0; i6 < length; i6++) {
                                    char charAt = str.charAt(i6);
                                    switch (charAt) {
                                        default:
                                            if (charAt > 127) {
                                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(charAt, "Bad character in input: ASCII value="));
                                                i7 = 0;
                                                break;
                                            }
                                        case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                                            switch (i5) {
                                                case 99:
                                                    if (charAt < '0' || ((charAt > '9' && charAt <= 127) || charAt == 242 || charAt == 243 || charAt == 244)) {
                                                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(charAt, "Bad character in input for forced code set C: ASCII value="));
                                                        i7 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case 100:
                                                    if (charAt < ' ') {
                                                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(charAt, "Bad character in input for forced code set B: ASCII value="));
                                                        i7 = 0;
                                                        break;
                                                    }
                                                case 101:
                                                    if (charAt > '_' && charAt <= 127) {
                                                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(charAt, "Bad character in input for forced code set A: ASCII value="));
                                                        i7 = 0;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                            }
                                            break;
                                    }
                                }
                                c = 241;
                                int i20 = 3;
                                if (map != null) {
                                    EncodeHintType encodeHintType3 = EncodeHintType.CODE128_COMPACT;
                                    if (map.containsKey(encodeHintType3) && Boolean.parseBoolean(map.get(encodeHintType3).toString())) {
                                        Result result = new Result(15, z);
                                        int[] iArr = {4, str.length()};
                                        Class cls = Integer.TYPE;
                                        result.text = (int[][]) Array.newInstance((Class<?>) cls, iArr);
                                        result.resultMetadata = (int[][]) Array.newInstance((Class<?>) cls, 4, str.length());
                                        result.encode(4, 0, str);
                                        ArrayList arrayList = new ArrayList();
                                        int[] iArr2 = {0};
                                        int[] iArr3 = {1};
                                        i7 = 0;
                                        int length4 = str.length();
                                        int i21 = 4;
                                        int i22 = 0;
                                        while (i22 < length4) {
                                            int i23 = ((int[][]) result.resultMetadata)[CameraSelector$$ExternalSyntheticOutline0.ordinal(i21)][i22];
                                            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i23);
                                            if (ordinal == 0) {
                                                Result.addPattern(arrayList, i22 == 0 ? 103 : 101, iArr2, iArr3, i22);
                                                i15 = 1;
                                            } else if (ordinal == 1) {
                                                Result.addPattern(arrayList, i22 == 0 ? 104 : 100, iArr2, iArr3, i22);
                                                i15 = 2;
                                            } else if (ordinal != 2) {
                                                if (ordinal == i20) {
                                                    Result.addPattern(arrayList, 98, iArr2, iArr3, i22);
                                                }
                                                i15 = i21;
                                            } else {
                                                Result.addPattern(arrayList, i22 == 0 ? 105 : 99, iArr2, iArr3, i22);
                                                i15 = i20;
                                            }
                                            if (i15 != i20) {
                                                switch (str.charAt(i22)) {
                                                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                                                        i16 = 4;
                                                        i17 = 102;
                                                        break;
                                                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                                                        i16 = 4;
                                                        i17 = 97;
                                                        break;
                                                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                                                        i16 = 4;
                                                        i17 = 96;
                                                        break;
                                                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                                                        i16 = 4;
                                                        if ((i15 != 1 || i23 == 4) && (i15 != 2 || i23 != 4)) {
                                                            i17 = 100;
                                                            break;
                                                        } else {
                                                            i17 = 101;
                                                            break;
                                                        }
                                                    default:
                                                        i17 = str.charAt(i22) - ' ';
                                                        i16 = 4;
                                                        break;
                                                }
                                                if (((i15 == 1 && i23 != i16) || (i15 == 2 && i23 == i16)) && i17 < 0) {
                                                    i17 += 96;
                                                }
                                                Result.addPattern(arrayList, i17, iArr2, iArr3, i22);
                                            } else if (str.charAt(i22) == 241) {
                                                Result.addPattern(arrayList, 102, iArr2, iArr3, i22);
                                            } else {
                                                Result.addPattern(arrayList, Integer.parseInt(str.substring(i22, i22 + 2)), iArr2, iArr3, i22);
                                                int i24 = i22 + 1;
                                                if (i24 < length4) {
                                                    i22 = i24;
                                                }
                                            }
                                            i22++;
                                            i21 = i15;
                                            i20 = 3;
                                        }
                                        result.text = null;
                                        result.resultMetadata = null;
                                        zArr = produceResult(iArr2[0], arrayList);
                                        break;
                                    }
                                }
                                i7 = 0;
                                char c3 = ' ';
                                length2 = str.length();
                                ArrayList arrayList2 = new ArrayList();
                                int i25 = 1;
                                i8 = 0;
                                int i26 = 0;
                                i9 = 0;
                                while (true) {
                                    if (i8 >= length2) {
                                        zArr = produceResult(i26, arrayList2);
                                        break;
                                    } else {
                                        if (i5 == -1) {
                                            int findCType = findCType(i8, str);
                                            if (findCType != i4) {
                                                if (findCType != 1) {
                                                    i10 = 96;
                                                    if (i9 == 101) {
                                                        i14 = 4;
                                                        break;
                                                    } else {
                                                        i14 = 4;
                                                    }
                                                    if (i9 == 99) {
                                                        i11 = 99;
                                                    } else if (i9 != 100) {
                                                        if (findCType == i14) {
                                                            findCType = findCType(i8 + 1, str);
                                                        }
                                                        break;
                                                    } else {
                                                        if (findCType != i14) {
                                                            int findCType2 = findCType(i8 + 2, str);
                                                            if (findCType2 != 1 && findCType2 != 2) {
                                                                if (findCType2 != i14) {
                                                                    int i27 = 3;
                                                                    int i28 = i8 + 4;
                                                                    while (true) {
                                                                        int findCType3 = findCType(i28, str);
                                                                        if (findCType3 == i27) {
                                                                            i28 += 2;
                                                                            i27 = 3;
                                                                        } else if (findCType3 != 2) {
                                                                        }
                                                                    }
                                                                } else if (findCType(i8 + 3, str) != 3) {
                                                                    i11 = 100;
                                                                }
                                                                i11 = 99;
                                                            }
                                                        }
                                                        i11 = 100;
                                                    }
                                                } else {
                                                    if (i8 < str.length()) {
                                                        char charAt2 = str.charAt(i8);
                                                        if (charAt2 < c3) {
                                                            i10 = 96;
                                                        } else if (i9 == 101) {
                                                            i10 = 96;
                                                            if (charAt2 >= '`') {
                                                                if (charAt2 >= c) {
                                                                }
                                                                i11 = 100;
                                                            }
                                                        }
                                                        i11 = 101;
                                                    }
                                                    i10 = 96;
                                                    i11 = 100;
                                                }
                                            } else if (i9 == 101) {
                                                i11 = 101;
                                                i10 = 96;
                                            } else {
                                                i10 = 96;
                                                i11 = 100;
                                            }
                                        } else {
                                            i10 = 96;
                                            i11 = i5;
                                        }
                                        if (i11 == i9) {
                                            switch (str.charAt(i8)) {
                                                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                                                    c3 = ' ';
                                                    i13 = 102;
                                                    break;
                                                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                                                    c3 = ' ';
                                                    i13 = 97;
                                                    break;
                                                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                                                    c3 = ' ';
                                                    i13 = i10;
                                                    break;
                                                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                                                    c3 = ' ';
                                                    if (i9 == 101) {
                                                        i13 = 101;
                                                        break;
                                                    } else {
                                                        i13 = 100;
                                                        break;
                                                    }
                                                default:
                                                    if (i9 != 100) {
                                                        if (i9 != 101) {
                                                            int i29 = i8 + 1;
                                                            if (i29 == length2) {
                                                                a$$ExternalSyntheticBUOutline0.m$3("Bad number of characters for digit only encoding.");
                                                                zArr = null;
                                                                break;
                                                            } else {
                                                                i13 = Integer.parseInt(str.substring(i8, i8 + 2));
                                                                i8 = i29;
                                                            }
                                                        } else {
                                                            char charAt3 = str.charAt(i8);
                                                            i13 = charAt3 - ' ';
                                                            if (i13 < 0) {
                                                                i13 = charAt3 + '@';
                                                            }
                                                        }
                                                        c3 = ' ';
                                                        break;
                                                    } else {
                                                        c3 = ' ';
                                                        i13 = str.charAt(i8) - ' ';
                                                        break;
                                                    }
                                            }
                                            i8++;
                                            i12 = i13;
                                            i11 = i9;
                                        } else {
                                            c3 = ' ';
                                            i12 = i9 == 0 ? i11 != 100 ? i11 != 101 ? 105 : 103 : 104 : i11;
                                        }
                                        arrayList2.add(Code128Reader.CODE_PATTERNS[i12]);
                                        i26 = (i12 * i25) + i26;
                                        if (i8 != 0) {
                                            i25++;
                                        }
                                        i9 = i11;
                                        i4 = 2;
                                        c = 241;
                                    }
                                }
                                break;
                            case 1:
                                i5 = 100;
                                length = str.length();
                                while (i6 < length) {
                                }
                                c = 241;
                                int i202 = 3;
                                if (map != null) {
                                }
                                i7 = 0;
                                char c32 = ' ';
                                length2 = str.length();
                                ArrayList arrayList22 = new ArrayList();
                                int i252 = 1;
                                i8 = 0;
                                int i262 = 0;
                                i9 = 0;
                                while (true) {
                                    if (i8 >= length2) {
                                    }
                                    i9 = i11;
                                    i4 = 2;
                                    c = 241;
                                }
                                break;
                            case 2:
                                i5 = 99;
                                length = str.length();
                                while (i6 < length) {
                                }
                                c = 241;
                                int i2022 = 3;
                                if (map != null) {
                                }
                                i7 = 0;
                                char c322 = ' ';
                                length2 = str.length();
                                ArrayList arrayList222 = new ArrayList();
                                int i2522 = 1;
                                i8 = 0;
                                int i2622 = 0;
                                i9 = 0;
                                while (true) {
                                    if (i8 >= length2) {
                                    }
                                    i9 = i11;
                                    i4 = 2;
                                    c = 241;
                                }
                                break;
                            default:
                                a$$ExternalSyntheticBUOutline0.m$3("Unsupported code set hint: ".concat(obj));
                                i7 = 0;
                                break;
                        }
                        length3 = zArr.length;
                        int i30 = i3 + length3;
                        int max = Math.max(i, i30);
                        int max2 = Math.max(1, i2);
                        int i31 = max / i30;
                        int i32 = (max - (length3 * i31)) / 2;
                        BitMatrix bitMatrix = new BitMatrix(max, max2);
                        i18 = i7;
                        while (i18 < length3) {
                            if (zArr[i18]) {
                                i19 = i7;
                                bitMatrix.setRegion(i32, i19, i31, max2);
                            } else {
                                i19 = i7;
                            }
                            i18++;
                            i32 += i31;
                            i7 = i19;
                        }
                        return bitMatrix;
                    }
                }
                i5 = -1;
                length = str.length();
                while (i6 < length) {
                }
                c = 241;
                int i20222 = 3;
                if (map != null) {
                }
                i7 = 0;
                char c3222 = ' ';
                length2 = str.length();
                ArrayList arrayList2222 = new ArrayList();
                int i25222 = 1;
                i8 = 0;
                int i26222 = 0;
                i9 = 0;
                while (true) {
                    if (i8 >= length2) {
                    }
                    i9 = i11;
                    i4 = 2;
                    c = 241;
                }
                length3 = zArr.length;
                int i302 = i3 + length3;
                int max3 = Math.max(i, i302);
                int max22 = Math.max(1, i2);
                int i312 = max3 / i302;
                int i322 = (max3 - (length3 * i312)) / 2;
                BitMatrix bitMatrix2 = new BitMatrix(max3, max22);
                i18 = i7;
                while (i18 < length3) {
                }
                return bitMatrix2;
            }
        }
        i3 = 10;
        i4 = 2;
        boolean z2 = false;
        if (map != null) {
        }
        i5 = -1;
        length = str.length();
        while (i6 < length) {
        }
        c = 241;
        int i202222 = 3;
        if (map != null) {
        }
        i7 = 0;
        char c32222 = ' ';
        length2 = str.length();
        ArrayList arrayList22222 = new ArrayList();
        int i252222 = 1;
        i8 = 0;
        int i262222 = 0;
        i9 = 0;
        while (true) {
            if (i8 >= length2) {
            }
            i9 = i11;
            i4 = 2;
            c = 241;
        }
        length3 = zArr.length;
        int i3022 = i3 + length3;
        int max32 = Math.max(i, i3022);
        int max222 = Math.max(1, i2);
        int i3122 = max32 / i3022;
        int i3222 = (max32 - (length3 * i3122)) / 2;
        BitMatrix bitMatrix22 = new BitMatrix(max32, max222);
        i18 = i7;
        while (i18 < length3) {
        }
        return bitMatrix22;
    }
}
