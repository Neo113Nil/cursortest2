package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideLiveData implements CatchingFishMVPViewService, CatchingFishToastLayout {
    public final CatchingFishManifestMockk CatchingFishDaggerWebsocket;
    public final CatchingFishToolbarToast CatchingFishReduxKtor;

    public CatchingFishGlideLiveData(CatchingFishToolbarToast catchingFishToolbarToast, CatchingFishManifestMockk catchingFishManifestMockk) {
        CatchingFishRoomViewGson catchingFishRoomViewGson;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishManifestMockk, "coroutineContext");
        this.CatchingFishReduxKtor = catchingFishToolbarToast;
        this.CatchingFishDaggerWebsocket = catchingFishManifestMockk;
        if (catchingFishToolbarToast.CatchingFishReduxKtor != CatchingFishMockkFirebase.CatchingFishReduxKtor || (catchingFishRoomViewGson = (CatchingFishRoomViewGson) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout)) == null) {
            return;
        }
        catchingFishRoomViewGson.CatchingFishCoroutine(null);
    }

    @Override // kotlin.text.CatchingFishToastLayout
    public final CatchingFishManifestMockk CatchingFishParcelableFAB() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast.CatchingFishReduxKtor.compareTo(CatchingFishMockkFirebase.CatchingFishReduxKtor) <= 0) {
            catchingFishToolbarToast.CatchingFishWorkManager(this);
            CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) this.CatchingFishDaggerWebsocket.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
            if (catchingFishRoomViewGson != null) {
                catchingFishRoomViewGson.CatchingFishCoroutine(null);
            }
        }
    }
}
