package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltWebSocket implements CatchingFishKtorCameraXView {
    public final CatchingFishMVIRoomMoshi CatchingFishParcelableFAB;
    public final CatchingFishAndroidXPayPal CatchingFishSnackbar;

    public CatchingFishHiltWebSocket(CatchingFishMVIRoomMoshi catchingFishMVIRoomMoshi, CatchingFishAndroidXPayPal catchingFishAndroidXPayPal) {
        this.CatchingFishParcelableFAB = catchingFishMVIRoomMoshi;
        this.CatchingFishSnackbar = catchingFishAndroidXPayPal;
    }

    @Override // kotlin.text.CatchingFishKtorCameraXView
    public final boolean CatchingFishParcelableFAB(CatchingFishDaggerDataStore catchingFishDaggerDataStore) {
        if (catchingFishDaggerDataStore.CatchingFishSnackbar != 4 || this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishDaggerDataStore)) {
            return false;
        }
        String str = catchingFishDaggerDataStore.CatchingFishCoroutine;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.CatchingFishSnackbar.CatchingFishParcelableFAB(new CatchingFishViewModelMVI(str, catchingFishDaggerDataStore.CatchingFishDaggerWebsocket, catchingFishDaggerDataStore.CatchingFishWorkManager));
        return true;
    }

    @Override // kotlin.text.CatchingFishKtorCameraXView
    public final boolean CatchingFishSnackbar(Exception exc) {
        this.CatchingFishSnackbar.CatchingFishSnackbar(exc);
        return true;
    }
}
