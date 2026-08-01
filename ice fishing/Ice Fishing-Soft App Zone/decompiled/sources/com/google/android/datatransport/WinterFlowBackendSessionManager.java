package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendSessionManager {
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowBackendSessionManager(int i, int i2, int i3, int i4) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = i3;
        this.WinterFlowArrayNetwork = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowBackendSessionManager)) {
            return false;
        }
        WinterFlowBackendSessionManager winterFlowBackendSessionManager = (WinterFlowBackendSessionManager) obj;
        return this.WinterFlowRouterStructure == winterFlowBackendSessionManager.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowBackendSessionManager.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowBackendSessionManager.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowBackendSessionManager.WinterFlowArrayNetwork;
    }

    public final int hashCode() {
        return (((((this.WinterFlowRouterStructure * 31) + this.WinterFlowHookDataSource) * 31) + this.WinterFlowCacheManagerAgent) * 31) + this.WinterFlowArrayNetwork;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", top=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", right=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", bottom=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowArrayNetwork, ')');
    }
}
