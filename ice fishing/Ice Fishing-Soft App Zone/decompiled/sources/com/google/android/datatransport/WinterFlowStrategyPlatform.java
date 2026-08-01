package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategyPlatform extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowStackScript WinterFlowResponseEngine;
    public int WinterFlowSyntax;
    public final /* synthetic */ int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowStrategyPlatform(WinterFlowStackScript winterFlowStackScript, int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowStackScript;
        this.WinterFlowTransactionAgent = i;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return new WinterFlowStrategyPlatform(this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        if (i != 0) {
            if (i == 1) {
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                return winterFlowAlgorithmSession;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowVersionCacheManager winterFlowVersionCacheManager = this.WinterFlowResponseEngine.WinterFlowBatchUI;
        this.WinterFlowSyntax = 1;
        WinterFlowNetworkSession winterFlowNetworkSession = winterFlowVersionCacheManager.WinterFlowHookDataSource;
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = WinterFlowNetworkSession.WinterFlowResolverController;
        winterFlowNetworkSession.getClass();
        Object WinterFlowCacheManagerAgent = winterFlowNetworkSession.WinterFlowCacheManagerAgent(WinterFlowExceptionListener.WinterFlowVariableVersionControl, new WinterFlowGatewayWorker(winterFlowNetworkSession, this.WinterFlowTransactionAgent, (WinterFlowTransactionManagerLayer) null), this);
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (WinterFlowCacheManagerAgent != winterFlowListenerJava) {
            WinterFlowCacheManagerAgent = winterFlowAlgorithmSession;
        }
        if (WinterFlowCacheManagerAgent != winterFlowListenerJava) {
            WinterFlowCacheManagerAgent = winterFlowAlgorithmSession;
        }
        return WinterFlowCacheManagerAgent == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowStrategyPlatform) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
