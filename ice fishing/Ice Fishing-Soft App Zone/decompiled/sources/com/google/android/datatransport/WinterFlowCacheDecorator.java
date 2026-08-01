package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheDecorator extends WinterFlowScriptController {
    public static final WinterFlowCacheDecorator WinterFlowRouterRouter;
    public WinterFlowThreadPoolProvider WinterFlowUnitTestResponse;

    static {
        int i = WinterFlowSerializerSystem.WinterFlowCacheManagerAgent;
        int i2 = WinterFlowSerializerSystem.WinterFlowArrayNetwork;
        long j = WinterFlowSerializerSystem.WinterFlowVariableVersionControl;
        String str = WinterFlowSerializerSystem.WinterFlowRouterStructure;
        WinterFlowCacheDecorator winterFlowCacheDecorator = new WinterFlowCacheDecorator();
        winterFlowCacheDecorator.WinterFlowUnitTestResponse = new WinterFlowThreadPoolProvider(i, i2, j, str);
        WinterFlowRouterRouter = winterFlowCacheDecorator;
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowConfigurationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        WinterFlowThreadPoolProvider.WinterFlowTransactionManagerStrategy(this.WinterFlowUnitTestResponse, runnable, 6);
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowStrategyTool(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        WinterFlowThreadPoolProvider.WinterFlowTransactionManagerStrategy(this.WinterFlowUnitTestResponse, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final String toString() {
        return "Dispatchers.Default";
    }
}
