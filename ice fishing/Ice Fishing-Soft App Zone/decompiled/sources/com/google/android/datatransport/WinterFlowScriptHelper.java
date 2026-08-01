package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptHelper extends WinterFlowInvokerEntity implements WinterFlowEventConfiguration, WinterFlowTransactionManagerLayer {
    public static final /* synthetic */ long WinterFlowServerProtocol = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowScriptHelper.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public Object WinterFlowResponseEngine;
    public final WinterFlowUnitTestRouter WinterFlowRouterRouter;
    public final WinterFlowOrchestrationCompiler WinterFlowSyntax;
    public final Object WinterFlowTransactionAgent;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public WinterFlowScriptHelper(WinterFlowUnitTestRouter winterFlowUnitTestRouter, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        super(-1);
        this.WinterFlowRouterRouter = winterFlowUnitTestRouter;
        this.WinterFlowSyntax = winterFlowOrchestrationCompiler;
        this.WinterFlowResponseEngine = WinterFlowCloudStack.WinterFlowRouterStructure;
        this.WinterFlowTransactionAgent = WinterFlowInvokerComponent.WinterFlowProxyStructure(winterFlowOrchestrationCompiler.getContext());
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        Throwable WinterFlowRouterStructure = WinterFlowRendererStructure.WinterFlowRouterStructure(obj);
        Object winterFlowSessionManagerSessionManager = WinterFlowRouterStructure == null ? obj : new WinterFlowSessionManagerSessionManager(WinterFlowRouterStructure, false);
        WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler = this.WinterFlowSyntax;
        WinterFlowEncryptionMicroservice context = winterFlowOrchestrationCompiler.getContext();
        WinterFlowUnitTestRouter winterFlowUnitTestRouter = this.WinterFlowRouterRouter;
        if (winterFlowUnitTestRouter.WinterFlowCacheManagerListener(context)) {
            this.WinterFlowResponseEngine = winterFlowSessionManagerSessionManager;
            this.WinterFlowUnitTestResponse = 0;
            winterFlowUnitTestRouter.WinterFlowConfigurationSubsystem(winterFlowOrchestrationCompiler.getContext(), this);
            return;
        }
        WinterFlowResponseObject WinterFlowRouterStructure2 = WinterFlowNetworkSubsystem.WinterFlowRouterStructure();
        if (WinterFlowRouterStructure2.WinterFlowUnitTestResponse >= 4294967296L) {
            this.WinterFlowResponseEngine = winterFlowSessionManagerSessionManager;
            this.WinterFlowUnitTestResponse = 0;
            WinterFlowRouterStructure2.WinterFlowUserManagerUserManager(this);
            return;
        }
        WinterFlowRouterStructure2.WinterFlowSoftwareEngine(true);
        try {
            WinterFlowEncryptionMicroservice context2 = winterFlowOrchestrationCompiler.getContext();
            Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(context2, this.WinterFlowTransactionAgent);
            try {
                winterFlowOrchestrationCompiler.WinterFlowSyntax(obj);
                while (WinterFlowRouterStructure2.WinterFlowTestingNode()) {
                }
            } finally {
                WinterFlowInvokerComponent.WinterFlowCacheTool(context2, WinterFlowFrameworkTransaction);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerEntity
    public final Object WinterFlowTransactionAgent() {
        Object obj = this.WinterFlowResponseEngine;
        this.WinterFlowResponseEngine = WinterFlowCloudStack.WinterFlowRouterStructure;
        return obj;
    }

    @Override // com.google.android.datatransport.WinterFlowEventConfiguration
    public final WinterFlowEventConfiguration WinterFlowTransactionManagerStrategy() {
        return this.WinterFlowSyntax;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        return this.WinterFlowSyntax.getContext();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.WinterFlowRouterRouter + ", " + WinterFlowQuerySyntax.WinterFlowUserManagerUserManager(this.WinterFlowSyntax) + ']';
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerEntity
    public final WinterFlowTransactionManagerLayer WinterFlowArrayNetwork() {
        return this;
    }
}
