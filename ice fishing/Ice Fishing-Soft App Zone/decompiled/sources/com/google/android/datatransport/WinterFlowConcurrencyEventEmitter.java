package com.google.android.datatransport;

import android.os.Handler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyEventEmitter implements WinterFlowDecoratorVersion {
    public static final WinterFlowConcurrencyEventEmitter WinterFlowThreadListener = new WinterFlowConcurrencyEventEmitter();
    public Handler WinterFlowSyntax;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowVariableVersionControl;
    public boolean WinterFlowUnitTestResponse = true;
    public boolean WinterFlowRouterRouter = true;
    public final WinterFlowDatabaseUtility WinterFlowResponseEngine = new WinterFlowDatabaseUtility(this, true);
    public final WinterFlowServerConcurrency WinterFlowTransactionAgent = new WinterFlowServerConcurrency(7, this);
    public final WinterFlowJSONDecorator WinterFlowServerProtocol = new WinterFlowJSONDecorator(19, this);

    public final void WinterFlowCacheManagerAgent() {
        int i = this.WinterFlowTransactionManagerStrategy + 1;
        this.WinterFlowTransactionManagerStrategy = i;
        if (i == 1) {
            if (this.WinterFlowUnitTestResponse) {
                this.WinterFlowResponseEngine.WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_RESUME);
                this.WinterFlowUnitTestResponse = false;
            } else {
                Handler handler = this.WinterFlowSyntax;
                handler.getClass();
                handler.removeCallbacks(this.WinterFlowTransactionAgent);
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorVersion
    public final WinterFlowDatabaseUtility WinterFlowUnitTestResponse() {
        return this.WinterFlowResponseEngine;
    }
}
