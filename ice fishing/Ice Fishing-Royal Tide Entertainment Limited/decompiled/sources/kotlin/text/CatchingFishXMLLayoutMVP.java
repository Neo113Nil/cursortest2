package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishXMLLayoutMVP implements CatchingFishMockkView {
    public final /* synthetic */ boolean CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 1;
    public final /* synthetic */ int CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishMockkView CatchingFishWorkManager;

    public /* synthetic */ CatchingFishXMLLayoutMVP(int i, CatchingFishMockkView catchingFishMockkView, boolean z) {
        this.CatchingFishDaggerWebsocket = z;
        this.CatchingFishWorkManager = catchingFishMockkView;
        this.CatchingFishViewModelScope = i;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) obj;
        Integer num = (Integer) obj2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                num.getClass();
                CatchingFishFirebaseDagger.CatchingFishViewModelScope(this.CatchingFishViewModelScope, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, catchingFishSharedFlowMVI, CatchingFishDaggerBiometric.CatchingFishRecyclerView(1));
                break;
            default:
                num.intValue();
                CatchingFishFirebaseDagger.CatchingFishFragmentHandler(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, catchingFishSharedFlowMVI, CatchingFishDaggerBiometric.CatchingFishRecyclerView(this.CatchingFishViewModelScope | 1));
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public /* synthetic */ CatchingFishXMLLayoutMVP(int i, boolean z, CatchingFishMockkView catchingFishMockkView, int i2) {
        this.CatchingFishViewModelScope = i;
        this.CatchingFishDaggerWebsocket = z;
        this.CatchingFishWorkManager = catchingFishMockkView;
    }
}
