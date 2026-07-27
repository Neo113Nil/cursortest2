package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridDelegateBuilderYxuPTFgHfs6Pus2YPN33536825382692 implements Runnable {
    public final /* synthetic */ OnAttributionReadListener LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ ActivityHandler YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ XenoGridDelegateBuilderYxuPTFgHfs6Pus2YPN33536825382692(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = activityHandler;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustAttribution adjustAttribution;
        AdjustAttribution adjustAttribution2;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ActivityHandler activityHandler = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        OnAttributionReadListener onAttributionReadListener = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustAttribution = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution);
                break;
            default:
                adjustAttribution2 = activityHandler.attribution;
                onAttributionReadListener.onAttributionRead(adjustAttribution2);
                break;
        }
    }
}
