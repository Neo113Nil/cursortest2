package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaUI {
    public int WinterFlowArrayNetwork;
    public int WinterFlowCacheManagerAgent;
    public final List[] WinterFlowHookDataSource;
    public final List WinterFlowRouterStructure;
    public final /* synthetic */ WinterFlowServerJava WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowVariableVersionControl;

    public WinterFlowJavaUI(WinterFlowServerJava winterFlowServerJava, List list) {
        this.WinterFlowTransactionManagerStrategy = winterFlowServerJava;
        this.WinterFlowRouterStructure = list;
        this.WinterFlowHookDataSource = new List[list.size()];
        if (list.isEmpty()) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
