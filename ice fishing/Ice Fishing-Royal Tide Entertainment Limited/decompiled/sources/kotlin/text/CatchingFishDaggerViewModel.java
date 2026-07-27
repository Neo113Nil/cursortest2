package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishDaggerViewModel {
    public boolean CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishMockkCoroutine CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;
    public final CatchingFishViewModelLayout CatchingFishViewModelFAB;
    public final CatchingFishBundleGradle CatchingFishWorkManager = new CatchingFishBundleGradle();
    public final CatchingFishKtorCustomView CatchingFishViewModelScope = new CatchingFishKtorCustomView();

    public CatchingFishDaggerViewModel(CatchingFishMockkCoroutine catchingFishMockkCoroutine) {
        this.CatchingFishParcelableFAB = catchingFishMockkCoroutine;
        CatchingFishViewModelLayout catchingFishViewModelLayout = new CatchingFishViewModelLayout();
        catchingFishViewModelLayout.CatchingFishParcelableFAB = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        catchingFishViewModelLayout.CatchingFishSnackbar = CatchingFishNavigationKtor.CatchingFishParcelableFAB;
        catchingFishViewModelLayout.CatchingFishCoroutine = CatchingFishAdMobFAB.CatchingFishReduxKtor;
        catchingFishViewModelLayout.CatchingFishCoroutine(CatchingFishViewPayPal.CatchingFishReduxKtor(10));
        this.CatchingFishViewModelFAB = catchingFishViewModelLayout;
    }

    public final void CatchingFishCoroutine() {
        if (this.CatchingFishSnackbar) {
            this.CatchingFishCoroutine = true;
            return;
        }
        CatchingFishKtorCustomView catchingFishKtorCustomView = this.CatchingFishViewModelScope;
        CatchingFishFABToast catchingFishFABToast = catchingFishKtorCustomView.CatchingFishParcelableFAB;
        Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
        int i = catchingFishFABToast.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            ((CatchingFishGradleBundle) objArr[i2]).CatchingFishCoroutine();
        }
        if (this.CatchingFishReduxKtor) {
            this.CatchingFishReduxKtor = true;
        } else {
            catchingFishKtorCustomView.CatchingFishParcelableFAB.CatchingFishViewModelScope();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    public final void CatchingFishParcelableFAB(long j, List list, boolean z) {
        long j2;
        int i;
        char c;
        long j3;
        CatchingFishGradleBundle catchingFishGradleBundle;
        CatchingFishGradleBundle catchingFishGradleBundle2;
        CatchingFishViewModelLayout catchingFishViewModelLayout = this.CatchingFishViewModelFAB;
        catchingFishViewModelLayout.CatchingFishDaggerWebsocket = 0;
        long[] jArr = catchingFishViewModelLayout.CatchingFishParcelableFAB;
        char c2 = 7;
        if (jArr != CatchingFishViewPayPal.CatchingFishParcelableFAB) {
            CatchingFishMVVMHilt.CatchingFishMVVMAppCompat(jArr);
            long[] jArr2 = catchingFishViewModelLayout.CatchingFishParcelableFAB;
            int i2 = catchingFishViewModelLayout.CatchingFishReduxKtor;
            int i3 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            j2 = 255;
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        } else {
            j2 = 255;
        }
        CatchingFishMVVMHilt.CatchingFishAnimation(catchingFishViewModelLayout.CatchingFishCoroutine, 0, catchingFishViewModelLayout.CatchingFishReduxKtor);
        catchingFishViewModelLayout.CatchingFishWorkManager = CatchingFishViewPayPal.CatchingFishParcelableFAB(catchingFishViewModelLayout.CatchingFishReduxKtor) - catchingFishViewModelLayout.CatchingFishDaggerWebsocket;
        int size = list.size();
        CatchingFishKtorCustomView catchingFishKtorCustomView = this.CatchingFishViewModelScope;
        int i4 = 0;
        boolean z2 = true;
        CatchingFishKtorCustomView catchingFishKtorCustomView2 = catchingFishKtorCustomView;
        while (i4 < size) {
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) list.get(i4);
            if (catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
                catchingFishFABStripeAPIFAB.CatchingFishStateLiveData = new CatchingFishAppCompatJUnit(2, this, catchingFishFABStripeAPIFAB);
                if (z2) {
                    CatchingFishFABToast catchingFishFABToast = catchingFishKtorCustomView2.CatchingFishParcelableFAB;
                    ?? r14 = catchingFishFABToast.CatchingFishReduxKtor;
                    int i5 = catchingFishFABToast.CatchingFishWorkManager;
                    c = c2;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            j3 = j2;
                            catchingFishGradleBundle2 = 0;
                            break;
                        }
                        catchingFishGradleBundle2 = r14[i6];
                        j3 = j2;
                        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(((CatchingFishGradleBundle) catchingFishGradleBundle2).CatchingFishCoroutine, catchingFishFABStripeAPIFAB)) {
                            break;
                        }
                        i6++;
                        j2 = j3;
                    }
                    catchingFishGradleBundle = catchingFishGradleBundle2;
                    if (catchingFishGradleBundle != null) {
                        catchingFishGradleBundle.CatchingFishLayout = true;
                        catchingFishGradleBundle.CatchingFishReduxKtor.CatchingFishParcelableFAB(j);
                        Object CatchingFishSnackbar = catchingFishViewModelLayout.CatchingFishSnackbar(j);
                        Object obj = CatchingFishSnackbar;
                        if (CatchingFishSnackbar == null) {
                            CatchingFishBundleGradle catchingFishBundleGradle = new CatchingFishBundleGradle();
                            catchingFishViewModelLayout.CatchingFishReduxKtor(j, catchingFishBundleGradle);
                            obj = catchingFishBundleGradle;
                        }
                        ((CatchingFishBundleGradle) obj).CatchingFishParcelableFAB(catchingFishGradleBundle);
                        catchingFishKtorCustomView2 = catchingFishGradleBundle;
                    } else {
                        z2 = false;
                    }
                } else {
                    c = c2;
                    j3 = j2;
                }
                catchingFishGradleBundle = new CatchingFishGradleBundle(catchingFishFABStripeAPIFAB);
                catchingFishGradleBundle.CatchingFishReduxKtor.CatchingFishParcelableFAB(j);
                Object CatchingFishSnackbar2 = catchingFishViewModelLayout.CatchingFishSnackbar(j);
                Object obj2 = CatchingFishSnackbar2;
                if (CatchingFishSnackbar2 == null) {
                    CatchingFishBundleGradle catchingFishBundleGradle2 = new CatchingFishBundleGradle();
                    catchingFishViewModelLayout.CatchingFishReduxKtor(j, catchingFishBundleGradle2);
                    obj2 = catchingFishBundleGradle2;
                }
                ((CatchingFishBundleGradle) obj2).CatchingFishParcelableFAB(catchingFishGradleBundle);
                catchingFishKtorCustomView2.CatchingFishParcelableFAB.CatchingFishSnackbar(catchingFishGradleBundle);
                catchingFishKtorCustomView2 = catchingFishGradleBundle;
            } else {
                c = c2;
                j3 = j2;
            }
            i4++;
            c2 = c;
            j2 = j3;
        }
        char c3 = c2;
        long j5 = j2;
        if (!z) {
            return;
        }
        long[] jArr3 = catchingFishViewModelLayout.CatchingFishSnackbar;
        Object[] objArr = catchingFishViewModelLayout.CatchingFishCoroutine;
        long[] jArr4 = catchingFishViewModelLayout.CatchingFishParcelableFAB;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j6 = jArr4[i7];
            if ((((~j6) << c3) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j6 & j5) < 128) {
                        int i11 = (i7 << 3) + i10;
                        long j7 = jArr3[i11];
                        CatchingFishBundleGradle catchingFishBundleGradle3 = (CatchingFishBundleGradle) objArr[i11];
                        CatchingFishFABToast catchingFishFABToast2 = catchingFishKtorCustomView.CatchingFishParcelableFAB;
                        i = i8;
                        Object[] objArr2 = catchingFishFABToast2.CatchingFishReduxKtor;
                        int i12 = catchingFishFABToast2.CatchingFishWorkManager;
                        for (int i13 = 0; i13 < i12; i13++) {
                            ((CatchingFishGradleBundle) objArr2[i13]).CatchingFishWorkManager(j7, catchingFishBundleGradle3);
                        }
                    } else {
                        i = i8;
                    }
                    j6 >>= i;
                    i10++;
                    i8 = i;
                }
                if (i9 != i8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void CatchingFishReduxKtor(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        if (this.CatchingFishSnackbar) {
            this.CatchingFishDaggerWebsocket = true;
            this.CatchingFishWorkManager.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB);
            return;
        }
        CatchingFishKtorCustomView catchingFishKtorCustomView = this.CatchingFishViewModelScope;
        CatchingFishBundleGradle catchingFishBundleGradle = catchingFishKtorCustomView.CatchingFishSnackbar;
        catchingFishBundleGradle.CatchingFishCoroutine();
        catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishKtorCustomView);
        while (catchingFishBundleGradle.CatchingFishViewModelFAB()) {
            CatchingFishKtorCustomView catchingFishKtorCustomView2 = (CatchingFishKtorCustomView) catchingFishBundleGradle.CatchingFishFragmentHandler(catchingFishBundleGradle.CatchingFishSnackbar - 1);
            int i = 0;
            while (true) {
                CatchingFishFABToast catchingFishFABToast = catchingFishKtorCustomView2.CatchingFishParcelableFAB;
                if (i < catchingFishFABToast.CatchingFishWorkManager) {
                    CatchingFishGradleBundle catchingFishGradleBundle = (CatchingFishGradleBundle) catchingFishFABToast.CatchingFishReduxKtor[i];
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGradleBundle.CatchingFishCoroutine, catchingFishFABStripeAPIFAB)) {
                        catchingFishKtorCustomView2.CatchingFishParcelableFAB.CatchingFishLayout(catchingFishGradleBundle);
                        catchingFishGradleBundle.CatchingFishCoroutine();
                    } else {
                        catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishGradleBundle);
                        i++;
                    }
                }
            }
        }
    }

    public final boolean CatchingFishSnackbar(CatchingFishGlideFAB catchingFishGlideFAB, boolean z) {
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) catchingFishGlideFAB.CatchingFishSnackbar;
        CatchingFishMockkCoroutine catchingFishMockkCoroutine = this.CatchingFishParcelableFAB;
        CatchingFishKtorCustomView catchingFishKtorCustomView = this.CatchingFishViewModelScope;
        boolean CatchingFishParcelableFAB = catchingFishKtorCustomView.CatchingFishParcelableFAB(catchingFishLayoutMVVMFlux, catchingFishMockkCoroutine, catchingFishGlideFAB, z);
        CatchingFishFABToast catchingFishFABToast = catchingFishKtorCustomView.CatchingFishParcelableFAB;
        if (!CatchingFishParcelableFAB) {
            return false;
        }
        boolean z2 = true;
        this.CatchingFishSnackbar = true;
        Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
        int i = catchingFishFABToast.CatchingFishWorkManager;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((CatchingFishGradleBundle) objArr[i2]).CatchingFishDaggerWebsocket(catchingFishGlideFAB, z) || z3;
        }
        Object[] objArr2 = catchingFishFABToast.CatchingFishReduxKtor;
        int i3 = catchingFishFABToast.CatchingFishWorkManager;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((CatchingFishGradleBundle) objArr2[i4]).CatchingFishReduxKtor(catchingFishGlideFAB) || z4;
        }
        catchingFishKtorCustomView.CatchingFishSnackbar(catchingFishGlideFAB);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.CatchingFishSnackbar = false;
        if (this.CatchingFishDaggerWebsocket) {
            this.CatchingFishDaggerWebsocket = false;
            CatchingFishBundleGradle catchingFishBundleGradle = this.CatchingFishWorkManager;
            int i5 = catchingFishBundleGradle.CatchingFishSnackbar;
            for (int i6 = 0; i6 < i5; i6++) {
                CatchingFishReduxKtor((CatchingFishFABStripeAPIFAB) catchingFishBundleGradle.CatchingFishDaggerWebsocket(i6));
            }
            catchingFishBundleGradle.CatchingFishCoroutine();
        }
        if (this.CatchingFishCoroutine) {
            this.CatchingFishCoroutine = false;
            CatchingFishCoroutine();
        }
        if (this.CatchingFishReduxKtor) {
            this.CatchingFishReduxKtor = false;
            catchingFishKtorCustomView.CatchingFishParcelableFAB.CatchingFishViewModelScope();
        }
        return z2;
    }
}
