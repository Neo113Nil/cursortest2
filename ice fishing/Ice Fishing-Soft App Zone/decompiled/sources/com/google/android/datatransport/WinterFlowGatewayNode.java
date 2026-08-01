package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewayNode {
    public final List WinterFlowArrayNetwork;
    public final List WinterFlowCacheManagerAgent;
    public final boolean WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public WinterFlowGatewayNode(String str, boolean z, List list, List list2) {
        str.getClass();
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = z;
        this.WinterFlowCacheManagerAgent = list;
        this.WinterFlowArrayNetwork = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.WinterFlowArrayNetwork = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowGatewayNode)) {
            return false;
        }
        WinterFlowGatewayNode winterFlowGatewayNode = (WinterFlowGatewayNode) obj;
        String str = winterFlowGatewayNode.WinterFlowRouterStructure;
        if (this.WinterFlowHookDataSource != winterFlowGatewayNode.WinterFlowHookDataSource || !this.WinterFlowCacheManagerAgent.equals(winterFlowGatewayNode.WinterFlowCacheManagerAgent) || !WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowGatewayNode.WinterFlowArrayNetwork)) {
            return false;
        }
        String str2 = this.WinterFlowRouterStructure;
        return WinterFlowHookModule.WinterFlowResolverController(str2, "index_") ? WinterFlowHookModule.WinterFlowResolverController(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.WinterFlowRouterStructure;
        return this.WinterFlowArrayNetwork.hashCode() + ((this.WinterFlowCacheManagerAgent.hashCode() + ((((WinterFlowHookModule.WinterFlowResolverController(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.WinterFlowHookDataSource ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return WinterFlowEventUtility.WinterFlowRouterAdapter(WinterFlowEventUtility.WinterFlowSerializerStructure("\n            |Index {\n            |   name = '" + this.WinterFlowRouterStructure + "',\n            |   unique = '" + this.WinterFlowHookDataSource + "',\n            |   columns = {" + WinterFlowConfigurationException.WinterFlowUnitTestResponse(this.WinterFlowCacheManagerAgent) + "\n            |   orders = {" + WinterFlowConfigurationException.WinterFlowTransactionManagerStrategy(this.WinterFlowArrayNetwork) + "\n            |}\n        "));
    }
}
