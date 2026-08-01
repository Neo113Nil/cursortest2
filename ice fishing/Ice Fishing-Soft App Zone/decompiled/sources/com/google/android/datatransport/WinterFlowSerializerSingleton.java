package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerSingleton implements WinterFlowVersionControlScheduler {
    public WinterFlowVersionControlScheduler[] WinterFlowRouterStructure;

    @Override // com.google.android.datatransport.WinterFlowVersionControlScheduler
    public final boolean WinterFlowHookDataSource(Class cls) {
        for (WinterFlowVersionControlScheduler winterFlowVersionControlScheduler : this.WinterFlowRouterStructure) {
            if (winterFlowVersionControlScheduler.WinterFlowHookDataSource(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlScheduler
    public final WinterFlowAdapterManager WinterFlowRouterStructure(Class cls) {
        for (WinterFlowVersionControlScheduler winterFlowVersionControlScheduler : this.WinterFlowRouterStructure) {
            if (winterFlowVersionControlScheduler.WinterFlowHookDataSource(cls)) {
                return winterFlowVersionControlScheduler.WinterFlowRouterStructure(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
