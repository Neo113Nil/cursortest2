package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionFunction implements WinterFlowStrategyPackage {
    public final WinterFlowStrategyResolver WinterFlowTransactionManagerStrategy;
    public final WinterFlowTransactionFunction WinterFlowVariableVersionControl;

    public WinterFlowTransactionFunction(WinterFlowTransactionFunction winterFlowTransactionFunction, WinterFlowStrategyResolver winterFlowStrategyResolver) {
        this.WinterFlowVariableVersionControl = winterFlowTransactionFunction;
        this.WinterFlowTransactionManagerStrategy = winterFlowStrategyResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowStrategyPackage WinterFlowConsumerUserManager(WinterFlowRendererProvider winterFlowRendererProvider) {
        return WinterFlowTestingCloud.WinterFlowBatchUI(this, winterFlowRendererProvider);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return WinterFlowTestingCloud.WinterFlowArrayHelper(this, winterFlowEncryptionMicroservice);
    }

    public final void WinterFlowRouterStructure(WinterFlowStrategyResolver winterFlowStrategyResolver) {
        if (this.WinterFlowTransactionManagerStrategy == winterFlowStrategyResolver) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        WinterFlowTransactionFunction winterFlowTransactionFunction = this.WinterFlowVariableVersionControl;
        if (winterFlowTransactionFunction != null) {
            winterFlowTransactionFunction.WinterFlowRouterStructure(winterFlowStrategyResolver);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final Object WinterFlowServiceUtility(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return winterFlowEventEvent.WinterFlowVariableVersionControl(obj, this);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowThreadListener(WinterFlowRendererProvider winterFlowRendererProvider) {
        return WinterFlowTestingCloud.WinterFlowEventEmitterController(this, winterFlowRendererProvider);
    }

    @Override // com.google.android.datatransport.WinterFlowStrategyPackage
    public final WinterFlowRendererProvider getKey() {
        return WinterFlowSessionManagerProcess.WinterFlowBackendCacheManager;
    }
}
