package defpackage;

/* loaded from: classes.dex */
public final class fl0 {
    public int F7NU4MC0GW;
    public long[] IHQe1A4L2xu;
    public int adDC3e2L;
    public java.lang.Object[] oh6vYeIP;
    public int[] r1MBDhnF;
    public int xiZrDbcSW0;

    public fl0(int i) {
        this.IHQe1A4L2xu = defpackage.z41.IHQe1A4L2xu;
        this.oh6vYeIP = defpackage.s21.adDC3e2L;
        this.r1MBDhnF = defpackage.h70.IHQe1A4L2xu;
        if (i >= 0) {
            adDC3e2L(defpackage.z41.F7NU4MC0GW(i));
        } else {
            defpackage.db.fnWB2E7cs("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void AARZUJiTa(int i, java.lang.Object obj) {
        int r1MBDhnF = r1MBDhnF(obj);
        if (r1MBDhnF < 0) {
            r1MBDhnF = ~r1MBDhnF;
        }
        this.oh6vYeIP[r1MBDhnF] = obj;
        this.r1MBDhnF[r1MBDhnF] = i;
    }

    public final int F7NU4MC0GW(java.lang.Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.F7NU4MC0GW;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.IHQe1A4L2xu;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (defpackage.x70.QoRHpC4k(this.oh6vYeIP[numberOfTrailingZeros], obj)) {
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

    public final void IHQe1A4L2xu() {
        this.adDC3e2L = 0;
        long[] jArr = this.IHQe1A4L2xu;
        if (jArr != defpackage.z41.IHQe1A4L2xu) {
            defpackage.t6.AQHddgaEX(jArr, -9187201950435737472L);
            long[] jArr2 = this.IHQe1A4L2xu;
            int i = this.F7NU4MC0GW;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        defpackage.t6.nVhUznk1t(0, this.F7NU4MC0GW, null, this.oh6vYeIP);
        this.xiZrDbcSW0 = defpackage.z41.IHQe1A4L2xu(this.F7NU4MC0GW) - this.adDC3e2L;
    }

    public final void adDC3e2L(int i) {
        long[] jArr;
        int max = i > 0 ? java.lang.Math.max(7, defpackage.z41.r1MBDhnF(i)) : 0;
        this.F7NU4MC0GW = max;
        if (max == 0) {
            jArr = defpackage.z41.IHQe1A4L2xu;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            java.util.Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.IHQe1A4L2xu = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.xiZrDbcSW0 = defpackage.z41.IHQe1A4L2xu(this.F7NU4MC0GW) - this.adDC3e2L;
        this.oh6vYeIP = new java.lang.Object[max];
        this.r1MBDhnF = new int[max];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.fl0)) {
            return false;
        }
        defpackage.fl0 fl0Var = (defpackage.fl0) obj;
        if (fl0Var.adDC3e2L != this.adDC3e2L) {
            return false;
        }
        java.lang.Object[] objArr = this.oh6vYeIP;
        int[] iArr = this.r1MBDhnF;
        long[] jArr = this.IHQe1A4L2xu;
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
                            java.lang.Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int F7NU4MC0GW = fl0Var.F7NU4MC0GW(obj2);
                            if (F7NU4MC0GW < 0 || i5 != fl0Var.r1MBDhnF[F7NU4MC0GW]) {
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
        java.lang.Object[] objArr = this.oh6vYeIP;
        int[] iArr = this.r1MBDhnF;
        long[] jArr = this.IHQe1A4L2xu;
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
                        java.lang.Object obj = objArr[i5];
                        i2 += java.lang.Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final int oh6vYeIP(int i) {
        int i2 = this.F7NU4MC0GW;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.IHQe1A4L2xu;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int r1MBDhnF(java.lang.Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        java.lang.Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.F7NU4MC0GW;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.IHQe1A4L2xu;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (java.lang.Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (defpackage.x70.QoRHpC4k(this.oh6vYeIP[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int oh6vYeIP = oh6vYeIP(i4);
                long j8 = 255;
                if (this.xiZrDbcSW0 != 0 || ((this.IHQe1A4L2xu[oh6vYeIP >> 3] >> ((oh6vYeIP & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.F7NU4MC0GW;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (java.lang.Long.compare((this.adDC3e2L * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.IHQe1A4L2xu;
                            int i16 = this.F7NU4MC0GW;
                            java.lang.Object[] objArr2 = this.oh6vYeIP;
                            int[] iArr = this.r1MBDhnF;
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
                            int mL9sMlGfef = defpackage.t6.mL9sMlGfef(jArr4);
                            int i20 = mL9sMlGfef - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[mL9sMlGfef] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    java.lang.Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int oh6vYeIP2 = oh6vYeIP(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((oh6vYeIP2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = oh6vYeIP2 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (oh6vYeIP2 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[oh6vYeIP2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[oh6vYeIP2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            java.lang.Object obj3 = objArr[oh6vYeIP2];
                                            objArr[oh6vYeIP2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[oh6vYeIP2];
                                            iArr[oh6vYeIP2] = iArr[i21];
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
                            this.xiZrDbcSW0 = defpackage.z41.IHQe1A4L2xu(this.F7NU4MC0GW) - this.adDC3e2L;
                            oh6vYeIP = oh6vYeIP(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int oh6vYeIP3 = defpackage.z41.oh6vYeIP(this.F7NU4MC0GW);
                    long[] jArr5 = this.IHQe1A4L2xu;
                    java.lang.Object[] objArr3 = this.oh6vYeIP;
                    int[] iArr2 = this.r1MBDhnF;
                    int i30 = this.F7NU4MC0GW;
                    adDC3e2L(oh6vYeIP3);
                    long[] jArr6 = this.IHQe1A4L2xu;
                    java.lang.Object[] objArr4 = this.oh6vYeIP;
                    int[] iArr3 = this.r1MBDhnF;
                    int i31 = this.F7NU4MC0GW;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            java.lang.Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int oh6vYeIP4 = oh6vYeIP(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = oh6vYeIP4 >> 3;
                            int i35 = (oh6vYeIP4 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((oh6vYeIP4 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[oh6vYeIP4] = obj4;
                            iArr3[oh6vYeIP4] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    oh6vYeIP = oh6vYeIP(i4);
                }
                this.adDC3e2L++;
                int i36 = this.xiZrDbcSW0;
                long[] jArr7 = this.IHQe1A4L2xu;
                int i37 = oh6vYeIP >> 3;
                long j17 = jArr7[i37];
                int i38 = (oh6vYeIP & 7) << 3;
                this.xiZrDbcSW0 = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.F7NU4MC0GW;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((oh6vYeIP - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~oh6vYeIP;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final java.lang.String toString() {
        if (this.adDC3e2L == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.oh6vYeIP;
        int[] iArr = this.r1MBDhnF;
        long[] jArr = this.IHQe1A4L2xu;
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
                            java.lang.Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.adDC3e2L) {
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

    public final void xiZrDbcSW0(int i) {
        this.adDC3e2L--;
        long[] jArr = this.IHQe1A4L2xu;
        int i2 = this.F7NU4MC0GW;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.oh6vYeIP[i] = null;
    }

    public /* synthetic */ fl0() {
        this(6);
    }
}
