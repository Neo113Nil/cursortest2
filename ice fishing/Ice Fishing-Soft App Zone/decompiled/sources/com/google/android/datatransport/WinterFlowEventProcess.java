package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventProcess {
    public static final /* synthetic */ int WinterFlowCacheManagerAgent = 0;
    public static final long WinterFlowHookDataSource = WinterFlowProviderRouter.WinterFlowRouterStructure(0, 0);
    public final long WinterFlowRouterStructure;

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowEventProcess) {
            return this.WinterFlowRouterStructure == ((WinterFlowEventProcess) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRange(");
        long j = this.WinterFlowRouterStructure;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, (int) (j & 4294967295L), ')');
    }
}
