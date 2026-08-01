package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadModule extends WinterFlowThreadDebug {
    public static final WinterFlowThreadModule WinterFlowCacheManagerAgent = new WinterFlowThreadModule(0, 2, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        int i = ((WinterFlowBackendEntity) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0)).WinterFlowRouterStructure;
        List list = (List) winterFlowProviderEntity.WinterFlowCacheManagerAgent(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            winterFlowProcessorConsumer.WinterFlowHookDataSource(i3, obj);
            winterFlowProcessorConsumer.WinterFlowTransactionManagerStrategy(i3, obj);
        }
    }
}
