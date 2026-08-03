package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends k {

    /* renamed from: f, reason: collision with root package name */
    public int f6343f;

    public u(int i10) {
        this.f6295a = o0.f6312a;
        this.f6296b = m.f6304a;
        this.f6297c = t.a.f6509c;
        if (i10 >= 0) {
            f(o0.d(i10));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f6299e = 0;
        long[] jArr = this.f6295a;
        if (jArr != o0.f6312a) {
            bc.l.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f6295a;
            int i10 = this.f6298d;
            int i11 = i10 >> 3;
            long j3 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j3)) | j3;
        }
        bc.l.V(0, this.f6298d, null, this.f6297c);
        this.f6343f = o0.a(this.f6298d) - this.f6299e;
    }

    public final int d(int i10) {
        long j3;
        long j6;
        int i11;
        long j10;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i12;
        int i13 = -862048943;
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f6298d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f6295a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j11 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j12 = i16;
            int i23 = i19;
            int i24 = 0;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j14) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f6296b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e10 = e(i15);
                long j15 = 255;
                if (this.f6343f != 0 || ((this.f6295a[e10 >> 3] >> ((e10 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j6 = j12;
                    i11 = 1;
                    j10 = 128;
                } else {
                    int i29 = this.f6298d;
                    if (i29 > 8) {
                        j10 = 128;
                        if (Long.compareUnsigned(this.f6299e * 32, i29 * 25) <= 0) {
                            long[] jArr4 = this.f6295a;
                            int i30 = this.f6298d;
                            int[] iArr2 = this.f6296b;
                            Object[] objArr2 = this.f6297c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                long j16 = j15;
                                long j17 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i32++;
                                j12 = j12;
                                j15 = j16;
                            }
                            j3 = j15;
                            j6 = j12;
                            int Y = bc.l.Y(jArr4);
                            int i33 = Y - 1;
                            long j18 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[Y] = jArr4[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j19 = (jArr4[i35] >> i36) & j3;
                                if (j19 != 128 && j19 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e11 = e(i37);
                                    int i38 = i37 & i30;
                                    if (((e11 - i38) & i30) / 8 == ((i34 - i38) & i30) / 8) {
                                        long j20 = j18;
                                        jArr4[i35] = ((r8 & 127) << i36) | ((~(j3 << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - i22] = (jArr4[i28] & j20) | Long.MIN_VALUE;
                                        i34++;
                                        j18 = j20;
                                    } else {
                                        long j21 = j18;
                                        int i39 = e11 >> 3;
                                        long j22 = jArr4[i39];
                                        int i40 = (e11 & 7) << 3;
                                        if (((j22 >> i40) & j3) == 128) {
                                            i12 = i22;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j3 << i40)) & j22) | ((r8 & 127) << i40);
                                            jArr4[i35] = (jArr4[i35] & (~(j3 << i36))) | (128 << i36);
                                            iArr[e11] = iArr[i34];
                                            iArr[i34] = i28;
                                            objArr[e11] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i12 = i22;
                                            jArr4[i39] = ((r8 & 127) << i40) | ((~(j3 << i40)) & j22);
                                            int i41 = iArr[e11];
                                            iArr[e11] = iArr[i34];
                                            iArr[i34] = i41;
                                            Object obj = objArr[e11];
                                            objArr[e11] = objArr[i34];
                                            objArr[i34] = obj;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i28] & j21) | Long.MIN_VALUE;
                                        i34++;
                                        j18 = j21;
                                        i22 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i11 = i22;
                            this.f6343f = o0.a(this.f6298d) - this.f6299e;
                            e10 = e(i15);
                        }
                    } else {
                        j10 = 128;
                    }
                    j3 = 255;
                    j6 = j12;
                    i11 = 1;
                    int b2 = o0.b(this.f6298d);
                    long[] jArr5 = this.f6295a;
                    int[] iArr3 = this.f6296b;
                    Object[] objArr3 = this.f6297c;
                    int i42 = this.f6298d;
                    f(b2);
                    long[] jArr6 = this.f6295a;
                    int[] iArr4 = this.f6296b;
                    Object[] objArr4 = this.f6297c;
                    int i43 = this.f6298d;
                    int i44 = i28;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j10) {
                            int i45 = iArr3[i44];
                            int hashCode3 = Integer.hashCode(i45) * i27;
                            int i46 = hashCode3 ^ (hashCode3 << 16);
                            int e12 = e(i46 >>> 7);
                            long j23 = i46 & 127;
                            int i47 = e12 >> 3;
                            int i48 = (e12 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = (jArr6[i47] & (~(255 << i48))) | (j23 << i48);
                            jArr[i47] = j24;
                            jArr[(((e12 - 7) & i43) + (i43 & 7)) >> 3] = j24;
                            iArr4[e12] = i45;
                            objArr4[e12] = objArr3[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e10 = e(i15);
                }
                this.f6299e++;
                int i49 = this.f6343f;
                long[] jArr7 = this.f6295a;
                int i50 = e10 >> 3;
                long j25 = jArr7[i50];
                int i51 = (e10 & 7) << 3;
                if (((j25 >> i51) & j3) != j10) {
                    i11 = i28;
                }
                this.f6343f = i49 - i11;
                int i52 = this.f6298d;
                long j26 = (j25 & (~(j3 << i51))) | (j6 << i51);
                jArr7[i50] = j26;
                jArr7[(((e10 - 7) & i52) + (i52 & 7)) >> 3] = j26;
                return e10;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    public final int e(int i10) {
        int i11 = this.f6298d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6295a;
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

    public final void f(int i10) {
        long[] jArr;
        int max = i10 > 0 ? Math.max(7, o0.c(i10)) : 0;
        this.f6298d = max;
        if (max == 0) {
            jArr = o0.f6312a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            bc.l.W(jArr, -9187201950435737472L);
        }
        this.f6295a = jArr;
        int i11 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f6343f = o0.a(this.f6298d) - this.f6299e;
        this.f6296b = new int[max];
        this.f6297c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i10) {
        int i11;
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f6298d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f6295a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j3 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j6 = (i13 * 72340172838076673L) ^ j3;
            long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i14;
                if (this.f6296b[i11] == i10) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        if (i11 < 0) {
            return null;
        }
        this.f6299e--;
        long[] jArr2 = this.f6295a;
        int i19 = this.f6298d;
        int i20 = i11 >> 3;
        int i21 = (i11 & 7) << 3;
        long j11 = (jArr2[i20] & (~(255 << i21))) | (254 << i21);
        jArr2[i20] = j11;
        jArr2[(((i11 - 7) & i19) + (i19 & 7)) >> 3] = j11;
        Object[] objArr = this.f6297c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    public final void h(int i10, Object obj) {
        int d10 = d(i10);
        this.f6296b[d10] = i10;
        this.f6297c[d10] = obj;
    }

    public /* synthetic */ u() {
        this(6);
    }
}
