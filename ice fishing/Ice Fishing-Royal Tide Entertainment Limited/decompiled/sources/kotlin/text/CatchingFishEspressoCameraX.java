package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishEspressoCameraX extends CatchingFishFABStripeAPIFAB implements CatchingFishMVIAndroidX {
    public float CatchingFish;
    public int CatchingFishNavigation;

    @Override // kotlin.text.CatchingFishMVIAndroidX
    public final CatchingFishSharedFlowMVP CatchingFishDaggerWebsocket(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishWidgetDagger catchingFishWidgetDagger, long j) {
        int CatchingFishLayout;
        int CatchingFishViewModelScope;
        int CatchingFishWorkManager;
        int i;
        if (!CatchingFishGradleGraphQL.CatchingFishCoroutine(j) || this.CatchingFishNavigation == 1) {
            CatchingFishLayout = CatchingFishGradleGraphQL.CatchingFishLayout(j);
            CatchingFishViewModelScope = CatchingFishGradleGraphQL.CatchingFishViewModelScope(j);
        } else {
            CatchingFishLayout = CatchingFishOkHttpFAB.CatchingFishLayout(Math.round(CatchingFishGradleGraphQL.CatchingFishViewModelScope(j) * this.CatchingFish), CatchingFishGradleGraphQL.CatchingFishLayout(j), CatchingFishGradleGraphQL.CatchingFishViewModelScope(j));
            CatchingFishViewModelScope = CatchingFishLayout;
        }
        if (!CatchingFishGradleGraphQL.CatchingFishSnackbar(j) || this.CatchingFishNavigation == 2) {
            int CatchingFishViewModelFAB = CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j);
            CatchingFishWorkManager = CatchingFishGradleGraphQL.CatchingFishWorkManager(j);
            i = CatchingFishViewModelFAB;
        } else {
            i = CatchingFishOkHttpFAB.CatchingFishLayout(Math.round(CatchingFishGradleGraphQL.CatchingFishWorkManager(j) * this.CatchingFish), CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j), CatchingFishGradleGraphQL.CatchingFishWorkManager(j));
            CatchingFishWorkManager = i;
        }
        CatchingFishPicassoMVI CatchingFishSnackbar = catchingFishWidgetDagger.CatchingFishSnackbar(CatchingFishAsyncTaskGradle.CatchingFishParcelableFAB(CatchingFishLayout, CatchingFishViewModelScope, i, CatchingFishWorkManager));
        return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishSnackbar.CatchingFishReduxKtor, CatchingFishSnackbar.CatchingFishDaggerWebsocket, new CatchingFishFABAppCompat(CatchingFishSnackbar, 0));
    }
}
