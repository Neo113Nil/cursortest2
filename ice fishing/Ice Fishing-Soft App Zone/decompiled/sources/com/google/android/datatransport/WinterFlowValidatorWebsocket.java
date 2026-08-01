package com.google.android.datatransport;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowValidatorWebsocket {
    public Object WinterFlowRouterRouter;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    public WinterFlowValidatorWebsocket() {
        if (WinterFlowAlgorithmDebug.WinterFlowTransactionManagerStrategy == null) {
            WinterFlowAlgorithmDebug.WinterFlowTransactionManagerStrategy = new WinterFlowAlgorithmDebug(29);
        }
    }

    public void WinterFlowCacheManagerAgent() {
        while (true) {
            int i = this.WinterFlowVariableVersionControl;
            WinterFlowDatabaseScript winterFlowDatabaseScript = (WinterFlowDatabaseScript) this.WinterFlowRouterRouter;
            if (i >= winterFlowDatabaseScript.WinterFlowResponseEngine || winterFlowDatabaseScript.WinterFlowUnitTestResponse[i] >= 0) {
                return;
            } else {
                this.WinterFlowVariableVersionControl = i + 1;
            }
        }
    }

    public void WinterFlowHookDataSource() {
        if (((WinterFlowDatabaseScript) this.WinterFlowRouterRouter).WinterFlowServerProtocol != this.WinterFlowUnitTestResponse) {
            throw new ConcurrentModificationException();
        }
    }

    public int WinterFlowRouterStructure(int i) {
        if (i < this.WinterFlowUnitTestResponse) {
            return ((ByteBuffer) this.WinterFlowRouterRouter).getShort(this.WinterFlowTransactionManagerStrategy + i);
        }
        return 0;
    }

    public boolean hasNext() {
        return this.WinterFlowVariableVersionControl < ((WinterFlowDatabaseScript) this.WinterFlowRouterRouter).WinterFlowResponseEngine;
    }

    public void remove() {
        WinterFlowDatabaseScript winterFlowDatabaseScript = (WinterFlowDatabaseScript) this.WinterFlowRouterRouter;
        WinterFlowHookDataSource();
        if (this.WinterFlowTransactionManagerStrategy == -1) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Call next() before removing element from the iterator.");
            return;
        }
        winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
        winterFlowDatabaseScript.WinterFlowTransactionAgent(this.WinterFlowTransactionManagerStrategy);
        this.WinterFlowTransactionManagerStrategy = -1;
        this.WinterFlowUnitTestResponse = winterFlowDatabaseScript.WinterFlowServerProtocol;
    }
}
