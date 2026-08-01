package com.google.android.datatransport;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceSerializer {
    public final WinterFlowConfigurationModule WinterFlowHookDataSource;
    public final LinkedHashMap WinterFlowRouterStructure;

    public WinterFlowDataSourceSerializer(LinkedHashMap linkedHashMap, boolean z) {
        this.WinterFlowRouterStructure = linkedHashMap;
        this.WinterFlowHookDataSource = new WinterFlowConfigurationModule(z);
    }

    public final void WinterFlowArrayNetwork(WinterFlowNetworkFramework winterFlowNetworkFramework, Object obj) {
        winterFlowNetworkFramework.getClass();
        WinterFlowHookDataSource();
        LinkedHashMap linkedHashMap = this.WinterFlowRouterStructure;
        if (obj == null) {
            WinterFlowHookDataSource();
            linkedHashMap.remove(winterFlowNetworkFramework);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(winterFlowNetworkFramework, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(winterFlowNetworkFramework, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(winterFlowNetworkFramework, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final void WinterFlowCacheManagerAgent(WinterFlowNetworkFramework winterFlowNetworkFramework, Object obj) {
        winterFlowNetworkFramework.getClass();
        WinterFlowArrayNetwork(winterFlowNetworkFramework, obj);
    }

    public final void WinterFlowHookDataSource() {
        if (((AtomicBoolean) this.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy).get()) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Map WinterFlowRouterStructure() {
        WinterFlowServerPlatform winterFlowServerPlatform;
        Set<Map.Entry> entrySet = this.WinterFlowRouterStructure.entrySet();
        int WinterFlowFrameworkTransaction = WinterFlowDataSourceUtility.WinterFlowFrameworkTransaction(WinterFlowModuleThread.WinterFlowModuleAgent(entrySet, 10));
        if (WinterFlowFrameworkTransaction < 16) {
            WinterFlowFrameworkTransaction = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(WinterFlowFrameworkTransaction);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                winterFlowServerPlatform = new WinterFlowServerPlatform(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                winterFlowServerPlatform = new WinterFlowServerPlatform(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(winterFlowServerPlatform.WinterFlowVariableVersionControl, winterFlowServerPlatform.WinterFlowTransactionManagerStrategy);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof WinterFlowDataSourceSerializer) {
            LinkedHashMap linkedHashMap = ((WinterFlowDataSourceSerializer) obj).WinterFlowRouterStructure;
            LinkedHashMap linkedHashMap2 = this.WinterFlowRouterStructure;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = WinterFlowManagerRequest.WinterFlowThreadListener(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.WinterFlowRouterStructure.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return WinterFlowSerializerUtility.WinterFlowHookQuery(this.WinterFlowRouterStructure.entrySet(), ",\n", "{\n", "\n}", WinterFlowServiceProviderBatch.WinterFlowCompilerVariable, 24);
    }

    public /* synthetic */ WinterFlowDataSourceSerializer(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
