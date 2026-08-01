package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerManager extends WinterFlowThreadDebug {
    public static final WinterFlowTransactionManagerManager WinterFlowCacheManagerAgent = new WinterFlowTransactionManagerManager(0, 2, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = (WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
        Object WinterFlowCacheManagerAgent2 = winterFlowProviderEntity.WinterFlowCacheManagerAgent(1);
        if (WinterFlowCacheManagerAgent2 instanceof WinterFlowFrontendHandler) {
            WinterFlowFrontendHandler winterFlowFrontendHandler = (WinterFlowFrontendHandler) WinterFlowCacheManagerAgent2;
            winterFlowValidator.WinterFlowVariableVersionControl.WinterFlowHookDataSource(winterFlowFrontendHandler);
            winterFlowValidator.WinterFlowArrayNetwork.WinterFlowRouterStructure(winterFlowFrontendHandler);
        }
        if (winterFlowServiceProviderListener.WinterFlowServiceUtility != 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Can only append a slot if not current inserting");
        }
        int i = winterFlowServiceProviderListener.WinterFlowSyntax;
        int i2 = winterFlowServiceProviderListener.WinterFlowResponseEngine;
        int WinterFlowCacheManagerAgent3 = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent(winterFlowDatabaseSchemaHandler);
        int WinterFlowTransactionManagerStrategy = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(WinterFlowCacheManagerAgent3 + 1));
        winterFlowServiceProviderListener.WinterFlowSyntax = WinterFlowTransactionManagerStrategy;
        winterFlowServiceProviderListener.WinterFlowResponseEngine = WinterFlowTransactionManagerStrategy;
        winterFlowServiceProviderListener.WinterFlowMapperProtocol(1, WinterFlowCacheManagerAgent3);
        if (i >= WinterFlowTransactionManagerStrategy) {
            i++;
            i2++;
        }
        winterFlowServiceProviderListener.WinterFlowCacheManagerAgent[WinterFlowTransactionManagerStrategy] = WinterFlowCacheManagerAgent2;
        winterFlowServiceProviderListener.WinterFlowSyntax = i;
        winterFlowServiceProviderListener.WinterFlowResponseEngine = i2;
    }
}
