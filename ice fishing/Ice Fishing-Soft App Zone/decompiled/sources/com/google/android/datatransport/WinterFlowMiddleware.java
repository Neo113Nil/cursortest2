package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddleware extends WinterFlowTransactionManagerSerializer {
    public final WinterFlowBatchDataSource WinterFlowRouterStructure;

    public WinterFlowMiddleware(WinterFlowBatchDataSource winterFlowBatchDataSource) {
        this.WinterFlowRouterStructure = winterFlowBatchDataSource;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowTransactionManagerSerializer)) {
            return false;
        }
        WinterFlowTransactionManagerSerializer winterFlowTransactionManagerSerializer = (WinterFlowTransactionManagerSerializer) obj;
        Object obj2 = WinterFlowSessionSystem.WinterFlowVariableVersionControl;
        if (obj2.equals(obj2)) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowMiddleware) winterFlowTransactionManagerSerializer).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() ^ ((WinterFlowSessionSystem.WinterFlowVariableVersionControl.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + WinterFlowSessionSystem.WinterFlowVariableVersionControl + ", androidClientInfo=" + this.WinterFlowRouterStructure + "}";
    }
}
