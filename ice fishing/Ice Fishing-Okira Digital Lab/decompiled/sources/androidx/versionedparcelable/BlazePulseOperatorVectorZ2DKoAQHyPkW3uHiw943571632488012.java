package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustDeeplink;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class BlazePulseOperatorVectorZ2DKoAQHyPkW3uHiw943571632488012 implements Runnable {
    public final /* synthetic */ ActivityHandler LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ long TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ AdjustDeeplink YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ BlazePulseOperatorVectorZ2DKoAQHyPkW3uHiw943571632488012(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityHandler;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = adjustDeeplink;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        long j = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        AdjustDeeplink adjustDeeplink = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        ActivityHandler activityHandler = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$processDeeplink$13(adjustDeeplink, j);
                break;
            case 1:
                activityHandler.lambda$processDeeplink$12(adjustDeeplink, j);
                break;
            case 2:
                activityHandler.lambda$processAndResolveDeeplink$14(adjustDeeplink, j);
                break;
            default:
                activityHandler.lambda$processAndResolveDeeplink$15(adjustDeeplink, j);
                break;
        }
    }
}
