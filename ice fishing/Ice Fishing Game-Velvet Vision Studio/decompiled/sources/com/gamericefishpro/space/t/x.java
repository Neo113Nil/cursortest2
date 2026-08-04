package com.gamericefishpro.space.t;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public x(int i) {
        this.a = p0.a;
        this.b = n.a;
        if (i >= 0) {
            d(p0.d(i));
        } else {
            com.gamericefishpro.space.u.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    public final boolean a(int i) {
        long j;
        boolean z;
        long j2;
        int iC;
        int[] iArr;
        int i2;
        int i3 = i;
        int i4 = this.d;
        int i5 = -862048943;
        int iHashCode = Integer.hashCode(i3) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.c;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            boolean z2 = true;
            int i14 = i11;
            long j3 = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
            long j4 = i8;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (j6 != 0) {
                iC = ((Long.numberOfTrailingZeros(j6) >> 3) + i10) & i9;
                int i15 = i5;
                if (this.b[iC] == i3) {
                    z = true;
                    break loop0;
                }
                j6 &= j6 - 1;
                i5 = i15;
            }
            int i16 = i5;
            long j7 = j3 & ((~j3) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j7 != 0) {
                int iC2 = c(i7);
                long j8 = 255;
                if (this.e != 0 || ((this.a[iC2 >> 3] >> ((iC2 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    z = true;
                    j2 = 128;
                    iC = iC2;
                } else {
                    int i17 = this.c;
                    if (i17 > 8) {
                        j2 = 128;
                        long j9 = this.d;
                        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
                        if (Long.compareUnsigned(j9 * 32, ((long) i17) * 25) <= 0) {
                            long[] jArr2 = this.a;
                            int i18 = this.c;
                            int[] iArr2 = this.b;
                            int i19 = (i18 + 7) >> 3;
                            int i20 = 0;
                            while (i20 < i19) {
                                char c2 = c;
                                long j10 = jArr2[i20] & (-9187201950435737472L);
                                jArr2[i20] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i20++;
                                j8 = j8;
                                c = c2;
                            }
                            j = j8;
                            int iS = com.gamericefishpro.space.ph.v.s(jArr2);
                            int i21 = iS - 1;
                            jArr2[i21] = (jArr2[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iS] = jArr2[0];
                            int i22 = 0;
                            while (i22 != i18) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j11 = (jArr2[i23] >> i24) & j;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i22]) * i16;
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i26 = i25 >>> 7;
                                    int iC3 = c(i26);
                                    int i27 = i26 & i18;
                                    boolean z3 = z2;
                                    if (((iC3 - i27) & i18) / 8 == ((i22 - i27) & i18) / 8) {
                                        iArr = iArr2;
                                        jArr2[i23] = ((~(j << i24)) & jArr2[i23]) | (((long) (i25 & 127)) << i24);
                                        Intrinsics.checkNotNullParameter(jArr2, "<this>");
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                    } else {
                                        iArr = iArr2;
                                        int i28 = i22;
                                        int i29 = iC3 >> 3;
                                        long j12 = jArr2[i29];
                                        int i30 = (iC3 & 7) << 3;
                                        if (((j12 >> i30) & j) == 128) {
                                            jArr2[i29] = (j12 & (~(j << i30))) | (((long) (i25 & 127)) << i30);
                                            jArr2[i23] = (jArr2[i23] & (~(j << i24))) | (128 << i24);
                                            iArr[iC3] = iArr[i28];
                                            iArr[i28] = 0;
                                            i2 = i28;
                                        } else {
                                            jArr2[i29] = (((long) (i25 & 127)) << i30) | (j12 & (~(j << i30)));
                                            int i31 = iArr[iC3];
                                            iArr[iC3] = iArr[i28];
                                            iArr[i28] = i31;
                                            i2 = i28 - 1;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr2, "<this>");
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22 = i2 + 1;
                                    }
                                    iArr2 = iArr;
                                    z2 = z3;
                                } else {
                                    i22++;
                                }
                            }
                            z = z2;
                            this.e = p0.a(this.c) - this.d;
                        }
                        iC = c(i7);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    z = true;
                    int iB = p0.b(this.c);
                    long[] jArr3 = this.a;
                    int[] iArr3 = this.b;
                    int i32 = this.c;
                    d(iB);
                    long[] jArr4 = this.a;
                    int[] iArr4 = this.b;
                    int i33 = this.c;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr3[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < j2) {
                            int i35 = iArr3[i34];
                            int iHashCode3 = Integer.hashCode(i35) * i16;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC4 = c(i36 >>> 7);
                            long j13 = i36 & 127;
                            int i37 = iC4 >> 3;
                            int i38 = (iC4 & 7) << 3;
                            long j14 = (jArr4[i37] & (~(255 << i38))) | (j13 << i38);
                            jArr4[i37] = j14;
                            jArr4[(((iC4 - 7) & i33) + (i33 & 7)) >> 3] = j14;
                            iArr4[iC4] = i35;
                        }
                        i34++;
                        jArr3 = jArr3;
                        iArr3 = iArr3;
                    }
                    iC = c(i7);
                }
                this.d++;
                int i39 = this.e;
                long[] jArr5 = this.a;
                int i40 = iC >> 3;
                long j15 = jArr5[i40];
                int i41 = (iC & 7) << 3;
                this.e = i39 - (((j15 >> i41) & j) == j2 ? z : 0);
                int i42 = this.c;
                long j16 = (j15 & (~(j << i41))) | (j4 << i41);
                jArr5[i40] = j16;
                jArr5[(((iC - 7) & i42) + (i42 & 7)) >> 3] = j16;
                break;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            i3 = i;
            i5 = i16;
        }
        this.b[iC] = i;
        if (this.d != i4) {
            return z;
        }
        return false;
    }

    public final boolean b(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i) {
        int i2 = this.c;
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

    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, p0.c(i)) : 0;
        this.c = iMax;
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
        this.e = p0.a(this.c) - this.d;
        this.b = new int[iMax];
    }

    public final boolean e(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            f(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !xVar.b(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final void f(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:21:0x007d A[DONT_INVERT, PHI: r10
      0x007d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003f, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007f A[LOOP:0: B:5:0x0031->B:22:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[SYNTHETIC] */
    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i == length) {
                    sb.append((CharSequence) "]");
                    break;
                }
                i++;
            } else {
                int i3 = 8;
                int i4 = 8 - ((~(i - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = iArr[(i << 3) + i5];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i6);
                        i2++;
                    }
                    j >>= i3;
                    i5++;
                    i3 = i3;
                }
                if (i4 == i3) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ x() {
        this(6);
    }
}
