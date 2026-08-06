package defpackage;

/* loaded from: classes.dex */
public final class hl0 {
    public int AARZUJiTa;
    public int EXtogiMhuM;
    public int xiZrDbcSW0;
    public long[] IHQe1A4L2xu = defpackage.z41.IHQe1A4L2xu;
    public java.lang.Object[] oh6vYeIP = defpackage.s21.adDC3e2L;
    public long[] r1MBDhnF = defpackage.x70.EXtogiMhuM;
    public int F7NU4MC0GW = Integer.MAX_VALUE;
    public int adDC3e2L = Integer.MAX_VALUE;

    public hl0(int i) {
        if (i >= 0) {
            xiZrDbcSW0(defpackage.z41.F7NU4MC0GW(i));
        } else {
            defpackage.db.fnWB2E7cs("Capacity must be a positive value.");
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
    public final boolean AARZUJiTa(java.lang.Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.xiZrDbcSW0;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.IHQe1A4L2xu;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (defpackage.x70.QoRHpC4k(this.oh6vYeIP[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = i >= 0;
        if (z) {
            EXtogiMhuM(i);
        }
        return z;
    }

    public final void EXtogiMhuM(int i) {
        this.AARZUJiTa--;
        long[] jArr = this.IHQe1A4L2xu;
        int i2 = this.xiZrDbcSW0;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.oh6vYeIP[i] = null;
        long[] jArr2 = this.r1MBDhnF;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.F7NU4MC0GW = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.adDC3e2L = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int F7NU4MC0GW(java.lang.Object obj) {
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
        int i6 = this.xiZrDbcSW0;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.IHQe1A4L2xu;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (defpackage.x70.QoRHpC4k(this.oh6vYeIP[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int adDC3e2L = adDC3e2L(i4);
                long j9 = 255;
                if (this.EXtogiMhuM != 0 || ((this.IHQe1A4L2xu[adDC3e2L >> 3] >> ((adDC3e2L & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.xiZrDbcSW0;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (java.lang.Long.compare((this.AARZUJiTa * 32) ^ Long.MIN_VALUE, (i13 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.IHQe1A4L2xu;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.xiZrDbcSW0;
                                java.lang.Object[] objArr = this.oh6vYeIP;
                                long[] jArr5 = this.r1MBDhnF;
                                long[] jArr6 = new long[i14];
                                java.util.Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
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
                                        java.lang.Object obj2 = objArr[i20];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int adDC3e2L2 = adDC3e2L(i23);
                                        int i24 = i23 & i14;
                                        if (((adDC3e2L2 - i24) & i14) / 8 == ((i20 - i24) & i14) / 8) {
                                            int i25 = i14;
                                            java.lang.Object[] objArr2 = objArr;
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
                                            java.lang.Object[] objArr3 = objArr;
                                            int i27 = adDC3e2L2 >> 3;
                                            long j14 = jArr4[i27];
                                            int i28 = (adDC3e2L2 & 7) << 3;
                                            if (((j14 >> i28) & j2) == 128) {
                                                jArr4[i27] = (j14 & (~(j2 << i28))) | ((r17 & 127) << i28);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[adDC3e2L2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[adDC3e2L2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i29 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i29 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i29] = adDC3e2L2 | (jArr6[i29] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = 9223372032559808512L | adDC3e2L2;
                                                }
                                                jArr6[adDC3e2L2] = (i20 << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i27] = ((r17 & 127) << i28) | (j14 & (~(j2 << i28)));
                                                java.lang.Object obj3 = objArr3[adDC3e2L2];
                                                objArr3[adDC3e2L2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[adDC3e2L2];
                                                jArr5[adDC3e2L2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    long j16 = adDC3e2L2;
                                                    jArr6[i30] = (jArr6[i30] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = adDC3e2L2;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i30 = i20;
                                                }
                                                jArr6[adDC3e2L2] = (i30 << 32) | i20;
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
                                this.EXtogiMhuM = defpackage.z41.IHQe1A4L2xu(this.xiZrDbcSW0) - this.AARZUJiTa;
                                long[] jArr7 = this.r1MBDhnF;
                                int length2 = jArr7.length;
                                for (int i31 = 0; i31 < length2; i31++) {
                                    long j18 = jArr7[i31];
                                    jArr7[i31] = (((j18 & (-4611686018427387904L)) | (((int) ((j18 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j18 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i32 = this.F7NU4MC0GW;
                                if (i32 != Integer.MAX_VALUE) {
                                    this.F7NU4MC0GW = (int) (jArr6[i32] & 4294967295L);
                                }
                                int i33 = this.adDC3e2L;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.adDC3e2L = (int) (jArr6[i33] & 4294967295L);
                                }
                            }
                            adDC3e2L = adDC3e2L(i4);
                        }
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int oh6vYeIP = defpackage.z41.oh6vYeIP(this.xiZrDbcSW0);
                    long[] jArr8 = this.IHQe1A4L2xu;
                    java.lang.Object[] objArr4 = this.oh6vYeIP;
                    long[] jArr9 = this.r1MBDhnF;
                    int i34 = this.xiZrDbcSW0;
                    int[] iArr = new int[i34];
                    xiZrDbcSW0(oh6vYeIP);
                    long[] jArr10 = this.IHQe1A4L2xu;
                    java.lang.Object[] objArr5 = this.oh6vYeIP;
                    long[] jArr11 = this.r1MBDhnF;
                    int i35 = this.xiZrDbcSW0;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr8[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            java.lang.Object obj4 = objArr4[i36];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int adDC3e2L3 = adDC3e2L(i37 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i37 & 127;
                            int i38 = adDC3e2L3 >> 3;
                            int i39 = (adDC3e2L3 & 7) << 3;
                            long j20 = (jArr[i38] & (~(255 << i39))) | (j19 << i39);
                            jArr[i38] = j20;
                            jArr[(((adDC3e2L3 - 7) & i35) + (i35 & 7)) >> 3] = j20;
                            objArr5[adDC3e2L3] = obj4;
                            jArr11[adDC3e2L3] = jArr9[i36];
                            iArr[i36] = adDC3e2L3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i36++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.r1MBDhnF;
                    int length3 = jArr12.length;
                    for (int i40 = 0; i40 < length3; i40++) {
                        long j21 = jArr12[i40];
                        jArr12[i40] = (((j21 & (-4611686018427387904L)) | (((int) ((j21 >> c) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c) | (((int) (j21 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i41 = this.F7NU4MC0GW;
                    if (i41 != Integer.MAX_VALUE) {
                        this.F7NU4MC0GW = iArr[i41];
                    }
                    int i42 = this.adDC3e2L;
                    if (i42 != Integer.MAX_VALUE) {
                        this.adDC3e2L = iArr[i42];
                    }
                    adDC3e2L = adDC3e2L(i4);
                }
                this.AARZUJiTa++;
                int i43 = this.EXtogiMhuM;
                long[] jArr13 = this.IHQe1A4L2xu;
                int i44 = adDC3e2L >> 3;
                long j22 = jArr13[i44];
                int i45 = (adDC3e2L & 7) << 3;
                if (((j22 >> i45) & j2) == j3) {
                    i = 1;
                }
                this.EXtogiMhuM = i43 - i;
                int i46 = this.xiZrDbcSW0;
                long j23 = (j22 & (~(j2 << i45))) | (j << i45);
                jArr13[i44] = j23;
                jArr13[(((adDC3e2L - 7) & i46) + (i46 & 7)) >> 3] = j23;
                return adDC3e2L;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    public final boolean IHQe1A4L2xu(java.lang.Object obj) {
        int i = this.AARZUJiTa;
        int F7NU4MC0GW = F7NU4MC0GW(obj);
        this.oh6vYeIP[F7NU4MC0GW] = obj;
        long[] jArr = this.r1MBDhnF;
        int i2 = this.F7NU4MC0GW;
        jArr[F7NU4MC0GW] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((F7NU4MC0GW & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.F7NU4MC0GW = F7NU4MC0GW;
        if (this.adDC3e2L == Integer.MAX_VALUE) {
            this.adDC3e2L = F7NU4MC0GW;
        }
        return this.AARZUJiTa != i;
    }

    public final int adDC3e2L(int i) {
        int i2 = this.xiZrDbcSW0;
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

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.hl0)) {
            return false;
        }
        defpackage.hl0 hl0Var = (defpackage.hl0) obj;
        if (hl0Var.AARZUJiTa != this.AARZUJiTa) {
            return false;
        }
        java.lang.Object[] objArr = this.oh6vYeIP;
        long[] jArr = this.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !hl0Var.r1MBDhnF(objArr[(i << 3) + i3])) {
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
        int i = (this.xiZrDbcSW0 * 31) + this.AARZUJiTa;
        java.lang.Object[] objArr = this.oh6vYeIP;
        long[] jArr = this.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i2 << 3) + i4];
                            if (!defpackage.x70.QoRHpC4k(obj, this)) {
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

    public final void oh6vYeIP() {
        this.AARZUJiTa = 0;
        long[] jArr = this.IHQe1A4L2xu;
        if (jArr != defpackage.z41.IHQe1A4L2xu) {
            defpackage.t6.AQHddgaEX(jArr, -9187201950435737472L);
            long[] jArr2 = this.IHQe1A4L2xu;
            int i = this.xiZrDbcSW0;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        defpackage.t6.nVhUznk1t(0, this.xiZrDbcSW0, null, this.oh6vYeIP);
        defpackage.t6.AQHddgaEX(this.r1MBDhnF, 4611686018427387903L);
        this.F7NU4MC0GW = Integer.MAX_VALUE;
        this.adDC3e2L = Integer.MAX_VALUE;
        this.EXtogiMhuM = defpackage.z41.IHQe1A4L2xu(this.xiZrDbcSW0) - this.AARZUJiTa;
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
    public final boolean r1MBDhnF(java.lang.Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.xiZrDbcSW0;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.IHQe1A4L2xu;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (defpackage.x70.QoRHpC4k(this.oh6vYeIP[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final boolean riuEU0zW4(java.util.Collection collection) {
        collection.getClass();
        java.lang.Object[] objArr = this.oh6vYeIP;
        int i = this.AARZUJiTa;
        long[] jArr = this.IHQe1A4L2xu;
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
                            if (!defpackage.td.CGXpA9s3RjIa(collection, objArr[i5])) {
                                EXtogiMhuM(i5);
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
        return i != this.AARZUJiTa;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        java.lang.Object[] objArr = this.oh6vYeIP;
        long[] jArr = this.r1MBDhnF;
        int i = this.adDC3e2L;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            java.lang.Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append((java.lang.CharSequence) (obj == this ? "(this)" : java.lang.String.valueOf(obj)));
            i2++;
            i = i3;
        }
        return sb.toString();
    }

    public final void xiZrDbcSW0(int i) {
        long[] jArr;
        long[] jArr2;
        int max = i > 0 ? java.lang.Math.max(7, defpackage.z41.r1MBDhnF(i)) : 0;
        this.xiZrDbcSW0 = max;
        if (max == 0) {
            jArr = defpackage.z41.IHQe1A4L2xu;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            java.util.Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.IHQe1A4L2xu = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.EXtogiMhuM = defpackage.z41.IHQe1A4L2xu(this.xiZrDbcSW0) - this.AARZUJiTa;
        this.oh6vYeIP = max == 0 ? defpackage.s21.adDC3e2L : new java.lang.Object[max];
        if (max == 0) {
            jArr2 = defpackage.x70.EXtogiMhuM;
        } else {
            long[] jArr4 = new long[max];
            java.util.Arrays.fill(jArr4, 0, max, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.r1MBDhnF = jArr2;
    }
}
