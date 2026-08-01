package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableTransaction {
    public final String WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final Object WinterFlowRouterStructure;

    public WinterFlowVariableTransaction(int i, int i2, Object obj, String str) {
        this.WinterFlowRouterStructure = obj;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
        this.WinterFlowArrayNetwork = str;
        if (i <= i2) {
            return;
        }
        WinterFlowWorkerPipeline.WinterFlowRouterStructure("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowVariableTransaction)) {
            return false;
        }
        WinterFlowVariableTransaction winterFlowVariableTransaction = (WinterFlowVariableTransaction) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowVariableTransaction.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowVariableTransaction.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowVariableTransaction.WinterFlowCacheManagerAgent && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowVariableTransaction.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        Object obj = this.WinterFlowRouterStructure;
        return this.WinterFlowArrayNetwork.hashCode() + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowHookDataSource, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.WinterFlowRouterStructure + ", start=" + this.WinterFlowHookDataSource + ", end=" + this.WinterFlowCacheManagerAgent + ", tag=" + this.WinterFlowArrayNetwork + ')';
    }

    public WinterFlowVariableTransaction(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
