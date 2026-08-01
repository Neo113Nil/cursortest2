package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowSingletonPipeline extends WinterFlowDeserializationNetwork {
    public final WinterFlowDebugEvent WinterFlowRouterStructure;

    public WinterFlowSingletonPipeline(WinterFlowDebugEvent winterFlowDebugEvent) {
        this.WinterFlowRouterStructure = winterFlowDebugEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        return new WinterFlowMapperWebsocket(WinterFlowQuerySyntax.WinterFlowRouterStructure, this.WinterFlowRouterStructure);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowMapperWebsocket winterFlowMapperWebsocket = (WinterFlowMapperWebsocket) winterFlowUserManagerController;
        winterFlowMapperWebsocket.WinterFlowVariableBandwidth = WinterFlowQuerySyntax.WinterFlowRouterStructure;
        WinterFlowDebugEvent winterFlowDebugEvent = winterFlowMapperWebsocket.WinterFlowBatchUI;
        if (winterFlowDebugEvent.WinterFlowRouterStructure == winterFlowMapperWebsocket) {
            winterFlowDebugEvent.WinterFlowRouterStructure = null;
        }
        WinterFlowDebugEvent winterFlowDebugEvent2 = this.WinterFlowRouterStructure;
        if (winterFlowDebugEvent2 != winterFlowDebugEvent) {
            winterFlowMapperWebsocket.WinterFlowBatchUI = winterFlowDebugEvent2;
            winterFlowDebugEvent = winterFlowDebugEvent2;
        }
        if (winterFlowMapperWebsocket.WinterFlowSingletonPlatform) {
            winterFlowDebugEvent.WinterFlowRouterStructure = winterFlowMapperWebsocket;
            winterFlowDebugEvent.WinterFlowHookDataSource = null;
            winterFlowMapperWebsocket.WinterFlowRouterAdapter = null;
            winterFlowDebugEvent.WinterFlowCacheManagerAgent = new WinterFlowRouterEngine(10, winterFlowMapperWebsocket);
            winterFlowDebugEvent.WinterFlowArrayNetwork = winterFlowMapperWebsocket.WinterFlowModuleService();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WinterFlowSingletonPipeline) && ((WinterFlowSingletonPipeline) obj).WinterFlowRouterStructure == this.WinterFlowRouterStructure;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() + (WinterFlowQuerySyntax.WinterFlowRouterStructure.hashCode() * 31);
    }
}
