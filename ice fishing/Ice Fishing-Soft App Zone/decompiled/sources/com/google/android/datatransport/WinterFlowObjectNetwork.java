package com.google.android.datatransport;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectNetwork implements Iterator {
    public final /* synthetic */ WinterFlowDataSourceNetwork WinterFlowRouterRouter;
    public boolean WinterFlowTransactionManagerStrategy;
    public Iterator WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl = -1;

    public WinterFlowObjectNetwork(WinterFlowDataSourceNetwork winterFlowDataSourceNetwork) {
        this.WinterFlowRouterRouter = winterFlowDataSourceNetwork;
    }

    public final Iterator WinterFlowRouterStructure() {
        Iterator it = this.WinterFlowUnitTestResponse;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy.entrySet().iterator();
        this.WinterFlowUnitTestResponse = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.WinterFlowVariableVersionControl + 1;
        WinterFlowDataSourceNetwork winterFlowDataSourceNetwork = this.WinterFlowRouterRouter;
        return i < winterFlowDataSourceNetwork.WinterFlowVariableVersionControl.size() || (!winterFlowDataSourceNetwork.WinterFlowTransactionManagerStrategy.isEmpty() && WinterFlowRouterStructure().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.WinterFlowTransactionManagerStrategy = true;
        int i = this.WinterFlowVariableVersionControl + 1;
        this.WinterFlowVariableVersionControl = i;
        WinterFlowDataSourceNetwork winterFlowDataSourceNetwork = this.WinterFlowRouterRouter;
        return i < winterFlowDataSourceNetwork.WinterFlowVariableVersionControl.size() ? (Map.Entry) winterFlowDataSourceNetwork.WinterFlowVariableVersionControl.get(this.WinterFlowVariableVersionControl) : (Map.Entry) WinterFlowRouterStructure().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.WinterFlowTransactionManagerStrategy) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("remove() was called before next()");
            return;
        }
        this.WinterFlowTransactionManagerStrategy = false;
        int i = WinterFlowDataSourceNetwork.WinterFlowResponseEngine;
        WinterFlowDataSourceNetwork winterFlowDataSourceNetwork = this.WinterFlowRouterRouter;
        winterFlowDataSourceNetwork.WinterFlowHookDataSource();
        if (this.WinterFlowVariableVersionControl >= winterFlowDataSourceNetwork.WinterFlowVariableVersionControl.size()) {
            WinterFlowRouterStructure().remove();
            return;
        }
        int i2 = this.WinterFlowVariableVersionControl;
        this.WinterFlowVariableVersionControl = i2 - 1;
        winterFlowDataSourceNetwork.WinterFlowRouterRouter(i2);
    }
}
