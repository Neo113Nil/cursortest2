package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderWebsocket implements WinterFlowResponseSubsystem {
    public static final WinterFlowLoaderWebsocket WinterFlowRouterStructure = new WinterFlowLoaderWebsocket();
    public static final WinterFlowAlgorithmHelper WinterFlowHookDataSource = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("requestTimeMs");
    public static final WinterFlowAlgorithmHelper WinterFlowCacheManagerAgent = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("requestUptimeMs");
    public static final WinterFlowAlgorithmHelper WinterFlowArrayNetwork = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("clientInfo");
    public static final WinterFlowAlgorithmHelper WinterFlowVariableVersionControl = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("logSource");
    public static final WinterFlowAlgorithmHelper WinterFlowTransactionManagerStrategy = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("logSourceName");
    public static final WinterFlowAlgorithmHelper WinterFlowUnitTestResponse = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("logEvent");
    public static final WinterFlowAlgorithmHelper WinterFlowRouterRouter = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("qosTier");

    @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        WinterFlowSingletonMechanism winterFlowSingletonMechanism = (WinterFlowSingletonMechanism) obj;
        WinterFlowQueueHandler winterFlowQueueHandler = (WinterFlowQueueHandler) obj2;
        winterFlowQueueHandler.WinterFlowArrayNetwork(WinterFlowHookDataSource, ((WinterFlowProcessorJava) winterFlowSingletonMechanism).WinterFlowRouterStructure);
        WinterFlowProcessorJava winterFlowProcessorJava = (WinterFlowProcessorJava) winterFlowSingletonMechanism;
        winterFlowQueueHandler.WinterFlowArrayNetwork(WinterFlowCacheManagerAgent, winterFlowProcessorJava.WinterFlowHookDataSource);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowArrayNetwork, winterFlowProcessorJava.WinterFlowCacheManagerAgent);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowVariableVersionControl, winterFlowProcessorJava.WinterFlowArrayNetwork);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy, winterFlowProcessorJava.WinterFlowVariableVersionControl);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowUnitTestResponse, winterFlowProcessorJava.WinterFlowTransactionManagerStrategy);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowRouterRouter, WinterFlowDeserializationSubsystem.WinterFlowVariableVersionControl);
    }
}
