package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheMechanism extends WinterFlowUserManagerController implements WinterFlowBackendXML {
    public boolean WinterFlowBatchUI;
    public float WinterFlowVariableBandwidth;

    @Override // com.google.android.datatransport.WinterFlowBackendXML
    public final Object WinterFlowBandwidth(Object obj) {
        WinterFlowInvokerRepository winterFlowInvokerRepository = obj instanceof WinterFlowInvokerRepository ? (WinterFlowInvokerRepository) obj : null;
        if (winterFlowInvokerRepository == null) {
            winterFlowInvokerRepository = new WinterFlowInvokerRepository();
        }
        winterFlowInvokerRepository.WinterFlowRouterStructure = this.WinterFlowVariableBandwidth;
        winterFlowInvokerRepository.WinterFlowHookDataSource = this.WinterFlowBatchUI;
        return winterFlowInvokerRepository;
    }
}
