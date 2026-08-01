package com.google.android.datatransport;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProviderController extends WinterFlowResponseObject implements WinterFlowDataSourceHelper {
    public static final /* synthetic */ long WinterFlowServerProtocol;
    public static final /* synthetic */ int WinterFlowServiceUtility = 0;
    public static final /* synthetic */ long WinterFlowThreadListener;
    public static final /* synthetic */ long WinterFlowTransactionAgent;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowThreadListener = unsafe.objectFieldOffset(WinterFlowProviderController.class.getDeclaredField("_queue$volatile"));
        WinterFlowTransactionAgent = unsafe.objectFieldOffset(WinterFlowProviderController.class.getDeclaredField("_delayed$volatile"));
        WinterFlowServerProtocol = unsafe.objectFieldOffset(WinterFlowProviderController.class.getDeclaredField("_isCompleted$volatile"));
    }

    public void WinterFlowCacheTool(long j, WinterFlowCompilerNode winterFlowCompilerNode) {
        WinterFlowSerializerWidget.WinterFlowBandwidthObject.WinterFlowProxyStructure(j, winterFlowCompilerNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WinterFlowCloudMicroservice(Runnable runnable) {
        WinterFlowProviderController winterFlowProviderController;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowThreadListener;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, WinterFlowServerProtocol) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    WinterFlowProviderController winterFlowProviderController2 = this;
                    runnable2 = runnable;
                    winterFlowProviderController = winterFlowProviderController2;
                    if (unsafe4.compareAndSwapObject(winterFlowProviderController2, WinterFlowThreadListener, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(winterFlowProviderController, j) != null) {
                        break;
                    }
                    this = winterFlowProviderController;
                    runnable = runnable2;
                }
                this = winterFlowProviderController;
                runnable = runnable2;
            } else {
                winterFlowProviderController = this;
                runnable2 = runnable;
                if (objectVolatile instanceof WinterFlowConcurrencyServiceProvider) {
                    WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = (WinterFlowConcurrencyServiceProvider) objectVolatile;
                    int WinterFlowRouterStructure = winterFlowConcurrencyServiceProvider.WinterFlowRouterStructure(runnable2);
                    if (WinterFlowRouterStructure == 0) {
                        break;
                    }
                    if (WinterFlowRouterStructure == 1) {
                        WinterFlowConcurrencyServiceProvider WinterFlowCacheManagerAgent = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent();
                        do {
                            unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                            if (unsafe2.compareAndSwapObject(winterFlowProviderController, WinterFlowThreadListener, objectVolatile, WinterFlowCacheManagerAgent)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(winterFlowProviderController, j) == objectVolatile);
                    } else if (WinterFlowRouterStructure == 2) {
                        break;
                    }
                    this = winterFlowProviderController;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == WinterFlowHandlerWebsocket.WinterFlowSyntax) {
                        break;
                    }
                    WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider2 = new WinterFlowConcurrencyServiceProvider(8, true);
                    winterFlowConcurrencyServiceProvider2.WinterFlowRouterStructure((Runnable) objectVolatile);
                    winterFlowConcurrencyServiceProvider2.WinterFlowRouterStructure(runnable2);
                    do {
                        unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe.compareAndSwapObject(winterFlowProviderController, WinterFlowThreadListener, objectVolatile, winterFlowConcurrencyServiceProvider2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(winterFlowProviderController, j) == objectVolatile);
                    this = winterFlowProviderController;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public void WinterFlowCompilerHandler(Runnable runnable) {
        WinterFlowFrontendBackend();
        if (!WinterFlowCloudMicroservice(runnable)) {
            WinterFlowSerializerWidget.WinterFlowBandwidthObject.WinterFlowCompilerHandler(runnable);
            return;
        }
        Thread WinterFlowUIMiddleware = WinterFlowUIMiddleware();
        if (Thread.currentThread() != WinterFlowUIMiddleware) {
            LockSupport.unpark(WinterFlowUIMiddleware);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowConfigurationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        WinterFlowCompilerHandler(runnable);
    }

    public final void WinterFlowFrontendBackend() {
        WinterFlowCompilerNode winterFlowCompilerNode;
        WinterFlowThreadLayer winterFlowThreadLayer = (WinterFlowThreadLayer) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowTransactionAgent);
        if (winterFlowThreadLayer == null || winterFlowThreadLayer.WinterFlowHookDataSource() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (winterFlowThreadLayer) {
                try {
                    WinterFlowCompilerNode[] winterFlowCompilerNodeArr = winterFlowThreadLayer.WinterFlowRouterStructure;
                    WinterFlowCompilerNode winterFlowCompilerNode2 = winterFlowCompilerNodeArr != null ? winterFlowCompilerNodeArr[0] : null;
                    if (winterFlowCompilerNode2 != null) {
                        winterFlowCompilerNode = ((nanoTime - winterFlowCompilerNode2.WinterFlowVariableVersionControl) > 0L ? 1 : ((nanoTime - winterFlowCompilerNode2.WinterFlowVariableVersionControl) == 0L ? 0 : -1)) >= 0 ? WinterFlowCloudMicroservice(winterFlowCompilerNode2) : false ? winterFlowThreadLayer.WinterFlowCacheManagerAgent(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (winterFlowCompilerNode != null);
    }

    public final void WinterFlowProxyStructure(long j, WinterFlowCompilerNode winterFlowCompilerNode) {
        WinterFlowProviderController winterFlowProviderController;
        int WinterFlowHookDataSource;
        Unsafe unsafe;
        Thread WinterFlowUIMiddleware;
        long j2 = WinterFlowTransactionAgent;
        Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        if (unsafe2.getIntVolatile(this, WinterFlowServerProtocol) != 0) {
            winterFlowProviderController = this;
            WinterFlowHookDataSource = 1;
        } else {
            WinterFlowThreadLayer winterFlowThreadLayer = (WinterFlowThreadLayer) unsafe2.getObjectVolatile(this, j2);
            if (winterFlowThreadLayer == null) {
                WinterFlowThreadLayer winterFlowThreadLayer2 = new WinterFlowThreadLayer();
                winterFlowThreadLayer2.WinterFlowCacheManagerAgent = j;
                while (true) {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    winterFlowProviderController = this;
                    if (!unsafe.compareAndSwapObject(winterFlowProviderController, WinterFlowTransactionAgent, (Object) null, winterFlowThreadLayer2) && unsafe.getObjectVolatile(winterFlowProviderController, j2) == null) {
                        this = winterFlowProviderController;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(winterFlowProviderController, j2);
                objectVolatile.getClass();
                winterFlowThreadLayer = (WinterFlowThreadLayer) objectVolatile;
                unsafe2 = unsafe;
            } else {
                winterFlowProviderController = this;
            }
            WinterFlowHookDataSource = winterFlowCompilerNode.WinterFlowHookDataSource(j, winterFlowThreadLayer, winterFlowProviderController);
        }
        if (WinterFlowHookDataSource != 0) {
            if (WinterFlowHookDataSource == 1) {
                winterFlowProviderController.WinterFlowCacheTool(j, winterFlowCompilerNode);
                return;
            } else {
                if (WinterFlowHookDataSource == 2) {
                    return;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("unexpected result");
                return;
            }
        }
        WinterFlowThreadLayer winterFlowThreadLayer3 = (WinterFlowThreadLayer) unsafe2.getObjectVolatile(winterFlowProviderController, j2);
        if (winterFlowThreadLayer3 != null) {
            synchronized (winterFlowThreadLayer3) {
                WinterFlowCompilerNode[] winterFlowCompilerNodeArr = winterFlowThreadLayer3.WinterFlowRouterStructure;
                r12 = winterFlowCompilerNodeArr != null ? winterFlowCompilerNodeArr[0] : null;
            }
        }
        if (r12 != winterFlowCompilerNode || Thread.currentThread() == (WinterFlowUIMiddleware = winterFlowProviderController.WinterFlowUIMiddleware())) {
            return;
        }
        LockSupport.unpark(WinterFlowUIMiddleware);
    }

    public final boolean WinterFlowQueueService() {
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowSyntax;
        if (winterFlowOrchestrationValidator != null ? winterFlowOrchestrationValidator.isEmpty() : true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            WinterFlowThreadLayer winterFlowThreadLayer = (WinterFlowThreadLayer) unsafe.getObjectVolatile(this, WinterFlowTransactionAgent);
            if (winterFlowThreadLayer != null && winterFlowThreadLayer.WinterFlowHookDataSource() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, WinterFlowThreadListener);
            if (objectVolatile != null) {
                if (objectVolatile instanceof WinterFlowConcurrencyServiceProvider) {
                    long longVolatile = unsafe.getLongVolatile((WinterFlowConcurrencyServiceProvider) objectVolatile, WinterFlowConcurrencyServiceProvider.WinterFlowUnitTestResponse);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == WinterFlowHandlerWebsocket.WinterFlowSyntax) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public final void WinterFlowRouterRouter(long j, WinterFlowEventCloud winterFlowEventCloud) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            WinterFlowProtocolProvider winterFlowProtocolProvider = new WinterFlowProtocolProvider(this, j2 + nanoTime, winterFlowEventCloud);
            WinterFlowProxyStructure(nanoTime, winterFlowProtocolProvider);
            winterFlowEventCloud.WinterFlowConsumerUserManager(new WinterFlowProxyStructure(2, winterFlowProtocolProvider));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // com.google.android.datatransport.WinterFlowResponseObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long WinterFlowSyntaxSubsystem() {
        Unsafe unsafe;
        WinterFlowProviderController winterFlowProviderController;
        Unsafe unsafe2;
        Runnable runnable;
        WinterFlowCompilerNode winterFlowCompilerNode;
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowSyntax;
        long j = WinterFlowThreadListener;
        if (!WinterFlowTestingNode()) {
            WinterFlowFrontendBackend();
            loop0: while (true) {
                unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    winterFlowProviderController = this;
                    break;
                }
                if (objectVolatile instanceof WinterFlowConcurrencyServiceProvider) {
                    WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = (WinterFlowConcurrencyServiceProvider) objectVolatile;
                    Object WinterFlowArrayNetwork = winterFlowConcurrencyServiceProvider.WinterFlowArrayNetwork();
                    if (WinterFlowArrayNetwork != WinterFlowConcurrencyServiceProvider.WinterFlowVariableVersionControl) {
                        Runnable runnable2 = (Runnable) WinterFlowArrayNetwork;
                        winterFlowProviderController = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    WinterFlowConcurrencyServiceProvider WinterFlowCacheManagerAgent = winterFlowConcurrencyServiceProvider.WinterFlowCacheManagerAgent();
                    while (true) {
                        Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        winterFlowProviderController = this;
                        if (!unsafe3.compareAndSwapObject(winterFlowProviderController, WinterFlowThreadListener, objectVolatile, WinterFlowCacheManagerAgent) && unsafe3.getObjectVolatile(winterFlowProviderController, j) == objectVolatile) {
                            this = winterFlowProviderController;
                        }
                    }
                    this = winterFlowProviderController;
                } else {
                    winterFlowProviderController = this;
                    if (objectVolatile == winterFlowJSONDecorator) {
                        break;
                    }
                    do {
                        unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe2.compareAndSwapObject(winterFlowProviderController, WinterFlowThreadListener, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(winterFlowProviderController, j) == objectVolatile);
                    this = winterFlowProviderController;
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = winterFlowProviderController.WinterFlowSyntax;
            if (((winterFlowOrchestrationValidator == null || winterFlowOrchestrationValidator.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(winterFlowProviderController, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof WinterFlowConcurrencyServiceProvider) {
                        long longVolatile = unsafe2.getLongVolatile((WinterFlowConcurrencyServiceProvider) objectVolatile2, WinterFlowConcurrencyServiceProvider.WinterFlowUnitTestResponse);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == winterFlowJSONDecorator) {
                        return Long.MAX_VALUE;
                    }
                }
                WinterFlowThreadLayer winterFlowThreadLayer = (WinterFlowThreadLayer) unsafe.getObjectVolatile(winterFlowProviderController, WinterFlowTransactionAgent);
                if (winterFlowThreadLayer != null) {
                    synchronized (winterFlowThreadLayer) {
                        WinterFlowCompilerNode[] winterFlowCompilerNodeArr = winterFlowThreadLayer.WinterFlowRouterStructure;
                        winterFlowCompilerNode = winterFlowCompilerNodeArr != null ? winterFlowCompilerNodeArr[0] : null;
                    }
                    if (winterFlowCompilerNode != null) {
                        long nanoTime = winterFlowCompilerNode.WinterFlowVariableVersionControl - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public WinterFlowVersionControlView WinterFlowTransactionManagerStrategy(long j, Runnable runnable, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return WinterFlowPipelineFramework.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy(j, runnable, winterFlowEncryptionMicroservice);
    }

    public abstract Thread WinterFlowUIMiddleware();

    @Override // com.google.android.datatransport.WinterFlowResponseObject
    public void shutdown() {
        WinterFlowJSONDecorator winterFlowJSONDecorator;
        Unsafe unsafe;
        WinterFlowCompilerNode WinterFlowCacheManagerAgent;
        WinterFlowNetworkSubsystem.WinterFlowRouterStructure.set(null);
        WinterFlowQueueThreadPool.WinterFlowRouterStructure.putIntVolatile(this, WinterFlowServerProtocol, 1);
        WinterFlowJSONDecorator winterFlowJSONDecorator2 = WinterFlowHandlerWebsocket.WinterFlowSyntax;
        long j = WinterFlowThreadListener;
        loop0: while (true) {
            Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    winterFlowJSONDecorator = winterFlowJSONDecorator2;
                    if (unsafe2.compareAndSwapObject(this, WinterFlowThreadListener, (Object) null, winterFlowJSONDecorator2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        winterFlowJSONDecorator2 = winterFlowJSONDecorator;
                    }
                }
                winterFlowJSONDecorator2 = winterFlowJSONDecorator;
            } else {
                winterFlowJSONDecorator = winterFlowJSONDecorator2;
                if (objectVolatile instanceof WinterFlowConcurrencyServiceProvider) {
                    ((WinterFlowConcurrencyServiceProvider) objectVolatile).WinterFlowHookDataSource();
                    break;
                }
                if (objectVolatile == winterFlowJSONDecorator) {
                    break;
                }
                WinterFlowConcurrencyServiceProvider winterFlowConcurrencyServiceProvider = new WinterFlowConcurrencyServiceProvider(8, true);
                winterFlowConcurrencyServiceProvider.WinterFlowRouterStructure((Runnable) objectVolatile);
                do {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    if (unsafe.compareAndSwapObject(this, WinterFlowThreadListener, objectVolatile, winterFlowConcurrencyServiceProvider)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                winterFlowJSONDecorator2 = winterFlowJSONDecorator;
            }
        }
        while (WinterFlowSyntaxSubsystem() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            WinterFlowThreadLayer winterFlowThreadLayer = (WinterFlowThreadLayer) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowTransactionAgent);
            if (winterFlowThreadLayer == null) {
                return;
            }
            synchronized (winterFlowThreadLayer) {
                WinterFlowCacheManagerAgent = winterFlowThreadLayer.WinterFlowHookDataSource() > 0 ? winterFlowThreadLayer.WinterFlowCacheManagerAgent(0) : null;
            }
            if (WinterFlowCacheManagerAgent == null) {
                return;
            } else {
                WinterFlowCacheTool(nanoTime, WinterFlowCacheManagerAgent);
            }
        }
    }
}
