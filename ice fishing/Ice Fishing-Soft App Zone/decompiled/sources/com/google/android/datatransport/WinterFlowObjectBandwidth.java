package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectBandwidth extends WinterFlowWidgetAlgorithm {
    public int WinterFlowRouterRouter;
    public final int WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowObjectBandwidth(int i, int i2, int i3) {
        this.WinterFlowVariableVersionControl = i3;
        this.WinterFlowTransactionManagerStrategy = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.WinterFlowUnitTestResponse = z;
        this.WinterFlowRouterRouter = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetAlgorithm
    public final int nextInt() {
        int i = this.WinterFlowRouterRouter;
        if (i != this.WinterFlowTransactionManagerStrategy) {
            this.WinterFlowRouterRouter = this.WinterFlowVariableVersionControl + i;
            return i;
        }
        if (this.WinterFlowUnitTestResponse) {
            this.WinterFlowUnitTestResponse = false;
            return i;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
        return 0;
    }
}
