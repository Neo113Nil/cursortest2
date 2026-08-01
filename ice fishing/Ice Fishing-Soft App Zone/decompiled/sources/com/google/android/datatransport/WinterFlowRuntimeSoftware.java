package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeSoftware {
    public final int WinterFlowHookDataSource;
    public final WinterFlowAdapterProtocol WinterFlowRouterStructure;

    public WinterFlowRuntimeSoftware(WinterFlowAdapterProtocol winterFlowAdapterProtocol, int i) {
        this.WinterFlowRouterStructure = winterFlowAdapterProtocol;
        this.WinterFlowHookDataSource = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRuntimeSoftware)) {
            return false;
        }
        WinterFlowRuntimeSoftware winterFlowRuntimeSoftware = (WinterFlowRuntimeSoftware) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowRuntimeSoftware.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowRuntimeSoftware.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", configFlags=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowHookDataSource, ')');
    }
}
