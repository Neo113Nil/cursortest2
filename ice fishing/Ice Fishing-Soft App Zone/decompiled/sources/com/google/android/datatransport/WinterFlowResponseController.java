package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowResponseController implements IRunActivityHandler {
    public final /* synthetic */ String WinterFlowCacheManagerAgent;
    public final /* synthetic */ String WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowResponseController(String str, String str2, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.addGlobalPartnerParameterI(this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
                break;
        }
    }
}
