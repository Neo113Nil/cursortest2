package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerTransaction {
    public final long WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowWorkerTransaction(long j, String str, int i, long j2, long j3, int i2, int i3) {
        str.getClass();
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = j2;
        this.WinterFlowVariableVersionControl = j3;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i3;
    }

    public static WinterFlowWorkerTransaction WinterFlowRouterStructure(WinterFlowWorkerTransaction winterFlowWorkerTransaction, long j) {
        long j2 = winterFlowWorkerTransaction.WinterFlowRouterStructure;
        String str = winterFlowWorkerTransaction.WinterFlowHookDataSource;
        int i = winterFlowWorkerTransaction.WinterFlowCacheManagerAgent;
        long j3 = winterFlowWorkerTransaction.WinterFlowArrayNetwork;
        int i2 = winterFlowWorkerTransaction.WinterFlowTransactionManagerStrategy;
        int i3 = winterFlowWorkerTransaction.WinterFlowUnitTestResponse;
        str.getClass();
        return new WinterFlowWorkerTransaction(j2, str, i, j3, j, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowWorkerTransaction)) {
            return false;
        }
        WinterFlowWorkerTransaction winterFlowWorkerTransaction = (WinterFlowWorkerTransaction) obj;
        return this.WinterFlowRouterStructure == winterFlowWorkerTransaction.WinterFlowRouterStructure && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowWorkerTransaction.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent == winterFlowWorkerTransaction.WinterFlowCacheManagerAgent && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowArrayNetwork, winterFlowWorkerTransaction.WinterFlowArrayNetwork) && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowVariableVersionControl, winterFlowWorkerTransaction.WinterFlowVariableVersionControl) && this.WinterFlowTransactionManagerStrategy == winterFlowWorkerTransaction.WinterFlowTransactionManagerStrategy && this.WinterFlowUnitTestResponse == winterFlowWorkerTransaction.WinterFlowUnitTestResponse;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowUnitTestResponse) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowTransactionManagerStrategy, WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowCacheManagerAgent, (this.WinterFlowHookDataSource.hashCode() + (Long.hashCode(this.WinterFlowRouterStructure) * 31)) * 31, 31), 31, this.WinterFlowArrayNetwork), 31, this.WinterFlowVariableVersionControl), 31);
    }

    public final String toString() {
        return "FishItem(id=" + this.WinterFlowRouterStructure + ", resName=" + this.WinterFlowHookDataSource + ", imageResId=" + this.WinterFlowCacheManagerAgent + ", initialOffset=" + WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowArrayNetwork) + ", currentOffset=" + WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowVariableVersionControl) + ", pointsReward=" + this.WinterFlowTransactionManagerStrategy + ", energyReward=" + this.WinterFlowUnitTestResponse + ")";
    }
}
