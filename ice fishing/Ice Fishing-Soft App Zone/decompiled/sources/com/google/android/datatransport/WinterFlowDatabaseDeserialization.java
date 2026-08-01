package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDatabaseDeserialization extends WinterFlowMicroserviceHelper implements WinterFlowWorkerNetwork {
    public final long WinterFlowArrayNetwork;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowVariableVersionControl = AtomicIntegerFieldUpdater.newUpdater(WinterFlowDatabaseDeserialization.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long WinterFlowTransactionManagerStrategy = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowDatabaseDeserialization.class.getDeclaredField("cleanedAndPointers$volatile"));

    public WinterFlowDatabaseDeserialization(long j, WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization, int i) {
        super(winterFlowDatabaseDeserialization);
        this.WinterFlowArrayNetwork = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceHelper
    public final boolean WinterFlowCacheManagerAgent() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowTransactionManagerStrategy) == WinterFlowTransactionManagerStrategy() && WinterFlowHookDataSource() != null;
    }

    public final void WinterFlowRouterRouter() {
        if (WinterFlowVariableVersionControl.incrementAndGet(this) == WinterFlowTransactionManagerStrategy()) {
            WinterFlowArrayNetwork();
        }
    }

    public final boolean WinterFlowSyntax() {
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowTransactionManagerStrategy;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.WinterFlowTransactionManagerStrategy() && this.WinterFlowHookDataSource() != null) {
                return false;
            }
            WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization = this;
            if (unsafe.compareAndSwapInt(winterFlowDatabaseDeserialization, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = winterFlowDatabaseDeserialization;
        }
    }

    public abstract int WinterFlowTransactionManagerStrategy();

    public abstract void WinterFlowUnitTestResponse(int i, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice);

    public final boolean WinterFlowVariableVersionControl() {
        return WinterFlowVariableVersionControl.addAndGet(this, -65536) == WinterFlowTransactionManagerStrategy() && WinterFlowHookDataSource() != null;
    }
}
