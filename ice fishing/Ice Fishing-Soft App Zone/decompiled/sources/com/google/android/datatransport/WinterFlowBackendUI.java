package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendUI {
    public final WinterFlowQuerySystem WinterFlowArrayNetwork;
    public final WinterFlowObjectHandler WinterFlowCacheManagerAgent;
    public final WinterFlowInvokerOrchestration WinterFlowHookDataSource;
    public final WinterFlowProxyLayer WinterFlowRouterStructure;

    public WinterFlowBackendUI(WinterFlowProxyLayer winterFlowProxyLayer, WinterFlowInvokerOrchestration winterFlowInvokerOrchestration, float f, WinterFlowQuerySystem winterFlowQuerySystem) {
        this.WinterFlowRouterStructure = winterFlowProxyLayer;
        this.WinterFlowHookDataSource = winterFlowInvokerOrchestration;
        this.WinterFlowCacheManagerAgent = new WinterFlowObjectHandler(f);
        this.WinterFlowArrayNetwork = winterFlowQuerySystem;
    }
}
