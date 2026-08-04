package com.gamericefishpro.space.t;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public long[] a = p0.a;
    public long[] b = p.a;
    public Object[] c = com.gamericefishpro.space.u.a.c;
    public int d;
    public int e;
    public int f;

    public z(int i) {
        if (i >= 0) {
            e(p0.d(i));
        } else {
            com.gamericefishpro.space.u.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != p0.a) {
            com.gamericefishpro.space.ph.u.k(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        com.gamericefishpro.space.ph.u.i(0, this.d, null, this.c);
        this.f = p0.a(this.d) - this.e;
    }

    public final boolean b(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
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

    public final Object d(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, p0.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = p0.a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            com.gamericefishpro.space.ph.u.k(jArr, -9187201950435737472L);
        }
        this.a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f = p0.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        boolean z2;
        long[] jArr2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.e != this.e) {
            return false;
        }
        long[] jArr3 = this.b;
        Object[] objArr = this.c;
        long[] jArr4 = this.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr4[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        z2 = z3;
                        jArr2 = jArr3;
                        long j2 = jArr2[i4];
                        Object obj2 = objArr[i4];
                        if (obj2 == null) {
                            if (zVar.d(j2) != null || !zVar.b(j2)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(zVar.d(j2))) {
                            return false;
                        }
                    } else {
                        z2 = z3;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i3++;
                    z3 = z2;
                    jArr3 = jArr2;
                }
                z = z3;
                jArr = jArr3;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z3;
                jArr = jArr3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
            jArr3 = jArr;
        }
        return false;
    }

    public final void f(long j, Object obj) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int iNumberOfTrailingZeros;
        long[] jArr;
        long j5;
        long[] jArr2;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j6 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j7 = i6;
            int i13 = i9;
            int i14 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j9) >> 3)) & i7;
                int i15 = i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iC = c(i5);
                if (this.f != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 > 8) {
                        j4 = 128;
                        long j10 = this.e;
                        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
                        if (Long.compareUnsigned(j10 * 32, ((long) i17) * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i18 = this.d;
                            long[] jArr5 = this.b;
                            Object[] objArr2 = this.c;
                            int i19 = (i18 + 7) >> 3;
                            j2 = 255;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j11 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i20++;
                                i12 = i12;
                                i14 = i14;
                                j7 = j7;
                            }
                            j3 = j7;
                            i = i14;
                            int i21 = i12;
                            char c = 7;
                            int iS = com.gamericefishpro.space.ph.v.s(jArr4);
                            int i22 = iS - 1;
                            long j12 = 72057594037927935L;
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iS] = jArr4[i];
                            int i23 = i;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j13 = (jArr4[i24] >> i25) & 255;
                                if (j13 != 128 && j13 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i23]) * i16;
                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i27 = i26 >>> 7;
                                    int iC2 = c(i27);
                                    int i28 = i27 & i18;
                                    c = c;
                                    i21 = i21;
                                    if (((iC2 - i28) & i18) / 8 == ((i23 - i28) & i18) / 8) {
                                        j5 = j12;
                                        jArr4[i24] = (((long) (i26 & 127)) << i25) | (jArr4[i24] & (~(255 << i25)));
                                        Intrinsics.checkNotNullParameter(jArr4, "<this>");
                                        jArr4[jArr4.length - 1] = (jArr4[i] & j5) | Long.MIN_VALUE;
                                        i23++;
                                    } else {
                                        j5 = j12;
                                        int i29 = iC2 >> 3;
                                        long j14 = jArr4[i29];
                                        int i30 = (iC2 & 7) << 3;
                                        if (((j14 >> i30) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i29] = ((~(255 << i30)) & j14) | (((long) (i26 & 127)) << i30);
                                            jArr4[i24] = (jArr4[i24] & (~(255 << i25))) | (128 << i25);
                                            jArr2[iC2] = jArr2[i23];
                                            jArr2[i23] = 0;
                                            objArr[iC2] = objArr[i23];
                                            objArr[i23] = null;
                                        } else {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i29] = ((~(255 << i30)) & j14) | (((long) (i26 & 127)) << i30);
                                            long j15 = jArr2[iC2];
                                            jArr2[iC2] = jArr2[i23];
                                            jArr2[i23] = j15;
                                            Object obj2 = objArr[iC2];
                                            objArr[iC2] = objArr[i23];
                                            objArr[i23] = obj2;
                                            i23--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr4, "<this>");
                                        jArr4[jArr4.length - 1] = (jArr4[i] & j5) | Long.MIN_VALUE;
                                        i23++;
                                        jArr5 = jArr2;
                                        objArr2 = objArr;
                                    }
                                    j12 = j5;
                                } else {
                                    i23++;
                                }
                            }
                            i2 = i21;
                            this.f = p0.a(this.d) - this.e;
                        }
                        iC = c(i5);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    int iB = p0.b(this.d);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    Object[] objArr3 = this.c;
                    int i31 = this.d;
                    e(iB);
                    long[] jArr8 = this.a;
                    long[] jArr9 = this.b;
                    Object[] objArr4 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr6[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < j4) {
                            long j16 = jArr7[i33];
                            int iHashCode3 = Long.hashCode(j16) * i16;
                            int i34 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i34 >>> 7);
                            jArr = jArr8;
                            long j17 = i34 & 127;
                            int i35 = iC3 >> 3;
                            int i36 = (iC3 & 7) << 3;
                            long j18 = (jArr[i35] & (~(255 << i36))) | (j17 << i36);
                            jArr[i35] = j18;
                            jArr[(((iC3 - 7) & i32) + (i32 & 7)) >> 3] = j18;
                            jArr9[iC3] = j16;
                            objArr4[iC3] = objArr3[i33];
                        } else {
                            jArr = jArr8;
                        }
                        i33++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iC = c(i5);
                }
                iNumberOfTrailingZeros = iC;
                this.e++;
                int i37 = this.f;
                long[] jArr10 = this.a;
                int i38 = iNumberOfTrailingZeros >> 3;
                long j19 = jArr10[i38];
                int i39 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j19 >> i39) & j2) != j4) {
                    i2 = i;
                }
                this.f = i37 - i2;
                int i40 = this.d;
                long j20 = (j19 & (~(j2 << i39))) | (j3 << i39);
                jArr10[i38] = j20;
                jArr10[(((iNumberOfTrailingZeros - 7) & i40) + (i40 & 7)) >> 3] = j20;
                break;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i16;
        }
        this.b[iNumberOfTrailingZeros] = j;
        this.c[iNumberOfTrailingZeros] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
