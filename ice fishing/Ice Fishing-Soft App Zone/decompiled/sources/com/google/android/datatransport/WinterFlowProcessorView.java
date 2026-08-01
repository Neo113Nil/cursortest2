package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorView extends WinterFlowThreadDebug {
    public static final WinterFlowProcessorView WinterFlowCacheManagerAgent = new WinterFlowProcessorView(0, 2, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        WinterFlowBackendEntity winterFlowBackendEntity = (WinterFlowBackendEntity) winterFlowProviderEntity.WinterFlowCacheManagerAgent(1);
        int i = winterFlowBackendEntity != null ? winterFlowBackendEntity.WinterFlowRouterStructure : 0;
        WinterFlowIDEConsumer winterFlowIDEConsumer = (WinterFlowIDEConsumer) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
        if (i > 0) {
            winterFlowProcessorConsumer = new WinterFlowFrontendTesting(winterFlowProcessorConsumer, i);
        }
        winterFlowIDEConsumer.WinterFlowSessionManagerInterface(winterFlowProcessorConsumer, winterFlowServiceProviderListener, winterFlowValidator, winterFlowListenerUtility != null ? new WinterFlowAlgorithmArray(22, winterFlowListenerUtility, winterFlowServiceProviderListener) : null);
    }
}
