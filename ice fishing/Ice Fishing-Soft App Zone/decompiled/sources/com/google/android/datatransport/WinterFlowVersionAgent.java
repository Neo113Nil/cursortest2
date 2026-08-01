package com.google.android.datatransport;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionAgent {
    public List WinterFlowCacheManagerAgent;
    public String WinterFlowHookDataSource;
    public String WinterFlowRouterStructure;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowVersionAgent)) {
            return false;
        }
        WinterFlowVersionAgent winterFlowVersionAgent = (WinterFlowVersionAgent) obj;
        return Objects.equals(this.WinterFlowRouterStructure, winterFlowVersionAgent.WinterFlowRouterStructure) && Objects.equals(this.WinterFlowHookDataSource, winterFlowVersionAgent.WinterFlowHookDataSource) && Objects.equals(this.WinterFlowCacheManagerAgent, winterFlowVersionAgent.WinterFlowCacheManagerAgent);
    }

    public final int hashCode() {
        return Objects.hash(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
    }
}
