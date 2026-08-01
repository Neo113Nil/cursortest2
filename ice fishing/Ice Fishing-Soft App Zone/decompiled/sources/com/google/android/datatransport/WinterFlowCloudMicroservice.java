package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudMicroservice {
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowCloudMicroservice(int i, int i2, long j, String str) {
        str.getClass();
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowCloudMicroservice)) {
            return false;
        }
        WinterFlowCloudMicroservice winterFlowCloudMicroservice = (WinterFlowCloudMicroservice) obj;
        return this.WinterFlowRouterStructure == winterFlowCloudMicroservice.WinterFlowRouterStructure && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowCloudMicroservice.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent == winterFlowCloudMicroservice.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowCloudMicroservice.WinterFlowArrayNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowArrayNetwork) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowCacheManagerAgent, (this.WinterFlowHookDataSource.hashCode() + (Long.hashCode(this.WinterFlowRouterStructure) * 31)) * 31, 31);
    }

    public final String toString() {
        return "FishEntity(id=" + this.WinterFlowRouterStructure + ", name=" + this.WinterFlowHookDataSource + ", energyReward=" + this.WinterFlowCacheManagerAgent + ", imageResId=" + this.WinterFlowArrayNetwork + ")";
    }
}
