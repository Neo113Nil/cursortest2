package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryQueue {
    public final long WinterFlowArrayNetwork;
    public final WinterFlowDebugEngine WinterFlowCacheManagerAgent;
    public final WinterFlowScriptDatabaseSchema WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowConfigurationPipeline WinterFlowRouterRouter;
    public final WinterFlowViewSoftware WinterFlowRouterStructure;
    public final /* synthetic */ WinterFlowNetworkSession WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ long WinterFlowTransactionAgent;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ WinterFlowDebugEngine WinterFlowVariableVersionControl;

    public WinterFlowLibraryQueue(long j, WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema, WinterFlowDebugEngine winterFlowDebugEngine, int i, int i2, WinterFlowConfigurationPipeline winterFlowConfigurationPipeline, int i3, int i4, long j2, WinterFlowNetworkSession winterFlowNetworkSession) {
        this.WinterFlowVariableVersionControl = winterFlowDebugEngine;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = i2;
        this.WinterFlowRouterRouter = winterFlowConfigurationPipeline;
        this.WinterFlowSyntax = i3;
        this.WinterFlowResponseEngine = i4;
        this.WinterFlowTransactionAgent = j2;
        this.WinterFlowServerProtocol = winterFlowNetworkSession;
        WinterFlowViewSoftware winterFlowViewSoftware = WinterFlowVersionControlAgent.WinterFlowRouterStructure;
        this.WinterFlowRouterStructure = new WinterFlowViewSoftware();
        this.WinterFlowHookDataSource = winterFlowScriptDatabaseSchema;
        this.WinterFlowCacheManagerAgent = winterFlowDebugEngine;
        this.WinterFlowArrayNetwork = WinterFlowServiceOrchestration.WinterFlowHookDataSource(WinterFlowHandlerConsumer.WinterFlowRouterRouter(j), Integer.MAX_VALUE, 5);
    }

    public final WinterFlowServiceSyntax WinterFlowRouterStructure(int i, long j) {
        long j2;
        List list;
        WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema = this.WinterFlowHookDataSource;
        Object WinterFlowArrayNetwork = winterFlowScriptDatabaseSchema.WinterFlowArrayNetwork(i);
        Object WinterFlowHookDataSource = winterFlowScriptDatabaseSchema.WinterFlowHookDataSource(i);
        WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowRouterStructure;
        List list2 = (List) winterFlowViewSoftware.WinterFlowHookDataSource(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            WinterFlowDebugEngine winterFlowDebugEngine = this.WinterFlowCacheManagerAgent;
            WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema2 = winterFlowDebugEngine.WinterFlowUnitTestResponse;
            WinterFlowViewSoftware winterFlowViewSoftware2 = winterFlowDebugEngine.WinterFlowRouterRouter;
            List list3 = (List) winterFlowViewSoftware2.WinterFlowHookDataSource(i);
            if (list3 == null) {
                Object WinterFlowArrayNetwork2 = winterFlowScriptDatabaseSchema2.WinterFlowArrayNetwork(i);
                list3 = winterFlowDebugEngine.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(winterFlowDebugEngine.WinterFlowVariableVersionControl.WinterFlowRouterStructure(i, WinterFlowArrayNetwork2, winterFlowScriptDatabaseSchema2.WinterFlowHookDataSource(i)), WinterFlowArrayNetwork2);
                winterFlowViewSoftware2.WinterFlowRouterRouter(i, list3);
            }
            int size = list3.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((WinterFlowRuntimeVersion) list3.get(i2)).WinterFlowVariableVersionControl(j));
            }
            j2 = j;
            winterFlowViewSoftware.WinterFlowRouterRouter(i, arrayList);
            list = arrayList;
        }
        return new WinterFlowServiceSyntax(i, list, this.WinterFlowRouterRouter, this.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy.getLayoutDirection(), this.WinterFlowSyntax, this.WinterFlowResponseEngine, i != this.WinterFlowTransactionManagerStrategy + (-1) ? this.WinterFlowUnitTestResponse : 0, this.WinterFlowTransactionAgent, WinterFlowArrayNetwork, WinterFlowHookDataSource, this.WinterFlowServerProtocol.WinterFlowServiceUtility, j2);
    }
}
