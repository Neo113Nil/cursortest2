package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerPlatform extends WinterFlowWorkerSession implements WinterFlowEventProvider, WinterFlowConsumerProcess, WinterFlowHookView, WinterFlowServiceWebsocket, WinterFlowCacheInterface {
    public static final /* synthetic */ long WinterFlowResponseEngine = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowHandlerPlatform.class.getDeclaredField("_state$volatile"));
    public int WinterFlowSyntax;
    private volatile /* synthetic */ Object _state$volatile;

    public WinterFlowHandlerPlatform(Object obj) {
        this._state$volatile = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerSession
    public final WinterFlowTestingAgent WinterFlowArrayNetwork() {
        return new WinterFlowUserManagerUtility();
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerProcess
    public final WinterFlowEventProvider WinterFlowHookDataSource(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        return (((i < 0 || i >= 2) && i != -2) || winterFlowDataSourceHandler != WinterFlowDataSourceHandler.WinterFlowTransactionManagerStrategy) ? WinterFlowHandlerWebsocket.WinterFlowBatchUI(this, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler) : this;
    }

    public final void WinterFlowResponseEngine(Object obj) {
        if (obj == null) {
            obj = WinterFlowEncryptionSubsystem.WinterFlowServerProtocol;
        }
        WinterFlowTransactionAgent(null, obj);
    }

    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowResponseEngine(obj);
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r13.equals(r15) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        if (r9 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007c, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:24:0x0094, B:26:0x00b5, B:29:0x00c5, B:30:0x00e1, B:36:0x00f1, B:32:0x00e8, B:35:0x00ee, B:45:0x009a, B:48:0x00a1, B:53:0x00fb, B:54:0x0100, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007c, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:24:0x0094, B:26:0x00b5, B:29:0x00c5, B:30:0x00e1, B:36:0x00f1, B:32:0x00e8, B:35:0x00ee, B:45:0x009a, B:48:0x00a1, B:53:0x00fb, B:54:0x0100, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007c, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:24:0x0094, B:26:0x00b5, B:29:0x00c5, B:30:0x00e1, B:36:0x00f1, B:32:0x00e8, B:35:0x00ee, B:45:0x009a, B:48:0x00a1, B:53:0x00fb, B:54:0x0100, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.datatransport.WinterFlowTestingAgent] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.datatransport.WinterFlowUserManagerUtility] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.datatransport.WinterFlowUserManagerUtility] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.datatransport.WinterFlowUserManagerUtility] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.datatransport.WinterFlowUserManagerUtility] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.datatransport.WinterFlowWorkerSession] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c4 -> B:14:0x007a). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowEventProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowRouterPlatform winterFlowRouterPlatform;
        ?? r1;
        WinterFlowHandlerPlatform winterFlowHandlerPlatform;
        WinterFlowCacheInterface winterFlowCacheInterface2;
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth;
        Object obj;
        Object andSet;
        try {
            if (winterFlowTransactionManagerLayer instanceof WinterFlowRouterPlatform) {
                winterFlowRouterPlatform = (WinterFlowRouterPlatform) winterFlowTransactionManagerLayer;
                int i = winterFlowRouterPlatform.WinterFlowBandwidthObject;
                if ((i & Integer.MIN_VALUE) != 0) {
                    winterFlowRouterPlatform.WinterFlowBandwidthObject = i - Integer.MIN_VALUE;
                    Object obj2 = winterFlowRouterPlatform.WinterFlowThreadListener;
                    r1 = winterFlowRouterPlatform.WinterFlowBandwidthObject;
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (r1 != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        r1 = (WinterFlowUserManagerUtility) WinterFlowCacheManagerAgent();
                    } else if (r1 == 1) {
                        r1 = winterFlowRouterPlatform.WinterFlowResponseEngine;
                        winterFlowCacheInterface = winterFlowRouterPlatform.WinterFlowSyntax;
                        this = winterFlowRouterPlatform.WinterFlowRouterRouter;
                        try {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                            r1 = r1;
                        } catch (Throwable th) {
                            ?? r8 = this;
                            th = th;
                            r8.WinterFlowTransactionManagerStrategy(r1);
                            throw th;
                        }
                    } else if (r1 == 2) {
                        obj = winterFlowRouterPlatform.WinterFlowServerProtocol;
                        winterFlowConsumerBandwidth = winterFlowRouterPlatform.WinterFlowTransactionAgent;
                        WinterFlowUserManagerUtility winterFlowUserManagerUtility = winterFlowRouterPlatform.WinterFlowResponseEngine;
                        winterFlowCacheInterface2 = winterFlowRouterPlatform.WinterFlowSyntax;
                        winterFlowHandlerPlatform = winterFlowRouterPlatform.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        r1 = winterFlowUserManagerUtility;
                        AtomicReference atomicReference = r1.WinterFlowRouterStructure;
                        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowTestingCloud.WinterFlowRouterRouter;
                        andSet = atomicReference.getAndSet(winterFlowJSONDecorator);
                        andSet.getClass();
                        if (andSet == WinterFlowTestingCloud.WinterFlowSyntax) {
                        }
                        if (winterFlowHandlerPlatform != null) {
                        }
                    } else {
                        if (r1 != 3) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = winterFlowRouterPlatform.WinterFlowServerProtocol;
                        winterFlowConsumerBandwidth = winterFlowRouterPlatform.WinterFlowTransactionAgent;
                        r1 = winterFlowRouterPlatform.WinterFlowResponseEngine;
                        winterFlowCacheInterface2 = winterFlowRouterPlatform.WinterFlowSyntax;
                        winterFlowHandlerPlatform = winterFlowRouterPlatform.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        if (winterFlowHandlerPlatform != null) {
                            Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowHandlerPlatform, WinterFlowResponseEngine);
                            if (winterFlowConsumerBandwidth != null && !winterFlowConsumerBandwidth.WinterFlowHookDataSource()) {
                                throw winterFlowConsumerBandwidth.WinterFlowBandwidthObject();
                            }
                            Object obj3 = objectVolatile == WinterFlowEncryptionSubsystem.WinterFlowServerProtocol ? null : objectVolatile;
                            winterFlowRouterPlatform.WinterFlowRouterRouter = winterFlowHandlerPlatform;
                            winterFlowRouterPlatform.WinterFlowSyntax = winterFlowCacheInterface2;
                            winterFlowRouterPlatform.WinterFlowResponseEngine = r1;
                            winterFlowRouterPlatform.WinterFlowTransactionAgent = winterFlowConsumerBandwidth;
                            winterFlowRouterPlatform.WinterFlowServerProtocol = objectVolatile;
                            winterFlowRouterPlatform.WinterFlowBandwidthObject = 2;
                            if (winterFlowCacheInterface2.WinterFlowRouterRouter(obj3, winterFlowRouterPlatform) == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            obj = objectVolatile;
                            r1 = r1;
                            AtomicReference atomicReference2 = r1.WinterFlowRouterStructure;
                            WinterFlowJSONDecorator winterFlowJSONDecorator2 = WinterFlowTestingCloud.WinterFlowRouterRouter;
                            andSet = atomicReference2.getAndSet(winterFlowJSONDecorator2);
                            andSet.getClass();
                            if (andSet == WinterFlowTestingCloud.WinterFlowSyntax) {
                                winterFlowRouterPlatform.WinterFlowRouterRouter = winterFlowHandlerPlatform;
                                winterFlowRouterPlatform.WinterFlowSyntax = winterFlowCacheInterface2;
                                winterFlowRouterPlatform.WinterFlowResponseEngine = r1;
                                winterFlowRouterPlatform.WinterFlowTransactionAgent = winterFlowConsumerBandwidth;
                                winterFlowRouterPlatform.WinterFlowServerProtocol = obj;
                                winterFlowRouterPlatform.WinterFlowBandwidthObject = 3;
                                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                                WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowRouterPlatform));
                                winterFlowEventCloud.WinterFlowSerializerStructure();
                                AtomicReference atomicReference3 = r1.WinterFlowRouterStructure;
                                while (true) {
                                    if (atomicReference3.compareAndSet(winterFlowJSONDecorator2, winterFlowEventCloud)) {
                                        break;
                                    }
                                    if (atomicReference3.get() != winterFlowJSONDecorator2) {
                                        winterFlowEventCloud.WinterFlowSyntax(winterFlowAlgorithmSession);
                                        break;
                                    }
                                }
                                Object WinterFlowBatchUI = winterFlowEventCloud.WinterFlowBatchUI();
                                if (WinterFlowBatchUI == winterFlowListenerJava) {
                                }
                            }
                            if (winterFlowHandlerPlatform != null) {
                                throw new ClassCastException();
                            }
                        }
                    }
                    WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowRouterPlatform.WinterFlowTransactionManagerStrategy;
                    winterFlowEncryptionMicroservice.getClass();
                    winterFlowHandlerPlatform = this;
                    winterFlowCacheInterface2 = winterFlowCacheInterface;
                    winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
                    obj = null;
                    if (winterFlowHandlerPlatform != null) {
                    }
                }
            }
            if (r1 != 0) {
            }
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = winterFlowRouterPlatform.WinterFlowTransactionManagerStrategy;
            winterFlowEncryptionMicroservice2.getClass();
            winterFlowHandlerPlatform = this;
            winterFlowCacheInterface2 = winterFlowCacheInterface;
            winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowEncryptionMicroservice2.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
            obj = null;
            if (winterFlowHandlerPlatform != null) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        winterFlowRouterPlatform = new WinterFlowRouterPlatform(this, winterFlowTransactionManagerLayer);
        Object obj22 = winterFlowRouterPlatform.WinterFlowThreadListener;
        r1 = winterFlowRouterPlatform.WinterFlowBandwidthObject;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    public final boolean WinterFlowSyntax(Object obj, Object obj2) {
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowEncryptionSubsystem.WinterFlowServerProtocol;
        if (obj == null) {
            obj = winterFlowJSONDecorator;
        }
        if (obj2 == null) {
            obj2 = winterFlowJSONDecorator;
        }
        return WinterFlowTransactionAgent(obj, obj2);
    }

    public final boolean WinterFlowTransactionAgent(Object obj, Object obj2) {
        int i;
        WinterFlowTestingAgent[] winterFlowTestingAgentArr;
        WinterFlowJSONDecorator winterFlowJSONDecorator;
        synchronized (this) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowResponseEngine;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !WinterFlowManagerRequest.WinterFlowThreadListener(objectVolatile, obj)) {
                return false;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.WinterFlowSyntax;
            if ((i2 & 1) != 0) {
                this.WinterFlowSyntax = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.WinterFlowSyntax = i3;
            WinterFlowTestingAgent[] winterFlowTestingAgentArr2 = this.WinterFlowVariableVersionControl;
            while (true) {
                WinterFlowUserManagerUtility[] winterFlowUserManagerUtilityArr = (WinterFlowUserManagerUtility[]) winterFlowTestingAgentArr2;
                if (winterFlowUserManagerUtilityArr != null) {
                    for (WinterFlowUserManagerUtility winterFlowUserManagerUtility : winterFlowUserManagerUtilityArr) {
                        if (winterFlowUserManagerUtility != null) {
                            AtomicReference atomicReference = winterFlowUserManagerUtility.WinterFlowRouterStructure;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (winterFlowJSONDecorator = WinterFlowTestingCloud.WinterFlowSyntax)) {
                                    WinterFlowJSONDecorator winterFlowJSONDecorator2 = WinterFlowTestingCloud.WinterFlowRouterRouter;
                                    if (obj3 != winterFlowJSONDecorator2) {
                                        while (!atomicReference.compareAndSet(obj3, winterFlowJSONDecorator2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((WinterFlowEventCloud) obj3).WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, winterFlowJSONDecorator)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.WinterFlowSyntax;
                    if (i == i3) {
                        this.WinterFlowSyntax = i3 + 1;
                        return true;
                    }
                    winterFlowTestingAgentArr = this.WinterFlowVariableVersionControl;
                }
                winterFlowTestingAgentArr2 = winterFlowTestingAgentArr;
                i3 = i;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerSession
    public final WinterFlowTestingAgent[] WinterFlowVariableVersionControl() {
        return new WinterFlowUserManagerUtility[2];
    }

    @Override // com.google.android.datatransport.WinterFlowHookView
    public final Object getValue() {
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowEncryptionSubsystem.WinterFlowServerProtocol;
        Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowResponseEngine);
        if (objectVolatile == winterFlowJSONDecorator) {
            return null;
        }
        return objectVolatile;
    }
}
