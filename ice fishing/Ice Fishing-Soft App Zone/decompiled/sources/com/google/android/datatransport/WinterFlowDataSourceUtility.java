package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDataSourceUtility extends WinterFlowCloudStack {
    public static Object WinterFlowCompilerDataSource(HashMap hashMap, Object obj) {
        hashMap.getClass();
        Object obj2 = hashMap.get(obj);
        if (obj2 != null || hashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int WinterFlowFrameworkTransaction(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map WinterFlowModuleAgent(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        }
        int i = 0;
        if (size == 1) {
            WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) arrayList.get(0);
            winterFlowServerPlatform.getClass();
            Map singletonMap = Collections.singletonMap(winterFlowServerPlatform.WinterFlowVariableVersionControl, winterFlowServerPlatform.WinterFlowTransactionManagerStrategy);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(WinterFlowFrameworkTransaction(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) obj;
            linkedHashMap.put(winterFlowServerPlatform2.WinterFlowVariableVersionControl, winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy);
        }
        return linkedHashMap;
    }

    public static Map WinterFlowOrchestrationConfiguration(WinterFlowServerPlatform... winterFlowServerPlatformArr) {
        if (winterFlowServerPlatformArr.length <= 0) {
            return WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(WinterFlowFrameworkTransaction(winterFlowServerPlatformArr.length));
        for (WinterFlowServerPlatform winterFlowServerPlatform : winterFlowServerPlatformArr) {
            linkedHashMap.put(winterFlowServerPlatform.WinterFlowVariableVersionControl, winterFlowServerPlatform.WinterFlowTransactionManagerStrategy);
        }
        return linkedHashMap;
    }

    public static Map WinterFlowSessionManagerInterface(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }
}
