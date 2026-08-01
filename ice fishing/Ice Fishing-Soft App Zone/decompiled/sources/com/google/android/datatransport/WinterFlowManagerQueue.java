package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerQueue extends WinterFlowServiceLayer {
    public final WinterFlowRenderer WinterFlowRouterRouter;
    public final Object[] WinterFlowUnitTestResponse;

    public WinterFlowManagerQueue(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.WinterFlowUnitTestResponse = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.WinterFlowRouterRouter = new WinterFlowRenderer(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        WinterFlowRenderer winterFlowRenderer = this.WinterFlowRouterRouter;
        if (winterFlowRenderer.hasNext()) {
            this.WinterFlowVariableVersionControl++;
            return winterFlowRenderer.next();
        }
        int i = this.WinterFlowVariableVersionControl;
        this.WinterFlowVariableVersionControl = i + 1;
        return this.WinterFlowUnitTestResponse[i - winterFlowRenderer.WinterFlowTransactionManagerStrategy];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowRenderer winterFlowRenderer = this.WinterFlowRouterRouter;
        int i2 = winterFlowRenderer.WinterFlowTransactionManagerStrategy;
        if (i <= i2) {
            this.WinterFlowVariableVersionControl = i - 1;
            return winterFlowRenderer.previous();
        }
        int i3 = i - 1;
        this.WinterFlowVariableVersionControl = i3;
        return this.WinterFlowUnitTestResponse[i3 - i2];
    }
}
