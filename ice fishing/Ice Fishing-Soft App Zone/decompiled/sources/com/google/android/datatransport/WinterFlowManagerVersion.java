package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerVersion extends WinterFlowRuntimeConcurrency {
    public final /* synthetic */ WinterFlowTransactionManagerLayer WinterFlowRouterRouter;
    public int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowManagerVersion(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2, WinterFlowEventEvent winterFlowEventEvent) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowUnitTestResponse = winterFlowEventEvent;
        this.WinterFlowRouterRouter = winterFlowTransactionManagerLayer2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        if (i != 0) {
            if (i != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This coroutine had already completed");
                return null;
            }
            this.WinterFlowTransactionManagerStrategy = 2;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            return obj;
        }
        this.WinterFlowTransactionManagerStrategy = 1;
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowEventEvent winterFlowEventEvent = this.WinterFlowUnitTestResponse;
        winterFlowEventEvent.getClass();
        WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(2, winterFlowEventEvent);
        return winterFlowEventEvent.WinterFlowVariableVersionControl(this.WinterFlowRouterRouter, this);
    }
}
