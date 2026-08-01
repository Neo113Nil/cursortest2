package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineLibrary {
    public final boolean WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;
    public static final WinterFlowPipelineLibrary WinterFlowCacheManagerAgent = new WinterFlowPipelineLibrary(2, false);
    public static final WinterFlowPipelineLibrary WinterFlowArrayNetwork = new WinterFlowPipelineLibrary(1, true);

    public WinterFlowPipelineLibrary(int i, boolean z) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowPipelineLibrary)) {
            return false;
        }
        WinterFlowPipelineLibrary winterFlowPipelineLibrary = (WinterFlowPipelineLibrary) obj;
        return this.WinterFlowRouterStructure == winterFlowPipelineLibrary.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowPipelineLibrary.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.WinterFlowHookDataSource) + (Integer.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        return equals(WinterFlowCacheManagerAgent) ? "TextMotion.Static" : equals(WinterFlowArrayNetwork) ? "TextMotion.Animated" : "Invalid";
    }
}
