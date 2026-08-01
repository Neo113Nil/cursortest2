package com.google.android.datatransport;

import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNetworkInvoker {
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowNetworkInvoker(String str, int i, int i2) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowNetworkInvoker)) {
            return false;
        }
        WinterFlowNetworkInvoker winterFlowNetworkInvoker = (WinterFlowNetworkInvoker) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowNetworkInvoker.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowNetworkInvoker.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowNetworkInvoker.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.WinterFlowHookDataSource);
        Integer valueOf2 = Integer.valueOf(this.WinterFlowCacheManagerAgent);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.WinterFlowRouterStructure, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.WinterFlowRouterStructure.hashCode()) + " displayWidth=" + this.WinterFlowHookDataSource + " displayHeight=" + this.WinterFlowCacheManagerAgent + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
