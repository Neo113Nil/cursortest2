package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAdMobFABPayPal extends CatchingFishOkHttpStripeAPI {
    public final CatchingFishServiceHandler CatchingFishDaggerWebsocket;
    public int CatchingFishWorkManager;

    public CatchingFishAdMobFABPayPal(long j, CatchingFishReduxSpannable catchingFishReduxSpannable, CatchingFishServiceHandler catchingFishServiceHandler) {
        super(j, catchingFishReduxSpannable);
        this.CatchingFishDaggerWebsocket = catchingFishServiceHandler;
        this.CatchingFishWorkManager = 1;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishCloudMessaging() {
        this.CatchingFishWorkManager++;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishCoroutine() {
        if (this.CatchingFishCoroutine) {
            return;
        }
        CatchingFishEspressoTesting();
        this.CatchingFishCoroutine = true;
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            CatchingFishAnimationMockk();
        }
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishOkHttpStripeAPI CatchingFishCoroutineFlow(CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishIntentBundle.CatchingFishReduxKtor(this);
        return new CatchingFishToolbarMVI(this.CatchingFishSnackbar, this.CatchingFishParcelableFAB, CatchingFishIntentBundle.CatchingFishEspressoTesting(catchingFishServiceHandler, this.CatchingFishDaggerWebsocket, true), this);
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishServiceHandler CatchingFishDaggerWebsocket() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishEspressoTesting() {
        int i = this.CatchingFishWorkManager - 1;
        this.CatchingFishWorkManager = i;
        if (i == 0) {
            CatchingFishParcelableFAB();
        }
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
