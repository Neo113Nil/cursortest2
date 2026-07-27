package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltFlux implements CatchingFishLayoutMoshi {
    public final /* synthetic */ CatchingFishMVPWidget CatchingFishCloudMessaging;
    public Float CatchingFishDaggerWebsocket;
    public long CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public Float CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public CatchingFishAdMobNavigation CatchingFishViewModelScope;
    public final CatchingFishAsyncTaskIntent CatchingFishWorkManager;

    public CatchingFishHiltFlux(CatchingFishMVPWidget catchingFishMVPWidget, Float f, Float f2, CatchingFishPayPalWidget catchingFishPayPalWidget) {
        this.CatchingFishCloudMessaging = catchingFishMVPWidget;
        this.CatchingFishReduxKtor = f;
        this.CatchingFishDaggerWebsocket = f2;
        this.CatchingFishWorkManager = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(f);
        this.CatchingFishViewModelScope = new CatchingFishAdMobNavigation(catchingFishPayPalWidget, this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket);
    }

    @Override // kotlin.text.CatchingFishLayoutMoshi
    public final Object getValue() {
        return this.CatchingFishWorkManager.getValue();
    }
}
