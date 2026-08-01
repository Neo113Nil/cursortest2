package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthStrategy {
    public final int WinterFlowRouterStructure;

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowBandwidthStrategy) {
            return this.WinterFlowRouterStructure == ((WinterFlowBandwidthStrategy) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        int i = this.WinterFlowRouterStructure;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
