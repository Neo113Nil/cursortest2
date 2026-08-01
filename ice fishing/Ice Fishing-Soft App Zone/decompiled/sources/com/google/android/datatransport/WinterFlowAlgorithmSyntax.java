package com.google.android.datatransport;

import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmSyntax implements WinterFlowExceptionHandler, WinterFlowNodeProtocol {
    public WinterFlowDatabaseUtility WinterFlowRouterRouter;
    public WinterFlowEventTool WinterFlowSyntax = WinterFlowConfigurationMechanism.WinterFlowRouterStructure;
    public final WinterFlowTransactionBackend WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final WinterFlowSyntaxTransactionManager WinterFlowVariableVersionControl;

    public WinterFlowAlgorithmSyntax(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, WinterFlowTransactionBackend winterFlowTransactionBackend) {
        this.WinterFlowVariableVersionControl = winterFlowSyntaxTransactionManager;
        this.WinterFlowTransactionManagerStrategy = winterFlowTransactionBackend;
    }

    public final void WinterFlowCacheManagerAgent(WinterFlowEventEvent winterFlowEventEvent) {
        this.WinterFlowVariableVersionControl.setOnReadyForComposition(new WinterFlowAPIDataSource(8, this, (WinterFlowEventTool) winterFlowEventEvent));
    }

    public final void WinterFlowRouterStructure() {
        if (!this.WinterFlowUnitTestResponse) {
            this.WinterFlowUnitTestResponse = true;
            this.WinterFlowVariableVersionControl.getView().setTag(R.id.wrapped_composition_tag, null);
            WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowRouterRouter;
            if (winterFlowDatabaseUtility != null) {
                winterFlowDatabaseUtility.WinterFlowTransactionManagerStrategy(this);
            }
            this.WinterFlowRouterRouter = null;
        }
        this.WinterFlowTransactionManagerStrategy.WinterFlowThreadListener();
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_DESTROY) {
            WinterFlowRouterStructure();
        } else {
            if (winterFlowMicroserviceProcess != WinterFlowMicroserviceProcess.ON_CREATE || this.WinterFlowUnitTestResponse) {
                return;
            }
            WinterFlowCacheManagerAgent(this.WinterFlowSyntax);
        }
    }
}
