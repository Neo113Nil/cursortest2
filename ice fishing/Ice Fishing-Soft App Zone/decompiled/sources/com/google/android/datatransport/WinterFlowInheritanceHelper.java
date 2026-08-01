package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceHelper {
    public final Integer WinterFlowRouterStructure;

    public WinterFlowInheritanceHelper(Integer num) {
        this.WinterFlowRouterStructure = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowInheritanceHelper) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowInheritanceHelper) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.WinterFlowRouterStructure + "}";
    }
}
