package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerPlatform implements Serializable {
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowServerPlatform(Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowServerPlatform)) {
            return false;
        }
        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowServerPlatform.WinterFlowVariableVersionControl) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, winterFlowServerPlatform.WinterFlowTransactionManagerStrategy);
    }

    public final int hashCode() {
        Object obj = this.WinterFlowVariableVersionControl;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.WinterFlowVariableVersionControl + ", " + this.WinterFlowTransactionManagerStrategy + ')';
    }
}
