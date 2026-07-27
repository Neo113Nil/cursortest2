package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishJUnitService {
    public int[] CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public long[] CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public Object[] CatchingFishSnackbar;
    public int CatchingFishWorkManager;

    public CatchingFishJUnitService(int i) {
        this.CatchingFishParcelableFAB = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        this.CatchingFishSnackbar = CatchingFishAdMobFAB.CatchingFishReduxKtor;
        this.CatchingFishCoroutine = CatchingFishJUnitEspresso.CatchingFishParcelableFAB;
        if (i >= 0) {
            CatchingFishWorkManager(CatchingFishViewPayPal.CatchingFishReduxKtor(i));
        } else {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int CatchingFishCoroutine(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.CatchingFishReduxKtor;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.CatchingFishParcelableFAB;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int CatchingFishSnackbar = CatchingFishSnackbar(i4);
                long j8 = 255;
                if (this.CatchingFishWorkManager != 0 || ((this.CatchingFishParcelableFAB[CatchingFishSnackbar >> 3] >> ((CatchingFishSnackbar & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.CatchingFishReduxKtor;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((this.CatchingFishDaggerWebsocket * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.CatchingFishParcelableFAB;
                            int i16 = this.CatchingFishReduxKtor;
                            Object[] objArr2 = this.CatchingFishSnackbar;
                            int[] iArr = this.CatchingFishCoroutine;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int CatchingFishStripeAPI = CatchingFishMVVMHilt.CatchingFishStripeAPI(jArr4);
                            int i20 = CatchingFishStripeAPI - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[CatchingFishStripeAPI] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int CatchingFishSnackbar2 = CatchingFishSnackbar(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((CatchingFishSnackbar2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = CatchingFishSnackbar2 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (CatchingFishSnackbar2 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[CatchingFishSnackbar2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[CatchingFishSnackbar2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            Object obj3 = objArr[CatchingFishSnackbar2];
                                            objArr[CatchingFishSnackbar2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[CatchingFishSnackbar2];
                                            iArr[CatchingFishSnackbar2] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        j11 = j13;
                                        i19 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.CatchingFishWorkManager = CatchingFishViewPayPal.CatchingFishParcelableFAB(this.CatchingFishReduxKtor) - this.CatchingFishDaggerWebsocket;
                            CatchingFishSnackbar = CatchingFishSnackbar(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int CatchingFishSnackbar3 = CatchingFishViewPayPal.CatchingFishSnackbar(this.CatchingFishReduxKtor);
                    long[] jArr5 = this.CatchingFishParcelableFAB;
                    Object[] objArr3 = this.CatchingFishSnackbar;
                    int[] iArr2 = this.CatchingFishCoroutine;
                    int i30 = this.CatchingFishReduxKtor;
                    CatchingFishWorkManager(CatchingFishSnackbar3);
                    long[] jArr6 = this.CatchingFishParcelableFAB;
                    Object[] objArr4 = this.CatchingFishSnackbar;
                    int[] iArr3 = this.CatchingFishCoroutine;
                    int i31 = this.CatchingFishReduxKtor;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int CatchingFishSnackbar4 = CatchingFishSnackbar(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = CatchingFishSnackbar4 >> 3;
                            int i35 = (CatchingFishSnackbar4 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((CatchingFishSnackbar4 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[CatchingFishSnackbar4] = obj4;
                            iArr3[CatchingFishSnackbar4] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    CatchingFishSnackbar = CatchingFishSnackbar(i4);
                }
                this.CatchingFishDaggerWebsocket++;
                int i36 = this.CatchingFishWorkManager;
                long[] jArr7 = this.CatchingFishParcelableFAB;
                int i37 = CatchingFishSnackbar >> 3;
                long j17 = jArr7[i37];
                int i38 = (CatchingFishSnackbar & 7) << 3;
                this.CatchingFishWorkManager = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.CatchingFishReduxKtor;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((CatchingFishSnackbar - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~CatchingFishSnackbar;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int CatchingFishDaggerWebsocket(Object obj) {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor >= 0) {
            return this.CatchingFishCoroutine[CatchingFishReduxKtor];
        }
        CatchingFishHiltMVPToast.CatchingFishMotionLayout("There is no key " + obj + " in the map");
        throw null;
    }

    public final void CatchingFishParcelableFAB() {
        this.CatchingFishDaggerWebsocket = 0;
        long[] jArr = this.CatchingFishParcelableFAB;
        if (jArr != CatchingFishViewPayPal.CatchingFishParcelableFAB) {
            CatchingFishMVVMHilt.CatchingFishMVVMAppCompat(jArr);
            long[] jArr2 = this.CatchingFishParcelableFAB;
            int i = this.CatchingFishReduxKtor;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishSnackbar, 0, this.CatchingFishReduxKtor);
        this.CatchingFishWorkManager = CatchingFishViewPayPal.CatchingFishParcelableFAB(this.CatchingFishReduxKtor) - this.CatchingFishDaggerWebsocket;
    }

    public final int CatchingFishReduxKtor(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.CatchingFishReduxKtor;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.CatchingFishParcelableFAB;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final int CatchingFishSnackbar(int i) {
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

    public final void CatchingFishViewModelFAB(int i, Object obj) {
        int CatchingFishCoroutine = CatchingFishCoroutine(obj);
        if (CatchingFishCoroutine < 0) {
            CatchingFishCoroutine = ~CatchingFishCoroutine;
        }
        this.CatchingFishSnackbar[CatchingFishCoroutine] = obj;
        this.CatchingFishCoroutine[CatchingFishCoroutine] = i;
    }

    public final void CatchingFishViewModelScope(int i) {
        this.CatchingFishDaggerWebsocket--;
        long[] jArr = this.CatchingFishParcelableFAB;
        int i2 = this.CatchingFishReduxKtor;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.CatchingFishSnackbar[i] = null;
    }

    public final void CatchingFishWorkManager(int i) {
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
        this.CatchingFishSnackbar = new Object[max];
        this.CatchingFishCoroutine = new int[max];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishJUnitService)) {
            return false;
        }
        CatchingFishJUnitService catchingFishJUnitService = (CatchingFishJUnitService) obj;
        if (catchingFishJUnitService.CatchingFishDaggerWebsocket != this.CatchingFishDaggerWebsocket) {
            return false;
        }
        Object[] objArr = this.CatchingFishSnackbar;
        int[] iArr = this.CatchingFishCoroutine;
        long[] jArr = this.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = objArr[i4];
                        int i5 = iArr[i4];
                        int CatchingFishReduxKtor = catchingFishJUnitService.CatchingFishReduxKtor(obj2);
                        if (CatchingFishReduxKtor < 0) {
                            break loop0;
                        }
                        z2 = z3;
                        if (i5 != catchingFishJUnitService.CatchingFishCoroutine[CatchingFishReduxKtor]) {
                            break loop0;
                        }
                    } else {
                        z2 = z3;
                    }
                    j >>= 8;
                    i3++;
                    z3 = z2;
                }
                z = z3;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.CatchingFishSnackbar;
        int[] iArr = this.CatchingFishCoroutine;
        long[] jArr = this.CatchingFishParcelableFAB;
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
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.CatchingFishDaggerWebsocket == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.CatchingFishSnackbar;
        int[] iArr = this.CatchingFishCoroutine;
        long[] jArr = this.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.CatchingFishDaggerWebsocket) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ CatchingFishJUnitService() {
        this(6);
    }
}
