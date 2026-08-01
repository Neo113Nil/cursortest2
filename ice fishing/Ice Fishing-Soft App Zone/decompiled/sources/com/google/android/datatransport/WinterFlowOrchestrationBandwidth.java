package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationBandwidth implements WinterFlowNodeProtocol, WinterFlowAdapterResponse {
    public final WinterFlowEncryptionMicroservice WinterFlowTransactionManagerStrategy;
    public final WinterFlowDatabaseUtility WinterFlowVariableVersionControl;

    public WinterFlowOrchestrationBandwidth(WinterFlowDatabaseUtility winterFlowDatabaseUtility, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        winterFlowEncryptionMicroservice.getClass();
        this.WinterFlowVariableVersionControl = winterFlowDatabaseUtility;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionMicroservice;
        if (winterFlowDatabaseUtility.WinterFlowSyntax == WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl) {
            WinterFlowInvokerComponent.WinterFlowThreadListener(winterFlowEncryptionMicroservice, null);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAdapterResponse
    public final WinterFlowEncryptionMicroservice WinterFlowRouterRouter() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseUtility.WinterFlowSyntax.compareTo(WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl) <= 0) {
            winterFlowDatabaseUtility.WinterFlowTransactionManagerStrategy(this);
            WinterFlowInvokerComponent.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, null);
        }
    }
}
