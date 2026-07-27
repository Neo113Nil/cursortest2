package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishView extends CatchingFishViewWebsocket implements CatchingFishMockkView {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishView(int i, int i2, Object obj) {
        super(2);
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = obj;
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.text.CatchingFishJobSchedulerMVP, kotlin.text.CatchingFishViewWebsocket] */
    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) obj;
                int intValue = ((Number) obj2).intValue();
                if (catchingFishSharedFlowMVI.CatchingFishDagger(intValue & 1, (intValue & 3) != 2)) {
                    ((CatchingFishSnackbar) this.CatchingFishWorkManager).CatchingFishParcelableFAB(0, catchingFishSharedFlowMVI);
                } else {
                    catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                ((Number) obj2).intValue();
                ((CatchingFishDaggerCoroutine) this.CatchingFishWorkManager).CatchingFishParcelableFAB(CatchingFishDaggerBiometric.CatchingFishRecyclerView(1), (CatchingFishSharedFlowMVI) obj);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 2:
                CatchingFishBundleAnimation catchingFishBundleAnimation = (CatchingFishBundleAnimation) obj;
                CatchingFishBundleAnimation catchingFishBundleAnimation2 = (CatchingFishJUnitLayout) obj2;
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI2 = (CatchingFishSharedFlowMVI) this.CatchingFishWorkManager;
                if (catchingFishBundleAnimation2 instanceof CatchingFishStripeAPIFAB) {
                    ?? r6 = ((CatchingFishStripeAPIFAB) catchingFishBundleAnimation2).CatchingFishParcelableFAB;
                    CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(3, r6);
                    catchingFishBundleAnimation2 = CatchingFishLayoutRoomFAB.CatchingFishPayPalService(catchingFishSharedFlowMVI2, (CatchingFishBundleAnimation) r6.CatchingFishReduxKtor(CatchingFishMoshiDagger.CatchingFishParcelableFAB, catchingFishSharedFlowMVI2, 0));
                }
                return catchingFishBundleAnimation.CatchingFishCoroutine(catchingFishBundleAnimation2);
            default:
                ((Number) obj2).intValue();
                ((CatchingFishMVPWidget) this.CatchingFishWorkManager).CatchingFishParcelableFAB(CatchingFishDaggerBiometric.CatchingFishRecyclerView(1), (CatchingFishSharedFlowMVI) obj);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishView(int i, Object obj) {
        super(2);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = obj;
    }
}
