package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowGatewayRouter {
    public static final /* synthetic */ long WinterFlowResponseEngine;
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowRouterRouter;
    public static final /* synthetic */ long WinterFlowServerProtocol;
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowSyntax;
    public static final /* synthetic */ long WinterFlowTransactionAgent;
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowUnitTestResponse;
    public final WinterFlowUnitTestUtility WinterFlowTransactionManagerStrategy;
    public final int WinterFlowVariableVersionControl;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowTransactionAgent = unsafe.objectFieldOffset(WinterFlowGatewayRouter.class.getDeclaredField("head$volatile"));
        WinterFlowUnitTestResponse = AtomicLongFieldUpdater.newUpdater(WinterFlowGatewayRouter.class, "deqIdx$volatile");
        WinterFlowServerProtocol = unsafe.objectFieldOffset(WinterFlowGatewayRouter.class.getDeclaredField("tail$volatile"));
        WinterFlowRouterRouter = AtomicLongFieldUpdater.newUpdater(WinterFlowGatewayRouter.class, "enqIdx$volatile");
        WinterFlowSyntax = AtomicIntegerFieldUpdater.newUpdater(WinterFlowGatewayRouter.class, "_availablePermits$volatile");
        WinterFlowResponseEngine = unsafe.objectFieldOffset(WinterFlowGatewayRouter.class.getDeclaredField("_availablePermits$volatile"));
    }

    public WinterFlowGatewayRouter(int i) {
        this.WinterFlowVariableVersionControl = i;
        if (i <= 0) {
            WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("The number of acquired permits should be in 0..", i));
            throw null;
        }
        WinterFlowRepository winterFlowRepository = new WinterFlowRepository(0L, null, 2);
        this.head$volatile = winterFlowRepository;
        this.tail$volatile = winterFlowRepository;
        this._availablePermits$volatile = i;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowUnitTestUtility(3, this);
    }

    public final void WinterFlowCacheManagerAgent() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object WinterFlowMapperProtocol;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = WinterFlowSyntax.getAndIncrement(this);
            int i2 = this.WinterFlowVariableVersionControl;
            if (andIncrement >= i2) {
                do {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    j = WinterFlowResponseEngine;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.WinterFlowVariableVersionControl;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j2 = WinterFlowTransactionAgent;
            WinterFlowRepository winterFlowRepository = (WinterFlowRepository) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = WinterFlowUnitTestResponse.getAndIncrement(this);
            long j3 = andIncrement2 / WinterFlowEventRouter.WinterFlowTransactionManagerStrategy;
            WinterFlowSyntaxDatabaseSchema winterFlowSyntaxDatabaseSchema = WinterFlowSyntaxDatabaseSchema.WinterFlowServerProtocol;
            while (true) {
                WinterFlowMapperProtocol = WinterFlowEncryptionSubsystem.WinterFlowMapperProtocol(winterFlowRepository, j3, winterFlowSyntaxDatabaseSchema);
                if (WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
                    break;
                }
                WinterFlowDatabaseDeserialization WinterFlowUnitTestResponse2 = WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
                while (true) {
                    WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization = (WinterFlowDatabaseDeserialization) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, j2);
                    if (winterFlowDatabaseDeserialization.WinterFlowArrayNetwork >= WinterFlowUnitTestResponse2.WinterFlowArrayNetwork) {
                        break;
                    }
                    if (!WinterFlowUnitTestResponse2.WinterFlowSyntax()) {
                        break;
                    }
                    do {
                        unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe2.compareAndSwapObject(this, WinterFlowTransactionAgent, winterFlowDatabaseDeserialization, WinterFlowUnitTestResponse2)) {
                            if (winterFlowDatabaseDeserialization.WinterFlowVariableVersionControl()) {
                                winterFlowDatabaseDeserialization.WinterFlowArrayNetwork();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == winterFlowDatabaseDeserialization);
                    if (WinterFlowUnitTestResponse2.WinterFlowVariableVersionControl()) {
                        WinterFlowUnitTestResponse2.WinterFlowArrayNetwork();
                    }
                }
            }
            WinterFlowRepository winterFlowRepository2 = (WinterFlowRepository) WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
            AtomicReferenceArray atomicReferenceArray = winterFlowRepository2.WinterFlowUnitTestResponse;
            winterFlowRepository2.WinterFlowRouterStructure();
            z = false;
            if (winterFlowRepository2.WinterFlowArrayNetwork <= j3) {
                int i3 = (int) (andIncrement2 % WinterFlowEventRouter.WinterFlowTransactionManagerStrategy);
                Object andSet = atomicReferenceArray.getAndSet(i3, WinterFlowEventRouter.WinterFlowHookDataSource);
                if (andSet == null) {
                    int i4 = WinterFlowEventRouter.WinterFlowRouterStructure;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == WinterFlowEventRouter.WinterFlowCacheManagerAgent) {
                            z = true;
                            break;
                        }
                    }
                    WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowEventRouter.WinterFlowHookDataSource;
                    WinterFlowJSONDecorator winterFlowJSONDecorator2 = WinterFlowEventRouter.WinterFlowArrayNetwork;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, winterFlowJSONDecorator, winterFlowJSONDecorator2)) {
                            if (atomicReferenceArray.get(i3) != winterFlowJSONDecorator) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != WinterFlowEventRouter.WinterFlowVariableVersionControl) {
                    if (!(andSet instanceof WinterFlowAPIVersion)) {
                        WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(andSet, "unexpected: ");
                        return;
                    }
                    WinterFlowAPIVersion winterFlowAPIVersion = (WinterFlowAPIVersion) andSet;
                    WinterFlowJSONDecorator WinterFlowCacheManagerAgent = winterFlowAPIVersion.WinterFlowCacheManagerAgent(WinterFlowAlgorithmSession.WinterFlowRouterStructure, this.WinterFlowTransactionManagerStrategy);
                    if (WinterFlowCacheManagerAgent != null) {
                        winterFlowAPIVersion.WinterFlowVariableBandwidth(WinterFlowCacheManagerAgent);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }

    public final boolean WinterFlowRouterStructure(WinterFlowTransactionIDE winterFlowTransactionIDE) {
        Object WinterFlowMapperProtocol;
        Unsafe unsafe;
        WinterFlowGatewayRouter winterFlowGatewayRouter = this;
        Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowServerProtocol;
        WinterFlowRepository winterFlowRepository = (WinterFlowRepository) unsafe2.getObjectVolatile(winterFlowGatewayRouter, j);
        long andIncrement = WinterFlowRouterRouter.getAndIncrement(winterFlowGatewayRouter);
        WinterFlowHookProtocol winterFlowHookProtocol = WinterFlowHookProtocol.WinterFlowServerProtocol;
        long j2 = andIncrement / WinterFlowEventRouter.WinterFlowTransactionManagerStrategy;
        loop0: while (true) {
            WinterFlowMapperProtocol = WinterFlowEncryptionSubsystem.WinterFlowMapperProtocol(winterFlowRepository, j2, winterFlowHookProtocol);
            if (WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
                break;
            }
            WinterFlowDatabaseDeserialization WinterFlowUnitTestResponse2 = WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
            while (true) {
                WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization = (WinterFlowDatabaseDeserialization) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowGatewayRouter, j);
                if (winterFlowDatabaseDeserialization.WinterFlowArrayNetwork >= WinterFlowUnitTestResponse2.WinterFlowArrayNetwork) {
                    winterFlowGatewayRouter = this;
                    break loop0;
                }
                if (!WinterFlowUnitTestResponse2.WinterFlowSyntax()) {
                    break;
                }
                do {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    winterFlowGatewayRouter = this;
                    if (unsafe.compareAndSwapObject(winterFlowGatewayRouter, WinterFlowServerProtocol, winterFlowDatabaseDeserialization, WinterFlowUnitTestResponse2)) {
                        if (winterFlowDatabaseDeserialization.WinterFlowVariableVersionControl()) {
                            winterFlowDatabaseDeserialization.WinterFlowArrayNetwork();
                        }
                    }
                } while (unsafe.getObjectVolatile(winterFlowGatewayRouter, j) == winterFlowDatabaseDeserialization);
                if (WinterFlowUnitTestResponse2.WinterFlowVariableVersionControl()) {
                    WinterFlowUnitTestResponse2.WinterFlowArrayNetwork();
                }
            }
            winterFlowGatewayRouter = this;
        }
        WinterFlowRepository winterFlowRepository2 = (WinterFlowRepository) WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
        AtomicReferenceArray atomicReferenceArray = winterFlowRepository2.WinterFlowUnitTestResponse;
        int i = (int) (andIncrement % WinterFlowEventRouter.WinterFlowTransactionManagerStrategy);
        while (!atomicReferenceArray.compareAndSet(i, null, winterFlowTransactionIDE)) {
            if (atomicReferenceArray.get(i) != null) {
                WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowEventRouter.WinterFlowHookDataSource;
                WinterFlowJSONDecorator winterFlowJSONDecorator2 = WinterFlowEventRouter.WinterFlowCacheManagerAgent;
                while (!atomicReferenceArray.compareAndSet(i, winterFlowJSONDecorator, winterFlowJSONDecorator2)) {
                    if (atomicReferenceArray.get(i) != winterFlowJSONDecorator) {
                        return false;
                    }
                }
                ((WinterFlowAPIVersion) winterFlowTransactionIDE).WinterFlowConcurrencyThread(WinterFlowAlgorithmSession.WinterFlowRouterStructure, winterFlowGatewayRouter.WinterFlowTransactionManagerStrategy);
                return true;
            }
        }
        winterFlowTransactionIDE.WinterFlowRouterStructure(winterFlowRepository2, i);
        return true;
    }
}
