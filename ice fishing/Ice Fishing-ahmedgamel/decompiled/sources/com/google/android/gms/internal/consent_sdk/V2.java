package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public abstract class V2 {
    static {
        if (T2.f36388e && T2.f36387d) {
            int i = AbstractC4338e2.f36436a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(byte[] bArr, int i, int i4, String str) {
        int i6;
        int i9;
        int i10;
        char charAt;
        int length = str.length();
        int i11 = 0;
        while (true) {
            i6 = i + i4;
            if (i11 >= length || (i10 = i11 + i) >= i6 || (charAt = str.charAt(i11)) >= 128) {
                break;
            }
            bArr[i10] = (byte) charAt;
            i11++;
        }
        int i12 = i + i11;
        while (i11 < length) {
            char charAt2 = str.charAt(i11);
            if (charAt2 < 128 && i12 < i6) {
                bArr[i12] = (byte) charAt2;
                i12++;
            } else if (charAt2 < 2048 && i12 <= i6 - 2) {
                bArr[i12] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i12 + 1] = (byte) ((charAt2 & '?') | 128);
                i12 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i12 > i6 - 3) {
                    if (i12 > i6 - 4) {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i9 = i11 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i9)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new U2(i11, length);
                    }
                    int i13 = i11 + 1;
                    if (i13 != str.length()) {
                        char charAt3 = str.charAt(i13);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i14 = i12 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i12] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i12 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i14] = (byte) ((codePoint & 63) | 128);
                            i11 = i13;
                        } else {
                            i11 = i13;
                        }
                    }
                    throw new U2(i11 - 1, length);
                }
                bArr[i12] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i12 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                i12 += 3;
            }
            i11++;
        }
        return i12;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i6 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i4++;
            } else {
                int length2 = str.length();
                while (i4 < length2) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) < 65536) {
                                throw new U2(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }
}
