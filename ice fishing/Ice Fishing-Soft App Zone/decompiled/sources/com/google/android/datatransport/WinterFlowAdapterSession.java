package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterSession extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowGatewaySession WinterFlowBandwidthObject;
    public int WinterFlowOrchestrationSubsystem;
    public String[] WinterFlowResponseEngine;
    public WinterFlowJavaDeployment WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public /* synthetic */ Object WinterFlowServiceUtility;
    public String WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowAdapterSession(WinterFlowGatewaySession winterFlowGatewaySession, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowBandwidthObject = winterFlowGatewaySession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowServiceUtility = obj;
        this.WinterFlowOrchestrationSubsystem |= Integer.MIN_VALUE;
        return this.WinterFlowBandwidthObject.WinterFlowCacheManagerAgent(null, 0, this);
    }
}
