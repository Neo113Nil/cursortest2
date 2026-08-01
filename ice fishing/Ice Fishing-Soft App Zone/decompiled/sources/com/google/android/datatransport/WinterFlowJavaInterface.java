package com.google.android.datatransport;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaInterface implements WinterFlowUserManagerUserManager {
    public final WinterFlowDatabaseUtility WinterFlowArrayNetwork;
    public final Bundle WinterFlowCacheManagerAgent;
    public final WinterFlowResponseTransactionManager WinterFlowHookDataSource;
    public final Application WinterFlowRouterStructure;
    public final WinterFlowAlgorithmArray WinterFlowVariableVersionControl;

    public WinterFlowJavaInterface(Application application, WinterFlowExceptionProxy winterFlowExceptionProxy, Bundle bundle) {
        WinterFlowResponseTransactionManager winterFlowResponseTransactionManager;
        this.WinterFlowVariableVersionControl = winterFlowExceptionProxy.WinterFlowHookDataSource();
        this.WinterFlowArrayNetwork = winterFlowExceptionProxy.WinterFlowUnitTestResponse();
        this.WinterFlowCacheManagerAgent = bundle;
        this.WinterFlowRouterStructure = application;
        if (application != null) {
            winterFlowResponseTransactionManager = WinterFlowResponseTransactionManager.WinterFlowCacheManagerAgent;
            if (winterFlowResponseTransactionManager == null) {
                winterFlowResponseTransactionManager = new WinterFlowResponseTransactionManager(application);
                WinterFlowResponseTransactionManager.WinterFlowCacheManagerAgent = winterFlowResponseTransactionManager;
            }
        } else {
            winterFlowResponseTransactionManager = new WinterFlowResponseTransactionManager(null);
        }
        this.WinterFlowHookDataSource = winterFlowResponseTransactionManager;
    }

    public final WinterFlowTransactionVariable WinterFlowArrayNetwork(Class cls, String str) {
        WinterFlowOrchestrationMapper winterFlowOrchestrationMapper;
        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowArrayNetwork;
        if (winterFlowDatabaseUtility == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = WinterFlowRouterPipeline.class.isAssignableFrom(cls);
        Application application = this.WinterFlowRouterStructure;
        Constructor WinterFlowRouterStructure = (!isAssignableFrom || application == null) ? WinterFlowLibraryModule.WinterFlowRouterStructure(cls, WinterFlowLibraryModule.WinterFlowHookDataSource) : WinterFlowLibraryModule.WinterFlowRouterStructure(cls, WinterFlowLibraryModule.WinterFlowRouterStructure);
        if (WinterFlowRouterStructure == null) {
            if (application != null) {
                return this.WinterFlowHookDataSource.WinterFlowRouterStructure(cls);
            }
            WinterFlowThreadPoolSystem winterFlowThreadPoolSystem = WinterFlowThreadPoolSystem.WinterFlowRouterStructure;
            if (winterFlowThreadPoolSystem == null) {
                winterFlowThreadPoolSystem = new WinterFlowThreadPoolSystem();
                WinterFlowThreadPoolSystem.WinterFlowRouterStructure = winterFlowThreadPoolSystem;
            }
            return winterFlowThreadPoolSystem.WinterFlowRouterStructure(cls);
        }
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = this.WinterFlowVariableVersionControl;
        winterFlowAlgorithmArray.getClass();
        Bundle WinterFlowServiceUtility = winterFlowAlgorithmArray.WinterFlowServiceUtility(str);
        if (WinterFlowServiceUtility == null) {
            WinterFlowServiceUtility = this.WinterFlowCacheManagerAgent;
        }
        if (WinterFlowServiceUtility == null) {
            winterFlowOrchestrationMapper = new WinterFlowOrchestrationMapper();
        } else {
            ClassLoader classLoader = WinterFlowOrchestrationMapper.class.getClassLoader();
            classLoader.getClass();
            WinterFlowServiceUtility.setClassLoader(classLoader);
            WinterFlowDatabaseScript winterFlowDatabaseScript = new WinterFlowDatabaseScript(WinterFlowServiceUtility.size());
            for (String str2 : WinterFlowServiceUtility.keySet()) {
                str2.getClass();
                winterFlowDatabaseScript.put(str2, WinterFlowServiceUtility.get(str2));
            }
            winterFlowOrchestrationMapper = new WinterFlowOrchestrationMapper(winterFlowDatabaseScript.WinterFlowHookDataSource());
        }
        WinterFlowBatchManager winterFlowBatchManager = new WinterFlowBatchManager(str, winterFlowOrchestrationMapper);
        winterFlowBatchManager.WinterFlowRouterRouter(winterFlowAlgorithmArray, winterFlowDatabaseUtility);
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = winterFlowDatabaseUtility.WinterFlowSyntax;
        if (winterFlowDatabaseProtocol == WinterFlowDatabaseProtocol.WinterFlowTransactionManagerStrategy || winterFlowDatabaseProtocol.compareTo(WinterFlowDatabaseProtocol.WinterFlowRouterRouter) >= 0) {
            winterFlowAlgorithmArray.WinterFlowConfigurationSubsystem();
        } else {
            winterFlowDatabaseUtility.WinterFlowRouterStructure(new WinterFlowQueryStructure(1, winterFlowDatabaseUtility, winterFlowAlgorithmArray));
        }
        WinterFlowTransactionVariable WinterFlowHookDataSource = (!isAssignableFrom || application == null) ? WinterFlowLibraryModule.WinterFlowHookDataSource(cls, WinterFlowRouterStructure, winterFlowOrchestrationMapper) : WinterFlowLibraryModule.WinterFlowHookDataSource(cls, WinterFlowRouterStructure, application, winterFlowOrchestrationMapper);
        WinterFlowHookDataSource.WinterFlowRouterStructure("androidx.lifecycle.savedstate.vm.tag", winterFlowBatchManager);
        return WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerUserManager
    public final WinterFlowTransactionVariable WinterFlowCacheManagerAgent(Class cls, WinterFlowServiceProviderThreadPool winterFlowServiceProviderThreadPool) {
        WinterFlowPackageHook winterFlowPackageHook = WinterFlowQuerySyntax.WinterFlowTransactionAgent;
        LinkedHashMap linkedHashMap = winterFlowServiceProviderThreadPool.WinterFlowRouterStructure;
        String str = (String) linkedHashMap.get(winterFlowPackageHook);
        if (str == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(WinterFlowCloudStack.WinterFlowArrayNetwork) == null || linkedHashMap.get(WinterFlowCloudStack.WinterFlowVariableVersionControl) == null) {
            if (this.WinterFlowArrayNetwork != null) {
                return WinterFlowArrayNetwork(cls, str);
            }
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(WinterFlowResponseTransactionManager.WinterFlowArrayNetwork);
        boolean isAssignableFrom = WinterFlowRouterPipeline.class.isAssignableFrom(cls);
        Constructor WinterFlowRouterStructure = (!isAssignableFrom || application == null) ? WinterFlowLibraryModule.WinterFlowRouterStructure(cls, WinterFlowLibraryModule.WinterFlowHookDataSource) : WinterFlowLibraryModule.WinterFlowRouterStructure(cls, WinterFlowLibraryModule.WinterFlowRouterStructure);
        return WinterFlowRouterStructure == null ? this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(cls, winterFlowServiceProviderThreadPool) : (!isAssignableFrom || application == null) ? WinterFlowLibraryModule.WinterFlowHookDataSource(cls, WinterFlowRouterStructure, WinterFlowCloudStack.WinterFlowBandwidthObject(winterFlowServiceProviderThreadPool)) : WinterFlowLibraryModule.WinterFlowHookDataSource(cls, WinterFlowRouterStructure, application, WinterFlowCloudStack.WinterFlowBandwidthObject(winterFlowServiceProviderThreadPool));
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerUserManager
    public final WinterFlowTransactionVariable WinterFlowHookDataSource(WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager, WinterFlowServiceProviderThreadPool winterFlowServiceProviderThreadPool) {
        return WinterFlowCacheManagerAgent(WinterFlowEncryptionSubsystem.WinterFlowConfigurationSubsystem(winterFlowEventEmitterCacheManager), winterFlowServiceProviderThreadPool);
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerUserManager
    public final WinterFlowTransactionVariable WinterFlowRouterStructure(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return WinterFlowArrayNetwork(cls, canonicalName);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public WinterFlowJavaInterface() {
        this.WinterFlowHookDataSource = new WinterFlowResponseTransactionManager(null);
    }
}
