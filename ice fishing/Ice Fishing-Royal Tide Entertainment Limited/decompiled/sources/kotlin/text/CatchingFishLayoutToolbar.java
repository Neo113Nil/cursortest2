package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishLayoutToolbar extends CatchingFishViewWebsocket implements CatchingFishMockkView {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishIntentAnimation CatchingFishViewModelFAB;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishLayoutToolbar(Object obj, Object obj2, CatchingFishIntentAnimation catchingFishIntentAnimation, int i, int i2) {
        super(2);
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishViewModelScope = obj2;
        this.CatchingFishViewModelFAB = catchingFishIntentAnimation;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) obj;
                int intValue = ((Number) obj2).intValue();
                if (catchingFishSharedFlowMVI.CatchingFishDagger(intValue & 1, (intValue & 3) != 2)) {
                    CatchingFishGradleLiveData.CatchingFishParcelableFAB((CatchingFishGradleCameraX) this.CatchingFishWorkManager, (CatchingFishCustomViewHilt) this.CatchingFishViewModelScope, (CatchingFishMockkView) this.CatchingFishViewModelFAB, catchingFishSharedFlowMVI, 0);
                } else {
                    catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.CatchingFishPagingLibrary.CatchingFishParcelableFAB((CatchingFishServiceHandler) this.CatchingFishWorkManager, (CatchingFishBundleAnimation) this.CatchingFishViewModelScope, (CatchingFishServiceHandler) this.CatchingFishViewModelFAB, (CatchingFishSharedFlowMVI) obj, CatchingFishDaggerBiometric.CatchingFishRecyclerView(1));
                break;
            default:
                ((Number) obj2).intValue();
                CatchingFishGradleLiveData.CatchingFishParcelableFAB((CatchingFishAdMobJUnit) this.CatchingFishWorkManager, (CatchingFishCustomViewHilt) this.CatchingFishViewModelScope, (CatchingFishMockkView) this.CatchingFishViewModelFAB, (CatchingFishSharedFlowMVI) obj, CatchingFishDaggerBiometric.CatchingFishRecyclerView(1));
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishLayoutToolbar(CatchingFishGradleCameraX catchingFishGradleCameraX, CatchingFishCustomViewHilt catchingFishCustomViewHilt, CatchingFishMockkView catchingFishMockkView) {
        super(2);
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishWorkManager = catchingFishGradleCameraX;
        this.CatchingFishViewModelScope = catchingFishCustomViewHilt;
        this.CatchingFishViewModelFAB = catchingFishMockkView;
    }
}
