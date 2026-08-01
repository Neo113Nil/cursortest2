package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderPackage {
    public final float WinterFlowRouterStructure;

    public WinterFlowProviderPackage(float f) {
        this.WinterFlowRouterStructure = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowProviderPackage) && Float.compare(this.WinterFlowRouterStructure, ((WinterFlowProviderPackage) obj).WinterFlowRouterStructure) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(new StringBuilder("Vertical(bias="), this.WinterFlowRouterStructure, ')');
    }
}
