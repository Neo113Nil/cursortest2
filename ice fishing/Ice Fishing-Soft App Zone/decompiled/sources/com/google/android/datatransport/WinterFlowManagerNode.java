package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerNode {
    public final int WinterFlowRouterStructure;

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowManagerNode) {
            return this.WinterFlowRouterStructure == ((WinterFlowManagerNode) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.WinterFlowRouterStructure + ')';
    }
}
