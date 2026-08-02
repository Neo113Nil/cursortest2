package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class xx40 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public xx40(int i) {
        this.a = cmm0.a;
        this.b = i6w.a;
        if (i >= 0) {
            f(cmm0.e(i));
        } else {
            xva1.b("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i) {
        int i2 = this.d;
        this.b[d(i)] = i;
        return this.d != i2;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != cmm0.a) {
            f73.p(-9187201950435737472L, jArr);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = cmm0.a(this.c) - this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & HProv.PP_VERSION_TIMESTAMP;
        int i5 = this.c;
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
        return i2 >= 0;
    }

    public final int d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int i3;
        int i4;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & HProv.PP_VERSION_TIMESTAMP;
        int i9 = this.c;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j4 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j5 = i8;
            int i15 = i11;
            int i16 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                int i17 = i5;
                int i18 = i16;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i5 = i17;
                i16 = i18;
            }
            int i19 = i5;
            int i20 = i16;
            char c = '\b';
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e = e(i7);
                long j8 = 255;
                if (this.e != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i21 = this.c;
                    if (i21 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(this.d * 32, i21 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.c;
                            int[] iArr2 = this.b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = i20;
                            while (i24 < i23) {
                                char c2 = c;
                                long j9 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i24++;
                                j5 = j5;
                                c = c2;
                                j8 = j8;
                            }
                            j = j8;
                            j2 = j5;
                            int length = jArr4.length;
                            int i25 = length - 1;
                            int i26 = length - 2;
                            long j10 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i25] = jArr4[i20];
                            int i27 = i20;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j11 = (jArr4[i28] >> i29) & j;
                                if (j11 != 128 && j11 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i27]) * i19;
                                    int i30 = hashCode2 ^ (hashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int e2 = e(i31);
                                    int i32 = i31 & i22;
                                    if (((e2 - i32) & i22) / 8 == ((i27 - i32) & i22) / 8) {
                                        long j12 = j10;
                                        jArr4[i28] = ((i30 & HProv.PP_VERSION_TIMESTAMP) << i29) | ((~(j << i29)) & jArr4[i28]);
                                        jArr4[jArr4.length - i14] = (jArr4[i20] & j12) | Long.MIN_VALUE;
                                        i27++;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i33 = e2 >> 3;
                                        long j14 = jArr4[i33];
                                        int i34 = (e2 & 7) << 3;
                                        if (((j14 >> i34) & j) == 128) {
                                            i3 = i14;
                                            iArr = iArr2;
                                            int i35 = i27;
                                            jArr4[i33] = ((~(j << i34)) & j14) | ((i30 & HProv.PP_VERSION_TIMESTAMP) << i34);
                                            jArr4[i28] = (jArr4[i28] & (~(j << i29))) | (128 << i29);
                                            iArr[e2] = iArr[i35];
                                            iArr[i35] = i20;
                                            i4 = i35;
                                        } else {
                                            iArr = iArr2;
                                            int i36 = i27;
                                            i3 = i14;
                                            jArr4[i33] = ((i30 & HProv.PP_VERSION_TIMESTAMP) << i34) | ((~(j << i34)) & j14);
                                            int i37 = iArr[e2];
                                            iArr[e2] = iArr[i36];
                                            iArr[i36] = i37;
                                            i4 = i36 - 1;
                                        }
                                        jArr4[jArr4.length - i3] = (jArr4[i20] & j13) | Long.MIN_VALUE;
                                        i27 = i4 + i3;
                                        i14 = i3;
                                        j10 = j13;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            i2 = i14;
                            this.e = cmm0.a(this.c) - this.d;
                            e = e(i7);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int c3 = cmm0.c(this.c);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    int i38 = this.c;
                    f(c3);
                    long[] jArr6 = this.a;
                    int[] iArr4 = this.b;
                    int i39 = this.c;
                    int i40 = i20;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j3) {
                            int i41 = iArr3[i40];
                            int hashCode3 = Integer.hashCode(i41) * i19;
                            int i42 = hashCode3 ^ (hashCode3 << 16);
                            int e3 = e(i42 >>> 7);
                            long j15 = i42 & HProv.PP_VERSION_TIMESTAMP;
                            int i43 = e3 >> 3;
                            int i44 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j16 = (jArr6[i43] & (~(255 << i44))) | (j15 << i44);
                            jArr[i43] = j16;
                            jArr[(((e3 - 7) & i39) + (i39 & 7)) >> 3] = j16;
                            iArr4[e3] = i41;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i7);
                }
                this.d += i2;
                int i45 = this.e;
                long[] jArr7 = this.a;
                int i46 = e >> 3;
                long j17 = jArr7[i46];
                int i47 = (e & 7) << 3;
                if (((j17 >> i47) & j) != j3) {
                    i2 = i20;
                }
                this.e = i45 - i2;
                int i48 = this.c;
                long j18 = (j17 & (~(j << i47))) | (j2 << i47);
                jArr7[i46] = j18;
                jArr7[(((e - 7) & i48) + (i48 & 7)) >> 3] = j18;
                return e;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i19;
        }
    }

    public final int e(int i) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xx40)) {
            return false;
        }
        xx40 xx40Var = (xx40) obj;
        if (xx40Var.d != this.d) {
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
                        if ((255 & j) < 128 && !xx40Var.c(iArr[(i << 3) + i3])) {
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

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, cmm0.d(i)) : 0;
        this.c = max;
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
        this.e = cmm0.a(this.c) - this.d;
        this.b = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & HProv.PP_VERSION_TIMESTAMP;
        int i5 = this.c;
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
        boolean z = i2 >= 0;
        if (z) {
            h(i2);
        }
        return z;
    }

    public final void h(int i) {
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
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Integer.hashCode(iArr[(i << 3) + i4]) + i2;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128) {
                                int i5 = iArr[(i << 3) + i4];
                                if (i2 != 0) {
                                    sb.append((CharSequence) Extension.FIX_SPACE);
                                }
                                if (i2 == -1) {
                                    sb.append((CharSequence) "...");
                                    break loop0;
                                }
                                sb.append(i5);
                                i2++;
                            }
                            j >>= 8;
                            i4++;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public xx40() {
        this((Object) null);
    }

    public /* synthetic */ xx40(Object obj) {
        this(6);
    }
}
