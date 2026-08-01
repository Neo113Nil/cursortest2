package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugStructure extends WinterFlowThreadDebug {
    public static final WinterFlowDebugStructure WinterFlowCacheManagerAgent = new WinterFlowDebugStructure(0, 3, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray;
        WinterFlowMapperInterface winterFlowMapperInterface = (WinterFlowMapperInterface) winterFlowProviderEntity.WinterFlowCacheManagerAgent(1);
        WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = (WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
        WinterFlowServiceProviderInterface winterFlowServiceProviderInterface = (WinterFlowServiceProviderInterface) winterFlowProviderEntity.WinterFlowCacheManagerAgent(2);
        WinterFlowServiceProviderListener WinterFlowVariableVersionControl = winterFlowMapperInterface.WinterFlowVariableVersionControl();
        if (winterFlowListenerUtility != null) {
            try {
                winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(22, winterFlowListenerUtility, winterFlowServiceProviderListener);
            } catch (Throwable th) {
                WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(false);
                throw th;
            }
        } else {
            winterFlowAlgorithmArray = null;
        }
        if (!winterFlowServiceProviderInterface.WinterFlowServerProtocol.WinterFlowOrchestrationConfiguration()) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        winterFlowServiceProviderInterface.WinterFlowTransactionAgent.WinterFlowFrameworkTransaction(winterFlowProcessorConsumer, WinterFlowVariableVersionControl, winterFlowValidator, winterFlowAlgorithmArray);
        WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(true);
        winterFlowServiceProviderListener.WinterFlowArrayNetwork();
        winterFlowDatabaseSchemaHandler.getClass();
        winterFlowServiceProviderListener.WinterFlowBackendCacheManager(winterFlowMapperInterface, winterFlowMapperInterface.WinterFlowRouterStructure(winterFlowDatabaseSchemaHandler));
        winterFlowServiceProviderListener.WinterFlowResponseEngine();
    }
}
