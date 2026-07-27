package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishPicassoGradle extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ CatchingFishPicassoMVI CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishPicassoGradle(CatchingFishPicassoMVI catchingFishPicassoMVI, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = catchingFishPicassoMVI;
        this.CatchingFishWorkManager = i;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishEspressoViewFAB.CatchingFishCloudMessaging((CatchingFishEspressoViewFAB) obj, this.CatchingFishDaggerWebsocket, 0, -this.CatchingFishWorkManager);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
