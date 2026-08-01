package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowInvokerRuntime {
    public static final WinterFlowMicroserviceTool WinterFlowRouterStructure = WinterFlowMicroserviceTool.WinterFlowRouterStructure;

    default float WinterFlowRouterStructure(float f, float f2, float f3) {
        WinterFlowRouterStructure.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
