package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEFrontend extends WinterFlowWidgetAlgorithm {
    public final /* synthetic */ WinterFlowRequestListener WinterFlowTransactionManagerStrategy;
    public int WinterFlowVariableVersionControl;

    public WinterFlowIDEFrontend(WinterFlowRequestListener winterFlowRequestListener) {
        this.WinterFlowTransactionManagerStrategy = winterFlowRequestListener;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowVariableVersionControl < this.WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork();
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetAlgorithm
    public final int nextInt() {
        int i = this.WinterFlowVariableVersionControl;
        this.WinterFlowVariableVersionControl = i + 1;
        return this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource(i);
    }
}
