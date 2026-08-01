package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayTransaction implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowLoaderRenderer WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowSyntax;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowTransactionAgent;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowEventTool WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowArrayTransaction(int i, WinterFlowEventEvent winterFlowEventEvent, WinterFlowEventTool winterFlowEventTool, WinterFlowEventEvent winterFlowEventEvent2, WinterFlowEventEvent winterFlowEventEvent3, WinterFlowLoaderRenderer winterFlowLoaderRenderer, WinterFlowEventEvent winterFlowEventEvent4) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowEventEvent;
        this.WinterFlowUnitTestResponse = winterFlowEventTool;
        this.WinterFlowRouterRouter = winterFlowEventEvent2;
        this.WinterFlowSyntax = winterFlowEventEvent3;
        this.WinterFlowResponseEngine = winterFlowLoaderRenderer;
        this.WinterFlowTransactionAgent = winterFlowEventEvent4;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
        int intValue = ((Number) obj2).intValue();
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
            WinterFlowDecoratorRouter.WinterFlowHookDataSource(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, winterFlowResolverLibrary, 0);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
