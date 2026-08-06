package defpackage;

/* loaded from: classes.dex */
public final class ol0 {
    public int F7NU4MC0GW;
    public long[] IHQe1A4L2xu;
    public int adDC3e2L;
    public java.lang.Object[] oh6vYeIP;
    public int r1MBDhnF;

    public ol0(int i) {
        this.IHQe1A4L2xu = defpackage.z41.IHQe1A4L2xu;
        this.oh6vYeIP = defpackage.s21.adDC3e2L;
        if (i >= 0) {
            xiZrDbcSW0(defpackage.z41.F7NU4MC0GW(i));
        } else {
            defpackage.db.fnWB2E7cs("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean AARZUJiTa() {
        return this.F7NU4MC0GW == 0;
    }

    public final void DFo87pBq1E5(int i) {
        this.F7NU4MC0GW--;
        long[] jArr = this.IHQe1A4L2xu;
        int i2 = this.r1MBDhnF;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.oh6vYeIP[i] = null;
    }

    public final boolean EXtogiMhuM() {
        return this.F7NU4MC0GW != 0;
    }

    public final int F7NU4MC0GW(java.lang.Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        java.lang.Object[] objArr;
        int i2;
        int i3 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.r1MBDhnF;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.IHQe1A4L2xu;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i8 + (java.lang.Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (defpackage.x70.QoRHpC4k(this.oh6vYeIP[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int adDC3e2L = adDC3e2L(i5);
                long j8 = 255;
                if (this.adDC3e2L != 0 || ((this.IHQe1A4L2xu[adDC3e2L >> 3] >> ((adDC3e2L & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.r1MBDhnF;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (java.lang.Long.compare((this.F7NU4MC0GW * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.IHQe1A4L2xu;
                            int i17 = this.r1MBDhnF;
                            java.lang.Object[] objArr2 = this.oh6vYeIP;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int mL9sMlGfef = defpackage.t6.mL9sMlGfef(jArr4);
                            int i21 = mL9sMlGfef - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[mL9sMlGfef] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    java.lang.Object obj2 = objArr2[i22];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i25 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int adDC3e2L2 = adDC3e2L(i25);
                                    int i26 = i25 & i17;
                                    if (((adDC3e2L2 - i26) & i17) / i20 == ((i22 - i26) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i23] = ((r7 & 127) << i24) | ((~(j << i24)) & jArr4[i23]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i27 = adDC3e2L2 >> 3;
                                        long j15 = jArr4[i27];
                                        int i28 = (adDC3e2L2 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j15) | ((r7 & 127) << i28);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[adDC3e2L2] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i27] = ((r7 & 127) << i28) | ((~(j << i28)) & j15);
                                            java.lang.Object obj3 = objArr[adDC3e2L2];
                                            objArr[adDC3e2L2] = objArr[i22];
                                            objArr[i22] = obj3;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.adDC3e2L = defpackage.z41.IHQe1A4L2xu(this.r1MBDhnF) - this.F7NU4MC0GW;
                            adDC3e2L = adDC3e2L(i5);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int oh6vYeIP = defpackage.z41.oh6vYeIP(this.r1MBDhnF);
                    long[] jArr5 = this.IHQe1A4L2xu;
                    java.lang.Object[] objArr3 = this.oh6vYeIP;
                    int i29 = this.r1MBDhnF;
                    xiZrDbcSW0(oh6vYeIP);
                    long[] jArr6 = this.IHQe1A4L2xu;
                    java.lang.Object[] objArr4 = this.oh6vYeIP;
                    int i30 = this.r1MBDhnF;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            java.lang.Object obj4 = objArr3[i31];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int adDC3e2L3 = adDC3e2L(i32 >>> 7);
                            long j16 = i32 & 127;
                            int i33 = adDC3e2L3 >> 3;
                            int i34 = (adDC3e2L3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((adDC3e2L3 - 7) & i30) + (i30 & 7)) >> 3] = j17;
                            objArr4[adDC3e2L3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    adDC3e2L = adDC3e2L(i5);
                }
                this.F7NU4MC0GW++;
                int i35 = this.adDC3e2L;
                long[] jArr7 = this.IHQe1A4L2xu;
                int i36 = adDC3e2L >> 3;
                long j18 = jArr7[i36];
                int i37 = (adDC3e2L & 7) << 3;
                this.adDC3e2L = i35 - (((j18 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.r1MBDhnF;
                long j19 = (j18 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j19;
                jArr7[(((adDC3e2L - 7) & i38) + (i38 & 7)) >> 3] = j19;
                return adDC3e2L;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    public final boolean IHQe1A4L2xu(java.lang.Object obj) {
        int i = this.F7NU4MC0GW;
        this.oh6vYeIP[F7NU4MC0GW(obj)] = obj;
        return this.F7NU4MC0GW != i;
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
    public final boolean JlrlGoKF(java.lang.Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.r1MBDhnF;
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
            DFo87pBq1E5(i);
        }
        return z;
    }

    public final void SH1y5HwkJhh(defpackage.ol0 ol0Var) {
        ol0Var.getClass();
        java.lang.Object[] objArr = ol0Var.oh6vYeIP;
        long[] jArr = ol0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ez2rX8ReCYw(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int adDC3e2L(int i) {
        int i2 = this.r1MBDhnF;
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
        if (!(obj instanceof defpackage.ol0)) {
            return false;
        }
        defpackage.ol0 ol0Var = (defpackage.ol0) obj;
        if (ol0Var.F7NU4MC0GW != this.F7NU4MC0GW) {
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
                        if ((255 & j) < 128 && !ol0Var.r1MBDhnF(objArr[(i << 3) + i3])) {
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

    public final void ez2rX8ReCYw(java.lang.Object obj) {
        this.oh6vYeIP[F7NU4MC0GW(obj)] = obj;
    }

    public final int hashCode() {
        int i = (this.r1MBDhnF * 31) + this.F7NU4MC0GW;
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
        this.F7NU4MC0GW = 0;
        long[] jArr = this.IHQe1A4L2xu;
        if (jArr != defpackage.z41.IHQe1A4L2xu) {
            defpackage.t6.AQHddgaEX(jArr, -9187201950435737472L);
            long[] jArr2 = this.IHQe1A4L2xu;
            int i = this.r1MBDhnF;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        defpackage.t6.nVhUznk1t(0, this.r1MBDhnF, null, this.oh6vYeIP);
        this.adDC3e2L = defpackage.z41.IHQe1A4L2xu(this.r1MBDhnF) - this.F7NU4MC0GW;
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
        int i4 = this.r1MBDhnF;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void riuEU0zW4(java.lang.Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.r1MBDhnF;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.IHQe1A4L2xu;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (defpackage.x70.QoRHpC4k(this.oh6vYeIP[i], obj)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            DFo87pBq1E5(i);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        java.lang.Object[] objArr = this.oh6vYeIP;
        long[] jArr = this.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) ", ");
                            }
                            sb.append((java.lang.CharSequence) (obj == this ? "(this)" : java.lang.String.valueOf(obj)));
                            i2++;
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
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }

    public final void xiZrDbcSW0(int i) {
        long[] jArr;
        int max = i > 0 ? java.lang.Math.max(7, defpackage.z41.r1MBDhnF(i)) : 0;
        this.r1MBDhnF = max;
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
        this.adDC3e2L = defpackage.z41.IHQe1A4L2xu(this.r1MBDhnF) - this.F7NU4MC0GW;
        this.oh6vYeIP = max == 0 ? defpackage.s21.adDC3e2L : new java.lang.Object[max];
    }

    public /* synthetic */ ol0() {
        this(6);
    }
}
