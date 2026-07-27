package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishSpannableMVIFAB extends CatchingFishHiltMVPToast {
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public int CatchingFishWorkManager;
    public CatchingFishBiometricMVP[] CatchingFishParcelableFAB = new CatchingFishBiometricMVP[16];
    public int[] CatchingFishCoroutine = new int[16];
    public Object[] CatchingFishDaggerWebsocket = new Object[16];

    public final boolean CatchingFishAnimation() {
        return this.CatchingFishSnackbar == 0;
    }

    public final void CatchingFishJUnitRealm(CatchingFishViewFlux catchingFishViewFlux, CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP, CatchingFishExoPlayerBundle catchingFishExoPlayerBundle, CatchingFishViewRobolectric catchingFishViewRobolectric) {
        if (CatchingFishMVVMAppCompat()) {
            CatchingFishWidgetFAB catchingFishWidgetFAB = new CatchingFishWidgetFAB();
            catchingFishWidgetFAB.CatchingFishReduxKtor = this;
            CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB = (CatchingFishSpannableMVIFAB) catchingFishWidgetFAB.CatchingFishReduxKtor;
            while (true) {
                CatchingFishBiometricMVP catchingFishBiometricMVP = catchingFishSpannableMVIFAB.CatchingFishParcelableFAB[catchingFishWidgetFAB.CatchingFishParcelableFAB];
                CatchingFishMockkPicasso CatchingFishSnackbar = catchingFishBiometricMVP.CatchingFishSnackbar(catchingFishWidgetFAB);
                CatchingFishViewFlux catchingFishViewFlux2 = catchingFishViewFlux;
                CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP2 = catchingFishGoogleMapsMVP;
                CatchingFishExoPlayerBundle catchingFishExoPlayerBundle2 = catchingFishExoPlayerBundle;
                CatchingFishViewRobolectric catchingFishViewRobolectric2 = catchingFishViewRobolectric;
                try {
                    catchingFishBiometricMVP.CatchingFishParcelableFAB(catchingFishWidgetFAB, catchingFishViewFlux2, catchingFishGoogleMapsMVP2, catchingFishExoPlayerBundle2, catchingFishViewRobolectric2);
                    int i = catchingFishWidgetFAB.CatchingFishParcelableFAB;
                    int i2 = catchingFishSpannableMVIFAB.CatchingFishSnackbar;
                    if (i < i2) {
                        CatchingFishBiometricMVP catchingFishBiometricMVP2 = catchingFishSpannableMVIFAB.CatchingFishParcelableFAB[i];
                        catchingFishWidgetFAB.CatchingFishSnackbar += catchingFishBiometricMVP2.CatchingFishParcelableFAB;
                        catchingFishWidgetFAB.CatchingFishCoroutine += catchingFishBiometricMVP2.CatchingFishSnackbar;
                        int i3 = i + 1;
                        catchingFishWidgetFAB.CatchingFishParcelableFAB = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        catchingFishViewFlux = catchingFishViewFlux2;
                        catchingFishGoogleMapsMVP = catchingFishGoogleMapsMVP2;
                        catchingFishExoPlayerBundle = catchingFishExoPlayerBundle2;
                        catchingFishViewRobolectric = catchingFishViewRobolectric2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        CatchingFishStateFlow();
    }

    public final boolean CatchingFishMVVMAppCompat() {
        return this.CatchingFishSnackbar != 0;
    }

    public final void CatchingFishStateFlow() {
        this.CatchingFishSnackbar = 0;
        this.CatchingFishReduxKtor = 0;
        CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishDaggerWebsocket, 0, this.CatchingFishWorkManager);
        this.CatchingFishWorkManager = 0;
    }

    public final void CatchingFishStripeAPI(CatchingFishBiometricMVP catchingFishBiometricMVP) {
        int i = this.CatchingFishSnackbar;
        CatchingFishBiometricMVP[] catchingFishBiometricMVPArr = this.CatchingFishParcelableFAB;
        if (i == catchingFishBiometricMVPArr.length) {
            CatchingFishBiometricMVP[] catchingFishBiometricMVPArr2 = new CatchingFishBiometricMVP[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(catchingFishBiometricMVPArr, 0, catchingFishBiometricMVPArr2, 0, i);
            this.CatchingFishParcelableFAB = catchingFishBiometricMVPArr2;
        }
        int i2 = this.CatchingFishReduxKtor;
        int i3 = catchingFishBiometricMVP.CatchingFishParcelableFAB;
        int i4 = catchingFishBiometricMVP.CatchingFishSnackbar;
        int i5 = i2 + i3;
        int[] iArr = this.CatchingFishCoroutine;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            CatchingFishMVVMHilt.CatchingFishParcelable(0, 0, length, iArr, iArr2);
            this.CatchingFishCoroutine = iArr2;
        }
        int i7 = this.CatchingFishWorkManager + i4;
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.CatchingFishDaggerWebsocket = objArr2;
        }
        CatchingFishBiometricMVP[] catchingFishBiometricMVPArr3 = this.CatchingFishParcelableFAB;
        int i9 = this.CatchingFishSnackbar;
        this.CatchingFishSnackbar = i9 + 1;
        catchingFishBiometricMVPArr3[i9] = catchingFishBiometricMVP;
        this.CatchingFishReduxKtor += catchingFishBiometricMVP.CatchingFishParcelableFAB;
        this.CatchingFishWorkManager += i4;
    }
}
