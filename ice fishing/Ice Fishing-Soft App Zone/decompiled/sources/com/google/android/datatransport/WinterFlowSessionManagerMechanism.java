package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerMechanism {
    public static final /* synthetic */ long WinterFlowArrayNetwork;
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowCacheManagerAgent;
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowHookDataSource;
    public static final /* synthetic */ long WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ long WinterFlowUnitTestResponse;
    public static final /* synthetic */ long WinterFlowVariableVersionControl;
    public final AtomicReferenceArray WinterFlowRouterStructure = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowTransactionManagerStrategy = unsafe.objectFieldOffset(WinterFlowSessionManagerMechanism.class.getDeclaredField("lastScheduledTask$volatile"));
        WinterFlowHookDataSource = AtomicIntegerFieldUpdater.newUpdater(WinterFlowSessionManagerMechanism.class, "producerIndex$volatile");
        WinterFlowUnitTestResponse = unsafe.objectFieldOffset(WinterFlowSessionManagerMechanism.class.getDeclaredField("producerIndex$volatile"));
        WinterFlowVariableVersionControl = unsafe.objectFieldOffset(WinterFlowSessionManagerMechanism.class.getDeclaredField("consumerIndex$volatile"));
        WinterFlowCacheManagerAgent = AtomicIntegerFieldUpdater.newUpdater(WinterFlowSessionManagerMechanism.class, "blockingTasksInBuffer$volatile");
        WinterFlowArrayNetwork = unsafe.objectFieldOffset(WinterFlowSessionManagerMechanism.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final WinterFlowUIQuery WinterFlowArrayNetwork(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.WinterFlowRouterStructure;
        WinterFlowUIQuery winterFlowUIQuery = (WinterFlowUIQuery) atomicReferenceArray.get(i2);
        if (winterFlowUIQuery != null && winterFlowUIQuery.WinterFlowTransactionManagerStrategy == z) {
            while (!atomicReferenceArray.compareAndSet(i2, winterFlowUIQuery, null)) {
                if (atomicReferenceArray.get(i2) != winterFlowUIQuery) {
                }
            }
            if (z) {
                WinterFlowCacheManagerAgent.decrementAndGet(this);
            }
            return winterFlowUIQuery;
        }
        return null;
    }

    public final WinterFlowUIQuery WinterFlowCacheManagerAgent() {
        WinterFlowUIQuery winterFlowUIQuery;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowVariableVersionControl;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, WinterFlowUnitTestResponse) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            WinterFlowSessionManagerMechanism winterFlowSessionManagerMechanism = this;
            if (unsafe.compareAndSwapInt(winterFlowSessionManagerMechanism, j, intVolatile, intVolatile + 1) && (winterFlowUIQuery = (WinterFlowUIQuery) winterFlowSessionManagerMechanism.WinterFlowRouterStructure.getAndSet(i, null)) != null) {
                if (winterFlowUIQuery.WinterFlowTransactionManagerStrategy) {
                    WinterFlowCacheManagerAgent.decrementAndGet(winterFlowSessionManagerMechanism);
                }
                return winterFlowUIQuery;
            }
            this = winterFlowSessionManagerMechanism;
        }
    }

    public final int WinterFlowHookDataSource() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowUnitTestResponse) - WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowVariableVersionControl);
    }

    public final WinterFlowUIQuery WinterFlowRouterStructure(WinterFlowUIQuery winterFlowUIQuery) {
        if (WinterFlowHookDataSource() == 127) {
            return winterFlowUIQuery;
        }
        if (winterFlowUIQuery.WinterFlowTransactionManagerStrategy) {
            WinterFlowCacheManagerAgent.incrementAndGet(this);
        }
        int intVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowUnitTestResponse) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.WinterFlowRouterStructure;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, winterFlowUIQuery);
                WinterFlowHookDataSource.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }
}
