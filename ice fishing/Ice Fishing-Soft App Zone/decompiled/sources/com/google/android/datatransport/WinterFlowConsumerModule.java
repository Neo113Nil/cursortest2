package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerModule implements WinterFlowStrategyPackage {
    public final ThreadLocal WinterFlowTransactionManagerStrategy;
    public final WinterFlowAdapterSystem WinterFlowUnitTestResponse;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowConsumerModule(Object obj, ThreadLocal threadLocal) {
        this.WinterFlowVariableVersionControl = obj;
        this.WinterFlowTransactionManagerStrategy = threadLocal;
        this.WinterFlowUnitTestResponse = new WinterFlowAdapterSystem(threadLocal);
    }

    public final Object WinterFlowCacheManagerAgent() {
        ThreadLocal threadLocal = this.WinterFlowTransactionManagerStrategy;
        Object obj = threadLocal.get();
        threadLocal.set(this.WinterFlowVariableVersionControl);
        return obj;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowStrategyPackage WinterFlowConsumerUserManager(WinterFlowRendererProvider winterFlowRendererProvider) {
        if (this.WinterFlowUnitTestResponse.equals(winterFlowRendererProvider)) {
            return this;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return WinterFlowTestingCloud.WinterFlowArrayHelper(this, winterFlowEncryptionMicroservice);
    }

    public final void WinterFlowRouterStructure(Object obj) {
        this.WinterFlowTransactionManagerStrategy.set(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final Object WinterFlowServiceUtility(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return winterFlowEventEvent.WinterFlowVariableVersionControl(obj, this);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowThreadListener(WinterFlowRendererProvider winterFlowRendererProvider) {
        return this.WinterFlowUnitTestResponse.equals(winterFlowRendererProvider) ? WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl : this;
    }

    @Override // com.google.android.datatransport.WinterFlowStrategyPackage
    public final WinterFlowRendererProvider getKey() {
        return this.WinterFlowUnitTestResponse;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.WinterFlowVariableVersionControl + ", threadLocal = " + this.WinterFlowTransactionManagerStrategy + ')';
    }
}
