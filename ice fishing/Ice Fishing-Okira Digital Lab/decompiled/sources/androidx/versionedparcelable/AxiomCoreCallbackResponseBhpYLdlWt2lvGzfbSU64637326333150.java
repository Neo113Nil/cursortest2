package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class AxiomCoreCallbackResponseBhpYLdlWt2lvGzfbSU64637326333150 implements Runnable {
    public final /* synthetic */ ActivityHandler LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ AdjustEvent YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ AxiomCoreCallbackResponseBhpYLdlWt2lvGzfbSU64637326333150(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityHandler;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = adjustEvent;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        AdjustEvent adjustEvent = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        ActivityHandler activityHandler = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$verifyAndTrackPlayStorePurchase$46(adjustEvent, onPurchaseVerificationFinishedListener);
                break;
            default:
                activityHandler.lambda$verifyAndTrackPlayStorePurchase$47(adjustEvent, onPurchaseVerificationFinishedListener);
                break;
        }
    }
}
