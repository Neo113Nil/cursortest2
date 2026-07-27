package androidx.versionedparcelable;

import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class XenoGridContainerInterfaceEXBrUH5vvePDsijYi961878805527573 implements Runnable {
    public final /* synthetic */ ComponentActivity LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ XenoGridContainerInterfaceEXBrUH5vvePDsijYi961878805527573(ComponentActivity componentActivity, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ComponentActivity componentActivity = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ComponentActivity.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(componentActivity);
                break;
            default:
                int i2 = ComponentActivity.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983;
                componentActivity.invalidateOptionsMenu();
                break;
        }
    }
}
