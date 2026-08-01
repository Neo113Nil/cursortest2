package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverCloud extends WinterFlowVersionControlServer {
    public final ThreadLocal WinterFlowSyntax;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowResolverCloud(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        super(winterFlowTransactionManagerLayer, winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(r0) == null ? winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(r0) : winterFlowEncryptionMicroservice);
        WinterFlowSyntaxInvoker winterFlowSyntaxInvoker = WinterFlowSyntaxInvoker.WinterFlowRouterRouter;
        this.WinterFlowSyntax = new ThreadLocal();
        if (winterFlowTransactionManagerLayer.getContext().WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowMapperProtocol) instanceof WinterFlowUnitTestRouter) {
            return;
        }
        Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(winterFlowEncryptionMicroservice, null);
        WinterFlowInvokerComponent.WinterFlowCacheTool(winterFlowEncryptionMicroservice, WinterFlowFrameworkTransaction);
        WinterFlowParserPipeline(winterFlowEncryptionMicroservice, WinterFlowFrameworkTransaction);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlServer, com.google.android.datatransport.WinterFlowControllerTransaction
    public final void WinterFlowMapperProtocol(Object obj) {
        if (this.threadLocalIsSet) {
            WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) this.WinterFlowSyntax.get();
            if (winterFlowServerPlatform != null) {
                WinterFlowInvokerComponent.WinterFlowCacheTool((WinterFlowEncryptionMicroservice) winterFlowServerPlatform.WinterFlowVariableVersionControl, winterFlowServerPlatform.WinterFlowTransactionManagerStrategy);
            }
            this.WinterFlowSyntax.remove();
        }
        Object WinterFlowStrategyTool = WinterFlowServerManager.WinterFlowStrategyTool(obj);
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowRouterRouter;
        WinterFlowEncryptionMicroservice context = winterFlowTransactionManagerLayer.getContext();
        Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(context, null);
        WinterFlowResolverCloud WinterFlowFrameworkTransaction2 = WinterFlowFrameworkTransaction != WinterFlowInvokerComponent.WinterFlowOrchestrationSubsystem ? WinterFlowUnitTestLibrary.WinterFlowFrameworkTransaction(winterFlowTransactionManagerLayer, context, WinterFlowFrameworkTransaction) : null;
        try {
            this.WinterFlowRouterRouter.WinterFlowSyntax(WinterFlowStrategyTool);
            if (WinterFlowFrameworkTransaction2 == null || WinterFlowFrameworkTransaction2.WinterFlowPipelineSoftware()) {
                WinterFlowInvokerComponent.WinterFlowCacheTool(context, WinterFlowFrameworkTransaction);
            }
        } catch (Throwable th) {
            if (WinterFlowFrameworkTransaction2 == null || WinterFlowFrameworkTransaction2.WinterFlowPipelineSoftware()) {
                WinterFlowInvokerComponent.WinterFlowCacheTool(context, WinterFlowFrameworkTransaction);
            }
            throw th;
        }
    }

    public final void WinterFlowParserPipeline(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Object obj) {
        this.threadLocalIsSet = true;
        this.WinterFlowSyntax.set(new WinterFlowServerPlatform(winterFlowEncryptionMicroservice, obj));
    }

    public final boolean WinterFlowPipelineSoftware() {
        boolean z = this.threadLocalIsSet && this.WinterFlowSyntax.get() == null;
        this.WinterFlowSyntax.remove();
        return !z;
    }
}
