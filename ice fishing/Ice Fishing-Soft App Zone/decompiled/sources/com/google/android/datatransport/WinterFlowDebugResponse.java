package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugResponse {
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowDebugResponse(int i, int i2) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDebugResponse)) {
            return false;
        }
        WinterFlowDebugResponse winterFlowDebugResponse = (WinterFlowDebugResponse) obj;
        return this.WinterFlowRouterStructure == winterFlowDebugResponse.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowDebugResponse.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowHookDataSource) + (Integer.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", columnCount=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowHookDataSource, ')');
    }
}
