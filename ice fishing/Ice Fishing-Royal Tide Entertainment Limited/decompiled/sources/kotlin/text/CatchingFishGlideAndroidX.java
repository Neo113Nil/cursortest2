package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGlideAndroidX implements CatchingFishMockkView {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    public /* synthetic */ CatchingFishGlideAndroidX(int i, int i2, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishViewModelScope = obj2;
        this.CatchingFishWorkManager = i;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).intValue();
                int CatchingFishRecyclerView = CatchingFishDaggerBiometric.CatchingFishRecyclerView(this.CatchingFishWorkManager) | 1;
                ((CatchingFishLifecycleRedux) this.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(this.CatchingFishViewModelScope, (CatchingFishSharedFlowMVI) obj, CatchingFishRecyclerView);
                break;
            case 1:
                ((Integer) obj2).getClass();
                CatchingFishAdMobFAB.CatchingFishSnackbar((CatchingFishServiceGraphQL) this.CatchingFishViewModelScope, (CatchingFishLifecycleRedux) this.CatchingFishDaggerWebsocket, (CatchingFishSharedFlowMVI) obj, CatchingFishDaggerBiometric.CatchingFishRecyclerView(this.CatchingFishWorkManager | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                CatchingFishAdMobFAB.CatchingFishCoroutine((CatchingFishServiceGraphQL[]) this.CatchingFishDaggerWebsocket, (CatchingFishMockkView) this.CatchingFishViewModelScope, (CatchingFishSharedFlowMVI) obj, CatchingFishDaggerBiometric.CatchingFishRecyclerView(this.CatchingFishWorkManager | 1));
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public /* synthetic */ CatchingFishGlideAndroidX(CatchingFishServiceGraphQL catchingFishServiceGraphQL, CatchingFishLifecycleRedux catchingFishLifecycleRedux, int i) {
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishViewModelScope = catchingFishServiceGraphQL;
        this.CatchingFishDaggerWebsocket = catchingFishLifecycleRedux;
        this.CatchingFishWorkManager = i;
    }
}
