package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseProcess implements AutoCloseable, WinterFlowAdapterResponse {
    public final WinterFlowEncryptionMicroservice WinterFlowVariableVersionControl;

    public WinterFlowDatabaseProcess(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        winterFlowEncryptionMicroservice.getClass();
        this.WinterFlowVariableVersionControl = winterFlowEncryptionMicroservice;
    }

    @Override // com.google.android.datatransport.WinterFlowAdapterResponse
    public final WinterFlowEncryptionMicroservice WinterFlowRouterRouter() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        WinterFlowInvokerComponent.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, null);
    }
}
