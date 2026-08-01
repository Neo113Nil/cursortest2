package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowEventEmitterClass implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowStackScript WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowEventEmitterClass(WinterFlowStackScript winterFlowStackScript, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowStackScript;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowStackScript winterFlowStackScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowNetworkSession winterFlowNetworkSession = winterFlowStackScript.WinterFlowBatchUI.WinterFlowHookDataSource;
                return Float.valueOf((((WinterFlowVersionControlModule) winterFlowNetworkSession.WinterFlowVariableVersionControl.WinterFlowHookDataSource).WinterFlowRouterRouter() * 500) + ((WinterFlowVersionControlModule) winterFlowNetworkSession.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent).WinterFlowRouterRouter());
            case 1:
                WinterFlowNetworkSession winterFlowNetworkSession2 = winterFlowStackScript.WinterFlowBatchUI.WinterFlowHookDataSource;
                int WinterFlowRouterRouter = ((WinterFlowVersionControlModule) winterFlowNetworkSession2.WinterFlowVariableVersionControl.WinterFlowHookDataSource).WinterFlowRouterRouter();
                int WinterFlowRouterRouter2 = ((WinterFlowVersionControlModule) winterFlowNetworkSession2.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent).WinterFlowRouterRouter();
                return Float.valueOf(winterFlowNetworkSession2.WinterFlowArrayNetwork() ? (WinterFlowRouterRouter * 500) + WinterFlowRouterRouter2 + 100.0f : (WinterFlowRouterRouter * 500) + WinterFlowRouterRouter2);
            default:
                WinterFlowNetworkSession winterFlowNetworkSession3 = winterFlowStackScript.WinterFlowBatchUI.WinterFlowHookDataSource;
                int WinterFlowUnitTestResponse = (int) (winterFlowNetworkSession3.WinterFlowUnitTestResponse().WinterFlowBandwidthObject == WinterFlowBackendBatch.WinterFlowVariableVersionControl ? winterFlowNetworkSession3.WinterFlowUnitTestResponse().WinterFlowUnitTestResponse() & 4294967295L : winterFlowNetworkSession3.WinterFlowUnitTestResponse().WinterFlowUnitTestResponse() >> 32);
                WinterFlowNetworkSession winterFlowNetworkSession4 = winterFlowStackScript.WinterFlowBatchUI.WinterFlowHookDataSource;
                return Float.valueOf(WinterFlowUnitTestResponse - ((-winterFlowNetworkSession4.WinterFlowUnitTestResponse().WinterFlowServerProtocol) + winterFlowNetworkSession4.WinterFlowUnitTestResponse().WinterFlowOrchestrationSubsystem));
        }
    }
}
