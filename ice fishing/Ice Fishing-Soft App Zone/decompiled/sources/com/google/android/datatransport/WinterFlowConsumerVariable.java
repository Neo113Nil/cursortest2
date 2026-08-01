package com.google.android.datatransport;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerVariable {
    public final WinterFlowAlgorithmArray WinterFlowHookDataSource;
    public final ReentrantLock WinterFlowRouterStructure;
    public static final WinterFlowAlgorithmDebug WinterFlowCacheManagerAgent = new WinterFlowAlgorithmDebug(6);
    public static final LinkedHashMap WinterFlowArrayNetwork = new LinkedHashMap();

    public WinterFlowConsumerVariable(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (WinterFlowCacheManagerAgent) {
            try {
                LinkedHashMap linkedHashMap = WinterFlowArrayNetwork;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.WinterFlowRouterStructure = reentrantLock;
        this.WinterFlowHookDataSource = z ? new WinterFlowAlgorithmArray(str) : null;
    }
}
