package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishDaggerMVP {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishDaggerMVP(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    public final void CatchingFishParcelableFAB() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) this.CatchingFishSnackbar;
                catchingFishSharedFlowMVI.CatchingFishCardViewRealm--;
                break;
            default:
                CatchingFishHandlerRedux catchingFishHandlerRedux = (CatchingFishHandlerRedux) this.CatchingFishSnackbar;
                catchingFishHandlerRedux.CatchingFishFragmentHandler--;
                break;
        }
    }

    public final void CatchingFishSnackbar() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishSharedFlowMVI) this.CatchingFishSnackbar).CatchingFishCardViewRealm++;
                break;
            default:
                ((CatchingFishHandlerRedux) this.CatchingFishSnackbar).CatchingFishFragmentHandler++;
                break;
        }
    }
}
