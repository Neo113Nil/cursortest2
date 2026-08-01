package com.google.android.datatransport;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowMicroserviceHelper {
    public static final /* synthetic */ int WinterFlowCacheManagerAgent = 0;
    public static final /* synthetic */ long WinterFlowHookDataSource;
    public static final /* synthetic */ long WinterFlowRouterStructure;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowRouterStructure = unsafe.objectFieldOffset(WinterFlowMicroserviceHelper.class.getDeclaredField("_next$volatile"));
        WinterFlowHookDataSource = unsafe.objectFieldOffset(WinterFlowMicroserviceHelper.class.getDeclaredField("_prev$volatile"));
    }

    public WinterFlowMicroserviceHelper(WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization) {
        this._prev$volatile = winterFlowDatabaseDeserialization;
    }

    public final void WinterFlowArrayNetwork() {
        WinterFlowMicroserviceHelper winterFlowMicroserviceHelper;
        Unsafe unsafe;
        if (WinterFlowHookDataSource() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowHookDataSource;
            WinterFlowMicroserviceHelper winterFlowMicroserviceHelper2 = (WinterFlowMicroserviceHelper) unsafe2.getObjectVolatile(this, j);
            while (winterFlowMicroserviceHelper2 != null && winterFlowMicroserviceHelper2.WinterFlowCacheManagerAgent()) {
                winterFlowMicroserviceHelper2 = (WinterFlowMicroserviceHelper) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowMicroserviceHelper2, j);
            }
            WinterFlowMicroserviceHelper WinterFlowHookDataSource2 = WinterFlowHookDataSource();
            WinterFlowHookDataSource2.getClass();
            do {
                winterFlowMicroserviceHelper = WinterFlowHookDataSource2;
                if (!winterFlowMicroserviceHelper.WinterFlowCacheManagerAgent()) {
                    break;
                } else {
                    WinterFlowHookDataSource2 = winterFlowMicroserviceHelper.WinterFlowHookDataSource();
                }
            } while (WinterFlowHookDataSource2 != null);
            while (true) {
                Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowMicroserviceHelper, j);
                WinterFlowMicroserviceHelper winterFlowMicroserviceHelper3 = ((WinterFlowMicroserviceHelper) objectVolatile) == null ? null : winterFlowMicroserviceHelper2;
                do {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    if (unsafe.compareAndSwapObject(winterFlowMicroserviceHelper, WinterFlowHookDataSource, objectVolatile, winterFlowMicroserviceHelper3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(winterFlowMicroserviceHelper, j) == objectVolatile);
            }
            if (winterFlowMicroserviceHelper2 != null) {
                unsafe.putObjectVolatile(winterFlowMicroserviceHelper2, WinterFlowRouterStructure, winterFlowMicroserviceHelper);
            }
            if (!winterFlowMicroserviceHelper.WinterFlowCacheManagerAgent() || winterFlowMicroserviceHelper.WinterFlowHookDataSource() == null) {
                if (winterFlowMicroserviceHelper2 == null || !winterFlowMicroserviceHelper2.WinterFlowCacheManagerAgent()) {
                    return;
                }
            }
        }
    }

    public abstract boolean WinterFlowCacheManagerAgent();

    public final WinterFlowMicroserviceHelper WinterFlowHookDataSource() {
        Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowRouterStructure);
        if (objectVolatile == WinterFlowEncryptionSubsystem.WinterFlowVariableVersionControl) {
            return null;
        }
        return (WinterFlowMicroserviceHelper) objectVolatile;
    }

    public final void WinterFlowRouterStructure() {
        WinterFlowQueueThreadPool.WinterFlowRouterStructure.putObjectVolatile(this, WinterFlowHookDataSource, (Object) null);
    }
}
