package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxMVP extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ long CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishFluxMVP(int i, long j) {
        super(1);
        this.CatchingFishDaggerWebsocket = j;
        this.CatchingFishWorkManager = i;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishPicassoManifest catchingFishPicassoManifest = (CatchingFishPicassoManifest) obj;
        float min = Math.min(catchingFishPicassoManifest.CatchingFishOkHttp(CatchingFishUnitTestingKtor.CatchingFishSnackbar), CatchingFishMVPCameraX.CatchingFishSnackbar(catchingFishPicassoManifest.CatchingFishNavigation()));
        float CatchingFishSnackbar = (CatchingFishMVPCameraX.CatchingFishSnackbar(catchingFishPicassoManifest.CatchingFishNavigation()) - min) / 2;
        long j = this.CatchingFishDaggerWebsocket;
        if (this.CatchingFishWorkManager == 1) {
            float f = min / 2.0f;
            catchingFishPicassoManifest.CatchingFishReduxKtor(j, f, CatchingFishOkHttpFAB.CatchingFishParcelableFAB((CatchingFishMVPCameraX.CatchingFishCoroutine(catchingFishPicassoManifest.CatchingFishNavigation()) - f) - CatchingFishSnackbar, CatchingFishMVPCameraX.CatchingFishSnackbar(catchingFishPicassoManifest.CatchingFishNavigation()) / 2.0f), CatchingFishContextHilt.CatchingFishCoroutineFlow);
        } else {
            CatchingFishPicassoManifest.CatchingFishViewModelScope(catchingFishPicassoManifest, j, CatchingFishOkHttpFAB.CatchingFishParcelableFAB((CatchingFishMVPCameraX.CatchingFishCoroutine(catchingFishPicassoManifest.CatchingFishNavigation()) - min) - CatchingFishSnackbar, (CatchingFishMVPCameraX.CatchingFishSnackbar(catchingFishPicassoManifest.CatchingFishNavigation()) - min) / 2.0f), (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & 4294967295L), 120);
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
