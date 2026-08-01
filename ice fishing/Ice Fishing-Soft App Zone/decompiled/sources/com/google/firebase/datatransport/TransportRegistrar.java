package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.WinterFlowAlgorithmMiddleware;
import com.google.android.datatransport.WinterFlowCacheTransaction;
import com.google.android.datatransport.WinterFlowDataSourceVersion;
import com.google.android.datatransport.WinterFlowDataSourceWebsocket;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowInvokerComponent;
import com.google.android.datatransport.WinterFlowManagerProtocol;
import com.google.android.datatransport.WinterFlowMiddlewareView;
import com.google.android.datatransport.WinterFlowOrchestrationConcurrency;
import com.google.android.datatransport.WinterFlowProxySubsystem;
import com.google.android.datatransport.WinterFlowQueueManager;
import com.google.android.datatransport.WinterFlowValidatorProcess;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WinterFlowMiddlewareView lambda$getComponents$0(WinterFlowDataSourceVersion winterFlowDataSourceVersion) {
        WinterFlowDataSourceWebsocket.WinterFlowHookDataSource((Context) winterFlowDataSourceVersion.WinterFlowRouterStructure(Context.class));
        return WinterFlowDataSourceWebsocket.WinterFlowRouterStructure().WinterFlowCacheManagerAgent(WinterFlowCacheTransaction.WinterFlowTransactionManagerStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WinterFlowMiddlewareView lambda$getComponents$1(WinterFlowDataSourceVersion winterFlowDataSourceVersion) {
        WinterFlowDataSourceWebsocket.WinterFlowHookDataSource((Context) winterFlowDataSourceVersion.WinterFlowRouterStructure(Context.class));
        return WinterFlowDataSourceWebsocket.WinterFlowRouterStructure().WinterFlowCacheManagerAgent(WinterFlowCacheTransaction.WinterFlowTransactionManagerStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WinterFlowMiddlewareView lambda$getComponents$2(WinterFlowDataSourceVersion winterFlowDataSourceVersion) {
        WinterFlowDataSourceWebsocket.WinterFlowHookDataSource((Context) winterFlowDataSourceVersion.WinterFlowRouterStructure(Context.class));
        return WinterFlowDataSourceWebsocket.WinterFlowRouterStructure().WinterFlowCacheManagerAgent(WinterFlowCacheTransaction.WinterFlowVariableVersionControl);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<WinterFlowQueueManager> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowMiddlewareView.class));
        for (Class cls : new Class[0]) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(cls, "Null interface");
            hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls));
        }
        WinterFlowOrchestrationConcurrency WinterFlowRouterStructure = WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(Context.class);
        if (hashSet.contains(WinterFlowRouterStructure.WinterFlowRouterStructure)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(WinterFlowRouterStructure);
        WinterFlowQueueManager winterFlowQueueManager = new WinterFlowQueueManager(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new WinterFlowEventEmitterOrchestration(23), hashSet3);
        WinterFlowProxySubsystem WinterFlowRouterStructure2 = WinterFlowQueueManager.WinterFlowRouterStructure(new WinterFlowValidatorProcess(WinterFlowManagerProtocol.class, WinterFlowMiddlewareView.class));
        WinterFlowRouterStructure2.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(Context.class));
        WinterFlowRouterStructure2.WinterFlowTransactionManagerStrategy = new WinterFlowEventEmitterOrchestration(24);
        WinterFlowQueueManager WinterFlowHookDataSource = WinterFlowRouterStructure2.WinterFlowHookDataSource();
        WinterFlowProxySubsystem WinterFlowRouterStructure3 = WinterFlowQueueManager.WinterFlowRouterStructure(new WinterFlowValidatorProcess(WinterFlowAlgorithmMiddleware.class, WinterFlowMiddlewareView.class));
        WinterFlowRouterStructure3.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(Context.class));
        WinterFlowRouterStructure3.WinterFlowTransactionManagerStrategy = new WinterFlowEventEmitterOrchestration(25);
        return Arrays.asList(winterFlowQueueManager, WinterFlowHookDataSource, WinterFlowRouterStructure3.WinterFlowHookDataSource(), WinterFlowInvokerComponent.WinterFlowSingletonPlatform(LIBRARY_NAME, "18.2.0"));
    }
}
