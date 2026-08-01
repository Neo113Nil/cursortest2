package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayStructure {
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowArrayStructure(float f, float f2) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowArrayStructure)) {
            return false;
        }
        float f = this.WinterFlowRouterStructure;
        float f2 = this.WinterFlowHookDataSource;
        if (f > f2) {
            WinterFlowArrayStructure winterFlowArrayStructure = (WinterFlowArrayStructure) obj;
            if (winterFlowArrayStructure.WinterFlowRouterStructure > winterFlowArrayStructure.WinterFlowHookDataSource) {
                return true;
            }
        }
        WinterFlowArrayStructure winterFlowArrayStructure2 = (WinterFlowArrayStructure) obj;
        return f == winterFlowArrayStructure2.WinterFlowRouterStructure && f2 == winterFlowArrayStructure2.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        float f = this.WinterFlowRouterStructure;
        float f2 = this.WinterFlowHookDataSource;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.WinterFlowRouterStructure + ".." + this.WinterFlowHookDataSource;
    }
}
