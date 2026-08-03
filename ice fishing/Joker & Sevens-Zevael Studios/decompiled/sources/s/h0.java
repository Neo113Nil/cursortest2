package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6274a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6275b;

    /* renamed from: c, reason: collision with root package name */
    public int f6276c;

    /* renamed from: d, reason: collision with root package name */
    public int f6277d;

    /* renamed from: e, reason: collision with root package name */
    public int f6278e;

    public h0(int i10) {
        this.f6274a = o0.f6312a;
        this.f6275b = t.a.f6509c;
        if (i10 >= 0) {
            f(o0.d(i10));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f6277d;
        this.f6275b[d(obj)] = obj;
        return this.f6277d != i10;
    }

    public final void b() {
        this.f6277d = 0;
        long[] jArr = this.f6274a;
        if (jArr != o0.f6312a) {
            bc.l.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f6274a;
            int i10 = this.f6276c;
            int i11 = i10 >> 3;
            long j3 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j3)) | j3;
        }
        bc.l.V(0, this.f6276c, null, this.f6275b);
        this.f6278e = o0.a(this.f6276c) - this.f6277d;
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
        int i13 = this.f6276c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6274a;
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
                if (pc.j.a(this.f6275b[i10], obj)) {
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
        long j3;
        long j6;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int i11;
        int i12 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f6276c;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f6274a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j11 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j12 = i15;
            int i21 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                int i22 = i12;
                if (pc.j.a(this.f6275b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i12 = i22;
            }
            int i23 = i12;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e10 = e(i14);
                long j15 = 255;
                if (this.f6278e != 0 || ((this.f6274a[e10 >> 3] >> ((e10 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j6 = j12;
                    j10 = 128;
                } else {
                    int i24 = this.f6276c;
                    if (i24 > 8) {
                        int i25 = 8;
                        if (Long.compareUnsigned(this.f6277d * 32, i24 * 25) <= 0) {
                            long[] jArr4 = this.f6274a;
                            int i26 = this.f6276c;
                            Object[] objArr2 = this.f6275b;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            j10 = 128;
                            while (i28 < i27) {
                                long j16 = j15;
                                long j17 = jArr4[i28] & (-9187201950435737472L);
                                jArr4[i28] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i28++;
                                i25 = i25;
                                j12 = j12;
                                j15 = j16;
                            }
                            j3 = j15;
                            j6 = j12;
                            int i29 = i25;
                            int Y = bc.l.Y(jArr4);
                            int i30 = Y - 1;
                            long j18 = 72057594037927935L;
                            jArr4[i30] = (jArr4[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[Y] = jArr4[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j19 = (jArr4[i32] >> i33) & j3;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj2 = objArr2[i31];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i23;
                                    int i34 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e11 = e(i34);
                                    int i35 = i34 & i26;
                                    if (((e11 - i35) & i26) / i29 == ((i31 - i35) & i26) / i29) {
                                        long j20 = j18;
                                        jArr4[i32] = ((r7 & 127) << i33) | ((~(j3 << i33)) & jArr4[i32]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i31++;
                                        j18 = j20;
                                    } else {
                                        long j21 = j18;
                                        int i36 = e11 >> 3;
                                        long j22 = jArr4[i36];
                                        int i37 = (e11 & 7) << 3;
                                        if (((j22 >> i37) & j3) == 128) {
                                            i11 = i29;
                                            i10 = i26;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j3 << i37)) & j22) | ((r7 & 127) << i37);
                                            jArr4[i32] = (jArr4[i32] & (~(j3 << i33))) | (128 << i33);
                                            objArr[e11] = objArr[i31];
                                            objArr[i31] = null;
                                        } else {
                                            i10 = i26;
                                            objArr = objArr2;
                                            i11 = i29;
                                            jArr4[i36] = ((r7 & 127) << i37) | ((~(j3 << i37)) & j22);
                                            Object obj3 = objArr[e11];
                                            objArr[e11] = objArr[i31];
                                            objArr[i31] = obj3;
                                            i31--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i31++;
                                        j18 = j21;
                                        i29 = i11;
                                        i26 = i10;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i31++;
                                }
                            }
                            this.f6278e = o0.a(this.f6276c) - this.f6277d;
                            e10 = e(i14);
                        }
                    }
                    j3 = 255;
                    j6 = j12;
                    j10 = 128;
                    int b2 = o0.b(this.f6276c);
                    long[] jArr5 = this.f6274a;
                    Object[] objArr3 = this.f6275b;
                    int i38 = this.f6276c;
                    f(b2);
                    long[] jArr6 = this.f6274a;
                    Object[] objArr4 = this.f6275b;
                    int i39 = this.f6276c;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i40];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i23;
                            int i41 = hashCode3 ^ (hashCode3 << 16);
                            int e12 = e(i41 >>> 7);
                            long j23 = i41 & 127;
                            int i42 = e12 >> 3;
                            int i43 = (e12 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = (jArr6[i42] & (~(255 << i43))) | (j23 << i43);
                            jArr[i42] = j24;
                            jArr[(((e12 - 7) & i39) + (i39 & 7)) >> 3] = j24;
                            objArr4[e12] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e10 = e(i14);
                }
                this.f6277d++;
                int i44 = this.f6278e;
                long[] jArr7 = this.f6274a;
                int i45 = e10 >> 3;
                long j25 = jArr7[i45];
                int i46 = (e10 & 7) << 3;
                this.f6278e = i44 - (((j25 >> i46) & j3) == j10 ? 1 : 0);
                int i47 = this.f6276c;
                long j26 = (j25 & (~(j3 << i46))) | (j6 << i46);
                jArr7[i45] = j26;
                jArr7[(((e10 - 7) & i47) + (i47 & 7)) >> 3] = j26;
                return e10;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
            i12 = i23;
        }
    }

    public final int e(int i10) {
        int i11 = this.f6276c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6274a;
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
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (h0Var.f6277d != this.f6277d) {
            return false;
        }
        Object[] objArr = this.f6275b;
        long[] jArr = this.f6274a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128 && !h0Var.c(objArr[(i10 << 3) + i12])) {
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
        int max = i10 > 0 ? Math.max(7, o0.c(i10)) : 0;
        this.f6276c = max;
        if (max == 0) {
            jArr = o0.f6312a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            bc.l.W(jArr, -9187201950435737472L);
        }
        this.f6274a = jArr;
        int i11 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f6278e = o0.a(this.f6276c) - this.f6277d;
        this.f6275b = max == 0 ? t.a.f6509c : new Object[max];
    }

    public final boolean g() {
        return this.f6277d == 0;
    }

    public final boolean h() {
        return this.f6277d != 0;
    }

    public final int hashCode() {
        int i10 = (this.f6276c * 31) + this.f6277d;
        Object[] objArr = this.f6275b;
        long[] jArr = this.f6274a;
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

    public final void i(Object obj) {
        this.f6275b[d(obj)] = obj;
    }

    public final void j(h0 h0Var) {
        pc.j.e(h0Var, "elements");
        Object[] objArr = h0Var.f6275b;
        long[] jArr = h0Var.f6274a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j3) < 128) {
                        i(objArr[(i10 << 3) + i12]);
                    }
                    j3 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
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
    public final boolean k(Object obj) {
        int i10;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f6276c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6274a;
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
                if (pc.j.a(this.f6275b[i10], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z10 = i10 >= 0;
        if (z10) {
            l(i10);
        }
        return z10;
    }

    public final void l(int i10) {
        this.f6277d--;
        long[] jArr = this.f6274a;
        int i11 = this.f6276c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j3 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j3;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j3;
        this.f6275b[i10] = null;
    }

    public final String toString() {
        a0.a0 a0Var = new a0.a0(22, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f6275b;
        long[] jArr = this.f6274a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i10 << 3) + i13];
                            if (i11 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) a0Var.invoke(obj));
                            i11++;
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
            String sb2 = sb.toString();
            pc.j.d(sb2, "toString(...)");
            return sb2;
        }
        sb.append((CharSequence) "]");
        String sb22 = sb.toString();
        pc.j.d(sb22, "toString(...)");
        return sb22;
    }

    public /* synthetic */ h0() {
        this(6);
    }
}
