package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaMapper extends WinterFlowOrchestrationCompiler {
    public final /* synthetic */ WinterFlowTransactionManagerLayer WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowDatabaseSchemaMapper(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2) {
        super(winterFlowTransactionManagerLayer, winterFlowEncryptionMicroservice);
        this.WinterFlowSyntax = winterFlowEventEvent;
        this.WinterFlowResponseEngine = winterFlowTransactionManagerLayer2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowRouterRouter;
        if (i != 0) {
            if (i != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This coroutine had already completed");
                return null;
            }
            this.WinterFlowRouterRouter = 2;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            return obj;
        }
        this.WinterFlowRouterRouter = 1;
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowEventEvent winterFlowEventEvent = this.WinterFlowSyntax;
        winterFlowEventEvent.getClass();
        WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(2, winterFlowEventEvent);
        return winterFlowEventEvent.WinterFlowVariableVersionControl(this.WinterFlowResponseEngine, this);
    }
}
