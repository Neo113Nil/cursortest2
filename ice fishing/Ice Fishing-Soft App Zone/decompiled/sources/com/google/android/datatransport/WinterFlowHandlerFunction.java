package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerFunction {
    public final boolean WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowHandlerFunction(String str, boolean z) {
        WinterFlowUnitTestLibrary.WinterFlowBandwidthObject(str);
        this.WinterFlowRouterStructure = str;
        WinterFlowUnitTestLibrary.WinterFlowBandwidthObject("com.google.android.gms");
        this.WinterFlowHookDataSource = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowHandlerFunction)) {
            return false;
        }
        WinterFlowHandlerFunction winterFlowHandlerFunction = (WinterFlowHandlerFunction) obj;
        return WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowRouterStructure, winterFlowHandlerFunction.WinterFlowRouterStructure) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth("com.google.android.gms", "com.google.android.gms") && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(null, null) && this.WinterFlowHookDataSource == winterFlowHandlerFunction.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.WinterFlowRouterStructure, "com.google.android.gms", null, 4225, Boolean.valueOf(this.WinterFlowHookDataSource)});
    }

    public final String toString() {
        String str = this.WinterFlowRouterStructure;
        if (str != null) {
            return str;
        }
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(null);
        throw null;
    }
}
