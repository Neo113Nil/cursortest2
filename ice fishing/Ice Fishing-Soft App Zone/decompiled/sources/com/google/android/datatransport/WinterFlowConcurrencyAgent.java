package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyAgent extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowMapperManager WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowConcurrencyAgent(WinterFlowObjectSession winterFlowObjectSession, WinterFlowMapperManager winterFlowMapperManager, int i) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectSession;
        this.WinterFlowUnitTestResponse = winterFlowMapperManager;
        this.WinterFlowRouterRouter = i;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        WinterFlowCacheRuntime.WinterFlowRouterStructure(WinterFlowConfigurationException.WinterFlowResponseEngine(this.WinterFlowRouterRouter | 1), this.WinterFlowTransactionManagerStrategy, (WinterFlowResolverLibrary) obj, this.WinterFlowUnitTestResponse);
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
