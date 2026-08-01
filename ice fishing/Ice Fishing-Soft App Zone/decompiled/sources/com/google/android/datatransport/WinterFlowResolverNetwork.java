package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverNetwork implements WinterFlowConcurrencyParser {
    public final float WinterFlowTransactionManagerStrategy;
    public final float WinterFlowVariableVersionControl;

    public WinterFlowResolverNetwork(float f, float f2) {
        this.WinterFlowVariableVersionControl = f;
        this.WinterFlowTransactionManagerStrategy = f2;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowRouterRouter() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowResolverNetwork)) {
            return false;
        }
        WinterFlowResolverNetwork winterFlowResolverNetwork = (WinterFlowResolverNetwork) obj;
        return Float.compare(this.WinterFlowVariableVersionControl, winterFlowResolverNetwork.WinterFlowVariableVersionControl) == 0 && Float.compare(this.WinterFlowTransactionManagerStrategy, winterFlowResolverNetwork.WinterFlowTransactionManagerStrategy) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowTransactionManagerStrategy) + (Float.hashCode(this.WinterFlowVariableVersionControl) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", fontScale=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowTransactionManagerStrategy, ')');
    }
}
