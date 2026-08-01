package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocketLayer implements WinterFlowBatchLayer {
    public final float WinterFlowTransactionManagerStrategy;
    public final WinterFlowTransactionManagerEvent WinterFlowVariableVersionControl;

    public WinterFlowWebsocketLayer(WinterFlowTransactionManagerEvent winterFlowTransactionManagerEvent, float f) {
        this.WinterFlowVariableVersionControl = winterFlowTransactionManagerEvent;
        this.WinterFlowTransactionManagerStrategy = f;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchLayer
    public final long WinterFlowArrayNetwork() {
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchLayer
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchLayer
    public final WinterFlowHandlerWebsocket WinterFlowTransactionAgent() {
        return this.WinterFlowVariableVersionControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowWebsocketLayer)) {
            return false;
        }
        WinterFlowWebsocketLayer winterFlowWebsocketLayer = (WinterFlowWebsocketLayer) obj;
        return this.WinterFlowVariableVersionControl.equals(winterFlowWebsocketLayer.WinterFlowVariableVersionControl) && Float.compare(this.WinterFlowTransactionManagerStrategy, winterFlowWebsocketLayer.WinterFlowTransactionManagerStrategy) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowTransactionManagerStrategy) + (this.WinterFlowVariableVersionControl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", alpha=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowTransactionManagerStrategy, ')');
    }
}
