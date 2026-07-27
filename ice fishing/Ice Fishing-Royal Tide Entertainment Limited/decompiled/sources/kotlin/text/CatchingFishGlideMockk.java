package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideMockk extends CatchingFishOkHttpStripeAPI {
    public final CatchingFishOkHttpStripeAPI CatchingFishDaggerWebsocket;
    public final long CatchingFishLayout;
    public CatchingFishServiceHandler CatchingFishViewModelFAB;
    public final boolean CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGlideMockk(CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI, CatchingFishServiceHandler catchingFishServiceHandler, boolean z, boolean z2) {
        super(0L, CatchingFishReduxSpannable.CatchingFishViewModelFAB);
        CatchingFishServiceHandler CatchingFishDaggerWebsocket;
        CatchingFishPayPalOkHttp catchingFishPayPalOkHttp = CatchingFishIntentBundle.CatchingFishParcelableFAB;
        this.CatchingFishDaggerWebsocket = catchingFishOkHttpStripeAPI;
        this.CatchingFishWorkManager = z;
        this.CatchingFishViewModelScope = z2;
        this.CatchingFishViewModelFAB = CatchingFishIntentBundle.CatchingFishEspressoTesting(catchingFishServiceHandler, (catchingFishOkHttpStripeAPI == null || (CatchingFishDaggerWebsocket = catchingFishOkHttpStripeAPI.CatchingFishDaggerWebsocket()) == null) ? CatchingFishIntentBundle.CatchingFishFragmentHandler.CatchingFishDaggerWebsocket : CatchingFishDaggerWebsocket, z);
        this.CatchingFishLayout = CatchingFishOkHttpFAB.CatchingFishRoomDatabase();
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishCloudMessaging() {
        CatchingFishHiltMVPToast.CatchingFishParcelable();
        throw null;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishCoroutine() {
        CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI;
        this.CatchingFishCoroutine = true;
        if (!this.CatchingFishViewModelScope || (catchingFishOkHttpStripeAPI = this.CatchingFishDaggerWebsocket) == null) {
            return;
        }
        catchingFishOkHttpStripeAPI.CatchingFishCoroutine();
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishOkHttpStripeAPI CatchingFishCoroutineFlow(CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishServiceHandler CatchingFishEspressoTesting = CatchingFishIntentBundle.CatchingFishEspressoTesting(catchingFishServiceHandler, this.CatchingFishViewModelFAB, true);
        return !this.CatchingFishWorkManager ? CatchingFishIntentBundle.CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB().CatchingFishCoroutineFlow(null), CatchingFishEspressoTesting, true) : CatchingFishDaggerHiltFAB().CatchingFishCoroutineFlow(CatchingFishEspressoTesting);
    }

    public final CatchingFishOkHttpStripeAPI CatchingFishDaggerHiltFAB() {
        CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI = this.CatchingFishDaggerWebsocket;
        return catchingFishOkHttpStripeAPI == null ? CatchingFishIntentBundle.CatchingFishFragmentHandler : catchingFishOkHttpStripeAPI;
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishServiceHandler CatchingFishDaggerWebsocket() {
        return this.CatchingFishViewModelFAB;
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
    public final void CatchingFishOkHttp() {
        CatchingFishDaggerHiltFAB().CatchingFishOkHttp();
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final CatchingFishReduxSpannable CatchingFishReduxKtor() {
        return CatchingFishDaggerHiltFAB().CatchingFishReduxKtor();
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final void CatchingFishUnitTesting(CatchingFishJUnitViewPager catchingFishJUnitViewPager) {
        CatchingFishDaggerHiltFAB().CatchingFishUnitTesting(catchingFishJUnitViewPager);
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final long CatchingFishViewModelScope() {
        return CatchingFishDaggerHiltFAB().CatchingFishViewModelScope();
    }

    @Override // kotlin.text.CatchingFishOkHttpStripeAPI
    public final boolean CatchingFishWorkManager() {
        return CatchingFishDaggerHiltFAB().CatchingFishWorkManager();
    }
}
