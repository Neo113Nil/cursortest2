package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyScript extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowBandwidthObject;
    public int WinterFlowOrchestrationSubsystem;
    public Serializable WinterFlowResponseEngine;
    public Object WinterFlowRouterRouter;
    public boolean WinterFlowServerProtocol;
    public /* synthetic */ Object WinterFlowServiceUtility;
    public Object WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public WinterFlowBandwidthCache WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowConcurrencyScript(WinterFlowStrategyResolver winterFlowStrategyResolver, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowBandwidthObject = winterFlowStrategyResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowServiceUtility = obj;
        this.WinterFlowOrchestrationSubsystem |= Integer.MIN_VALUE;
        return this.WinterFlowBandwidthObject.WinterFlowSyntax(false, this);
    }
}
