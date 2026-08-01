package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeResponse implements WinterFlowGatewayFramework, Iterable, WinterFlowLoaderProcess {
    public final int WinterFlowTransactionManagerStrategy;
    public final WinterFlowInvokerVersion WinterFlowUnitTestResponse;
    public final WinterFlowMapperInterface WinterFlowVariableVersionControl;

    public WinterFlowRuntimeResponse(WinterFlowMapperInterface winterFlowMapperInterface, int i, WinterFlowSchedulerAgent winterFlowSchedulerAgent, WinterFlowInvokerVersion winterFlowInvokerVersion) {
        this.WinterFlowVariableVersionControl = winterFlowMapperInterface;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowInvokerVersion;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowRuntimeResponse)) {
            return false;
        }
        WinterFlowRuntimeResponse winterFlowRuntimeResponse = (WinterFlowRuntimeResponse) obj;
        return winterFlowRuntimeResponse.WinterFlowTransactionManagerStrategy == this.WinterFlowTransactionManagerStrategy && winterFlowRuntimeResponse.WinterFlowVariableVersionControl == this.WinterFlowVariableVersionControl && winterFlowRuntimeResponse.WinterFlowUnitTestResponse.equals(this.WinterFlowUnitTestResponse);
    }

    public final int hashCode() {
        return this.WinterFlowUnitTestResponse.hashCode() + ((this.WinterFlowVariableVersionControl.hashCode() + (this.WinterFlowTransactionManagerStrategy * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowStrategySoftware(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, null, this.WinterFlowUnitTestResponse);
    }
}
