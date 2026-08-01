package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocketView extends WinterFlowServiceProviderTool {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;

    public WinterFlowWebsocketView(float f, float f2) {
        super(1);
        this.WinterFlowCacheManagerAgent = f;
        this.WinterFlowArrayNetwork = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowWebsocketView)) {
            return false;
        }
        WinterFlowWebsocketView winterFlowWebsocketView = (WinterFlowWebsocketView) obj;
        return Float.compare(this.WinterFlowCacheManagerAgent, winterFlowWebsocketView.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowWebsocketView.WinterFlowArrayNetwork) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowArrayNetwork) + (Float.hashCode(this.WinterFlowCacheManagerAgent) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", dy=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowArrayNetwork, ')');
    }
}
