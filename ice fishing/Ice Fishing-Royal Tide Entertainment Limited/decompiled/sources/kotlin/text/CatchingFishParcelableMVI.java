package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishParcelableMVI extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ CatchingFishWidgetXMLLayout CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishSnackbarToolbar CatchingFishViewModelFAB;
    public final /* synthetic */ long CatchingFishViewModelScope;
    public final /* synthetic */ long CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishParcelableMVI(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, long j, long j2, CatchingFishSnackbarToolbar catchingFishSnackbarToolbar) {
        super(0);
        this.CatchingFishDaggerWebsocket = catchingFishWidgetXMLLayout;
        this.CatchingFishWorkManager = j;
        this.CatchingFishViewModelScope = j2;
        this.CatchingFishViewModelFAB = catchingFishSnackbarToolbar;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout = this.CatchingFishDaggerWebsocket;
        catchingFishWidgetXMLLayout.CatchingFishDaggerMVVM().CatchingFishReduxKtor = false;
        catchingFishWidgetXMLLayout.CatchingFishDaggerMVVM().CatchingFishDaggerWebsocket = this.CatchingFishWorkManager;
        catchingFishWidgetXMLLayout.CatchingFishDaggerMVVM().CatchingFishWorkManager = this.CatchingFishViewModelScope;
        CatchingFishServiceHandler CatchingFishCoroutine = this.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishCoroutine();
        if (CatchingFishCoroutine != null) {
            CatchingFishCoroutine.CatchingFishFragmentHandler(catchingFishWidgetXMLLayout.CatchingFishDaggerMVVM());
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
