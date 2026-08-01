package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public abstract class V2 {
    static {
        if (T2.f35619e && T2.f35618d) {
            int i = AbstractC4315e2.f35667a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(byte[] bArr, int i, int i6, String str) {
        int i9;
        int i10;
        int i11;
        char charAt;
        int length = str.length();
        int i12 = 0;
        while (true) {
            i9 = i + i6;
            if (i12 >= length || (i11 = i12 + i) >= i9 || (charAt = str.charAt(i12)) >= 128) {
                break;
            }
            bArr[i11] = (byte) charAt;
            i12++;
        }
        int i13 = i + i12;
        while (i12 < length) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < 128 && i13 < i9) {
                bArr[i13] = (byte) charAt2;
                i13++;
            } else if (charAt2 < 2048 && i13 <= i9 - 2) {
                bArr[i13] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                i13 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i13 > i9 - 3) {
                    if (i13 > i9 - 4) {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i10 = i12 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i10)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new U2(i12, length);
                    }
                    int i14 = i12 + 1;
                    if (i14 != str.length()) {
                        char charAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i15 = i13 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i12 = i14;
                        } else {
                            i12 = i14;
                        }
                    }
                    throw new U2(i12 - 1, length);
                }
                bArr[i13] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i13 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i13 + 2] = (byte) ((charAt2 & '?') | 128);
                i13 += 3;
            }
            i12++;
        }
        return i13;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i6 = 0;
        while (i6 < length && str.charAt(i6) < 128) {
            i6++;
        }
        int i9 = length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char charAt = str.charAt(i6);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i6++;
            } else {
                int length2 = str.length();
                while (i6 < length2) {
                    char charAt2 = str.charAt(i6);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i6) < 65536) {
                                throw new U2(i6, length2);
                            }
                            i6++;
                        }
                    }
                    i6++;
                }
                i9 += i;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }
}
