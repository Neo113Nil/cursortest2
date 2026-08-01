package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAPIMechanism extends WinterFlowOrchestrationCompiler {
    public int WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowConcurrencyThread WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowAPIMechanism(WinterFlowConcurrencyThread winterFlowConcurrencyThread, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(winterFlowOrchestrationCompiler);
        this.WinterFlowSyntax = winterFlowConcurrencyThread;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowResponseEngine |= Integer.MIN_VALUE;
        return this.WinterFlowSyntax.WinterFlowInheritanceJava(this);
    }
}
