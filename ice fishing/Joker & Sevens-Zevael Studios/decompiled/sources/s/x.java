package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6351a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f6352b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6353c;

    /* renamed from: d, reason: collision with root package name */
    public int f6354d;

    /* renamed from: e, reason: collision with root package name */
    public int f6355e;

    /* renamed from: f, reason: collision with root package name */
    public int f6356f;

    public final int a(int i10) {
        int i11 = this.f6354d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6351a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j3) {
        int i10;
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f6354d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6351a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j6;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f6352b[i10] == j3) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (i10 >= 0) {
            return this.f6353c[i10];
        }
        return null;
    }

    public final void c(int i10) {
        long[] jArr;
        int max = i10 > 0 ? Math.max(7, o0.c(i10)) : 0;
        this.f6354d = max;
        if (max == 0) {
            jArr = o0.f6312a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            bc.l.W(jArr, -9187201950435737472L);
        }
        this.f6351a = jArr;
        int i11 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f6356f = o0.a(this.f6354d) - this.f6355e;
        this.f6352b = new long[max];
        this.f6353c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r38.f6356f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (((r38.f6351a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r1 = r38.f6354d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (java.lang.Long.compareUnsigned(r38.f6355e * 32, r1 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        r1 = r38.f6351a;
        r2 = r38.f6354d;
        r4 = r38.f6352b;
        r5 = r38.f6353c;
        r6 = (r2 + 7) >> 3;
        r25 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        if (r7 >= r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
    
        r29 = r10;
        r27 = r12;
        r11 = r13;
        r8 = 7;
        r6 = bc.l.Y(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r27];
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
    
        if (r6 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011b, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0122, code lost:
    
        if (r9 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0125, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = a(r10);
        r10 = r10 & r2;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016b, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017c, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017e, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | ((r9 & 127) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d0, code lost:
    
        r1[r1.length - 1] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r28;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = ((r9 & 127) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0148, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r28;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e8, code lost:
    
        r18 = r11;
        r38.f6356f = s.o0.a(r38.f6354d) - r38.f6355e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027e, code lost:
    
        r16 = r1;
        r38.f6355e++;
        r1 = r38.f6356f;
        r2 = r38.f6351a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0298, code lost:
    
        if (((r4 >> r6) & r25) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029b, code lost:
    
        r18 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x029d, code lost:
    
        r38.f6356f = r1 - r18;
        r1 = r38.f6354d;
        r4 = (r4 & (~(r25 << r6))) | (r29 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f9, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0207, code lost:
    
        r1 = s.o0.b(r38.f6354d);
        r2 = r38.f6351a;
        r4 = r38.f6352b;
        r5 = r38.f6353c;
        r6 = r38.f6354d;
        c(r1);
        r1 = r38.f6351a;
        r7 = r38.f6352b;
        r8 = r38.f6353c;
        r9 = r38.f6354d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0222, code lost:
    
        if (r10 >= r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0231, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0233, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0274, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0271, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0204, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0097, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
        r20 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j3, a0 a0Var) {
        int i10;
        int i11;
        int i12 = -862048943;
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f6354d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f6351a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j6 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j10 = i15;
            int i22 = i18;
            int i23 = 0;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i11 = (i17 + (Long.numberOfTrailingZeros(j12) >> 3)) & i16;
                int i24 = i12;
                if (this.f6352b[i11] == j3) {
                    break loop0;
                }
                j12 &= j12 - 1;
                i12 = i24;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i10;
        }
        this.f6352b[i11] = j3;
        this.f6353c[i11] = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        long[] jArr;
        Object[] objArr;
        boolean z10;
        int i10;
        Object[] objArr2;
        long j3;
        int i11;
        char c3;
        long j6;
        long[] jArr2;
        int i12;
        if (obj != this) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                if (xVar.f6355e == this.f6355e) {
                    long[] jArr3 = this.f6352b;
                    Object[] objArr3 = this.f6353c;
                    long[] jArr4 = this.f6351a;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j10 = jArr4[i13];
                            char c7 = 7;
                            long j11 = -9187201950435737472L;
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                z10 = true;
                                while (i16 < i15) {
                                    if ((j10 & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        objArr2 = objArr3;
                                        long j12 = jArr3[i17];
                                        c3 = c7;
                                        Object obj2 = objArr2[i17];
                                        if (obj2 != null) {
                                            i10 = i16;
                                            j3 = j10;
                                            i11 = i14;
                                            j6 = j11;
                                            jArr2 = jArr3;
                                            if (!obj2.equals(xVar.b(j12))) {
                                                return false;
                                            }
                                        } else {
                                            if (xVar.b(j12) != null) {
                                                return false;
                                            }
                                            int hashCode = Long.hashCode(j12) * (-862048943);
                                            int i18 = hashCode ^ (hashCode << 16);
                                            j6 = j11;
                                            int i19 = i18 & 127;
                                            int i20 = xVar.f6354d;
                                            int i21 = (i18 >>> 7) & i20;
                                            i11 = i14;
                                            int i22 = 0;
                                            while (true) {
                                                long[] jArr5 = xVar.f6351a;
                                                int i23 = i21 >> 3;
                                                int i24 = (i21 & 7) << 3;
                                                long j13 = jArr5[i23] >>> i24;
                                                long j14 = jArr5[i23 + 1] << (64 - i24);
                                                i10 = i16;
                                                jArr2 = jArr3;
                                                long j15 = j13 | (j14 & ((-i24) >> 63));
                                                j3 = j10;
                                                long j16 = (i19 * 72340172838076673L) ^ j15;
                                                long j17 = (j16 - 72340172838076673L) & (~j16) & j6;
                                                while (true) {
                                                    if (j17 == 0) {
                                                        break;
                                                    }
                                                    int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i21) & i20;
                                                    if (xVar.f6352b[numberOfTrailingZeros] == j12) {
                                                        i12 = numberOfTrailingZeros;
                                                        break;
                                                    }
                                                    j17 &= j17 - 1;
                                                }
                                                i22 += 8;
                                                i21 = (i21 + i22) & i20;
                                                jArr3 = jArr2;
                                                i16 = i10;
                                                j10 = j3;
                                            }
                                            if (!(i12 >= 0)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        i10 = i16;
                                        objArr2 = objArr3;
                                        j3 = j10;
                                        i11 = i14;
                                        c3 = c7;
                                        j6 = j11;
                                        jArr2 = jArr3;
                                    }
                                    j10 = j3 >> i11;
                                    i16 = i10 + 1;
                                    c7 = c3;
                                    jArr3 = jArr2;
                                    objArr3 = objArr2;
                                    j11 = j6;
                                    i14 = i11;
                                }
                                objArr = objArr3;
                                int i25 = i14;
                                jArr = jArr3;
                                if (i15 != i25) {
                                    return true;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                z10 = true;
                            }
                            if (i13 == length) {
                                return z10;
                            }
                            i13++;
                            jArr3 = jArr;
                            objArr3 = objArr;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f6352b;
        Object[] objArr = this.f6353c;
        long[] jArr2 = this.f6351a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j3 = jArr2[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j6 = jArr[i14];
                        Object obj = objArr[i14];
                        i11 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j6);
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
        int i10;
        int i11;
        if (this.f6355e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f6352b;
        Object[] objArr = this.f6353c;
        long[] jArr2 = this.f6351a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j3 = jArr2[i12];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j3) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j6 = jArr[i16];
                            Object obj = objArr[i16];
                            sb.append(j6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i13++;
                            if (i13 < this.f6355e) {
                                sb.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j3 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
