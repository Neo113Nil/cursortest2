package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rf0 extends s20 {
    public int EljAMC1QTz;

    public rf0(int i) {
        this.GWasM1elztuh = kx0.GWasM1elztuh;
        this.Yi7zF1RB1 = a30.GWasM1elztuh;
        this.X1lG3V04pd = fb1.xqGvceK5x;
        if (i >= 0) {
            EljAMC1QTz(kx0.xqGvceK5x(i));
        } else {
            o4.mE4lRynR("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AvO7iQsrTN(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.xqGvceK5x;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.GWasM1elztuh;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.Yi7zF1RB1[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 < 0) {
            return null;
        }
        this.OOA6hdeuvCS--;
        long[] jArr2 = this.GWasM1elztuh;
        int i10 = this.xqGvceK5x;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j4 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
        jArr2[i11] = j4;
        jArr2[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j4;
        Object[] objArr = this.X1lG3V04pd;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void EljAMC1QTz(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, kx0.X1lG3V04pd(i)) : 0;
        this.xqGvceK5x = max;
        if (max == 0) {
            jArr = kx0.GWasM1elztuh;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.GWasM1elztuh = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
        this.Yi7zF1RB1 = new int[max];
        this.X1lG3V04pd = new Object[max];
    }

    public final int OOA6hdeuvCS(int i) {
        int i2 = this.xqGvceK5x;
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

    public final void X1lG3V04pd() {
        this.OOA6hdeuvCS = 0;
        long[] jArr = this.GWasM1elztuh;
        if (jArr != kx0.GWasM1elztuh) {
            d5.ES6ysExf(jArr, -9187201950435737472L);
            long[] jArr2 = this.GWasM1elztuh;
            int i = this.xqGvceK5x;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        d5.JFXS9W1rB5s4(this.X1lG3V04pd, 0, this.xqGvceK5x);
        this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
    }

    public final void encWxUiV2(int i, Object obj) {
        int xqGvceK5x = xqGvceK5x(i);
        this.Yi7zF1RB1[xqGvceK5x] = i;
        this.X1lG3V04pd[xqGvceK5x] = obj;
    }

    public final int xqGvceK5x(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i3;
        int i4 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.xqGvceK5x;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.GWasM1elztuh;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.Yi7zF1RB1[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int OOA6hdeuvCS = OOA6hdeuvCS(i6);
                long j8 = 255;
                if (this.EljAMC1QTz != 0 || ((this.GWasM1elztuh[OOA6hdeuvCS >> 3] >> ((OOA6hdeuvCS & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.xqGvceK5x;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compare((this.OOA6hdeuvCS * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.GWasM1elztuh;
                            int i21 = this.xqGvceK5x;
                            int[] iArr2 = this.Yi7zF1RB1;
                            Object[] objArr2 = this.X1lG3V04pd;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                long j9 = j8;
                                long j10 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i23++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int EDwNPVYuViP0 = d5.EDwNPVYuViP0(jArr4);
                            int i24 = EDwNPVYuViP0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[EDwNPVYuViP0] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int OOA6hdeuvCS2 = OOA6hdeuvCS(i28);
                                    int i29 = i28 & i21;
                                    if (((OOA6hdeuvCS2 - i29) & i21) / 8 == ((i25 - i29) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i26] = ((r8 & 127) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i30 = OOA6hdeuvCS2 >> 3;
                                        long j15 = jArr4[i30];
                                        int i31 = (OOA6hdeuvCS2 & 7) << 3;
                                        if (((j15 >> i31) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j << i31)) & j15) | ((r8 & 127) << i31);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[OOA6hdeuvCS2] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[OOA6hdeuvCS2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i30] = ((r8 & 127) << i31) | ((~(j << i31)) & j15);
                                            int i32 = iArr[OOA6hdeuvCS2];
                                            iArr[OOA6hdeuvCS2] = iArr[i25];
                                            iArr[i25] = i32;
                                            Object obj = objArr[OOA6hdeuvCS2];
                                            objArr[OOA6hdeuvCS2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i19] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j14;
                                        i13 = i3;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
                            OOA6hdeuvCS = OOA6hdeuvCS(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int Yi7zF1RB1 = kx0.Yi7zF1RB1(this.xqGvceK5x);
                    long[] jArr5 = this.GWasM1elztuh;
                    int[] iArr3 = this.Yi7zF1RB1;
                    Object[] objArr3 = this.X1lG3V04pd;
                    int i33 = this.xqGvceK5x;
                    EljAMC1QTz(Yi7zF1RB1);
                    long[] jArr6 = this.GWasM1elztuh;
                    int[] iArr4 = this.Yi7zF1RB1;
                    Object[] objArr4 = this.X1lG3V04pd;
                    int i34 = this.xqGvceK5x;
                    int i35 = i19;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr3[i35];
                            int hashCode3 = Integer.hashCode(i36) * i18;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int OOA6hdeuvCS3 = OOA6hdeuvCS(i37 >>> 7);
                            long j16 = i37 & 127;
                            int i38 = OOA6hdeuvCS3 >> 3;
                            int i39 = (OOA6hdeuvCS3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((OOA6hdeuvCS3 - 7) & i34) + (i34 & 7)) >> 3] = j17;
                            iArr4[OOA6hdeuvCS3] = i36;
                            objArr4[OOA6hdeuvCS3] = objArr3[i35];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i35++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    OOA6hdeuvCS = OOA6hdeuvCS(i6);
                }
                this.OOA6hdeuvCS++;
                int i40 = this.EljAMC1QTz;
                long[] jArr7 = this.GWasM1elztuh;
                int i41 = OOA6hdeuvCS >> 3;
                long j18 = jArr7[i41];
                int i42 = (OOA6hdeuvCS & 7) << 3;
                if (((j18 >> i42) & j) != j3) {
                    i2 = i19;
                }
                this.EljAMC1QTz = i40 - i2;
                int i43 = this.xqGvceK5x;
                long j19 = (j18 & (~(j << i42))) | (j2 << i42);
                jArr7[i41] = j19;
                jArr7[(((OOA6hdeuvCS - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return OOA6hdeuvCS;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    public /* synthetic */ rf0() {
        this(6);
    }
}
