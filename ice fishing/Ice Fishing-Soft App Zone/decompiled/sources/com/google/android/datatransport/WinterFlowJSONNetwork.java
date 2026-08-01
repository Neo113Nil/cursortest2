package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowJSONNetwork implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowJSONNetwork(WinterFlowObjectSession winterFlowObjectSession, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) obj;
                if (!(winterFlowAlgorithmEntity instanceof WinterFlowRuntimePlatform)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(((WinterFlowRuntimePlatform) winterFlowAlgorithmEntity).WinterFlowVariableBandwidth);
                bool.getClass();
                return bool;
            case 1:
                WinterFlowJSONModule winterFlowJSONModule = (WinterFlowJSONModule) winterFlowObjectSession.WinterFlowUnitTestResponse((WinterFlowSingletonNode) obj);
                synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                    WinterFlowVersionProtocol.WinterFlowArrayNetwork = WinterFlowVersionProtocol.WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy(winterFlowJSONModule.WinterFlowUnitTestResponse());
                }
                return winterFlowJSONModule;
            default:
                Long l = (Long) obj;
                l.getClass();
                return winterFlowObjectSession.WinterFlowUnitTestResponse(l);
        }
    }
}
