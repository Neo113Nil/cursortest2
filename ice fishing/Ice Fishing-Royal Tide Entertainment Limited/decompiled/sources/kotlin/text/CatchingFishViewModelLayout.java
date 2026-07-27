package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewModelLayout {
    public Object[] CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public long[] CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public long[] CatchingFishSnackbar;
    public int CatchingFishWorkManager;

    public final void CatchingFishCoroutine(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, CatchingFishViewPayPal.CatchingFishCoroutine(i)) : 0;
        this.CatchingFishReduxKtor = max;
        if (max == 0) {
            jArr = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            CatchingFishMVVMHilt.CatchingFishMVVMAppCompat(jArr);
        }
        this.CatchingFishParcelableFAB = jArr;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.CatchingFishWorkManager = CatchingFishViewPayPal.CatchingFishParcelableFAB(this.CatchingFishReduxKtor) - this.CatchingFishDaggerWebsocket;
        this.CatchingFishSnackbar = new long[max];
        this.CatchingFishCoroutine = new Object[max];
    }

    public final int CatchingFishParcelableFAB(int i) {
        int i2 = this.CatchingFishReduxKtor;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.CatchingFishParcelableFAB;
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r1 = CatchingFishParcelableFAB(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r38.CatchingFishWorkManager != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (((r38.CatchingFishParcelableFAB[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r1 = r38.CatchingFishReduxKtor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (java.lang.Long.compare((r38.CatchingFishDaggerWebsocket * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r1 = r38.CatchingFishParcelableFAB;
        r2 = r38.CatchingFishReduxKtor;
        r4 = r38.CatchingFishSnackbar;
        r5 = r38.CatchingFishCoroutine;
        r6 = (r2 + 7) >> 3;
        r27 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        if (r7 >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r8 = 7;
        r6 = kotlin.text.CatchingFishMVVMHilt.CatchingFishStripeAPI(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        if (r6 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        if (r9 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = CatchingFishParcelableFAB(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016f, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0180, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0182, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d4, code lost:
    
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01af, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ec, code lost:
    
        r18 = r11;
        r38.CatchingFishWorkManager = kotlin.text.CatchingFishViewPayPal.CatchingFishParcelableFAB(r38.CatchingFishReduxKtor) - r38.CatchingFishDaggerWebsocket;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027e, code lost:
    
        r1 = CatchingFishParcelableFAB(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0282, code lost:
    
        r16 = r1;
        r38.CatchingFishDaggerWebsocket++;
        r1 = r38.CatchingFishWorkManager;
        r2 = r38.CatchingFishParcelableFAB;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029c, code lost:
    
        if (((r4 >> r6) & r27) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029e, code lost:
    
        r29 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a0, code lost:
    
        r38.CatchingFishWorkManager = r1 - r29;
        r1 = r38.CatchingFishReduxKtor;
        r4 = (r4 & (~(r27 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fd, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020b, code lost:
    
        r1 = kotlin.text.CatchingFishViewPayPal.CatchingFishSnackbar(r38.CatchingFishReduxKtor);
        r2 = r38.CatchingFishParcelableFAB;
        r4 = r38.CatchingFishSnackbar;
        r5 = r38.CatchingFishCoroutine;
        r6 = r38.CatchingFishReduxKtor;
        CatchingFishCoroutine(r1);
        r1 = r38.CatchingFishParcelableFAB;
        r7 = r38.CatchingFishSnackbar;
        r8 = r38.CatchingFishCoroutine;
        r9 = r38.CatchingFishReduxKtor;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0226, code lost:
    
        if (r10 >= r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0235, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = CatchingFishParcelableFAB(r13 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0278, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0275, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0208, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0097, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r20 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishReduxKtor(long j, CatchingFishBundleGradle catchingFishBundleGradle) {
        int i;
        int i2;
        int i3 = -862048943;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.CatchingFishReduxKtor;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.CatchingFishParcelableFAB;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j2 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j3 = i6;
            int i13 = i9;
            int i14 = 0;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i2 = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                int i15 = i3;
                if (this.CatchingFishSnackbar[i2] == j) {
                    break loop0;
                }
                j5 &= j5 - 1;
                i3 = i15;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i;
        }
        this.CatchingFishSnackbar[i2] = j;
        this.CatchingFishCoroutine[i2] = catchingFishBundleGradle;
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
    public final Object CatchingFishSnackbar(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.CatchingFishReduxKtor;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.CatchingFishParcelableFAB;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.CatchingFishSnackbar[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return this.CatchingFishCoroutine[i];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        int i;
        Object[] objArr;
        int i2;
        ?? r18;
        Object[] objArr2;
        long j;
        int i3;
        char c;
        long j2;
        long[] jArr2;
        int i4;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        int i5 = 0;
        if (!(obj instanceof CatchingFishViewModelLayout)) {
            return false;
        }
        CatchingFishViewModelLayout catchingFishViewModelLayout = (CatchingFishViewModelLayout) obj;
        if (catchingFishViewModelLayout.CatchingFishDaggerWebsocket != this.CatchingFishDaggerWebsocket) {
            return false;
        }
        long[] jArr3 = this.CatchingFishSnackbar;
        Object[] objArr3 = this.CatchingFishCoroutine;
        long[] jArr4 = this.CatchingFishParcelableFAB;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        loop0: while (true) {
            long j3 = jArr4[i6];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                z = z2;
                int i9 = i5;
                while (i9 < i8) {
                    if ((j3 & 255) < 128) {
                        int i10 = (i6 << 3) + i9;
                        r18 = i5;
                        objArr2 = objArr3;
                        long j5 = jArr3[i10];
                        c = c2;
                        Object obj2 = objArr2[i10];
                        if (obj2 != null) {
                            i2 = i9;
                            j = j3;
                            i3 = i7;
                            j2 = j4;
                            jArr2 = jArr3;
                            if (!obj2.equals(catchingFishViewModelLayout.CatchingFishSnackbar(j5))) {
                                return r18;
                            }
                        } else {
                            if (catchingFishViewModelLayout.CatchingFishSnackbar(j5) != null) {
                                break loop0;
                            }
                            catchingFishViewModelLayout.getClass();
                            int hashCode = Long.hashCode(j5) * (-862048943);
                            int i11 = hashCode ^ (hashCode << 16);
                            j2 = j4;
                            int i12 = i11 & 127;
                            int i13 = catchingFishViewModelLayout.CatchingFishReduxKtor;
                            int i14 = (i11 >>> 7) & i13;
                            i3 = i7;
                            int i15 = r18 == true ? 1 : 0;
                            while (true) {
                                long[] jArr5 = catchingFishViewModelLayout.CatchingFishParcelableFAB;
                                int i16 = i14 >> 3;
                                int i17 = (i14 & 7) << 3;
                                long j6 = jArr5[i16] >>> i17;
                                long j7 = jArr5[i16 + 1] << (64 - i17);
                                i2 = i9;
                                jArr2 = jArr3;
                                long j8 = j6 | (j7 & ((-i17) >> 63));
                                j = j3;
                                long j9 = (i12 * 72340172838076673L) ^ j8;
                                long j10 = (j9 - 72340172838076673L) & (~j9) & j2;
                                while (true) {
                                    if (j10 == 0) {
                                        break;
                                    }
                                    int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                                    if (catchingFishViewModelLayout.CatchingFishSnackbar[numberOfTrailingZeros] == j5) {
                                        i4 = numberOfTrailingZeros;
                                        break;
                                    }
                                    j10 &= j10 - 1;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i13;
                                jArr3 = jArr2;
                                i9 = i2;
                                j3 = j;
                            }
                            if (!(i4 >= 0 ? z : r18 == true ? 1 : 0)) {
                                break loop0;
                            }
                        }
                    } else {
                        i2 = i9;
                        r18 = i5;
                        objArr2 = objArr3;
                        j = j3;
                        i3 = i7;
                        c = c2;
                        j2 = j4;
                        jArr2 = jArr3;
                    }
                    j3 = j >> i3;
                    i9 = i2 + 1;
                    c2 = c;
                    jArr3 = jArr2;
                    i5 = r18;
                    objArr3 = objArr2;
                    j4 = j2;
                    i7 = i3;
                }
                i = i5;
                objArr = objArr3;
                int i18 = i7;
                jArr = jArr3;
                if (i8 != i18) {
                    return z;
                }
            } else {
                z = z2;
                jArr = jArr3;
                i = i5;
                objArr = objArr3;
            }
            if (i6 == length) {
                return z;
            }
            i6++;
            jArr3 = jArr;
            z2 = z;
            i5 = i;
            objArr3 = objArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.CatchingFishSnackbar;
        Object[] objArr = this.CatchingFishCoroutine;
        long[] jArr2 = this.CatchingFishParcelableFAB;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        long j2 = jArr[i5];
                        Object obj = objArr[i5];
                        i2 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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
        int i;
        int i2;
        if (this.CatchingFishDaggerWebsocket == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.CatchingFishSnackbar;
        Object[] objArr = this.CatchingFishCoroutine;
        long[] jArr2 = this.CatchingFishParcelableFAB;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.CatchingFishDaggerWebsocket) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }
}
