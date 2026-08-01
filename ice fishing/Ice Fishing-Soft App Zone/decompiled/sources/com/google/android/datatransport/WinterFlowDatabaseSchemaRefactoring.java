package com.google.android.datatransport;

import java.util.Comparator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaRefactoring implements Comparator {
    public final /* synthetic */ WinterFlowBandwidthServer WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowDatabaseSchemaRefactoring(WinterFlowBandwidthServer winterFlowBandwidthServer, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = winterFlowBandwidthServer;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.WinterFlowRouterStructure;
        WinterFlowBandwidthServer winterFlowBandwidthServer = this.WinterFlowHookDataSource;
        switch (i) {
        }
        return Integer.valueOf(winterFlowBandwidthServer.WinterFlowHookDataSource(((WinterFlowServiceSyntax) obj2).WinterFlowUnitTestResponse)).compareTo(Integer.valueOf(winterFlowBandwidthServer.WinterFlowHookDataSource(((WinterFlowServiceSyntax) obj).WinterFlowUnitTestResponse)));
    }
}
