package com.google.android.datatransport;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorServer {
    public int WinterFlowArrayNetwork;
    public final ReentrantLock WinterFlowCacheManagerAgent = new ReentrantLock();
    public final WinterFlowObjectUI WinterFlowHookDataSource;
    public final WinterFlowOrchestrationValidator WinterFlowRouterRouter;
    public final int WinterFlowRouterStructure;
    public final WinterFlowJavaJSON[] WinterFlowTransactionManagerStrategy;
    public final WinterFlowSyntaxStrategy WinterFlowUnitTestResponse;
    public boolean WinterFlowVariableVersionControl;

    public WinterFlowDecoratorServer(int i, WinterFlowObjectUI winterFlowObjectUI) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = winterFlowObjectUI;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowJavaJSON[i];
        int i2 = WinterFlowEventRouter.WinterFlowRouterStructure;
        this.WinterFlowUnitTestResponse = new WinterFlowSyntaxStrategy(i);
        this.WinterFlowRouterRouter = new WinterFlowOrchestrationValidator(i);
    }

    public final void WinterFlowArrayNetwork(StringBuilder sb) {
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowRouterRouter;
        ReentrantLock reentrantLock = this.WinterFlowCacheManagerAgent;
        reentrantLock.lock();
        try {
            WinterFlowUserManagerResolver WinterFlowBatchUI = WinterFlowUnitTestLibrary.WinterFlowBatchUI();
            int i = winterFlowOrchestrationValidator.WinterFlowUnitTestResponse;
            for (int i2 = 0; i2 < i; i2++) {
                WinterFlowBatchUI.add(winterFlowOrchestrationValidator.get(i2));
            }
            WinterFlowUserManagerResolver WinterFlowServerProtocol = WinterFlowUnitTestLibrary.WinterFlowServerProtocol(WinterFlowBatchUI);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.WinterFlowRouterStructure + ", ");
            sb.append("permits=" + Math.max(WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this.WinterFlowUnitTestResponse, WinterFlowGatewayRouter.WinterFlowResponseEngine), 0) + ", ");
            sb.append("queue=(size=" + WinterFlowServerProtocol.WinterFlowRouterStructure() + ")[" + WinterFlowSerializerUtility.WinterFlowHookQuery(WinterFlowServerProtocol, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            WinterFlowJavaJSON[] winterFlowJavaJSONArr = this.WinterFlowTransactionManagerStrategy;
            int length = winterFlowJavaJSONArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                WinterFlowJavaJSON winterFlowJavaJSON = winterFlowJavaJSONArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(winterFlowJavaJSON != null ? winterFlowJavaJSON.WinterFlowVariableVersionControl.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (winterFlowJavaJSON != null) {
                    winterFlowJavaJSON.WinterFlowTransactionManagerStrategy(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void WinterFlowCacheManagerAgent() {
        ReentrantLock reentrantLock = this.WinterFlowCacheManagerAgent;
        reentrantLock.lock();
        try {
            this.WinterFlowVariableVersionControl = true;
            for (WinterFlowJavaJSON winterFlowJavaJSON : this.WinterFlowTransactionManagerStrategy) {
                if (winterFlowJavaJSON != null) {
                    winterFlowJavaJSON.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:38)(2:35|(1:37)))(1:16)|17|18|19|20|(3:22|23|(1:25)(10:27|12|13|14|(0)(0)|17|18|19|20|(2:28|29)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r13 = r13;
        r12 = r12;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:14:0x007e, B:16:0x0082, B:35:0x008a, B:38:0x0091), top: B:13:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:20:0x003c, B:22:0x0055, B:28:0x006a, B:29:0x0071), top: B:19:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #1 {all -> 0x0077, blocks: (B:20:0x003c, B:22:0x0055, B:28:0x006a, B:29:0x0071), top: B:19:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.datatransport.WinterFlowObjectUI] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0063 -> B:12:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowHookDataSource(long j, WinterFlowMicroserviceMicroservice winterFlowMicroserviceMicroservice, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowBackendSystem winterFlowBackendSystem;
        int i;
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        WinterFlowBackendSystem winterFlowBackendSystem2;
        Throwable th;
        long WinterFlowUIMiddleware;
        WinterFlowMicroserviceMicroservice winterFlowMicroserviceMicroservice2;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowBackendSystem) {
            winterFlowBackendSystem = (WinterFlowBackendSystem) winterFlowOrchestrationCompiler;
            int i2 = winterFlowBackendSystem.WinterFlowThreadListener;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowBackendSystem.WinterFlowThreadListener = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowBackendSystem.WinterFlowTransactionAgent;
                i = winterFlowBackendSystem.WinterFlowThreadListener;
                WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowBandwidthCache winterFlowBandwidthCache2 = new WinterFlowBandwidthCache();
                    WinterFlowMapperJava winterFlowMapperJava = new WinterFlowMapperJava(winterFlowBandwidthCache2, this, winterFlowTransactionManagerLayer, 12);
                    winterFlowBackendSystem.WinterFlowSyntax = winterFlowMicroserviceMicroservice;
                    winterFlowBackendSystem.WinterFlowResponseEngine = winterFlowBandwidthCache2;
                    winterFlowBackendSystem.WinterFlowRouterRouter = j;
                    winterFlowBackendSystem.WinterFlowThreadListener = 1;
                    WinterFlowUIMiddleware = WinterFlowManagerRequest.WinterFlowUIMiddleware(j);
                    if (WinterFlowUIMiddleware > 0) {
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = winterFlowBackendSystem.WinterFlowRouterRouter;
                    WinterFlowBandwidthCache winterFlowBandwidthCache3 = winterFlowBackendSystem.WinterFlowResponseEngine;
                    ?? r1 = winterFlowBackendSystem.WinterFlowSyntax;
                    try {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowMicroserviceMicroservice2 = r1;
                    } catch (Throwable th2) {
                        winterFlowBandwidthCache = winterFlowBandwidthCache3;
                        winterFlowMicroserviceMicroservice = r1;
                        winterFlowBackendSystem2 = winterFlowBackendSystem;
                        th = th2;
                    }
                    winterFlowBandwidthCache = winterFlowBandwidthCache3;
                    winterFlowMicroserviceMicroservice = winterFlowMicroserviceMicroservice2;
                    winterFlowBackendSystem2 = winterFlowBackendSystem;
                    th = null;
                    try {
                        if (th instanceof WinterFlowBatchTransaction) {
                            winterFlowMicroserviceMicroservice.WinterFlowRouterStructure();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        winterFlowBackendSystem = winterFlowBackendSystem2;
                        WinterFlowBandwidthCache winterFlowBandwidthCache22 = new WinterFlowBandwidthCache();
                        WinterFlowMapperJava winterFlowMapperJava2 = new WinterFlowMapperJava(winterFlowBandwidthCache22, this, winterFlowTransactionManagerLayer, 12);
                        winterFlowBackendSystem.WinterFlowSyntax = winterFlowMicroserviceMicroservice;
                        winterFlowBackendSystem.WinterFlowResponseEngine = winterFlowBandwidthCache22;
                        winterFlowBackendSystem.WinterFlowRouterRouter = j;
                        winterFlowBackendSystem.WinterFlowThreadListener = 1;
                        WinterFlowUIMiddleware = WinterFlowManagerRequest.WinterFlowUIMiddleware(j);
                        if (WinterFlowUIMiddleware > 0) {
                            Object WinterFlowUnitTestResponse = WinterFlowMicroserviceWidget.WinterFlowUnitTestResponse(new WinterFlowConcurrencyDeployment(WinterFlowUIMiddleware, winterFlowBackendSystem), winterFlowMapperJava2);
                            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (WinterFlowUnitTestResponse == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            winterFlowMicroserviceMicroservice2 = winterFlowMicroserviceMicroservice;
                            winterFlowBandwidthCache3 = winterFlowBandwidthCache22;
                            winterFlowBandwidthCache = winterFlowBandwidthCache3;
                            winterFlowMicroserviceMicroservice = winterFlowMicroserviceMicroservice2;
                            winterFlowBackendSystem2 = winterFlowBackendSystem;
                            th = null;
                            if (th instanceof WinterFlowBatchTransaction) {
                            }
                            winterFlowBackendSystem = winterFlowBackendSystem2;
                            WinterFlowBandwidthCache winterFlowBandwidthCache222 = new WinterFlowBandwidthCache();
                            WinterFlowMapperJava winterFlowMapperJava22 = new WinterFlowMapperJava(winterFlowBandwidthCache222, this, winterFlowTransactionManagerLayer, 12);
                            winterFlowBackendSystem.WinterFlowSyntax = winterFlowMicroserviceMicroservice;
                            winterFlowBackendSystem.WinterFlowResponseEngine = winterFlowBandwidthCache222;
                            winterFlowBackendSystem.WinterFlowRouterRouter = j;
                            winterFlowBackendSystem.WinterFlowThreadListener = 1;
                            WinterFlowUIMiddleware = WinterFlowManagerRequest.WinterFlowUIMiddleware(j);
                            if (WinterFlowUIMiddleware > 0) {
                                throw new WinterFlowBatchTransaction("Timed out immediately", null);
                            }
                        }
                    } catch (Throwable th3) {
                        WinterFlowJavaJSON winterFlowJavaJSON = (WinterFlowJavaJSON) winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                        if (winterFlowJavaJSON != null) {
                            WinterFlowVariableVersionControl(winterFlowJavaJSON);
                        }
                        throw th3;
                    }
                }
            }
        }
        winterFlowBackendSystem = new WinterFlowBackendSystem(this, winterFlowOrchestrationCompiler);
        Object obj3 = winterFlowBackendSystem.WinterFlowTransactionAgent;
        i = winterFlowBackendSystem.WinterFlowThreadListener;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        r8.WinterFlowConcurrencyThread(r4, r0.WinterFlowTransactionManagerStrategy);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:13:0x007d, B:15:0x0081, B:17:0x0087, B:20:0x008e, B:21:0x00a8, B:25:0x00b6, B:26:0x00bd), top: B:12:0x007d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6 A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #1 {all -> 0x00b4, blocks: (B:13:0x007d, B:15:0x0081, B:17:0x0087, B:20:0x008e, B:21:0x00a8, B:25:0x00b6, B:26:0x00bd), top: B:12:0x007d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowRepositoryQueue winterFlowRepositoryQueue;
        int i;
        int andDecrement;
        ReentrantLock reentrantLock;
        WinterFlowSyntaxStrategy winterFlowSyntaxStrategy = this.WinterFlowUnitTestResponse;
        int i2 = winterFlowSyntaxStrategy.WinterFlowVariableVersionControl;
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowRouterRouter;
        try {
            try {
                if (winterFlowOrchestrationCompiler instanceof WinterFlowRepositoryQueue) {
                    winterFlowRepositoryQueue = (WinterFlowRepositoryQueue) winterFlowOrchestrationCompiler;
                    int i3 = winterFlowRepositoryQueue.WinterFlowResponseEngine;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        winterFlowRepositoryQueue.WinterFlowResponseEngine = i3 - Integer.MIN_VALUE;
                        Object obj = winterFlowRepositoryQueue.WinterFlowRouterRouter;
                        i = winterFlowRepositoryQueue.WinterFlowResponseEngine;
                        if (i != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowRepositoryQueue.WinterFlowResponseEngine = 1;
                            do {
                                andDecrement = WinterFlowGatewayRouter.WinterFlowSyntax.getAndDecrement(winterFlowSyntaxStrategy);
                            } while (andDecrement > i2);
                            Object obj2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            Object obj3 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (andDecrement <= 0) {
                                WinterFlowEventCloud WinterFlowMapperProtocol = WinterFlowUnitTestLibrary.WinterFlowMapperProtocol(WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowRepositoryQueue));
                                try {
                                    if (!winterFlowSyntaxStrategy.WinterFlowRouterStructure(WinterFlowMapperProtocol)) {
                                        while (true) {
                                            int andDecrement2 = WinterFlowGatewayRouter.WinterFlowSyntax.getAndDecrement(winterFlowSyntaxStrategy);
                                            if (andDecrement2 <= i2) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (winterFlowSyntaxStrategy.WinterFlowRouterStructure(WinterFlowMapperProtocol)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    Object WinterFlowBatchUI = WinterFlowMapperProtocol.WinterFlowBatchUI();
                                    Object obj4 = WinterFlowBatchUI;
                                    if (WinterFlowBatchUI != obj3) {
                                        obj4 = obj2;
                                    }
                                    if (obj4 == obj3) {
                                        obj2 = obj4;
                                    }
                                } catch (Throwable th) {
                                    WinterFlowMapperProtocol.WinterFlowCompilerVariable();
                                    throw th;
                                }
                            }
                            if (obj2 == obj3) {
                                return obj3;
                            }
                        } else {
                            if (i != 1) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        }
                        reentrantLock = this.WinterFlowCacheManagerAgent;
                        reentrantLock.lock();
                        if (!this.WinterFlowVariableVersionControl) {
                            WinterFlowConfigurationException.WinterFlowSyntax("Connection pool is closed", 21);
                            throw null;
                        }
                        if (winterFlowOrchestrationValidator.isEmpty() && this.WinterFlowArrayNetwork < this.WinterFlowRouterStructure) {
                            WinterFlowJavaJSON winterFlowJavaJSON = new WinterFlowJavaJSON((WinterFlowDeserializationHandler) this.WinterFlowHookDataSource.WinterFlowRouterStructure());
                            WinterFlowJavaJSON[] winterFlowJavaJSONArr = this.WinterFlowTransactionManagerStrategy;
                            int i4 = this.WinterFlowArrayNetwork;
                            this.WinterFlowArrayNetwork = i4 + 1;
                            winterFlowJavaJSONArr[i4] = winterFlowJavaJSON;
                            winterFlowOrchestrationValidator.addLast(winterFlowJavaJSON);
                        }
                        return (WinterFlowJavaJSON) winterFlowOrchestrationValidator.removeLast();
                    }
                }
                if (!this.WinterFlowVariableVersionControl) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.WinterFlowCacheManagerAgent;
            reentrantLock.lock();
        } catch (Throwable th2) {
            winterFlowSyntaxStrategy.WinterFlowCacheManagerAgent();
            throw th2;
        }
        winterFlowRepositoryQueue = new WinterFlowRepositoryQueue(this, winterFlowOrchestrationCompiler);
        Object obj5 = winterFlowRepositoryQueue.WinterFlowRouterRouter;
        i = winterFlowRepositoryQueue.WinterFlowResponseEngine;
        if (i != 0) {
        }
    }

    public final void WinterFlowVariableVersionControl(WinterFlowJavaJSON winterFlowJavaJSON) {
        ReentrantLock reentrantLock = this.WinterFlowCacheManagerAgent;
        reentrantLock.lock();
        try {
            this.WinterFlowRouterRouter.addLast(winterFlowJavaJSON);
            reentrantLock.unlock();
            this.WinterFlowUnitTestResponse.WinterFlowCacheManagerAgent();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
