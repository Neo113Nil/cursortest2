package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.network.IActivityPackageSender;
import java.util.Map;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 implements Runnable {
    public final /* synthetic */ ActivityPackage LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ ActivityPackageSender TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ Map YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = activityPackageSender;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = responseDataCallbackSubscriber;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityPackage;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.onResponseDataCallback(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.sendActivityPackageSync(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170));
    }
}
