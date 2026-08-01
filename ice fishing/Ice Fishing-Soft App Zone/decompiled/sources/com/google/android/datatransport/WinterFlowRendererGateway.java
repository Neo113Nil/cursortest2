package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererGateway {
    public static final WinterFlowRendererGateway WinterFlowCacheManagerAgent = new WinterFlowRendererGateway(0.0f, new WinterFlowArrayStructure(0.0f, 0.0f));
    public final WinterFlowArrayStructure WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowRendererGateway(float f, WinterFlowArrayStructure winterFlowArrayStructure) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = winterFlowArrayStructure;
        if (Float.isNaN(f)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRendererGateway)) {
            return false;
        }
        WinterFlowRendererGateway winterFlowRendererGateway = (WinterFlowRendererGateway) obj;
        return this.WinterFlowRouterStructure == winterFlowRendererGateway.WinterFlowRouterStructure && this.WinterFlowHookDataSource.equals(winterFlowRendererGateway.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return (this.WinterFlowHookDataSource.hashCode() + (Float.hashCode(this.WinterFlowRouterStructure) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.WinterFlowRouterStructure + ", range=" + this.WinterFlowHookDataSource + ", steps=0)";
    }
}
