package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowTransactionCacheManager extends WinterFlowDeserializationNetwork {
    public final WinterFlowVersionControlUtility WinterFlowCacheManagerAgent;
    public final WinterFlowHandlerWebsocket WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowTransactionCacheManager(long j, WinterFlowTransactionConsumer winterFlowTransactionConsumer, WinterFlowVersionControlUtility winterFlowVersionControlUtility, int i) {
        j = (i & 1) != 0 ? WinterFlowInheritanceSubsystem.WinterFlowResponseEngine : j;
        winterFlowTransactionConsumer = (i & 2) != 0 ? null : winterFlowTransactionConsumer;
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = winterFlowTransactionConsumer;
        this.WinterFlowCacheManagerAgent = winterFlowVersionControlUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowServiceDatabaseSchema winterFlowServiceDatabaseSchema = new WinterFlowServiceDatabaseSchema();
        winterFlowServiceDatabaseSchema.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowServiceDatabaseSchema.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowServiceDatabaseSchema.WinterFlowRouterAdapter = 1.0f;
        winterFlowServiceDatabaseSchema.WinterFlowSerializerStructure = this.WinterFlowCacheManagerAgent;
        winterFlowServiceDatabaseSchema.WinterFlowMapperProtocol = 9205357640488583168L;
        return winterFlowServiceDatabaseSchema;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowServiceDatabaseSchema winterFlowServiceDatabaseSchema = (WinterFlowServiceDatabaseSchema) winterFlowUserManagerController;
        winterFlowServiceDatabaseSchema.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowServiceDatabaseSchema.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowServiceDatabaseSchema.WinterFlowRouterAdapter = 1.0f;
        WinterFlowVersionControlUtility winterFlowVersionControlUtility = winterFlowServiceDatabaseSchema.WinterFlowSerializerStructure;
        WinterFlowVersionControlUtility winterFlowVersionControlUtility2 = this.WinterFlowCacheManagerAgent;
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowVersionControlUtility, winterFlowVersionControlUtility2)) {
            winterFlowServiceDatabaseSchema.WinterFlowSerializerStructure = winterFlowVersionControlUtility2;
            WinterFlowFrameworkMechanism.WinterFlowRouterRouter(winterFlowServiceDatabaseSchema);
        }
        WinterFlowUnitTestLibrary.WinterFlowArrayHelper(winterFlowServiceDatabaseSchema);
    }

    public final boolean equals(Object obj) {
        WinterFlowTransactionCacheManager winterFlowTransactionCacheManager = obj instanceof WinterFlowTransactionCacheManager ? (WinterFlowTransactionCacheManager) obj : null;
        if (winterFlowTransactionCacheManager == null) {
            return false;
        }
        long j = winterFlowTransactionCacheManager.WinterFlowRouterStructure;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowUnitTestSoftware.WinterFlowRouterStructure(this.WinterFlowRouterStructure, j) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowTransactionCacheManager.WinterFlowHookDataSource) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowTransactionCacheManager.WinterFlowCacheManagerAgent);
    }

    public final int hashCode() {
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        int hashCode = Long.hashCode(this.WinterFlowRouterStructure) * 31;
        WinterFlowHandlerWebsocket winterFlowHandlerWebsocket = this.WinterFlowHookDataSource;
        return this.WinterFlowCacheManagerAgent.hashCode() + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(1.0f, (hashCode + (winterFlowHandlerWebsocket != null ? winterFlowHandlerWebsocket.hashCode() : 0)) * 31, 31);
    }
}
