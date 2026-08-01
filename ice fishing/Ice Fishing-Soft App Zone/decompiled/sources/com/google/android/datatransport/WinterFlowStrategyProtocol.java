package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategyProtocol implements WinterFlowResponseSubsystem {
    public static final WinterFlowStrategyProtocol WinterFlowRouterStructure = new WinterFlowStrategyProtocol();
    public static final WinterFlowAlgorithmHelper WinterFlowHookDataSource = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("clientType");
    public static final WinterFlowAlgorithmHelper WinterFlowCacheManagerAgent = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("androidClientInfo");

    @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        WinterFlowTransactionManagerSerializer winterFlowTransactionManagerSerializer = (WinterFlowTransactionManagerSerializer) obj;
        WinterFlowQueueHandler winterFlowQueueHandler = (WinterFlowQueueHandler) obj2;
        ((WinterFlowMiddleware) winterFlowTransactionManagerSerializer).getClass();
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowHookDataSource, WinterFlowSessionSystem.WinterFlowVariableVersionControl);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowCacheManagerAgent, ((WinterFlowMiddleware) winterFlowTransactionManagerSerializer).WinterFlowRouterStructure);
    }
}
