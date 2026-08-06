package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zf0 {
    public int EljAMC1QTz;
    public long[] GWasM1elztuh;
    public int OOA6hdeuvCS;
    public int[] X1lG3V04pd;
    public Object[] Yi7zF1RB1;
    public int xqGvceK5x;

    public zf0(int i) {
        this.GWasM1elztuh = kx0.GWasM1elztuh;
        this.Yi7zF1RB1 = fb1.xqGvceK5x;
        this.X1lG3V04pd = a30.GWasM1elztuh;
        if (i >= 0) {
            OOA6hdeuvCS(kx0.xqGvceK5x(i));
        } else {
            o4.mE4lRynR("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void AvO7iQsrTN(int i, Object obj) {
        int X1lG3V04pd = X1lG3V04pd(obj);
        if (X1lG3V04pd < 0) {
            X1lG3V04pd = ~X1lG3V04pd;
        }
        this.Yi7zF1RB1[X1lG3V04pd] = obj;
        this.X1lG3V04pd[X1lG3V04pd] = i;
    }

    public final void EljAMC1QTz(int i) {
        this.OOA6hdeuvCS--;
        long[] jArr = this.GWasM1elztuh;
        int i2 = this.xqGvceK5x;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.Yi7zF1RB1[i] = null;
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
        d5.JFXS9W1rB5s4(this.Yi7zF1RB1, 0, this.xqGvceK5x);
        this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
    }

    public final void OOA6hdeuvCS(int i) {
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
        this.Yi7zF1RB1 = new Object[max];
        this.X1lG3V04pd = new int[max];
    }

    public final int X1lG3V04pd(Object obj) {
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
                int Yi7zF1RB1 = Yi7zF1RB1(i4);
                long j8 = 255;
                if (this.EljAMC1QTz != 0 || ((this.GWasM1elztuh[Yi7zF1RB1 >> 3] >> ((Yi7zF1RB1 & 7) << 3)) & 255) == 254) {
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
                            int[] iArr = this.X1lG3V04pd;
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
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[EDwNPVYuViP0] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int Yi7zF1RB12 = Yi7zF1RB1(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((Yi7zF1RB12 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = Yi7zF1RB12 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (Yi7zF1RB12 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[Yi7zF1RB12] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[Yi7zF1RB12] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            Object obj3 = objArr[Yi7zF1RB12];
                                            objArr[Yi7zF1RB12] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[Yi7zF1RB12];
                                            iArr[Yi7zF1RB12] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        j11 = j13;
                                        i19 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.EljAMC1QTz = kx0.GWasM1elztuh(this.xqGvceK5x) - this.OOA6hdeuvCS;
                            Yi7zF1RB1 = Yi7zF1RB1(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int Yi7zF1RB13 = kx0.Yi7zF1RB1(this.xqGvceK5x);
                    long[] jArr5 = this.GWasM1elztuh;
                    Object[] objArr3 = this.Yi7zF1RB1;
                    int[] iArr2 = this.X1lG3V04pd;
                    int i30 = this.xqGvceK5x;
                    OOA6hdeuvCS(Yi7zF1RB13);
                    long[] jArr6 = this.GWasM1elztuh;
                    Object[] objArr4 = this.Yi7zF1RB1;
                    int[] iArr3 = this.X1lG3V04pd;
                    int i31 = this.xqGvceK5x;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int Yi7zF1RB14 = Yi7zF1RB1(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = Yi7zF1RB14 >> 3;
                            int i35 = (Yi7zF1RB14 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((Yi7zF1RB14 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[Yi7zF1RB14] = obj4;
                            iArr3[Yi7zF1RB14] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    Yi7zF1RB1 = Yi7zF1RB1(i4);
                }
                this.OOA6hdeuvCS++;
                int i36 = this.EljAMC1QTz;
                long[] jArr7 = this.GWasM1elztuh;
                int i37 = Yi7zF1RB1 >> 3;
                long j17 = jArr7[i37];
                int i38 = (Yi7zF1RB1 & 7) << 3;
                this.EljAMC1QTz = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.xqGvceK5x;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((Yi7zF1RB1 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~Yi7zF1RB1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int Yi7zF1RB1(int i) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zf0)) {
            return false;
        }
        zf0 zf0Var = (zf0) obj;
        if (zf0Var.OOA6hdeuvCS != this.OOA6hdeuvCS) {
            return false;
        }
        Object[] objArr = this.Yi7zF1RB1;
        int[] iArr = this.X1lG3V04pd;
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
                            int i5 = iArr[i4];
                            int xqGvceK5x = zf0Var.xqGvceK5x(obj2);
                            if (xqGvceK5x < 0 || i5 != zf0Var.X1lG3V04pd[xqGvceK5x]) {
                                break loop0;
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
        int[] iArr = this.X1lG3V04pd;
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
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final String toString() {
        if (this.OOA6hdeuvCS == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.Yi7zF1RB1;
        int[] iArr = this.X1lG3V04pd;
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
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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

    public final int xqGvceK5x(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.xqGvceK5x;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.GWasM1elztuh;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (o30.rQPn8YBR(this.Yi7zF1RB1[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public /* synthetic */ zf0() {
        this(6);
    }
}
