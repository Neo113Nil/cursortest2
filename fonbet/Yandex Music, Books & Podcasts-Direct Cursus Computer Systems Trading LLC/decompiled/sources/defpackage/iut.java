package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class iut extends s7g {
    public final /* synthetic */ int a;

    public /* synthetic */ iut(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // defpackage.s7g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String q(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    wvs.j("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw cye.a();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || p6g.B(b4)) {
                                    throw cye.a();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw cye.a();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!p6g.B(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !p6g.B(b6) && !p6g.B(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw cye.a();
                                }
                                if (i5 >= i3 - 1) {
                                    throw cye.a();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (p6g.B(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || p6g.B(b9)))) {
                                    throw cye.a();
                                }
                                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = vse.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw cye.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return r25 + r5;
     */
    @Override // defpackage.s7g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        long j;
        long j2;
        int i5;
        char charAt2;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (charAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) charAt;
                    i7++;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char charAt3 = str.charAt(i7);
                    if (charAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) charAt3;
                        i8++;
                    } else if (charAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                    throw new lut(i7, length);
                                }
                                wvs.c(charAt3, i8);
                                return 0;
                            }
                            int i10 = i7 + 1;
                            if (i10 != str.length()) {
                                char charAt4 = str.charAt(i10);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i11] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new lut(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((charAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j3 = i;
                long j4 = i2 + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i13 = 0;
                    while (true) {
                        j = 1;
                        if (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                            emt.j(bArr, (byte) charAt2, j3);
                            i13++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i13 != length2) {
                        while (i13 < length2) {
                            char charAt5 = str.charAt(i13);
                            if (charAt5 < 128 && j3 < j4) {
                                emt.j(bArr, (byte) charAt5, j3);
                                j2 = j;
                                j3 += j;
                            } else if (charAt5 >= 2048 || j3 > j4 - 2) {
                                j2 = j;
                                if ((charAt5 < 55296 || 57343 < charAt5) && j3 <= j4 - 3) {
                                    emt.j(bArr, (byte) ((charAt5 >>> '\f') | 480), j3);
                                    long j5 = 2 + j3;
                                    emt.j(bArr, (byte) (((charAt5 >>> 6) & 63) | 128), j3 + j2);
                                    j3 += 3;
                                    emt.j(bArr, (byte) ((charAt5 & '?') | 128), j5);
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i14 = i13 + 1;
                                        if (i14 != length2) {
                                            char charAt6 = str.charAt(i14);
                                            if (Character.isSurrogatePair(charAt5, charAt6)) {
                                                int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                                emt.j(bArr, (byte) ((codePoint2 >>> 18) | 240), j3);
                                                emt.j(bArr, (byte) (((codePoint2 >>> 12) & 63) | 128), j3 + j2);
                                                long j6 = j3 + 3;
                                                emt.j(bArr, (byte) (((codePoint2 >>> 6) & 63) | 128), 2 + j3);
                                                j3 += 4;
                                                emt.j(bArr, (byte) ((codePoint2 & 63) | 128), j6);
                                                i13 = i14;
                                            } else {
                                                i13 = i14;
                                            }
                                        }
                                        throw new lut(i13 - 1, length2);
                                    }
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i5)))) {
                                        throw new lut(i13, length2);
                                    }
                                    wvs.d(charAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                emt.j(bArr, (byte) ((charAt5 >>> 6) | 960), j3);
                                j3 += 2;
                                emt.j(bArr, (byte) ((charAt5 & '?') | 128), j7);
                            }
                            i13++;
                            j = j2;
                        }
                    }
                    return (int) j3;
                }
                wvs.o(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }
}
