package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperInterface implements WinterFlowGatewayFramework, Iterable, WinterFlowLoaderProcess {
    public WinterFlowViewSoftware WinterFlowBandwidthObject;
    public int WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public HashMap WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public boolean WinterFlowTransactionAgent;
    public int WinterFlowTransactionManagerStrategy;
    public int[] WinterFlowVariableVersionControl = new int[0];
    public Object[] WinterFlowUnitTestResponse = new Object[0];
    public final Object WinterFlowResponseEngine = new Object();
    public ArrayList WinterFlowThreadListener = new ArrayList();

    public final WinterFlowCloudModule WinterFlowArrayNetwork() {
        if (this.WinterFlowTransactionAgent) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Cannot read while a writer is pending");
            return null;
        }
        this.WinterFlowSyntax++;
        return new WinterFlowCloudModule(this);
    }

    public final void WinterFlowCacheManagerAgent() {
        this.WinterFlowServiceUtility = new HashMap();
    }

    public final int WinterFlowRouterStructure(WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler) {
        if (this.WinterFlowTransactionAgent) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Use active SlotWriter to determine anchor location instead");
        }
        if (!winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure()) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("Anchor refers to a group that was removed");
        }
        return winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure;
    }

    public final boolean WinterFlowTransactionManagerStrategy(WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler) {
        int WinterFlowCacheManagerAgent;
        return winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure() && (WinterFlowCacheManagerAgent = WinterFlowQueryTool.WinterFlowCacheManagerAgent(this.WinterFlowThreadListener, winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure, this.WinterFlowTransactionManagerStrategy)) >= 0 && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowThreadListener.get(WinterFlowCacheManagerAgent), winterFlowDatabaseSchemaHandler);
    }

    public final WinterFlowSchedulerAgent WinterFlowUnitTestResponse(int i) {
        int i2;
        ArrayList arrayList;
        int WinterFlowCacheManagerAgent;
        HashMap hashMap = this.WinterFlowServiceUtility;
        if (hashMap != null) {
            if (this.WinterFlowTransactionAgent) {
                WinterFlowSessionManagerEntity.WinterFlowRouterStructure("use active SlotWriter to crate an anchor for location instead");
            }
            WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = (i < 0 || i >= (i2 = this.WinterFlowTransactionManagerStrategy) || (WinterFlowCacheManagerAgent = WinterFlowQueryTool.WinterFlowCacheManagerAgent((arrayList = this.WinterFlowThreadListener), i, i2)) < 0) ? null : (WinterFlowDatabaseSchemaHandler) arrayList.get(WinterFlowCacheManagerAgent);
            if (winterFlowDatabaseSchemaHandler != null) {
                return (WinterFlowSchedulerAgent) hashMap.get(winterFlowDatabaseSchemaHandler);
            }
        }
        return null;
    }

    public final WinterFlowServiceProviderListener WinterFlowVariableVersionControl() {
        if (this.WinterFlowTransactionAgent) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot start a writer when another writer is pending");
        }
        if (this.WinterFlowSyntax > 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot start a writer when a reader is pending");
        }
        this.WinterFlowTransactionAgent = true;
        this.WinterFlowServerProtocol++;
        return new WinterFlowServiceProviderListener(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowArrayService(this, 0, this.WinterFlowTransactionManagerStrategy);
    }
}
