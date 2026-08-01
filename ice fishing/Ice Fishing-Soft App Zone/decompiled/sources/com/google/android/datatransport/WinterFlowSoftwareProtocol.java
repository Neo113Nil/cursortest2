package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareProtocol implements WinterFlowThreadPoolGateway, WinterFlowAdapterResponse {
    public final WinterFlowEncryptionMicroservice WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowThreadPoolGateway WinterFlowVariableVersionControl;

    public WinterFlowSoftwareProtocol(WinterFlowThreadPoolGateway winterFlowThreadPoolGateway, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        this.WinterFlowVariableVersionControl = winterFlowThreadPoolGateway;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionMicroservice;
    }

    @Override // com.google.android.datatransport.WinterFlowAdapterResponse
    public final WinterFlowEncryptionMicroservice WinterFlowRouterRouter() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return this.WinterFlowVariableVersionControl.getValue();
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolGateway
    public final void setValue(Object obj) {
        this.WinterFlowVariableVersionControl.setValue(obj);
    }
}
