package com.google.android.datatransport;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAPIDataSource extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowAPIDataSource(int i, Object obj, Object obj2) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowAlgorithmSession winterFlowAlgorithmSession;
        switch (this.WinterFlowTransactionManagerStrategy) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowServerHook winterFlowServerHook = (WinterFlowServerHook) this.WinterFlowRouterRouter;
                WinterFlowCompilerServiceProvider winterFlowCompilerServiceProvider = (WinterFlowCompilerServiceProvider) this.WinterFlowUnitTestResponse;
                synchronized (winterFlowServerHook.WinterFlowSyntax) {
                    winterFlowServerHook.WinterFlowTransactionAgent.remove(winterFlowCompilerServiceProvider);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                ((Choreographer) ((WinterFlowPipelineBackend) this.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy).removeFrameCallback((WinterFlowCompilerServiceProvider) this.WinterFlowUnitTestResponse);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 2:
                ((WinterFlowSchedulerStructure) this.WinterFlowRouterRouter).WinterFlowAPIFrontend(((WinterFlowMapperManager) obj).WinterFlowCacheManagerAgent((WinterFlowMapperManager) this.WinterFlowUnitTestResponse));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 3:
                WinterFlowViewTesting winterFlowViewTesting = (WinterFlowViewTesting) this.WinterFlowRouterRouter;
                float WinterFlowRouterRouter = ((WinterFlowBackendUI) this.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent.WinterFlowRouterRouter();
                ((WinterFlowDecoratorSessionManager) obj).WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
                winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent(0L, winterFlowViewTesting.WinterFlowSyntax), WinterFlowRouterRouter, null);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 4:
                WinterFlowDecoratorSessionManager.WinterFlowBatchUI((WinterFlowDecoratorSessionManager) obj, (WinterFlowViewTesting) this.WinterFlowRouterRouter, 0, 0, ((WinterFlowSingletonThread) this.WinterFlowUnitTestResponse).WinterFlowVariableBandwidth, 4);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                WinterFlowTransactionManagerArray winterFlowTransactionManagerArray = (WinterFlowTransactionManagerArray) this.WinterFlowUnitTestResponse;
                if (motionEvent.getActionMasked() == 0) {
                    ((WinterFlowStackProvider) this.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy = ((Boolean) ((WinterFlowDeserializationDatabase) winterFlowTransactionManagerArray.WinterFlowArrayNetwork()).WinterFlowUnitTestResponse(motionEvent)).booleanValue() ? WinterFlowWebsocketProtocol.WinterFlowTransactionManagerStrategy : WinterFlowWebsocketProtocol.WinterFlowUnitTestResponse;
                } else {
                    ((WinterFlowDeserializationDatabase) winterFlowTransactionManagerArray.WinterFlowArrayNetwork()).WinterFlowUnitTestResponse(motionEvent);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                Throwable th = (Throwable) obj;
                ((WinterFlowProviderFramework) this.WinterFlowRouterRouter).WinterFlowUnitTestResponse(th);
                WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = (WinterFlowWorkerThreadPool) ((WinterFlowStackProvider) this.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse;
                winterFlowWorkerThreadPool.WinterFlowCacheManagerAgent(th, false);
                do {
                    Object WinterFlowCompilerVariable = winterFlowWorkerThreadPool.WinterFlowCompilerVariable();
                    if (WinterFlowCompilerVariable instanceof WinterFlowGatewayParser) {
                        WinterFlowCompilerVariable = null;
                    }
                    if (WinterFlowCompilerVariable != null) {
                        ((WinterFlowCacheManagerMiddleware) WinterFlowCompilerVariable).WinterFlowHookDataSource.WinterFlowCacheTool(new WinterFlowSessionManagerSessionManager(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        winterFlowAlgorithmSession = winterFlowAlgorithmSession2;
                    } else {
                        winterFlowAlgorithmSession = null;
                    }
                } while (winterFlowAlgorithmSession != null);
                return winterFlowAlgorithmSession2;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowDecoratorSessionManager.WinterFlowBatchUI((WinterFlowDecoratorSessionManager) obj, (WinterFlowViewTesting) this.WinterFlowRouterRouter, 0, 0, ((WinterFlowUserManagerParser) this.WinterFlowUnitTestResponse).WinterFlowConfigurationSubsystem, 4);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption = (WinterFlowTransactionManagerEncryption) obj;
                WinterFlowEventTool winterFlowEventTool = (WinterFlowEventTool) this.WinterFlowUnitTestResponse;
                WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax = (WinterFlowAlgorithmSyntax) this.WinterFlowRouterRouter;
                if (!winterFlowAlgorithmSyntax.WinterFlowUnitTestResponse) {
                    WinterFlowDecoratorVersion winterFlowDecoratorVersion = winterFlowTransactionManagerEncryption.WinterFlowCacheManagerAgent;
                    View view = winterFlowTransactionManagerEncryption.WinterFlowRouterStructure;
                    WinterFlowDatabaseUtility WinterFlowUnitTestResponse = winterFlowDecoratorVersion.WinterFlowUnitTestResponse();
                    winterFlowAlgorithmSyntax.WinterFlowSyntax = winterFlowEventTool;
                    if (winterFlowAlgorithmSyntax.WinterFlowRouterRouter == null) {
                        if (WinterFlowManagerRequest.WinterFlowThreadListener(Looper.myLooper(), view.getHandler().getLooper())) {
                            winterFlowAlgorithmSyntax.WinterFlowRouterRouter = WinterFlowUnitTestResponse;
                            WinterFlowUnitTestResponse.WinterFlowRouterStructure(winterFlowAlgorithmSyntax);
                        } else {
                            view.post(new WinterFlowControllerManager(12, winterFlowAlgorithmSyntax, WinterFlowUnitTestResponse));
                        }
                    } else if (WinterFlowUnitTestResponse.WinterFlowSyntax.compareTo(WinterFlowDatabaseProtocol.WinterFlowUnitTestResponse) >= 0) {
                        winterFlowAlgorithmSyntax.WinterFlowTransactionManagerStrategy.WinterFlowEventEmitterController(new WinterFlowEventTool(-1723985096, true, new WinterFlowFrontend(winterFlowAlgorithmSyntax, winterFlowTransactionManagerEncryption, winterFlowEventTool)));
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }
}
