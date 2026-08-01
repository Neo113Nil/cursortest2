package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryStack {
    public static final WinterFlowLibraryStack WinterFlowTransactionManagerStrategy = new WinterFlowLibraryStack(10485760, 200, 10000, 604800000, 81920);
    public final long WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowLibraryStack(long j, int i, int i2, long j2, int i3) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
        this.WinterFlowArrayNetwork = j2;
        this.WinterFlowVariableVersionControl = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowLibraryStack) {
            WinterFlowLibraryStack winterFlowLibraryStack = (WinterFlowLibraryStack) obj;
            if (this.WinterFlowRouterStructure == winterFlowLibraryStack.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowLibraryStack.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowLibraryStack.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowLibraryStack.WinterFlowArrayNetwork && this.WinterFlowVariableVersionControl == winterFlowLibraryStack.WinterFlowVariableVersionControl) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.WinterFlowRouterStructure;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.WinterFlowHookDataSource) * 1000003) ^ this.WinterFlowCacheManagerAgent) * 1000003;
        long j2 = this.WinterFlowArrayNetwork;
        return this.WinterFlowVariableVersionControl ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.WinterFlowRouterStructure + ", loadBatchSize=" + this.WinterFlowHookDataSource + ", criticalSectionEnterTimeoutMs=" + this.WinterFlowCacheManagerAgent + ", eventCleanUpAge=" + this.WinterFlowArrayNetwork + ", maxBlobByteSizePerRow=" + this.WinterFlowVariableVersionControl + "}";
    }
}
