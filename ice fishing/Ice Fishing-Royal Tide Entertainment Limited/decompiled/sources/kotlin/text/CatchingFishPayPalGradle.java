package kotlin.text;

import android.os.Handler;

/* loaded from: classes.dex */
public final class CatchingFishPayPalGradle {
    public final CatchingFishBundleGradle CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishAdMobKtor CatchingFishFragmentHandler;
    public final CatchingFishViewPagerRedux CatchingFishLayout;
    public final CatchingFishGsonWebSocket CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public final CatchingFishEspressoService CatchingFishSnackbar;
    public long CatchingFishViewModelFAB;
    public CatchingFishOkHttpSpannable CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishPayPalGradle() {
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = new CatchingFishGsonWebSocket(4);
        catchingFishGsonWebSocket.CatchingFishCoroutine = new long[192];
        catchingFishGsonWebSocket.CatchingFishReduxKtor = new long[192];
        this.CatchingFishParcelableFAB = catchingFishGsonWebSocket;
        this.CatchingFishSnackbar = new CatchingFishEspressoService();
        this.CatchingFishCoroutine = new CatchingFishBundleGradle();
        this.CatchingFishViewModelFAB = -1L;
        this.CatchingFishLayout = new CatchingFishViewPagerRedux(12, this);
        this.CatchingFishFragmentHandler = new CatchingFishAdMobKtor();
    }

