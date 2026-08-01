package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeEntity {
    public final long WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowNodeEntity(int i, long j) {
        if (i == 0) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null status");
            throw null;
        }
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowNodeEntity)) {
            return false;
        }
        WinterFlowNodeEntity winterFlowNodeEntity = (WinterFlowNodeEntity) obj;
        return WinterFlowResolverBackend.WinterFlowRouterStructure(this.WinterFlowRouterStructure, winterFlowNodeEntity.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowNodeEntity.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        int WinterFlowRouterAdapter = (WinterFlowResolverBackend.WinterFlowRouterAdapter(this.WinterFlowRouterStructure) ^ 1000003) * 1000003;
        long j = this.WinterFlowHookDataSource;
        return ((int) ((j >>> 32) ^ j)) ^ WinterFlowRouterAdapter;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.WinterFlowRouterStructure;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append("}");
        return sb.toString();
    }
}
