package com.google.android.datatransport;

import java.io.FileOutputStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeView extends WinterFlowVersionNetwork {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowHookDataSource(Object obj, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowViewCacheManager winterFlowViewCacheManager;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowViewCacheManager) {
            winterFlowViewCacheManager = (WinterFlowViewCacheManager) winterFlowOrchestrationCompiler;
            int i2 = winterFlowViewCacheManager.WinterFlowServerProtocol;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowViewCacheManager.WinterFlowServerProtocol = i2 - Integer.MIN_VALUE;
                Object obj2 = winterFlowViewCacheManager.WinterFlowResponseEngine;
                i = winterFlowViewCacheManager.WinterFlowServerProtocol;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    if (this.WinterFlowHookDataSource.get()) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This scope has already been closed.");
                        return null;
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.WinterFlowRouterStructure);
                    try {
                        WinterFlowWorkerEngine winterFlowWorkerEngine = new WinterFlowWorkerEngine(fileOutputStream3);
                        winterFlowViewCacheManager.WinterFlowRouterRouter = fileOutputStream3;
                        winterFlowViewCacheManager.WinterFlowSyntax = fileOutputStream3;
                        winterFlowViewCacheManager.WinterFlowServerProtocol = 1;
                        WinterFlowCacheUtility.WinterFlowThreadListener(obj, winterFlowWorkerEngine);
                        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (winterFlowAlgorithmSession == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = winterFlowViewCacheManager.WinterFlowSyntax;
                    fileOutputStream = winterFlowViewCacheManager.WinterFlowRouterRouter;
                    try {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            WinterFlowCloudStack.WinterFlowTransactionAgent(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                WinterFlowCloudStack.WinterFlowTransactionAgent(fileOutputStream, null);
                return winterFlowAlgorithmSession;
            }
        }
        winterFlowViewCacheManager = new WinterFlowViewCacheManager(this, winterFlowOrchestrationCompiler);
        Object obj22 = winterFlowViewCacheManager.WinterFlowResponseEngine;
        i = winterFlowViewCacheManager.WinterFlowServerProtocol;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        WinterFlowCloudStack.WinterFlowTransactionAgent(fileOutputStream, null);
        return winterFlowAlgorithmSession2;
    }
}
