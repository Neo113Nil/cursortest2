package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudHandler extends WinterFlowGatewayParser {
    public final Throwable WinterFlowRouterStructure;

    public WinterFlowCloudHandler(Throwable th) {
        this.WinterFlowRouterStructure = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowCloudHandler) {
            return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, ((WinterFlowCloudHandler) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.WinterFlowRouterStructure;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowGatewayParser
    public final String toString() {
        return "Closed(" + this.WinterFlowRouterStructure + ')';
    }
}
