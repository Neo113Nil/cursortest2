package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSessionManagerFrontend {
    public static final WinterFlowPipelineHelper WinterFlowRouterStructure = new WinterFlowPipelineHelper(1, new WinterFlowDeploymentEngine(3));
    public static final WinterFlowPipelineHelper WinterFlowHookDataSource = new WinterFlowPipelineHelper(1, new WinterFlowDeploymentEngine(8));

    public static WinterFlowServiceView WinterFlowCacheManagerAgent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long j45 = (i & 1) != 0 ? WinterFlowCompilerUserManager.WinterFlowBackendCacheManager : j;
        return new WinterFlowServiceView(j45, (i & 2) != 0 ? WinterFlowCompilerUserManager.WinterFlowResponseEngine : j2, (i & 4) != 0 ? WinterFlowCompilerUserManager.WinterFlowEventEmitterController : j3, (i & 8) != 0 ? WinterFlowCompilerUserManager.WinterFlowTransactionAgent : j4, (i & 16) != 0 ? WinterFlowCompilerUserManager.WinterFlowVariableVersionControl : j5, (i & 32) != 0 ? WinterFlowCompilerUserManager.WinterFlowStrategyTool : j6, (i & 64) != 0 ? WinterFlowCompilerUserManager.WinterFlowServiceUtility : j7, (i & 128) != 0 ? WinterFlowCompilerUserManager.WinterFlowCacheManagerListener : j8, (i & 256) != 0 ? WinterFlowCompilerUserManager.WinterFlowBandwidthObject : j9, (i & 512) != 0 ? WinterFlowCompilerUserManager.WinterFlowCacheTool : j10, (i & 1024) != 0 ? WinterFlowCompilerUserManager.WinterFlowBatchUI : j11, (i & 2048) != 0 ? WinterFlowCompilerUserManager.WinterFlowProxyStructure : j12, (i & 4096) != 0 ? WinterFlowCompilerUserManager.WinterFlowRouterAdapter : j13, (i & 8192) != 0 ? WinterFlowCompilerUserManager.WinterFlowRouterStructure : j14, (i & 16384) != 0 ? WinterFlowCompilerUserManager.WinterFlowUnitTestResponse : j15, (i & 32768) != 0 ? WinterFlowCompilerUserManager.WinterFlowUserManagerUserManager : j16, (65536 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowSingletonPlatform : j17, (131072 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowQueueService : j18, (262144 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowVariableBandwidth : j19, (524288 & i) != 0 ? j45 : j20, (1048576 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowTransactionManagerStrategy : j21, (2097152 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowArrayNetwork : j22, WinterFlowCompilerUserManager.WinterFlowHookDataSource, WinterFlowCompilerUserManager.WinterFlowRouterRouter, WinterFlowCompilerUserManager.WinterFlowCacheManagerAgent, WinterFlowCompilerUserManager.WinterFlowSyntax, (67108864 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowResolverController : j23, (134217728 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowConsumerUserManager : j24, (268435456 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowConfigurationSubsystem : j25, (536870912 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowSoftwareEngine : j26, (i2 & 8) != 0 ? WinterFlowCompilerUserManager.WinterFlowUIMiddleware : j32, (1073741824 & i) != 0 ? WinterFlowCompilerUserManager.WinterFlowSyntaxSubsystem : j27, (i & Integer.MIN_VALUE) != 0 ? WinterFlowCompilerUserManager.WinterFlowTestingNode : j28, (i2 & 1) != 0 ? WinterFlowCompilerUserManager.WinterFlowCompilerHandler : j29, (i2 & 2) != 0 ? WinterFlowCompilerUserManager.WinterFlowFrontendBackend : j30, (i2 & 4) != 0 ? WinterFlowCompilerUserManager.WinterFlowCloudMicroservice : j31, (i2 & 16) != 0 ? WinterFlowCompilerUserManager.WinterFlowArrayHelper : j33, (i2 & 32) != 0 ? WinterFlowCompilerUserManager.WinterFlowCompilerVariable : j34, (i2 & 64) != 0 ? WinterFlowCompilerUserManager.WinterFlowServerProtocol : j35, (i2 & 128) != 0 ? WinterFlowCompilerUserManager.WinterFlowThreadListener : j36, (i2 & 256) != 0 ? WinterFlowCompilerUserManager.WinterFlowPackageIDE : j37, (i2 & 512) != 0 ? WinterFlowCompilerUserManager.WinterFlowSoftwareProtocol : j38, (i2 & 1024) != 0 ? WinterFlowCompilerUserManager.WinterFlowOrchestrationSubsystem : j39, (i2 & 2048) != 0 ? WinterFlowCompilerUserManager.WinterFlowConcurrencyThread : j40, (i2 & 4096) != 0 ? WinterFlowCompilerUserManager.WinterFlowConfiguration : j41, (i2 & 8192) != 0 ? WinterFlowCompilerUserManager.WinterFlowValidatorHandler : j42, (i2 & 16384) != 0 ? WinterFlowCompilerUserManager.WinterFlowSerializerStructure : j43, (i2 & 32768) != 0 ? WinterFlowCompilerUserManager.WinterFlowMapperProtocol : j44);
    }

    public static final long WinterFlowHookDataSource(WinterFlowCompilerSystem winterFlowCompilerSystem, WinterFlowResolverLibrary winterFlowResolverLibrary) {
        WinterFlowServiceView winterFlowServiceView = (WinterFlowServiceView) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowRouterStructure);
        switch (winterFlowCompilerSystem.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return winterFlowServiceView.WinterFlowServiceUtility;
            case 1:
                return winterFlowServiceView.WinterFlowMapperProtocol;
            case 2:
                return winterFlowServiceView.WinterFlowConsumerUserManager;
            case 3:
                return winterFlowServiceView.WinterFlowSerializerStructure;
            case 4:
                return winterFlowServiceView.WinterFlowVariableVersionControl;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return winterFlowServiceView.WinterFlowRouterAdapter;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return winterFlowServiceView.WinterFlowBandwidthObject;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return winterFlowServiceView.WinterFlowResolverController;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return winterFlowServiceView.WinterFlowBackendCacheManager;
            case 9:
                return winterFlowServiceView.WinterFlowHookDataSource;
            case 10:
                return winterFlowServiceView.WinterFlowArrayNetwork;
            case 11:
                return winterFlowServiceView.WinterFlowCompilerHandler;
            case 12:
                return winterFlowServiceView.WinterFlowFrontendBackend;
            case 13:
                return winterFlowServiceView.WinterFlowUnitTestResponse;
            case 14:
                return winterFlowServiceView.WinterFlowSyntax;
            case 15:
                return winterFlowServiceView.WinterFlowQueueService;
            case 16:
                return winterFlowServiceView.WinterFlowCacheTool;
            case 17:
                return winterFlowServiceView.WinterFlowConcurrencyThread;
            case 18:
                return winterFlowServiceView.WinterFlowVariableBandwidth;
            case 19:
                return winterFlowServiceView.WinterFlowTransactionAgent;
            case 20:
                return winterFlowServiceView.WinterFlowThreadListener;
            case 21:
                return winterFlowServiceView.WinterFlowValidatorHandler;
            case 22:
                return winterFlowServiceView.WinterFlowCompilerDataSource;
            case 23:
                return winterFlowServiceView.WinterFlowEventEmitterController;
            case 24:
                return winterFlowServiceView.WinterFlowArrayHelper;
            case 25:
                return winterFlowServiceView.WinterFlowRouterStructure;
            case 26:
                return winterFlowServiceView.WinterFlowCacheManagerAgent;
            case 27:
                return winterFlowServiceView.WinterFlowSyntaxSubsystem;
            case 28:
                return winterFlowServiceView.WinterFlowTestingNode;
            case 29:
                return winterFlowServiceView.WinterFlowCompilerVariable;
            case 30:
                return winterFlowServiceView.WinterFlowTransactionManagerStrategy;
            case 31:
                return winterFlowServiceView.WinterFlowRouterRouter;
            case 32:
                return winterFlowServiceView.WinterFlowCloudMicroservice;
            case 33:
                return winterFlowServiceView.WinterFlowUIMiddleware;
            case 34:
                return winterFlowServiceView.WinterFlowOrchestrationSubsystem;
            case 35:
                return winterFlowServiceView.WinterFlowConfigurationSubsystem;
            case 36:
                return winterFlowServiceView.WinterFlowCacheManagerListener;
            case 37:
                return winterFlowServiceView.WinterFlowPackageIDE;
            case 38:
                return winterFlowServiceView.WinterFlowSoftwareProtocol;
            case 39:
                return winterFlowServiceView.WinterFlowUserManagerUserManager;
            case 40:
                return winterFlowServiceView.WinterFlowSoftwareEngine;
            case 41:
                return winterFlowServiceView.WinterFlowStrategyTool;
            case 42:
                return winterFlowServiceView.WinterFlowBatchUI;
            case 43:
                return winterFlowServiceView.WinterFlowSingletonPlatform;
            case 44:
                return winterFlowServiceView.WinterFlowResponseEngine;
            case 45:
                return winterFlowServiceView.WinterFlowServerProtocol;
            case 46:
                return winterFlowServiceView.WinterFlowProxyStructure;
            case 47:
                return winterFlowServiceView.WinterFlowConfiguration;
            default:
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return 0L;
        }
    }

    public static WinterFlowServiceView WinterFlowRouterStructure(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        return new WinterFlowServiceView(j, (i & 2) != 0 ? WinterFlowParserScheduler.WinterFlowResponseEngine : j2, (i & 4) != 0 ? WinterFlowParserScheduler.WinterFlowBackendCacheManager : j3, (i & 8) != 0 ? WinterFlowParserScheduler.WinterFlowTransactionAgent : j4, (i & 16) != 0 ? WinterFlowParserScheduler.WinterFlowVariableVersionControl : j5, j6, (i & 64) != 0 ? WinterFlowParserScheduler.WinterFlowServiceUtility : j7, (i & 128) != 0 ? WinterFlowParserScheduler.WinterFlowConfigurationSubsystem : j8, (i & 256) != 0 ? WinterFlowParserScheduler.WinterFlowBandwidthObject : j9, j10, (i & 1024) != 0 ? WinterFlowParserScheduler.WinterFlowBatchUI : j11, (i & 2048) != 0 ? WinterFlowParserScheduler.WinterFlowUIMiddleware : j12, (i & 4096) != 0 ? WinterFlowParserScheduler.WinterFlowRouterAdapter : j13, (i & 8192) != 0 ? WinterFlowParserScheduler.WinterFlowRouterStructure : j14, (i & 16384) != 0 ? WinterFlowParserScheduler.WinterFlowUnitTestResponse : j15, (i & 32768) != 0 ? WinterFlowParserScheduler.WinterFlowPackageIDE : j16, (65536 & i) != 0 ? WinterFlowParserScheduler.WinterFlowSingletonPlatform : j17, (131072 & i) != 0 ? WinterFlowParserScheduler.WinterFlowCloudMicroservice : j18, (262144 & i) != 0 ? WinterFlowParserScheduler.WinterFlowVariableBandwidth : j19, (524288 & i) != 0 ? j : j20, (1048576 & i) != 0 ? WinterFlowParserScheduler.WinterFlowTransactionManagerStrategy : j21, (2097152 & i) != 0 ? WinterFlowParserScheduler.WinterFlowArrayNetwork : j22, WinterFlowParserScheduler.WinterFlowHookDataSource, WinterFlowParserScheduler.WinterFlowRouterRouter, WinterFlowParserScheduler.WinterFlowCacheManagerAgent, WinterFlowParserScheduler.WinterFlowSyntax, (67108864 & i) != 0 ? WinterFlowParserScheduler.WinterFlowResolverController : j23, (134217728 & i) != 0 ? WinterFlowParserScheduler.WinterFlowConsumerUserManager : j24, (268435456 & i) != 0 ? WinterFlowParserScheduler.WinterFlowCompilerVariable : j25, (536870912 & i) != 0 ? WinterFlowParserScheduler.WinterFlowSoftwareProtocol : j26, (i2 & 8) != 0 ? WinterFlowParserScheduler.WinterFlowFrontendBackend : j32, (1073741824 & i) != 0 ? WinterFlowParserScheduler.WinterFlowUserManagerUserManager : j27, (i & Integer.MIN_VALUE) != 0 ? WinterFlowParserScheduler.WinterFlowSoftwareEngine : j28, (i2 & 1) != 0 ? WinterFlowParserScheduler.WinterFlowSyntaxSubsystem : j29, (i2 & 2) != 0 ? WinterFlowParserScheduler.WinterFlowTestingNode : j30, (i2 & 4) != 0 ? WinterFlowParserScheduler.WinterFlowCompilerHandler : j31, (i2 & 16) != 0 ? WinterFlowParserScheduler.WinterFlowEventEmitterController : j33, (i2 & 32) != 0 ? WinterFlowParserScheduler.WinterFlowArrayHelper : j34, (i2 & 64) != 0 ? WinterFlowParserScheduler.WinterFlowServerProtocol : j35, (i2 & 128) != 0 ? WinterFlowParserScheduler.WinterFlowThreadListener : j36, (i2 & 256) != 0 ? WinterFlowParserScheduler.WinterFlowStrategyTool : j37, (i2 & 512) != 0 ? WinterFlowParserScheduler.WinterFlowCacheManagerListener : j38, (i2 & 1024) != 0 ? WinterFlowParserScheduler.WinterFlowOrchestrationSubsystem : j39, (i2 & 2048) != 0 ? WinterFlowParserScheduler.WinterFlowConcurrencyThread : j40, (i2 & 4096) != 0 ? WinterFlowParserScheduler.WinterFlowQueueService : j41, (i2 & 8192) != 0 ? WinterFlowParserScheduler.WinterFlowCacheTool : j42, (i2 & 16384) != 0 ? WinterFlowParserScheduler.WinterFlowSerializerStructure : j43, (i2 & 32768) != 0 ? WinterFlowParserScheduler.WinterFlowMapperProtocol : j44);
    }
}
