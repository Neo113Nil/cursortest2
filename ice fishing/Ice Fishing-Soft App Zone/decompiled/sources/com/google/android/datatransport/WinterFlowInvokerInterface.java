package com.google.android.datatransport;

import android.content.res.Resources;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerInterface {
    public final int WinterFlowHookDataSource;
    public final Resources.Theme WinterFlowRouterStructure;

    public WinterFlowInvokerInterface(Resources.Theme theme, int i) {
        this.WinterFlowRouterStructure = theme;
        this.WinterFlowHookDataSource = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowInvokerInterface)) {
            return false;
        }
        WinterFlowInvokerInterface winterFlowInvokerInterface = (WinterFlowInvokerInterface) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowInvokerInterface.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowInvokerInterface.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", id=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowHookDataSource, ')');
    }
}
