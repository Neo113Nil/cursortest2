package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerAPI {
    public static final float WinterFlowArrayNetwork;
    public static final float WinterFlowCacheManagerAgent;
    public static final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    static {
        WinterFlowRouterStructure(0.0f);
        WinterFlowRouterStructure(0.5f);
        WinterFlowHookDataSource = 0.5f;
        WinterFlowRouterStructure(-1.0f);
        WinterFlowCacheManagerAgent = -1.0f;
        WinterFlowRouterStructure(1.0f);
        WinterFlowArrayNetwork = 1.0f;
    }

    public static String WinterFlowHookDataSource(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == WinterFlowHookDataSource) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == WinterFlowCacheManagerAgent) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == WinterFlowArrayNetwork) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public static void WinterFlowRouterStructure(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            WinterFlowWorkerPipeline.WinterFlowHookDataSource("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowSerializerAPI) {
            return Float.compare(this.WinterFlowRouterStructure, ((WinterFlowSerializerAPI) obj).WinterFlowRouterStructure) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowHookDataSource(this.WinterFlowRouterStructure);
    }
}
