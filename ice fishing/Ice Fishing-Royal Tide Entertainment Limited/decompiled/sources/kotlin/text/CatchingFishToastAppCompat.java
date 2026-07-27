package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastAppCompat extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ Float CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishPayPalWidget CatchingFishViewModelFAB;
    public final /* synthetic */ Float CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishHiltFlux CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishToastAppCompat(Float f, CatchingFishHiltFlux catchingFishHiltFlux, Float f2, CatchingFishPayPalWidget catchingFishPayPalWidget) {
        super(0);
        this.CatchingFishDaggerWebsocket = f;
        this.CatchingFishWorkManager = catchingFishHiltFlux;
        this.CatchingFishViewModelScope = f2;
        this.CatchingFishViewModelFAB = catchingFishPayPalWidget;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        CatchingFishHiltFlux catchingFishHiltFlux = this.CatchingFishWorkManager;
        Float f = catchingFishHiltFlux.CatchingFishReduxKtor;
        Float f2 = this.CatchingFishDaggerWebsocket;
        boolean equals = f2.equals(f);
        Float f3 = this.CatchingFishViewModelScope;
        if (!equals || !f3.equals(catchingFishHiltFlux.CatchingFishDaggerWebsocket)) {
            catchingFishHiltFlux.CatchingFishReduxKtor = f2;
            catchingFishHiltFlux.CatchingFishDaggerWebsocket = f3;
            catchingFishHiltFlux.CatchingFishViewModelScope = new CatchingFishAdMobNavigation(this.CatchingFishViewModelFAB, f2, f3);
            catchingFishHiltFlux.CatchingFishCloudMessaging.CatchingFishSnackbar.setValue(Boolean.TRUE);
            catchingFishHiltFlux.CatchingFishViewModelFAB = false;
            catchingFishHiltFlux.CatchingFishLayout = true;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
