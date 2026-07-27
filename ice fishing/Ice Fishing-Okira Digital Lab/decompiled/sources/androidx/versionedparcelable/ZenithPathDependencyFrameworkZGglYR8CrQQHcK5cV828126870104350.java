package androidx.versionedparcelable;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.SdkClickHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ZenithPathDependencyFrameworkZGglYR8CrQQHcK5cV828126870104350 implements Runnable {
    public final /* synthetic */ ActivityPackage LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ SdkClickHandler YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ ZenithPathDependencyFrameworkZGglYR8CrQQHcK5cV828126870104350(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = sdkClickHandler;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ILogger iLogger;
        List list2;
        ILogger iLogger2;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ActivityPackage activityPackage = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        SdkClickHandler sdkClickHandler = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                list = sdkClickHandler.packageQueue;
                list.add(activityPackage);
                iLogger = sdkClickHandler.logger;
                list2 = sdkClickHandler.packageQueue;
                iLogger.debug("Added sdk_click %d", Integer.valueOf(list2.size()));
                iLogger2 = sdkClickHandler.logger;
                iLogger2.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                sdkClickHandler.sendSdkClickI(activityPackage);
                sdkClickHandler.sendNextSdkClick();
                break;
        }
    }
}
