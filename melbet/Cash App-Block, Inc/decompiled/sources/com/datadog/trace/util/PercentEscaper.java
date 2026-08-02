package com.datadog.trace.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.Platform;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class PercentEscaper {
    public static final char[] UPPER_HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final boolean[] unsafeKeyOctets = createUnsafeOctets("\",;\\()/:<=>?@[]{} ");
    public static final boolean[] unsafeValOctets = createUnsafeOctets("\",;\\ ");

    public static boolean[] createUnsafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Platform.JvmRuntime escape(String str, boolean[] zArr) {
        int i;
        char c;
        Platform.JvmRuntime jvmRuntime;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr;
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            char c2 = ' ';
            if (charAt > '~' || charAt <= ' ' || (charAt < zArr.length && zArr[charAt])) {
                int length2 = str.length();
                char[] cArr2 = new char[1024];
                Platform.JvmRuntime jvmRuntime2 = new Platform.JvmRuntime("", i6);
                int i7 = 0;
                int i8 = 0;
                while (i6 < length2) {
                    if (i6 >= length2) {
                        Path$$ExternalSyntheticBUOutline0.m("Index exceeds specified range");
                        return null;
                    }
                    int i9 = i6 + 1;
                    char charAt2 = str.charAt(i6);
                    if (charAt2 < 55296 || charAt2 > 57343) {
                        c = c2;
                        jvmRuntime = 0;
                        i2 = 0;
                        i3 = charAt2;
                    } else {
                        c = c2;
                        jvmRuntime = 0;
                        jvmRuntime = 0;
                        i2 = 0;
                        if (charAt2 > 56319) {
                            throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i6 + " in '" + ((Object) str) + "'");
                        }
                        if (i9 == length2) {
                            i3 = -charAt2;
                        } else {
                            char charAt3 = str.charAt(i9);
                            if (!Character.isLowSurrogate(charAt3)) {
                                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt3 + "' with value " + ((int) charAt3) + " at index " + i9 + " in '" + ((Object) str) + "'");
                            }
                            i3 = Character.toCodePoint(charAt2, charAt3);
                        }
                    }
                    if (i3 < 0) {
                        a$$ExternalSyntheticBUOutline0.m$3("Trailing high surrogate at end of input");
                        return jvmRuntime;
                    }
                    if (i3 >= zArr.length || zArr[i3]) {
                        char[] cArr3 = UPPER_HEX_DIGITS;
                        if (i3 <= 127) {
                            cArr = new char[3];
                            cArr[i2] = '%';
                            cArr[2] = cArr3[(i3 & 15) == true ? 1 : 0];
                            cArr[1] = cArr3[i3 >>> 4];
                            i4 = 1;
                            i5 = 2;
                        } else {
                            i4 = 1;
                            i5 = 2;
                            if (i3 <= 2047) {
                                cArr = new char[6];
                                cArr[i2] = '%';
                                cArr[3] = '%';
                                cArr[5] = cArr3[(i3 & 15) == true ? 1 : 0];
                                cArr[4] = cArr3[((i3 >>> 4) & 3) | 8];
                                cArr[2] = cArr3[(i3 >>> 6) & 15];
                                cArr[1] = cArr3[12 | (i3 >>> 10)];
                            } else if (i3 <= 65535) {
                                cArr = new char[9];
                                cArr[i2] = '%';
                                cArr[1] = 'E';
                                cArr[3] = '%';
                                cArr[6] = '%';
                                cArr[8] = cArr3[(i3 & 15) == true ? 1 : 0];
                                cArr[7] = cArr3[((i3 >>> 4) & 3) | 8];
                                cArr[5] = cArr3[(i3 >>> 6) & 15];
                                cArr[4] = cArr3[((i3 >>> 10) & 3) | 8];
                                cArr[2] = cArr3[i3 >>> 12];
                            } else {
                                if (i3 > 1114111) {
                                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Invalid unicode character value "));
                                    return jvmRuntime;
                                }
                                cArr = new char[12];
                                cArr[i2] = '%';
                                cArr[1] = 'F';
                                cArr[3] = '%';
                                cArr[6] = '%';
                                cArr[9] = '%';
                                cArr[11] = cArr3[(i3 & 15) == true ? 1 : 0];
                                cArr[10] = cArr3[((i3 >>> 4) & 3) | 8];
                                cArr[8] = cArr3[(i3 >>> 6) & 15];
                                cArr[7] = cArr3[((i3 >>> 10) & 3) | 8];
                                cArr[5] = cArr3[(i3 >>> 12) & 15];
                                cArr[4] = cArr3[((i3 >>> 16) & 3) | 8];
                                cArr[2] = cArr3[(i3 >>> 18) & 7];
                            }
                        }
                    } else {
                        i4 = 1;
                        i5 = 2;
                        cArr = jvmRuntime;
                    }
                    int i10 = (Character.isSupplementaryCodePoint(i3) ? i5 : i4) + i6;
                    if (cArr != null) {
                        int i11 = i6 - i7;
                        int i12 = i8 + i11;
                        int length3 = cArr.length + i12;
                        if (cArr2.length < length3) {
                            int i13 = (length2 - i6) + length3 + 32;
                            if (i13 < 0) {
                                a$$ExternalSyntheticBUOutline0.m$1((Object) "Cannot increase internal buffer any further");
                                return jvmRuntime;
                            }
                            char[] cArr4 = new char[i13];
                            if (i8 > 0) {
                                int i14 = i2;
                                System.arraycopy(cArr2, i14, cArr4, i14, i8);
                            }
                            cArr2 = cArr4;
                        }
                        if (i11 > 0) {
                            str.getChars(i7, i6, cArr2, i8);
                            i8 = i12;
                        }
                        if (cArr.length > 0) {
                            System.arraycopy(cArr, 0, cArr2, i8, cArr.length);
                            i8 += cArr.length;
                        }
                        i7 = i10;
                    }
                    i6 = i10;
                    while (i6 < length2) {
                        char charAt4 = str.charAt(i6);
                        if (charAt4 >= zArr.length || !zArr[charAt4]) {
                            i6++;
                        }
                    }
                    c2 = c;
                }
                int i15 = length2 - i7;
                if (i15 > 0) {
                    int i16 = i15 + i8;
                    if (cArr2.length >= i16) {
                        i = 0;
                    } else {
                        if (i16 < 0) {
                            a$$ExternalSyntheticBUOutline0.m$1((Object) "Cannot increase internal buffer any further");
                            return null;
                        }
                        char[] cArr5 = new char[i16];
                        if (i8 > 0) {
                            i = 0;
                            System.arraycopy(cArr2, 0, cArr5, 0, i8);
                        } else {
                            i = 0;
                        }
                        cArr2 = cArr5;
                    }
                    str.getChars(i7, length2, cArr2, i8);
                    i8 = i16;
                } else {
                    i = 0;
                }
                jvmRuntime2.vendorVersion = new String(cArr2, i, i8);
                return jvmRuntime2;
            }
            i6++;
        }
        return new Platform.JvmRuntime(str, length);
    }
}
