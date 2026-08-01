package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerOrchestration implements WinterFlowGatewayFramework, Iterable, WinterFlowLoaderProcess {
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final WinterFlowMapperInterface WinterFlowVariableVersionControl;

    public WinterFlowSessionManagerOrchestration(WinterFlowMapperInterface winterFlowMapperInterface, int i, int i2) {
        this.WinterFlowVariableVersionControl = winterFlowMapperInterface;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowSessionManagerOrchestration)) {
            return false;
        }
        WinterFlowSessionManagerOrchestration winterFlowSessionManagerOrchestration = (WinterFlowSessionManagerOrchestration) obj;
        return winterFlowSessionManagerOrchestration.WinterFlowTransactionManagerStrategy == this.WinterFlowTransactionManagerStrategy && winterFlowSessionManagerOrchestration.WinterFlowUnitTestResponse == this.WinterFlowUnitTestResponse && winterFlowSessionManagerOrchestration.WinterFlowVariableVersionControl == this.WinterFlowVariableVersionControl;
    }

    public final int hashCode() {
        return (this.WinterFlowVariableVersionControl.hashCode() * 31) + this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        WinterFlowMapperInterface winterFlowMapperInterface = this.WinterFlowVariableVersionControl;
        if (winterFlowMapperInterface.WinterFlowServerProtocol != this.WinterFlowUnitTestResponse) {
            WinterFlowQueryTool.WinterFlowVariableVersionControl();
        }
        int i = this.WinterFlowTransactionManagerStrategy;
        winterFlowMapperInterface.WinterFlowUnitTestResponse(i);
        return new WinterFlowArrayService(winterFlowMapperInterface, i + 1, winterFlowMapperInterface.WinterFlowVariableVersionControl[(i * 5) + 3] + i);
    }
}
