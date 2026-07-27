package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishManifestGraphQL extends CatchingFishViewWebsocket implements CatchingFishJobSchedulerMVP {
    public final /* synthetic */ CatchingFishHiltViewOkHttp CatchingFishDaggerWebsocket;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishManifestGraphQL(CatchingFishHiltViewOkHttp catchingFishHiltViewOkHttp) {
        super(3);
        this.CatchingFishDaggerWebsocket = catchingFishHiltViewOkHttp;
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) obj2;
        ((Number) obj3).intValue();
        catchingFishSharedFlowMVI.CatchingFishParcelable(-1415685722);
        CatchingFishHiltViewOkHttp catchingFishHiltViewOkHttp = this.CatchingFishDaggerWebsocket;
        boolean CatchingFishDaggerWebsocket = catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(catchingFishHiltViewOkHttp);
        Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
        if (CatchingFishDaggerWebsocket || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
            CatchingFishPayPalService = new CatchingFishGlideExoPlayer(catchingFishHiltViewOkHttp);
            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
        }
        CatchingFishGlideExoPlayer catchingFishGlideExoPlayer = (CatchingFishGlideExoPlayer) CatchingFishPayPalService;
        catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        return catchingFishGlideExoPlayer;
    }
}
