package com.google.android.datatransport;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrontendMechanism {
    public final WinterFlowJavaOrchestration WinterFlowRouterStructure;
    public static final WinterFlowNetworkFramework WinterFlowHookDataSource = new WinterFlowNetworkFramework("fire-global");
    public static final WinterFlowNetworkFramework WinterFlowCacheManagerAgent = new WinterFlowNetworkFramework("fire-count");
    public static final WinterFlowNetworkFramework WinterFlowArrayNetwork = new WinterFlowNetworkFramework("last-used-date");

    public WinterFlowFrontendMechanism(Context context, String str) {
        this.WinterFlowRouterStructure = new WinterFlowJavaOrchestration(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized void WinterFlowArrayNetwork(WinterFlowDataSourceSerializer winterFlowDataSourceSerializer, String str) {
        WinterFlowNetworkFramework WinterFlowCacheManagerAgent2 = WinterFlowCacheManagerAgent(winterFlowDataSourceSerializer, str);
        if (WinterFlowCacheManagerAgent2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) WinterFlowUnitTestLibrary.WinterFlowResolverController(winterFlowDataSourceSerializer, WinterFlowCacheManagerAgent2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            winterFlowDataSourceSerializer.WinterFlowHookDataSource();
            winterFlowDataSourceSerializer.WinterFlowRouterStructure.remove(WinterFlowCacheManagerAgent2);
        } else {
            winterFlowDataSourceSerializer.WinterFlowArrayNetwork(WinterFlowCacheManagerAgent2, hashSet);
        }
    }

    public final synchronized WinterFlowNetworkFramework WinterFlowCacheManagerAgent(WinterFlowDataSourceSerializer winterFlowDataSourceSerializer, String str) {
        for (Map.Entry entry : winterFlowDataSourceSerializer.WinterFlowRouterStructure().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((WinterFlowNetworkFramework) entry.getKey()).WinterFlowRouterStructure;
                        str2.getClass();
                        return new WinterFlowNetworkFramework(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized String WinterFlowHookDataSource(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized ArrayList WinterFlowRouterStructure() {
        try {
            ArrayList arrayList = new ArrayList();
            String WinterFlowHookDataSource2 = WinterFlowHookDataSource(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) WinterFlowQuerySyntax.WinterFlowCacheManagerListener(WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl, new WinterFlowGatewayWorker(this.WinterFlowRouterStructure, (WinterFlowTransactionManagerLayer) null, 5))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(WinterFlowHookDataSource2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new WinterFlowJSONMicroservice(((WinterFlowNetworkFramework) entry.getKey()).WinterFlowRouterStructure, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.WinterFlowRouterStructure.WinterFlowRouterStructure(new WinterFlowMiddlewareLibrary(1, currentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean WinterFlowVariableVersionControl(WinterFlowNetworkFramework winterFlowNetworkFramework, long j) {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer;
        WinterFlowEventEmitterPackage winterFlowEventEmitterPackage;
        long longValue;
        WinterFlowJavaOrchestration winterFlowJavaOrchestration = this.WinterFlowRouterStructure;
        winterFlowNetworkFramework.getClass();
        winterFlowTransactionManagerLayer = null;
        WinterFlowModuleStack winterFlowModuleStack = new WinterFlowModuleStack(winterFlowJavaOrchestration, winterFlowNetworkFramework, winterFlowTransactionManagerLayer, 15);
        winterFlowEventEmitterPackage = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
        longValue = ((Long) WinterFlowQuerySyntax.WinterFlowCacheManagerListener(winterFlowEventEmitterPackage, winterFlowModuleStack)).longValue();
        synchronized (this) {
        }
        if (WinterFlowHookDataSource(longValue).equals(WinterFlowHookDataSource(j))) {
            return false;
        }
        return true;
    }
}
