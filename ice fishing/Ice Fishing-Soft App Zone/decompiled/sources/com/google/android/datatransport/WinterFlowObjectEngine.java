package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectEngine extends WinterFlowNodeInheritance implements WinterFlowControllerScript {
    public /* synthetic */ WinterFlowDataSourceSerializer WinterFlowResponseEngine;
    public /* synthetic */ WinterFlowJavaBandwidth WinterFlowSyntax;

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        WinterFlowObjectEngine winterFlowObjectEngine = new WinterFlowObjectEngine(3, (WinterFlowTransactionManagerLayer) obj3);
        winterFlowObjectEngine.WinterFlowSyntax = (WinterFlowJavaBandwidth) obj;
        winterFlowObjectEngine.WinterFlowResponseEngine = (WinterFlowDataSourceSerializer) obj2;
        return winterFlowObjectEngine.WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowJavaBandwidth winterFlowJavaBandwidth = this.WinterFlowSyntax;
        WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = this.WinterFlowResponseEngine;
        Set keySet = winterFlowDataSourceSerializer.WinterFlowRouterStructure().keySet();
        ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((WinterFlowNetworkFramework) it.next()).WinterFlowRouterStructure);
        }
        Map<String, ?> all = winterFlowJavaBandwidth.WinterFlowRouterStructure.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = winterFlowJavaBandwidth.WinterFlowHookDataSource;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(WinterFlowDataSourceUtility.WinterFlowFrameworkTransaction(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        WinterFlowDataSourceSerializer winterFlowDataSourceSerializer2 = new WinterFlowDataSourceSerializer(new LinkedHashMap(winterFlowDataSourceSerializer.WinterFlowRouterStructure()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                winterFlowDataSourceSerializer2.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                winterFlowDataSourceSerializer2.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                winterFlowDataSourceSerializer2.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                winterFlowDataSourceSerializer2.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                winterFlowDataSourceSerializer2.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                winterFlowDataSourceSerializer2.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str), (Set) value2);
            }
        }
        return new WinterFlowDataSourceSerializer(new LinkedHashMap(winterFlowDataSourceSerializer2.WinterFlowRouterStructure()), true);
    }
}
