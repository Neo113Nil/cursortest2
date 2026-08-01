package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareStructure implements WinterFlowResponseSubsystem {
    public static final WinterFlowMiddlewareStructure WinterFlowRouterStructure = new WinterFlowMiddlewareStructure();
    public static final WinterFlowAlgorithmHelper WinterFlowHookDataSource = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("sdkVersion");
    public static final WinterFlowAlgorithmHelper WinterFlowCacheManagerAgent = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("model");
    public static final WinterFlowAlgorithmHelper WinterFlowArrayNetwork = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("hardware");
    public static final WinterFlowAlgorithmHelper WinterFlowVariableVersionControl = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("device");
    public static final WinterFlowAlgorithmHelper WinterFlowTransactionManagerStrategy = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("product");
    public static final WinterFlowAlgorithmHelper WinterFlowUnitTestResponse = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("osBuild");
    public static final WinterFlowAlgorithmHelper WinterFlowRouterRouter = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("manufacturer");
    public static final WinterFlowAlgorithmHelper WinterFlowSyntax = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("fingerprint");
    public static final WinterFlowAlgorithmHelper WinterFlowResponseEngine = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("locale");
    public static final WinterFlowAlgorithmHelper WinterFlowTransactionAgent = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("country");
    public static final WinterFlowAlgorithmHelper WinterFlowServerProtocol = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("mccMnc");
    public static final WinterFlowAlgorithmHelper WinterFlowThreadListener = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("applicationBuild");

    @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        WinterFlowRendererLayer winterFlowRendererLayer = (WinterFlowRendererLayer) obj;
        WinterFlowQueueHandler winterFlowQueueHandler = (WinterFlowQueueHandler) obj2;
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowHookDataSource, ((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowRouterStructure);
        WinterFlowBatchDataSource winterFlowBatchDataSource = (WinterFlowBatchDataSource) winterFlowRendererLayer;
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowCacheManagerAgent, winterFlowBatchDataSource.WinterFlowHookDataSource);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowArrayNetwork, winterFlowBatchDataSource.WinterFlowCacheManagerAgent);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowVariableVersionControl, winterFlowBatchDataSource.WinterFlowArrayNetwork);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy, winterFlowBatchDataSource.WinterFlowVariableVersionControl);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowUnitTestResponse, winterFlowBatchDataSource.WinterFlowTransactionManagerStrategy);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowRouterRouter, winterFlowBatchDataSource.WinterFlowUnitTestResponse);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowSyntax, winterFlowBatchDataSource.WinterFlowRouterRouter);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowResponseEngine, winterFlowBatchDataSource.WinterFlowSyntax);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowTransactionAgent, winterFlowBatchDataSource.WinterFlowResponseEngine);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowServerProtocol, winterFlowBatchDataSource.WinterFlowTransactionAgent);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowThreadListener, winterFlowBatchDataSource.WinterFlowServerProtocol);
    }
}
