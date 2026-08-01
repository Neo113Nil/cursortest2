package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorAdapter {
    public final long WinterFlowHookDataSource;
    public final WinterFlowConcurrencyParser WinterFlowRouterStructure;

    public WinterFlowDecoratorAdapter(WinterFlowInvokerStructure winterFlowInvokerStructure, long j) {
        this.WinterFlowRouterStructure = winterFlowInvokerStructure;
        this.WinterFlowHookDataSource = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDecoratorAdapter)) {
            return false;
        }
        WinterFlowDecoratorAdapter winterFlowDecoratorAdapter = (WinterFlowDecoratorAdapter) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowDecoratorAdapter.WinterFlowRouterStructure) && WinterFlowHandlerConsumer.WinterFlowHookDataSource(this.WinterFlowHookDataSource, winterFlowDecoratorAdapter.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.WinterFlowRouterStructure + ", constraints=" + ((Object) WinterFlowHandlerConsumer.WinterFlowTransactionAgent(this.WinterFlowHookDataSource)) + ')';
    }
}
