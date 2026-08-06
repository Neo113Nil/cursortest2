package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gn0 extends defpackage.j90 {
    public int oh71FJcDz6S2;

    public gn0(int i) {
        this.ZpBGe2uQfcn8 = defpackage.m81.ZpBGe2uQfcn8;
        this.giKS3J6vZuNy = defpackage.t90.ZpBGe2uQfcn8;
        this.fWTAfUmVKrZq = defpackage.vx1.GE9mJIPrb8gP;
        if (i >= 0) {
            oh71FJcDz6S2(defpackage.m81.JhCgjQRTAOCT(i));
        } else {
            defpackage.h7.w7APNrr0aGRc("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int JhCgjQRTAOCT(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        java.lang.Object[] objArr;
        int i3;
        int i4 = -862048943;
        int hashCode = java.lang.Integer.hashCode(i) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.JhCgjQRTAOCT;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.ZpBGe2uQfcn8;
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
                int numberOfTrailingZeros = (i9 + (java.lang.Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.giKS3J6vZuNy[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int WDYagTQQm9ns = WDYagTQQm9ns(i6);
                long j8 = 255;
                if (this.oh71FJcDz6S2 != 0 || ((this.ZpBGe2uQfcn8[WDYagTQQm9ns >> 3] >> ((WDYagTQQm9ns & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.JhCgjQRTAOCT;
                    if (i20 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((this.WDYagTQQm9ns * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.ZpBGe2uQfcn8;
                            int i21 = this.JhCgjQRTAOCT;
                            int[] iArr2 = this.giKS3J6vZuNy;
                            java.lang.Object[] objArr2 = this.fWTAfUmVKrZq;
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
                            int S0YpfprlOYIn = defpackage.y7.S0YpfprlOYIn(jArr4);
                            int i24 = S0YpfprlOYIn - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[S0YpfprlOYIn] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int hashCode2 = java.lang.Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int WDYagTQQm9ns2 = WDYagTQQm9ns(i28);
                                    int i29 = i28 & i21;
                                    if (((WDYagTQQm9ns2 - i29) & i21) / 8 == ((i25 - i29) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i26] = ((r8 & 127) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i30 = WDYagTQQm9ns2 >> 3;
                                        long j15 = jArr4[i30];
                                        int i31 = (WDYagTQQm9ns2 & 7) << 3;
                                        if (((j15 >> i31) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j << i31)) & j15) | ((r8 & 127) << i31);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[WDYagTQQm9ns2] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[WDYagTQQm9ns2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i30] = ((r8 & 127) << i31) | ((~(j << i31)) & j15);
                                            int i32 = iArr[WDYagTQQm9ns2];
                                            iArr[WDYagTQQm9ns2] = iArr[i25];
                                            iArr[i25] = i32;
                                            java.lang.Object obj = objArr[WDYagTQQm9ns2];
                                            objArr[WDYagTQQm9ns2] = objArr[i25];
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
                            this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
                            WDYagTQQm9ns = WDYagTQQm9ns(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int giKS3J6vZuNy = defpackage.m81.giKS3J6vZuNy(this.JhCgjQRTAOCT);
                    long[] jArr5 = this.ZpBGe2uQfcn8;
                    int[] iArr3 = this.giKS3J6vZuNy;
                    java.lang.Object[] objArr3 = this.fWTAfUmVKrZq;
                    int i33 = this.JhCgjQRTAOCT;
                    oh71FJcDz6S2(giKS3J6vZuNy);
                    long[] jArr6 = this.ZpBGe2uQfcn8;
                    int[] iArr4 = this.giKS3J6vZuNy;
                    java.lang.Object[] objArr4 = this.fWTAfUmVKrZq;
                    int i34 = this.JhCgjQRTAOCT;
                    int i35 = i19;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr3[i35];
                            int hashCode3 = java.lang.Integer.hashCode(i36) * i18;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int WDYagTQQm9ns3 = WDYagTQQm9ns(i37 >>> 7);
                            long j16 = i37 & 127;
                            int i38 = WDYagTQQm9ns3 >> 3;
                            int i39 = (WDYagTQQm9ns3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((WDYagTQQm9ns3 - 7) & i34) + (i34 & 7)) >> 3] = j17;
                            iArr4[WDYagTQQm9ns3] = i36;
                            objArr4[WDYagTQQm9ns3] = objArr3[i35];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i35++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    WDYagTQQm9ns = WDYagTQQm9ns(i6);
                }
                this.WDYagTQQm9ns++;
                int i40 = this.oh71FJcDz6S2;
                long[] jArr7 = this.ZpBGe2uQfcn8;
                int i41 = WDYagTQQm9ns >> 3;
                long j18 = jArr7[i41];
                int i42 = (WDYagTQQm9ns & 7) << 3;
                if (((j18 >> i42) & j) != j3) {
                    i2 = i19;
                }
                this.oh71FJcDz6S2 = i40 - i2;
                int i43 = this.JhCgjQRTAOCT;
                long j19 = (j18 & (~(j << i42))) | (j2 << i42);
                jArr7[i41] = j19;
                jArr7[(((WDYagTQQm9ns - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return WDYagTQQm9ns;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    public final void P05cfTpS5W5L(int i, java.lang.Object obj) {
        int JhCgjQRTAOCT = JhCgjQRTAOCT(i);
        this.giKS3J6vZuNy[JhCgjQRTAOCT] = i;
        this.fWTAfUmVKrZq[JhCgjQRTAOCT] = obj;
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
    public final java.lang.Object QiMR8OkAhezm(int i) {
        int i2;
        int hashCode = java.lang.Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.JhCgjQRTAOCT;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.ZpBGe2uQfcn8;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.giKS3J6vZuNy[i2] == i) {
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
        this.WDYagTQQm9ns--;
        long[] jArr2 = this.ZpBGe2uQfcn8;
        int i10 = this.JhCgjQRTAOCT;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j4 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
        jArr2[i11] = j4;
        jArr2[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j4;
        java.lang.Object[] objArr = this.fWTAfUmVKrZq;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final int WDYagTQQm9ns(int i) {
        int i2 = this.JhCgjQRTAOCT;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.ZpBGe2uQfcn8;
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

    public final void fWTAfUmVKrZq() {
        this.WDYagTQQm9ns = 0;
        long[] jArr = this.ZpBGe2uQfcn8;
        if (jArr != defpackage.m81.ZpBGe2uQfcn8) {
            defpackage.y7.lXYSMswtzmix(jArr, -9187201950435737472L);
            long[] jArr2 = this.ZpBGe2uQfcn8;
            int i = this.JhCgjQRTAOCT;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        defpackage.y7.I5Vdbaz9SDkL(0, this.JhCgjQRTAOCT, null, this.fWTAfUmVKrZq);
        this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
    }

    public final void oh71FJcDz6S2(int i) {
        long[] jArr;
        int max = i > 0 ? java.lang.Math.max(7, defpackage.m81.fWTAfUmVKrZq(i)) : 0;
        this.JhCgjQRTAOCT = max;
        if (max == 0) {
            jArr = defpackage.m81.ZpBGe2uQfcn8;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            java.util.Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.ZpBGe2uQfcn8 = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
        this.giKS3J6vZuNy = new int[max];
        this.fWTAfUmVKrZq = new java.lang.Object[max];
    }

    public /* synthetic */ gn0() {
        this(6);
    }
}
