package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowServerSingleton extends WinterFlowDatabaseSchemaPipeline implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowServerProtocol;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowServerSingleton(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.WinterFlowServerProtocol = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        boolean WinterFlowRouterStructure;
        boolean WinterFlowRouterStructure2;
        int i = this.WinterFlowServerProtocol;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        int i2 = 4;
        WinterFlowDatabaseServer winterFlowDatabaseServer = null;
        Object[] objArr = 0;
        Object obj3 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowProtocolCache winterFlowProtocolCache = (WinterFlowProtocolCache) obj;
                WinterFlowProtocolCache winterFlowProtocolCache2 = (WinterFlowProtocolCache) obj2;
                WinterFlowProviderWidget winterFlowProviderWidget = (WinterFlowProviderWidget) obj3;
                if (winterFlowProviderWidget.WinterFlowSingletonPlatform && (WinterFlowRouterStructure = winterFlowProtocolCache2.WinterFlowRouterStructure()) != winterFlowProtocolCache.WinterFlowRouterStructure()) {
                    if (WinterFlowRouterStructure) {
                        WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                        WinterFlowQuerySyntax.WinterFlowMapperProtocol(winterFlowProviderWidget, new WinterFlowJavaSession(i2, winterFlowBandwidthCache, winterFlowProviderWidget));
                        WinterFlowDatabaseServer winterFlowDatabaseServer2 = (WinterFlowDatabaseServer) winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                        if (winterFlowDatabaseServer2 != null) {
                            winterFlowDatabaseServer2.WinterFlowRouterStructure();
                            winterFlowDatabaseServer = winterFlowDatabaseServer2;
                        }
                        winterFlowProviderWidget.WinterFlowSerializerStructure = winterFlowDatabaseServer;
                    } else {
                        WinterFlowDatabaseServer winterFlowDatabaseServer3 = winterFlowProviderWidget.WinterFlowSerializerStructure;
                        if (winterFlowDatabaseServer3 != null) {
                            winterFlowDatabaseServer3.WinterFlowHookDataSource();
                        }
                        winterFlowProviderWidget.WinterFlowSerializerStructure = null;
                    }
                }
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowProtocolCache winterFlowProtocolCache3 = (WinterFlowProtocolCache) obj;
                WinterFlowProtocolCache winterFlowProtocolCache4 = (WinterFlowProtocolCache) obj2;
                WinterFlowDeploymentMechanism winterFlowDeploymentMechanism = (WinterFlowDeploymentMechanism) obj3;
                if (winterFlowDeploymentMechanism.WinterFlowSingletonPlatform && (WinterFlowRouterStructure2 = winterFlowProtocolCache4.WinterFlowRouterStructure()) != winterFlowProtocolCache3.WinterFlowRouterStructure()) {
                    WinterFlowFrameworkCache winterFlowFrameworkCache = winterFlowDeploymentMechanism.WinterFlowSerializerStructure;
                    if (winterFlowFrameworkCache != null) {
                        winterFlowFrameworkCache.WinterFlowUnitTestResponse(Boolean.valueOf(WinterFlowRouterStructure2));
                    }
                    WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowStrategyInvoker.WinterFlowVariableBandwidth;
                    if (WinterFlowRouterStructure2) {
                        WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowDeploymentMechanism.WinterFlowModuleService(), null, new WinterFlowGatewayWorker((Object) winterFlowDeploymentMechanism, (WinterFlowTransactionManagerLayer) (objArr == true ? 1 : 0), 2), 3);
                        WinterFlowBandwidthCache winterFlowBandwidthCache2 = new WinterFlowBandwidthCache();
                        WinterFlowQuerySyntax.WinterFlowMapperProtocol(winterFlowDeploymentMechanism, new WinterFlowRepositoryLayer(i2, winterFlowBandwidthCache2, winterFlowDeploymentMechanism));
                        WinterFlowDatabaseServer winterFlowDatabaseServer4 = (WinterFlowDatabaseServer) winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                        if (winterFlowDatabaseServer4 != null) {
                            winterFlowDatabaseServer4.WinterFlowRouterStructure();
                        } else {
                            winterFlowDatabaseServer4 = null;
                        }
                        winterFlowDeploymentMechanism.WinterFlowResolverController = winterFlowDatabaseServer4;
                        WinterFlowUIMicroservice winterFlowUIMicroservice = winterFlowDeploymentMechanism.WinterFlowConsumerUserManager;
                        if (winterFlowUIMicroservice != null && winterFlowUIMicroservice.WinterFlowInheritanceJava().WinterFlowSingletonPlatform && winterFlowDeploymentMechanism.WinterFlowSingletonPlatform) {
                            WinterFlowWorkerVersionControl.WinterFlowHookDataSource(winterFlowDeploymentMechanism, winterFlowThreadPoolProcess);
                        }
                    } else {
                        WinterFlowDatabaseServer winterFlowDatabaseServer5 = winterFlowDeploymentMechanism.WinterFlowResolverController;
                        if (winterFlowDatabaseServer5 != null) {
                            winterFlowDatabaseServer5.WinterFlowHookDataSource();
                        }
                        winterFlowDeploymentMechanism.WinterFlowResolverController = null;
                        if (winterFlowDeploymentMechanism.WinterFlowSingletonPlatform) {
                            WinterFlowWorkerVersionControl.WinterFlowHookDataSource(winterFlowDeploymentMechanism, winterFlowThreadPoolProcess);
                        }
                    }
                    WinterFlowFrameworkMechanism.WinterFlowRouterRouter(winterFlowDeploymentMechanism);
                    WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowDeploymentMechanism.WinterFlowRouterAdapter;
                    if (winterFlowJSONDecorator != null) {
                        WinterFlowArrayTesting winterFlowArrayTesting = winterFlowDeploymentMechanism.WinterFlowMapperProtocol;
                        if (WinterFlowRouterStructure2) {
                            if (winterFlowArrayTesting != null) {
                                winterFlowDeploymentMechanism.WinterFlowServerStack(winterFlowJSONDecorator, new WinterFlowUINetwork(winterFlowArrayTesting));
                                winterFlowDeploymentMechanism.WinterFlowMapperProtocol = null;
                            }
                            WinterFlowArrayTesting winterFlowArrayTesting2 = new WinterFlowArrayTesting();
                            winterFlowDeploymentMechanism.WinterFlowServerStack(winterFlowJSONDecorator, winterFlowArrayTesting2);
                            winterFlowDeploymentMechanism.WinterFlowMapperProtocol = winterFlowArrayTesting2;
                        } else if (winterFlowArrayTesting != null) {
                            winterFlowDeploymentMechanism.WinterFlowServerStack(winterFlowJSONDecorator, new WinterFlowUINetwork(winterFlowArrayTesting));
                            winterFlowDeploymentMechanism.WinterFlowMapperProtocol = null;
                        }
                    }
                }
                return winterFlowAlgorithmSession;
            case 2:
                return WinterFlowTestingCloud.WinterFlowSyntax((WinterFlowCloudFramework) obj3, (WinterFlowObjectSession) obj, (WinterFlowTransactionManagerLayer) obj2);
            default:
                return WinterFlowTestingCloud.WinterFlowSyntax((WinterFlowCloudFramework) obj3, (WinterFlowObjectSession) obj, (WinterFlowTransactionManagerLayer) obj2);
        }
    }
}
