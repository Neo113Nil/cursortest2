package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class wx40 extends x5w {
    public int f;

    public wx40(int i) {
        this.a = cmm0.a;
        this.b = i6w.a;
        this.c = cvw.c;
        if (i >= 0) {
            f(cmm0.e(i));
        } else {
            xva1.b("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != cmm0.a) {
            f73.p(-9187201950435737472L, jArr);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.c, 0, this.d, (Object) null);
        this.f = cmm0.a(this.d) - this.e;
    }

    public final int d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i3;
        int i4 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & HProv.PP_VERSION_TIMESTAMP;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.a;
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
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e = e(i6);
                long j8 = 255;
                if (this.f != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.d;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(this.e * 32, i20 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i21 = this.d;
                            int[] iArr2 = this.b;
                            Object[] objArr2 = this.c;
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
                            int length = jArr4.length;
                            int i24 = length - 1;
                            int i25 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i24] = jArr4[i19];
                            int i26 = i19;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j12 = (jArr4[i27] >> i28) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i26]) * i18;
                                    int i29 = hashCode2 ^ (hashCode2 << 16);
                                    int i30 = i29 >>> 7;
                                    int e2 = e(i30);
                                    int i31 = i30 & i21;
                                    if (((e2 - i31) & i21) / 8 == ((i26 - i31) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i27] = ((i29 & HProv.PP_VERSION_TIMESTAMP) << i28) | ((~(j << i28)) & jArr4[i27]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i26++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i32 = e2 >> 3;
                                        long j15 = jArr4[i32];
                                        int i33 = (e2 & 7) << 3;
                                        if (((j15 >> i33) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i32] = ((~(j << i33)) & j15) | ((i29 & HProv.PP_VERSION_TIMESTAMP) << i33);
                                            jArr4[i27] = (jArr4[i27] & (~(j << i28))) | (128 << i28);
                                            iArr[e2] = iArr[i26];
                                            iArr[i26] = i19;
                                            objArr[e2] = objArr[i26];
                                            objArr[i26] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i32] = ((i29 & HProv.PP_VERSION_TIMESTAMP) << i33) | ((~(j << i33)) & j15);
                                            int i34 = iArr[e2];
                                            iArr[e2] = iArr[i26];
                                            iArr[i26] = i34;
                                            Object obj = objArr[e2];
                                            objArr[e2] = objArr[i26];
                                            objArr[i26] = obj;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i19] & j14) | Long.MIN_VALUE;
                                        i26++;
                                        j11 = j14;
                                        i13 = i3;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i2 = i13;
                            this.f = cmm0.a(this.d) - this.e;
                            e = e(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int c = cmm0.c(this.d);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i35 = this.d;
                    f(c);
                    long[] jArr6 = this.a;
                    int[] iArr4 = this.b;
                    Object[] objArr4 = this.c;
                    int i36 = this.d;
                    int i37 = i19;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < j3) {
                            int i38 = iArr3[i37];
                            int hashCode3 = Integer.hashCode(i38) * i18;
                            int i39 = hashCode3 ^ (hashCode3 << 16);
                            int e3 = e(i39 >>> 7);
                            long j16 = i39 & HProv.PP_VERSION_TIMESTAMP;
                            int i40 = e3 >> 3;
                            int i41 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i40] & (~(255 << i41))) | (j16 << i41);
                            jArr[i40] = j17;
                            jArr[(((e3 - 7) & i36) + (i36 & 7)) >> 3] = j17;
                            iArr4[e3] = i38;
                            objArr4[e3] = objArr3[i37];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i6);
                }
                this.e++;
                int i42 = this.f;
                long[] jArr7 = this.a;
                int i43 = e >> 3;
                long j18 = jArr7[i43];
                int i44 = (e & 7) << 3;
                if (((j18 >> i44) & j) != j3) {
                    i2 = i19;
                }
                this.f = i42 - i2;
                int i45 = this.d;
                long j19 = (j18 & (~(j << i44))) | (j2 << i44);
                jArr7[i43] = j19;
                jArr7[(((e - 7) & i45) + (i45 & 7)) >> 3] = j19;
                return e;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    public final int e(int i) {
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

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, cmm0.d(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = cmm0.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = cmm0.a(this.d) - this.e;
        this.b = new int[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & HProv.PP_VERSION_TIMESTAMP;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            return h(i2);
        }
        return null;
    }

    public final Object h(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void i(int i, Object obj) {
        int d = d(i);
        this.b[d] = i;
        this.c[d] = obj;
    }

    public wx40() {
        this((Object) null);
    }

    public /* synthetic */ wx40(Object obj) {
        this(6);
    }
}
