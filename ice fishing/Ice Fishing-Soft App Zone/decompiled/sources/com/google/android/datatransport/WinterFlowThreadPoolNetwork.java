package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolNetwork extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowInvokerConsumer WinterFlowSyntax;
    public final /* synthetic */ WinterFlowEventTool WinterFlowTransactionAgent;
    public final /* synthetic */ WinterFlowHandlerInvoker WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowMapperManager WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowThreadPoolNetwork(WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession, WinterFlowInvokerConsumer winterFlowInvokerConsumer, WinterFlowObjectSession winterFlowObjectSession2, WinterFlowEventTool winterFlowEventTool, int i) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = winterFlowHandlerInvoker;
        this.WinterFlowUnitTestResponse = winterFlowMapperManager;
        this.WinterFlowRouterRouter = winterFlowObjectSession;
        this.WinterFlowSyntax = winterFlowInvokerConsumer;
        this.WinterFlowResponseEngine = winterFlowObjectSession2;
        this.WinterFlowTransactionAgent = winterFlowEventTool;
        this.WinterFlowServerProtocol = i;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        WinterFlowManagerRequest.WinterFlowRouterStructure(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(this.WinterFlowServerProtocol | 1));
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
