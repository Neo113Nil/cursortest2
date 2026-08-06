package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bg0 {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public int encWxUiV2;
    public long[] GWasM1elztuh = kx0.GWasM1elztuh;
    public Object[] Yi7zF1RB1 = fb1.xqGvceK5x;
    public long[] X1lG3V04pd = fb1.mOu10nynGul;
    public int xqGvceK5x = Integer.MAX_VALUE;
    public int OOA6hdeuvCS = Integer.MAX_VALUE;

    public bg0(int i) {
        if (i >= 0) {
            EljAMC1QTz(kx0.xqGvceK5x(i));
        } else {
            o4.mE4lRynR("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AvO7iQsrTN(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.EljAMC1QTz;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.GWasM1elztuh;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (o30.rQPn8YBR(this.Yi7zF1RB1[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = i >= 0;
        if (z) {
            encWxUiV2(i);
        }
        return z;
    }

    public final void EljAMC1QTz(int i) {
        long[] jArr;
        long[] jArr2;
        int max = i > 0 ? Math.max(7, kx0.X1lG3V04pd(i)) : 0;
        this.EljAMC1QTz = max;
        if (max == 0) {
            jArr = kx0.GWasM1elztuh;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.GWasM1elztuh = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.encWxUiV2 = kx0.GWasM1elztuh(this.EljAMC1QTz) - this.AvO7iQsrTN;
        this.Yi7zF1RB1 = max == 0 ? fb1.xqGvceK5x : new Object[max];
        if (max == 0) {
            jArr2 = fb1.mOu10nynGul;
        } else {
            long[] jArr4 = new long[max];
            Arrays.fill(jArr4, 0, max, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.X1lG3V04pd = jArr2;
    }

    public final boolean GWasM1elztuh(Object obj) {
        int i = this.AvO7iQsrTN;
        int xqGvceK5x = xqGvceK5x(obj);
        this.Yi7zF1RB1[xqGvceK5x] = obj;
        long[] jArr = this.X1lG3V04pd;
        int i2 = this.xqGvceK5x;
        jArr[xqGvceK5x] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((xqGvceK5x & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.xqGvceK5x = xqGvceK5x;
        if (this.OOA6hdeuvCS == Integer.MAX_VALUE) {
            this.OOA6hdeuvCS = xqGvceK5x;
        }
        return this.AvO7iQsrTN != i;
    }

    public final int OOA6hdeuvCS(int i) {
        int i2 = this.EljAMC1QTz;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.GWasM1elztuh;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X1lG3V04pd(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.EljAMC1QTz;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.GWasM1elztuh;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (o30.rQPn8YBR(this.Yi7zF1RB1[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final void Yi7zF1RB1() {
        this.AvO7iQsrTN = 0;
        long[] jArr = this.GWasM1elztuh;
        if (jArr != kx0.GWasM1elztuh) {
            d5.ES6ysExf(jArr, -9187201950435737472L);
            long[] jArr2 = this.GWasM1elztuh;
            int i = this.EljAMC1QTz;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        d5.JFXS9W1rB5s4(this.Yi7zF1RB1, 0, this.EljAMC1QTz);
        d5.ES6ysExf(this.X1lG3V04pd, 4611686018427387903L);
        this.xqGvceK5x = Integer.MAX_VALUE;
        this.OOA6hdeuvCS = Integer.MAX_VALUE;
        this.encWxUiV2 = kx0.GWasM1elztuh(this.EljAMC1QTz) - this.AvO7iQsrTN;
    }

    public final void encWxUiV2(int i) {
        this.AvO7iQsrTN--;
        long[] jArr = this.GWasM1elztuh;
        int i2 = this.EljAMC1QTz;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.Yi7zF1RB1[i] = null;
        long[] jArr2 = this.X1lG3V04pd;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.xqGvceK5x = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.OOA6hdeuvCS = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj;
        if (bg0Var.AvO7iQsrTN != this.AvO7iQsrTN) {
            return false;
        }
        Object[] objArr = this.Yi7zF1RB1;
        long[] jArr = this.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !bg0Var.X1lG3V04pd(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.EljAMC1QTz * 31) + this.AvO7iQsrTN;
        Object[] objArr = this.Yi7zF1RB1;
        long[] jArr = this.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!o30.rQPn8YBR(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean mOu10nynGul(Collection collection) {
        collection.getClass();
        Object[] objArr = this.Yi7zF1RB1;
        int i = this.AvO7iQsrTN;
        long[] jArr = this.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!rb.JB4pnjMK(collection, objArr[i5])) {
                                encWxUiV2(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this.AvO7iQsrTN;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.Yi7zF1RB1;
        long[] jArr = this.X1lG3V04pd;
        int i = this.OOA6hdeuvCS;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
            i = i3;
        }
        return sb.toString();
    }

    public final int xqGvceK5x(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.EljAMC1QTz;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.GWasM1elztuh;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (o30.rQPn8YBR(this.Yi7zF1RB1[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int OOA6hdeuvCS = OOA6hdeuvCS(i4);
                long j9 = 255;
                if (this.encWxUiV2 != 0 || ((this.GWasM1elztuh[OOA6hdeuvCS >> 3] >> ((OOA6hdeuvCS & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.EljAMC1QTz;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compare((this.AvO7iQsrTN * 32) ^ Long.MIN_VALUE, (i13 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.GWasM1elztuh;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.EljAMC1QTz;
                                Object[] objArr = this.Yi7zF1RB1;
                                long[] jArr5 = this.X1lG3V04pd;
                                long[] jArr6 = new long[i14];
                                Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j10 = j9;
                                    long j11 = jArr4[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr4[i17] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr4[i21] >> i22) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr[i20];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int OOA6hdeuvCS2 = OOA6hdeuvCS(i23);
                                        int i24 = i23 & i14;
                                        if (((OOA6hdeuvCS2 - i24) & i14) / 8 == ((i20 - i24) & i14) / 8) {
                                            int i25 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | ((r17 & 127) << i22);
                                            if (jArr6[i20] == 9223372034707292159L) {
                                                long j13 = i20;
                                                jArr6[i20] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i25;
                                            objArr = objArr2;
                                        } else {
                                            int i26 = i14;
                                            Object[] objArr3 = objArr;
                                            int i27 = OOA6hdeuvCS2 >> 3;
                                            long j14 = jArr4[i27];
                                            int i28 = (OOA6hdeuvCS2 & 7) << 3;
                                            if (((j14 >> i28) & j2) == 128) {
                                                jArr4[i27] = (j14 & (~(j2 << i28))) | ((r17 & 127) << i28);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[OOA6hdeuvCS2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[OOA6hdeuvCS2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i29 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i29 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i29] = OOA6hdeuvCS2 | (jArr6[i29] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = 9223372032559808512L | OOA6hdeuvCS2;
                                                }
                                                jArr6[OOA6hdeuvCS2] = (i20 << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i27] = ((r17 & 127) << i28) | (j14 & (~(j2 << i28)));
                                                Object obj3 = objArr3[OOA6hdeuvCS2];
                                                objArr3[OOA6hdeuvCS2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[OOA6hdeuvCS2];
                                                jArr5[OOA6hdeuvCS2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    long j16 = OOA6hdeuvCS2;
                                                    jArr6[i30] = (jArr6[i30] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = OOA6hdeuvCS2;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i30 = i20;
                                                }
                                                jArr6[OOA6hdeuvCS2] = (i30 << 32) | i20;
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j6;
                                this.encWxUiV2 = kx0.GWasM1elztuh(this.EljAMC1QTz) - this.AvO7iQsrTN;
                                long[] jArr7 = this.X1lG3V04pd;
                                int length2 = jArr7.length;
                                for (int i31 = 0; i31 < length2; i31++) {
                                    long j18 = jArr7[i31];
                                    jArr7[i31] = (((j18 & (-4611686018427387904L)) | (((int) ((j18 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j18 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i32 = this.xqGvceK5x;
                                if (i32 != Integer.MAX_VALUE) {
                                    this.xqGvceK5x = (int) (jArr6[i32] & 4294967295L);
                                }
                                int i33 = this.OOA6hdeuvCS;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.OOA6hdeuvCS = (int) (jArr6[i33] & 4294967295L);
                                }
                            }
                            OOA6hdeuvCS = OOA6hdeuvCS(i4);
                        }
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int Yi7zF1RB1 = kx0.Yi7zF1RB1(this.EljAMC1QTz);
                    long[] jArr8 = this.GWasM1elztuh;
                    Object[] objArr4 = this.Yi7zF1RB1;
                    long[] jArr9 = this.X1lG3V04pd;
                    int i34 = this.EljAMC1QTz;
                    int[] iArr = new int[i34];
                    EljAMC1QTz(Yi7zF1RB1);
                    long[] jArr10 = this.GWasM1elztuh;
                    Object[] objArr5 = this.Yi7zF1RB1;
                    long[] jArr11 = this.X1lG3V04pd;
                    int i35 = this.EljAMC1QTz;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr8[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i36];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int OOA6hdeuvCS3 = OOA6hdeuvCS(i37 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i37 & 127;
                            int i38 = OOA6hdeuvCS3 >> 3;
                            int i39 = (OOA6hdeuvCS3 & 7) << 3;
                            long j20 = (jArr[i38] & (~(255 << i39))) | (j19 << i39);
                            jArr[i38] = j20;
                            jArr[(((OOA6hdeuvCS3 - 7) & i35) + (i35 & 7)) >> 3] = j20;
                            objArr5[OOA6hdeuvCS3] = obj4;
                            jArr11[OOA6hdeuvCS3] = jArr9[i36];
                            iArr[i36] = OOA6hdeuvCS3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i36++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.X1lG3V04pd;
                    int length3 = jArr12.length;
                    for (int i40 = 0; i40 < length3; i40++) {
                        long j21 = jArr12[i40];
                        jArr12[i40] = (((j21 & (-4611686018427387904L)) | (((int) ((j21 >> c) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c) | (((int) (j21 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i41 = this.xqGvceK5x;
                    if (i41 != Integer.MAX_VALUE) {
                        this.xqGvceK5x = iArr[i41];
                    }
                    int i42 = this.OOA6hdeuvCS;
                    if (i42 != Integer.MAX_VALUE) {
                        this.OOA6hdeuvCS = iArr[i42];
                    }
                    OOA6hdeuvCS = OOA6hdeuvCS(i4);
                }
                this.AvO7iQsrTN++;
                int i43 = this.encWxUiV2;
                long[] jArr13 = this.GWasM1elztuh;
                int i44 = OOA6hdeuvCS >> 3;
                long j22 = jArr13[i44];
                int i45 = (OOA6hdeuvCS & 7) << 3;
                if (((j22 >> i45) & j2) == j3) {
                    i = 1;
                }
                this.encWxUiV2 = i43 - i;
                int i46 = this.EljAMC1QTz;
                long j23 = (j22 & (~(j2 << i45))) | (j << i45);
                jArr13[i44] = j23;
                jArr13[(((OOA6hdeuvCS - 7) & i46) + (i46 & 7)) >> 3] = j23;
                return OOA6hdeuvCS;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }
}
