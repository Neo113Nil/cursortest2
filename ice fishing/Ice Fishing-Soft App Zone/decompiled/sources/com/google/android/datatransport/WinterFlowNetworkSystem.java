package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNetworkSystem implements WinterFlowCompilerQueue {
    public final String WinterFlowRouterStructure;

    public WinterFlowNetworkSystem(String str) {
        this.WinterFlowRouterStructure = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowNetworkSystem) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowNetworkSystem) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.WinterFlowRouterStructure + ')';
    }
}
