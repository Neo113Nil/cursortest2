package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleSyntax {
    public final WinterFlowObjectPackage WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowModuleSyntax(int i, int i2, WinterFlowObjectPackage winterFlowObjectPackage) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = winterFlowObjectPackage;
        if (i < 0) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        WinterFlowValidatorConsumer.WinterFlowRouterStructure("size should be > 0");
    }
}
