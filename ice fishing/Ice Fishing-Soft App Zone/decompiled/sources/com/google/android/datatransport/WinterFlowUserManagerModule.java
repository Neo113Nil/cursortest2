package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowUserManagerModule implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowUserManagerModule(WinterFlowSyntaxFramework winterFlowSyntaxFramework, WinterFlowJSONRepository winterFlowJSONRepository, WinterFlowConsumerBandwidth winterFlowConsumerBandwidth, WinterFlowRendererClass winterFlowRendererClass) {
        this.WinterFlowVariableVersionControl = 1;
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxFramework;
        this.WinterFlowUnitTestResponse = winterFlowConsumerBandwidth;
        this.WinterFlowRouterRouter = winterFlowRendererClass;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowRouterRouter;
        Object obj3 = this.WinterFlowUnitTestResponse;
        Object obj4 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowRendererRefactoring winterFlowRendererRefactoring = (WinterFlowRendererRefactoring) obj4;
                WinterFlowFunctionSubsystem winterFlowFunctionSubsystem = (WinterFlowFunctionSubsystem) obj3;
                WinterFlowInterfaceProcessor winterFlowInterfaceProcessor = (WinterFlowInterfaceProcessor) obj2;
                WinterFlowRuntimeEngine winterFlowRuntimeEngine = (WinterFlowRuntimeEngine) obj;
                WinterFlowDecoratorUI.WinterFlowCompilerVariable(winterFlowRuntimeEngine, winterFlowRendererRefactoring.WinterFlowCacheManagerAgent);
                WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowRuntimeEngine.WinterFlowVariableVersionControl;
                Object value = winterFlowResolverSubsystem.getValue();
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = winterFlowRendererRefactoring.WinterFlowRouterStructure;
                WinterFlowConfigurationResponse winterFlowConfigurationResponse = winterFlowRendererRefactoring.WinterFlowResponseEngine;
                WinterFlowConfigurationResponse winterFlowConfigurationResponse2 = winterFlowRendererRefactoring.WinterFlowSyntax;
                if (!winterFlowConfigurationResponse2.equals(winterFlowRendererRefactoring.WinterFlowUnitTestResponse) || !winterFlowConfigurationResponse.equals(winterFlowRendererRefactoring.WinterFlowRouterRouter)) {
                    WinterFlowConfigurationResponse winterFlowConfigurationResponse3 = (WinterFlowConfigurationResponse) ((WinterFlowObjectSession) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(value);
                    int WinterFlowHookDataSource = winterFlowConfigurationResponse3.WinterFlowHookDataSource();
                    boolean z = false;
                    for (int i2 = 0; i2 < WinterFlowHookDataSource; i2++) {
                        if (winterFlowConfigurationResponse3.WinterFlowRouterStructure(i2) < winterFlowConfigurationResponse2.WinterFlowRouterStructure(i2) || winterFlowConfigurationResponse3.WinterFlowRouterStructure(i2) > winterFlowConfigurationResponse.WinterFlowRouterStructure(i2)) {
                            winterFlowConfigurationResponse3.WinterFlowVariableVersionControl(WinterFlowDecoratorUI.WinterFlowRouterRouter(winterFlowConfigurationResponse3.WinterFlowRouterStructure(i2), winterFlowConfigurationResponse2.WinterFlowRouterStructure(i2), winterFlowConfigurationResponse.WinterFlowRouterStructure(i2)), i2);
                            z = true;
                        }
                    }
                    if (z) {
                        value = ((WinterFlowObjectSession) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(winterFlowConfigurationResponse3);
                    }
                }
                if (!WinterFlowManagerRequest.WinterFlowThreadListener(value, winterFlowResolverSubsystem.getValue())) {
                    winterFlowRendererRefactoring.WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy.setValue(value);
                    winterFlowFunctionSubsystem.WinterFlowTransactionManagerStrategy.setValue(value);
                    winterFlowRuntimeEngine.WinterFlowSyntax.setValue(Boolean.FALSE);
                    winterFlowRuntimeEngine.WinterFlowArrayNetwork.WinterFlowRouterStructure();
                    winterFlowInterfaceProcessor.WinterFlowVariableVersionControl = true;
                }
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowSyntaxFramework winterFlowSyntaxFramework = (WinterFlowSyntaxFramework) obj4;
                WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) obj3;
                WinterFlowRendererClass winterFlowRendererClass = (WinterFlowRendererClass) obj2;
                float floatValue = ((Float) obj).floatValue();
                float f = winterFlowSyntaxFramework.WinterFlowRouterAdapter ? 1.0f : -1.0f;
                WinterFlowTransactionManagerService winterFlowTransactionManagerService = winterFlowSyntaxFramework.WinterFlowBatchUI;
                long WinterFlowVariableVersionControl = winterFlowTransactionManagerService.WinterFlowVariableVersionControl(winterFlowTransactionManagerService.WinterFlowRouterRouter(f * floatValue));
                WinterFlowTransactionManagerService winterFlowTransactionManagerService2 = winterFlowRendererClass.WinterFlowRouterStructure;
                float WinterFlowUnitTestResponse = winterFlowTransactionManagerService.WinterFlowUnitTestResponse(winterFlowTransactionManagerService.WinterFlowVariableVersionControl(winterFlowTransactionManagerService2.WinterFlowCacheManagerAgent(winterFlowTransactionManagerService2.WinterFlowTransactionAgent, WinterFlowVariableVersionControl, 1))) * f;
                if (Math.abs(WinterFlowUnitTestResponse) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + WinterFlowUnitTestResponse + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    winterFlowConsumerBandwidth.WinterFlowArrayNetwork(cancellationException);
                }
                return winterFlowAlgorithmSession;
            case 2:
                WinterFlowPackageResolver winterFlowPackageResolver = (WinterFlowPackageResolver) obj4;
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj3;
                winterFlowPackageResolver.add(winterFlowLibrarySessionManager);
                return new WinterFlowSessionManagerScript((WinterFlowJavaSubsystem) obj2, winterFlowLibrarySessionManager, winterFlowPackageResolver);
            case 3:
                WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
                winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl = true;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((WinterFlowServiceSyntax) arrayList.get(i3)).WinterFlowHookDataSource(winterFlowDecoratorSessionManager);
                }
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((WinterFlowServiceSyntax) list.get(i4)).WinterFlowHookDataSource(winterFlowDecoratorSessionManager);
                }
                winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl = false;
                winterFlowThreadPoolGateway.getValue();
                return winterFlowAlgorithmSession;
            case 4:
                WinterFlowDecoratorVersion winterFlowDecoratorVersion = (WinterFlowDecoratorVersion) obj4;
                final WinterFlowNetworkStrategy winterFlowNetworkStrategy = (WinterFlowNetworkStrategy) obj3;
                final WinterFlowObjectSession winterFlowObjectSession = (WinterFlowObjectSession) obj2;
                final WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                WinterFlowNodeProtocol winterFlowNodeProtocol = new WinterFlowNodeProtocol() { // from class: com.google.android.datatransport.WinterFlowSessionInvoker
                    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
                    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion2, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
                        int i5 = WinterFlowRequestThread.WinterFlowRouterStructure[winterFlowMicroserviceProcess.ordinal()];
                        WinterFlowBandwidthCache winterFlowBandwidthCache2 = winterFlowBandwidthCache;
                        if (i5 == 1) {
                            winterFlowBandwidthCache2.WinterFlowVariableVersionControl = winterFlowObjectSession.WinterFlowUnitTestResponse(WinterFlowNetworkStrategy.this);
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            WinterFlowMapperFramework winterFlowMapperFramework = (WinterFlowMapperFramework) winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                            if (winterFlowMapperFramework != null) {
                                winterFlowMapperFramework.WinterFlowRouterStructure();
                            }
                            winterFlowBandwidthCache2.WinterFlowVariableVersionControl = null;
                        }
                    }
                };
                winterFlowDecoratorVersion.WinterFlowUnitTestResponse().WinterFlowRouterStructure(winterFlowNodeProtocol);
                return new WinterFlowSessionManagerScript(winterFlowDecoratorVersion, winterFlowNodeProtocol, winterFlowBandwidthCache, 2);
            default:
                WinterFlowDecoratorPlatform winterFlowDecoratorPlatform = (WinterFlowDecoratorPlatform) obj4;
                WinterFlowTransactionManagerEventEmitter winterFlowTransactionManagerEventEmitter = (WinterFlowTransactionManagerEventEmitter) obj2;
                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorPlatform.WinterFlowTransactionManagerStrategy;
                if (winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource(obj3)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("Key ", obj3, " was used multiple times ");
                    return null;
                }
                winterFlowDecoratorPlatform.WinterFlowVariableVersionControl.remove(obj3);
                winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(obj3, winterFlowTransactionManagerEventEmitter);
                return new WinterFlowSessionManagerScript(winterFlowDecoratorPlatform, obj3, winterFlowTransactionManagerEventEmitter, 3);
        }
    }

    public /* synthetic */ WinterFlowUserManagerModule(WinterFlowThreadPoolGateway winterFlowThreadPoolGateway, ArrayList arrayList, List list, boolean z) {
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowTransactionManagerStrategy = winterFlowThreadPoolGateway;
        this.WinterFlowUnitTestResponse = arrayList;
        this.WinterFlowRouterRouter = list;
    }

    public /* synthetic */ WinterFlowUserManagerModule(Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = obj3;
    }
}
