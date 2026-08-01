package com.google.android.datatransport;

import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowVariableVersionControl implements Runnable {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowVariableVersionControl(WinterFlowDatabaseSchemaBatch winterFlowDatabaseSchemaBatch, WinterFlowViewNode winterFlowViewNode, WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration, WinterFlowObjectFrontend winterFlowObjectFrontend) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaBatch;
        this.WinterFlowUnitTestResponse = winterFlowViewNode;
        this.WinterFlowRouterRouter = winterFlowObjectFrontend;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDatabaseSchemaBatch winterFlowDatabaseSchemaBatch = (WinterFlowDatabaseSchemaBatch) this.WinterFlowTransactionManagerStrategy;
                WinterFlowViewNode winterFlowViewNode = (WinterFlowViewNode) this.WinterFlowUnitTestResponse;
                String str = winterFlowViewNode.WinterFlowRouterStructure;
                WinterFlowObjectFrontend winterFlowObjectFrontend = (WinterFlowObjectFrontend) this.WinterFlowRouterRouter;
                winterFlowDatabaseSchemaBatch.getClass();
                Logger logger = WinterFlowDatabaseSchemaBatch.WinterFlowTransactionManagerStrategy;
                try {
                    WinterFlowServiceProviderGateway WinterFlowRouterStructure = winterFlowDatabaseSchemaBatch.WinterFlowCacheManagerAgent.WinterFlowRouterStructure(str);
                    if (WinterFlowRouterStructure == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        winterFlowDatabaseSchemaBatch.WinterFlowVariableVersionControl.WinterFlowThreadListener(new WinterFlowTransactionManagerPlatform(winterFlowDatabaseSchemaBatch, winterFlowViewNode, ((WinterFlowDebugDeployment) WinterFlowRouterStructure).WinterFlowRouterStructure(winterFlowObjectFrontend), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 1:
                WinterFlowEventWorker winterFlowEventWorker = (WinterFlowEventWorker) this.WinterFlowTransactionManagerStrategy;
                WinterFlowQuerySyntax winterFlowQuerySyntax = (WinterFlowQuerySyntax) this.WinterFlowUnitTestResponse;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.WinterFlowRouterRouter;
                try {
                    WinterFlowMiddlewareSystem WinterFlowThreadListener = WinterFlowServerManager.WinterFlowThreadListener(winterFlowEventWorker.WinterFlowRouterStructure);
                    if (WinterFlowThreadListener == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    WinterFlowOrchestrationHandler winterFlowOrchestrationHandler = (WinterFlowOrchestrationHandler) ((WinterFlowObjectServiceProvider) WinterFlowThreadListener.WinterFlowHookDataSource);
                    synchronized (winterFlowOrchestrationHandler.WinterFlowCacheManagerAgent) {
                        winterFlowOrchestrationHandler.WinterFlowVariableVersionControl = threadPoolExecutor;
                    }
                    ((WinterFlowObjectServiceProvider) WinterFlowThreadListener.WinterFlowHookDataSource).WinterFlowRouterStructure(new WinterFlowSessionPlatform(winterFlowQuerySyntax, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    winterFlowQuerySyntax.WinterFlowResolverController(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.WinterFlowTransactionManagerStrategy;
                Intent intent = (Intent) this.WinterFlowUnitTestResponse;
                WinterFlowArrayEngine winterFlowArrayEngine = (WinterFlowArrayEngine) this.WinterFlowRouterRouter;
                int i = EnhancedIntentService.WinterFlowResponseEngine;
                try {
                    enhancedIntentService.WinterFlowCacheManagerAgent(intent);
                    return;
                } finally {
                    winterFlowArrayEngine.WinterFlowRouterStructure(null);
                }
        }
    }

    public /* synthetic */ WinterFlowVariableVersionControl(Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = obj3;
    }
}
