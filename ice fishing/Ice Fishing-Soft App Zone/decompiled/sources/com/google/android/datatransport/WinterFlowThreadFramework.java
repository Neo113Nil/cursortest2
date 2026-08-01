package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadFramework implements Iterator, WinterFlowLoaderProcess {
    public boolean WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowMicroserviceProtocol WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl = -1;

    public WinterFlowThreadFramework(WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol) {
        this.WinterFlowUnitTestResponse = winterFlowMicroserviceProtocol;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowVariableVersionControl + 1 < this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowArrayNetwork();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        this.WinterFlowTransactionManagerStrategy = true;
        WinterFlowRequestListener winterFlowRequestListener = this.WinterFlowUnitTestResponse.WinterFlowHookDataSource;
        int i = this.WinterFlowVariableVersionControl + 1;
        this.WinterFlowVariableVersionControl = i;
        return (WinterFlowServerLayer) winterFlowRequestListener.WinterFlowVariableVersionControl(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.WinterFlowTransactionManagerStrategy) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You must call next() before you can remove an element");
            return;
        }
        WinterFlowRequestListener winterFlowRequestListener = this.WinterFlowUnitTestResponse.WinterFlowHookDataSource;
        ((WinterFlowServerLayer) winterFlowRequestListener.WinterFlowVariableVersionControl(this.WinterFlowVariableVersionControl)).WinterFlowUnitTestResponse = null;
        int i = this.WinterFlowVariableVersionControl;
        Object[] objArr = winterFlowRequestListener.WinterFlowUnitTestResponse;
        Object obj = objArr[i];
        Object obj2 = WinterFlowCloudStack.WinterFlowUnitTestResponse;
        if (obj != obj2) {
            objArr[i] = obj2;
            winterFlowRequestListener.WinterFlowVariableVersionControl = true;
        }
        this.WinterFlowVariableVersionControl = i - 1;
        this.WinterFlowTransactionManagerStrategy = false;
    }
}
