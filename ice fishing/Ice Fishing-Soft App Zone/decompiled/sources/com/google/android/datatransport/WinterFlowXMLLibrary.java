package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLLibrary implements IRunActivityHandler {
    public final /* synthetic */ String WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowXMLLibrary(String str, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.WinterFlowRouterStructure;
        String str = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.removeGlobalCallbackParameterI(str);
                break;
            default:
                activityHandler.removeGlobalPartnerParameterI(str);
                break;
        }
    }
}
