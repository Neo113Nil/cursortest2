package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderThreadPool extends WinterFlowEventEmitterHelper {
    public WinterFlowServiceProviderThreadPool(WinterFlowEventEmitterHelper winterFlowEventEmitterHelper) {
        winterFlowEventEmitterHelper.getClass();
        this.WinterFlowRouterStructure.putAll(winterFlowEventEmitterHelper.WinterFlowRouterStructure);
    }

    @Override // com.google.android.datatransport.WinterFlowEventEmitterHelper
    public final Object WinterFlowRouterStructure(WinterFlowSerializerFramework winterFlowSerializerFramework) {
        return this.WinterFlowRouterStructure.get(winterFlowSerializerFramework);
    }

    public /* synthetic */ WinterFlowServiceProviderThreadPool(int i) {
        this(WinterFlowCompilerEngine.WinterFlowHookDataSource);
    }
}
