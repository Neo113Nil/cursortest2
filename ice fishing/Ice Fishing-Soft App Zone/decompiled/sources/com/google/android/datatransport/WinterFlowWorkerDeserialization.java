package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerDeserialization {
    public final WinterFlowManagerService WinterFlowRouterStructure;

    public WinterFlowWorkerDeserialization(WinterFlowManagerService winterFlowManagerService) {
        this.WinterFlowRouterStructure = winterFlowManagerService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowWorkerDeserialization) {
            return Float.compare(0.0f, 0.0f) == 0 && this.WinterFlowRouterStructure.equals(((WinterFlowWorkerDeserialization) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.WinterFlowRouterStructure + ')';
    }
}
