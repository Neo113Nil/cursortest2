package com.google.android.datatransport;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptManager {
    public final LinkedHashMap WinterFlowRouterStructure = new LinkedHashMap();

    public final void WinterFlowRouterStructure() {
        LinkedHashMap linkedHashMap = this.WinterFlowRouterStructure;
        Map WinterFlowSessionManagerInterface = WinterFlowDataSourceUtility.WinterFlowSessionManagerInterface(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = WinterFlowSessionManagerInterface.values().iterator();
        while (it.hasNext()) {
            ((WinterFlowTransactionVariable) it.next()).WinterFlowHookDataSource();
        }
    }

    public final String toString() {
        String WinterFlowCacheManagerAgent = WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowScriptManager.class).WinterFlowCacheManagerAgent();
        if (WinterFlowCacheManagerAgent == null) {
            WinterFlowCacheManagerAgent = "ViewModelStore";
        }
        int hashCode = hashCode();
        WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return WinterFlowCacheManagerAgent + "@" + num + "(keys=" + WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility(this.WinterFlowRouterStructure.keySet()) + ")";
    }
}
