package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hut extends q7g {
    public final /* synthetic */ int f;

    public /* synthetic */ hut(int i) {
        this.f = i;
    }

    public static int X(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            q7g q7gVar = nut.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return nut.c(i, dmt.g(j, bArr));
        }
        if (i2 == 2) {
            return nut.d(i, dmt.g(j, bArr), dmt.g(j + 1, bArr));
        }
        wvs.b();
        return 0;
    }

    @Override // defpackage.q7g
    public final String A(ByteBuffer byteBuffer, int i, int i2) {
        long j;
        byte e;
        byte e2;
        switch (this.f) {
            case 0:
                return q7g.z(byteBuffer, i, i2);
            default:
                if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                    wvs.j("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                long j2 = dmt.c.j(dmt.g, byteBuffer) + i;
                long j3 = i2 + j2;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (true) {
                    j = 1;
                    if (j2 < j3 && (e2 = dmt.c.e(j2)) >= 0) {
                        j2++;
                        cArr[i3] = (char) e2;
                        i3++;
                    }
                }
                int i4 = i3;
                while (j2 < j3) {
                    long j4 = j2 + j;
                    amt amtVar = dmt.c;
                    byte e3 = amtVar.e(j2);
                    if (e3 >= 0) {
                        int i5 = i4 + 1;
                        cArr[i4] = (char) e3;
                        while (j4 < j3 && (e = dmt.c.e(j4)) >= 0) {
                            j4 += j;
                            cArr[i5] = (char) e;
                            i5++;
                        }
                        i4 = i5;
                        j2 = j4;
                    } else if (e3 < -32) {
                        if (j4 >= j3) {
                            throw bye.c();
                        }
                        j2 += 2;
                        y5g.R(e3, amtVar.e(j4), cArr, i4);
                        i4++;
                    } else if (e3 < -16) {
                        if (j4 >= j3 - j) {
                            throw bye.c();
                        }
                        long j5 = j2 + 2;
                        j2 += 3;
                        y5g.S(e3, amtVar.e(j4), amtVar.e(j5), cArr, i4);
                        i4++;
                    } else {
                        if (j4 >= j3 - 2) {
                            throw bye.c();
                        }
                        byte e4 = amtVar.e(j4);
                        long j6 = j2 + 3;
                        byte e5 = amtVar.e(j2 + 2);
                        j2 += 4;
                        y5g.Q(e3, e4, e5, amtVar.e(j6), cArr, i4);
                        i4 += 2;
                    }
                    j = 1;
                }
                return new String(cArr, 0, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return r25 + r5;
     */
    @Override // defpackage.q7g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        long j;
        long j2;
        int i5;
        char charAt2;
        switch (this.f) {
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
                                    throw new kut(i7, length);
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
                            throw new kut(i7 - 1, length);
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
                            dmt.k(bArr, (byte) charAt2, j3);
                            i13++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i13 != length2) {
                        while (i13 < length2) {
                            char charAt5 = str.charAt(i13);
                            if (charAt5 < 128 && j3 < j4) {
                                dmt.k(bArr, (byte) charAt5, j3);
                                j2 = j;
                                j3 += j;
                            } else if (charAt5 >= 2048 || j3 > j4 - 2) {
                                j2 = j;
                                if ((charAt5 < 55296 || 57343 < charAt5) && j3 <= j4 - 3) {
                                    dmt.k(bArr, (byte) ((charAt5 >>> '\f') | 480), j3);
                                    long j5 = 2 + j3;
                                    dmt.k(bArr, (byte) (((charAt5 >>> 6) & 63) | 128), j3 + j2);
                                    j3 += 3;
                                    dmt.k(bArr, (byte) ((charAt5 & '?') | 128), j5);
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i14 = i13 + 1;
                                        if (i14 != length2) {
                                            char charAt6 = str.charAt(i14);
                                            if (Character.isSurrogatePair(charAt5, charAt6)) {
                                                int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                                dmt.k(bArr, (byte) ((codePoint2 >>> 18) | 240), j3);
                                                dmt.k(bArr, (byte) (((codePoint2 >>> 12) & 63) | 128), j3 + j2);
                                                long j6 = j3 + 3;
                                                dmt.k(bArr, (byte) (((codePoint2 >>> 6) & 63) | 128), 2 + j3);
                                                j3 += 4;
                                                dmt.k(bArr, (byte) ((codePoint2 & 63) | 128), j6);
                                                i13 = i14;
                                            } else {
                                                i13 = i14;
                                            }
                                        }
                                        throw new kut(i13 - 1, length2);
                                    }
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i5)))) {
                                        throw new kut(i13, length2);
                                    }
                                    wvs.d(charAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                dmt.k(bArr, (byte) ((charAt5 >>> 6) | 960), j3);
                                j3 += 2;
                                dmt.k(bArr, (byte) ((charAt5 & '?') | 128), j7);
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

    @Override // defpackage.q7g
    public final int M(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4 = i;
        switch (this.f) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) >= 0) {
                    long j2 = i4;
                    int i5 = (int) (i2 - j2);
                    long j3 = 1;
                    if (i5 < 16) {
                        i3 = 0;
                    } else {
                        int i6 = 8 - (((int) j2) & 7);
                        long j4 = j2;
                        i3 = 0;
                        while (true) {
                            if (i3 < i6) {
                                long j5 = j4 + 1;
                                if (dmt.g(j4, bArr) >= 0) {
                                    i3++;
                                    j4 = j5;
                                }
                            } else {
                                while (true) {
                                    int i7 = i3 + 8;
                                    if (i7 <= i5) {
                                        if ((dmt.c.j(dmt.f + j4, bArr) & (-9187201950435737472L)) == 0) {
                                            j4 += 8;
                                            i3 = i7;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i3 < i5) {
                                        long j6 = j4 + 1;
                                        if (dmt.g(j4, bArr) >= 0) {
                                            i3++;
                                            j4 = j6;
                                        }
                                    } else {
                                        i3 = i5;
                                    }
                                }
                            }
                        }
                    }
                    int i8 = i5 - i3;
                    long j7 = j2 + i3;
                    while (true) {
                        byte b = 0;
                        while (true) {
                            if (i8 > 0) {
                                long j8 = j7 + j3;
                                b = dmt.g(j7, bArr);
                                if (b >= 0) {
                                    i8--;
                                    j7 = j8;
                                } else {
                                    j7 = j8;
                                }
                            }
                        }
                        if (i8 != 0) {
                            int i9 = i8 - 1;
                            if (b < -32) {
                                if (i9 == 0) {
                                    return b;
                                }
                                i8 -= 2;
                                if (b >= -62) {
                                    long j9 = j7 + j3;
                                    if (dmt.g(j7, bArr) <= -65) {
                                        j = j3;
                                        j7 = j9;
                                        j3 = j;
                                    }
                                }
                            } else if (b >= -16) {
                                j = j3;
                                if (i9 < 3) {
                                    return X(j7, bArr, b, i9);
                                }
                                i8 -= 4;
                                long j10 = j7 + j;
                                byte g = dmt.g(j7, bArr);
                                if (g <= -65) {
                                    if ((((g + 112) + (b << 28)) >> 30) == 0) {
                                        long j11 = 2 + j7;
                                        if (dmt.g(j10, bArr) <= -65) {
                                            j7 += 3;
                                            if (dmt.g(j11, bArr) <= -65) {
                                                j3 = j;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i9 < 2) {
                                    return X(j7, bArr, b, i9);
                                }
                                i8 -= 3;
                                j = j3;
                                long j12 = j7 + j;
                                byte g2 = dmt.g(j7, bArr);
                                if (g2 <= -65 && ((b != -32 || g2 >= -96) && (b != -19 || g2 < -96))) {
                                    j7 += 2;
                                    if (dmt.g(j12, bArr) <= -65) {
                                        j3 = j;
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                wvs.j("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)});
                return 0;
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i10 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i4 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        if (i10 >= i2 - 1) {
                            return nut.a(bArr, i10, i2);
                        }
                        int i11 = i4 + 2;
                        byte b3 = bArr[i10];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i4 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i2 - 2) {
                        return nut.a(bArr, i10, i2);
                    }
                    int i12 = i4 + 2;
                    byte b4 = bArr[i10];
                    if (b4 <= -65) {
                        if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i13 = i4 + 3;
                            if (bArr[i12] <= -65) {
                                i4 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i4 = i10;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // defpackage.q7g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String y(byte[] bArr, int i, int i2) {
        switch (this.f) {
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
                        int i5 = i4;
                        while (i < i3) {
                            int i6 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i7 = i5 + 1;
                                cArr[i5] = (char) b2;
                                int i8 = i6;
                                while (i8 < i3) {
                                    byte b3 = bArr[i8];
                                    if (b3 >= 0) {
                                        i8++;
                                        cArr[i7] = (char) b3;
                                        i7++;
                                    } else {
                                        i5 = i7;
                                        i = i8;
                                    }
                                }
                                i5 = i7;
                                i = i8;
                            } else if (b2 < -32) {
                                if (i6 >= i3) {
                                    throw bye.c();
                                }
                                i += 2;
                                y5g.R(b2, bArr[i6], cArr, i5);
                                i5++;
                            } else if (b2 < -16) {
                                if (i6 >= i3 - 1) {
                                    throw bye.c();
                                }
                                int i9 = i + 2;
                                i += 3;
                                y5g.S(b2, bArr[i6], bArr[i9], cArr, i5);
                                i5++;
                            } else {
                                if (i6 >= i3 - 2) {
                                    throw bye.c();
                                }
                                byte b4 = bArr[i6];
                                int i10 = i + 3;
                                byte b5 = bArr[i + 2];
                                i += 4;
                                y5g.Q(b2, b4, b5, bArr[i10], cArr, i5);
                                i5 += 2;
                            }
                        }
                        return new String(cArr, 0, i5);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i52 = i4;
                while (i < i3) {
                }
                return new String(cArr, 0, i52);
            default:
                Charset charset = use.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw bye.c();
                }
                return str;
        }
    }
}
