package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryBandwidth {
    public final String WinterFlowArrayNetwork;
    public final WinterFlowEventEmitterLayer WinterFlowCacheManagerAgent;
    public final WinterFlowAlgorithmArray WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowRepositoryBandwidth(WinterFlowAlgorithmArray winterFlowAlgorithmArray, WinterFlowEventEmitterLayer winterFlowEventEmitterLayer, String str) {
        this.WinterFlowHookDataSource = winterFlowAlgorithmArray;
        this.WinterFlowCacheManagerAgent = winterFlowEventEmitterLayer;
        this.WinterFlowArrayNetwork = str;
        this.WinterFlowRouterStructure = Arrays.hashCode(new Object[]{winterFlowAlgorithmArray, winterFlowEventEmitterLayer, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowRepositoryBandwidth)) {
            return false;
        }
        WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth = (WinterFlowRepositoryBandwidth) obj;
        return WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowHookDataSource, winterFlowRepositoryBandwidth.WinterFlowHookDataSource) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowCacheManagerAgent, winterFlowRepositoryBandwidth.WinterFlowCacheManagerAgent) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowArrayNetwork, winterFlowRepositoryBandwidth.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure;
    }
}
