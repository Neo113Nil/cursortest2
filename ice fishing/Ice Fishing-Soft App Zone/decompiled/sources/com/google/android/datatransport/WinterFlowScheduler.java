package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScheduler implements WinterFlowRefactoringWidget {
    public final WinterFlowArrayEngine WinterFlowRouterStructure;

    public WinterFlowScheduler(WinterFlowArrayEngine winterFlowArrayEngine) {
        this.WinterFlowRouterStructure = winterFlowArrayEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringWidget
    public final boolean WinterFlowHookDataSource(Exception exc) {
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowRefactoringWidget
    public final boolean WinterFlowRouterStructure(WinterFlowManagerEvent winterFlowManagerEvent) {
        int i = winterFlowManagerEvent.WinterFlowHookDataSource;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowManagerEvent.WinterFlowRouterStructure);
        return true;
    }
}
