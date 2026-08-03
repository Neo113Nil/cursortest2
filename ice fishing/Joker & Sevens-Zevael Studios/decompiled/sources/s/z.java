package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6362a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6363b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f6364c;

    /* renamed from: d, reason: collision with root package name */
    public int f6365d;

    /* renamed from: e, reason: collision with root package name */
    public int f6366e;

    /* renamed from: f, reason: collision with root package name */
    public int f6367f;

    public z(int i10) {
        this.f6362a = o0.f6312a;
        this.f6363b = t.a.f6509c;
        this.f6364c = m.f6304a;
        if (i10 >= 0) {
            f(o0.d(i10));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f6366e = 0;
        long[] jArr = this.f6362a;
        if (jArr != o0.f6312a) {
            bc.l.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f6362a;
            int i10 = this.f6365d;
            int i11 = i10 >> 3;
            long j3 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j3)) | j3;
        }
        bc.l.V(0, this.f6365d, null, this.f6363b);
        this.f6367f = o0.a(this.f6365d) - this.f6366e;
    }

    public final int b(int i10) {
        int i11 = this.f6365d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6362a;
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

    public final int c(Object obj) {
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
        int i15 = this.f6365d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f6362a;
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
                if (pc.j.a(this.f6363b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int b2 = b(i13);
                long j15 = 255;
                if (this.f6367f != 0 || ((this.f6362a[b2 >> 3] >> ((b2 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j6 = j12;
                    j10 = 128;
                } else {
                    int i23 = this.f6365d;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compareUnsigned(this.f6366e * 32, i23 * 25) <= 0) {
                            long[] jArr4 = this.f6362a;
                            int i25 = this.f6365d;
                            Object[] objArr2 = this.f6363b;
                            int[] iArr = this.f6364c;
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
                            long j18 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[Y] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j19 = (jArr4[i31] >> i32) & j3;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int b10 = b(i33);
                                    int i34 = i33 & i25;
                                    long j20 = j18;
                                    if (((b10 - i34) & i25) / 8 == ((i30 - i34) & i25) / i28) {
                                        jArr4[i31] = ((r8 & 127) << i32) | (jArr4[i31] & (~(j3 << i32)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i30++;
                                        i28 = i28;
                                        j18 = j20;
                                    } else {
                                        int i35 = i28;
                                        int i36 = b10 >> 3;
                                        long j21 = jArr4[i36];
                                        int i37 = (b10 & 7) << 3;
                                        if (((j21 >> i37) & j3) == 128) {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j3 << i37)) & j21) | ((r8 & 127) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j3 << i32))) | (128 << i32);
                                            objArr[b10] = objArr[i30];
                                            objArr[i30] = null;
                                            iArr[b10] = iArr[i30];
                                            iArr[i30] = 0;
                                        } else {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((r8 & 127) << i37) | ((~(j3 << i37)) & j21);
                                            Object obj3 = objArr[b10];
                                            objArr[b10] = objArr[i30];
                                            objArr[i30] = obj3;
                                            int i38 = iArr[b10];
                                            iArr[b10] = iArr[i30];
                                            iArr[i30] = i38;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i30++;
                                        i25 = i10;
                                        i28 = i35;
                                        j18 = j20;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f6367f = o0.a(this.f6365d) - this.f6366e;
                            b2 = b(i13);
                        }
                    }
                    j3 = 255;
                    j6 = j12;
                    j10 = 128;
                    int b11 = o0.b(this.f6365d);
                    long[] jArr5 = this.f6362a;
                    Object[] objArr3 = this.f6363b;
                    int[] iArr2 = this.f6364c;
                    int i39 = this.f6365d;
                    f(b11);
                    long[] jArr6 = this.f6362a;
                    Object[] objArr4 = this.f6363b;
                    int[] iArr3 = this.f6364c;
                    int i40 = this.f6365d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i41];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i42 = hashCode3 ^ (hashCode3 << 16);
                            int b12 = b(i42 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = i42 & 127;
                            int i43 = b12 >> 3;
                            int i44 = (b12 & 7) << 3;
                            long j23 = (jArr[i43] & (~(255 << i44))) | (j22 << i44);
                            jArr[i43] = j23;
                            jArr[(((b12 - 7) & i40) + (i40 & 7)) >> 3] = j23;
                            objArr4[b12] = obj4;
                            iArr3[b12] = iArr2[i41];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b2 = b(i13);
                }
                this.f6366e++;
                int i45 = this.f6367f;
                long[] jArr7 = this.f6362a;
                int i46 = b2 >> 3;
                long j24 = jArr7[i46];
                int i47 = (b2 & 7) << 3;
                this.f6367f = i45 - (((j24 >> i47) & j3) == j10 ? 1 : 0);
                int i48 = this.f6365d;
                long j25 = (j24 & (~(j3 << i47))) | (j6 << i47);
                jArr7[i46] = j25;
                jArr7[(((b2 - 7) & i48) + (i48 & 7)) >> 3] = j25;
                return ~b2;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    public final int d(Object obj) {
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f6365d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f6362a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j3 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j6 = (i12 * 72340172838076673L) ^ j3;
            for (long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i13;
                if (pc.j.a(this.f6363b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final int e(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f6364c[d10];
        }
        t.a.e("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.f6366e != this.f6366e) {
            return false;
        }
        Object[] objArr = this.f6363b;
        int[] iArr = this.f6364c;
        long[] jArr = this.f6362a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        loop0: while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j3) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = objArr[i13];
                        int i14 = iArr[i13];
                        int d10 = zVar.d(obj2);
                        if (d10 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i14 != zVar.f6364c[d10]) {
                            break loop0;
                        }
                    } else {
                        z11 = z12;
                    }
                    j3 >>= 8;
                    i12++;
                    z12 = z11;
                }
                z10 = z12;
                if (i11 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
            z12 = z10;
        }
        return false;
    }

    public final void f(int i10) {
        long[] jArr;
        int max = i10 > 0 ? Math.max(7, o0.c(i10)) : 0;
        this.f6365d = max;
        if (max == 0) {
            jArr = o0.f6312a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            bc.l.W(jArr, -9187201950435737472L);
        }
        this.f6362a = jArr;
        int i11 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f6367f = o0.a(this.f6365d) - this.f6366e;
        this.f6363b = new Object[max];
        this.f6364c = new int[max];
    }

    public final void g(int i10) {
        this.f6366e--;
        long[] jArr = this.f6362a;
        int i11 = this.f6365d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j3 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j3;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j3;
        this.f6363b[i10] = null;
    }

    public final void h(int i10, Object obj) {
        int c3 = c(obj);
        if (c3 < 0) {
            c3 = ~c3;
        }
        this.f6363b[c3] = obj;
        this.f6364c[c3] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f6363b;
        int[] iArr = this.f6364c;
        long[] jArr = this.f6362a;
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
                        i11 += Integer.hashCode(iArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final String toString() {
        if (this.f6366e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6363b;
        int[] iArr = this.f6364c;
        long[] jArr = this.f6362a;
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
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i15);
                            i11++;
                            if (i11 < this.f6366e) {
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

    public /* synthetic */ z() {
        this(6);
    }
}
