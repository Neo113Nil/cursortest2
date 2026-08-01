package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerComponent {
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final WinterFlowRendererEngine WinterFlowRouterStructure;

    public WinterFlowSchedulerComponent(WinterFlowRendererEngine winterFlowRendererEngine, int i, int i2) {
        this.WinterFlowRouterStructure = winterFlowRendererEngine;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowSchedulerComponent) {
            WinterFlowSchedulerComponent winterFlowSchedulerComponent = (WinterFlowSchedulerComponent) obj;
            if (this.WinterFlowRouterStructure == winterFlowSchedulerComponent.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowSchedulerComponent.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowSchedulerComponent.WinterFlowCacheManagerAgent) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowCacheManagerAgent) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowHookDataSource, this.WinterFlowRouterStructure.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", startIndex=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", endIndex=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowCacheManagerAgent, ')');
    }
}
