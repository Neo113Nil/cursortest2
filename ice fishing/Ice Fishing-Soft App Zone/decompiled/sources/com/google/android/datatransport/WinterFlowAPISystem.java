package com.google.android.datatransport;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.adjust.sdk.AdjustConfig;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.db.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowAPISystem implements WinterFlowObjectUI {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowAPISystem(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i;
        int i2 = this.WinterFlowVariableVersionControl;
        boolean z = true;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowUnitTestLibrary.WinterFlowArrayHelper((WinterFlowRequestComponent) obj);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                return new WinterFlowDatabaseSchemaAlgorithm((AppDatabase_Impl) obj);
            case 2:
                return ((WinterFlowAlgorithmArray) obj).WinterFlowHookDataSource(":memory:");
            case 3:
                WinterFlowHandlerNetwork winterFlowHandlerNetwork = (WinterFlowHandlerNetwork) obj;
                Context context = winterFlowHandlerNetwork.WinterFlowVariableVersionControl;
                String str = winterFlowHandlerNetwork.WinterFlowTransactionManagerStrategy;
                WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(17, false);
                winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy = null;
                WinterFlowProvider winterFlowProvider = new WinterFlowProvider(context, str, winterFlowConfigurationModule, winterFlowHandlerNetwork.WinterFlowUnitTestResponse);
                winterFlowProvider.setWriteAheadLoggingEnabled(winterFlowHandlerNetwork.WinterFlowSyntax);
                return winterFlowProvider;
            case 4:
                AppDatabase_Impl appDatabase_Impl = ((WinterFlowResponseConfiguration) obj).WinterFlowRouterStructure;
                return Boolean.valueOf(!appDatabase_Impl.WinterFlowUnitTestResponse() || appDatabase_Impl.WinterFlowSyntax());
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((WinterFlowNetworkSession) obj).WinterFlowUnitTestResponse().WinterFlowServiceUtility);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                Activity activity = (Activity) obj;
                if (activity != null) {
                    activity.finish();
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowListenerProcess winterFlowListenerProcess = ((WinterFlowLibrarySessionManager) obj).WinterFlowServerProtocol;
                if (!winterFlowListenerProcess.WinterFlowSyntax) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (winterFlowListenerProcess.WinterFlowResponseEngine.WinterFlowSyntax == WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = winterFlowListenerProcess.WinterFlowRouterStructure;
                WinterFlowUserManagerUserManager winterFlowUserManagerUserManager = (WinterFlowUserManagerUserManager) winterFlowListenerProcess.WinterFlowThreadListener.getValue();
                WinterFlowEventEmitterHelper WinterFlowArrayNetwork = WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(winterFlowLibrarySessionManager);
                winterFlowUserManagerUserManager.getClass();
                WinterFlowArrayNetwork.getClass();
                WinterFlowStackProvider winterFlowStackProvider = new WinterFlowStackProvider(winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy(), winterFlowUserManagerUserManager, WinterFlowArrayNetwork);
                WinterFlowEventEmitterCacheManager WinterFlowRouterStructure = WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowEncryptionInheritance.class);
                String WinterFlowHookDataSource = WinterFlowRouterStructure.WinterFlowHookDataSource();
                if (WinterFlowHookDataSource != null) {
                    return ((WinterFlowEncryptionInheritance) winterFlowStackProvider.WinterFlowConcurrencyThread(WinterFlowRouterStructure, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(WinterFlowHookDataSource))).WinterFlowHookDataSource;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Local and anonymous classes can not be ViewModels");
                return null;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return new WinterFlowPackageStructure((String) obj);
            case 9:
                return WinterFlowCacheRuntime.WinterFlowBandwidthObject((Context) obj);
            case 10:
                List list = (List) ((WinterFlowBatchCacheManager) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowLibrarySessionManager) obj2).WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 11:
                return new WinterFlowDatabaseVersionControl((WinterFlowViewRenderer) obj);
            case 12:
                WinterFlowConfigurationLayer winterFlowConfigurationLayer = (WinterFlowConfigurationLayer) obj;
                return winterFlowConfigurationLayer.WinterFlowVariableVersionControl.WinterFlowHookDataSource(winterFlowConfigurationLayer.WinterFlowTransactionManagerStrategy);
            case 13:
                float floatValue = ((Number) ((WinterFlowObjectUI) obj).WinterFlowRouterStructure()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return Float.valueOf(floatValue);
            case 14:
                WinterFlowEventFramework winterFlowEventFramework = (WinterFlowEventFramework) obj;
                return new AdjustConfig(winterFlowEventFramework.WinterFlowRouterStructure, winterFlowEventFramework.WinterFlowCacheManagerAgent, AdjustConfig.ENVIRONMENT_PRODUCTION);
            case 15:
                WinterFlowWebsocketPipeline winterFlowWebsocketPipeline = (WinterFlowWebsocketPipeline) obj;
                WinterFlowLoaderConsumer winterFlowLoaderConsumer = winterFlowWebsocketPipeline.WinterFlowVariableVersionControl;
                Object obj3 = winterFlowWebsocketPipeline.WinterFlowRouterRouter;
                if (obj3 != null) {
                    return winterFlowLoaderConsumer.WinterFlowHookDataSource(winterFlowWebsocketPipeline, obj3);
                }
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Value should be initialized");
                return null;
            case 16:
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = ((WinterFlowTransactionManagerEventEmitter) obj).WinterFlowUnitTestResponse;
                if (winterFlowCacheManagerVersionControl == null) {
                    return null;
                }
                Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
                winterFlowCacheManagerVersionControl.WinterFlowRouterRouter(WinterFlowOrchestrationSubsystem);
                if (WinterFlowOrchestrationSubsystem.isEmpty()) {
                    return null;
                }
                return WinterFlowOrchestrationSubsystem;
            case 17:
                return WinterFlowCloudStack.WinterFlowArrayHelper((WinterFlowProviderCacheManager) obj);
            case 18:
                WinterFlowExceptionProxy winterFlowExceptionProxy = (WinterFlowExceptionProxy) obj;
                winterFlowExceptionProxy.WinterFlowUnitTestResponse().WinterFlowRouterStructure(new WinterFlowVariableComponent(0, winterFlowExceptionProxy));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 19:
                WinterFlowConcurrencyCache winterFlowConcurrencyCache = (WinterFlowConcurrencyCache) obj;
                WinterFlowSingletonStack winterFlowSingletonStack = (WinterFlowSingletonStack) WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread(winterFlowConcurrencyCache, WinterFlowFrontendTool.WinterFlowRouterStructure);
                winterFlowConcurrencyCache.WinterFlowConfigurationSubsystem = winterFlowSingletonStack;
                winterFlowConcurrencyCache.WinterFlowStrategyTool = winterFlowSingletonStack != null ? new WinterFlowDeploymentException(winterFlowSingletonStack.WinterFlowRouterStructure, winterFlowSingletonStack.WinterFlowHookDataSource, winterFlowSingletonStack.WinterFlowCacheManagerAgent, winterFlowSingletonStack.WinterFlowArrayNetwork) : null;
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 20:
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) obj;
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = winterFlowCacheManagerMicroservice.WinterFlowVariableVersionControl;
                winterFlowCacheManagerMicroservice.WinterFlowTransactionManagerStrategy = winterFlowHandlerInvoker != null ? ((Number) winterFlowHandlerInvoker.WinterFlowServerProtocol.getValue()).longValue() : 0L;
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 21:
                return obj;
            case 22:
                WinterFlowBandwidthUtility winterFlowBandwidthUtility = (WinterFlowBandwidthUtility) obj;
                WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowBandwidthUtility.WinterFlowUnitTestResponse;
                if (((WinterFlowModuleBandwidth) winterFlowResolverSubsystem.getValue()).WinterFlowRouterStructure == 9205357640488583168L || WinterFlowModuleBandwidth.WinterFlowCacheManagerAgent(((WinterFlowModuleBandwidth) winterFlowResolverSubsystem.getValue()).WinterFlowRouterStructure)) {
                    return null;
                }
                return winterFlowBandwidthUtility.WinterFlowVariableVersionControl.WinterFlowCloudMicroservice(((WinterFlowModuleBandwidth) winterFlowResolverSubsystem.getValue()).WinterFlowRouterStructure);
            case 23:
                WinterFlowClassStrategy winterFlowClassStrategy = (WinterFlowClassStrategy) obj;
                while (true) {
                    synchronized (winterFlowClassStrategy.WinterFlowUnitTestResponse) {
                        try {
                            if (!winterFlowClassStrategy.WinterFlowCacheManagerAgent) {
                                winterFlowClassStrategy.WinterFlowCacheManagerAgent = z;
                                try {
                                    WinterFlowJSON winterFlowJSON = winterFlowClassStrategy.WinterFlowTransactionManagerStrategy;
                                    Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
                                    int i3 = winterFlowJSON.WinterFlowUnitTestResponse;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        WinterFlowServiceInvoker winterFlowServiceInvoker = (WinterFlowServiceInvoker) objArr[i4];
                                        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = winterFlowServiceInvoker.WinterFlowUnitTestResponse;
                                        WinterFlowObjectSession winterFlowObjectSession = winterFlowServiceInvoker.WinterFlowRouterStructure;
                                        Object[] objArr2 = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
                                        long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8;
                                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j & 255) < 128) {
                                                            i = i6;
                                                            winterFlowObjectSession.WinterFlowUnitTestResponse(objArr2[(i5 << 3) + i8]);
                                                        } else {
                                                            i = i6;
                                                        }
                                                        j >>= i;
                                                        i8++;
                                                        i6 = i;
                                                    }
                                                    if (i7 != i6) {
                                                    }
                                                }
                                                if (i5 != length) {
                                                    i5++;
                                                }
                                            }
                                        }
                                        winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource();
                                    }
                                    winterFlowClassStrategy.WinterFlowCacheManagerAgent = false;
                                } catch (Throwable th) {
                                    winterFlowClassStrategy.WinterFlowCacheManagerAgent = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!winterFlowClassStrategy.WinterFlowHookDataSource()) {
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    z = true;
                }
            default:
                WinterFlowTestingEngine winterFlowTestingEngine = (WinterFlowTestingEngine) obj;
                winterFlowTestingEngine.WinterFlowCompilerVariable = null;
                WinterFlowFrameworkMechanism.WinterFlowRouterRouter(winterFlowTestingEngine);
                WinterFlowUnitTestLibrary.WinterFlowCompilerVariable(winterFlowTestingEngine);
                WinterFlowUnitTestLibrary.WinterFlowArrayHelper(winterFlowTestingEngine);
                return Boolean.TRUE;
        }
    }
}
