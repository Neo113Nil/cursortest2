package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRuntimeConcurrency extends WinterFlowVersionLayer {
    public WinterFlowRuntimeConcurrency(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        if (winterFlowTransactionManagerLayer == null || winterFlowTransactionManagerLayer.getContext() == WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        return WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
    }
}
