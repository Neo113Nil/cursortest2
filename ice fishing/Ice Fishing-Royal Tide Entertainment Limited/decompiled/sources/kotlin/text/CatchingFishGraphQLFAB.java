package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLFAB extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishFragmentHandler;
    public final /* synthetic */ long CatchingFishLayout;
    public final /* synthetic */ long CatchingFishViewModelFAB;
    public final /* synthetic */ CatchingFishJUnitGlide CatchingFishViewModelScope;
    public final /* synthetic */ float CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGraphQLFAB(int i, float f, CatchingFishJUnitGlide catchingFishJUnitGlide, long j, long j2, CatchingFishServiceHandler catchingFishServiceHandler) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = f;
        this.CatchingFishViewModelScope = catchingFishJUnitGlide;
        this.CatchingFishViewModelFAB = j;
        this.CatchingFishLayout = j2;
        this.CatchingFishFragmentHandler = catchingFishServiceHandler;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishPicassoManifest catchingFishPicassoManifest = (CatchingFishPicassoManifest) obj;
        float CatchingFishSnackbar = CatchingFishMVPCameraX.CatchingFishSnackbar(catchingFishPicassoManifest.CatchingFishNavigation());
        int i = this.CatchingFishDaggerWebsocket;
        float f = this.CatchingFishWorkManager;
        if (i != 0 && CatchingFishMVPCameraX.CatchingFishSnackbar(catchingFishPicassoManifest.CatchingFishNavigation()) <= CatchingFishMVPCameraX.CatchingFishCoroutine(catchingFishPicassoManifest.CatchingFishNavigation())) {
            f += catchingFishPicassoManifest.CatchingFishHandler(CatchingFishSnackbar);
        }
        float CatchingFishHandler = f / catchingFishPicassoManifest.CatchingFishHandler(CatchingFishMVPCameraX.CatchingFishCoroutine(catchingFishPicassoManifest.CatchingFishNavigation()));
        float floatValue = ((Number) this.CatchingFishViewModelScope.CatchingFishParcelableFAB()).floatValue();
        float min = Math.min(floatValue, CatchingFishHandler) + floatValue;
        if (min <= 1.0f) {
            CatchingFishToolbarJUnit.CatchingFishSnackbar(catchingFishPicassoManifest, min, 1.0f, this.CatchingFishViewModelFAB, CatchingFishSnackbar, this.CatchingFishDaggerWebsocket);
        }
        CatchingFishToolbarJUnit.CatchingFishSnackbar(catchingFishPicassoManifest, 0.0f, floatValue, this.CatchingFishLayout, CatchingFishSnackbar, this.CatchingFishDaggerWebsocket);
        this.CatchingFishFragmentHandler.CatchingFishFragmentHandler(catchingFishPicassoManifest);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
