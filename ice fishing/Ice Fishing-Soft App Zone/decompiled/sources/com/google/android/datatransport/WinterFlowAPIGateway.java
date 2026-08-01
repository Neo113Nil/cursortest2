package com.google.android.datatransport;

import android.webkit.ValueCallback;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAPIGateway {
    public final ValueCallback WinterFlowRouterStructure;

    public WinterFlowAPIGateway(ValueCallback valueCallback) {
        this.WinterFlowRouterStructure = valueCallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowAPIGateway) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, ((WinterFlowAPIGateway) obj).WinterFlowRouterStructure);
    }

    public final int hashCode() {
        ValueCallback valueCallback = this.WinterFlowRouterStructure;
        if (valueCallback == null) {
            return 0;
        }
        return valueCallback.hashCode();
    }

    public final String toString() {
        return "FileChooserInfo(fileChooserCallback=" + this.WinterFlowRouterStructure + ")";
    }
}
