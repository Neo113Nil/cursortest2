package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderDecorator implements WinterFlowEncryptionMicroservice {
    public final Throwable WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowEncryptionMicroservice WinterFlowVariableVersionControl;

    public WinterFlowServiceProviderDecorator(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Throwable th) {
        this.WinterFlowVariableVersionControl = winterFlowEncryptionMicroservice;
        this.WinterFlowTransactionManagerStrategy = th;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowStrategyPackage WinterFlowConsumerUserManager(WinterFlowRendererProvider winterFlowRendererProvider) {
        return this.WinterFlowVariableVersionControl.WinterFlowConsumerUserManager(winterFlowRendererProvider);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return this.WinterFlowVariableVersionControl.WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final Object WinterFlowServiceUtility(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowServiceUtility(winterFlowEventEvent, obj);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowThreadListener(WinterFlowRendererProvider winterFlowRendererProvider) {
        return this.WinterFlowVariableVersionControl.WinterFlowThreadListener(winterFlowRendererProvider);
    }
}
