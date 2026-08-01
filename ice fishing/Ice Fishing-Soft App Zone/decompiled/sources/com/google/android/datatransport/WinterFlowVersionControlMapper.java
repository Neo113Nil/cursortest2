package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlMapper extends WinterFlowThreadDebug {
    public static final WinterFlowVersionControlMapper WinterFlowCacheManagerAgent = new WinterFlowVersionControlMapper(0, 2, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        int i;
        WinterFlowBackendEntity winterFlowBackendEntity = (WinterFlowBackendEntity) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
        int WinterFlowCacheManagerAgent2 = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent((WinterFlowDatabaseSchemaHandler) winterFlowProviderEntity.WinterFlowCacheManagerAgent(1));
        if (winterFlowServiceProviderListener.WinterFlowBatchUI >= WinterFlowCacheManagerAgent2) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Check failed");
        }
        WinterFlowServerManager.WinterFlowEventEmitterController(winterFlowServiceProviderListener, winterFlowProcessorConsumer, WinterFlowCacheManagerAgent2);
        int i2 = winterFlowServiceProviderListener.WinterFlowBatchUI;
        int i3 = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
        while (i3 >= 0 && !winterFlowServiceProviderListener.WinterFlowResolverController(i3)) {
            i3 = winterFlowServiceProviderListener.WinterFlowConfigurationSubsystem(winterFlowServiceProviderListener.WinterFlowHookDataSource, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (winterFlowServiceProviderListener.WinterFlowRouterAdapter(i2, i4)) {
                if (winterFlowServiceProviderListener.WinterFlowResolverController(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += winterFlowServiceProviderListener.WinterFlowResolverController(i4) ? 1 : winterFlowServiceProviderListener.WinterFlowHookDataSource[(winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i4) * 5) + 1] & 67108863;
                i4 += winterFlowServiceProviderListener.WinterFlowBatchUI(i4);
            }
        }
        while (true) {
            i = winterFlowServiceProviderListener.WinterFlowBatchUI;
            if (i >= WinterFlowCacheManagerAgent2) {
                break;
            }
            if (winterFlowServiceProviderListener.WinterFlowRouterAdapter(WinterFlowCacheManagerAgent2, i)) {
                int i6 = winterFlowServiceProviderListener.WinterFlowBatchUI;
                if (i6 < winterFlowServiceProviderListener.WinterFlowRouterAdapter && (winterFlowServiceProviderListener.WinterFlowHookDataSource[(winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i6) * 5) + 1] & 1073741824) != 0) {
                    winterFlowProcessorConsumer.WinterFlowCacheManagerAgent(winterFlowServiceProviderListener.WinterFlowCompilerVariable(winterFlowServiceProviderListener.WinterFlowBatchUI));
                    i5 = 0;
                }
                winterFlowServiceProviderListener.WinterFlowCloudMicroservice();
            } else {
                i5 += winterFlowServiceProviderListener.WinterFlowSyntaxSubsystem();
            }
        }
        if (i != WinterFlowCacheManagerAgent2) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Check failed");
        }
        winterFlowBackendEntity.WinterFlowRouterStructure = i5;
    }
}
