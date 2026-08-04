package com.gamericefishpro.space.t;

import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public long[] a = p0.a;
    public Object[] b = com.gamericefishpro.space.u.a.c;
    public long[] c = r.b;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    public int h;

    public e0(int i) {
        if (i >= 0) {
            f(p0.d(i));
        } else {
            com.gamericefishpro.space.u.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.g;
        int iD = d(obj);
        this.b[iD] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = iD;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iD;
        }
        return this.g != i;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != p0.a) {
            com.gamericefishpro.space.ph.u.k(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        com.gamericefishpro.space.ph.u.i(0, this.f, null, this.b);
        com.gamericefishpro.space.ph.u.k(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = p0.a(this.f) - this.g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (Intrinsics.a(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        int i;
        long j;
        long j2;
        char c;
        long[] jArr;
        Object[] objArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j3 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
            long j4 = i5;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (j6 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                int i11 = i2;
                if (Intrinsics.a(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j6 &= j6 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i4);
                if (this.h != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = 255;
                    j2 = 128;
                } else {
                    int i13 = this.f;
                    if (i13 > 8) {
                        c = 31;
                        long j7 = this.g;
                        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
                        j2 = 128;
                        if (Long.compareUnsigned(j7 * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            if (jArr3 == null) {
                                i = 0;
                                j = 255;
                            } else {
                                int i14 = this.f;
                                Object[] objArr2 = this.b;
                                long[] jArr4 = this.c;
                                long[] jArr5 = new long[i14];
                                Intrinsics.checkNotNullParameter(jArr5, "<this>");
                                j = 255;
                                long j8 = 9223372034707292159L;
                                Arrays.fill(jArr5, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j9 = j8;
                                    long j10 = jArr3[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr3[i17] = ((~j10) + (j10 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j8 = j9;
                                }
                                long j11 = j8;
                                Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                int length = jArr3.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i18] = jArr3[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr3[i21] >> i22) & 255;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr2[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i24 = i23 >>> 7;
                                        int iE2 = e(i24);
                                        int i25 = i24 & i14;
                                        if (((iE2 - i25) & i14) / 8 == ((i20 - i25) & i14) / 8) {
                                            objArr = objArr2;
                                            jArr3[i21] = ((~(255 << i22)) & jArr3[i21]) | (((long) (i23 & 127)) << i22);
                                            if (jArr5[i20] == j11) {
                                                long j13 = i20;
                                                jArr5[i20] = j13 | (j13 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                        } else {
                                            objArr = objArr2;
                                            int i26 = iE2 >> 3;
                                            long j14 = jArr3[i26];
                                            int i27 = (iE2 & 7) << 3;
                                            if (((j14 >> i27) & 255) == 128) {
                                                jArr3[i26] = (j14 & (~(255 << i27))) | (((long) (i23 & 127)) << i27);
                                                jArr3[i21] = (jArr3[i21] & (~(255 << i22))) | (128 << i22);
                                                objArr[iE2] = objArr[i20];
                                                objArr[i20] = null;
                                                jArr4[iE2] = jArr4[i20];
                                                jArr4[i20] = 4611686018427387903L;
                                                int i28 = (int) ((jArr5[i20] >> 32) & 4294967295L);
                                                if (i28 != Integer.MAX_VALUE) {
                                                    jArr5[i28] = (jArr5[i28] & (-4294967296L)) | ((long) iE2);
                                                    jArr5[i20] = (jArr5[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr5[i20] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr5[iE2] = (((long) i20) << 32) | ((long) Integer.MAX_VALUE);
                                            } else {
                                                jArr3[i26] = (((long) (i23 & 127)) << i27) | (j14 & (~(255 << i27)));
                                                Object obj3 = objArr[iE2];
                                                objArr[iE2] = objArr[i20];
                                                objArr[i20] = obj3;
                                                long j15 = jArr4[iE2];
                                                jArr4[iE2] = jArr4[i20];
                                                jArr4[i20] = j15;
                                                int i29 = (int) ((jArr5[i20] >> 32) & 4294967295L);
                                                if (i29 != Integer.MAX_VALUE) {
                                                    long j16 = iE2;
                                                    jArr5[i29] = (jArr5[i29] & (-4294967296L)) | j16;
                                                    jArr5[i20] = (jArr5[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iE2;
                                                    jArr5[i20] = j17 | (j17 << 32);
                                                    i29 = i20;
                                                }
                                                jArr5[iE2] = (((long) i29) << 32) | ((long) i20);
                                                i20--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                        }
                                        i20++;
                                        i14 = i14;
                                        objArr2 = objArr;
                                    } else {
                                        i20++;
                                    }
                                }
                                this.h = p0.a(this.f) - this.g;
                                long[] jArr6 = this.c;
                                int length2 = jArr6.length;
                                for (int i30 = 0; i30 < length2; i30++) {
                                    long j18 = jArr6[i30];
                                    int i31 = (int) ((j18 >> 31) & 2147483647L);
                                    int i32 = (int) (j18 & 2147483647L);
                                    jArr6[i30] = (((j18 & (-4611686018427387904L)) | ((long) (i31 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i31] & 4294967295L)))) << 31) | ((long) (i32 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i32] & 4294967295L)));
                                }
                                int i33 = this.d;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr5[i33] & 4294967295L);
                                }
                                int i34 = this.e;
                                if (i34 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr5[i34] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i4);
                    } else {
                        c = 31;
                        j2 = 128;
                    }
                    i = 0;
                    j = 255;
                    int iB = p0.b(this.f);
                    long[] jArr7 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr8 = this.c;
                    int i35 = this.f;
                    int[] iArr = new int[i35];
                    f(iB);
                    long[] jArr9 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr10 = this.c;
                    int i36 = this.f;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr7[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < j2) {
                            Object obj4 = objArr3[i37];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i38 >>> 7);
                            jArr = jArr9;
                            int i39 = iE3 >> 3;
                            int i40 = (iE3 & 7) << 3;
                            long j19 = (jArr[i39] & (~(255 << i40))) | (((long) (i38 & 127)) << i40);
                            jArr[i39] = j19;
                            jArr[(((iE3 - 7) & i36) + (i36 & 7)) >> 3] = j19;
                            objArr4[iE3] = obj4;
                            jArr10[iE3] = jArr8[i37];
                            iArr[i37] = iE3;
                        } else {
                            jArr = jArr9;
                        }
                        i37++;
                        jArr7 = jArr7;
                        c = c;
                        jArr9 = jArr;
                    }
                    char c2 = c;
                    long[] jArr11 = this.c;
                    int length3 = jArr11.length;
                    for (int i41 = 0; i41 < length3; i41++) {
                        long j20 = jArr11[i41];
                        int i42 = (int) ((j20 >> c2) & 2147483647L);
                        int i43 = (int) (j20 & 2147483647L);
                        jArr11[i41] = (((j20 & (-4611686018427387904L)) | ((long) (i42 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i42]))) << c2) | ((long) (i43 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i43]));
                    }
                    int i44 = this.d;
                    if (i44 != Integer.MAX_VALUE) {
                        this.d = iArr[i44];
                    }
                    int i45 = this.e;
                    if (i45 != Integer.MAX_VALUE) {
                        this.e = iArr[i45];
                    }
                    iE = e(i4);
                }
                this.g++;
                int i46 = this.h;
                long[] jArr12 = this.a;
                int i47 = iE >> 3;
                long j21 = jArr12[i47];
                int i48 = (iE & 7) << 3;
                if (((j21 >> i48) & j) == j2) {
                    i = 1;
                }
                this.h = i46 - i;
                int i49 = this.f;
                long j22 = (j21 & (~(j << i48))) | (j4 << i48);
                jArr12[i47] = j22;
                jArr12[(((iE - 7) & i49) + (i49 & 7)) >> 3] = j22;
                return iE;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !e0Var.c(objArr[(i << 3) + i3])) {
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
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, p0.c(i)) : 0;
        this.f = iMax;
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
        this.h = p0.a(this.f) - this.g;
        this.b = iMax == 0 ? com.gamericefishpro.space.u.a.c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = r.b;
        } else {
            jArr2 = new long[iMax];
            com.gamericefishpro.space.ph.u.k(jArr2, 4611686018427387903L);
        }
        this.c = jArr2;
    }

    public final boolean g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (Intrinsics.a(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            h(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void h(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!Intrinsics.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean i(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.t(elements, objArr[i5])) {
                                h(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.g;
    }

    public final String toString() {
        com.gamericefishpro.space.b2.d0 d0Var = new com.gamericefishpro.space.b2.d0(26, this);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) d0Var.invoke(obj));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
