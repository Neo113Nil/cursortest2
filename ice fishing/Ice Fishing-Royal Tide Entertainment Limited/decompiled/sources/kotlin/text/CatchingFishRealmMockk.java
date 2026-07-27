package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRealmMockk extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ CatchingFishPicassoMVI CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRealmMockk(CatchingFishPicassoMVI catchingFishPicassoMVI, int i, int i2) {
        super(1);
        this.CatchingFishDaggerWebsocket = catchingFishPicassoMVI;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = i2;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishEspressoViewFAB.CatchingFishCloudMessaging((CatchingFishEspressoViewFAB) obj, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
