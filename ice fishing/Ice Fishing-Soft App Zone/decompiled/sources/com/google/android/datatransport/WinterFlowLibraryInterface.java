package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryInterface {
    public static final WinterFlowLibraryInterface WinterFlowVariableVersionControl = new WinterFlowLibraryInterface(0, 0, 0, 0);
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowLibraryInterface(int i, int i2, int i3, int i4) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = i3;
        this.WinterFlowArrayNetwork = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowLibraryInterface)) {
            return false;
        }
        WinterFlowLibraryInterface winterFlowLibraryInterface = (WinterFlowLibraryInterface) obj;
        return this.WinterFlowRouterStructure == winterFlowLibraryInterface.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowLibraryInterface.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowLibraryInterface.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowLibraryInterface.WinterFlowArrayNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowArrayNetwork) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowHookDataSource, Integer.hashCode(this.WinterFlowRouterStructure) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", ");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", ");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", ");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowArrayNetwork, ')');
    }
}
