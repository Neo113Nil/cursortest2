package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishPicassoAdMob implements CatchingFishServiceHandler {
    public final /* synthetic */ CatchingFishHiltCoroutine CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishLayoutMVVM CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishAdMobRoom CatchingFishWorkManager;

    public CatchingFishPicassoAdMob(CatchingFishLayoutMVVM catchingFishLayoutMVVM, CatchingFishHiltCoroutine catchingFishHiltCoroutine, CatchingFishAdMobRoom catchingFishAdMobRoom) {
        this.CatchingFishReduxKtor = catchingFishLayoutMVVM;
        this.CatchingFishDaggerWebsocket = catchingFishHiltCoroutine;
        this.CatchingFishWorkManager = catchingFishAdMobRoom;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        int i;
        CatchingFishLayoutMVVM catchingFishLayoutMVVM = this.CatchingFishReduxKtor;
        catchingFishLayoutMVVM.CatchingFishParcelableFAB = null;
        catchingFishLayoutMVVM.CatchingFishSnackbar = null;
        CatchingFishRetrofitGradle catchingFishRetrofitGradle = this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope;
        int i2 = this.CatchingFishWorkManager.CatchingFishReduxKtor;
        do {
            i = catchingFishRetrofitGradle.get();
        } while (!catchingFishRetrofitGradle.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
