package com.google.android.datatransport;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowRequestPipeline implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRequestPipeline(WinterFlowAdapterInheritance winterFlowAdapterInheritance, WinterFlowInterface winterFlowInterface, WinterFlowAdapterInheritance winterFlowAdapterInheritance2, WinterFlowNetworkWidget winterFlowNetworkWidget) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowTransactionManagerStrategy = winterFlowAdapterInheritance;
        this.WinterFlowRouterRouter = winterFlowInterface;
        this.WinterFlowUnitTestResponse = winterFlowAdapterInheritance2;
        this.WinterFlowSyntax = winterFlowNetworkWidget;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        long j;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowAdapterInheritance winterFlowAdapterInheritance = (WinterFlowAdapterInheritance) this.WinterFlowTransactionManagerStrategy;
                WinterFlowInterface winterFlowInterface = (WinterFlowInterface) this.WinterFlowRouterRouter;
                WinterFlowAdapterInheritance winterFlowAdapterInheritance2 = (WinterFlowAdapterInheritance) this.WinterFlowUnitTestResponse;
                WinterFlowNetworkWidget winterFlowNetworkWidget = (WinterFlowNetworkWidget) this.WinterFlowSyntax;
                WinterFlowRuntimeEngine winterFlowRuntimeEngine = (WinterFlowRuntimeEngine) obj;
                float floatValue = ((Number) winterFlowRuntimeEngine.WinterFlowVariableVersionControl.getValue()).floatValue() - winterFlowAdapterInheritance.WinterFlowVariableVersionControl;
                float WinterFlowRouterStructure = winterFlowInterface.WinterFlowRouterStructure(floatValue);
                winterFlowAdapterInheritance.WinterFlowVariableVersionControl = ((Number) winterFlowRuntimeEngine.WinterFlowVariableVersionControl.getValue()).floatValue();
                winterFlowAdapterInheritance2.WinterFlowVariableVersionControl = ((Number) ((WinterFlowObjectSession) winterFlowRuntimeEngine.WinterFlowRouterStructure.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(winterFlowRuntimeEngine.WinterFlowTransactionManagerStrategy)).floatValue();
                if (Math.abs(floatValue - WinterFlowRouterStructure) > 0.5f) {
                    winterFlowRuntimeEngine.WinterFlowSyntax.setValue(Boolean.FALSE);
                    winterFlowRuntimeEngine.WinterFlowArrayNetwork.WinterFlowRouterStructure();
                }
                winterFlowNetworkWidget.getClass();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                WinterFlowSyntaxMechanism winterFlowSyntaxMechanism = (WinterFlowSyntaxMechanism) this.WinterFlowTransactionManagerStrategy;
                WinterFlowBatchCacheManager winterFlowBatchCacheManager = (WinterFlowBatchCacheManager) this.WinterFlowUnitTestResponse;
                WinterFlowBatchCacheManager winterFlowBatchCacheManager2 = (WinterFlowBatchCacheManager) this.WinterFlowRouterRouter;
                WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) this.WinterFlowSyntax;
                WinterFlowDatabaseSchemaStrategy winterFlowDatabaseSchemaStrategy = (WinterFlowDatabaseSchemaStrategy) obj;
                winterFlowDatabaseSchemaStrategy.getClass();
                WinterFlowServerProtocol winterFlowServerProtocol = WinterFlowJavaManager.WinterFlowResponseEngine;
                winterFlowServerProtocol.getClass();
                Object[] WinterFlowSoftwareEngine = WinterFlowTestingCloud.WinterFlowSoftwareEngine(winterFlowServerProtocol, new WinterFlowJavaManager[0]);
                winterFlowDatabaseSchemaStrategy.WinterFlowRouterStructure(WinterFlowSoftwareEngine.length, null, new WinterFlowServiceRouter(2, WinterFlowSoftwareEngine), new WinterFlowEventTool(-1781742563, true, new WinterFlowStrategyWorker(WinterFlowSoftwareEngine, winterFlowSyntaxMechanism, winterFlowBatchCacheManager, winterFlowBatchCacheManager2, winterFlowThreadPoolGateway)));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 2:
                WinterFlowFrontendMechanism winterFlowFrontendMechanism = (WinterFlowFrontendMechanism) this.WinterFlowTransactionManagerStrategy;
                String str = (String) this.WinterFlowUnitTestResponse;
                String str2 = (String) this.WinterFlowRouterRouter;
                WinterFlowNetworkFramework winterFlowNetworkFramework = (WinterFlowNetworkFramework) this.WinterFlowSyntax;
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) obj;
                if (((String) WinterFlowUnitTestLibrary.WinterFlowResolverController(winterFlowDataSourceSerializer, WinterFlowFrontendMechanism.WinterFlowArrayNetwork, "")).equals(str)) {
                    WinterFlowNetworkFramework WinterFlowCacheManagerAgent = winterFlowFrontendMechanism.WinterFlowCacheManagerAgent(winterFlowDataSourceSerializer, str);
                    if (WinterFlowCacheManagerAgent != null && !WinterFlowCacheManagerAgent.WinterFlowRouterStructure.equals(str2)) {
                        synchronized (winterFlowFrontendMechanism) {
                            winterFlowFrontendMechanism.WinterFlowArrayNetwork(winterFlowDataSourceSerializer, str);
                            HashSet hashSet = new HashSet((Collection) WinterFlowUnitTestLibrary.WinterFlowResolverController(winterFlowDataSourceSerializer, winterFlowNetworkFramework, new HashSet()));
                            hashSet.add(str);
                            winterFlowDataSourceSerializer.WinterFlowArrayNetwork(winterFlowNetworkFramework, hashSet);
                        }
                    }
                } else {
                    WinterFlowNetworkFramework winterFlowNetworkFramework2 = WinterFlowFrontendMechanism.WinterFlowCacheManagerAgent;
                    long longValue = ((Long) WinterFlowUnitTestLibrary.WinterFlowResolverController(winterFlowDataSourceSerializer, winterFlowNetworkFramework2, 0L)).longValue();
                    long j2 = 1;
                    if (longValue + 1 == 30) {
                        synchronized (winterFlowFrontendMechanism) {
                            try {
                                long longValue2 = ((Long) WinterFlowUnitTestLibrary.WinterFlowResolverController(winterFlowDataSourceSerializer, winterFlowNetworkFramework2, 0L)).longValue();
                                String str3 = "";
                                Set hashSet2 = new HashSet();
                                String str4 = null;
                                for (Map.Entry entry : winterFlowDataSourceSerializer.WinterFlowRouterStructure().entrySet()) {
                                    if (entry.getValue() instanceof Set) {
                                        Set<String> set = (Set) entry.getValue();
                                        for (String str5 : set) {
                                            long j3 = j2;
                                            if (str4 != null && str4.compareTo(str5) <= 0) {
                                                j2 = j3;
                                            }
                                            str3 = ((WinterFlowNetworkFramework) entry.getKey()).WinterFlowRouterStructure;
                                            str4 = str5;
                                            hashSet2 = set;
                                            j2 = j3;
                                        }
                                    }
                                    j2 = j2;
                                }
                                j = j2;
                                HashSet hashSet3 = new HashSet(hashSet2);
                                hashSet3.remove(str4);
                                str3.getClass();
                                winterFlowDataSourceSerializer.WinterFlowArrayNetwork(new WinterFlowNetworkFramework(str3), hashSet3);
                                winterFlowNetworkFramework2 = WinterFlowFrontendMechanism.WinterFlowCacheManagerAgent;
                                longValue = longValue2 - j;
                                winterFlowDataSourceSerializer.WinterFlowCacheManagerAgent(winterFlowNetworkFramework2, Long.valueOf(longValue));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        j = 1;
                    }
                    HashSet hashSet4 = new HashSet((Collection) WinterFlowUnitTestLibrary.WinterFlowResolverController(winterFlowDataSourceSerializer, winterFlowNetworkFramework, new HashSet()));
                    hashSet4.add(str);
                    winterFlowDataSourceSerializer.WinterFlowArrayNetwork(winterFlowNetworkFramework, hashSet4);
                    winterFlowDataSourceSerializer.WinterFlowArrayNetwork(winterFlowNetworkFramework2, Long.valueOf(longValue + j));
                    winterFlowDataSourceSerializer.WinterFlowCacheManagerAgent(WinterFlowFrontendMechanism.WinterFlowArrayNetwork, str);
                }
                return null;
            case 3:
                WinterFlowStrategyService winterFlowStrategyService = (WinterFlowStrategyService) this.WinterFlowTransactionManagerStrategy;
                winterFlowStrategyService.WinterFlowCacheManagerAgent = new WinterFlowViewSystem((WinterFlowRouterManager) this.WinterFlowUnitTestResponse, (WinterFlowLibraryAgent) this.WinterFlowRouterRouter, (WinterFlowProviderConcurrency) this.WinterFlowSyntax);
                return new WinterFlowBandwidthSoftware(5, winterFlowStrategyService);
            case 4:
                WinterFlowAdapterInheritance winterFlowAdapterInheritance3 = (WinterFlowAdapterInheritance) this.WinterFlowTransactionManagerStrategy;
                WinterFlowRouterOrchestration winterFlowRouterOrchestration = (WinterFlowRouterOrchestration) this.WinterFlowUnitTestResponse;
                WinterFlowRendererClass winterFlowRendererClass = (WinterFlowRendererClass) this.WinterFlowRouterRouter;
                WinterFlowProcessorStructure winterFlowProcessorStructure = (WinterFlowProcessorStructure) this.WinterFlowSyntax;
                WinterFlowRuntimeEngine winterFlowRuntimeEngine2 = (WinterFlowRuntimeEngine) obj;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowRuntimeEngine2.WinterFlowVariableVersionControl;
                WinterFlowObjectUI winterFlowObjectUI = winterFlowRuntimeEngine2.WinterFlowArrayNetwork;
                WinterFlowResolverSubsystem winterFlowResolverSubsystem2 = winterFlowRuntimeEngine2.WinterFlowSyntax;
                float floatValue2 = ((Number) winterFlowResolverSubsystem.getValue()).floatValue() - winterFlowAdapterInheritance3.WinterFlowVariableVersionControl;
                if (!WinterFlowCloudStack.WinterFlowCacheManagerListener(floatValue2)) {
                    if (!WinterFlowCloudStack.WinterFlowCacheManagerListener(floatValue2 - winterFlowRouterOrchestration.WinterFlowCacheManagerAgent(winterFlowRendererClass, floatValue2))) {
                        winterFlowResolverSubsystem2.setValue(Boolean.FALSE);
                        winterFlowObjectUI.WinterFlowRouterStructure();
                        return winterFlowAlgorithmSession;
                    }
                    winterFlowAdapterInheritance3.WinterFlowVariableVersionControl += floatValue2;
                }
                if (((Boolean) winterFlowProcessorStructure.WinterFlowUnitTestResponse(Float.valueOf(winterFlowAdapterInheritance3.WinterFlowVariableVersionControl))).booleanValue()) {
                    winterFlowResolverSubsystem2.setValue(Boolean.FALSE);
                    winterFlowObjectUI.WinterFlowRouterStructure();
                }
                return winterFlowAlgorithmSession;
            default:
                WinterFlowInterfaceProcessor winterFlowInterfaceProcessor = (WinterFlowInterfaceProcessor) this.WinterFlowTransactionManagerStrategy;
                WinterFlowProcessorProtocol winterFlowProcessorProtocol = (WinterFlowProcessorProtocol) this.WinterFlowUnitTestResponse;
                WinterFlowServerLayer winterFlowServerLayer = (WinterFlowServerLayer) this.WinterFlowRouterRouter;
                Bundle bundle = (Bundle) this.WinterFlowSyntax;
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj;
                winterFlowLibrarySessionManager.getClass();
                winterFlowInterfaceProcessor.WinterFlowVariableVersionControl = true;
                winterFlowProcessorProtocol.WinterFlowRouterStructure(winterFlowServerLayer, bundle, winterFlowLibrarySessionManager, WinterFlowDataSourceEngine.WinterFlowVariableVersionControl);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }

    public /* synthetic */ WinterFlowRequestPipeline(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = obj3;
        this.WinterFlowSyntax = obj4;
    }
}
