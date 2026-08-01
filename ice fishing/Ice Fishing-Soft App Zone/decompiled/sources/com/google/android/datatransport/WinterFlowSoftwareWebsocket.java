package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareWebsocket implements WinterFlowTransactionManagerLayer, WinterFlowEventConfiguration {
    public final WinterFlowEncryptionMicroservice WinterFlowTransactionManagerStrategy;
    public final WinterFlowTransactionManagerLayer WinterFlowVariableVersionControl;

    public WinterFlowSoftwareWebsocket(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        this.WinterFlowVariableVersionControl = winterFlowTransactionManagerLayer;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionMicroservice;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        this.WinterFlowVariableVersionControl.WinterFlowSyntax(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowEventConfiguration
    public final WinterFlowEventConfiguration WinterFlowTransactionManagerStrategy() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowVariableVersionControl;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowEventConfiguration) {
            return (WinterFlowEventConfiguration) winterFlowTransactionManagerLayer;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        return this.WinterFlowTransactionManagerStrategy;
    }
}
