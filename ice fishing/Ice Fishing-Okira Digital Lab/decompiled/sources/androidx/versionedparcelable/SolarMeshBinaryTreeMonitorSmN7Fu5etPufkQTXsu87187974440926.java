package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class SolarMeshBinaryTreeMonitorSmN7Fu5etPufkQTXsu87187974440926 implements Runnable {
    public final /* synthetic */ ActivityHandler LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ SolarMeshBinaryTreeMonitorSmN7Fu5etPufkQTXsu87187974440926(ActivityHandler activityHandler, boolean z, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityHandler;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        boolean z = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        ActivityHandler activityHandler = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$onActivityLifecycle$0(z);
                break;
            case 1:
                activityHandler.lambda$trackMeasurementConsent$39(z);
                break;
            case 2:
                activityHandler.lambda$setCoppaComplianceInDelay$49(z);
                break;
            case 3:
                activityHandler.lambda$setOfflineMode$7(z);
                break;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                activityHandler.lambda$setOfflineMode$8(z);
                break;
            case 5:
                activityHandler.lambda$setEnabled$6(z);
                break;
            case 6:
                activityHandler.lambda$setPlayStoreKidsComplianceInDelay$50(z);
                break;
            case 7:
                activityHandler.lambda$setEnabled$5(z);
                break;
            default:
                activityHandler.lambda$onActivityLifecycle$1(z);
                break;
        }
    }
}
