package com.google.android.datatransport;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowDatabaseSchemaObject {
    public static final /* synthetic */ long WinterFlowRouterStructure = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowDatabaseSchemaObject.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new WinterFlowConcurrencyServiceProvider(8, false);

    public final Object WinterFlowArrayNetwork() {
        WinterFlowDatabaseSchemaObject winterFlowDatabaseSchemaObject;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowRouterStructure;
            WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = (WinterFlowConcurrencyServiceProvider) unsafe.getObjectVolatile(this, j);
            Object WinterFlowArrayNetwork = winterFlowConcurrencyServiceProvider.WinterFlowArrayNetwork();
            if (WinterFlowArrayNetwork != WinterFlowConcurrencyServiceProvider.WinterFlowVariableVersionControl) {
                return WinterFlowArrayNetwork;
            }
            WinterFlowConcurrencyServiceProvider WinterFlowCacheManagerAgent = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent();
            while (true) {
                winterFlowDatabaseSchemaObject = this;
                if (!WinterFlowQueueThreadPool.WinterFlowRouterStructure.compareAndSwapObject(winterFlowDatabaseSchemaObject, WinterFlowRouterStructure, winterFlowConcurrencyServiceProvider, WinterFlowCacheManagerAgent) && WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowDatabaseSchemaObject, j) == winterFlowConcurrencyServiceProvider) {
                    this = winterFlowDatabaseSchemaObject;
                }
            }
            this = winterFlowDatabaseSchemaObject;
        }
    }

    public final int WinterFlowCacheManagerAgent() {
        WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = (WinterFlowConcurrencyServiceProvider) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowRouterStructure);
        winterFlowConcurrencyServiceProvider.getClass();
        long longVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(winterFlowConcurrencyServiceProvider, WinterFlowConcurrencyServiceProvider.WinterFlowUnitTestResponse);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final void WinterFlowHookDataSource() {
        WinterFlowDatabaseSchemaObject winterFlowDatabaseSchemaObject;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowRouterStructure;
            WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = (WinterFlowConcurrencyServiceProvider) unsafe.getObjectVolatile(this, j);
            if (winterFlowConcurrencyServiceProvider.WinterFlowHookDataSource()) {
                return;
            }
            WinterFlowConcurrencyServiceProvider WinterFlowCacheManagerAgent = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent();
            while (true) {
                winterFlowDatabaseSchemaObject = this;
                if (!WinterFlowQueueThreadPool.WinterFlowRouterStructure.compareAndSwapObject(winterFlowDatabaseSchemaObject, WinterFlowRouterStructure, winterFlowConcurrencyServiceProvider, WinterFlowCacheManagerAgent) && WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowDatabaseSchemaObject, j) == winterFlowConcurrencyServiceProvider) {
                    this = winterFlowDatabaseSchemaObject;
                }
            }
            this = winterFlowDatabaseSchemaObject;
        }
    }

    public final boolean WinterFlowRouterStructure(Runnable runnable) {
        WinterFlowDatabaseSchemaObject winterFlowDatabaseSchemaObject;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowRouterStructure;
            WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = (WinterFlowConcurrencyServiceProvider) unsafe.getObjectVolatile(this, j);
            int WinterFlowRouterStructure2 = winterFlowConcurrencyServiceProvider.WinterFlowRouterStructure(runnable);
            if (WinterFlowRouterStructure2 == 0) {
                return true;
            }
            if (WinterFlowRouterStructure2 == 1) {
                WinterFlowConcurrencyServiceProvider WinterFlowCacheManagerAgent = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent();
                while (true) {
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    winterFlowDatabaseSchemaObject = this;
                    if (!unsafe2.compareAndSwapObject(winterFlowDatabaseSchemaObject, WinterFlowRouterStructure, winterFlowConcurrencyServiceProvider, WinterFlowCacheManagerAgent) && unsafe2.getObjectVolatile(winterFlowDatabaseSchemaObject, j) == winterFlowConcurrencyServiceProvider) {
                        this = winterFlowDatabaseSchemaObject;
                    }
                }
            } else {
                if (WinterFlowRouterStructure2 == 2) {
                    return false;
                }
                winterFlowDatabaseSchemaObject = this;
            }
            this = winterFlowDatabaseSchemaObject;
        }
    }
}
