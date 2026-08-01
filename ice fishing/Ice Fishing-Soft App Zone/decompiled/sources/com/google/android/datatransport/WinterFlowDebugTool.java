package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugTool extends WinterFlowOrchestrationCompiler {
    public int WinterFlowResponseEngine;
    public Object WinterFlowRouterRouter;
    public /* synthetic */ Object WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public WinterFlowLibraryInterface WinterFlowSyntax;
    public final /* synthetic */ WinterFlowXMLDebug WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowDebugTool(WinterFlowXMLDebug winterFlowXMLDebug, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowThreadListener = winterFlowXMLDebug;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowServerProtocol = obj;
        this.WinterFlowServiceUtility |= Integer.MIN_VALUE;
        return this.WinterFlowThreadListener.WinterFlowRouterStructure(null, null, this);
    }
}
