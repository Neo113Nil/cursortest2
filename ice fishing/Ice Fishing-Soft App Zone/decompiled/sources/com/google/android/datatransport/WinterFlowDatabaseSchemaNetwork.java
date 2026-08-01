package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaNetwork extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ boolean WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowObjectUI WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowDatabaseSchemaNetwork(boolean z, WinterFlowObjectUI winterFlowObjectUI) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = z;
        this.WinterFlowUnitTestResponse = winterFlowObjectUI;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowPipelineVariable winterFlowPipelineVariable = (WinterFlowPipelineVariable) obj;
        boolean z = !this.WinterFlowTransactionManagerStrategy && ((Boolean) this.WinterFlowUnitTestResponse.WinterFlowRouterStructure()).booleanValue();
        if (winterFlowPipelineVariable.WinterFlowBandwidthObject != z) {
            winterFlowPipelineVariable.WinterFlowVariableVersionControl |= 16384;
            winterFlowPipelineVariable.WinterFlowBandwidthObject = z;
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
