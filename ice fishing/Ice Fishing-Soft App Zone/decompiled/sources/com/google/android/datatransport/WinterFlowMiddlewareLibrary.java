package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowMiddlewareLibrary implements WinterFlowObjectSession {
    public final /* synthetic */ long WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowMiddlewareLibrary(int i, long j) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = j;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowEventCloud winterFlowEventCloud;
        Object winterFlowDecoratorTool;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        long j = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowBandwidthRepository winterFlowBandwidthRepository = (WinterFlowBandwidthRepository) obj;
                WinterFlowObjectSession winterFlowObjectSession = winterFlowBandwidthRepository.WinterFlowHookDataSource;
                if (winterFlowObjectSession != null && (winterFlowEventCloud = winterFlowBandwidthRepository.WinterFlowRouterStructure) != null) {
                    try {
                        winterFlowDecoratorTool = winterFlowObjectSession.WinterFlowUnitTestResponse(Long.valueOf(j));
                    } catch (Throwable th) {
                        winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
                    }
                    winterFlowEventCloud.WinterFlowSyntax(winterFlowDecoratorTool);
                }
                return winterFlowAlgorithmSession;
            case 1:
                ((WinterFlowDataSourceSerializer) obj).WinterFlowCacheManagerAgent(WinterFlowFrontendMechanism.WinterFlowHookDataSource, Long.valueOf(j));
                return null;
            default:
                WinterFlowParserUserManager winterFlowParserUserManager = (WinterFlowParserUserManager) obj;
                float min = Math.min(winterFlowParserUserManager.WinterFlowSingletonPlatform(4.0f), Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() & 4294967295L)));
                float WinterFlowSingletonPlatform = winterFlowParserUserManager.WinterFlowSingletonPlatform(6.0f);
                float intBitsToFloat = (Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() & 4294967295L)) - min) / 2.0f;
                if (intBitsToFloat <= WinterFlowSingletonPlatform) {
                    WinterFlowSingletonPlatform = intBitsToFloat;
                }
                if (winterFlowParserUserManager.getLayoutDirection() == WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy) {
                    long WinterFlowCompilerHandler = winterFlowParserUserManager.WinterFlowCompilerHandler();
                    WinterFlowObjectPackage WinterFlowSerializerStructure = winterFlowParserUserManager.WinterFlowSerializerStructure();
                    long WinterFlowThreadListener = WinterFlowSerializerStructure.WinterFlowThreadListener();
                    WinterFlowSerializerStructure.WinterFlowTransactionAgent().WinterFlowTransactionAgent();
                    try {
                        ((WinterFlowConfigurationModule) WinterFlowSerializerStructure.WinterFlowTransactionManagerStrategy).WinterFlowConcurrencyThread(-1.0f, 1.0f, WinterFlowCompilerHandler);
                        WinterFlowPackageProcess.WinterFlowCacheManagerAgent(winterFlowParserUserManager, j, min, WinterFlowSingletonPlatform);
                    } finally {
                        WinterFlowSerializerStructure.WinterFlowTransactionAgent().WinterFlowResponseEngine();
                        WinterFlowSerializerStructure.WinterFlowArrayHelper(WinterFlowThreadListener);
                    }
                } else {
                    WinterFlowPackageProcess.WinterFlowCacheManagerAgent(winterFlowParserUserManager, j, min, WinterFlowSingletonPlatform);
                }
                return winterFlowAlgorithmSession;
        }
    }
}
