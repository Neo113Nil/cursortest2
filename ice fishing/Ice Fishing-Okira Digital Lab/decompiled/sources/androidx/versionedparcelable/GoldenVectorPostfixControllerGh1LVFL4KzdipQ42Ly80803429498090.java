package androidx.versionedparcelable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class GoldenVectorPostfixControllerGh1LVFL4KzdipQ42Ly80803429498090 extends RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996 {
    public static Map HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return ZenithPathClassRegistryTikLDp7rebsiLius2r62452628353528.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        }
        int i = 0;
        if (size == 1) {
            UltraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614 ultraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614 = (UltraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614) arrayList.get(0);
            ultraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614.getClass();
            Map singletonMap = Collections.singletonMap(ultraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, ultraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            UltraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614 ultraBufferCacheLoaderZ57q4UvuldSC2jrJcJ556715287176142 = (UltraBufferCacheLoaderZ57q4UvuldSC2jrJcJ55671528717614) obj;
            linkedHashMap.put(ultraBufferCacheLoaderZ57q4UvuldSC2jrJcJ556715287176142.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, ultraBufferCacheLoaderZ57q4UvuldSC2jrJcJ556715287176142.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        }
        return linkedHashMap;
    }

    public static Map MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        int size = linkedHashMap.size();
        if (size == 0) {
            return ZenithPathClassRegistryTikLDp7rebsiLius2r62452628353528.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static int ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914(int i) {
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

    public static Object ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(HashMap hashMap, Object obj) {
        hashMap.getClass();
        Object obj2 = hashMap.get(obj);
        if (obj2 != null || hashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
