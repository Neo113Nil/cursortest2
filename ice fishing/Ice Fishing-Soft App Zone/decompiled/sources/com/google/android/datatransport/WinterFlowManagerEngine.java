package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerEngine implements WinterFlowResponseSubsystem {
    public static final WinterFlowManagerEngine WinterFlowRouterStructure = new WinterFlowManagerEngine();
    public static final WinterFlowAlgorithmHelper WinterFlowHookDataSource = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("eventTimeMs");
    public static final WinterFlowAlgorithmHelper WinterFlowCacheManagerAgent = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("eventCode");
    public static final WinterFlowAlgorithmHelper WinterFlowArrayNetwork = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("eventUptimeMs");
    public static final WinterFlowAlgorithmHelper WinterFlowVariableVersionControl = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("sourceExtension");
    public static final WinterFlowAlgorithmHelper WinterFlowTransactionManagerStrategy = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("sourceExtensionJsonProto3");
    public static final WinterFlowAlgorithmHelper WinterFlowUnitTestResponse = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("timezoneOffsetSeconds");
    public static final WinterFlowAlgorithmHelper WinterFlowRouterRouter = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("networkConnectionInfo");

    @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        WinterFlowDataSourceWorker winterFlowDataSourceWorker = (WinterFlowDataSourceWorker) obj;
        WinterFlowQueueHandler winterFlowQueueHandler = (WinterFlowQueueHandler) obj2;
        winterFlowQueueHandler.WinterFlowArrayNetwork(WinterFlowHookDataSource, ((WinterFlowVersionDeserialization) winterFlowDataSourceWorker).WinterFlowRouterStructure);
        WinterFlowVersionDeserialization winterFlowVersionDeserialization = (WinterFlowVersionDeserialization) winterFlowDataSourceWorker;
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowCacheManagerAgent, winterFlowVersionDeserialization.WinterFlowHookDataSource);
        winterFlowQueueHandler.WinterFlowArrayNetwork(WinterFlowArrayNetwork, winterFlowVersionDeserialization.WinterFlowCacheManagerAgent);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowVariableVersionControl, winterFlowVersionDeserialization.WinterFlowArrayNetwork);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy, winterFlowVersionDeserialization.WinterFlowVariableVersionControl);
        winterFlowQueueHandler.WinterFlowArrayNetwork(WinterFlowUnitTestResponse, winterFlowVersionDeserialization.WinterFlowTransactionManagerStrategy);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowRouterRouter, winterFlowVersionDeserialization.WinterFlowUnitTestResponse);
    }
}
