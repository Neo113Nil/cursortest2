package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayService implements Iterator, WinterFlowLoaderProcess {
    public final int WinterFlowRouterRouter;
    public final int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public final WinterFlowMapperInterface WinterFlowVariableVersionControl;

    public WinterFlowArrayService(WinterFlowMapperInterface winterFlowMapperInterface, int i, int i2) {
        this.WinterFlowVariableVersionControl = winterFlowMapperInterface;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = winterFlowMapperInterface.WinterFlowServerProtocol;
        if (winterFlowMapperInterface.WinterFlowTransactionAgent) {
            WinterFlowQueryTool.WinterFlowVariableVersionControl();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowUnitTestResponse < this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.Iterator
    public final Object next() {
        WinterFlowMapperInterface winterFlowMapperInterface = this.WinterFlowVariableVersionControl;
        int i = winterFlowMapperInterface.WinterFlowServerProtocol;
        int i2 = this.WinterFlowRouterRouter;
        if (i != i2) {
            WinterFlowQueryTool.WinterFlowVariableVersionControl();
        }
        int i3 = this.WinterFlowUnitTestResponse;
        this.WinterFlowUnitTestResponse = winterFlowMapperInterface.WinterFlowVariableVersionControl[(i3 * 5) + 3] + i3;
        return new WinterFlowSessionManagerOrchestration(winterFlowMapperInterface, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
