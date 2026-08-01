package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorFramework implements WinterFlowHookTool {
    public final WinterFlowObjectSession WinterFlowCacheManagerAgent;
    public final WinterFlowHookTool WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowProcessorFramework(WinterFlowHookTool winterFlowHookTool, WinterFlowObjectSession winterFlowObjectSession, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = winterFlowHookTool;
        this.WinterFlowCacheManagerAgent = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowHookTool
    public final Iterator iterator() {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowServiceProviderHandler(this);
            default:
                return new WinterFlowAlgorithmEngine(this);
        }
    }
}
