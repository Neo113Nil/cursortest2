package com.google.android.datatransport;

import android.graphics.Insets;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableDataSource {
    public static final WinterFlowVariableDataSource WinterFlowVariableVersionControl = new WinterFlowVariableDataSource(0, 0, 0, 0);
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowVariableDataSource(int i, int i2, int i3, int i4) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = i3;
        this.WinterFlowArrayNetwork = i4;
    }

    public static WinterFlowVariableDataSource WinterFlowCacheManagerAgent(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return WinterFlowHookDataSource(i, i2, i3, i4);
    }

    public static WinterFlowVariableDataSource WinterFlowHookDataSource(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? WinterFlowVariableVersionControl : new WinterFlowVariableDataSource(i, i2, i3, i4);
    }

    public static WinterFlowVariableDataSource WinterFlowRouterStructure(WinterFlowVariableDataSource winterFlowVariableDataSource, WinterFlowVariableDataSource winterFlowVariableDataSource2) {
        return WinterFlowHookDataSource(Math.max(winterFlowVariableDataSource.WinterFlowRouterStructure, winterFlowVariableDataSource2.WinterFlowRouterStructure), Math.max(winterFlowVariableDataSource.WinterFlowHookDataSource, winterFlowVariableDataSource2.WinterFlowHookDataSource), Math.max(winterFlowVariableDataSource.WinterFlowCacheManagerAgent, winterFlowVariableDataSource2.WinterFlowCacheManagerAgent), Math.max(winterFlowVariableDataSource.WinterFlowArrayNetwork, winterFlowVariableDataSource2.WinterFlowArrayNetwork));
    }

    public final Insets WinterFlowArrayNetwork() {
        return WinterFlowBackendSubsystem.WinterFlowRouterRouter(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent, this.WinterFlowArrayNetwork);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowVariableDataSource.class != obj.getClass()) {
            return false;
        }
        WinterFlowVariableDataSource winterFlowVariableDataSource = (WinterFlowVariableDataSource) obj;
        return this.WinterFlowArrayNetwork == winterFlowVariableDataSource.WinterFlowArrayNetwork && this.WinterFlowRouterStructure == winterFlowVariableDataSource.WinterFlowRouterStructure && this.WinterFlowCacheManagerAgent == winterFlowVariableDataSource.WinterFlowCacheManagerAgent && this.WinterFlowHookDataSource == winterFlowVariableDataSource.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return (((((this.WinterFlowRouterStructure * 31) + this.WinterFlowHookDataSource) * 31) + this.WinterFlowCacheManagerAgent) * 31) + this.WinterFlowArrayNetwork;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", top=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", right=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", bottom=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowArrayNetwork, '}');
    }
}
