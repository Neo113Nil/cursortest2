package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareNetwork {
    public final boolean WinterFlowHookDataSource;
    public final WinterFlowValidatorProcess WinterFlowRouterStructure;

    public WinterFlowMiddlewareNetwork(WinterFlowValidatorProcess winterFlowValidatorProcess, boolean z) {
        this.WinterFlowRouterStructure = winterFlowValidatorProcess;
        this.WinterFlowHookDataSource = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowMiddlewareNetwork) {
            WinterFlowMiddlewareNetwork winterFlowMiddlewareNetwork = (WinterFlowMiddlewareNetwork) obj;
            if (winterFlowMiddlewareNetwork.WinterFlowRouterStructure.equals(this.WinterFlowRouterStructure) && winterFlowMiddlewareNetwork.WinterFlowHookDataSource == this.WinterFlowHookDataSource) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.WinterFlowHookDataSource).hashCode() ^ ((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003);
    }
}
