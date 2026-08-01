package com.google.android.datatransport;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowVariableDeserialization {
    public static final /* synthetic */ long WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ long WinterFlowUnitTestResponse;
    public static final /* synthetic */ long WinterFlowVariableVersionControl;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowVariableVersionControl = unsafe.objectFieldOffset(WinterFlowVariableDeserialization.class.getDeclaredField("_next$volatile"));
        WinterFlowTransactionManagerStrategy = unsafe.objectFieldOffset(WinterFlowVariableDeserialization.class.getDeclaredField("_prev$volatile"));
        WinterFlowUnitTestResponse = unsafe.objectFieldOffset(WinterFlowVariableDeserialization.class.getDeclaredField("_removedRef$volatile"));
    }

    public final WinterFlowVariableDeserialization WinterFlowResponseEngine() {
        WinterFlowVariableDeserialization WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy();
        if (WinterFlowTransactionManagerStrategy2 != null) {
            return WinterFlowTransactionManagerStrategy2;
        }
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowTransactionManagerStrategy;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            WinterFlowVariableDeserialization winterFlowVariableDeserialization = (WinterFlowVariableDeserialization) objectVolatile;
            if (!winterFlowVariableDeserialization.WinterFlowTransactionAgent()) {
                return winterFlowVariableDeserialization;
            }
            objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowVariableDeserialization, j);
        }
    }

    public final Object WinterFlowRouterRouter() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowVariableVersionControl);
    }

    public final WinterFlowVariableDeserialization WinterFlowSyntax() {
        Object WinterFlowRouterRouter = WinterFlowRouterRouter();
        WinterFlowUnitTestProtocol winterFlowUnitTestProtocol = WinterFlowRouterRouter instanceof WinterFlowUnitTestProtocol ? (WinterFlowUnitTestProtocol) WinterFlowRouterRouter : null;
        if (winterFlowUnitTestProtocol != null) {
            return winterFlowUnitTestProtocol.WinterFlowRouterStructure;
        }
        WinterFlowRouterRouter.getClass();
        return (WinterFlowVariableDeserialization) WinterFlowRouterRouter;
    }

    public boolean WinterFlowTransactionAgent() {
        return WinterFlowRouterRouter() instanceof WinterFlowUnitTestProtocol;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowVariableDeserialization WinterFlowTransactionManagerStrategy() {
        WinterFlowVariableDeserialization winterFlowVariableDeserialization;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowTransactionManagerStrategy;
            WinterFlowVariableDeserialization winterFlowVariableDeserialization2 = (WinterFlowVariableDeserialization) unsafe2.getObjectVolatile(this, j);
            WinterFlowVariableDeserialization winterFlowVariableDeserialization3 = null;
            WinterFlowVariableDeserialization winterFlowVariableDeserialization4 = winterFlowVariableDeserialization2;
            while (winterFlowVariableDeserialization4 != null) {
                Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                long j2 = WinterFlowVariableVersionControl;
                Object objectVolatile = unsafe3.getObjectVolatile(winterFlowVariableDeserialization4, j2);
                if (objectVolatile != this) {
                    WinterFlowVariableDeserialization winterFlowVariableDeserialization5 = winterFlowVariableDeserialization2;
                    winterFlowVariableDeserialization = this;
                    if (winterFlowVariableDeserialization.WinterFlowTransactionAgent()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof WinterFlowUnitTestProtocol)) {
                        objectVolatile.getClass();
                        winterFlowVariableDeserialization3 = winterFlowVariableDeserialization4;
                        winterFlowVariableDeserialization4 = (WinterFlowVariableDeserialization) objectVolatile;
                    } else if (winterFlowVariableDeserialization3 != null) {
                        WinterFlowVariableDeserialization winterFlowVariableDeserialization6 = ((WinterFlowUnitTestProtocol) objectVolatile).WinterFlowRouterStructure;
                        do {
                            WinterFlowVariableDeserialization winterFlowVariableDeserialization7 = winterFlowVariableDeserialization4;
                            unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(winterFlowVariableDeserialization3, WinterFlowVariableVersionControl, winterFlowVariableDeserialization7, winterFlowVariableDeserialization6);
                            winterFlowVariableDeserialization4 = winterFlowVariableDeserialization7;
                            if (compareAndSwapObject) {
                                this = winterFlowVariableDeserialization;
                                winterFlowVariableDeserialization4 = winterFlowVariableDeserialization3;
                                winterFlowVariableDeserialization2 = winterFlowVariableDeserialization5;
                                winterFlowVariableDeserialization3 = null;
                            }
                        } while (unsafe.getObjectVolatile(winterFlowVariableDeserialization3, j2) == winterFlowVariableDeserialization4);
                    } else {
                        if (winterFlowVariableDeserialization4 == null) {
                            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                            return null;
                        }
                        winterFlowVariableDeserialization4 = (WinterFlowVariableDeserialization) unsafe3.getObjectVolatile(winterFlowVariableDeserialization4, j);
                    }
                    this = winterFlowVariableDeserialization;
                    winterFlowVariableDeserialization2 = winterFlowVariableDeserialization5;
                } else {
                    if (winterFlowVariableDeserialization2 == winterFlowVariableDeserialization4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        WinterFlowVariableDeserialization winterFlowVariableDeserialization8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(winterFlowVariableDeserialization8, WinterFlowTransactionManagerStrategy, winterFlowVariableDeserialization2, winterFlowVariableDeserialization4);
                        WinterFlowVariableDeserialization winterFlowVariableDeserialization9 = winterFlowVariableDeserialization2;
                        winterFlowVariableDeserialization = winterFlowVariableDeserialization8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(winterFlowVariableDeserialization, j) != winterFlowVariableDeserialization9) {
                            break;
                        }
                        this = winterFlowVariableDeserialization;
                        winterFlowVariableDeserialization2 = winterFlowVariableDeserialization9;
                    }
                }
                this = winterFlowVariableDeserialization;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return null;
        }
    }

    public final void WinterFlowUnitTestResponse(WinterFlowVariableDeserialization winterFlowVariableDeserialization) {
        WinterFlowVariableDeserialization winterFlowVariableDeserialization2;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowTransactionManagerStrategy;
            WinterFlowVariableDeserialization winterFlowVariableDeserialization3 = (WinterFlowVariableDeserialization) unsafe.getObjectVolatile(winterFlowVariableDeserialization, j);
            if (this.WinterFlowRouterRouter() != winterFlowVariableDeserialization) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                winterFlowVariableDeserialization2 = this;
                WinterFlowVariableDeserialization winterFlowVariableDeserialization4 = winterFlowVariableDeserialization;
                if (unsafe2.compareAndSwapObject(winterFlowVariableDeserialization4, WinterFlowTransactionManagerStrategy, winterFlowVariableDeserialization3, winterFlowVariableDeserialization2)) {
                    if (winterFlowVariableDeserialization2.WinterFlowTransactionAgent()) {
                        winterFlowVariableDeserialization4.WinterFlowTransactionManagerStrategy();
                        return;
                    }
                    return;
                } else {
                    winterFlowVariableDeserialization = winterFlowVariableDeserialization4;
                    if (unsafe2.getObjectVolatile(winterFlowVariableDeserialization4, j) != winterFlowVariableDeserialization3) {
                        break;
                    } else {
                        this = winterFlowVariableDeserialization2;
                    }
                }
            }
            this = winterFlowVariableDeserialization2;
        }
    }

    public final boolean WinterFlowVariableVersionControl(WinterFlowVariableDeserialization winterFlowVariableDeserialization, int i) {
        WinterFlowVariableDeserialization winterFlowVariableDeserialization2;
        WinterFlowVariableDeserialization winterFlowVariableDeserialization3;
        while (true) {
            WinterFlowVariableDeserialization WinterFlowResponseEngine = this.WinterFlowResponseEngine();
            if (WinterFlowResponseEngine instanceof WinterFlowCompilerProcess) {
                return (((WinterFlowCompilerProcess) WinterFlowResponseEngine).WinterFlowRouterRouter & i) == 0 && WinterFlowResponseEngine.WinterFlowVariableVersionControl(winterFlowVariableDeserialization, i);
            }
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            unsafe.putObjectVolatile(winterFlowVariableDeserialization, WinterFlowTransactionManagerStrategy, WinterFlowResponseEngine);
            long j = WinterFlowVariableVersionControl;
            unsafe.putObjectVolatile(winterFlowVariableDeserialization, j, this);
            while (true) {
                Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                winterFlowVariableDeserialization2 = this;
                winterFlowVariableDeserialization3 = winterFlowVariableDeserialization;
                if (unsafe2.compareAndSwapObject(WinterFlowResponseEngine, WinterFlowVariableVersionControl, winterFlowVariableDeserialization2, winterFlowVariableDeserialization3)) {
                    winterFlowVariableDeserialization3.WinterFlowUnitTestResponse(winterFlowVariableDeserialization2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(WinterFlowResponseEngine, j) != winterFlowVariableDeserialization2) {
                    break;
                }
                this = winterFlowVariableDeserialization2;
                winterFlowVariableDeserialization = winterFlowVariableDeserialization3;
            }
            this = winterFlowVariableDeserialization2;
            winterFlowVariableDeserialization = winterFlowVariableDeserialization3;
        }
    }

    public String toString() {
        return new WinterFlowFrameworkHelper(1, 1, WinterFlowQuerySyntax.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + WinterFlowQuerySyntax.WinterFlowBandwidthObject(this);
    }
}
