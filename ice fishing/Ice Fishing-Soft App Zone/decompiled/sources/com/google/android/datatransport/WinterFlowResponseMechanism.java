package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseMechanism extends WinterFlowThreadDebug {
    public static final WinterFlowResponseMechanism WinterFlowCacheManagerAgent = new WinterFlowResponseMechanism(1, 0, 2);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        int WinterFlowHookDataSource = winterFlowProviderEntity.WinterFlowHookDataSource(0);
        int i = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
        int WinterFlowCompilerHandler = winterFlowServiceProviderListener.WinterFlowCompilerHandler(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i));
        int WinterFlowTransactionManagerStrategy = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i + 1));
        for (int max = Math.max(WinterFlowCompilerHandler, WinterFlowTransactionManagerStrategy - WinterFlowHookDataSource); max < WinterFlowTransactionManagerStrategy; max++) {
            Object obj = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent[winterFlowServiceProviderListener.WinterFlowUnitTestResponse(max)];
            if (obj instanceof WinterFlowFrontendHandler) {
                winterFlowValidator.WinterFlowVariableVersionControl((WinterFlowFrontendHandler) obj);
            } else if (obj instanceof WinterFlowStackEngine) {
                ((WinterFlowStackEngine) obj).WinterFlowCacheManagerAgent();
            }
        }
        if (WinterFlowHookDataSource <= 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Check failed");
        }
        int i2 = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
        int WinterFlowCompilerHandler2 = winterFlowServiceProviderListener.WinterFlowCompilerHandler(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i2));
        int WinterFlowTransactionManagerStrategy2 = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i2 + 1)) - WinterFlowHookDataSource;
        if (WinterFlowTransactionManagerStrategy2 < WinterFlowCompilerHandler2) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Check failed");
        }
        winterFlowServiceProviderListener.WinterFlowUserManagerUserManager(WinterFlowTransactionManagerStrategy2, WinterFlowHookDataSource, i2);
        int i3 = winterFlowServiceProviderListener.WinterFlowSyntax;
        if (i3 >= WinterFlowCompilerHandler2) {
            winterFlowServiceProviderListener.WinterFlowSyntax = i3 - WinterFlowHookDataSource;
        }
    }
}
