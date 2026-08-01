package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowFunctionMechanism extends WinterFlowDeserializationNetwork {
    public final WinterFlowNetworkWidget WinterFlowArrayNetwork;
    public final boolean WinterFlowCacheManagerAgent;
    public final WinterFlowBackendBatch WinterFlowHookDataSource;
    public final WinterFlowServerEntity WinterFlowRouterStructure;
    public final boolean WinterFlowTransactionManagerStrategy;
    public final WinterFlowDeploymentException WinterFlowUnitTestResponse;
    public final WinterFlowJSONDecorator WinterFlowVariableVersionControl;

    public WinterFlowFunctionMechanism(WinterFlowDeploymentException winterFlowDeploymentException, WinterFlowNetworkWidget winterFlowNetworkWidget, WinterFlowBackendBatch winterFlowBackendBatch, WinterFlowJSONDecorator winterFlowJSONDecorator, WinterFlowServerEntity winterFlowServerEntity, boolean z, boolean z2) {
        this.WinterFlowRouterStructure = winterFlowServerEntity;
        this.WinterFlowHookDataSource = winterFlowBackendBatch;
        this.WinterFlowCacheManagerAgent = z;
        this.WinterFlowArrayNetwork = winterFlowNetworkWidget;
        this.WinterFlowVariableVersionControl = winterFlowJSONDecorator;
        this.WinterFlowTransactionManagerStrategy = z2;
        this.WinterFlowUnitTestResponse = winterFlowDeploymentException;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowConcurrencyCache winterFlowConcurrencyCache = new WinterFlowConcurrencyCache();
        winterFlowConcurrencyCache.WinterFlowRouterAdapter = this.WinterFlowRouterStructure;
        winterFlowConcurrencyCache.WinterFlowSerializerStructure = this.WinterFlowHookDataSource;
        winterFlowConcurrencyCache.WinterFlowMapperProtocol = this.WinterFlowCacheManagerAgent;
        winterFlowConcurrencyCache.WinterFlowResolverController = this.WinterFlowArrayNetwork;
        winterFlowConcurrencyCache.WinterFlowConsumerUserManager = this.WinterFlowVariableVersionControl;
        winterFlowConcurrencyCache.WinterFlowBackendCacheManager = this.WinterFlowTransactionManagerStrategy;
        winterFlowConcurrencyCache.WinterFlowEventEmitterController = this.WinterFlowUnitTestResponse;
        return winterFlowConcurrencyCache;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        ((WinterFlowConcurrencyCache) winterFlowUserManagerController).WinterFlowEncryptionAdapter(this.WinterFlowUnitTestResponse, this.WinterFlowArrayNetwork, this.WinterFlowHookDataSource, this.WinterFlowVariableVersionControl, this.WinterFlowRouterStructure, this.WinterFlowTransactionManagerStrategy, this.WinterFlowCacheManagerAgent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowFunctionMechanism.class != obj.getClass()) {
            return false;
        }
        WinterFlowFunctionMechanism winterFlowFunctionMechanism = (WinterFlowFunctionMechanism) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowFunctionMechanism.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowFunctionMechanism.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowFunctionMechanism.WinterFlowCacheManagerAgent && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowFunctionMechanism.WinterFlowArrayNetwork) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowFunctionMechanism.WinterFlowVariableVersionControl) && this.WinterFlowTransactionManagerStrategy == winterFlowFunctionMechanism.WinterFlowTransactionManagerStrategy && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowUnitTestResponse, winterFlowFunctionMechanism.WinterFlowUnitTestResponse);
    }

    public final int hashCode() {
        int WinterFlowRouterStructure = WinterFlowSingletonMapper.WinterFlowRouterStructure(WinterFlowSingletonMapper.WinterFlowRouterStructure((this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31, 31, this.WinterFlowCacheManagerAgent), 31, false);
        WinterFlowNetworkWidget winterFlowNetworkWidget = this.WinterFlowArrayNetwork;
        int hashCode = (WinterFlowRouterStructure + (winterFlowNetworkWidget != null ? winterFlowNetworkWidget.hashCode() : 0)) * 31;
        WinterFlowJSONDecorator winterFlowJSONDecorator = this.WinterFlowVariableVersionControl;
        int WinterFlowRouterStructure2 = WinterFlowSingletonMapper.WinterFlowRouterStructure((hashCode + (winterFlowJSONDecorator != null ? winterFlowJSONDecorator.hashCode() : 0)) * 961, 31, this.WinterFlowTransactionManagerStrategy);
        WinterFlowDeploymentException winterFlowDeploymentException = this.WinterFlowUnitTestResponse;
        return WinterFlowRouterStructure2 + (winterFlowDeploymentException != null ? winterFlowDeploymentException.hashCode() : 0);
    }
}
