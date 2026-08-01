package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseVersionControl extends WinterFlowSessionEntity {
    public final WinterFlowControllerScript WinterFlowSyntax;

    public WinterFlowResponseVersionControl(WinterFlowControllerScript winterFlowControllerScript, WinterFlowEventProvider winterFlowEventProvider, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        super(winterFlowEventProvider, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
        this.WinterFlowSyntax = winterFlowControllerScript;
    }

    @Override // com.google.android.datatransport.WinterFlowSessionEntity
    public final Object WinterFlowRouterRouter(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Object WinterFlowOrchestrationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem(new WinterFlowModuleManager(this, winterFlowCacheInterface, null), winterFlowTransactionManagerLayer);
        return WinterFlowOrchestrationSubsystem == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowOrchestrationSubsystem : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationSession
    public final WinterFlowConfigurationSession WinterFlowVariableVersionControl(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        return new WinterFlowResponseVersionControl(this.WinterFlowSyntax, this.WinterFlowRouterRouter, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
    }
}
