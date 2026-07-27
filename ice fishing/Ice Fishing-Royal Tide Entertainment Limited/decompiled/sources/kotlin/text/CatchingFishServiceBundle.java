package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishServiceBundle {
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public long[] CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public Object[] CatchingFishSnackbar;

    public CatchingFishServiceBundle(int i) {
        this.CatchingFishParcelableFAB = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        this.CatchingFishSnackbar = CatchingFishAdMobFAB.CatchingFishReduxKtor;
        if (i >= 0) {
            CatchingFishWorkManager(CatchingFishViewPayPal.CatchingFishReduxKtor(i));
        } else {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Capacity must be a positive value.");
            throw null;
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
    public final boolean CatchingFishCloudMessaging(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.CatchingFishCoroutine;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.CatchingFishParcelableFAB;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = i >= 0;
        if (z) {
            CatchingFishEspressoTesting(i);
        }
        return z;
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
    public final boolean CatchingFishCoroutine(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.CatchingFishCoroutine;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.CatchingFishParcelableFAB;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final int CatchingFishDaggerWebsocket(int i) {
        int i2 = this.CatchingFishCoroutine;
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

    public final void CatchingFishEspressoTesting(int i) {
        this.CatchingFishReduxKtor--;
        long[] jArr = this.CatchingFishParcelableFAB;
        int i2 = this.CatchingFishCoroutine;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.CatchingFishSnackbar[i] = null;
    }

    public final void CatchingFishFragmentHandler(CatchingFishServiceBundle catchingFishServiceBundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishServiceBundle, "elements");
        Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
        long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        CatchingFishLayout(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void CatchingFishLayout(Object obj) {
        this.CatchingFishSnackbar[CatchingFishReduxKtor(obj)] = obj;
    }

    public final boolean CatchingFishParcelableFAB(Object obj) {
        int i = this.CatchingFishReduxKtor;
        this.CatchingFishSnackbar[CatchingFishReduxKtor(obj)] = obj;
        return this.CatchingFishReduxKtor != i;
    }

    public final int CatchingFishReduxKtor(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.CatchingFishCoroutine;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.CatchingFishParcelableFAB;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(i5);
                long j8 = 255;
                if (this.CatchingFishDaggerWebsocket != 0 || ((this.CatchingFishParcelableFAB[CatchingFishDaggerWebsocket >> 3] >> ((CatchingFishDaggerWebsocket & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.CatchingFishCoroutine;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compare((this.CatchingFishReduxKtor * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.CatchingFishParcelableFAB;
                            int i17 = this.CatchingFishCoroutine;
                            Object[] objArr2 = this.CatchingFishSnackbar;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int CatchingFishStripeAPI = CatchingFishMVVMHilt.CatchingFishStripeAPI(jArr4);
                            int i21 = CatchingFishStripeAPI - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[CatchingFishStripeAPI] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i22];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i25 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int CatchingFishDaggerWebsocket2 = CatchingFishDaggerWebsocket(i25);
                                    int i26 = i25 & i17;
                                    if (((CatchingFishDaggerWebsocket2 - i26) & i17) / i20 == ((i22 - i26) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i23] = ((r7 & 127) << i24) | ((~(j << i24)) & jArr4[i23]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i27 = CatchingFishDaggerWebsocket2 >> 3;
                                        long j15 = jArr4[i27];
                                        int i28 = (CatchingFishDaggerWebsocket2 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j15) | ((r7 & 127) << i28);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[CatchingFishDaggerWebsocket2] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i27] = ((r7 & 127) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[CatchingFishDaggerWebsocket2];
                                            objArr[CatchingFishDaggerWebsocket2] = objArr[i22];
                                            objArr[i22] = obj3;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.CatchingFishDaggerWebsocket = CatchingFishViewPayPal.CatchingFishParcelableFAB(this.CatchingFishCoroutine) - this.CatchingFishReduxKtor;
                            CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(i5);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int CatchingFishSnackbar = CatchingFishViewPayPal.CatchingFishSnackbar(this.CatchingFishCoroutine);
                    long[] jArr5 = this.CatchingFishParcelableFAB;
                    Object[] objArr3 = this.CatchingFishSnackbar;
                    int i29 = this.CatchingFishCoroutine;
                    CatchingFishWorkManager(CatchingFishSnackbar);
                    long[] jArr6 = this.CatchingFishParcelableFAB;
                    Object[] objArr4 = this.CatchingFishSnackbar;
                    int i30 = this.CatchingFishCoroutine;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i31];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int CatchingFishDaggerWebsocket3 = CatchingFishDaggerWebsocket(i32 >>> 7);
                            long j16 = i32 & 127;
                            int i33 = CatchingFishDaggerWebsocket3 >> 3;
                            int i34 = (CatchingFishDaggerWebsocket3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((CatchingFishDaggerWebsocket3 - 7) & i30) + (i30 & 7)) >> 3] = j17;
                            objArr4[CatchingFishDaggerWebsocket3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(i5);
                }
                this.CatchingFishReduxKtor++;
                int i35 = this.CatchingFishDaggerWebsocket;
                long[] jArr7 = this.CatchingFishParcelableFAB;
                int i36 = CatchingFishDaggerWebsocket >> 3;
                long j18 = jArr7[i36];
                int i37 = (CatchingFishDaggerWebsocket & 7) << 3;
                this.CatchingFishDaggerWebsocket = i35 - (((j18 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.CatchingFishCoroutine;
                long j19 = (j18 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j19;
                jArr7[(((CatchingFishDaggerWebsocket - 7) & i38) + (i38 & 7)) >> 3] = j19;
                return CatchingFishDaggerWebsocket;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    public final void CatchingFishSnackbar() {
        this.CatchingFishReduxKtor = 0;
        long[] jArr = this.CatchingFishParcelableFAB;
        if (jArr != CatchingFishViewPayPal.CatchingFishParcelableFAB) {
            CatchingFishMVVMHilt.CatchingFishMVVMAppCompat(jArr);
            long[] jArr2 = this.CatchingFishParcelableFAB;
            int i = this.CatchingFishCoroutine;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishSnackbar, 0, this.CatchingFishCoroutine);
        this.CatchingFishDaggerWebsocket = CatchingFishViewPayPal.CatchingFishParcelableFAB(this.CatchingFishCoroutine) - this.CatchingFishReduxKtor;
    }

    public final boolean CatchingFishViewModelFAB() {
        return this.CatchingFishReduxKtor != 0;
    }

    public final boolean CatchingFishViewModelScope() {
        return this.CatchingFishReduxKtor == 0;
    }

    public final void CatchingFishWorkManager(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, CatchingFishViewPayPal.CatchingFishCoroutine(i)) : 0;
        this.CatchingFishCoroutine = max;
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
        this.CatchingFishDaggerWebsocket = CatchingFishViewPayPal.CatchingFishParcelableFAB(this.CatchingFishCoroutine) - this.CatchingFishReduxKtor;
        this.CatchingFishSnackbar = max == 0 ? CatchingFishAdMobFAB.CatchingFishReduxKtor : new Object[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishServiceBundle)) {
            return false;
        }
        CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) obj;
        if (catchingFishServiceBundle.CatchingFishReduxKtor != this.CatchingFishReduxKtor) {
            return false;
        }
        Object[] objArr = this.CatchingFishSnackbar;
        long[] jArr = this.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !catchingFishServiceBundle.CatchingFishCoroutine(objArr[(i << 3) + i3])) {
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

    public final int hashCode() {
        int i = (this.CatchingFishCoroutine * 31) + this.CatchingFishReduxKtor;
        Object[] objArr = this.CatchingFishSnackbar;
        long[] jArr = this.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.CatchingFishSnackbar;
        long[] jArr = this.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ CatchingFishServiceBundle() {
        this(6);
    }
}
