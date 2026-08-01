package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryLibrary implements WinterFlowGatewayFramework {
    public final WinterFlowExceptionHandler WinterFlowVariableVersionControl;

    public WinterFlowQueryLibrary(WinterFlowExceptionHandler winterFlowExceptionHandler) {
        this.WinterFlowVariableVersionControl = winterFlowExceptionHandler;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowQueryLibrary) {
            return this.WinterFlowVariableVersionControl.equals(((WinterFlowQueryLibrary) obj).WinterFlowVariableVersionControl);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode() * 31;
    }
}
