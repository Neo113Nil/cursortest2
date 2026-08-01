package com.google.android.datatransport;

import java.io.FileInputStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloud extends WinterFlowOrchestrationCompiler {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public Object WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public FileInputStream WinterFlowSyntax;
    public final /* synthetic */ WinterFlowVersionNetwork WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowCloud(WinterFlowVersionNetwork winterFlowVersionNetwork, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowTransactionAgent = winterFlowVersionNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowResponseEngine = obj;
        this.WinterFlowServerProtocol |= Integer.MIN_VALUE;
        return WinterFlowVersionNetwork.WinterFlowRouterStructure(this.WinterFlowTransactionAgent, this);
    }
}
