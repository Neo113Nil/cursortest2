package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueComponent {
    public final /* synthetic */ int WinterFlowArrayNetwork;
    public final CopyOnWriteArrayList WinterFlowCacheManagerAgent;
    public boolean WinterFlowHookDataSource;
    public final ArrayList WinterFlowRouterStructure;
    public final /* synthetic */ Object WinterFlowVariableVersionControl;

    public WinterFlowQueueComponent(boolean z) {
        this.WinterFlowRouterStructure = new ArrayList();
        this.WinterFlowHookDataSource = z;
        this.WinterFlowCacheManagerAgent = new CopyOnWriteArrayList();
    }

    public final void WinterFlowArrayNetwork(boolean z) {
        this.WinterFlowHookDataSource = z;
        ArrayList arrayList = this.WinterFlowRouterStructure;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            WinterFlowSyntaxStructure winterFlowSyntaxStructure = (WinterFlowSyntaxStructure) obj;
            winterFlowSyntaxStructure.WinterFlowTransactionManagerStrategy(winterFlowSyntaxStructure.WinterFlowVariableVersionControl && z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowQueueComponent(int i, Object obj) {
        this(false);
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinterFlowQueueComponent(WinterFlowSoftwareClass winterFlowSoftwareClass) {
        this(true);
        this.WinterFlowArrayNetwork = 3;
        this.WinterFlowVariableVersionControl = winterFlowSoftwareClass;
    }

    public final void WinterFlowRouterStructure() {
    }

    public final void WinterFlowCacheManagerAgent(WinterFlowPipelineEvent winterFlowPipelineEvent) {
    }

    public final void WinterFlowHookDataSource(WinterFlowPipelineEvent winterFlowPipelineEvent) {
    }
}
