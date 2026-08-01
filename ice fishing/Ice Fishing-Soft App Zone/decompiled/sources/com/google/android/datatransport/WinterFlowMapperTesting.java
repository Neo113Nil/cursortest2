package com.google.android.datatransport;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperTesting extends WinterFlowMicroserviceRefactoring {
    public final WinterFlowEventCloud WinterFlowSyntax;

    public WinterFlowMapperTesting(WinterFlowEventCloud winterFlowEventCloud) {
        this.WinterFlowSyntax = winterFlowEventCloud;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceRefactoring
    public final void WinterFlowServiceUtility(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        WinterFlowControllerTransaction WinterFlowServerProtocol = WinterFlowServerProtocol();
        WinterFlowEventCloud winterFlowEventCloud = this.WinterFlowSyntax;
        Throwable WinterFlowSingletonPlatform = winterFlowEventCloud.WinterFlowSingletonPlatform(WinterFlowServerProtocol);
        if (winterFlowEventCloud.WinterFlowBackendCacheManager()) {
            WinterFlowScriptHelper winterFlowScriptHelper = (WinterFlowScriptHelper) winterFlowEventCloud.WinterFlowRouterRouter;
            long j = WinterFlowScriptHelper.WinterFlowServerProtocol;
            loop0: while (true) {
                Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowScriptHelper, j);
                WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowCloudStack.WinterFlowHookDataSource;
                if (WinterFlowManagerRequest.WinterFlowThreadListener(objectVolatile, winterFlowJSONDecorator)) {
                    do {
                        unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe.compareAndSwapObject(winterFlowScriptHelper, WinterFlowScriptHelper.WinterFlowServerProtocol, winterFlowJSONDecorator, WinterFlowSingletonPlatform)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(winterFlowScriptHelper, j) == winterFlowJSONDecorator);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe2.compareAndSwapObject(winterFlowScriptHelper, WinterFlowScriptHelper.WinterFlowServerProtocol, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(winterFlowScriptHelper, j) == objectVolatile);
                }
            }
        }
        winterFlowEventCloud.WinterFlowResponseEngine(WinterFlowSingletonPlatform);
        if (winterFlowEventCloud.WinterFlowBackendCacheManager()) {
            return;
        }
        winterFlowEventCloud.WinterFlowBandwidthObject();
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceRefactoring
    public final boolean WinterFlowThreadListener() {
        return true;
    }
}
