package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishDataStorePayPal implements CatchingFishGlideRedux {
    public CatchingFishAnimationToast CatchingFishCoroutine;
    public int CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public CatchingFishDaggerRetrofit CatchingFishSnackbar;
    public final CatchingFishAndroidXKtor CatchingFishDaggerWebsocket = new CatchingFishAndroidXKtor(this);
    public int CatchingFishWorkManager = 0;
    public boolean CatchingFishViewModelScope = false;
    public final CatchingFishUnitTestingMVI CatchingFishViewModelFAB = new CatchingFishUnitTestingMVI(this);
    public final CatchingFishUnitTestingMVI CatchingFishLayout = new CatchingFishUnitTestingMVI(this);
    public int CatchingFishFragmentHandler = 1;

    public CatchingFishDataStorePayPal(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit) {
        this.CatchingFishSnackbar = catchingFishDaggerRetrofit;
    }

    public static CatchingFishUnitTestingMVI CatchingFishLayout(CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit, int i) {
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishStripeAPIJUnit.CatchingFishWorkManager;
        if (catchingFishStripeAPIJUnit2 == null) {
            return null;
        }
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = catchingFishStripeAPIJUnit2.CatchingFishReduxKtor;
        CatchingFishDataStorePayPal catchingFishDataStorePayPal = i == 0 ? catchingFishDaggerRetrofit.CatchingFishReduxKtor : catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket;
        int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket);
        if (CatchingFishParcelableFlux == 1 || CatchingFishParcelableFlux == 2) {
            return catchingFishDataStorePayPal.CatchingFishViewModelFAB;
        }
        if (CatchingFishParcelableFlux == 3 || CatchingFishParcelableFlux == 4) {
            return catchingFishDataStorePayPal.CatchingFishLayout;
        }
        return null;
    }

    public static void CatchingFishSnackbar(CatchingFishUnitTestingMVI catchingFishUnitTestingMVI, CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2, int i) {
        catchingFishUnitTestingMVI.CatchingFishEspressoTesting.add(catchingFishUnitTestingMVI2);
        catchingFishUnitTestingMVI.CatchingFishWorkManager = i;
        catchingFishUnitTestingMVI2.CatchingFishCloudMessaging.add(catchingFishUnitTestingMVI);
    }

    public static CatchingFishUnitTestingMVI CatchingFishViewModelFAB(CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit) {
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishStripeAPIJUnit.CatchingFishWorkManager;
        if (catchingFishStripeAPIJUnit2 == null) {
            return null;
        }
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = catchingFishStripeAPIJUnit2.CatchingFishReduxKtor;
        int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket);
        if (CatchingFishParcelableFlux == 1) {
            return catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishViewModelFAB;
        }
        if (CatchingFishParcelableFlux == 2) {
            return catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishViewModelFAB;
        }
        if (CatchingFishParcelableFlux == 3) {
            return catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishLayout;
        }
        if (CatchingFishParcelableFlux == 4) {
            return catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishLayout;
        }
        if (CatchingFishParcelableFlux != 5) {
            return null;
        }
        return catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging;
    }

    public abstract boolean CatchingFishCloudMessaging();

    public final void CatchingFishCoroutine(CatchingFishUnitTestingMVI catchingFishUnitTestingMVI, CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2, int i, CatchingFishAndroidXKtor catchingFishAndroidXKtor) {
        catchingFishUnitTestingMVI.CatchingFishEspressoTesting.add(catchingFishUnitTestingMVI2);
        catchingFishUnitTestingMVI.CatchingFishEspressoTesting.add(this.CatchingFishDaggerWebsocket);
        catchingFishUnitTestingMVI.CatchingFishViewModelFAB = i;
        catchingFishUnitTestingMVI.CatchingFishLayout = catchingFishAndroidXKtor;
        catchingFishUnitTestingMVI2.CatchingFishCloudMessaging.add(catchingFishUnitTestingMVI);
        catchingFishAndroidXKtor.CatchingFishCloudMessaging.add(catchingFishUnitTestingMVI);
    }

    public abstract void CatchingFishDaggerWebsocket();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.CatchingFishParcelableFAB == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishEspressoTesting(CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit, CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2, int i) {
        CatchingFishUnitTestingMVI CatchingFishViewModelFAB = CatchingFishViewModelFAB(catchingFishStripeAPIJUnit);
        CatchingFishUnitTestingMVI CatchingFishViewModelFAB2 = CatchingFishViewModelFAB(catchingFishStripeAPIJUnit2);
        if (CatchingFishViewModelFAB.CatchingFishFragmentHandler && CatchingFishViewModelFAB2.CatchingFishFragmentHandler) {
            int CatchingFishDaggerWebsocket = catchingFishStripeAPIJUnit.CatchingFishDaggerWebsocket() + CatchingFishViewModelFAB.CatchingFishViewModelScope;
            int CatchingFishDaggerWebsocket2 = CatchingFishViewModelFAB2.CatchingFishViewModelScope - catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket();
            int i2 = CatchingFishDaggerWebsocket2 - CatchingFishDaggerWebsocket;
            CatchingFishAndroidXKtor catchingFishAndroidXKtor = this.CatchingFishDaggerWebsocket;
            if (!catchingFishAndroidXKtor.CatchingFishFragmentHandler && this.CatchingFishReduxKtor == 3) {
                int i3 = this.CatchingFishParcelableFAB;
                if (i3 == 0) {
                    catchingFishAndroidXKtor.CatchingFishReduxKtor(CatchingFishViewModelScope(i2, i));
                } else if (i3 == 1) {
                    catchingFishAndroidXKtor.CatchingFishReduxKtor(Math.min(CatchingFishViewModelScope(catchingFishAndroidXKtor.CatchingFishOkHttp, i), i2));
                } else if (i3 == 2) {
                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = this.CatchingFishSnackbar;
                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = catchingFishDaggerRetrofit.CatchingFishAppCompat;
                    if (catchingFishDaggerRetrofit2 != null) {
                        if ((i == 0 ? catchingFishDaggerRetrofit2.CatchingFishReduxKtor : catchingFishDaggerRetrofit2.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket.CatchingFishFragmentHandler) {
                            catchingFishAndroidXKtor.CatchingFishReduxKtor(CatchingFishViewModelScope((int) ((r6.CatchingFishViewModelScope * (i == 0 ? catchingFishDaggerRetrofit.CatchingFishSpannableWidget : catchingFishDaggerRetrofit.CatchingFishCardViewRealm)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit3 = this.CatchingFishSnackbar;
                    CatchingFishDataStorePayPal catchingFishDataStorePayPal = catchingFishDaggerRetrofit3.CatchingFishReduxKtor;
                    if (catchingFishDataStorePayPal.CatchingFishReduxKtor == 3 && catchingFishDataStorePayPal.CatchingFishParcelableFAB == 3) {
                        CatchingFishMVPCardView catchingFishMVPCardView = catchingFishDaggerRetrofit3.CatchingFishDaggerWebsocket;
                        if (catchingFishMVPCardView.CatchingFishReduxKtor == 3) {
                        }
                    }
                    if (i == 0) {
                        catchingFishDataStorePayPal = catchingFishDaggerRetrofit3.CatchingFishDaggerWebsocket;
                    }
                    if (catchingFishDataStorePayPal.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler) {
                        float f = catchingFishDaggerRetrofit3.CatchingFishJUnitRealm;
                        catchingFishAndroidXKtor.CatchingFishReduxKtor(i == 1 ? (int) ((r6.CatchingFishViewModelScope / f) + 0.5f) : (int) ((f * r6.CatchingFishViewModelScope) + 0.5f));
                    }
                }
            }
            if (catchingFishAndroidXKtor.CatchingFishFragmentHandler) {
                int i4 = catchingFishAndroidXKtor.CatchingFishViewModelScope;
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI = this.CatchingFishLayout;
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2 = this.CatchingFishViewModelFAB;
                if (i4 == i2) {
                    catchingFishUnitTestingMVI2.CatchingFishReduxKtor(CatchingFishDaggerWebsocket);
                    catchingFishUnitTestingMVI.CatchingFishReduxKtor(CatchingFishDaggerWebsocket2);
                    return;
                }
                float f2 = i == 0 ? this.CatchingFishSnackbar.CatchingFishRedux : this.CatchingFishSnackbar.CatchingFishCustomViewJUnit;
                if (CatchingFishViewModelFAB == CatchingFishViewModelFAB2) {
                    CatchingFishDaggerWebsocket = CatchingFishViewModelFAB.CatchingFishViewModelScope;
                    CatchingFishDaggerWebsocket2 = CatchingFishViewModelFAB2.CatchingFishViewModelScope;
                    f2 = 0.5f;
                }
                catchingFishUnitTestingMVI2.CatchingFishReduxKtor((int) ((((CatchingFishDaggerWebsocket2 - CatchingFishDaggerWebsocket) - i4) * f2) + CatchingFishDaggerWebsocket + 0.5f));
                catchingFishUnitTestingMVI.CatchingFishReduxKtor(catchingFishUnitTestingMVI2.CatchingFishViewModelScope + catchingFishAndroidXKtor.CatchingFishViewModelScope);
            }
        }
    }

    public long CatchingFishFragmentHandler() {
        if (this.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler) {
            return r0.CatchingFishViewModelScope;
        }
        return 0L;
    }

    public abstract void CatchingFishReduxKtor();

    public final int CatchingFishViewModelScope(int i, int i2) {
        if (i2 == 0) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = this.CatchingFishSnackbar;
            int i3 = catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB;
            int max = Math.max(catchingFishDaggerRetrofit.CatchingFishCoroutineFlow, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = this.CatchingFishSnackbar;
            int i4 = catchingFishDaggerRetrofit2.CatchingFishGsonAppCompat;
            int max2 = Math.max(catchingFishDaggerRetrofit2.CatchingFishParcelableFlux, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public abstract void CatchingFishWorkManager();
}
