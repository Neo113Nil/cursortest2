package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderConcurrency implements Iterator {
    public final int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowMicroserviceCloud WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl = 0;

    public WinterFlowServiceProviderConcurrency(WinterFlowMicroserviceCloud winterFlowMicroserviceCloud) {
        this.WinterFlowUnitTestResponse = winterFlowMicroserviceCloud;
        this.WinterFlowTransactionManagerStrategy = winterFlowMicroserviceCloud.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowVariableVersionControl < this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowVariableVersionControl;
        if (i < this.WinterFlowTransactionManagerStrategy) {
            this.WinterFlowVariableVersionControl = i + 1;
            return Byte.valueOf(this.WinterFlowUnitTestResponse.WinterFlowUnitTestResponse(i));
        }
        WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
