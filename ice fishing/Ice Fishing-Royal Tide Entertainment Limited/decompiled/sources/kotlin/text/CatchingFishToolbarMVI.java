package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToolbarMVI extends CatchingFishOkHttpStripeAPI {
    public final CatchingFishServiceHandler CatchingFishDaggerWebsocket;
    public final CatchingFishOkHttpStripeAPI CatchingFishWorkManager;

    public CatchingFishToolbarMVI(long j, CatchingFishReduxSpannable catchingFishReduxSpannable, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI) {
        super(j, catchingFishReduxSpannable);
        this.CatchingFishDaggerWebsocket = catchingFishServiceHandler;
        this.CatchingFishWorkManager = catchingFishOkHttpStripeAPI;
        catchingFishOkHttpStripeAPI.CatchingFishCloudMessaging();
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishCloudMessaging() {
        CatchingFishHiltMVPToast.CatchingFishParcelable();
        throw null;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishCoroutine() {
        CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI = this.CatchingFishWorkManager;
        if (this.CatchingFishCoroutine) {
            return;
        }
        if (this.CatchingFishSnackbar != catchingFishOkHttpStripeAPI.CatchingFishViewModelScope()) {
            CatchingFishParcelableFAB();
        }
        catchingFishOkHttpStripeAPI.CatchingFishEspressoTesting();
        this.CatchingFishCoroutine = true;
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            CatchingFishAnimationMockk();
        }
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishOkHttpStripeAPI CatchingFishCoroutineFlow(CatchingFishServiceHandler catchingFishServiceHandler) {
        return new CatchingFishToolbarMVI(this.CatchingFishSnackbar, this.CatchingFishParcelableFAB, CatchingFishIntentBundle.CatchingFishEspressoTesting(catchingFishServiceHandler, this.CatchingFishDaggerWebsocket, true), this.CatchingFishWorkManager);
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishServiceHandler CatchingFishDaggerWebsocket() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishEspressoTesting() {
        CatchingFishHiltMVPToast.CatchingFishParcelable();
        throw null;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishServiceHandler CatchingFishLayout() {
        return null;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishUnitTesting(CatchingFishJUnitViewPager catchingFishJUnitViewPager) {
        CatchingFishPayPalOkHttp catchingFishPayPalOkHttp = CatchingFishIntentBundle.CatchingFishParcelableFAB;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final boolean CatchingFishWorkManager() {
        return true;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishOkHttp() {
    }
}
