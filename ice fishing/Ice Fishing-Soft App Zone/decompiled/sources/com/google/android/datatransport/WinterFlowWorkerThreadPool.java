package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowWorkerThreadPool implements WinterFlowFrameworkAgent {
    public static final /* synthetic */ long WinterFlowBandwidthObject;
    public static final /* synthetic */ long WinterFlowConcurrencyThread;
    public static final /* synthetic */ long WinterFlowOrchestrationSubsystem;
    public static final /* synthetic */ AtomicReferenceFieldUpdater WinterFlowResponseEngine;
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowRouterRouter;
    public static final /* synthetic */ long WinterFlowServerProtocol;
    public static final /* synthetic */ long WinterFlowServiceUtility;
    public static final /* synthetic */ long WinterFlowSingletonPlatform;
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowSyntax;
    public static final /* synthetic */ long WinterFlowThreadListener;
    public static final /* synthetic */ long WinterFlowTransactionAgent;
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowTransactionManagerStrategy = AtomicLongFieldUpdater.newUpdater(WinterFlowWorkerThreadPool.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater WinterFlowUnitTestResponse;
    public static final /* synthetic */ long WinterFlowVariableBandwidth;
    public final int WinterFlowVariableVersionControl;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowVariableBandwidth = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        WinterFlowUnitTestResponse = AtomicLongFieldUpdater.newUpdater(WinterFlowWorkerThreadPool.class, "receivers$volatile");
        WinterFlowConcurrencyThread = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("receivers$volatile"));
        WinterFlowRouterRouter = AtomicLongFieldUpdater.newUpdater(WinterFlowWorkerThreadPool.class, "bufferEnd$volatile");
        WinterFlowServerProtocol = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("bufferEnd$volatile"));
        WinterFlowSyntax = AtomicLongFieldUpdater.newUpdater(WinterFlowWorkerThreadPool.class, "completedExpandBuffersAndPauseFlag$volatile");
        WinterFlowBandwidthObject = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        WinterFlowSingletonPlatform = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("sendSegment$volatile"));
        WinterFlowResponseEngine = AtomicReferenceFieldUpdater.newUpdater(WinterFlowWorkerThreadPool.class, Object.class, "receiveSegment$volatile");
        WinterFlowOrchestrationSubsystem = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("receiveSegment$volatile"));
        WinterFlowThreadListener = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("bufferEndSegment$volatile"));
        WinterFlowTransactionAgent = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("_closeCause$volatile"));
        WinterFlowServiceUtility = unsafe.objectFieldOffset(WinterFlowWorkerThreadPool.class.getDeclaredField("closeHandler$volatile"));
    }

    public WinterFlowWorkerThreadPool(int i) {
        this.WinterFlowVariableVersionControl = i;
        if (i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableVersionControl(i, ", should be >=0", "Invalid channel capacity: ");
            throw null;
        }
        WinterFlowJSONEngine winterFlowJSONEngine = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = WinterFlowServerProtocol();
        WinterFlowJSONEngine winterFlowJSONEngine2 = new WinterFlowJSONEngine(0L, null, this, 3);
        this.sendSegment$volatile = winterFlowJSONEngine2;
        this.receiveSegment$volatile = winterFlowJSONEngine2;
        if (WinterFlowResolverController()) {
            winterFlowJSONEngine2 = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
            winterFlowJSONEngine2.getClass();
        }
        this.bufferEndSegment$volatile = winterFlowJSONEngine2;
        this._closeCause$volatile = WinterFlowNodeServiceProvider.WinterFlowVariableBandwidth;
    }

    public static boolean WinterFlowStrategyTool(Object obj) {
        if (!(obj instanceof WinterFlowAPIVersion)) {
            WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(obj, "Unexpected waiter: ");
            return false;
        }
        WinterFlowAPIVersion winterFlowAPIVersion = (WinterFlowAPIVersion) obj;
        WinterFlowJSONEngine winterFlowJSONEngine = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
        WinterFlowJSONDecorator WinterFlowCacheManagerAgent = winterFlowAPIVersion.WinterFlowCacheManagerAgent(WinterFlowAlgorithmSession.WinterFlowRouterStructure, null);
        if (WinterFlowCacheManagerAgent == null) {
            return false;
        }
        winterFlowAPIVersion.WinterFlowVariableBandwidth(WinterFlowCacheManagerAgent);
        return true;
    }

    public final void WinterFlowArrayHelper(WinterFlowTransactionIDE winterFlowTransactionIDE, boolean z) {
        if (winterFlowTransactionIDE instanceof WinterFlowAPIVersion) {
            ((WinterFlowTransactionManagerLayer) winterFlowTransactionIDE).WinterFlowSyntax(new WinterFlowDecoratorTool(z ? WinterFlowServiceUtility() : WinterFlowOrchestrationSubsystem()));
            return;
        }
        if (!(winterFlowTransactionIDE instanceof WinterFlowThreadPoolServiceProvider)) {
            WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(winterFlowTransactionIDE, "Unexpected waiter: ");
            return;
        }
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider = (WinterFlowThreadPoolServiceProvider) winterFlowTransactionIDE;
        WinterFlowEventCloud winterFlowEventCloud = winterFlowThreadPoolServiceProvider.WinterFlowTransactionManagerStrategy;
        winterFlowEventCloud.getClass();
        winterFlowThreadPoolServiceProvider.WinterFlowTransactionManagerStrategy = null;
        winterFlowThreadPoolServiceProvider.WinterFlowVariableVersionControl = WinterFlowNodeServiceProvider.WinterFlowServerProtocol;
        Throwable WinterFlowThreadListener2 = winterFlowThreadPoolServiceProvider.WinterFlowUnitTestResponse.WinterFlowThreadListener();
        if (WinterFlowThreadListener2 == null) {
            winterFlowEventCloud.WinterFlowSyntax(Boolean.FALSE);
        } else {
            winterFlowEventCloud.WinterFlowSyntax(new WinterFlowDecoratorTool(WinterFlowThreadListener2));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkAgent
    public final void WinterFlowArrayNetwork(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        WinterFlowCacheManagerAgent(cancellationException, true);
    }

    public final Object WinterFlowBackendCacheManager(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowTransactionManagerLayer));
        winterFlowEventCloud.WinterFlowSerializerStructure();
        winterFlowEventCloud.WinterFlowSyntax(new WinterFlowDecoratorTool(WinterFlowOrchestrationSubsystem()));
        Object WinterFlowBatchUI = winterFlowEventCloud.WinterFlowBatchUI();
        return WinterFlowBatchUI == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowBatchUI : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public final long WinterFlowBandwidthObject() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, WinterFlowConcurrencyThread);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a0, code lost:
    
        r12 = (com.google.android.datatransport.WinterFlowJSONEngine) ((com.google.android.datatransport.WinterFlowMicroserviceHelper) com.google.android.datatransport.WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(r12, com.google.android.datatransport.WinterFlowMicroserviceHelper.WinterFlowHookDataSource));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WinterFlowBatchUI(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                WinterFlowTransactionManagerStrategy(j & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        long j2 = WinterFlowOrchestrationSubsystem;
                        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) unsafe.getObjectVolatile(this, j2);
                        long WinterFlowBandwidthObject2 = WinterFlowBandwidthObject();
                        if (WinterFlowConcurrencyThread() <= WinterFlowBandwidthObject2) {
                            break;
                        }
                        long j3 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
                        long j4 = WinterFlowBandwidthObject2 / j3;
                        if (winterFlowJSONEngine.WinterFlowArrayNetwork != j4 && (winterFlowJSONEngine = WinterFlowResponseEngine(j4, winterFlowJSONEngine)) == null) {
                            if (((WinterFlowJSONEngine) unsafe.getObjectVolatile(this, j2)).WinterFlowArrayNetwork < j4) {
                                break;
                            }
                        } else {
                            winterFlowJSONEngine.WinterFlowRouterStructure();
                            int i2 = (int) (WinterFlowBandwidthObject2 % j3);
                            while (true) {
                                Object WinterFlowTransactionAgent2 = winterFlowJSONEngine.WinterFlowTransactionAgent(i2);
                                if (WinterFlowTransactionAgent2 == null || WinterFlowTransactionAgent2 == WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl) {
                                    if (winterFlowJSONEngine.WinterFlowResponseEngine(i2, WinterFlowTransactionAgent2, WinterFlowNodeServiceProvider.WinterFlowRouterRouter)) {
                                        WinterFlowSyntax();
                                        break;
                                    }
                                } else {
                                    if (WinterFlowTransactionAgent2 == WinterFlowNodeServiceProvider.WinterFlowArrayNetwork) {
                                        break;
                                    }
                                    if (WinterFlowTransactionAgent2 != WinterFlowNodeServiceProvider.WinterFlowResponseEngine) {
                                        if (WinterFlowTransactionAgent2 != WinterFlowNodeServiceProvider.WinterFlowServerProtocol) {
                                            if (WinterFlowTransactionAgent2 != WinterFlowNodeServiceProvider.WinterFlowSyntax) {
                                                if (WinterFlowTransactionAgent2 != WinterFlowNodeServiceProvider.WinterFlowRouterRouter) {
                                                    if (WinterFlowTransactionAgent2 == WinterFlowNodeServiceProvider.WinterFlowUnitTestResponse) {
                                                        break;
                                                    }
                                                    if (WinterFlowTransactionAgent2 != WinterFlowNodeServiceProvider.WinterFlowTransactionManagerStrategy && WinterFlowBandwidthObject2 == WinterFlowBandwidthObject()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            WinterFlowQueueThreadPool.WinterFlowRouterStructure.compareAndSwapLong(this, WinterFlowConcurrencyThread, WinterFlowBandwidthObject2, WinterFlowBandwidthObject2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(WinterFlowResolverBackend.WinterFlowSyntax("unexpected close status: ", i).toString());
                }
                WinterFlowJSONEngine WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i3 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (WinterFlowTransactionManagerStrategy2.WinterFlowArrayNetwork * WinterFlowNodeServiceProvider.WinterFlowHookDataSource) + i3;
                        while (true) {
                            Object WinterFlowTransactionAgent3 = WinterFlowTransactionManagerStrategy2.WinterFlowTransactionAgent(i3);
                            if (WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowSyntax) {
                                break loop0;
                            }
                            if (WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowArrayNetwork) {
                                if (j5 < WinterFlowBandwidthObject()) {
                                    break loop0;
                                }
                                if (WinterFlowTransactionManagerStrategy2.WinterFlowResponseEngine(i3, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                                    WinterFlowTransactionManagerStrategy2.WinterFlowThreadListener(i3, null);
                                    WinterFlowTransactionManagerStrategy2.WinterFlowRouterRouter();
                                    break;
                                }
                            } else if (WinterFlowTransactionAgent3 != WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl && WinterFlowTransactionAgent3 != null) {
                                if (!(WinterFlowTransactionAgent3 instanceof WinterFlowTransactionIDE) && !(WinterFlowTransactionAgent3 instanceof WinterFlowDataSourceOrchestration)) {
                                    WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowNodeServiceProvider.WinterFlowUnitTestResponse;
                                    if (WinterFlowTransactionAgent3 == winterFlowJSONDecorator || WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowTransactionManagerStrategy) {
                                        break loop0;
                                    }
                                    if (WinterFlowTransactionAgent3 != winterFlowJSONDecorator) {
                                        break;
                                    }
                                } else {
                                    if (j5 < WinterFlowBandwidthObject()) {
                                        break loop0;
                                    }
                                    WinterFlowTransactionIDE winterFlowTransactionIDE = WinterFlowTransactionAgent3 instanceof WinterFlowDataSourceOrchestration ? ((WinterFlowDataSourceOrchestration) WinterFlowTransactionAgent3).WinterFlowRouterStructure : (WinterFlowTransactionIDE) WinterFlowTransactionAgent3;
                                    if (WinterFlowTransactionManagerStrategy2.WinterFlowResponseEngine(i3, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                                        obj = WinterFlowHandlerWebsocket.WinterFlowSoftwareProtocol(obj, winterFlowTransactionIDE);
                                        WinterFlowTransactionManagerStrategy2.WinterFlowThreadListener(i3, null);
                                        WinterFlowTransactionManagerStrategy2.WinterFlowRouterRouter();
                                        break;
                                    }
                                }
                            } else if (WinterFlowTransactionManagerStrategy2.WinterFlowResponseEngine(i3, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                                WinterFlowTransactionManagerStrategy2.WinterFlowRouterRouter();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (WinterFlowTransactionManagerStrategy2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            WinterFlowArrayHelper((WinterFlowTransactionIDE) arrayList.get(size), false);
                        }
                    } else {
                        WinterFlowArrayHelper((WinterFlowTransactionIDE) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean WinterFlowCacheManagerAgent(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                long j4 = WinterFlowVariableBandwidth;
                long longVolatile3 = unsafe4.getLongVolatile(winterFlowWorkerThreadPool, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                WinterFlowJSONEngine winterFlowJSONEngine = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
                if (unsafe4.compareAndSwapLong(winterFlowWorkerThreadPool, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                winterFlowWorkerThreadPool = this;
            }
        }
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowNodeServiceProvider.WinterFlowVariableBandwidth;
        while (true) {
            Unsafe unsafe5 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j5 = WinterFlowTransactionAgent;
            if (unsafe5.compareAndSwapObject(this, j5, winterFlowJSONDecorator, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != winterFlowJSONDecorator) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                j3 = WinterFlowVariableBandwidth;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                j = WinterFlowVariableBandwidth;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        WinterFlowSerializerStructure();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                long j6 = WinterFlowServiceUtility;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                WinterFlowJSONDecorator winterFlowJSONDecorator2 = objectVolatile == null ? WinterFlowNodeServiceProvider.WinterFlowConcurrencyThread : WinterFlowNodeServiceProvider.WinterFlowSingletonPlatform;
                do {
                    unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    if (unsafe2.compareAndSwapObject(this, WinterFlowServiceUtility, objectVolatile, winterFlowJSONDecorator2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(1, objectVolatile);
                ((WinterFlowObjectSession) objectVolatile).WinterFlowUnitTestResponse(WinterFlowThreadListener());
                return z2;
            }
        }
        return z2;
    }

    public final Object WinterFlowCacheManagerListener(WinterFlowJSONEngine winterFlowJSONEngine, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = winterFlowJSONEngine.WinterFlowRouterRouter;
        Object WinterFlowTransactionAgent2 = winterFlowJSONEngine.WinterFlowTransactionAgent(i);
        long j2 = WinterFlowVariableBandwidth;
        if (WinterFlowTransactionAgent2 == null) {
            if (j >= (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return WinterFlowNodeServiceProvider.WinterFlowServiceUtility;
                }
                if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent2, obj)) {
                    WinterFlowSyntax();
                    return WinterFlowNodeServiceProvider.WinterFlowThreadListener;
                }
            }
        } else if (WinterFlowTransactionAgent2 == WinterFlowNodeServiceProvider.WinterFlowArrayNetwork && winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent2, WinterFlowNodeServiceProvider.WinterFlowSyntax)) {
            WinterFlowSyntax();
            Object obj2 = atomicReferenceArray.get(i * 2);
            winterFlowJSONEngine.WinterFlowThreadListener(i, null);
            return obj2;
        }
        while (true) {
            Object WinterFlowTransactionAgent3 = winterFlowJSONEngine.WinterFlowTransactionAgent(i);
            if (WinterFlowTransactionAgent3 == null || WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl) {
                if (j < (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowRouterRouter)) {
                        WinterFlowSyntax();
                        return WinterFlowNodeServiceProvider.WinterFlowBandwidthObject;
                    }
                } else {
                    if (obj == null) {
                        return WinterFlowNodeServiceProvider.WinterFlowServiceUtility;
                    }
                    if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent3, obj)) {
                        WinterFlowSyntax();
                        return WinterFlowNodeServiceProvider.WinterFlowThreadListener;
                    }
                }
            } else if (WinterFlowTransactionAgent3 != WinterFlowNodeServiceProvider.WinterFlowArrayNetwork) {
                WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowNodeServiceProvider.WinterFlowResponseEngine;
                if (WinterFlowTransactionAgent3 == winterFlowJSONDecorator) {
                    return WinterFlowNodeServiceProvider.WinterFlowBandwidthObject;
                }
                if (WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowRouterRouter) {
                    return WinterFlowNodeServiceProvider.WinterFlowBandwidthObject;
                }
                if (WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowServerProtocol) {
                    WinterFlowSyntax();
                    return WinterFlowNodeServiceProvider.WinterFlowBandwidthObject;
                }
                if (WinterFlowTransactionAgent3 != WinterFlowNodeServiceProvider.WinterFlowUnitTestResponse && winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowTransactionManagerStrategy)) {
                    boolean z = WinterFlowTransactionAgent3 instanceof WinterFlowDataSourceOrchestration;
                    if (z) {
                        WinterFlowTransactionAgent3 = ((WinterFlowDataSourceOrchestration) WinterFlowTransactionAgent3).WinterFlowRouterStructure;
                    }
                    if (WinterFlowStrategyTool(WinterFlowTransactionAgent3)) {
                        winterFlowJSONEngine.WinterFlowServiceUtility(i, WinterFlowNodeServiceProvider.WinterFlowSyntax);
                        WinterFlowSyntax();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        winterFlowJSONEngine.WinterFlowThreadListener(i, null);
                        return obj3;
                    }
                    winterFlowJSONEngine.WinterFlowServiceUtility(i, winterFlowJSONDecorator);
                    winterFlowJSONEngine.WinterFlowRouterRouter();
                    if (z) {
                        WinterFlowSyntax();
                    }
                    return WinterFlowNodeServiceProvider.WinterFlowBandwidthObject;
                }
            } else if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowSyntax)) {
                WinterFlowSyntax();
                Object obj4 = atomicReferenceArray.get(i * 2);
                winterFlowJSONEngine.WinterFlowThreadListener(i, null);
                return obj4;
            }
        }
    }

    public final Object WinterFlowCompilerVariable() {
        WinterFlowJSONEngine winterFlowJSONEngine;
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool;
        int i;
        WinterFlowGatewayParser winterFlowGatewayParser = WinterFlowManagerRequest.WinterFlowRouterStructure;
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long longVolatile = unsafe.getLongVolatile(this, WinterFlowConcurrencyThread);
        long longVolatile2 = unsafe.getLongVolatile(this, WinterFlowVariableBandwidth);
        if (WinterFlowBatchUI(longVolatile2, true)) {
            return new WinterFlowCloudHandler(WinterFlowThreadListener());
        }
        if (longVolatile >= (longVolatile2 & 1152921504606846975L)) {
            return winterFlowGatewayParser;
        }
        Object obj = WinterFlowNodeServiceProvider.WinterFlowTransactionAgent;
        WinterFlowJSONEngine winterFlowJSONEngine2 = (WinterFlowJSONEngine) unsafe.getObjectVolatile(this, WinterFlowOrchestrationSubsystem);
        while (!this.WinterFlowRouterAdapter()) {
            long andIncrement = WinterFlowUnitTestResponse.getAndIncrement(this);
            long j = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (winterFlowJSONEngine2.WinterFlowArrayNetwork != j2) {
                WinterFlowJSONEngine WinterFlowResponseEngine2 = this.WinterFlowResponseEngine(j2, winterFlowJSONEngine2);
                if (WinterFlowResponseEngine2 == null) {
                    continue;
                } else {
                    winterFlowJSONEngine = WinterFlowResponseEngine2;
                    i = i2;
                    winterFlowWorkerThreadPool = this;
                }
            } else {
                winterFlowJSONEngine = winterFlowJSONEngine2;
                winterFlowWorkerThreadPool = this;
                i = i2;
            }
            Object WinterFlowCacheManagerListener = winterFlowWorkerThreadPool.WinterFlowCacheManagerListener(winterFlowJSONEngine, i, andIncrement, obj);
            winterFlowJSONEngine2 = winterFlowJSONEngine;
            if (WinterFlowCacheManagerListener == WinterFlowNodeServiceProvider.WinterFlowThreadListener) {
                WinterFlowTransactionIDE winterFlowTransactionIDE = obj instanceof WinterFlowTransactionIDE ? (WinterFlowTransactionIDE) obj : null;
                if (winterFlowTransactionIDE != null) {
                    winterFlowTransactionIDE.WinterFlowRouterStructure(winterFlowJSONEngine2, i);
                }
                winterFlowWorkerThreadPool.WinterFlowUserManagerUserManager(andIncrement);
                winterFlowJSONEngine2.WinterFlowRouterRouter();
                return winterFlowGatewayParser;
            }
            if (WinterFlowCacheManagerListener != WinterFlowNodeServiceProvider.WinterFlowBandwidthObject) {
                if (WinterFlowCacheManagerListener != WinterFlowNodeServiceProvider.WinterFlowServiceUtility) {
                    winterFlowJSONEngine2.WinterFlowRouterStructure();
                    return WinterFlowCacheManagerListener;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("unexpected");
                return null;
            }
            if (andIncrement < winterFlowWorkerThreadPool.WinterFlowConcurrencyThread()) {
                winterFlowJSONEngine2.WinterFlowRouterStructure();
            }
            this = winterFlowWorkerThreadPool;
        }
        return new WinterFlowCloudHandler(this.WinterFlowThreadListener());
    }

    public final long WinterFlowConcurrencyThread() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, WinterFlowVariableBandwidth) & 1152921504606846975L;
    }

    public final boolean WinterFlowConfigurationSubsystem(Object obj, Object obj2) {
        if (!(obj instanceof WinterFlowThreadPoolServiceProvider)) {
            if (!(obj instanceof WinterFlowAPIVersion)) {
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(obj, "Unexpected receiver type: ");
                return false;
            }
            WinterFlowAPIVersion winterFlowAPIVersion = (WinterFlowAPIVersion) obj;
            WinterFlowJSONEngine winterFlowJSONEngine = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
            WinterFlowJSONDecorator WinterFlowCacheManagerAgent = winterFlowAPIVersion.WinterFlowCacheManagerAgent(obj2, null);
            if (WinterFlowCacheManagerAgent == null) {
                return false;
            }
            winterFlowAPIVersion.WinterFlowVariableBandwidth(WinterFlowCacheManagerAgent);
            return true;
        }
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider = (WinterFlowThreadPoolServiceProvider) obj;
        WinterFlowEventCloud winterFlowEventCloud = winterFlowThreadPoolServiceProvider.WinterFlowTransactionManagerStrategy;
        winterFlowEventCloud.getClass();
        winterFlowThreadPoolServiceProvider.WinterFlowTransactionManagerStrategy = null;
        winterFlowThreadPoolServiceProvider.WinterFlowVariableVersionControl = obj2;
        Boolean bool = Boolean.TRUE;
        winterFlowThreadPoolServiceProvider.WinterFlowUnitTestResponse.getClass();
        WinterFlowJSONEngine winterFlowJSONEngine2 = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
        WinterFlowJSONDecorator WinterFlowCacheManagerAgent2 = winterFlowEventCloud.WinterFlowCacheManagerAgent(bool, null);
        if (WinterFlowCacheManagerAgent2 == null) {
            return false;
        }
        winterFlowEventCloud.WinterFlowVariableBandwidth(WinterFlowCacheManagerAgent2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.WinterFlowVariableVersionControl() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5.WinterFlowArrayNetwork();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowConsumerUserManager(long j, WinterFlowJSONEngine winterFlowJSONEngine) {
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool;
        WinterFlowJSONEngine winterFlowJSONEngine2;
        WinterFlowJSONEngine winterFlowJSONEngine3;
        while (winterFlowJSONEngine.WinterFlowArrayNetwork < j && (winterFlowJSONEngine3 = (WinterFlowJSONEngine) winterFlowJSONEngine.WinterFlowHookDataSource()) != null) {
            winterFlowJSONEngine = winterFlowJSONEngine3;
        }
        while (true) {
            WinterFlowJSONEngine winterFlowJSONEngine4 = winterFlowJSONEngine;
            while (winterFlowJSONEngine4.WinterFlowCacheManagerAgent() && (winterFlowJSONEngine2 = (WinterFlowJSONEngine) winterFlowJSONEngine4.WinterFlowHookDataSource()) != null) {
                winterFlowJSONEngine4 = winterFlowJSONEngine2;
            }
            while (true) {
                Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                long j2 = WinterFlowThreadListener;
                WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization = (WinterFlowDatabaseDeserialization) unsafe.getObjectVolatile(this, j2);
                if (winterFlowDatabaseDeserialization.WinterFlowArrayNetwork >= winterFlowJSONEngine4.WinterFlowArrayNetwork) {
                    return;
                }
                if (!winterFlowJSONEngine4.WinterFlowSyntax()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    winterFlowWorkerThreadPool = this;
                    if (unsafe2.compareAndSwapObject(winterFlowWorkerThreadPool, WinterFlowThreadListener, winterFlowDatabaseDeserialization, winterFlowJSONEngine4)) {
                        if (winterFlowDatabaseDeserialization.WinterFlowVariableVersionControl()) {
                            winterFlowDatabaseDeserialization.WinterFlowArrayNetwork();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(winterFlowWorkerThreadPool, j2) != winterFlowDatabaseDeserialization) {
                        break;
                    } else {
                        this = winterFlowWorkerThreadPool;
                    }
                }
                this = winterFlowWorkerThreadPool;
            }
            winterFlowJSONEngine = winterFlowJSONEngine4;
        }
    }

    public final void WinterFlowEventEmitterController(Object obj, WinterFlowEventCloud winterFlowEventCloud) {
        winterFlowEventCloud.WinterFlowSyntax(new WinterFlowDecoratorTool(WinterFlowOrchestrationSubsystem()));
    }

    public final boolean WinterFlowHookDataSource(long j) {
        return j < WinterFlowServerProtocol() || j < WinterFlowBandwidthObject() + ((long) this.WinterFlowVariableVersionControl);
    }

    public boolean WinterFlowMapperProtocol() {
        return false;
    }

    public final Throwable WinterFlowOrchestrationSubsystem() {
        Throwable WinterFlowThreadListener2 = WinterFlowThreadListener();
        return WinterFlowThreadListener2 == null ? new WinterFlowResponseStrategy("Channel was closed") : WinterFlowThreadListener2;
    }

    public final int WinterFlowPackageIDE(WinterFlowJSONEngine winterFlowJSONEngine, int i, Object obj, long j, Object obj2, boolean z) {
        winterFlowJSONEngine.WinterFlowThreadListener(i, obj);
        if (z) {
            return WinterFlowSoftwareProtocol(winterFlowJSONEngine, i, obj, j, obj2, z);
        }
        Object WinterFlowTransactionAgent2 = winterFlowJSONEngine.WinterFlowTransactionAgent(i);
        if (WinterFlowTransactionAgent2 == null) {
            if (WinterFlowHookDataSource(j)) {
                if (winterFlowJSONEngine.WinterFlowResponseEngine(i, null, WinterFlowNodeServiceProvider.WinterFlowArrayNetwork)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (winterFlowJSONEngine.WinterFlowResponseEngine(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (WinterFlowTransactionAgent2 instanceof WinterFlowTransactionIDE) {
            winterFlowJSONEngine.WinterFlowThreadListener(i, null);
            if (WinterFlowConfigurationSubsystem(WinterFlowTransactionAgent2, obj)) {
                winterFlowJSONEngine.WinterFlowServiceUtility(i, WinterFlowNodeServiceProvider.WinterFlowSyntax);
                return 0;
            }
            WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowNodeServiceProvider.WinterFlowTransactionAgent;
            if (winterFlowJSONEngine.WinterFlowRouterRouter.getAndSet((i * 2) + 1, winterFlowJSONDecorator) == winterFlowJSONDecorator) {
                return 5;
            }
            winterFlowJSONEngine.WinterFlowServerProtocol(i, true);
            return 5;
        }
        return WinterFlowSoftwareProtocol(winterFlowJSONEngine, i, obj, j, obj2, z);
    }

    public final boolean WinterFlowResolverController() {
        long WinterFlowServerProtocol2 = WinterFlowServerProtocol();
        return WinterFlowServerProtocol2 == 0 || WinterFlowServerProtocol2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.WinterFlowVariableVersionControl() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.WinterFlowArrayNetwork();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowJSONEngine WinterFlowResponseEngine(long j, WinterFlowJSONEngine winterFlowJSONEngine) {
        Object WinterFlowMapperProtocol;
        WinterFlowJSONEngine winterFlowJSONEngine2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        WinterFlowJSONEngine winterFlowJSONEngine3 = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
        WinterFlowVersionDataSource winterFlowVersionDataSource = WinterFlowVersionDataSource.WinterFlowServerProtocol;
        loop0: while (true) {
            WinterFlowMapperProtocol = WinterFlowEncryptionSubsystem.WinterFlowMapperProtocol(winterFlowJSONEngine, j, winterFlowVersionDataSource);
            if (!WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
                WinterFlowDatabaseDeserialization WinterFlowUnitTestResponse2 = WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
                while (true) {
                    Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long j3 = WinterFlowOrchestrationSubsystem;
                    WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization = (WinterFlowDatabaseDeserialization) unsafe3.getObjectVolatile(this, j3);
                    if (winterFlowDatabaseDeserialization.WinterFlowArrayNetwork >= WinterFlowUnitTestResponse2.WinterFlowArrayNetwork) {
                        break loop0;
                    }
                    if (!WinterFlowUnitTestResponse2.WinterFlowSyntax()) {
                        break;
                    }
                    do {
                        unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe2.compareAndSwapObject(this, WinterFlowOrchestrationSubsystem, winterFlowDatabaseDeserialization, WinterFlowUnitTestResponse2)) {
                            if (winterFlowDatabaseDeserialization.WinterFlowVariableVersionControl()) {
                                winterFlowDatabaseDeserialization.WinterFlowArrayNetwork();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == winterFlowDatabaseDeserialization);
                    if (WinterFlowUnitTestResponse2.WinterFlowVariableVersionControl()) {
                        WinterFlowUnitTestResponse2.WinterFlowArrayNetwork();
                    }
                }
            } else {
                break;
            }
        }
        if (WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
            WinterFlowSerializerStructure();
            if (winterFlowJSONEngine.WinterFlowArrayNetwork * WinterFlowNodeServiceProvider.WinterFlowHookDataSource < WinterFlowConcurrencyThread()) {
                winterFlowJSONEngine.WinterFlowRouterStructure();
                return null;
            }
        } else {
            WinterFlowJSONEngine winterFlowJSONEngine4 = (WinterFlowJSONEngine) WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
            long j4 = winterFlowJSONEngine4.WinterFlowArrayNetwork;
            if (!WinterFlowResolverController() && j <= WinterFlowServerProtocol() / WinterFlowNodeServiceProvider.WinterFlowHookDataSource) {
                while (true) {
                    Unsafe unsafe4 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long j5 = WinterFlowThreadListener;
                    WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization2 = (WinterFlowDatabaseDeserialization) unsafe4.getObjectVolatile(this, j5);
                    if (winterFlowDatabaseDeserialization2.WinterFlowArrayNetwork >= j4 || !winterFlowJSONEngine4.WinterFlowSyntax()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        winterFlowJSONEngine2 = winterFlowJSONEngine4;
                        if (unsafe5.compareAndSwapObject(this, WinterFlowThreadListener, winterFlowDatabaseDeserialization2, winterFlowJSONEngine4)) {
                            if (winterFlowDatabaseDeserialization2.WinterFlowVariableVersionControl()) {
                                winterFlowDatabaseDeserialization2.WinterFlowArrayNetwork();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j5) != winterFlowDatabaseDeserialization2) {
                                break;
                            }
                            winterFlowJSONEngine4 = winterFlowJSONEngine2;
                        }
                    }
                    winterFlowJSONEngine4 = winterFlowJSONEngine2;
                }
            }
            winterFlowJSONEngine2 = winterFlowJSONEngine4;
            if (j4 <= j) {
                return winterFlowJSONEngine2;
            }
            long j6 = j4 * WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            do {
                unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                j2 = WinterFlowConcurrencyThread;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * WinterFlowNodeServiceProvider.WinterFlowHookDataSource < WinterFlowConcurrencyThread()) {
                winterFlowJSONEngine2.WinterFlowRouterStructure();
            }
        }
        return null;
    }

    public final boolean WinterFlowRouterAdapter() {
        return WinterFlowBatchUI(WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, WinterFlowVariableBandwidth), true);
    }

    public final void WinterFlowRouterRouter(long j) {
        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowOrchestrationSubsystem);
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j2 = WinterFlowConcurrencyThread;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.WinterFlowVariableVersionControl + longVolatile, this.WinterFlowServerProtocol())) {
                return;
            }
            WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this;
            if (unsafe.compareAndSwapLong(winterFlowWorkerThreadPool, j2, longVolatile, 1 + longVolatile)) {
                long j3 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (winterFlowJSONEngine.WinterFlowArrayNetwork != j4) {
                    WinterFlowJSONEngine WinterFlowResponseEngine2 = winterFlowWorkerThreadPool.WinterFlowResponseEngine(j4, winterFlowJSONEngine);
                    if (WinterFlowResponseEngine2 != null) {
                        winterFlowJSONEngine = WinterFlowResponseEngine2;
                    }
                }
                WinterFlowJSONEngine winterFlowJSONEngine2 = winterFlowJSONEngine;
                if (winterFlowWorkerThreadPool.WinterFlowCacheManagerListener(winterFlowJSONEngine2, i, longVolatile, null) != WinterFlowNodeServiceProvider.WinterFlowBandwidthObject) {
                    winterFlowJSONEngine2.WinterFlowRouterStructure();
                } else if (longVolatile < winterFlowWorkerThreadPool.WinterFlowConcurrencyThread()) {
                    winterFlowJSONEngine2.WinterFlowRouterStructure();
                }
                this = winterFlowWorkerThreadPool;
                winterFlowJSONEngine = winterFlowJSONEngine2;
            }
            this = winterFlowWorkerThreadPool;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[RETURN] */
    @Override // com.google.android.datatransport.WinterFlowInvokerPlatform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WinterFlowRouterStructure(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        Object obj2;
        Object obj3;
        Object WinterFlowBatchUI;
        Object obj4;
        String str;
        int i;
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this;
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowSingletonPlatform;
        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) unsafe.getObjectVolatile(winterFlowWorkerThreadPool, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowTransactionManagerStrategy;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(winterFlowWorkerThreadPool);
            long j2 = andIncrement & 1152921504606846975L;
            boolean WinterFlowBatchUI2 = winterFlowWorkerThreadPool.WinterFlowBatchUI(andIncrement, false);
            int i2 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = winterFlowJSONEngine.WinterFlowArrayNetwork;
            Object obj5 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            obj2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            if (j5 != j4) {
                WinterFlowJSONEngine WinterFlowTransactionAgent2 = winterFlowWorkerThreadPool.WinterFlowTransactionAgent(j4, winterFlowJSONEngine);
                if (WinterFlowTransactionAgent2 != null) {
                    winterFlowJSONEngine = WinterFlowTransactionAgent2;
                } else if (WinterFlowBatchUI2) {
                    Object WinterFlowBackendCacheManager = WinterFlowBackendCacheManager(winterFlowTransactionManagerLayer, obj);
                    if (WinterFlowBackendCacheManager == obj5) {
                        return WinterFlowBackendCacheManager;
                    }
                }
            }
            int WinterFlowPackageIDE = winterFlowWorkerThreadPool.WinterFlowPackageIDE(winterFlowJSONEngine, i3, obj, j2, null, WinterFlowBatchUI2);
            if (WinterFlowPackageIDE == 0) {
                winterFlowJSONEngine.WinterFlowRouterStructure();
                return obj2;
            }
            if (WinterFlowPackageIDE == 1) {
                break;
            }
            if (WinterFlowPackageIDE != 2) {
                if (WinterFlowPackageIDE == 3) {
                    WinterFlowEventCloud WinterFlowMapperProtocol = WinterFlowUnitTestLibrary.WinterFlowMapperProtocol(WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowTransactionManagerLayer));
                    try {
                        int WinterFlowPackageIDE2 = WinterFlowPackageIDE(winterFlowJSONEngine, i3, obj, j2, WinterFlowMapperProtocol, false);
                        if (WinterFlowPackageIDE2 != 0) {
                            if (WinterFlowPackageIDE2 == 1) {
                                obj3 = obj5;
                                WinterFlowMapperProtocol.WinterFlowSyntax(obj2);
                            } else if (WinterFlowPackageIDE2 != 2) {
                                if (WinterFlowPackageIDE2 != 4) {
                                    String str2 = "unexpected";
                                    if (WinterFlowPackageIDE2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    winterFlowJSONEngine.WinterFlowRouterStructure();
                                    WinterFlowJSONEngine winterFlowJSONEngine2 = (WinterFlowJSONEngine) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean WinterFlowBatchUI3 = WinterFlowBatchUI(andIncrement2, false);
                                        int i4 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j7 = i4;
                                        obj3 = obj5;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        if (winterFlowJSONEngine2.WinterFlowArrayNetwork != j8) {
                                            WinterFlowJSONEngine WinterFlowTransactionAgent3 = WinterFlowTransactionAgent(j8, winterFlowJSONEngine2);
                                            if (WinterFlowTransactionAgent3 != null) {
                                                str = str2;
                                                i = i5;
                                                winterFlowJSONEngine2 = WinterFlowTransactionAgent3;
                                            } else {
                                                if (WinterFlowBatchUI3) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            }
                                        } else {
                                            str = str2;
                                            i = i5;
                                        }
                                        int WinterFlowPackageIDE3 = WinterFlowPackageIDE(winterFlowJSONEngine2, i, obj, j6, WinterFlowMapperProtocol, WinterFlowBatchUI3);
                                        if (WinterFlowPackageIDE3 == 0) {
                                            winterFlowJSONEngine2.WinterFlowRouterStructure();
                                            break;
                                        }
                                        if (WinterFlowPackageIDE3 == 1) {
                                            break;
                                        }
                                        if (WinterFlowPackageIDE3 != 2) {
                                            if (WinterFlowPackageIDE3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (WinterFlowPackageIDE3 != 4) {
                                                if (WinterFlowPackageIDE3 == 5) {
                                                    winterFlowJSONEngine2.WinterFlowRouterStructure();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            } else if (j6 < WinterFlowBandwidthObject()) {
                                                winterFlowJSONEngine2.WinterFlowRouterStructure();
                                            }
                                        } else if (WinterFlowBatchUI3) {
                                            winterFlowJSONEngine2.WinterFlowRouterRouter();
                                        } else {
                                            WinterFlowMapperProtocol.WinterFlowRouterStructure(winterFlowJSONEngine2, i + i4);
                                        }
                                    }
                                } else {
                                    obj3 = obj5;
                                    if (j2 < WinterFlowBandwidthObject()) {
                                        winterFlowJSONEngine.WinterFlowRouterStructure();
                                    }
                                }
                                WinterFlowEventEmitterController(obj, WinterFlowMapperProtocol);
                            } else {
                                obj3 = obj5;
                                WinterFlowMapperProtocol.WinterFlowRouterStructure(winterFlowJSONEngine, i3 + i2);
                            }
                            WinterFlowBatchUI = WinterFlowMapperProtocol.WinterFlowBatchUI();
                            obj4 = obj3;
                            if (WinterFlowBatchUI != obj4) {
                                WinterFlowBatchUI = obj2;
                            }
                            if (WinterFlowBatchUI != obj4) {
                                return WinterFlowBatchUI;
                            }
                        } else {
                            obj3 = obj5;
                            winterFlowJSONEngine.WinterFlowRouterStructure();
                        }
                        WinterFlowMapperProtocol.WinterFlowSyntax(obj2);
                        WinterFlowBatchUI = WinterFlowMapperProtocol.WinterFlowBatchUI();
                        obj4 = obj3;
                        if (WinterFlowBatchUI != obj4) {
                        }
                        if (WinterFlowBatchUI != obj4) {
                            break;
                        }
                    } catch (Throwable th) {
                        WinterFlowMapperProtocol.WinterFlowCompilerVariable();
                        throw th;
                    }
                } else if (WinterFlowPackageIDE != 4) {
                    if (WinterFlowPackageIDE == 5) {
                        winterFlowJSONEngine.WinterFlowRouterStructure();
                    }
                    winterFlowWorkerThreadPool = this;
                } else {
                    if (j2 < WinterFlowBandwidthObject()) {
                        winterFlowJSONEngine.WinterFlowRouterStructure();
                    }
                    Object WinterFlowBackendCacheManager2 = WinterFlowBackendCacheManager(winterFlowTransactionManagerLayer, obj);
                    if (WinterFlowBackendCacheManager2 == obj5) {
                        return WinterFlowBackendCacheManager2;
                    }
                }
            } else if (WinterFlowBatchUI2) {
                winterFlowJSONEngine.WinterFlowRouterRouter();
                Object WinterFlowBackendCacheManager3 = WinterFlowBackendCacheManager(winterFlowTransactionManagerLayer, obj);
                if (WinterFlowBackendCacheManager3 == obj5) {
                    return WinterFlowBackendCacheManager3;
                }
            }
        }
        return obj2;
    }

    public final boolean WinterFlowSerializerStructure() {
        return WinterFlowBatchUI(WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, WinterFlowVariableBandwidth), false);
    }

    public final long WinterFlowServerProtocol() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, WinterFlowServerProtocol);
    }

    public final Throwable WinterFlowServiceUtility() {
        Throwable WinterFlowThreadListener2 = WinterFlowThreadListener();
        return WinterFlowThreadListener2 == null ? new WinterFlowResolverEngine("Channel was closed") : WinterFlowThreadListener2;
    }

    public final void WinterFlowSingletonPlatform(long j) {
        if ((WinterFlowSyntax.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, WinterFlowBandwidthObject) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final int WinterFlowSoftwareProtocol(WinterFlowJSONEngine winterFlowJSONEngine, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object WinterFlowTransactionAgent2 = winterFlowJSONEngine.WinterFlowTransactionAgent(i);
            if (WinterFlowTransactionAgent2 == null) {
                if (!WinterFlowHookDataSource(j) || z) {
                    if (z) {
                        if (winterFlowJSONEngine.WinterFlowResponseEngine(i, null, WinterFlowNodeServiceProvider.WinterFlowResponseEngine)) {
                            winterFlowJSONEngine.WinterFlowRouterRouter();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (winterFlowJSONEngine.WinterFlowResponseEngine(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (winterFlowJSONEngine.WinterFlowResponseEngine(i, null, WinterFlowNodeServiceProvider.WinterFlowArrayNetwork)) {
                    break;
                }
            } else {
                if (WinterFlowTransactionAgent2 != WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl) {
                    WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowNodeServiceProvider.WinterFlowTransactionAgent;
                    if (WinterFlowTransactionAgent2 == winterFlowJSONDecorator) {
                        winterFlowJSONEngine.WinterFlowThreadListener(i, null);
                        return 5;
                    }
                    if (WinterFlowTransactionAgent2 == WinterFlowNodeServiceProvider.WinterFlowRouterRouter) {
                        winterFlowJSONEngine.WinterFlowThreadListener(i, null);
                        return 5;
                    }
                    if (WinterFlowTransactionAgent2 == WinterFlowNodeServiceProvider.WinterFlowServerProtocol) {
                        winterFlowJSONEngine.WinterFlowThreadListener(i, null);
                        WinterFlowSerializerStructure();
                        return 4;
                    }
                    winterFlowJSONEngine.WinterFlowThreadListener(i, null);
                    if (WinterFlowTransactionAgent2 instanceof WinterFlowDataSourceOrchestration) {
                        WinterFlowTransactionAgent2 = ((WinterFlowDataSourceOrchestration) WinterFlowTransactionAgent2).WinterFlowRouterStructure;
                    }
                    if (WinterFlowConfigurationSubsystem(WinterFlowTransactionAgent2, obj)) {
                        winterFlowJSONEngine.WinterFlowServiceUtility(i, WinterFlowNodeServiceProvider.WinterFlowSyntax);
                        return 0;
                    }
                    if (winterFlowJSONEngine.WinterFlowRouterRouter.getAndSet((i * 2) + 1, winterFlowJSONDecorator) != winterFlowJSONDecorator) {
                        winterFlowJSONEngine.WinterFlowServerProtocol(i, true);
                    }
                    return 5;
                }
                if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent2, WinterFlowNodeServiceProvider.WinterFlowArrayNetwork)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void WinterFlowSyntax() {
        Object WinterFlowMapperProtocol;
        Unsafe unsafe;
        if (WinterFlowResolverController()) {
            return;
        }
        Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowThreadListener;
        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = WinterFlowRouterRouter.getAndIncrement(this);
            long j2 = andIncrement / WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            if (WinterFlowConcurrencyThread() <= andIncrement) {
                if (winterFlowJSONEngine.WinterFlowArrayNetwork < j2 && winterFlowJSONEngine.WinterFlowHookDataSource() != null) {
                    WinterFlowConsumerUserManager(j2, winterFlowJSONEngine);
                }
                WinterFlowSingletonPlatform(1L);
                return;
            }
            if (winterFlowJSONEngine.WinterFlowArrayNetwork != j2) {
                WinterFlowVersionDataSource winterFlowVersionDataSource = WinterFlowVersionDataSource.WinterFlowServerProtocol;
                while (true) {
                    WinterFlowMapperProtocol = WinterFlowEncryptionSubsystem.WinterFlowMapperProtocol(winterFlowJSONEngine, j2, winterFlowVersionDataSource);
                    if (!WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
                        WinterFlowDatabaseDeserialization WinterFlowUnitTestResponse2 = WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
                        while (true) {
                            WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization = (WinterFlowDatabaseDeserialization) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, j);
                            if (winterFlowDatabaseDeserialization.WinterFlowArrayNetwork >= WinterFlowUnitTestResponse2.WinterFlowArrayNetwork) {
                                break;
                            }
                            if (!WinterFlowUnitTestResponse2.WinterFlowSyntax()) {
                                break;
                            }
                            do {
                                unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                                if (unsafe.compareAndSwapObject(this, WinterFlowThreadListener, winterFlowDatabaseDeserialization, WinterFlowUnitTestResponse2)) {
                                    if (winterFlowDatabaseDeserialization.WinterFlowVariableVersionControl()) {
                                        winterFlowDatabaseDeserialization.WinterFlowArrayNetwork();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == winterFlowDatabaseDeserialization);
                            if (WinterFlowUnitTestResponse2.WinterFlowVariableVersionControl()) {
                                WinterFlowUnitTestResponse2.WinterFlowArrayNetwork();
                            }
                        }
                    } else {
                        break;
                    }
                }
                WinterFlowJSONEngine winterFlowJSONEngine2 = null;
                if (WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
                    WinterFlowSerializerStructure();
                    WinterFlowConsumerUserManager(j2, winterFlowJSONEngine);
                    WinterFlowSingletonPlatform(1L);
                } else {
                    WinterFlowJSONEngine winterFlowJSONEngine3 = (WinterFlowJSONEngine) WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
                    long j3 = winterFlowJSONEngine3.WinterFlowArrayNetwork;
                    if (j3 > j2) {
                        long j4 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource * j3;
                        if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.compareAndSwapLong(this, WinterFlowServerProtocol, 1 + andIncrement, j4)) {
                            WinterFlowSingletonPlatform(j4 - andIncrement);
                        } else {
                            WinterFlowSingletonPlatform(1L);
                        }
                    } else {
                        winterFlowJSONEngine2 = winterFlowJSONEngine3;
                    }
                }
                if (winterFlowJSONEngine2 == null) {
                    continue;
                } else {
                    winterFlowJSONEngine = winterFlowJSONEngine2;
                }
            }
            int i = (int) (andIncrement % WinterFlowNodeServiceProvider.WinterFlowHookDataSource);
            Object WinterFlowTransactionAgent2 = winterFlowJSONEngine.WinterFlowTransactionAgent(i);
            boolean z = WinterFlowTransactionAgent2 instanceof WinterFlowTransactionIDE;
            long j5 = WinterFlowConcurrencyThread;
            if (!z || andIncrement < WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, j5) || !winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent2, WinterFlowNodeServiceProvider.WinterFlowUnitTestResponse)) {
                while (true) {
                    Object WinterFlowTransactionAgent3 = winterFlowJSONEngine.WinterFlowTransactionAgent(i);
                    if (!(WinterFlowTransactionAgent3 instanceof WinterFlowTransactionIDE)) {
                        if (WinterFlowTransactionAgent3 != WinterFlowNodeServiceProvider.WinterFlowResponseEngine) {
                            if (WinterFlowTransactionAgent3 != null) {
                                if (WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowArrayNetwork || WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowRouterRouter || WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowSyntax || WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowTransactionAgent || WinterFlowTransactionAgent3 == WinterFlowNodeServiceProvider.WinterFlowServerProtocol) {
                                    break loop0;
                                } else if (WinterFlowTransactionAgent3 != WinterFlowNodeServiceProvider.WinterFlowTransactionManagerStrategy) {
                                    WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(WinterFlowTransactionAgent3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(this, j5)) {
                        if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent3, new WinterFlowDataSourceOrchestration((WinterFlowTransactionIDE) WinterFlowTransactionAgent3))) {
                            break loop0;
                        }
                    } else if (winterFlowJSONEngine.WinterFlowResponseEngine(i, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowUnitTestResponse)) {
                        if (WinterFlowStrategyTool(WinterFlowTransactionAgent3)) {
                            winterFlowJSONEngine.WinterFlowServiceUtility(i, WinterFlowNodeServiceProvider.WinterFlowArrayNetwork);
                            break;
                        } else {
                            winterFlowJSONEngine.WinterFlowServiceUtility(i, WinterFlowNodeServiceProvider.WinterFlowResponseEngine);
                            winterFlowJSONEngine.WinterFlowRouterRouter();
                        }
                    }
                }
            } else if (WinterFlowStrategyTool(WinterFlowTransactionAgent2)) {
                winterFlowJSONEngine.WinterFlowServiceUtility(i, WinterFlowNodeServiceProvider.WinterFlowArrayNetwork);
                break;
            } else {
                winterFlowJSONEngine.WinterFlowServiceUtility(i, WinterFlowNodeServiceProvider.WinterFlowResponseEngine);
                winterFlowJSONEngine.WinterFlowRouterRouter();
                WinterFlowSingletonPlatform(1L);
            }
        }
        WinterFlowSingletonPlatform(1L);
    }

    public final Throwable WinterFlowThreadListener() {
        return (Throwable) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowTransactionAgent);
    }

    public final WinterFlowJSONEngine WinterFlowTransactionAgent(long j, WinterFlowJSONEngine winterFlowJSONEngine) {
        Object WinterFlowMapperProtocol;
        WinterFlowJSONEngine winterFlowJSONEngine2;
        long j2;
        Unsafe unsafe;
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this;
        WinterFlowJSONEngine winterFlowJSONEngine3 = WinterFlowNodeServiceProvider.WinterFlowRouterStructure;
        WinterFlowVersionDataSource winterFlowVersionDataSource = WinterFlowVersionDataSource.WinterFlowServerProtocol;
        loop0: while (true) {
            WinterFlowMapperProtocol = WinterFlowEncryptionSubsystem.WinterFlowMapperProtocol(winterFlowJSONEngine, j, winterFlowVersionDataSource);
            if (!WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
                WinterFlowDatabaseDeserialization WinterFlowUnitTestResponse2 = WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
                while (true) {
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long j3 = WinterFlowSingletonPlatform;
                    WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization = (WinterFlowDatabaseDeserialization) unsafe2.getObjectVolatile(winterFlowWorkerThreadPool, j3);
                    if (winterFlowDatabaseDeserialization.WinterFlowArrayNetwork >= WinterFlowUnitTestResponse2.WinterFlowArrayNetwork) {
                        break loop0;
                    }
                    if (!WinterFlowUnitTestResponse2.WinterFlowSyntax()) {
                        break;
                    }
                    do {
                        unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe.compareAndSwapObject(winterFlowWorkerThreadPool, WinterFlowSingletonPlatform, winterFlowDatabaseDeserialization, WinterFlowUnitTestResponse2)) {
                            if (winterFlowDatabaseDeserialization.WinterFlowVariableVersionControl()) {
                                winterFlowDatabaseDeserialization.WinterFlowArrayNetwork();
                            }
                        }
                    } while (unsafe.getObjectVolatile(winterFlowWorkerThreadPool, j3) == winterFlowDatabaseDeserialization);
                    if (WinterFlowUnitTestResponse2.WinterFlowVariableVersionControl()) {
                        WinterFlowUnitTestResponse2.WinterFlowArrayNetwork();
                    }
                }
            } else {
                break;
            }
        }
        WinterFlowJSONEngine winterFlowJSONEngine4 = null;
        if (WinterFlowWorkerVersionControl.WinterFlowSyntax(WinterFlowMapperProtocol)) {
            winterFlowWorkerThreadPool.WinterFlowSerializerStructure();
            if (winterFlowJSONEngine.WinterFlowArrayNetwork * WinterFlowNodeServiceProvider.WinterFlowHookDataSource >= winterFlowWorkerThreadPool.WinterFlowBandwidthObject()) {
                return null;
            }
            winterFlowJSONEngine.WinterFlowRouterStructure();
            return null;
        }
        WinterFlowJSONEngine winterFlowJSONEngine5 = (WinterFlowJSONEngine) WinterFlowWorkerVersionControl.WinterFlowUnitTestResponse(WinterFlowMapperProtocol);
        long j4 = winterFlowJSONEngine5.WinterFlowArrayNetwork;
        if (j4 <= j) {
            return winterFlowJSONEngine5;
        }
        long j5 = j4 * WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
        while (true) {
            Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j6 = WinterFlowVariableBandwidth;
            long longVolatile = unsafe3.getLongVolatile(winterFlowWorkerThreadPool, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                winterFlowJSONEngine2 = winterFlowJSONEngine4;
                j2 = j4;
                break;
            }
            winterFlowJSONEngine2 = winterFlowJSONEngine4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(winterFlowWorkerThreadPool, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            winterFlowWorkerThreadPool = this;
            winterFlowJSONEngine4 = winterFlowJSONEngine2;
            j4 = j2;
        }
        if (j2 * WinterFlowNodeServiceProvider.WinterFlowHookDataSource >= WinterFlowBandwidthObject()) {
            return winterFlowJSONEngine2;
        }
        winterFlowJSONEngine5.WinterFlowRouterStructure();
        return winterFlowJSONEngine2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = (com.google.android.datatransport.WinterFlowJSONEngine) ((com.google.android.datatransport.WinterFlowMicroserviceHelper) com.google.android.datatransport.WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(r0, com.google.android.datatransport.WinterFlowMicroserviceHelper.WinterFlowHookDataSource));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowJSONEngine WinterFlowTransactionManagerStrategy(long j) {
        WinterFlowMicroserviceHelper winterFlowMicroserviceHelper;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        Object objectVolatile = unsafe2.getObjectVolatile(this, WinterFlowThreadListener);
        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) unsafe2.getObjectVolatile(this, WinterFlowSingletonPlatform);
        if (winterFlowJSONEngine.WinterFlowArrayNetwork > ((WinterFlowJSONEngine) objectVolatile).WinterFlowArrayNetwork) {
            objectVolatile = winterFlowJSONEngine;
        }
        WinterFlowJSONEngine winterFlowJSONEngine2 = (WinterFlowJSONEngine) unsafe2.getObjectVolatile(this, WinterFlowOrchestrationSubsystem);
        if (winterFlowJSONEngine2.WinterFlowArrayNetwork > ((WinterFlowJSONEngine) objectVolatile).WinterFlowArrayNetwork) {
            objectVolatile = winterFlowJSONEngine2;
        }
        WinterFlowMicroserviceHelper winterFlowMicroserviceHelper2 = (WinterFlowMicroserviceHelper) objectVolatile;
        loop0: while (true) {
            winterFlowMicroserviceHelper = winterFlowMicroserviceHelper2;
            while (true) {
                int i = WinterFlowMicroserviceHelper.WinterFlowCacheManagerAgent;
                winterFlowMicroserviceHelper.getClass();
                Object objectVolatile2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowMicroserviceHelper, WinterFlowMicroserviceHelper.WinterFlowRouterStructure);
                WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowEncryptionSubsystem.WinterFlowVariableVersionControl;
                if (objectVolatile2 == winterFlowJSONDecorator) {
                    break loop0;
                }
                winterFlowMicroserviceHelper2 = (WinterFlowMicroserviceHelper) objectVolatile2;
                if (winterFlowMicroserviceHelper2 == null) {
                    do {
                        unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        j3 = WinterFlowMicroserviceHelper.WinterFlowRouterStructure;
                        if (unsafe.compareAndSwapObject(winterFlowMicroserviceHelper, j3, (Object) null, winterFlowJSONDecorator)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(winterFlowMicroserviceHelper, j3) == null);
                }
            }
        }
        WinterFlowJSONEngine winterFlowJSONEngine3 = (WinterFlowJSONEngine) winterFlowMicroserviceHelper;
        if (WinterFlowMapperProtocol()) {
            WinterFlowJSONEngine winterFlowJSONEngine4 = winterFlowJSONEngine3;
            loop3: do {
                int i2 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j2 = (winterFlowJSONEngine4.WinterFlowArrayNetwork * WinterFlowNodeServiceProvider.WinterFlowHookDataSource) + i2;
                    if (j2 < WinterFlowBandwidthObject()) {
                        break loop3;
                    }
                    while (true) {
                        Object WinterFlowTransactionAgent2 = winterFlowJSONEngine4.WinterFlowTransactionAgent(i2);
                        if (WinterFlowTransactionAgent2 != null && WinterFlowTransactionAgent2 != WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl) {
                            if (WinterFlowTransactionAgent2 == WinterFlowNodeServiceProvider.WinterFlowArrayNetwork) {
                                break loop3;
                            }
                        } else {
                            if (winterFlowJSONEngine4.WinterFlowResponseEngine(i2, WinterFlowTransactionAgent2, WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                                winterFlowJSONEngine4.WinterFlowRouterRouter();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (winterFlowJSONEngine4 != null);
            j2 = -1;
            if (j2 != -1) {
                WinterFlowRouterRouter(j2);
            }
        }
        Object obj = null;
        loop6: for (WinterFlowJSONEngine winterFlowJSONEngine5 = winterFlowJSONEngine3; winterFlowJSONEngine5 != null; winterFlowJSONEngine5 = (WinterFlowJSONEngine) ((WinterFlowMicroserviceHelper) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowJSONEngine5, WinterFlowMicroserviceHelper.WinterFlowHookDataSource))) {
            for (int i3 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource - 1; -1 < i3; i3--) {
                if ((winterFlowJSONEngine5.WinterFlowArrayNetwork * WinterFlowNodeServiceProvider.WinterFlowHookDataSource) + i3 < j) {
                    break loop6;
                }
                while (true) {
                    Object WinterFlowTransactionAgent3 = winterFlowJSONEngine5.WinterFlowTransactionAgent(i3);
                    if (WinterFlowTransactionAgent3 != null && WinterFlowTransactionAgent3 != WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl) {
                        if (!(WinterFlowTransactionAgent3 instanceof WinterFlowDataSourceOrchestration)) {
                            if (!(WinterFlowTransactionAgent3 instanceof WinterFlowTransactionIDE)) {
                                break;
                            }
                            if (winterFlowJSONEngine5.WinterFlowResponseEngine(i3, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                                obj = WinterFlowHandlerWebsocket.WinterFlowSoftwareProtocol(obj, WinterFlowTransactionAgent3);
                                winterFlowJSONEngine5.WinterFlowServerProtocol(i3, true);
                                break;
                            }
                        } else {
                            if (winterFlowJSONEngine5.WinterFlowResponseEngine(i3, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                                obj = WinterFlowHandlerWebsocket.WinterFlowSoftwareProtocol(obj, ((WinterFlowDataSourceOrchestration) WinterFlowTransactionAgent3).WinterFlowRouterStructure);
                                winterFlowJSONEngine5.WinterFlowServerProtocol(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (winterFlowJSONEngine5.WinterFlowResponseEngine(i3, WinterFlowTransactionAgent3, WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                            winterFlowJSONEngine5.WinterFlowRouterRouter();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                WinterFlowArrayHelper((WinterFlowTransactionIDE) obj, true);
                return winterFlowJSONEngine3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                WinterFlowArrayHelper((WinterFlowTransactionIDE) arrayList.get(size), true);
            }
        }
        return winterFlowJSONEngine3;
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerPlatform
    public Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this;
        WinterFlowGatewayParser winterFlowGatewayParser = WinterFlowManagerRequest.WinterFlowRouterStructure;
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = 1152921504606846975L;
        if (winterFlowWorkerThreadPool.WinterFlowBatchUI(unsafe.getLongVolatile(winterFlowWorkerThreadPool, WinterFlowVariableBandwidth), false) ? false : !winterFlowWorkerThreadPool.WinterFlowHookDataSource(r2 & 1152921504606846975L)) {
            return winterFlowGatewayParser;
        }
        Object obj2 = WinterFlowNodeServiceProvider.WinterFlowResponseEngine;
        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) unsafe.getObjectVolatile(winterFlowWorkerThreadPool, WinterFlowSingletonPlatform);
        while (true) {
            long andIncrement = WinterFlowTransactionManagerStrategy.getAndIncrement(winterFlowWorkerThreadPool);
            long j2 = andIncrement & j;
            boolean WinterFlowBatchUI = winterFlowWorkerThreadPool.WinterFlowBatchUI(andIncrement, false);
            int i = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (winterFlowJSONEngine.WinterFlowArrayNetwork != j4) {
                WinterFlowJSONEngine WinterFlowTransactionAgent2 = winterFlowWorkerThreadPool.WinterFlowTransactionAgent(j4, winterFlowJSONEngine);
                if (WinterFlowTransactionAgent2 != null) {
                    winterFlowJSONEngine = WinterFlowTransactionAgent2;
                } else {
                    if (WinterFlowBatchUI) {
                        return new WinterFlowCloudHandler(winterFlowWorkerThreadPool.WinterFlowOrchestrationSubsystem());
                    }
                    j = 1152921504606846975L;
                }
            }
            int WinterFlowPackageIDE = winterFlowWorkerThreadPool.WinterFlowPackageIDE(winterFlowJSONEngine, i2, obj, j2, obj2, WinterFlowBatchUI);
            WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            if (WinterFlowPackageIDE == 0) {
                winterFlowJSONEngine.WinterFlowRouterStructure();
                return winterFlowAlgorithmSession;
            }
            if (WinterFlowPackageIDE == 1) {
                return winterFlowAlgorithmSession;
            }
            if (WinterFlowPackageIDE == 2) {
                if (WinterFlowBatchUI) {
                    winterFlowJSONEngine.WinterFlowRouterRouter();
                    return new WinterFlowCloudHandler(WinterFlowOrchestrationSubsystem());
                }
                WinterFlowTransactionIDE winterFlowTransactionIDE = obj2 instanceof WinterFlowTransactionIDE ? (WinterFlowTransactionIDE) obj2 : null;
                if (winterFlowTransactionIDE != null) {
                    winterFlowTransactionIDE.WinterFlowRouterStructure(winterFlowJSONEngine, i2 + i);
                }
                winterFlowJSONEngine.WinterFlowRouterRouter();
                return winterFlowGatewayParser;
            }
            if (WinterFlowPackageIDE == 3) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("unexpected");
                return null;
            }
            if (WinterFlowPackageIDE == 4) {
                if (j2 < WinterFlowBandwidthObject()) {
                    winterFlowJSONEngine.WinterFlowRouterStructure();
                }
                return new WinterFlowCloudHandler(WinterFlowOrchestrationSubsystem());
            }
            if (WinterFlowPackageIDE == 5) {
                winterFlowJSONEngine.WinterFlowRouterStructure();
            }
            j = 1152921504606846975L;
            winterFlowWorkerThreadPool = this;
        }
    }

    public final void WinterFlowUserManagerUserManager(long j) {
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this;
        if (winterFlowWorkerThreadPool.WinterFlowResolverController()) {
            return;
        }
        while (winterFlowWorkerThreadPool.WinterFlowServerProtocol() <= j) {
            winterFlowWorkerThreadPool = this;
        }
        int i = WinterFlowNodeServiceProvider.WinterFlowCacheManagerAgent;
        int i2 = 0;
        while (true) {
            long j2 = WinterFlowBandwidthObject;
            if (i2 < i) {
                long WinterFlowServerProtocol2 = winterFlowWorkerThreadPool.WinterFlowServerProtocol();
                if (WinterFlowServerProtocol2 == (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getLongVolatile(winterFlowWorkerThreadPool, j2) & 4611686018427387903L) && WinterFlowServerProtocol2 == winterFlowWorkerThreadPool.WinterFlowServerProtocol()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long longVolatile = unsafe.getLongVolatile(winterFlowWorkerThreadPool, j2);
                    if (unsafe.compareAndSwapLong(winterFlowWorkerThreadPool, WinterFlowBandwidthObject, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        winterFlowWorkerThreadPool = this;
                    }
                }
                while (true) {
                    long WinterFlowServerProtocol3 = winterFlowWorkerThreadPool.WinterFlowServerProtocol();
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long longVolatile2 = unsafe2.getLongVolatile(winterFlowWorkerThreadPool, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (WinterFlowServerProtocol3 == j3 && WinterFlowServerProtocol3 == winterFlowWorkerThreadPool.WinterFlowServerProtocol()) {
                        break;
                    }
                    if (z) {
                        winterFlowWorkerThreadPool = this;
                    } else {
                        winterFlowWorkerThreadPool = this;
                        unsafe2.compareAndSwapLong(winterFlowWorkerThreadPool, WinterFlowBandwidthObject, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long longVolatile3 = unsafe3.getLongVolatile(winterFlowWorkerThreadPool, j2);
                    if (unsafe3.compareAndSwapLong(winterFlowWorkerThreadPool, WinterFlowBandwidthObject, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        winterFlowWorkerThreadPool = this;
                    }
                }
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkAgent
    public final Object WinterFlowVariableVersionControl(WinterFlowNodeInheritance winterFlowNodeInheritance) {
        WinterFlowJSONEngine winterFlowJSONEngine;
        Throwable th;
        WinterFlowJSONEngine winterFlowJSONEngine2;
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowOrchestrationSubsystem;
        WinterFlowJSONEngine winterFlowJSONEngine3 = (WinterFlowJSONEngine) unsafe.getObjectVolatile(this, j);
        while (!this.WinterFlowRouterAdapter()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = WinterFlowUnitTestResponse;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (winterFlowJSONEngine3.WinterFlowArrayNetwork != j3) {
                WinterFlowJSONEngine WinterFlowResponseEngine2 = this.WinterFlowResponseEngine(j3, winterFlowJSONEngine3);
                if (WinterFlowResponseEngine2 == null) {
                    continue;
                } else {
                    winterFlowJSONEngine = WinterFlowResponseEngine2;
                }
            } else {
                winterFlowJSONEngine = winterFlowJSONEngine3;
            }
            WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this;
            Object WinterFlowCacheManagerListener = winterFlowWorkerThreadPool.WinterFlowCacheManagerListener(winterFlowJSONEngine, i, andIncrement, null);
            WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowNodeServiceProvider.WinterFlowThreadListener;
            if (WinterFlowCacheManagerListener == winterFlowJSONDecorator) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("unexpected");
                return null;
            }
            WinterFlowJSONDecorator winterFlowJSONDecorator2 = WinterFlowNodeServiceProvider.WinterFlowBandwidthObject;
            if (WinterFlowCacheManagerListener == winterFlowJSONDecorator2) {
                if (andIncrement < winterFlowWorkerThreadPool.WinterFlowConcurrencyThread()) {
                    winterFlowJSONEngine.WinterFlowRouterStructure();
                }
                this = winterFlowWorkerThreadPool;
                winterFlowJSONEngine3 = winterFlowJSONEngine;
            } else {
                if (WinterFlowCacheManagerListener != WinterFlowNodeServiceProvider.WinterFlowServiceUtility) {
                    winterFlowJSONEngine.WinterFlowRouterStructure();
                    return WinterFlowCacheManagerListener;
                }
                WinterFlowEventCloud WinterFlowMapperProtocol = WinterFlowUnitTestLibrary.WinterFlowMapperProtocol(WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowNodeInheritance));
                try {
                    Object WinterFlowCacheManagerListener2 = winterFlowWorkerThreadPool.WinterFlowCacheManagerListener(winterFlowJSONEngine, i, andIncrement, WinterFlowMapperProtocol);
                    if (WinterFlowCacheManagerListener2 == winterFlowJSONDecorator) {
                        WinterFlowMapperProtocol.WinterFlowRouterStructure(winterFlowJSONEngine, i);
                    } else {
                        if (WinterFlowCacheManagerListener2 == winterFlowJSONDecorator2) {
                            if (andIncrement < winterFlowWorkerThreadPool.WinterFlowConcurrencyThread()) {
                                winterFlowJSONEngine.WinterFlowRouterStructure();
                            }
                            WinterFlowJSONEngine winterFlowJSONEngine4 = (WinterFlowJSONEngine) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowWorkerThreadPool, j);
                            while (true) {
                                if (winterFlowWorkerThreadPool.WinterFlowRouterAdapter()) {
                                    WinterFlowMapperProtocol.WinterFlowSyntax(new WinterFlowDecoratorTool(winterFlowWorkerThreadPool.WinterFlowServiceUtility()));
                                    break;
                                }
                                WinterFlowEventCloud winterFlowEventCloud = WinterFlowMapperProtocol;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(winterFlowWorkerThreadPool);
                                    long j4 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
                                    long j5 = andIncrement2 / j4;
                                    int i2 = (int) (andIncrement2 % j4);
                                    if (winterFlowJSONEngine4.WinterFlowArrayNetwork != j5) {
                                        try {
                                            WinterFlowJSONEngine WinterFlowResponseEngine3 = winterFlowWorkerThreadPool.WinterFlowResponseEngine(j5, winterFlowJSONEngine4);
                                            if (WinterFlowResponseEngine3 == null) {
                                                WinterFlowMapperProtocol = winterFlowEventCloud;
                                            } else {
                                                winterFlowJSONEngine2 = WinterFlowResponseEngine3;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            WinterFlowMapperProtocol = winterFlowEventCloud;
                                            WinterFlowMapperProtocol.WinterFlowCompilerVariable();
                                            throw th;
                                        }
                                    } else {
                                        winterFlowJSONEngine2 = winterFlowJSONEngine4;
                                    }
                                    WinterFlowWorkerThreadPool winterFlowWorkerThreadPool2 = winterFlowWorkerThreadPool;
                                    WinterFlowCacheManagerListener2 = winterFlowWorkerThreadPool2.WinterFlowCacheManagerListener(winterFlowJSONEngine2, i2, andIncrement2, winterFlowEventCloud);
                                    winterFlowWorkerThreadPool = winterFlowWorkerThreadPool2;
                                    WinterFlowJSONEngine winterFlowJSONEngine5 = winterFlowJSONEngine2;
                                    WinterFlowMapperProtocol = winterFlowEventCloud;
                                    if (WinterFlowCacheManagerListener2 == WinterFlowNodeServiceProvider.WinterFlowThreadListener) {
                                        WinterFlowMapperProtocol.WinterFlowRouterStructure(winterFlowJSONEngine5, i2);
                                        break;
                                    }
                                    if (WinterFlowCacheManagerListener2 == WinterFlowNodeServiceProvider.WinterFlowBandwidthObject) {
                                        if (andIncrement2 < winterFlowWorkerThreadPool.WinterFlowConcurrencyThread()) {
                                            winterFlowJSONEngine5.WinterFlowRouterStructure();
                                        }
                                        winterFlowJSONEngine4 = winterFlowJSONEngine5;
                                    } else {
                                        if (WinterFlowCacheManagerListener2 == WinterFlowNodeServiceProvider.WinterFlowServiceUtility) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        winterFlowJSONEngine5.WinterFlowRouterStructure();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    WinterFlowMapperProtocol = winterFlowEventCloud;
                                    th = th;
                                    WinterFlowMapperProtocol.WinterFlowCompilerVariable();
                                    throw th;
                                }
                            }
                        } else {
                            winterFlowJSONEngine.WinterFlowRouterStructure();
                        }
                        WinterFlowMapperProtocol.WinterFlowConcurrencyThread(WinterFlowCacheManagerListener2, null);
                    }
                    return WinterFlowMapperProtocol.WinterFlowBatchUI();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable WinterFlowServiceUtility2 = this.WinterFlowServiceUtility();
        int i3 = WinterFlowWebsocketNode.WinterFlowRouterStructure;
        throw WinterFlowServiceUtility2;
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkAgent
    public final WinterFlowThreadPoolServiceProvider iterator() {
        return new WinterFlowThreadPoolServiceProvider(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0195, code lost:
    
        r16 = r8;
        r15 = null;
        r3 = (com.google.android.datatransport.WinterFlowJSONEngine) r3.WinterFlowHookDataSource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019f, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        int longVolatile = (int) (unsafe.getLongVolatile(this, WinterFlowVariableBandwidth) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.WinterFlowVariableVersionControl + ',');
        sb.append("data=[");
        int i = 0;
        boolean z2 = true;
        List WinterFlowPackageIDE = WinterFlowUnitTestLibrary.WinterFlowPackageIDE(unsafe.getObjectVolatile(this, WinterFlowOrchestrationSubsystem), unsafe.getObjectVolatile(this, WinterFlowSingletonPlatform), unsafe.getObjectVolatile(this, WinterFlowThreadListener));
        ArrayList arrayList = new ArrayList();
        for (Object obj : WinterFlowPackageIDE) {
            if (((WinterFlowJSONEngine) obj) != WinterFlowNodeServiceProvider.WinterFlowRouterStructure) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((WinterFlowJSONEngine) next).WinterFlowArrayNetwork;
            do {
                Object next2 = it.next();
                long j2 = ((WinterFlowJSONEngine) next2).WinterFlowArrayNetwork;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        WinterFlowJSONEngine winterFlowJSONEngine = (WinterFlowJSONEngine) next;
        long WinterFlowBandwidthObject2 = WinterFlowBandwidthObject();
        long WinterFlowConcurrencyThread2 = WinterFlowConcurrencyThread();
        loop2: while (true) {
            int i2 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
            int i3 = i;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                str = null;
                long j3 = (winterFlowJSONEngine.WinterFlowArrayNetwork * WinterFlowNodeServiceProvider.WinterFlowHookDataSource) + i3;
                if (j3 >= WinterFlowConcurrencyThread2 && j3 >= WinterFlowBandwidthObject2) {
                    break loop2;
                }
                Object WinterFlowTransactionAgent2 = winterFlowJSONEngine.WinterFlowTransactionAgent(i3);
                boolean z3 = z2;
                Object obj2 = winterFlowJSONEngine.WinterFlowRouterRouter.get(i3 * 2);
                if (WinterFlowTransactionAgent2 instanceof WinterFlowAPIVersion) {
                    str2 = (j3 >= WinterFlowBandwidthObject2 || j3 < WinterFlowConcurrencyThread2) ? (j3 >= WinterFlowConcurrencyThread2 || j3 < WinterFlowBandwidthObject2) ? "cont" : "send" : "receive";
                } else if (WinterFlowTransactionAgent2 instanceof WinterFlowDataSourceOrchestration) {
                    str2 = "EB(" + WinterFlowTransactionAgent2 + ')';
                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowTransactionAgent2, WinterFlowNodeServiceProvider.WinterFlowTransactionManagerStrategy) || WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowTransactionAgent2, WinterFlowNodeServiceProvider.WinterFlowUnitTestResponse)) {
                    str2 = "resuming_sender";
                } else {
                    if (WinterFlowTransactionAgent2 != null && !WinterFlowTransactionAgent2.equals(WinterFlowNodeServiceProvider.WinterFlowVariableVersionControl) && !WinterFlowTransactionAgent2.equals(WinterFlowNodeServiceProvider.WinterFlowSyntax) && !WinterFlowTransactionAgent2.equals(WinterFlowNodeServiceProvider.WinterFlowRouterRouter) && !WinterFlowTransactionAgent2.equals(WinterFlowNodeServiceProvider.WinterFlowTransactionAgent) && !WinterFlowTransactionAgent2.equals(WinterFlowNodeServiceProvider.WinterFlowResponseEngine) && !WinterFlowTransactionAgent2.equals(WinterFlowNodeServiceProvider.WinterFlowServerProtocol)) {
                        str2 = WinterFlowTransactionAgent2.toString();
                    }
                    i3++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + str2 + ',' + obj2 + "),");
                } else {
                    sb.append(str2 + ',');
                }
                i3++;
                z2 = z3;
            }
            z2 = z;
            i = 0;
        }
        if (sb.length() == 0) {
            WinterFlowCompilerMechanism.WinterFlowSyntax("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }
}
