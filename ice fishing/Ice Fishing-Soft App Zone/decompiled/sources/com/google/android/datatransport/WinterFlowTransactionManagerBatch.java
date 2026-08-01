package com.google.android.datatransport;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerBatch extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowBackendEventEmitter WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowTransactionManagerBatch(WinterFlowBackendEventEmitter winterFlowBackendEventEmitter, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowBackendEventEmitter;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = winterFlowBackendEventEmitter.WinterFlowRouterRouter;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                WinterFlowWebsocketTransactionManager winterFlowWebsocketTransactionManager = (WinterFlowWebsocketTransactionManager) obj;
                if (winterFlowWebsocketTransactionManager.WinterFlowTransactionManagerStrategy.contains(winterFlowWebsocketTransactionManager)) {
                    WinterFlowServiceProviderTransactionManager snapshotObserver = winterFlowBackendEventEmitter.WinterFlowRouterRouter.getSnapshotObserver();
                    snapshotObserver.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowWebsocketTransactionManager, winterFlowBackendEventEmitter.WinterFlowQueueService, new WinterFlowJavaSession(1, winterFlowWebsocketTransactionManager, winterFlowBackendEventEmitter));
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }
}
