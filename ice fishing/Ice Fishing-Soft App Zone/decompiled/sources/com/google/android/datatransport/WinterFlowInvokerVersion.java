package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerVersion extends WinterFlowMicroserviceWidget {
    public final int WinterFlowHookDataSource;
    public final WinterFlowMicroserviceWidget WinterFlowRouterStructure;

    public WinterFlowInvokerVersion(WinterFlowMicroserviceWidget winterFlowMicroserviceWidget, int i) {
        this.WinterFlowRouterStructure = winterFlowMicroserviceWidget;
        this.WinterFlowHookDataSource = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowInvokerVersion)) {
            return false;
        }
        WinterFlowInvokerVersion winterFlowInvokerVersion = (WinterFlowInvokerVersion) obj;
        return winterFlowInvokerVersion.WinterFlowRouterStructure.equals(this.WinterFlowRouterStructure) && winterFlowInvokerVersion.WinterFlowHookDataSource == this.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() + (this.WinterFlowHookDataSource * 31);
    }
}
