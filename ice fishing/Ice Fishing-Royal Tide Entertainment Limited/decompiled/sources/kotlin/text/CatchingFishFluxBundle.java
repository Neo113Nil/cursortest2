package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFluxBundle implements IRunActivityHandler {
    public final /* synthetic */ String CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ String CatchingFishSnackbar;

    public /* synthetic */ CatchingFishFluxBundle(String str, String str2, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = str;
        this.CatchingFishCoroutine = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.addGlobalCallbackParameterI(this.CatchingFishSnackbar, this.CatchingFishCoroutine);
                break;
            default:
                activityHandler.addGlobalPartnerParameterI(this.CatchingFishSnackbar, this.CatchingFishCoroutine);
                break;
        }
    }
}
