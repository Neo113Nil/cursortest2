package com.google.android.datatransport;

import android.content.Context;
import com.adjust.sdk.Adjust;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.data.cpp.ID;
import com.icewinter.flow.winter.icecatch.data.cpp.StaticIdProvider;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseScheduler implements WinterFlowThreadPoolAgent {
    public final Context WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowDatabaseScheduler(Context context, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = context;
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolAgent
    public final Object WinterFlowRouterStructure(WinterFlowBandwidthQueue winterFlowBandwidthQueue) {
        int i = this.WinterFlowRouterStructure;
        Context context = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowBandwidthQueue));
                winterFlowEventCloud.WinterFlowSerializerStructure();
                Adjust.getGoogleAdId(context, new WinterFlowConfigurationModule(10, winterFlowEventCloud));
                return winterFlowEventCloud.WinterFlowBatchUI();
            default:
                WinterFlowEventCloud winterFlowEventCloud2 = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowBandwidthQueue));
                winterFlowEventCloud2.WinterFlowSerializerStructure();
                Adjust.getGooglePlayInstallReferrer(context, new WinterFlowCompilerXML(winterFlowEventCloud2));
                return winterFlowEventCloud2.WinterFlowBatchUI();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolAgent
    public final String getKey() {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return StaticIdProvider.INSTANCE.provide(ID.APP_GOOGLE_ID);
            default:
                return StaticIdProvider.INSTANCE.provide(ID.APP_GOOGLE_REFER_ID);
        }
    }
}
