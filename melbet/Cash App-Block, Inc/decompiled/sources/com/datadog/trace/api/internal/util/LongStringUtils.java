package com.datadog.trace.api.internal.util;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes4.dex */
public abstract class LongStringUtils {
    public static final byte[] HEX_DIGITS = {48, PnmConstants.PBM_TEXT_CODE, PnmConstants.PGM_TEXT_CODE, PnmConstants.PPM_TEXT_CODE, PnmConstants.PBM_RAW_CODE, PnmConstants.PGM_RAW_CODE, PnmConstants.PPM_RAW_CODE, PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};

    public static void fillStringBytesWithPaddedHexId(long j, int i, int i2, byte[] bArr) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) >>> 2;
        Arrays.fill(bArr, i, (i2 - 16) + i + numberOfLeadingZeros, (byte) 48);
        for (int i3 = 0; i3 < 16 - numberOfLeadingZeros; i3++) {
            bArr[((i + i2) - 1) - i3] = HEX_DIGITS[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public static NumberFormatException numberFormatOutOfLongRange(CharSequence charSequence) {
        return new NumberFormatException(String.format("String value %s exceeds range of unsigned long.", charSequence));
    }

    public static long parseUnsignedLong(String str) {
        int i;
        if (str == null) {
            throw new NumberFormatException("s can't be null");
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException("Empty input string");
        }
        int i2 = 0;
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Illegal leading minus sign on unsigned string ", str, "."));
        }
        if (length <= 18) {
            return Long.parseLong(str);
        }
        if (length > 20) {
            throw numberFormatOutOfLongRange(str);
        }
        int i3 = 0;
        long j = 0;
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            int digit = Character.digit(str.charAt(i2), 10);
            i3 |= digit;
            j = (j * 10) + digit;
            i2++;
        }
        int digit2 = Character.digit(str.charAt(i), 10);
        if ((i3 | digit2) < 0) {
            throw new NumberFormatException("Illegal character in ".concat(str));
        }
        if (j > 1844674407370955161L) {
            throw numberFormatOutOfLongRange(str);
        }
        long j2 = j * 10;
        long j3 = digit2 + j2;
        if (j2 >= 0 || j3 < 0) {
            return j3;
        }
        throw numberFormatOutOfLongRange(str);
    }

    public static long parseUnsignedLongHex(CharSequence charSequence, int i, int i2, boolean z) {
        if (charSequence == null) {
            throw new NumberFormatException("null");
        }
        if (i2 <= 0 || i < 0 || i + i2 > charSequence.length()) {
            throw new NumberFormatException("Empty input string");
        }
        if (i2 > 16) {
            int i3 = i;
            while (i3 < charSequence.length() && charSequence.charAt(i3) == '0') {
                i3++;
            }
            if (i2 - i3 > 16) {
                throw numberFormatOutOfLongRange(charSequence);
            }
        }
        int i4 = 0;
        long j = 0;
        int i5 = 0;
        while (i4 < i2 && i5 >= 0) {
            char charAt = charSequence.charAt(i);
            int digit = Character.digit(charAt, 16);
            if (z && Character.isUpperCase(charAt)) {
                i5 = -1;
            }
            i5 |= digit;
            j = (j << 4) | digit;
            i4++;
            i++;
        }
        if (i5 >= 0) {
            return j;
        }
        throw new NumberFormatException("Illegal character in " + ((Object) charSequence.subSequence(i, i2)));
    }

    public static String toHexStringPadded(int i, long j) {
        if (i > 16) {
            i = 32;
        } else if (i < 16) {
            i = 16;
        }
        byte[] bArr = new byte[i];
        fillStringBytesWithPaddedHexId(j, 0, i, bArr);
        return new String(bArr, StandardCharsets.US_ASCII);
    }

    public static long parseUnsignedLongHex(String str) {
        return parseUnsignedLongHex(str, 0, str == null ? 0 : str.length(), false);
    }
}
