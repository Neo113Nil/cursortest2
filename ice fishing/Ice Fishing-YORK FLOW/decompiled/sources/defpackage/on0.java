package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class on0 {
    public int JhCgjQRTAOCT;
    public int WDYagTQQm9ns;
    public long[] ZpBGe2uQfcn8;
    public int[] fWTAfUmVKrZq;
    public java.lang.Object[] giKS3J6vZuNy;
    public int oh71FJcDz6S2;

    public on0(int i) {
        this.ZpBGe2uQfcn8 = defpackage.m81.ZpBGe2uQfcn8;
        this.giKS3J6vZuNy = defpackage.vx1.GE9mJIPrb8gP;
        this.fWTAfUmVKrZq = defpackage.t90.ZpBGe2uQfcn8;
        if (i >= 0) {
            WDYagTQQm9ns(defpackage.m81.JhCgjQRTAOCT(i));
        } else {
            defpackage.h7.w7APNrr0aGRc("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int JhCgjQRTAOCT(java.lang.Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.JhCgjQRTAOCT;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.ZpBGe2uQfcn8;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy[numberOfTrailingZeros], obj)) {
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

    public final void QiMR8OkAhezm(int i, java.lang.Object obj) {
        int fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq < 0) {
            fWTAfUmVKrZq = ~fWTAfUmVKrZq;
        }
        this.giKS3J6vZuNy[fWTAfUmVKrZq] = obj;
        this.fWTAfUmVKrZq[fWTAfUmVKrZq] = i;
    }

    public final void WDYagTQQm9ns(int i) {
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
        this.giKS3J6vZuNy = new java.lang.Object[max];
        this.fWTAfUmVKrZq = new int[max];
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
        defpackage.y7.I5Vdbaz9SDkL(0, this.JhCgjQRTAOCT, null, this.giKS3J6vZuNy);
        this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.on0)) {
            return false;
        }
        defpackage.on0 on0Var = (defpackage.on0) obj;
        if (on0Var.WDYagTQQm9ns != this.WDYagTQQm9ns) {
            return false;
        }
        java.lang.Object[] objArr = this.giKS3J6vZuNy;
        int[] iArr = this.fWTAfUmVKrZq;
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
                            int i5 = iArr[i4];
                            int JhCgjQRTAOCT = on0Var.JhCgjQRTAOCT(obj2);
                            if (JhCgjQRTAOCT < 0 || i5 != on0Var.fWTAfUmVKrZq[JhCgjQRTAOCT]) {
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

    public final int fWTAfUmVKrZq(java.lang.Object obj) {
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
                int giKS3J6vZuNy = giKS3J6vZuNy(i4);
                long j8 = 255;
                if (this.oh71FJcDz6S2 != 0 || ((this.ZpBGe2uQfcn8[giKS3J6vZuNy >> 3] >> ((giKS3J6vZuNy & 7) << 3)) & 255) == 254) {
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
                            int[] iArr = this.fWTAfUmVKrZq;
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
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[S0YpfprlOYIn] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    java.lang.Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int giKS3J6vZuNy2 = giKS3J6vZuNy(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((giKS3J6vZuNy2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = giKS3J6vZuNy2 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (giKS3J6vZuNy2 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[giKS3J6vZuNy2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[giKS3J6vZuNy2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            java.lang.Object obj3 = objArr[giKS3J6vZuNy2];
                                            objArr[giKS3J6vZuNy2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[giKS3J6vZuNy2];
                                            iArr[giKS3J6vZuNy2] = iArr[i21];
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
                            this.oh71FJcDz6S2 = defpackage.m81.ZpBGe2uQfcn8(this.JhCgjQRTAOCT) - this.WDYagTQQm9ns;
                            giKS3J6vZuNy = giKS3J6vZuNy(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int giKS3J6vZuNy3 = defpackage.m81.giKS3J6vZuNy(this.JhCgjQRTAOCT);
                    long[] jArr5 = this.ZpBGe2uQfcn8;
                    java.lang.Object[] objArr3 = this.giKS3J6vZuNy;
                    int[] iArr2 = this.fWTAfUmVKrZq;
                    int i30 = this.JhCgjQRTAOCT;
                    WDYagTQQm9ns(giKS3J6vZuNy3);
                    long[] jArr6 = this.ZpBGe2uQfcn8;
                    java.lang.Object[] objArr4 = this.giKS3J6vZuNy;
                    int[] iArr3 = this.fWTAfUmVKrZq;
                    int i31 = this.JhCgjQRTAOCT;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            java.lang.Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int giKS3J6vZuNy4 = giKS3J6vZuNy(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = giKS3J6vZuNy4 >> 3;
                            int i35 = (giKS3J6vZuNy4 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((giKS3J6vZuNy4 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[giKS3J6vZuNy4] = obj4;
                            iArr3[giKS3J6vZuNy4] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    giKS3J6vZuNy = giKS3J6vZuNy(i4);
                }
                this.WDYagTQQm9ns++;
                int i36 = this.oh71FJcDz6S2;
                long[] jArr7 = this.ZpBGe2uQfcn8;
                int i37 = giKS3J6vZuNy >> 3;
                long j17 = jArr7[i37];
                int i38 = (giKS3J6vZuNy & 7) << 3;
                this.oh71FJcDz6S2 = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.JhCgjQRTAOCT;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((giKS3J6vZuNy - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~giKS3J6vZuNy;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int giKS3J6vZuNy(int i) {
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

    public final int hashCode() {
        java.lang.Object[] objArr = this.giKS3J6vZuNy;
        int[] iArr = this.fWTAfUmVKrZq;
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

    public final void oh71FJcDz6S2(int i) {
        this.WDYagTQQm9ns--;
        long[] jArr = this.ZpBGe2uQfcn8;
        int i2 = this.JhCgjQRTAOCT;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.giKS3J6vZuNy[i] = null;
    }

    public final java.lang.String toString() {
        if (this.WDYagTQQm9ns == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.giKS3J6vZuNy;
        int[] iArr = this.fWTAfUmVKrZq;
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
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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

    public /* synthetic */ on0() {
        this(6);
    }
}
