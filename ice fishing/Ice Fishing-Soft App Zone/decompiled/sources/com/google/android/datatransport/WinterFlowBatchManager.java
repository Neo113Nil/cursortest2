package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchManager implements WinterFlowNodeProtocol, AutoCloseable {
    public final WinterFlowOrchestrationMapper WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowBatchManager(String str, WinterFlowOrchestrationMapper winterFlowOrchestrationMapper) {
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = winterFlowOrchestrationMapper;
    }

    public final void WinterFlowRouterRouter(WinterFlowAlgorithmArray winterFlowAlgorithmArray, WinterFlowDatabaseUtility winterFlowDatabaseUtility) {
        winterFlowAlgorithmArray.getClass();
        winterFlowDatabaseUtility.getClass();
        if (this.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Already attached to lifecycleOwner");
            return;
        }
        this.WinterFlowUnitTestResponse = true;
        winterFlowDatabaseUtility.WinterFlowRouterStructure(this);
        winterFlowAlgorithmArray.WinterFlowArrayHelper(this.WinterFlowVariableVersionControl, (WinterFlowTestingRepository) this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource.WinterFlowSyntax);
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_DESTROY) {
            this.WinterFlowUnitTestResponse = false;
            winterFlowDecoratorVersion.WinterFlowUnitTestResponse().WinterFlowTransactionManagerStrategy(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
