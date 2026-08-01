package com.google.android.datatransport;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowThreadNode {
    public int WinterFlowArrayNetwork;
    public final WinterFlowAlgorithmDebug WinterFlowCacheManagerAgent;
    public final WinterFlowFunctionComponent WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowVariableVersionControl;

    public WinterFlowThreadNode(int i) {
        this.WinterFlowRouterStructure = i;
        if (i <= 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("maxSize <= 0");
            throw null;
        }
        this.WinterFlowHookDataSource = new WinterFlowFunctionComponent(1);
        this.WinterFlowCacheManagerAgent = new WinterFlowAlgorithmDebug(12);
    }

    public final Object WinterFlowArrayNetwork(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.WinterFlowCacheManagerAgent) {
            this.WinterFlowArrayNetwork++;
            put = this.WinterFlowHookDataSource.WinterFlowRouterStructure.put(obj, obj2);
            if (put != null) {
                this.WinterFlowArrayNetwork--;
            }
        }
        if (put != null) {
            WinterFlowHookDataSource(obj, put, obj2);
        }
        WinterFlowTransactionManagerStrategy(this.WinterFlowRouterStructure);
        return put;
    }

    public final Object WinterFlowCacheManagerAgent(Object obj) {
        Object put;
        synchronized (this.WinterFlowCacheManagerAgent) {
            Object obj2 = this.WinterFlowHookDataSource.WinterFlowRouterStructure.get(obj);
            if (obj2 != null) {
                this.WinterFlowVariableVersionControl++;
                return obj2;
            }
            this.WinterFlowTransactionManagerStrategy++;
            Object WinterFlowRouterStructure = WinterFlowRouterStructure(obj);
            if (WinterFlowRouterStructure == null) {
                return null;
            }
            synchronized (this.WinterFlowCacheManagerAgent) {
                try {
                    put = this.WinterFlowHookDataSource.WinterFlowRouterStructure.put(obj, WinterFlowRouterStructure);
                    if (put != null) {
                        this.WinterFlowHookDataSource.WinterFlowRouterStructure.put(obj, put);
                    } else {
                        this.WinterFlowArrayNetwork++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                WinterFlowHookDataSource(obj, WinterFlowRouterStructure, put);
                return put;
            }
            WinterFlowTransactionManagerStrategy(this.WinterFlowRouterStructure);
            return WinterFlowRouterStructure;
        }
    }

    public void WinterFlowHookDataSource(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public Object WinterFlowRouterStructure(Object obj) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003a, B:25:0x0059, B:27:0x005f, B:33:0x0044, B:34:0x004a, B:37:0x0055, B:12:0x0081, B:13:0x0088), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowTransactionManagerStrategy(int i) {
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.WinterFlowCacheManagerAgent) {
                try {
                    if (this.WinterFlowArrayNetwork < 0 || (this.WinterFlowHookDataSource.WinterFlowRouterStructure.isEmpty() && this.WinterFlowArrayNetwork != 0)) {
                        break;
                    }
                    if (this.WinterFlowArrayNetwork <= i || this.WinterFlowHookDataSource.WinterFlowRouterStructure.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.WinterFlowHookDataSource.WinterFlowRouterStructure.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            WinterFlowFunctionComponent winterFlowFunctionComponent = this.WinterFlowHookDataSource;
                            key.getClass();
                            winterFlowFunctionComponent.WinterFlowRouterStructure.remove(key);
                            int i2 = this.WinterFlowArrayNetwork;
                            value.getClass();
                            this.WinterFlowArrayNetwork = i2 - 1;
                        }
                        next = null;
                        entry = (Map.Entry) next;
                        if (entry != null) {
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        } else {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            WinterFlowHookDataSource(key, value, null);
        }
    }

    public final Object WinterFlowVariableVersionControl(Object obj) {
        Object remove;
        synchronized (this.WinterFlowCacheManagerAgent) {
            remove = this.WinterFlowHookDataSource.WinterFlowRouterStructure.remove(obj);
            if (remove != null) {
                this.WinterFlowArrayNetwork--;
            }
        }
        if (remove != null) {
            WinterFlowHookDataSource(obj, remove, null);
        }
        return remove;
    }

    public final String toString() {
        String str;
        synchronized (this.WinterFlowCacheManagerAgent) {
            try {
                int i = this.WinterFlowVariableVersionControl;
                int i2 = this.WinterFlowTransactionManagerStrategy + i;
                str = "LruCache[maxSize=" + this.WinterFlowRouterStructure + ",hits=" + this.WinterFlowVariableVersionControl + ",misses=" + this.WinterFlowTransactionManagerStrategy + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
