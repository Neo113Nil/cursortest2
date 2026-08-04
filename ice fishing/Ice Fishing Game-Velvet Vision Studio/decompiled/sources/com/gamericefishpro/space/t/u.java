package com.gamericefishpro.space.t;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public u(int i) {
        this.a = p0.a;
        int[] iArr = n.a;
        this.b = iArr;
        this.c = iArr;
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
        this.f = p0.a(this.d) - this.e;
    }

    public final int b(int i) {
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

    public final int c(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int d(int i) {
        int iC = c(i);
        if (iC >= 0) {
            return this.c[iC];
        }
        return -1;
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
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        int i6 = iArr2[i4];
                        int iC = uVar.c(i5);
                        if (iC < 0 || i6 != uVar.c[iC]) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                    i3++;
                    z2 = z2;
                }
                z = z2;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z2;
            }
            if (i == length) {
                return z;
            }
            i++;
            z2 = z;
        }
        return false;
    }

    public final void f(int i, int i2) {
        long j;
        long j2;
        int i3;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i4 = i;
        int i5 = -862048943;
        int iHashCode = Integer.hashCode(i4) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            int i15 = i11;
            long j4 = (((-i13) >> 63) & (jArr2[i12 + 1] << (64 - i13))) | (jArr2[i12] >>> i13);
            long j5 = i8;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i9;
                int i16 = i5;
                if (this.b[iNumberOfTrailingZeros] == i4) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i5 = i16;
            }
            int i17 = i5;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i7);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    j3 = 128;
                } else {
                    int i18 = this.d;
                    if (i18 > 8) {
                        j3 = 128;
                        long j9 = this.e;
                        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
                        if (Long.compareUnsigned(j9 * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i19 = this.d;
                            int[] iArr3 = this.b;
                            int[] iArr4 = this.c;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = jArr3[i21] & (-9187201950435737472L);
                                jArr3[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i21++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int iS = com.gamericefishpro.space.ph.v.s(jArr3);
                            int i22 = iS - 1;
                            jArr3[i22] = (jArr3[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iS] = jArr3[0];
                            int i23 = 0;
                            while (i23 != i19) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j11 = (jArr3[i24] >> i25) & j2;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i23]) * i17;
                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i27 = i26 >>> 7;
                                    int iB2 = b(i27);
                                    int i28 = i27 & i19;
                                    char c2 = c;
                                    int i29 = i14;
                                    if (((iB2 - i28) & i19) / 8 == ((i23 - i28) & i19) / 8) {
                                        iArr = iArr3;
                                        iArr2 = iArr4;
                                        jArr3[i24] = ((~(j2 << i25)) & jArr3[i24]) | (((long) (i26 & 127)) << i25);
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    } else {
                                        iArr = iArr3;
                                        iArr2 = iArr4;
                                        int i30 = iB2 >> 3;
                                        long j12 = jArr3[i30];
                                        int i31 = (iB2 & 7) << 3;
                                        if (((j12 >> i31) & j2) == 128) {
                                            jArr3[i30] = (j12 & (~(j2 << i31))) | (((long) (i26 & 127)) << i31);
                                            jArr3[i24] = (jArr3[i24] & (~(j2 << i25))) | (128 << i25);
                                            iArr[iB2] = iArr[i23];
                                            iArr[i23] = 0;
                                            iArr2[iB2] = iArr2[i23];
                                            iArr2[i23] = 0;
                                        } else {
                                            jArr3[i30] = (((long) (i26 & 127)) << i31) | (j12 & (~(j2 << i31)));
                                            int i32 = iArr[iB2];
                                            iArr[iB2] = iArr[i23];
                                            iArr[i23] = i32;
                                            int i33 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i23];
                                            iArr2[i23] = i33;
                                            i23--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    }
                                    i23++;
                                    i14 = i29;
                                    c = c2;
                                    iArr3 = iArr;
                                    iArr4 = iArr2;
                                } else {
                                    i23++;
                                }
                            }
                            i3 = i14;
                            this.f = p0.a(this.d) - this.e;
                        }
                        iB = b(i7);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    int iB3 = p0.b(this.d);
                    long[] jArr4 = this.a;
                    int[] iArr5 = this.b;
                    int[] iArr6 = this.c;
                    int i34 = this.d;
                    e(iB3);
                    long[] jArr5 = this.a;
                    int[] iArr7 = this.b;
                    int[] iArr8 = this.c;
                    int i35 = this.d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr4[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr5[i36];
                            int iHashCode3 = Integer.hashCode(i37) * i17;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i38 >>> 7);
                            jArr = jArr5;
                            long j13 = i38 & 127;
                            int i39 = iB4 >> 3;
                            int i40 = (iB4 & 7) << 3;
                            long j14 = (jArr[i39] & (~(255 << i40))) | (j13 << i40);
                            jArr[i39] = j14;
                            jArr[(((iB4 - 7) & i35) + (i35 & 7)) >> 3] = j14;
                            iArr7[iB4] = i37;
                            iArr8[iB4] = iArr6[i36];
                        } else {
                            jArr = jArr5;
                        }
                        i36++;
                        jArr5 = jArr;
                    }
                    iB = b(i7);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr6 = this.a;
                int i42 = iB >> 3;
                long j15 = jArr6[i42];
                int i43 = (iB & 7) << 3;
                this.f = i41 - (((j15 >> i43) & j2) == j3 ? i3 : 0);
                int i44 = this.d;
                long j16 = (j15 & (~(j2 << i43))) | (j << i43);
                jArr6[i42] = j16;
                jArr6[(((iB - 7) & i44) + (i44 & 7)) >> 3] = j16;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i4 = i;
            i5 = i17;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = i;
        this.c[iNumberOfTrailingZeros] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
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
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ u() {
        this(6);
    }
}
