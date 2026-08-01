package com.google.android.datatransport;

import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewayEngine {
    public final Locale WinterFlowRouterStructure;

    public WinterFlowGatewayEngine(Locale locale) {
        this.WinterFlowRouterStructure = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WinterFlowGatewayEngine)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure.toLanguageTag(), ((WinterFlowGatewayEngine) obj).WinterFlowRouterStructure.toLanguageTag());
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.WinterFlowRouterStructure.toLanguageTag();
    }
}
