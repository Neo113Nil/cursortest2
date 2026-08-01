package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerEntity {
    public final WinterFlowEncryptionServer WinterFlowArrayHelper;
    public final WinterFlowEncryptionServer WinterFlowArrayNetwork;
    public final WinterFlowEncryptionServer WinterFlowBackendCacheManager;
    public final WinterFlowEncryptionServer WinterFlowBandwidthObject;
    public final WinterFlowEncryptionServer WinterFlowBatchUI;
    public final WinterFlowEncryptionServer WinterFlowCacheManagerAgent;
    public final WinterFlowEncryptionServer WinterFlowCompilerVariable;
    public final WinterFlowEncryptionServer WinterFlowConcurrencyThread;
    public final WinterFlowEncryptionServer WinterFlowConfigurationSubsystem;
    public final WinterFlowEncryptionServer WinterFlowConsumerUserManager;
    public final WinterFlowEncryptionServer WinterFlowEventEmitterController;
    public final WinterFlowEncryptionServer WinterFlowHookDataSource;
    public final WinterFlowEncryptionServer WinterFlowMapperProtocol;
    public final WinterFlowEncryptionServer WinterFlowOrchestrationSubsystem;
    public final WinterFlowEncryptionServer WinterFlowResolverController;
    public final WinterFlowEncryptionServer WinterFlowResponseEngine;
    public final WinterFlowEncryptionServer WinterFlowRouterAdapter;
    public final WinterFlowEncryptionServer WinterFlowRouterRouter;
    public final WinterFlowEncryptionServer WinterFlowRouterStructure;
    public final WinterFlowEncryptionServer WinterFlowSerializerStructure;
    public final WinterFlowEncryptionServer WinterFlowServerProtocol;
    public final WinterFlowEncryptionServer WinterFlowServiceUtility;
    public final WinterFlowEncryptionServer WinterFlowSingletonPlatform;
    public final WinterFlowEncryptionServer WinterFlowSyntax;
    public final WinterFlowEncryptionServer WinterFlowThreadListener;
    public final WinterFlowEncryptionServer WinterFlowTransactionAgent;
    public final WinterFlowEncryptionServer WinterFlowTransactionManagerStrategy;
    public final WinterFlowEncryptionServer WinterFlowUnitTestResponse;
    public final WinterFlowEncryptionServer WinterFlowVariableBandwidth;
    public final WinterFlowEncryptionServer WinterFlowVariableVersionControl;

    public WinterFlowUserManagerEntity(WinterFlowEncryptionServer winterFlowEncryptionServer, int i) {
        WinterFlowEncryptionServer winterFlowEncryptionServer2 = WinterFlowServiceProviderAPI.WinterFlowArrayNetwork;
        WinterFlowEncryptionServer winterFlowEncryptionServer3 = WinterFlowServiceProviderAPI.WinterFlowVariableVersionControl;
        WinterFlowEncryptionServer winterFlowEncryptionServer4 = WinterFlowServiceProviderAPI.WinterFlowTransactionManagerStrategy;
        WinterFlowEncryptionServer winterFlowEncryptionServer5 = WinterFlowServiceProviderAPI.WinterFlowUnitTestResponse;
        WinterFlowEncryptionServer winterFlowEncryptionServer6 = WinterFlowServiceProviderAPI.WinterFlowRouterRouter;
        WinterFlowEncryptionServer winterFlowEncryptionServer7 = WinterFlowServiceProviderAPI.WinterFlowSyntax;
        WinterFlowEncryptionServer winterFlowEncryptionServer8 = WinterFlowServiceProviderAPI.WinterFlowThreadListener;
        WinterFlowEncryptionServer winterFlowEncryptionServer9 = WinterFlowServiceProviderAPI.WinterFlowServiceUtility;
        WinterFlowEncryptionServer winterFlowEncryptionServer10 = WinterFlowServiceProviderAPI.WinterFlowBandwidthObject;
        winterFlowEncryptionServer = (i & 512) != 0 ? WinterFlowServiceProviderAPI.WinterFlowRouterStructure : winterFlowEncryptionServer;
        WinterFlowEncryptionServer winterFlowEncryptionServer11 = WinterFlowServiceProviderAPI.WinterFlowHookDataSource;
        WinterFlowEncryptionServer winterFlowEncryptionServer12 = WinterFlowServiceProviderAPI.WinterFlowCacheManagerAgent;
        WinterFlowEncryptionServer winterFlowEncryptionServer13 = WinterFlowServiceProviderAPI.WinterFlowResponseEngine;
        WinterFlowEncryptionServer winterFlowEncryptionServer14 = WinterFlowServiceProviderAPI.WinterFlowTransactionAgent;
        WinterFlowEncryptionServer winterFlowEncryptionServer15 = WinterFlowServiceProviderAPI.WinterFlowServerProtocol;
        this.WinterFlowRouterStructure = winterFlowEncryptionServer2;
        this.WinterFlowHookDataSource = winterFlowEncryptionServer3;
        this.WinterFlowCacheManagerAgent = winterFlowEncryptionServer4;
        this.WinterFlowArrayNetwork = winterFlowEncryptionServer5;
        this.WinterFlowVariableVersionControl = winterFlowEncryptionServer6;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionServer7;
        this.WinterFlowUnitTestResponse = winterFlowEncryptionServer8;
        this.WinterFlowRouterRouter = winterFlowEncryptionServer9;
        this.WinterFlowSyntax = winterFlowEncryptionServer10;
        this.WinterFlowResponseEngine = winterFlowEncryptionServer;
        this.WinterFlowTransactionAgent = winterFlowEncryptionServer11;
        this.WinterFlowServerProtocol = winterFlowEncryptionServer12;
        this.WinterFlowThreadListener = winterFlowEncryptionServer13;
        this.WinterFlowServiceUtility = winterFlowEncryptionServer14;
        this.WinterFlowBandwidthObject = winterFlowEncryptionServer15;
        this.WinterFlowOrchestrationSubsystem = winterFlowEncryptionServer2;
        this.WinterFlowConcurrencyThread = winterFlowEncryptionServer3;
        this.WinterFlowSingletonPlatform = winterFlowEncryptionServer4;
        this.WinterFlowVariableBandwidth = winterFlowEncryptionServer5;
        this.WinterFlowBatchUI = winterFlowEncryptionServer6;
        this.WinterFlowRouterAdapter = winterFlowEncryptionServer7;
        this.WinterFlowSerializerStructure = winterFlowEncryptionServer8;
        this.WinterFlowMapperProtocol = winterFlowEncryptionServer9;
        this.WinterFlowResolverController = winterFlowEncryptionServer10;
        this.WinterFlowConsumerUserManager = winterFlowEncryptionServer;
        this.WinterFlowBackendCacheManager = winterFlowEncryptionServer11;
        this.WinterFlowEventEmitterController = winterFlowEncryptionServer12;
        this.WinterFlowArrayHelper = winterFlowEncryptionServer13;
        this.WinterFlowCompilerVariable = winterFlowEncryptionServer14;
        this.WinterFlowConfigurationSubsystem = winterFlowEncryptionServer15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowUserManagerEntity)) {
            return false;
        }
        WinterFlowUserManagerEntity winterFlowUserManagerEntity = (WinterFlowUserManagerEntity) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowUserManagerEntity.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowUserManagerEntity.WinterFlowHookDataSource) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowUserManagerEntity.WinterFlowCacheManagerAgent) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowUserManagerEntity.WinterFlowArrayNetwork) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowUserManagerEntity.WinterFlowVariableVersionControl) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, winterFlowUserManagerEntity.WinterFlowTransactionManagerStrategy) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowUnitTestResponse, winterFlowUserManagerEntity.WinterFlowUnitTestResponse) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterRouter, winterFlowUserManagerEntity.WinterFlowRouterRouter) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowSyntax, winterFlowUserManagerEntity.WinterFlowSyntax) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowResponseEngine, winterFlowUserManagerEntity.WinterFlowResponseEngine) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionAgent, winterFlowUserManagerEntity.WinterFlowTransactionAgent) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowServerProtocol, winterFlowUserManagerEntity.WinterFlowServerProtocol) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowThreadListener, winterFlowUserManagerEntity.WinterFlowThreadListener) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowServiceUtility, winterFlowUserManagerEntity.WinterFlowServiceUtility) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowBandwidthObject, winterFlowUserManagerEntity.WinterFlowBandwidthObject) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowOrchestrationSubsystem, winterFlowUserManagerEntity.WinterFlowOrchestrationSubsystem) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowConcurrencyThread, winterFlowUserManagerEntity.WinterFlowConcurrencyThread) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowSingletonPlatform, winterFlowUserManagerEntity.WinterFlowSingletonPlatform) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableBandwidth, winterFlowUserManagerEntity.WinterFlowVariableBandwidth) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowBatchUI, winterFlowUserManagerEntity.WinterFlowBatchUI) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterAdapter, winterFlowUserManagerEntity.WinterFlowRouterAdapter) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowSerializerStructure, winterFlowUserManagerEntity.WinterFlowSerializerStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowMapperProtocol, winterFlowUserManagerEntity.WinterFlowMapperProtocol) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowResolverController, winterFlowUserManagerEntity.WinterFlowResolverController) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowConsumerUserManager, winterFlowUserManagerEntity.WinterFlowConsumerUserManager) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowBackendCacheManager, winterFlowUserManagerEntity.WinterFlowBackendCacheManager) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowEventEmitterController, winterFlowUserManagerEntity.WinterFlowEventEmitterController) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayHelper, winterFlowUserManagerEntity.WinterFlowArrayHelper) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCompilerVariable, winterFlowUserManagerEntity.WinterFlowCompilerVariable) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowConfigurationSubsystem, winterFlowUserManagerEntity.WinterFlowConfigurationSubsystem);
    }

    public final int hashCode() {
        return this.WinterFlowConfigurationSubsystem.hashCode() + WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowCompilerVariable, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowArrayHelper, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowEventEmitterController, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowBackendCacheManager, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowConsumerUserManager, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowResolverController, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowMapperProtocol, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowSerializerStructure, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowRouterAdapter, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowBatchUI, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowVariableBandwidth, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowSingletonPlatform, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowConcurrencyThread, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowOrchestrationSubsystem, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowBandwidthObject, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowServiceUtility, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowThreadListener, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowServerProtocol, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionAgent, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowResponseEngine, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowSyntax, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowRouterRouter, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowUnitTestResponse, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowVariableVersionControl, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowArrayNetwork, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, this.WinterFlowRouterStructure.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.WinterFlowRouterStructure + ", displayMedium=" + this.WinterFlowHookDataSource + ",displaySmall=" + this.WinterFlowCacheManagerAgent + ", headlineLarge=" + this.WinterFlowArrayNetwork + ", headlineMedium=" + this.WinterFlowVariableVersionControl + ", headlineSmall=" + this.WinterFlowTransactionManagerStrategy + ", titleLarge=" + this.WinterFlowUnitTestResponse + ", titleMedium=" + this.WinterFlowRouterRouter + ", titleSmall=" + this.WinterFlowSyntax + ", bodyLarge=" + this.WinterFlowResponseEngine + ", bodyMedium=" + this.WinterFlowTransactionAgent + ", bodySmall=" + this.WinterFlowServerProtocol + ", labelLarge=" + this.WinterFlowThreadListener + ", labelMedium=" + this.WinterFlowServiceUtility + ", labelSmall=" + this.WinterFlowBandwidthObject + ", displayLargeEmphasized=" + this.WinterFlowOrchestrationSubsystem + ", displayMediumEmphasized=" + this.WinterFlowConcurrencyThread + ", displaySmallEmphasized=" + this.WinterFlowSingletonPlatform + ", headlineLargeEmphasized=" + this.WinterFlowVariableBandwidth + ", headlineMediumEmphasized=" + this.WinterFlowBatchUI + ", headlineSmallEmphasized=" + this.WinterFlowRouterAdapter + ", titleLargeEmphasized=" + this.WinterFlowSerializerStructure + ", titleMediumEmphasized=" + this.WinterFlowMapperProtocol + ", titleSmallEmphasized=" + this.WinterFlowResolverController + ", bodyLargeEmphasized=" + this.WinterFlowConsumerUserManager + ", bodyMediumEmphasized=" + this.WinterFlowBackendCacheManager + ", bodySmallEmphasized=" + this.WinterFlowEventEmitterController + ", labelLargeEmphasized=" + this.WinterFlowArrayHelper + ", labelMediumEmphasized=" + this.WinterFlowCompilerVariable + ", labelSmallEmphasized=" + this.WinterFlowConfigurationSubsystem + ')';
    }
}
