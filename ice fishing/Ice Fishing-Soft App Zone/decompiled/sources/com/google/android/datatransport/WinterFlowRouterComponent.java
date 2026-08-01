package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterComponent {
    public final WinterFlowMiddlewareFramework WinterFlowHookDataSource;
    public final WinterFlowDecoratorBackend WinterFlowRouterStructure;

    public WinterFlowRouterComponent(WinterFlowProcessorSystem winterFlowProcessorSystem, WinterFlowJSONAdapter winterFlowJSONAdapter) {
        this.WinterFlowRouterStructure = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        List WinterFlowResponseEngine = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem);
        this.WinterFlowHookDataSource = new WinterFlowMiddlewareFramework(WinterFlowResponseEngine.size());
        int size = WinterFlowResponseEngine.size();
        for (int i = 0; i < size; i++) {
            WinterFlowProcessorSystem winterFlowProcessorSystem2 = (WinterFlowProcessorSystem) WinterFlowResponseEngine.get(i);
            if (winterFlowJSONAdapter.WinterFlowRouterStructure(winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy)) {
                this.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy);
            }
        }
    }
}
