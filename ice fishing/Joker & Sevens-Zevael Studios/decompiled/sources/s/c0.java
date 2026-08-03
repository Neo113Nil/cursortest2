package s;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6233a = o0.f6312a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6234b = t.a.f6509c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f6235c = p.f6314b;

    /* renamed from: d, reason: collision with root package name */
    public int f6236d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f6237e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f6238f;

    /* renamed from: g, reason: collision with root package name */
    public int f6239g;

    /* renamed from: h, reason: collision with root package name */
    public int f6240h;

    public c0(int i10) {
        if (i10 >= 0) {
            f(o0.d(i10));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f6239g;
        int d10 = d(obj);
        this.f6234b[d10] = obj;
        long[] jArr = this.f6235c;
        int i11 = this.f6236d;
        jArr[d10] = (i11 & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((d10 & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f6236d = d10;
        if (this.f6237e == Integer.MAX_VALUE) {
            this.f6237e = d10;
        }
        return this.f6239g != i10;
    }

    public final void b() {
        this.f6239g = 0;
        long[] jArr = this.f6233a;
        if (jArr != o0.f6312a) {
            bc.l.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f6233a;
            int i10 = this.f6238f;
            int i11 = i10 >> 3;
            long j3 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j3)) | j3;
        }
        bc.l.V(0, this.f6238f, null, this.f6234b);
        bc.l.W(this.f6235c, 4611686018427387903L);
        this.f6236d = Integer.MAX_VALUE;
        this.f6237e = Integer.MAX_VALUE;
        this.f6240h = o0.a(this.f6238f) - this.f6239g;
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
    public final boolean c(Object obj) {
        int i10;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f6238f;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6233a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j3 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j6 = (i12 * 72340172838076673L) ^ j3;
            long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                if (pc.j.a(this.f6234b[i10], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return i10 >= 0;
    }

    public final int d(Object obj) {
        int i10;
        long j3;
        long j6;
        long j10;
        char c3;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i11 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f6238f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f6233a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j12 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j13 = i14;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                int i20 = i11;
                if (pc.j.a(this.f6234b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i11 = i20;
            }
            int i21 = i11;
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int e10 = e(i13);
                long j16 = 255;
                if (this.f6240h != 0 || ((this.f6233a[e10 >> 3] >> ((e10 & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j3 = j13;
                    j6 = 255;
                    j10 = 128;
                } else {
                    int i22 = this.f6238f;
                    if (i22 > 8) {
                        c3 = 31;
                        j10 = 128;
                        if (Long.compareUnsigned(this.f6239g * 32, i22 * 25) <= 0) {
                            long[] jArr4 = this.f6233a;
                            if (jArr4 == null) {
                                i10 = 0;
                                j3 = j13;
                                j6 = 255;
                            } else {
                                int i23 = this.f6238f;
                                Object[] objArr = this.f6234b;
                                long[] jArr5 = this.f6235c;
                                long[] jArr6 = new long[i23];
                                Arrays.fill(jArr6, 0, i23, 9223372034707292159L);
                                i10 = 0;
                                int i24 = (i23 + 7) >> 3;
                                int i25 = 0;
                                while (i25 < i24) {
                                    long j17 = j16;
                                    long j18 = jArr4[i25] & (-9187201950435737472L);
                                    int i26 = i25;
                                    jArr4[i26] = ((~j18) + (j18 >>> 7)) & (-72340172838076674L);
                                    i25 = i26 + 1;
                                    j16 = j17;
                                }
                                j6 = j16;
                                int length = jArr4.length;
                                int i27 = length - 1;
                                int i28 = length - 2;
                                jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i27] = jArr4[0];
                                int i29 = 0;
                                while (i29 != i23) {
                                    int i30 = i29 >> 3;
                                    int i31 = (i29 & 7) << 3;
                                    long j19 = (jArr4[i30] >> i31) & j6;
                                    if (j19 != 128 && j19 == 254) {
                                        Object obj2 = objArr[i29];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                        int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e11 = e(i32);
                                        int i33 = i32 & i23;
                                        if (((e11 - i33) & i23) / 8 == ((i29 - i33) & i23) / 8) {
                                            int i34 = i23;
                                            Object[] objArr2 = objArr;
                                            jArr4[i30] = (jArr4[i30] & (~(j6 << i31))) | ((r17 & 127) << i31);
                                            if (jArr6[i29] == 9223372034707292159L) {
                                                long j20 = i29;
                                                jArr6[i29] = j20 | (j20 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i34;
                                            objArr = objArr2;
                                        } else {
                                            int i35 = i23;
                                            Object[] objArr3 = objArr;
                                            int i36 = e11 >> 3;
                                            long j21 = jArr4[i36];
                                            int i37 = (e11 & 7) << 3;
                                            if (((j21 >> i37) & j6) == 128) {
                                                jArr4[i36] = (j21 & (~(j6 << i37))) | ((r17 & 127) << i37);
                                                jArr4[i30] = (jArr4[i30] & (~(j6 << i31))) | (128 << i31);
                                                objArr3[e11] = objArr3[i29];
                                                objArr3[i29] = null;
                                                jArr5[e11] = jArr5[i29];
                                                jArr5[i29] = 4611686018427387903L;
                                                int i38 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                int i39 = Integer.MAX_VALUE;
                                                if (i38 != Integer.MAX_VALUE) {
                                                    j11 = j13;
                                                    jArr6[i38] = e11 | (jArr6[i38] & (-4294967296L));
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (-4294967296L);
                                                    i39 = Integer.MAX_VALUE;
                                                } else {
                                                    j11 = j13;
                                                    jArr6[i29] = (Integer.MAX_VALUE << 32) | e11;
                                                }
                                                jArr6[e11] = (i29 << 32) | i39;
                                            } else {
                                                j11 = j13;
                                                jArr4[i36] = ((r17 & 127) << i37) | (j21 & (~(j6 << i37)));
                                                Object obj3 = objArr3[e11];
                                                objArr3[e11] = objArr3[i29];
                                                objArr3[i29] = obj3;
                                                long j22 = jArr5[e11];
                                                jArr5[e11] = jArr5[i29];
                                                jArr5[i29] = j22;
                                                int i40 = (int) ((jArr6[i29] >> 32) & 4294967295L);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    long j23 = e11;
                                                    jArr6[i40] = (jArr6[i40] & (-4294967296L)) | j23;
                                                    jArr6[i29] = (jArr6[i29] & 4294967295L) | (j23 << 32);
                                                } else {
                                                    long j24 = e11;
                                                    jArr6[i29] = j24 | (j24 << 32);
                                                    i40 = i29;
                                                }
                                                jArr6[e11] = (i40 << 32) | i29;
                                                i29--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i35;
                                            objArr = objArr3;
                                            j13 = j11;
                                        }
                                    } else {
                                        i29++;
                                    }
                                }
                                j3 = j13;
                                this.f6240h = o0.a(this.f6238f) - this.f6239g;
                                long[] jArr7 = this.f6235c;
                                int length2 = jArr7.length;
                                for (int i41 = 0; i41 < length2; i41++) {
                                    long j25 = jArr7[i41];
                                    jArr7[i41] = (((j25 & (-4611686018427387904L)) | (((int) ((j25 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j25 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i42 = this.f6236d;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f6236d = (int) (jArr6[i42] & 4294967295L);
                                }
                                int i43 = this.f6237e;
                                if (i43 != Integer.MAX_VALUE) {
                                    this.f6237e = (int) (jArr6[i43] & 4294967295L);
                                }
                            }
                            e10 = e(i13);
                        }
                    } else {
                        c3 = 31;
                        j10 = 128;
                    }
                    i10 = 0;
                    j3 = j13;
                    j6 = 255;
                    int b2 = o0.b(this.f6238f);
                    long[] jArr8 = this.f6233a;
                    Object[] objArr4 = this.f6234b;
                    long[] jArr9 = this.f6235c;
                    int i44 = this.f6238f;
                    int[] iArr = new int[i44];
                    f(b2);
                    long[] jArr10 = this.f6233a;
                    Object[] objArr5 = this.f6234b;
                    long[] jArr11 = this.f6235c;
                    int i45 = this.f6238f;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr8[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j10) {
                            Object obj4 = objArr4[i46];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i47 = hashCode3 ^ (hashCode3 << 16);
                            int e12 = e(i47 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j26 = i47 & 127;
                            int i48 = e12 >> 3;
                            int i49 = (e12 & 7) << 3;
                            long j27 = (jArr[i48] & (~(255 << i49))) | (j26 << i49);
                            jArr[i48] = j27;
                            jArr[(((e12 - 7) & i45) + (i45 & 7)) >> 3] = j27;
                            objArr5[e12] = obj4;
                            jArr11[e12] = jArr9[i46];
                            iArr[i46] = e12;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i46++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f6235c;
                    int length3 = jArr12.length;
                    for (int i50 = 0; i50 < length3; i50++) {
                        long j28 = jArr12[i50];
                        jArr12[i50] = (((j28 & (-4611686018427387904L)) | (((int) ((j28 >> c3) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c3) | (((int) (j28 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i51 = this.f6236d;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f6236d = iArr[i51];
                    }
                    int i52 = this.f6237e;
                    if (i52 != Integer.MAX_VALUE) {
                        this.f6237e = iArr[i52];
                    }
                    e10 = e(i13);
                }
                this.f6239g++;
                int i53 = this.f6240h;
                long[] jArr13 = this.f6233a;
                int i54 = e10 >> 3;
                long j29 = jArr13[i54];
                int i55 = (e10 & 7) << 3;
                if (((j29 >> i55) & j6) == j10) {
                    i10 = 1;
                }
                this.f6240h = i53 - i10;
                int i56 = this.f6238f;
                long j30 = (j29 & (~(j6 << i55))) | (j3 << i55);
                jArr13[i54] = j30;
                jArr13[(((e10 - 7) & i56) + (i56 & 7)) >> 3] = j30;
                return e10;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i11 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f6238f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6233a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j3 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j6 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j6) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f6239g != this.f6239g) {
            return false;
        }
        Object[] objArr = this.f6234b;
        long[] jArr = this.f6233a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128 && !c0Var.c(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j3 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    public final void f(int i10) {
        long[] jArr;
        long[] jArr2;
        int max = i10 > 0 ? Math.max(7, o0.c(i10)) : 0;
        this.f6238f = max;
        if (max == 0) {
            jArr = o0.f6312a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            bc.l.W(jArr, -9187201950435737472L);
        }
        this.f6233a = jArr;
        int i11 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f6240h = o0.a(this.f6238f) - this.f6239g;
        this.f6234b = max == 0 ? t.a.f6509c : new Object[max];
        if (max == 0) {
            jArr2 = p.f6314b;
        } else {
            jArr2 = new long[max];
            bc.l.W(jArr2, 4611686018427387903L);
        }
        this.f6235c = jArr2;
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
    public final boolean g(Object obj) {
        int i10;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f6238f;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6233a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j3 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j6 = (i12 * 72340172838076673L) ^ j3;
            long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                if (pc.j.a(this.f6234b[i10], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z10 = i10 >= 0;
        if (z10) {
            h(i10);
        }
        return z10;
    }

    public final void h(int i10) {
        this.f6239g--;
        long[] jArr = this.f6233a;
        int i11 = this.f6238f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j3 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j3;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j3;
        this.f6234b[i10] = null;
        long[] jArr2 = this.f6235c;
        long j6 = jArr2[i10];
        int i14 = (int) ((j6 >> 31) & 2147483647L);
        int i15 = (int) (j6 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (i15 & 2147483647L);
        } else {
            this.f6236d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((i14 & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f6237e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i10 = (this.f6238f * 31) + this.f6239g;
        Object[] objArr = this.f6234b;
        long[] jArr = this.f6233a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            if (!pc.j.a(obj, this)) {
                                i10 += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        return i10;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public final boolean i(Collection collection) {
        pc.j.e(collection, "elements");
        Object[] objArr = this.f6234b;
        int i10 = this.f6239g;
        long[] jArr = this.f6233a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!bc.m.R(collection, objArr[i14])) {
                                h(i14);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10 != this.f6239g;
    }

    public final String toString() {
        a0.a0 a0Var = new a0.a0(21, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f6234b;
        long[] jArr = this.f6235c;
        int i10 = this.f6237e;
        int i11 = 0;
        while (true) {
            if (i10 == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) a0Var.invoke(obj));
            i11++;
            i10 = i12;
        }
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
