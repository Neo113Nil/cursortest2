package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrontendEngine implements WinterFlowDeploymentProcess {
    public final Class WinterFlowRouterStructure;

    public WinterFlowFrontendEngine(Class cls) {
        this.WinterFlowRouterStructure = cls;
    }

    @Override // com.google.android.datatransport.WinterFlowDeploymentProcess
    public final Class WinterFlowRouterStructure() {
        return this.WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowFrontendEngine) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowFrontendEngine) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return this.WinterFlowRouterStructure.toString() + " (Kotlin reflection is not available)";
    }
}
