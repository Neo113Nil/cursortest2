package com.google.android.datatransport;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibrarySessionManager implements WinterFlowDecoratorVersion, WinterFlowProviderCacheManager, WinterFlowModuleDataSource, WinterFlowExceptionProxy {
    public final String WinterFlowResponseEngine;
    public WinterFlowDatabaseProtocol WinterFlowRouterRouter;
    public final WinterFlowListenerProcess WinterFlowServerProtocol = new WinterFlowListenerProcess(this);
    public final WinterFlowPackageLayer WinterFlowSyntax;
    public final Bundle WinterFlowTransactionAgent;
    public WinterFlowServerLayer WinterFlowTransactionManagerStrategy;
    public final Bundle WinterFlowUnitTestResponse;
    public final WinterFlowUIMiddleware WinterFlowVariableVersionControl;

    public WinterFlowLibrarySessionManager(WinterFlowUIMiddleware winterFlowUIMiddleware, WinterFlowServerLayer winterFlowServerLayer, Bundle bundle, WinterFlowDatabaseProtocol winterFlowDatabaseProtocol, WinterFlowPackageLayer winterFlowPackageLayer, String str, Bundle bundle2) {
        this.WinterFlowVariableVersionControl = winterFlowUIMiddleware;
        this.WinterFlowTransactionManagerStrategy = winterFlowServerLayer;
        this.WinterFlowUnitTestResponse = bundle;
        this.WinterFlowRouterRouter = winterFlowDatabaseProtocol;
        this.WinterFlowSyntax = winterFlowPackageLayer;
        this.WinterFlowResponseEngine = str;
        this.WinterFlowTransactionAgent = bundle2;
        new WinterFlowRendererNode(new WinterFlowAPISystem(7, this));
    }

    @Override // com.google.android.datatransport.WinterFlowModuleDataSource
    public final WinterFlowUserManagerUserManager WinterFlowArrayNetwork() {
        return this.WinterFlowServerProtocol.WinterFlowServerProtocol;
    }

    public final void WinterFlowCacheManagerAgent(WinterFlowDatabaseProtocol winterFlowDatabaseProtocol) {
        WinterFlowListenerProcess winterFlowListenerProcess = this.WinterFlowServerProtocol;
        winterFlowListenerProcess.getClass();
        winterFlowListenerProcess.WinterFlowTransactionAgent = winterFlowDatabaseProtocol;
        winterFlowListenerProcess.WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionProxy
    public final WinterFlowAlgorithmArray WinterFlowHookDataSource() {
        return (WinterFlowAlgorithmArray) this.WinterFlowServerProtocol.WinterFlowRouterRouter.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowProviderCacheManager
    public final WinterFlowScriptManager WinterFlowTransactionManagerStrategy() {
        WinterFlowListenerProcess winterFlowListenerProcess = this.WinterFlowServerProtocol;
        if (!winterFlowListenerProcess.WinterFlowSyntax) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (winterFlowListenerProcess.WinterFlowResponseEngine.WinterFlowSyntax == WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        WinterFlowPackageLayer winterFlowPackageLayer = winterFlowListenerProcess.WinterFlowVariableVersionControl;
        if (winterFlowPackageLayer == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = winterFlowListenerProcess.WinterFlowTransactionManagerStrategy;
        LinkedHashMap linkedHashMap = winterFlowPackageLayer.WinterFlowHookDataSource;
        WinterFlowScriptManager winterFlowScriptManager = (WinterFlowScriptManager) linkedHashMap.get(str);
        if (winterFlowScriptManager != null) {
            return winterFlowScriptManager;
        }
        WinterFlowScriptManager winterFlowScriptManager2 = new WinterFlowScriptManager();
        linkedHashMap.put(str, winterFlowScriptManager2);
        return winterFlowScriptManager2;
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorVersion
    public final WinterFlowDatabaseUtility WinterFlowUnitTestResponse() {
        return this.WinterFlowServerProtocol.WinterFlowResponseEngine;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // com.google.android.datatransport.WinterFlowModuleDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowEventEmitterHelper WinterFlowVariableVersionControl() {
        Application application;
        Application application2;
        WinterFlowListenerProcess winterFlowListenerProcess = this.WinterFlowServerProtocol;
        winterFlowListenerProcess.getClass();
        WinterFlowServiceProviderThreadPool winterFlowServiceProviderThreadPool = new WinterFlowServiceProviderThreadPool(0);
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowCloudStack.WinterFlowArrayNetwork;
        WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = winterFlowListenerProcess.WinterFlowRouterStructure;
        LinkedHashMap linkedHashMap = winterFlowServiceProviderThreadPool.WinterFlowRouterStructure;
        linkedHashMap.put(winterFlowThreadPoolProcess, winterFlowLibrarySessionManager);
        linkedHashMap.put(WinterFlowCloudStack.WinterFlowVariableVersionControl, winterFlowLibrarySessionManager);
        Bundle WinterFlowRouterStructure = winterFlowListenerProcess.WinterFlowRouterStructure();
        if (WinterFlowRouterStructure != null) {
            linkedHashMap.put(WinterFlowCloudStack.WinterFlowTransactionManagerStrategy, WinterFlowRouterStructure);
        }
        WinterFlowUIMiddleware winterFlowUIMiddleware = this.WinterFlowVariableVersionControl;
        if (winterFlowUIMiddleware != null) {
            Context context = winterFlowUIMiddleware.WinterFlowRouterStructure;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(WinterFlowResponseTransactionManager.WinterFlowArrayNetwork, application2);
                }
                return winterFlowServiceProviderThreadPool;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return winterFlowServiceProviderThreadPool;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof WinterFlowLibrarySessionManager)) {
            WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj;
            Bundle bundle = winterFlowLibrarySessionManager.WinterFlowUnitTestResponse;
            if (!this.WinterFlowResponseEngine.equals(winterFlowLibrarySessionManager.WinterFlowResponseEngine) || !WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy) || this.WinterFlowServerProtocol.WinterFlowResponseEngine != winterFlowLibrarySessionManager.WinterFlowServerProtocol.WinterFlowResponseEngine || WinterFlowHookDataSource() != winterFlowLibrarySessionManager.WinterFlowHookDataSource()) {
                return false;
            }
            Bundle bundle2 = this.WinterFlowUnitTestResponse;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                Set<String> set = keySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.WinterFlowTransactionManagerStrategy.hashCode() + (this.WinterFlowResponseEngine.hashCode() * 31);
        Bundle bundle = this.WinterFlowUnitTestResponse;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return WinterFlowHookDataSource().hashCode() + ((this.WinterFlowServerProtocol.WinterFlowResponseEngine.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.WinterFlowServerProtocol.toString();
    }
}
