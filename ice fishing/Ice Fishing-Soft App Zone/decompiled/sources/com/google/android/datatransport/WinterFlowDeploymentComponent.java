package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeploymentComponent {
    public final long WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowDeploymentComponent(String str, long j, long j2) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = j;
        this.WinterFlowCacheManagerAgent = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowDeploymentComponent) {
            WinterFlowDeploymentComponent winterFlowDeploymentComponent = (WinterFlowDeploymentComponent) obj;
            if (this.WinterFlowRouterStructure.equals(winterFlowDeploymentComponent.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowDeploymentComponent.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowDeploymentComponent.WinterFlowCacheManagerAgent) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003;
        long j = this.WinterFlowHookDataSource;
        long j2 = this.WinterFlowCacheManagerAgent;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.WinterFlowRouterStructure + ", tokenExpirationTimestamp=" + this.WinterFlowHookDataSource + ", tokenCreationTimestamp=" + this.WinterFlowCacheManagerAgent + "}";
    }
}
