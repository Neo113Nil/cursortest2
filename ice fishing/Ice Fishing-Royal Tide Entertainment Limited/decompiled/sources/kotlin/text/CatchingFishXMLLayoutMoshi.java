package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutMoshi extends CatchingFishViewWebsocket implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishLiveDataKtor CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishLayout;
    public final /* synthetic */ CatchingFishLifecycleRedux CatchingFishViewModelFAB;
    public final /* synthetic */ CatchingFishBiometricGson CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishRealmHandler CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishXMLLayoutMoshi(CatchingFishLiveDataKtor catchingFishLiveDataKtor, CatchingFishRealmHandler catchingFishRealmHandler, CatchingFishBiometricGson catchingFishBiometricGson, CatchingFishLifecycleRedux catchingFishLifecycleRedux, int i) {
        super(2);
        this.CatchingFishDaggerWebsocket = catchingFishLiveDataKtor;
        this.CatchingFishWorkManager = catchingFishRealmHandler;
        this.CatchingFishViewModelScope = catchingFishBiometricGson;
        this.CatchingFishViewModelFAB = catchingFishLifecycleRedux;
        this.CatchingFishLayout = i;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CatchingFishFragmentKtor.CatchingFishParcelableFAB(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope, this.CatchingFishViewModelFAB, (CatchingFishSharedFlowMVI) obj, CatchingFishDaggerBiometric.CatchingFishRecyclerView(this.CatchingFishLayout | 1));
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
