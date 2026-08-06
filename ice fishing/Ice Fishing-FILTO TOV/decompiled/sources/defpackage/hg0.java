package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hg0 {
    public int EljAMC1QTz;
    public long[] GWasM1elztuh;
    public int OOA6hdeuvCS;
    public Object[] X1lG3V04pd;
    public Object[] Yi7zF1RB1;
    public int xqGvceK5x;

    public hg0(int i) {
        this.GWasM1elztuh = kx0.GWasM1elztuh;
        Object[] objArr = fb1.xqGvceK5x;
        this.Yi7zF1RB1 = objArr;
        this.X1lG3V04pd = objArr;
        if (i >= 0) {
            encWxUiV2(kx0.xqGvceK5x(i));
        } else {
            o4.mE4lRynR("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AvO7iQsrTN(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.xqGvceK5x;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.GWasM1elztuh;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (o30.rQPn8YBR(this.Yi7zF1RB1[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return this.X1lG3V04pd[i];
        }
        return null;
    }

    public final Object E7jCp8Ls(int i) {
        this.OOA6hdeuvCS--;
        long[] jArr = this.GWasM1elztuh;
        int i2 = this.xqGvceK5x;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.Yi7zF1RB1[i] = null;
        Object[] objArr = this.X1lG3V04pd;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int EljAMC1QTz(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.xqGvceK5x;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.GWasM1elztuh;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (o30.rQPn8YBR(this.Yi7zF1RB1[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int OOA6hdeuvCS = OOA6hdeuvCS(i4);
                long j8 = 255;
                if (this.EljAMC1QTz != 0 || ((this.GWasM1elztuh[OOA6hdeuvCS >> 3] >> ((OOA6hdeuvCS & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.xqGvceK5x;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((this.OOA6hdeuvCS * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.GWasM1elztuh;
                            int i16 = this.xqGvceK5x;
                            Object[] objArr2 = this.Yi7zF1RB1;
                            Object[] objArr3 = this.X1lG3V04pd;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int EDwNPVYuViP0 = d5.EDwNPVYuViP0(jArr4);
                            int i20 = EDwNPVYuViP0 - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[EDwNPVYuViP0] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int OOA6hdeuvCS2 = OOA6hdeuvCS(i24);
                                    int i25 = i24 & i16;
                                    if (((OOA6hdeuvCS2 - i25) & i16) / i19 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = OOA6hdeuvCS2 >> 3;
                                        long j12 = jArr4[i27];
                                        int i28 = (OOA6hdeuvCS2 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j12) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[OOA6hdeuvCS2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[OOA6hdeuvCS2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j12);
                                            Object obj3 = objArr[OOA6hdeuvCS2];
                                            objArr[OOA6hdeuvCS2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[OOA6hdeuvCS2];
                                            objArr3[OOA6hdeuvCS2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i26;
                                        i16 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
                            OOA6hdeuvCS = OOA6hdeuvCS(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int Yi7zF1RB1 = kx0.Yi7zF1RB1(this.xqGvceK5x);
                    long[] jArr5 = this.GWasM1elztuh;
                    Object[] objArr4 = this.Yi7zF1RB1;
                    Object[] objArr5 = this.X1lG3V04pd;
                    int i29 = this.xqGvceK5x;
                    encWxUiV2(Yi7zF1RB1);
                    long[] jArr6 = this.GWasM1elztuh;
                    Object[] objArr6 = this.Yi7zF1RB1;
                    Object[] objArr7 = this.X1lG3V04pd;
                    int i30 = this.xqGvceK5x;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i31];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int OOA6hdeuvCS3 = OOA6hdeuvCS(i32 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i32 & 127;
                            int i33 = OOA6hdeuvCS3 >> 3;
                            int i34 = (OOA6hdeuvCS3 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((OOA6hdeuvCS3 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[OOA6hdeuvCS3] = obj5;
                            objArr7[OOA6hdeuvCS3] = objArr5[i31];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    OOA6hdeuvCS = OOA6hdeuvCS(i4);
                }
                this.OOA6hdeuvCS++;
                int i35 = this.EljAMC1QTz;
                long[] jArr7 = this.GWasM1elztuh;
                int i36 = OOA6hdeuvCS >> 3;
                long j15 = jArr7[i36];
                int i37 = (OOA6hdeuvCS & 7) << 3;
                this.EljAMC1QTz = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.xqGvceK5x;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j16;
                jArr7[(((OOA6hdeuvCS - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~OOA6hdeuvCS;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void GWasM1elztuh() {
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
        d5.JFXS9W1rB5s4(this.Yi7zF1RB1, 0, this.xqGvceK5x);
        this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
    }

    public final boolean JFJ3QoxA() {
        return this.OOA6hdeuvCS != 0;
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
        int i4 = this.xqGvceK5x;
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

    public final void XnEVoBF0td1l(Object obj, Object obj2) {
        int EljAMC1QTz = EljAMC1QTz(obj);
        if (EljAMC1QTz < 0) {
            EljAMC1QTz = ~EljAMC1QTz;
        }
        this.Yi7zF1RB1[EljAMC1QTz] = obj;
        this.X1lG3V04pd[EljAMC1QTz] = obj2;
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
    public final boolean Yi7zF1RB1(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.xqGvceK5x;
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

    public final void encWxUiV2(int i) {
        long[] jArr;
        Object[] objArr = fb1.xqGvceK5x;
        int max = i > 0 ? Math.max(7, kx0.X1lG3V04pd(i)) : 0;
        this.xqGvceK5x = max;
        if (max == 0) {
            jArr = kx0.GWasM1elztuh;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.GWasM1elztuh = jArr;
        this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
        this.Yi7zF1RB1 = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.X1lG3V04pd = objArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hg0)) {
            return false;
        }
        hg0 hg0Var = (hg0) obj;
        if (hg0Var.OOA6hdeuvCS != this.OOA6hdeuvCS) {
            return false;
        }
        Object[] objArr = this.Yi7zF1RB1;
        Object[] objArr2 = this.X1lG3V04pd;
        long[] jArr = this.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (hg0Var.AvO7iQsrTN(obj2) != null || !hg0Var.X1lG3V04pd(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(hg0Var.AvO7iQsrTN(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.Yi7zF1RB1;
        Object[] objArr2 = this.X1lG3V04pd;
        long[] jArr = this.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        i2 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final boolean mOu10nynGul() {
        return this.OOA6hdeuvCS == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rQPn8YBR(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.xqGvceK5x;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.GWasM1elztuh;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (o30.rQPn8YBR(this.Yi7zF1RB1[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return E7jCp8Ls(i);
        }
        return null;
    }

    public final String toString() {
        if (mOu10nynGul()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.Yi7zF1RB1;
        Object[] objArr2 = this.X1lG3V04pd;
        long[] jArr = this.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this.OOA6hdeuvCS) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean xqGvceK5x(Object obj) {
        Object[] objArr = this.X1lG3V04pd;
        long[] jArr = this.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && o30.rQPn8YBR(obj, objArr[(i << 3) + i3])) {
                            return true;
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
        return false;
    }

    public /* synthetic */ hg0() {
        this(6);
    }
}
