package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6266a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6267b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6268c;

    /* renamed from: d, reason: collision with root package name */
    public int f6269d;

    /* renamed from: e, reason: collision with root package name */
    public int f6270e;

    /* renamed from: f, reason: collision with root package name */
    public int f6271f;

    public g0(int i10) {
        this.f6266a = o0.f6312a;
        Object[] objArr = t.a.f6509c;
        this.f6267b = objArr;
        this.f6268c = objArr;
        if (i10 >= 0) {
            h(o0.d(i10));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f6270e = 0;
        long[] jArr = this.f6266a;
        if (jArr != o0.f6312a) {
            bc.l.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f6266a;
            int i10 = this.f6269d;
            int i11 = i10 >> 3;
            long j3 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j3)) | j3;
        }
        bc.l.V(0, this.f6269d, null, this.f6268c);
        bc.l.V(0, this.f6269d, null, this.f6267b);
        this.f6271f = o0.a(this.f6269d) - this.f6270e;
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
    public final boolean b(Object obj) {
        int i10;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f6269d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6266a;
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
                if (pc.j.a(this.f6267b[i10], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return i10 >= 0;
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
        int i13 = this.f6269d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6266a;
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
                if (pc.j.a(this.f6267b[i10], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return i10 >= 0;
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f6268c;
        long[] jArr = this.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128 && pc.j.a(obj, objArr[(i10 << 3) + i12])) {
                            return true;
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
        return false;
    }

    public final int e(int i10) {
        int i11 = this.f6269d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6266a;
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
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (g0Var.f6270e != this.f6270e) {
            return false;
        }
        Object[] objArr = this.f6267b;
        Object[] objArr2 = this.f6268c;
        long[] jArr = this.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            Object obj3 = objArr2[i13];
                            if (obj3 == null) {
                                if (g0Var.g(obj2) != null || !g0Var.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(g0Var.g(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
        long j3;
        long j6;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int i11 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f6269d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f6266a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j11 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j12 = i14;
            int i20 = i14;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
                int i21 = i11;
                if (pc.j.a(this.f6267b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e10 = e(i13);
                long j15 = 255;
                if (this.f6271f != 0 || ((this.f6266a[e10 >> 3] >> ((e10 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j6 = j12;
                    j10 = 128;
                } else {
                    int i23 = this.f6269d;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compareUnsigned(this.f6270e * 32, i23 * 25) <= 0) {
                            long[] jArr4 = this.f6266a;
                            int i25 = this.f6269d;
                            Object[] objArr2 = this.f6267b;
                            Object[] objArr3 = this.f6268c;
                            j10 = 128;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            while (i27 < i26) {
                                long j16 = j15;
                                long j17 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i27++;
                                i24 = i24;
                                j12 = j12;
                                j15 = j16;
                            }
                            j3 = j15;
                            j6 = j12;
                            int i28 = i24;
                            int Y = bc.l.Y(jArr4);
                            int i29 = Y - 1;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[Y] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j18 = (jArr4[i31] >> i32) & j3;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e11 = e(i33);
                                    int i34 = i33 & i25;
                                    if (((e11 - i34) & i25) / i28 == ((i30 - i34) & i25) / i28) {
                                        jArr4[i31] = ((r8 & 127) << i32) | (jArr4[i31] & (~(j3 << i32)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i30++;
                                        i28 = i28;
                                    } else {
                                        int i35 = i28;
                                        int i36 = e11 >> 3;
                                        long j19 = jArr4[i36];
                                        int i37 = (e11 & 7) << 3;
                                        if (((j19 >> i37) & j3) == 128) {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j3 << i37)) & j19) | ((r8 & 127) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j3 << i32))) | (128 << i32);
                                            objArr[e11] = objArr[i30];
                                            objArr[i30] = null;
                                            objArr3[e11] = objArr3[i30];
                                            objArr3[i30] = null;
                                        } else {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((r8 & 127) << i37) | ((~(j3 << i37)) & j19);
                                            Object obj3 = objArr[e11];
                                            objArr[e11] = objArr[i30];
                                            objArr[i30] = obj3;
                                            Object obj4 = objArr3[e11];
                                            objArr3[e11] = objArr3[i30];
                                            objArr3[i30] = obj4;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i30++;
                                        i28 = i35;
                                        i25 = i10;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f6271f = o0.a(this.f6269d) - this.f6270e;
                            e10 = e(i13);
                        }
                    }
                    j3 = 255;
                    j6 = j12;
                    j10 = 128;
                    int b2 = o0.b(this.f6269d);
                    long[] jArr5 = this.f6266a;
                    Object[] objArr4 = this.f6267b;
                    Object[] objArr5 = this.f6268c;
                    int i38 = this.f6269d;
                    h(b2);
                    long[] jArr6 = this.f6266a;
                    Object[] objArr6 = this.f6267b;
                    Object[] objArr7 = this.f6268c;
                    int i39 = this.f6269d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i40];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i22;
                            int i41 = hashCode3 ^ (hashCode3 << 16);
                            int e12 = e(i41 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j20 = i41 & 127;
                            int i42 = e12 >> 3;
                            int i43 = (e12 & 7) << 3;
                            long j21 = (jArr[i42] & (~(255 << i43))) | (j20 << i43);
                            jArr[i42] = j21;
                            jArr[(((e12 - 7) & i39) + (i39 & 7)) >> 3] = j21;
                            objArr6[e12] = obj5;
                            objArr7[e12] = objArr5[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e10 = e(i13);
                }
                this.f6270e++;
                int i44 = this.f6271f;
                long[] jArr7 = this.f6266a;
                int i45 = e10 >> 3;
                long j22 = jArr7[i45];
                int i46 = (e10 & 7) << 3;
                this.f6271f = i44 - (((j22 >> i46) & j3) == j10 ? 1 : 0);
                int i47 = this.f6269d;
                long j23 = (j22 & (~(j3 << i46))) | (j6 << i46);
                jArr7[i45] = j23;
                jArr7[(((e10 - 7) & i47) + (i47 & 7)) >> 3] = j23;
                return ~e10;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
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
    public final Object g(Object obj) {
        int i10;
        int i11 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f6269d;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f6266a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j3 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j6 = (i13 * 72340172838076673L) ^ j3;
            long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i14;
                if (pc.j.a(this.f6267b[i10], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
        if (i10 >= 0) {
            return this.f6268c[i10];
        }
        return null;
    }

    public final void h(int i10) {
        long[] jArr;
        int max = i10 > 0 ? Math.max(7, o0.c(i10)) : 0;
        this.f6269d = max;
        if (max == 0) {
            jArr = o0.f6312a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            bc.l.W(jArr, -9187201950435737472L);
            int i11 = max >> 3;
            long j3 = 255 << ((max & 7) << 3);
            jArr[i11] = (jArr[i11] & (~j3)) | j3;
        }
        this.f6266a = jArr;
        this.f6271f = o0.a(this.f6269d) - this.f6270e;
        Object[] objArr = t.a.f6509c;
        this.f6267b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f6268c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f6267b;
        Object[] objArr2 = this.f6268c;
        long[] jArr = this.f6266a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        i11 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j3 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final boolean i() {
        return this.f6270e == 0;
    }

    public final boolean j() {
        return this.f6270e != 0;
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
    public final Object k(Object obj) {
        int i10;
        int i11 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f6269d;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f6266a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j3 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j6 = (i13 * 72340172838076673L) ^ j3;
            long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i14;
                if (pc.j.a(this.f6267b[i10], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
        if (i10 >= 0) {
            return l(i10);
        }
        return null;
    }

    public final Object l(int i10) {
        this.f6270e--;
        long[] jArr = this.f6266a;
        int i11 = this.f6269d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j3 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j3;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j3;
        this.f6267b[i10] = null;
        Object[] objArr = this.f6268c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            f10 = ~f10;
        }
        this.f6267b[f10] = obj;
        this.f6268c[f10] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6267b;
        Object[] objArr2 = this.f6268c;
        long[] jArr = this.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i11++;
                            if (i11 < this.f6270e) {
                                sb.append(", ");
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ g0() {
        this(6);
    }
}
