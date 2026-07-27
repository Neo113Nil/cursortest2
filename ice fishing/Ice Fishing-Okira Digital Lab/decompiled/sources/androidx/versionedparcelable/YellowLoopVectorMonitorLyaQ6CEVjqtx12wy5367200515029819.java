package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.OnIsEnabledListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class YellowLoopVectorMonitorLyaQ6CEVjqtx12wy5367200515029819 implements Runnable {
    public final /* synthetic */ ActivityHandler LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ OnIsEnabledListener YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ YellowLoopVectorMonitorLyaQ6CEVjqtx12wy5367200515029819(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityHandler;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        OnIsEnabledListener onIsEnabledListener = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        ActivityHandler activityHandler = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$isEnabled$9(onIsEnabledListener);
                break;
            case 1:
                activityHandler.lambda$isEnabled$11(onIsEnabledListener);
                break;
            default:
                activityHandler.lambda$isEnabled$10(onIsEnabledListener);
                break;
        }
    }
}
