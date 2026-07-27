package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABWebSocket implements CatchingFishLiveDataHandler {
    public static final CatchingFishAsyncTaskWidget CatchingFishCoroutine = new CatchingFishAsyncTaskWidget(0);
    public static final CatchingFishCardViewPicasso CatchingFishReduxKtor = new CatchingFishCardViewPicasso(6);
    public CatchingFishAsyncTaskWidget CatchingFishParcelableFAB;
    public volatile CatchingFishLiveDataHandler CatchingFishSnackbar;

    public CatchingFishFABWebSocket(CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget, CatchingFishLiveDataHandler catchingFishLiveDataHandler) {
        this.CatchingFishParcelableFAB = catchingFishAsyncTaskWidget;
        this.CatchingFishSnackbar = catchingFishLiveDataHandler;
    }

    @Override // kotlin.text.CatchingFishLiveDataHandler
    public final Object get() {
        return this.CatchingFishSnackbar.get();
    }
}
