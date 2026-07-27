package kotlin.text;

import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitRoom implements CatchingFishHandlerHandler, CatchingFishMVPViewService {
    public final CatchingFishLayoutStripeAPI CatchingFishDaggerWebsocket;
    public final CatchingFishGradleCameraX CatchingFishReduxKtor;
    public CatchingFishMockkView CatchingFishViewModelFAB = CatchingFishAdMobViewPager.CatchingFishParcelableFAB;
    public CatchingFishToolbarToast CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishRetrofitRoom(CatchingFishGradleCameraX catchingFishGradleCameraX, CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI) {
        this.CatchingFishReduxKtor = catchingFishGradleCameraX;
        this.CatchingFishDaggerWebsocket = catchingFishLayoutStripeAPI;
    }

    public final void CatchingFishParcelableFAB() {
        if (!this.CatchingFishWorkManager) {
            this.CatchingFishWorkManager = true;
            this.CatchingFishReduxKtor.getView().setTag(R.id.wrapped_composition_tag, null);
            CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishViewModelScope;
            if (catchingFishToolbarToast != null) {
                catchingFishToolbarToast.CatchingFishWorkManager(this);
            }
        }
        CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI = this.CatchingFishDaggerWebsocket;
        synchronized (catchingFishLayoutStripeAPI.CatchingFishViewModelScope) {
            try {
                if (catchingFishLayoutStripeAPI.CatchingFishSpannableWidget.CatchingFishFragmentFactory) {
                    CatchingFishMVPAndroidXKtor.CatchingFishSnackbar("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (catchingFishLayoutStripeAPI.CatchingFishParcelableFlux != 3) {
                    catchingFishLayoutStripeAPI.CatchingFishParcelableFlux = 3;
                    CatchingFishLifecycleRedux catchingFishLifecycleRedux = CatchingFishMVIRoomDatabase.CatchingFishSnackbar;
                    CatchingFishMoshiEspresso catchingFishMoshiEspresso = catchingFishLayoutStripeAPI.CatchingFishSpannableWidget.CatchingFishDagger;
                    if (catchingFishMoshiEspresso != null) {
                        catchingFishLayoutStripeAPI.CatchingFishDaggerWebsocket(catchingFishMoshiEspresso);
                    }
                    boolean z = catchingFishLayoutStripeAPI.CatchingFishLayout.CatchingFishDaggerWebsocket > 0;
                    if (z || !catchingFishLayoutStripeAPI.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishLayoutStripeAPI.CatchingFishDaggerHiltFAB;
                        try {
                            catchingFishExoPlayerBundle.CatchingFishLayout(catchingFishLayoutStripeAPI.CatchingFishViewModelFAB, catchingFishLayoutStripeAPI.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
                            if (z) {
                                CatchingFishGoogleMapsMVP CatchingFishDaggerWebsocket = catchingFishLayoutStripeAPI.CatchingFishLayout.CatchingFishDaggerWebsocket();
                                try {
                                    CatchingFishUnitTestingFlux.CatchingFishWorkManager(CatchingFishDaggerWebsocket, catchingFishLayoutStripeAPI.CatchingFishDaggerHiltFAB);
                                    CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket(true);
                                    catchingFishLayoutStripeAPI.CatchingFishDaggerWebsocket.CatchingFishDaggerHiltFAB();
                                    catchingFishLayoutStripeAPI.CatchingFishDaggerWebsocket.CatchingFishAppCompat();
                                    catchingFishExoPlayerBundle.CatchingFishWorkManager();
                                } catch (Throwable th) {
                                    CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket(false);
                                    throw th;
                                }
                            }
                            catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        } catch (Throwable th2) {
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                            throw th2;
                        }
                    }
                    catchingFishLayoutStripeAPI.CatchingFishSpannableWidget.CatchingFishOkHttp();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        catchingFishLayoutStripeAPI.CatchingFishReduxKtor.CatchingFishRoomDatabase(catchingFishLayoutStripeAPI);
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_DESTROY) {
            CatchingFishParcelableFAB();
        } else {
            if (catchingFishToolbarLiveData != CatchingFishToolbarLiveData.ON_CREATE || this.CatchingFishWorkManager) {
                return;
            }
            CatchingFishWorkManager(this.CatchingFishViewModelFAB);
        }
    }

    public final void CatchingFishWorkManager(CatchingFishMockkView catchingFishMockkView) {
        this.CatchingFishReduxKtor.setOnViewTreeOwnersAvailable(new CatchingFishOkHttpRedux(12, this, catchingFishMockkView));
    }
}
