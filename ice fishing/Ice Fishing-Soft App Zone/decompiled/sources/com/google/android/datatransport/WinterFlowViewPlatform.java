package com.google.android.datatransport;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowViewPlatform implements Runnable {
    public final /* synthetic */ WinterFlowBackendComponent WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowViewPlatform(WinterFlowBackendComponent winterFlowBackendComponent, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowBackendComponent;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        WinterFlowManagerEvent WinterFlowEventEmitterController;
        WinterFlowManagerEvent WinterFlowUnitTestResponse;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowBackendComponent winterFlowBackendComponent = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowBackendComponent.WinterFlowRouterStructure();
                return;
            case 1:
                Object obj = WinterFlowBackendComponent.WinterFlowServerProtocol;
                synchronized (obj) {
                    try {
                        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = winterFlowBackendComponent.WinterFlowRouterStructure;
                        winterFlowSyntaxEvent.WinterFlowRouterStructure();
                        WinterFlowAlgorithmArray WinterFlowRouterRouter = WinterFlowAlgorithmArray.WinterFlowRouterRouter(winterFlowSyntaxEvent.WinterFlowRouterStructure);
                        try {
                            WinterFlowEventEmitterController = winterFlowBackendComponent.WinterFlowCacheManagerAgent.WinterFlowEventEmitterController();
                            if (WinterFlowRouterRouter != null) {
                                WinterFlowRouterRouter.WinterFlowCompilerVariable();
                            }
                        } catch (Throwable th) {
                            if (WinterFlowRouterRouter != null) {
                                WinterFlowRouterRouter.WinterFlowCompilerVariable();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i2 = WinterFlowEventEmitterController.WinterFlowHookDataSource;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (winterFlowBackendComponent.WinterFlowArrayNetwork.WinterFlowRouterStructure(WinterFlowEventEmitterController)) {
                                WinterFlowUnitTestResponse = winterFlowBackendComponent.WinterFlowHookDataSource(WinterFlowEventEmitterController);
                                synchronized (obj) {
                                    try {
                                        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = winterFlowBackendComponent.WinterFlowRouterStructure;
                                        winterFlowSyntaxEvent2.WinterFlowRouterStructure();
                                        WinterFlowAlgorithmArray WinterFlowRouterRouter2 = WinterFlowAlgorithmArray.WinterFlowRouterRouter(winterFlowSyntaxEvent2.WinterFlowRouterStructure);
                                        try {
                                            winterFlowBackendComponent.WinterFlowCacheManagerAgent.WinterFlowSerializerStructure(WinterFlowUnitTestResponse);
                                            if (WinterFlowRouterRouter2 != null) {
                                                WinterFlowRouterRouter2.WinterFlowCompilerVariable();
                                            }
                                        } catch (Throwable th2) {
                                            if (WinterFlowRouterRouter2 != null) {
                                                WinterFlowRouterRouter2.WinterFlowCompilerVariable();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (winterFlowBackendComponent) {
                                    boolean z = WinterFlowUnitTestResponse.WinterFlowHookDataSource == 4;
                                    String str = WinterFlowUnitTestResponse.WinterFlowRouterStructure;
                                    if (z && !TextUtils.isEmpty(str)) {
                                        if (TextUtils.equals(WinterFlowEventEmitterController.WinterFlowRouterStructure, str)) {
                                            r4 = !(WinterFlowEventEmitterController.WinterFlowHookDataSource == 4);
                                        } else {
                                            r4 = true;
                                        }
                                    }
                                    if (r4) {
                                        Iterator it = winterFlowBackendComponent.WinterFlowResponseEngine.iterator();
                                        while (it.hasNext()) {
                                            FirebaseMessaging firebaseMessaging = ((WinterFlowProcessorLayer) it.next()).WinterFlowRouterStructure;
                                            if (firebaseMessaging.WinterFlowArrayNetwork() != null) {
                                                synchronized (firebaseMessaging) {
                                                    if (!firebaseMessaging.WinterFlowTransactionAgent) {
                                                        firebaseMessaging.WinterFlowUnitTestResponse(0L);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (WinterFlowUnitTestResponse.WinterFlowHookDataSource == 4) {
                                    String str2 = WinterFlowUnitTestResponse.WinterFlowRouterStructure;
                                    synchronized (winterFlowBackendComponent) {
                                        winterFlowBackendComponent.WinterFlowSyntax = str2;
                                    }
                                }
                                int i3 = WinterFlowUnitTestResponse.WinterFlowHookDataSource;
                                if (i3 == 5) {
                                    winterFlowBackendComponent.WinterFlowRouterRouter(new WinterFlowRequestEntity());
                                    return;
                                } else if (i3 == 2 || i3 == 1) {
                                    winterFlowBackendComponent.WinterFlowRouterRouter(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    winterFlowBackendComponent.WinterFlowSyntax(WinterFlowUnitTestResponse);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    WinterFlowUnitTestResponse = winterFlowBackendComponent.WinterFlowUnitTestResponse(WinterFlowEventEmitterController);
                    synchronized (obj) {
                    }
                } catch (WinterFlowRequestEntity e) {
                    winterFlowBackendComponent.WinterFlowRouterRouter(e);
                    return;
                }
                break;
            default:
                winterFlowBackendComponent.WinterFlowRouterStructure();
                return;
        }
    }
}
