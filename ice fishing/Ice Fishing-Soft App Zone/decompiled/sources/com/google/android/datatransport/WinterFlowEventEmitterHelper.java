package com.google.android.datatransport;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowEventEmitterHelper {
    public final LinkedHashMap WinterFlowRouterStructure = new LinkedHashMap();

    public abstract Object WinterFlowRouterStructure(WinterFlowSerializerFramework winterFlowSerializerFramework);

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowEventEmitterHelper) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowEventEmitterHelper) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.WinterFlowRouterStructure + ")";
    }
}
