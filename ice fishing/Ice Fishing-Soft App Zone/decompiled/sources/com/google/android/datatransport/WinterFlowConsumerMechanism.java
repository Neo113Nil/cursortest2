package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerMechanism {
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowArrayNetwork;
    public final /* synthetic */ WinterFlowBandwidthCache WinterFlowCacheManagerAgent;
    public final /* synthetic */ WinterFlowInterfaceProcessor WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowCacheCacheManager WinterFlowRouterStructure;

    public WinterFlowConsumerMechanism(WinterFlowCacheCacheManager winterFlowCacheCacheManager, WinterFlowInterfaceProcessor winterFlowInterfaceProcessor, WinterFlowBandwidthCache winterFlowBandwidthCache, WinterFlowStrategyResolver winterFlowStrategyResolver) {
        this.WinterFlowRouterStructure = winterFlowCacheCacheManager;
        this.WinterFlowHookDataSource = winterFlowInterfaceProcessor;
        this.WinterFlowCacheManagerAgent = winterFlowBandwidthCache;
        this.WinterFlowArrayNetwork = winterFlowStrategyResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r10.WinterFlowArrayNetwork(r0) == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00a8, B:30:0x00b0), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(WinterFlowSingletonTransaction winterFlowSingletonTransaction, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowSchedulerLoader winterFlowSchedulerLoader;
        int i;
        WinterFlowCacheCacheManager winterFlowCacheCacheManager;
        WinterFlowInterfaceProcessor winterFlowInterfaceProcessor;
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        WinterFlowStrategyResolver winterFlowStrategyResolver;
        WinterFlowEventEvent winterFlowEventEvent;
        WinterFlowCacheCacheManager winterFlowCacheCacheManager2;
        WinterFlowCacheCacheManager winterFlowCacheCacheManager3;
        WinterFlowBandwidthCache winterFlowBandwidthCache2;
        Object obj;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowSchedulerLoader) {
                winterFlowSchedulerLoader = (WinterFlowSchedulerLoader) winterFlowOrchestrationCompiler;
                int i2 = winterFlowSchedulerLoader.WinterFlowBandwidthObject;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowSchedulerLoader.WinterFlowBandwidthObject = i2 - Integer.MIN_VALUE;
                    Object obj2 = winterFlowSchedulerLoader.WinterFlowThreadListener;
                    i = winterFlowSchedulerLoader.WinterFlowBandwidthObject;
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        winterFlowSchedulerLoader.WinterFlowRouterRouter = winterFlowSingletonTransaction;
                        winterFlowCacheCacheManager = this.WinterFlowRouterStructure;
                        winterFlowSchedulerLoader.WinterFlowSyntax = winterFlowCacheCacheManager;
                        winterFlowInterfaceProcessor = this.WinterFlowHookDataSource;
                        winterFlowSchedulerLoader.WinterFlowResponseEngine = winterFlowInterfaceProcessor;
                        winterFlowBandwidthCache = this.WinterFlowCacheManagerAgent;
                        winterFlowSchedulerLoader.WinterFlowTransactionAgent = winterFlowBandwidthCache;
                        winterFlowStrategyResolver = this.WinterFlowArrayNetwork;
                        winterFlowSchedulerLoader.WinterFlowServerProtocol = winterFlowStrategyResolver;
                        winterFlowSchedulerLoader.WinterFlowBandwidthObject = 1;
                        winterFlowEventEvent = winterFlowSingletonTransaction;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = winterFlowSchedulerLoader.WinterFlowResponseEngine;
                                winterFlowBandwidthCache2 = (WinterFlowBandwidthCache) winterFlowSchedulerLoader.WinterFlowSyntax;
                                winterFlowCacheCacheManager2 = (WinterFlowCacheCacheManager) winterFlowSchedulerLoader.WinterFlowRouterRouter;
                                try {
                                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                                    winterFlowBandwidthCache2.WinterFlowVariableVersionControl = obj;
                                    Object obj3 = winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                                    winterFlowCacheCacheManager2.WinterFlowHookDataSource(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    winterFlowCacheCacheManager2.WinterFlowHookDataSource(null);
                                    throw th;
                                }
                            }
                            winterFlowStrategyResolver = (WinterFlowStrategyResolver) winterFlowSchedulerLoader.WinterFlowResponseEngine;
                            winterFlowBandwidthCache2 = (WinterFlowBandwidthCache) winterFlowSchedulerLoader.WinterFlowSyntax;
                            winterFlowCacheCacheManager3 = (WinterFlowCacheCacheManager) winterFlowSchedulerLoader.WinterFlowRouterRouter;
                            try {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                                if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj2, winterFlowBandwidthCache2.WinterFlowVariableVersionControl)) {
                                    winterFlowCacheCacheManager2 = winterFlowCacheCacheManager3;
                                    Object obj32 = winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                                    winterFlowCacheCacheManager2.WinterFlowHookDataSource(null);
                                    return obj32;
                                }
                                winterFlowSchedulerLoader.WinterFlowRouterRouter = winterFlowCacheCacheManager3;
                                winterFlowSchedulerLoader.WinterFlowSyntax = winterFlowBandwidthCache2;
                                winterFlowSchedulerLoader.WinterFlowResponseEngine = obj2;
                                winterFlowSchedulerLoader.WinterFlowBandwidthObject = 3;
                                if (winterFlowStrategyResolver.WinterFlowResponseEngine(obj2, false, winterFlowSchedulerLoader) != winterFlowListenerJava) {
                                    obj = obj2;
                                    winterFlowCacheCacheManager2 = winterFlowCacheCacheManager3;
                                    winterFlowBandwidthCache2.WinterFlowVariableVersionControl = obj;
                                    Object obj322 = winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                                    winterFlowCacheCacheManager2.WinterFlowHookDataSource(null);
                                    return obj322;
                                }
                                return winterFlowListenerJava;
                            } catch (Throwable th2) {
                                th = th2;
                                winterFlowCacheCacheManager2 = winterFlowCacheCacheManager3;
                                winterFlowCacheCacheManager2.WinterFlowHookDataSource(null);
                                throw th;
                            }
                        }
                        winterFlowStrategyResolver = winterFlowSchedulerLoader.WinterFlowServerProtocol;
                        WinterFlowBandwidthCache winterFlowBandwidthCache3 = winterFlowSchedulerLoader.WinterFlowTransactionAgent;
                        winterFlowInterfaceProcessor = (WinterFlowInterfaceProcessor) winterFlowSchedulerLoader.WinterFlowResponseEngine;
                        WinterFlowCacheCacheManager winterFlowCacheCacheManager4 = (WinterFlowCacheCacheManager) winterFlowSchedulerLoader.WinterFlowSyntax;
                        WinterFlowEventEvent winterFlowEventEvent2 = (WinterFlowEventEvent) winterFlowSchedulerLoader.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        winterFlowBandwidthCache = winterFlowBandwidthCache3;
                        winterFlowEventEvent = winterFlowEventEvent2;
                        winterFlowCacheCacheManager = winterFlowCacheCacheManager4;
                    }
                    if (!winterFlowInterfaceProcessor.WinterFlowVariableVersionControl) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                    winterFlowSchedulerLoader.WinterFlowRouterRouter = winterFlowCacheCacheManager;
                    winterFlowSchedulerLoader.WinterFlowSyntax = winterFlowBandwidthCache;
                    winterFlowSchedulerLoader.WinterFlowResponseEngine = winterFlowStrategyResolver;
                    winterFlowSchedulerLoader.WinterFlowTransactionAgent = null;
                    winterFlowSchedulerLoader.WinterFlowServerProtocol = null;
                    winterFlowSchedulerLoader.WinterFlowBandwidthObject = 2;
                    Object WinterFlowVariableVersionControl = winterFlowEventEvent.WinterFlowVariableVersionControl(obj4, winterFlowSchedulerLoader);
                    if (WinterFlowVariableVersionControl != winterFlowListenerJava) {
                        winterFlowCacheCacheManager3 = winterFlowCacheCacheManager;
                        obj2 = WinterFlowVariableVersionControl;
                        winterFlowBandwidthCache2 = winterFlowBandwidthCache;
                        if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj2, winterFlowBandwidthCache2.WinterFlowVariableVersionControl)) {
                        }
                    }
                    return winterFlowListenerJava;
                }
            }
            if (!winterFlowInterfaceProcessor.WinterFlowVariableVersionControl) {
            }
        } catch (Throwable th3) {
            th = th3;
            winterFlowCacheCacheManager2 = winterFlowCacheCacheManager;
            winterFlowCacheCacheManager2.WinterFlowHookDataSource(null);
            throw th;
        }
        winterFlowSchedulerLoader = new WinterFlowSchedulerLoader(this, winterFlowOrchestrationCompiler);
        Object obj22 = winterFlowSchedulerLoader.WinterFlowThreadListener;
        i = winterFlowSchedulerLoader.WinterFlowBandwidthObject;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
    }
}
