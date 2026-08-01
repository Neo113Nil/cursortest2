package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRepositoryProxy {
    static {
        if (50.0f < 0.0f || 50.0f > 100.0f) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("The percent should be in the range of [0, 100]");
        }
    }

    public static final WinterFlowLoaderHandler WinterFlowRouterStructure(float f) {
        WinterFlowDataSourceScript winterFlowDataSourceScript = new WinterFlowDataSourceScript(f);
        return new WinterFlowLoaderHandler(winterFlowDataSourceScript, winterFlowDataSourceScript, winterFlowDataSourceScript, winterFlowDataSourceScript);
    }
}
