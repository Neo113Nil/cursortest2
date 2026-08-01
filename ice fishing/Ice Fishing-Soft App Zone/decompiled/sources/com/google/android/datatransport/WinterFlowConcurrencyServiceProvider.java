package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyServiceProvider {
    public static final /* synthetic */ long WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ long WinterFlowUnitTestResponse;
    public static final WinterFlowJSONDecorator WinterFlowVariableVersionControl;
    public final /* synthetic */ AtomicReferenceArray WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final boolean WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowTransactionManagerStrategy = unsafe.objectFieldOffset(WinterFlowConcurrencyServiceProvider.class.getDeclaredField("_next$volatile"));
        WinterFlowUnitTestResponse = unsafe.objectFieldOffset(WinterFlowConcurrencyServiceProvider.class.getDeclaredField("_state$volatile"));
        WinterFlowVariableVersionControl = new WinterFlowJSONDecorator(25, "REMOVE_FROZEN");
    }

    public WinterFlowConcurrencyServiceProvider(int i, boolean z) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = z;
        int i2 = i - 1;
        this.WinterFlowCacheManagerAgent = i2;
        this.WinterFlowArrayNetwork = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Check failed.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowArrayNetwork() {
        WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = this;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowUnitTestResponse;
            long longVolatile = unsafe.getLongVolatile(winterFlowConcurrencyServiceProvider, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return WinterFlowVariableVersionControl;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = winterFlowConcurrencyServiceProvider.WinterFlowArrayNetwork;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = winterFlowConcurrencyServiceProvider.WinterFlowHookDataSource;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof WinterFlowMapperAdapter) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (unsafe.compareAndSwapLong(winterFlowConcurrencyServiceProvider, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                winterFlowConcurrencyServiceProvider = this;
                if (z) {
                    while (true) {
                        Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        long j3 = WinterFlowUnitTestResponse;
                        long longVolatile2 = unsafe2.getLongVolatile(winterFlowConcurrencyServiceProvider, j3);
                        int i5 = (int) (longVolatile2 & 1073741823);
                        if ((longVolatile2 & 1152921504606846976L) != 0) {
                            winterFlowConcurrencyServiceProvider = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent();
                        } else {
                            if (unsafe2.compareAndSwapLong(winterFlowConcurrencyServiceProvider, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                winterFlowConcurrencyServiceProvider.WinterFlowArrayNetwork.set(winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent & i5, null);
                                winterFlowConcurrencyServiceProvider = null;
                            } else {
                                continue;
                            }
                        }
                        if (winterFlowConcurrencyServiceProvider == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }

    public final WinterFlowConcurrencyServiceProvider WinterFlowCacheManagerAgent() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j2 = WinterFlowUnitTestResponse;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j3 = WinterFlowTransactionManagerStrategy;
            WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = (WinterFlowConcurrencyServiceProvider) unsafe3.getObjectVolatile(this, j3);
            if (winterFlowConcurrencyServiceProvider != null) {
                return winterFlowConcurrencyServiceProvider;
            }
            WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider2 = new WinterFlowConcurrencyServiceProvider(this.WinterFlowRouterStructure * 2, this.WinterFlowHookDataSource);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.WinterFlowCacheManagerAgent;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.WinterFlowArrayNetwork.get(i4);
                if (obj == null) {
                    obj = new WinterFlowMapperAdapter(i);
                }
                winterFlowConcurrencyServiceProvider2.WinterFlowArrayNetwork.set(winterFlowConcurrencyServiceProvider2.WinterFlowCacheManagerAgent & i, obj);
                i++;
            }
            WinterFlowQueueThreadPool.WinterFlowRouterStructure.putLongVolatile(winterFlowConcurrencyServiceProvider2, WinterFlowUnitTestResponse, j & (-1152921504606846977L));
            do {
                unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                if (unsafe.compareAndSwapObject(this, WinterFlowTransactionManagerStrategy, (Object) null, winterFlowConcurrencyServiceProvider2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    public final boolean WinterFlowHookDataSource() {
        while (true) {
            long longVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, WinterFlowUnitTestResponse);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = this;
            if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.compareAndSwapLong(winterFlowConcurrencyServiceProvider, WinterFlowUnitTestResponse, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = winterFlowConcurrencyServiceProvider;
        }
    }

    public final int WinterFlowRouterStructure(Object obj) {
        WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = this;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowUnitTestResponse;
            long longVolatile = unsafe.getLongVolatile(winterFlowConcurrencyServiceProvider, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = winterFlowConcurrencyServiceProvider.WinterFlowHookDataSource;
            AtomicReferenceArray atomicReferenceArray = winterFlowConcurrencyServiceProvider.WinterFlowArrayNetwork;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(winterFlowConcurrencyServiceProvider, WinterFlowUnitTestResponse, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider2 = this;
                    while ((WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(winterFlowConcurrencyServiceProvider2, j) & 1152921504606846976L) != 0) {
                        winterFlowConcurrencyServiceProvider2 = winterFlowConcurrencyServiceProvider2.WinterFlowCacheManagerAgent();
                        AtomicReferenceArray atomicReferenceArray2 = winterFlowConcurrencyServiceProvider2.WinterFlowArrayNetwork;
                        int i4 = winterFlowConcurrencyServiceProvider2.WinterFlowCacheManagerAgent & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof WinterFlowMapperAdapter) && ((WinterFlowMapperAdapter) obj2).WinterFlowRouterStructure == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            winterFlowConcurrencyServiceProvider2 = null;
                        }
                        if (winterFlowConcurrencyServiceProvider2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                winterFlowConcurrencyServiceProvider = this;
            } else {
                int i5 = winterFlowConcurrencyServiceProvider.WinterFlowRouterStructure;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }
}
