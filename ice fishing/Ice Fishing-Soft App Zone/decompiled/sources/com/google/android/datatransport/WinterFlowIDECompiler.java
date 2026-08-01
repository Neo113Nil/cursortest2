package com.google.android.datatransport;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDECompiler extends WinterFlowVersionControlServer {
    public static final /* synthetic */ long WinterFlowSyntax = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowIDECompiler.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // com.google.android.datatransport.WinterFlowVersionControlServer, com.google.android.datatransport.WinterFlowControllerTransaction
    public final void WinterFlowMapperProtocol(Object obj) {
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowSyntax;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    WinterFlowCloudStack.WinterFlowCompilerHandler(WinterFlowCloudStack.WinterFlowCompilerVariable(this.WinterFlowRouterRouter), WinterFlowServerManager.WinterFlowStrategyTool(obj));
                    return;
                } else {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Already resumed");
                    return;
                }
            }
            WinterFlowIDECompiler winterFlowIDECompiler = this;
            if (unsafe.compareAndSwapInt(winterFlowIDECompiler, j, 0, 2)) {
                return;
            } else {
                this = winterFlowIDECompiler;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlServer, com.google.android.datatransport.WinterFlowControllerTransaction
    public final void WinterFlowServerProtocol(Object obj) {
        WinterFlowMapperProtocol(obj);
    }
}
