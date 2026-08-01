package com.google.android.datatransport;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerServer implements Iterator, Map.Entry {
    public final /* synthetic */ WinterFlowUnitTestSystem WinterFlowRouterRouter;
    public int WinterFlowTransactionManagerStrategy = -1;
    public boolean WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    public WinterFlowSessionManagerServer(WinterFlowUnitTestSystem winterFlowUnitTestSystem) {
        this.WinterFlowRouterRouter = winterFlowUnitTestSystem;
        this.WinterFlowVariableVersionControl = winterFlowUnitTestSystem.WinterFlowUnitTestResponse - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.WinterFlowTransactionManagerStrategy;
            WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowRouterRouter;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(key, winterFlowUnitTestSystem.WinterFlowVariableVersionControl(i)) && WinterFlowManagerRequest.WinterFlowThreadListener(entry.getValue(), winterFlowUnitTestSystem.WinterFlowRouterRouter(this.WinterFlowTransactionManagerStrategy))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.WinterFlowUnitTestResponse) {
            return this.WinterFlowRouterRouter.WinterFlowVariableVersionControl(this.WinterFlowTransactionManagerStrategy);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.WinterFlowUnitTestResponse) {
            return this.WinterFlowRouterRouter.WinterFlowRouterRouter(this.WinterFlowTransactionManagerStrategy);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowTransactionManagerStrategy < this.WinterFlowVariableVersionControl;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowRouterRouter;
        Object WinterFlowVariableVersionControl = winterFlowUnitTestSystem.WinterFlowVariableVersionControl(i);
        Object WinterFlowRouterRouter = winterFlowUnitTestSystem.WinterFlowRouterRouter(this.WinterFlowTransactionManagerStrategy);
        return (WinterFlowVariableVersionControl == null ? 0 : WinterFlowVariableVersionControl.hashCode()) ^ (WinterFlowRouterRouter != null ? WinterFlowRouterRouter.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        this.WinterFlowTransactionManagerStrategy++;
        this.WinterFlowUnitTestResponse = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.WinterFlowUnitTestResponse) {
            throw new IllegalStateException();
        }
        this.WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy);
        this.WinterFlowTransactionManagerStrategy--;
        this.WinterFlowVariableVersionControl--;
        this.WinterFlowUnitTestResponse = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.WinterFlowUnitTestResponse) {
            return this.WinterFlowRouterRouter.WinterFlowUnitTestResponse(this.WinterFlowTransactionManagerStrategy, obj);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
