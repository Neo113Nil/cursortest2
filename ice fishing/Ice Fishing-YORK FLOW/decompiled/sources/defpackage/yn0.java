package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yn0 {
    public int JhCgjQRTAOCT;
    public int WDYagTQQm9ns;
    public long[] ZpBGe2uQfcn8;
    public java.lang.Object[] fWTAfUmVKrZq;
    public java.lang.Object[] giKS3J6vZuNy;
    public int oh71FJcDz6S2;

    public yn0(int i) {
        this.ZpBGe2uQfcn8 = defpackage.m81.ZpBGe2uQfcn8;
        java.lang.Object[] objArr = defpackage.vx1.GE9mJIPrb8gP;
        this.giKS3J6vZuNy = objArr;
        this.fWTAfUmVKrZq = objArr;
        if (i >= 0) {
            P05cfTpS5W5L(defpackage.m81.JhCgjQRTAOCT(i));
        } else {
            defpackage.h7.w7APNrr0aGRc("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean GE9mJIPrb8gP() {
        return this.WDYagTQQm9ns != 0;
    }

    public final boolean JhCgjQRTAOCT(java.lang.Object obj) {
        java.lang.Object[] objArr = this.fWTAfUmVKrZq;
        long[] jArr = this.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && defpackage.ma0.QiMR8OkAhezm(obj, objArr[(i << 3) + i3])) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Ns0WNyEWdPsk(java.lang.Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.JhCgjQRTAOCT;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.ZpBGe2uQfcn8;
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
                if (defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return fNwYGHIYeJcR(i);
        }
        return null;
    }

    public final void P05cfTpS5W5L(int i) {
        long[] jArr;
        java.lang.Object[] objArr = defpackage.vx1.GE9mJIPrb8gP;
        int max = i > 0 ? java.lang.Math.max(7, defpackage.m81.fWTAfUmVKrZq(i)) : 0;
        this.JhCgjQRTAOCT = max;
        if (max == 0) {
            jArr = defpackage.m81.ZpBGe2uQfcn8;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            java.util.Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.ZpBGe2uQfcn8 = jArr;
        this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
        this.giKS3J6vZuNy = max == 0 ? objArr : new java.lang.Object[max];
        if (max != 0) {
            objArr = new java.lang.Object[max];
        }
        this.fWTAfUmVKrZq = objArr;
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
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.JhCgjQRTAOCT;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.ZpBGe2uQfcn8;
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
                if (defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return this.fWTAfUmVKrZq[i];
        }
        return null;
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

    public final void ZpBGe2uQfcn8() {
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
        defpackage.y7.I5Vdbaz9SDkL(0, this.JhCgjQRTAOCT, null, this.giKS3J6vZuNy);
        this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
    }

    public final boolean e6mdH7fiFuta() {
        return this.WDYagTQQm9ns == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.yn0)) {
            return false;
        }
        defpackage.yn0 yn0Var = (defpackage.yn0) obj;
        if (yn0Var.WDYagTQQm9ns != this.WDYagTQQm9ns) {
            return false;
        }
        java.lang.Object[] objArr = this.giKS3J6vZuNy;
        java.lang.Object[] objArr2 = this.fWTAfUmVKrZq;
        long[] jArr = this.ZpBGe2uQfcn8;
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
                            java.lang.Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (yn0Var.QiMR8OkAhezm(obj2) != null || !yn0Var.fWTAfUmVKrZq(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(yn0Var.QiMR8OkAhezm(obj2))) {
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

    public final java.lang.Object fNwYGHIYeJcR(int i) {
        this.WDYagTQQm9ns--;
        long[] jArr = this.ZpBGe2uQfcn8;
        int i2 = this.JhCgjQRTAOCT;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.giKS3J6vZuNy[i] = null;
        java.lang.Object[] objArr = this.fWTAfUmVKrZq;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
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
    public final boolean fWTAfUmVKrZq(java.lang.Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.JhCgjQRTAOCT;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.ZpBGe2uQfcn8;
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
                if (defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
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
    public final boolean giKS3J6vZuNy(java.lang.Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.JhCgjQRTAOCT;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.ZpBGe2uQfcn8;
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
                if (defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final void h3m55N1URyyK(java.lang.Object obj, java.lang.Object obj2) {
        int oh71FJcDz6S2 = oh71FJcDz6S2(obj);
        if (oh71FJcDz6S2 < 0) {
            oh71FJcDz6S2 = ~oh71FJcDz6S2;
        }
        this.giKS3J6vZuNy[oh71FJcDz6S2] = obj;
        this.fWTAfUmVKrZq[oh71FJcDz6S2] = obj2;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.giKS3J6vZuNy;
        java.lang.Object[] objArr2 = this.fWTAfUmVKrZq;
        long[] jArr = this.ZpBGe2uQfcn8;
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
                        java.lang.Object obj2 = objArr2[i5];
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

    public final int oh71FJcDz6S2(java.lang.Object obj) {
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
        int i6 = this.JhCgjQRTAOCT;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.ZpBGe2uQfcn8;
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
                if (defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int WDYagTQQm9ns = WDYagTQQm9ns(i4);
                long j8 = 255;
                if (this.oh71FJcDz6S2 != 0 || ((this.ZpBGe2uQfcn8[WDYagTQQm9ns >> 3] >> ((WDYagTQQm9ns & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.JhCgjQRTAOCT;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (java.lang.Long.compare((this.WDYagTQQm9ns * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.ZpBGe2uQfcn8;
                            int i16 = this.JhCgjQRTAOCT;
                            java.lang.Object[] objArr2 = this.giKS3J6vZuNy;
                            java.lang.Object[] objArr3 = this.fWTAfUmVKrZq;
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
                            int S0YpfprlOYIn = defpackage.y7.S0YpfprlOYIn(jArr4);
                            int i20 = S0YpfprlOYIn - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[S0YpfprlOYIn] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    java.lang.Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int WDYagTQQm9ns2 = WDYagTQQm9ns(i24);
                                    int i25 = i24 & i16;
                                    if (((WDYagTQQm9ns2 - i25) & i16) / i19 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = WDYagTQQm9ns2 >> 3;
                                        long j12 = jArr4[i27];
                                        int i28 = (WDYagTQQm9ns2 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j12) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[WDYagTQQm9ns2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[WDYagTQQm9ns2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j12);
                                            java.lang.Object obj3 = objArr[WDYagTQQm9ns2];
                                            objArr[WDYagTQQm9ns2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            java.lang.Object obj4 = objArr3[WDYagTQQm9ns2];
                                            objArr3[WDYagTQQm9ns2] = objArr3[i21];
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
                            this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
                            WDYagTQQm9ns = WDYagTQQm9ns(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int giKS3J6vZuNy = defpackage.m81.giKS3J6vZuNy(this.JhCgjQRTAOCT);
                    long[] jArr5 = this.ZpBGe2uQfcn8;
                    java.lang.Object[] objArr4 = this.giKS3J6vZuNy;
                    java.lang.Object[] objArr5 = this.fWTAfUmVKrZq;
                    int i29 = this.JhCgjQRTAOCT;
                    P05cfTpS5W5L(giKS3J6vZuNy);
                    long[] jArr6 = this.ZpBGe2uQfcn8;
                    java.lang.Object[] objArr6 = this.giKS3J6vZuNy;
                    java.lang.Object[] objArr7 = this.fWTAfUmVKrZq;
                    int i30 = this.JhCgjQRTAOCT;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            java.lang.Object obj5 = objArr4[i31];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int WDYagTQQm9ns3 = WDYagTQQm9ns(i32 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i32 & 127;
                            int i33 = WDYagTQQm9ns3 >> 3;
                            int i34 = (WDYagTQQm9ns3 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((WDYagTQQm9ns3 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[WDYagTQQm9ns3] = obj5;
                            objArr7[WDYagTQQm9ns3] = objArr5[i31];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    WDYagTQQm9ns = WDYagTQQm9ns(i4);
                }
                this.WDYagTQQm9ns++;
                int i35 = this.oh71FJcDz6S2;
                long[] jArr7 = this.ZpBGe2uQfcn8;
                int i36 = WDYagTQQm9ns >> 3;
                long j15 = jArr7[i36];
                int i37 = (WDYagTQQm9ns & 7) << 3;
                this.oh71FJcDz6S2 = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.JhCgjQRTAOCT;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j16;
                jArr7[(((WDYagTQQm9ns - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~WDYagTQQm9ns;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final java.lang.String toString() {
        if (e6mdH7fiFuta()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.giKS3J6vZuNy;
        java.lang.Object[] objArr2 = this.fWTAfUmVKrZq;
        long[] jArr = this.ZpBGe2uQfcn8;
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
                            java.lang.Object obj2 = objArr2[i5];
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
                            if (i2 < this.WDYagTQQm9ns) {
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

    public /* synthetic */ yn0() {
        this(6);
    }
}