    public static void CatchingFishLayout(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        long j;
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = (CatchingFishDaggerToolbar) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB;
        long CatchingFishParcelableFAB = CatchingFishParcelableFAB(catchingFishDaggerToolbar, 0L);
        long j2 = 9223372034707292159L;
        if (!CatchingFishLayoutRoom.CatchingFishCoroutine(CatchingFishParcelableFAB)) {
            catchingFishBiometricRoom.CatchingFishWorkManager = 9223372034707292159L;
            return;
        }
        long CatchingFishGradleManifest = CatchingFishFirebaseDagger.CatchingFishGradleManifest(CatchingFishParcelableFAB, catchingFishDaggerToolbar.CatchingFishCardViewView);
        CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            if (!CatchingFishLayoutRoom.CatchingFishCoroutine(CatchingFishRoomDatabase.CatchingFishWorkManager)) {
                CatchingFishLayout(CatchingFishRoomDatabase);
            }
            long j3 = CatchingFishRoomDatabase.CatchingFishWorkManager;
            if (CatchingFishLayoutRoom.CatchingFishCoroutine(j3)) {
                if (CatchingFishRoomDatabase.CatchingFishLayout) {
                    j = CatchingFishViewModelFAB(CatchingFishRoomDatabase);
                    CatchingFishRoomDatabase.CatchingFishViewModelFAB = j;
                    CatchingFishRoomDatabase.CatchingFishLayout = false;
                } else {
                    j = CatchingFishRoomDatabase.CatchingFishViewModelFAB;
                }
                if (CatchingFishLayoutRoom.CatchingFishCoroutine(j)) {
                    j2 = CatchingFishFirebaseDagger.CatchingFishGradleManifest(CatchingFishFirebaseDagger.CatchingFishGradleManifest(j3, j), CatchingFishGradleManifest);
                }
            }
        } else {
            j2 = CatchingFishGradleManifest;
        }
        catchingFishBiometricRoom.CatchingFishWorkManager = j2;
    }

    public static long CatchingFishParcelableFAB(CatchingFishDaggerToolbar catchingFishDaggerToolbar, long j) {
        float[] CatchingFishSnackbar;
        int CatchingFishParcelableFAB;
        CatchingFishFABGlide catchingFishFABGlide = catchingFishDaggerToolbar.CatchingFishDagger;
        if (catchingFishFABGlide == null || (CatchingFishParcelableFAB = CatchingFishLayoutRoom.CatchingFishParcelableFAB((CatchingFishSnackbar = ((CatchingFishMVVMFABFAB) catchingFishFABGlide).CatchingFishSnackbar()))) == 3) {
            return j;
        }
        if ((CatchingFishParcelableFAB & 2) == 0) {
            return 9223372034707292159L;
        }
        return CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(CatchingFishOkHttpFAB.CatchingFishJobScheduler(CatchingFishSnackbar, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32)));
    }

    public static long CatchingFishViewModelFAB(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishBiometricRoom.CatchingFishJobScheduler;
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = (CatchingFishDaggerToolbar) catchingFishExoPlayerBundle.CatchingFishViewModelFAB;
        long j = 0;
        for (CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = (CatchingFishGlideHandler) catchingFishExoPlayerBundle.CatchingFishViewModelScope; catchingFishDaggerToolbar2 != null && catchingFishDaggerToolbar2 != catchingFishDaggerToolbar; catchingFishDaggerToolbar2 = catchingFishDaggerToolbar2.CatchingFish) {
            long CatchingFishParcelableFAB = CatchingFishParcelableFAB(catchingFishDaggerToolbar2, j);
            if (CatchingFishFirebaseDagger.CatchingFishCardViewView(CatchingFishParcelableFAB, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            j = CatchingFishFirebaseDagger.CatchingFishGradleManifest(CatchingFishParcelableFAB, catchingFishDaggerToolbar2.CatchingFishCardViewView);
        }
        return j;
    }

    public final void CatchingFishCoroutine(CatchingFishBiometricRoom catchingFishBiometricRoom, boolean z) {
        char c;
        boolean z2;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishBiometricRoom.CatchingFishJobScheduler;
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = (CatchingFishDaggerToolbar) catchingFishExoPlayerBundle.CatchingFishViewModelFAB;
        CatchingFishToolbarMVIToast catchingFishToolbarMVIToast = catchingFishBiometricRoom.CatchingFishPayPalService.CatchingFishAnimationMockk;
        int CatchingFishGradleManifest = catchingFishToolbarMVIToast.CatchingFishGradleManifest();
        float CatchingFishPayPalLiveData = catchingFishToolbarMVIToast.CatchingFishPayPalLiveData();
        CatchingFishAdMobKtor catchingFishAdMobKtor = this.CatchingFishFragmentHandler;
        catchingFishAdMobKtor.CatchingFishParcelableFAB = 0.0f;
        catchingFishAdMobKtor.CatchingFishSnackbar = 0.0f;
        catchingFishAdMobKtor.CatchingFishCoroutine = CatchingFishGradleManifest;
        catchingFishAdMobKtor.CatchingFishReduxKtor = CatchingFishPayPalLiveData;
        while (true) {
            c = ' ';
            if (catchingFishDaggerToolbar == null) {
                break;
            }
            CatchingFishFABGlide catchingFishFABGlide = catchingFishDaggerToolbar.CatchingFishDagger;
            if (catchingFishFABGlide != null) {
                float[] CatchingFishSnackbar = ((CatchingFishMVVMFABFAB) catchingFishFABGlide).CatchingFishSnackbar();
                if (!CatchingFishViewMVIMVVM.CatchingFishAnimationMockk(CatchingFishSnackbar)) {
                    CatchingFishOkHttpFAB.CatchingFishPayPalService(CatchingFishSnackbar, catchingFishAdMobKtor);
                }
            }
            long j = catchingFishDaggerToolbar.CatchingFishCardViewView;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            catchingFishAdMobKtor.CatchingFishParcelableFAB += intBitsToFloat;
            catchingFishAdMobKtor.CatchingFishSnackbar += intBitsToFloat2;
            catchingFishAdMobKtor.CatchingFishCoroutine += intBitsToFloat;
            catchingFishAdMobKtor.CatchingFishReduxKtor += intBitsToFloat2;
            catchingFishDaggerToolbar = catchingFishDaggerToolbar.CatchingFish;
        }
        int i = (int) catchingFishAdMobKtor.CatchingFishParcelableFAB;
        int i2 = (int) catchingFishAdMobKtor.CatchingFishSnackbar;
        int i3 = (int) catchingFishAdMobKtor.CatchingFishCoroutine;
        int i4 = (int) catchingFishAdMobKtor.CatchingFishReduxKtor;
        int i5 = catchingFishBiometricRoom.CatchingFishDaggerWebsocket;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishParcelableFAB;
        if (!z) {
            int i6 = i5 & 67108863;
            long[] jArr = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
            int i7 = catchingFishGsonWebSocket.CatchingFishSnackbar;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                char c2 = c;
                CatchingFishGsonWebSocket catchingFishGsonWebSocket2 = catchingFishGsonWebSocket;
                long j2 = jArr[i9];
                z2 = true;
                if ((((int) j2) & 67108863) == i6) {
                    jArr[i8] = (i << c2) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << c2) | (i4 & 4294967295L);
                    jArr[i9] = 2305843009213693952L | j2;
                    break;
                } else {
                    i8 += 3;
                    c = c2;
                    catchingFishGsonWebSocket = catchingFishGsonWebSocket2;
                }
            }
        }
        CatchingFishGsonWebSocket catchingFishGsonWebSocket3 = catchingFishGsonWebSocket;
        z2 = true;
        CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
        catchingFishGsonWebSocket3.CatchingFishReduxKtor(i5, i, i2, i3, i4, CatchingFishRoomDatabase != null ? CatchingFishRoomDatabase.CatchingFishDaggerWebsocket : -1, catchingFishExoPlayerBundle.CatchingFishViewModelFAB(1024), catchingFishExoPlayerBundle.CatchingFishViewModelFAB(16));
        this.CatchingFishReduxKtor = z2;
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        this.CatchingFishReduxKtor = true;
        int i = catchingFishBiometricRoom.CatchingFishDaggerWebsocket & 67108863;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishParcelableFAB;
        long[] jArr = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
        int i2 = catchingFishGsonWebSocket.CatchingFishSnackbar;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        CatchingFishOkHttpSpannable catchingFishOkHttpSpannable = this.CatchingFishViewModelScope;
        boolean z = catchingFishOkHttpSpannable != null;
        long j2 = this.CatchingFishSnackbar.CatchingFishSnackbar;
        if (j2 >= 0 || !z) {
            if (this.CatchingFishViewModelFAB == j2 && z) {
                return;
            }
            if (catchingFishOkHttpSpannable != null) {
                Handler handler = CatchingFishFABFragment.CatchingFishParcelableFAB;
                CatchingFishFABFragment.CatchingFishParcelableFAB.removeCallbacks(catchingFishOkHttpSpannable);
            }
            Handler handler2 = CatchingFishFABFragment.CatchingFishParcelableFAB;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j2, 16 + currentTimeMillis);
            this.CatchingFishViewModelFAB = max;
            CatchingFishOkHttpSpannable catchingFishOkHttpSpannable2 = new CatchingFishOkHttpSpannable(this.CatchingFishLayout, 0);
            CatchingFishFABFragment.CatchingFishParcelableFAB.postDelayed(catchingFishOkHttpSpannable2, max - currentTimeMillis);
            this.CatchingFishViewModelScope = catchingFishOkHttpSpannable2;
        }
    }

    public final void CatchingFishFragmentHandler(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        int i = catchingFishBiometricRoom.CatchingFishDaggerWebsocket & 67108863;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishParcelableFAB;
        long[] jArr = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
        int i2 = catchingFishGsonWebSocket.CatchingFishSnackbar;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.CatchingFishReduxKtor = true;
        this.CatchingFishWorkManager = true;
    }

    public final void CatchingFishReduxKtor(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        CatchingFishFABToast CatchingFishCoroutineFlow = catchingFishBiometricRoom.CatchingFishCoroutineFlow();
        Object[] objArr = CatchingFishCoroutineFlow.CatchingFishReduxKtor;
        int i = CatchingFishCoroutineFlow.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            CatchingFishBiometricRoom catchingFishBiometricRoom2 = (CatchingFishBiometricRoom) objArr[i2];
            CatchingFishCoroutine(catchingFishBiometricRoom2, false);
            CatchingFishReduxKtor(catchingFishBiometricRoom2);
        }
    }

    public final void CatchingFishSnackbar() {
        boolean z;
        long j;
        long j2;
        long j3;
        Handler handler = CatchingFishFABFragment.CatchingFishParcelableFAB;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.CatchingFishReduxKtor;
        boolean z3 = z2 || this.CatchingFishDaggerWebsocket;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishParcelableFAB;
        CatchingFishEspressoService catchingFishEspressoService = this.CatchingFishSnackbar;
        if (z2) {
            this.CatchingFishReduxKtor = false;
            CatchingFishBundleGradle catchingFishBundleGradle = this.CatchingFishCoroutine;
            j = 128;
            Object[] objArr = catchingFishBundleGradle.CatchingFishParcelableFAB;
            int i = catchingFishBundleGradle.CatchingFishSnackbar;
            for (int i2 = 0; i2 < i; i2++) {
                ((CatchingFishJUnitGlide) objArr[i2]).CatchingFishParcelableFAB();
            }
            long[] jArr = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
            int i3 = catchingFishGsonWebSocket.CatchingFishSnackbar;
            j2 = 255;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j4 = jArr[i4 + 2];
                if ((((int) (j4 >> 61)) & 1) != 0) {
                    long j5 = jArr[i4];
                    long j6 = jArr[i4 + 1];
                    if (catchingFishEspressoService.CatchingFishParcelableFAB.CatchingFishSnackbar(((int) j4) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            j3 = -9187201950435737472L;
            CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = catchingFishEspressoService.CatchingFishParcelableFAB;
            Object[] objArr2 = catchingFishLayoutGsonRoom.CatchingFishCoroutine;
            long[] jArr2 = catchingFishLayoutGsonRoom.CatchingFishParcelableFAB;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j7 = jArr2[i5];
                    z = z3;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j7 & 255) < 128 && objArr2[(i5 << 3) + i7] != null) {
                                throw new ClassCastException();
                            }
                            j7 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z3 = z;
                }
            } else {
                z = z3;
            }
            long[] jArr3 = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
            int i8 = catchingFishGsonWebSocket.CatchingFishSnackbar;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-2305843009213693953L);
            }
        } else {
            z = z3;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        if (this.CatchingFishDaggerWebsocket) {
            this.CatchingFishDaggerWebsocket = false;
            CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom2 = catchingFishEspressoService.CatchingFishParcelableFAB;
            Object[] objArr3 = catchingFishLayoutGsonRoom2.CatchingFishCoroutine;
            long[] jArr4 = catchingFishLayoutGsonRoom2.CatchingFishParcelableFAB;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                while (true) {
                    long j8 = jArr4[i11];
                    if ((((~j8) << 7) & j8 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j8 & j2) < j && objArr3[(i11 << 3) + i13] != null) {
                                throw new ClassCastException();
                            }
                            j8 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length2) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        if (z) {
            catchingFishEspressoService.getClass();
        }
        if (this.CatchingFishWorkManager) {
            this.CatchingFishWorkManager = false;
            long[] jArr5 = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
            int i14 = catchingFishGsonWebSocket.CatchingFishSnackbar;
            long[] jArr6 = (long[]) catchingFishGsonWebSocket.CatchingFishReduxKtor;
            int i15 = 0;
            for (int i16 = 0; i16 < jArr5.length - 2 && i15 < jArr6.length - 2 && i16 < i14; i16 += 3) {
                int i17 = i16 + 2;
                if (jArr5[i17] != 2305843009213693951L) {
                    jArr6[i15] = jArr5[i16];
                    jArr6[i15 + 1] = jArr5[i16 + 1];
                    jArr6[i15 + 2] = jArr5[i17];
                    i15 += 3;
                }
            }
            catchingFishGsonWebSocket.CatchingFishSnackbar = i15;
            catchingFishGsonWebSocket.CatchingFishCoroutine = jArr6;
            catchingFishGsonWebSocket.CatchingFishReduxKtor = jArr5;
        }
        if (catchingFishEspressoService.CatchingFishSnackbar > currentTimeMillis) {
            return;
        }
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom3 = catchingFishEspressoService.CatchingFishParcelableFAB;
        Object[] objArr4 = catchingFishLayoutGsonRoom3.CatchingFishCoroutine;
        long[] jArr7 = catchingFishLayoutGsonRoom3.CatchingFishParcelableFAB;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i18 = 0;
            while (true) {
                long j9 = jArr7[i18];
                if ((((~j9) << 7) & j9 & j3) != j3) {
                    int i19 = 8 - ((~(i18 - length3)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j9 & j2) < j && objArr4[(i18 << 3) + i20] != null) {
                            throw new ClassCastException();
                        }
                        j9 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length3) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        catchingFishEspressoService.CatchingFishSnackbar = -1L;
    }

    public final void CatchingFishViewModelScope(CatchingFishBiometricRoom catchingFishBiometricRoom, boolean z) {
        long j;
        char c;
        CatchingFishToolbarMVIToast catchingFishToolbarMVIToast = catchingFishBiometricRoom.CatchingFishPayPalService.CatchingFishAnimationMockk;
        int CatchingFishGradleManifest = catchingFishToolbarMVIToast.CatchingFishGradleManifest();
        int CatchingFishPayPalLiveData = catchingFishToolbarMVIToast.CatchingFishPayPalLiveData();
        long j2 = catchingFishBiometricRoom.CatchingFishWorkManager;
        long j3 = catchingFishBiometricRoom.CatchingFishViewModelScope;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        CatchingFishLayout(catchingFishBiometricRoom);
        long j4 = catchingFishBiometricRoom.CatchingFishWorkManager;
        if (!CatchingFishLayoutRoom.CatchingFishCoroutine(j4)) {
            CatchingFishCoroutine(catchingFishBiometricRoom, z);
            return;
        }
        catchingFishBiometricRoom.CatchingFishViewModelScope = (CatchingFishPayPalLiveData & 4294967295L) | (CatchingFishGradleManifest << 32);
        int i3 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        int i5 = i3 + CatchingFishGradleManifest;
        int i6 = i4 + CatchingFishPayPalLiveData;
        if (!z && CatchingFishFirebaseDagger.CatchingFishCardViewView(j4, j2) && i == CatchingFishGradleManifest && i2 == CatchingFishPayPalLiveData) {
            return;
        }
        int i7 = catchingFishBiometricRoom.CatchingFishDaggerWebsocket;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishBiometricRoom.CatchingFishJobScheduler;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = this.CatchingFishParcelableFAB;
        if (!z) {
            int i8 = i7 & 67108863;
            long[] jArr = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
            int i9 = catchingFishGsonWebSocket.CatchingFishSnackbar;
            int i10 = 0;
            while (i10 < jArr.length - 2 && i10 < i9) {
                int i11 = i10 + 2;
                int i12 = i10;
                long j5 = jArr[i11];
                if ((((int) j5) & 67108863) == i8) {
                    long j6 = jArr[i12];
                    jArr[i12] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i12 + 1] = (i5 << 32) | (i6 & 4294967295L);
                    long j7 = 2305843009213693952L;
                    jArr[i11] = j5 | 2305843009213693952L;
                    if ((i3 - ((int) (j6 >> 32)) != 0) | (i4 - ((int) j6) != 0)) {
                        long j8 = -4503599560261633L;
                        char c2 = 26;
                        long[] jArr2 = (long[]) catchingFishGsonWebSocket.CatchingFishCoroutine;
                        long[] jArr3 = (long[]) catchingFishGsonWebSocket.CatchingFishReduxKtor;
                        int i13 = catchingFishGsonWebSocket.CatchingFishSnackbar / 3;
                        jArr3[0] = (j5 & (-4503599560261633L)) | (((i12 + 3) & 67108863) << 26);
                        int i14 = 1;
                        while (i14 > 0) {
                            i14--;
                            long j9 = jArr3[i14];
                            int i15 = ((int) j9) & 67108863;
                            char c3 = c2;
                            long j10 = j8;
                            int i16 = ((int) (j9 >> c3)) & 67108863;
                            char c4 = '4';
                            int i17 = (int) (j9 >> 52);
                            char c5 = 511;
                            int i18 = i17 & 511;
                            int i19 = i18 == 511 ? i13 : i18 + i16;
                            if (i16 < 0) {
                                break;
                            }
                            while (i16 < jArr2.length - 2 && i16 < i19) {
                                int i20 = i16 + 2;
                                long j11 = jArr2[i20];
                                char c6 = c4;
                                int i21 = i19;
                                if ((((int) (j11 >> c3)) & 67108863) == i15) {
                                    long j12 = jArr2[i16];
                                    int i22 = i16 + 1;
                                    j = j7;
                                    long j13 = jArr2[i22];
                                    jArr2[i16] = ((((int) j12) + r10) & 4294967295L) | ((((int) (j12 >> 32)) + r7) << 32);
                                    jArr2[i22] = ((((int) j13) + r10) & 4294967295L) | ((((int) (j13 >> 32)) + r7) << 32);
                                    jArr2[i20] = j11 | j;
                                    c = 511;
                                    if ((((int) (j11 >> c6)) & 511) > 0) {
                                        jArr3[i14] = (((i16 + 3) & 67108863) << c3) | (j11 & j10);
                                        i14++;
                                    }
                                } else {
                                    j = j7;
                                    c = c5;
                                }
                                i16 += 3;
                                c5 = c;
                                c4 = c6;
                                i19 = i21;
                                j7 = j;
                            }
                            c2 = c3;
                            j8 = j10;
                            j7 = j7;
                        }
                    }
                    this.CatchingFishReduxKtor = true;
                }
                i10 = i12 + 3;
            }
        }
        CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
        catchingFishGsonWebSocket.CatchingFishReduxKtor(i7, i3, i4, i5, i6, CatchingFishRoomDatabase != null ? CatchingFishRoomDatabase.CatchingFishDaggerWebsocket : -1, catchingFishExoPlayerBundle.CatchingFishViewModelFAB(1024), catchingFishExoPlayerBundle.CatchingFishViewModelFAB(16));
        this.CatchingFishReduxKtor = true;
    }

    public final void CatchingFishWorkManager(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        long CatchingFishViewModelFAB = CatchingFishViewModelFAB(catchingFishBiometricRoom);
        if (!CatchingFishLayoutRoom.CatchingFishCoroutine(CatchingFishViewModelFAB)) {
            CatchingFishReduxKtor(catchingFishBiometricRoom);
            return;
        }
        catchingFishBiometricRoom.CatchingFishViewModelFAB = CatchingFishViewModelFAB;
        catchingFishBiometricRoom.CatchingFishLayout = false;
        CatchingFishFABToast CatchingFishCoroutineFlow = catchingFishBiometricRoom.CatchingFishCoroutineFlow();
        Object[] objArr = CatchingFishCoroutineFlow.CatchingFishReduxKtor;
        int i = CatchingFishCoroutineFlow.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            CatchingFishViewModelScope((CatchingFishBiometricRoom) objArr[i2], false);
        }
        CatchingFishDaggerWebsocket(catchingFishBiometricRoom);
    }
}
