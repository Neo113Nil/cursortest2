package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategy extends WinterFlowRequestStrategy {
    public final ArrayList WinterFlowRouterStructure;

    public WinterFlowStrategy(ArrayList arrayList) {
        this.WinterFlowRouterStructure = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowRequestStrategy)) {
            return false;
        }
        return this.WinterFlowRouterStructure.equals(((WinterFlowStrategy) ((WinterFlowRequestStrategy) obj)).WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.WinterFlowRouterStructure + "}";
    }
}
