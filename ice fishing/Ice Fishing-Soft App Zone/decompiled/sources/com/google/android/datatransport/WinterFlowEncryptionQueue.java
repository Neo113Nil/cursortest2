package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryptionQueue extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowCloudComponent WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowRouterRouter;
    public int WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowEncryptionQueue(WinterFlowCloudComponent winterFlowCloudComponent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowCloudComponent;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowSyntax |= Integer.MIN_VALUE;
        return this.WinterFlowResponseEngine.WinterFlowRouterRouter(null, this);
    }
}
