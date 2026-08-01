package com.google.android.datatransport;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionJSON {
    public final WinterFlowObjectPackage WinterFlowCacheManagerAgent;
    public final WinterFlowAdapterUnitTest WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;
    public final WinterFlowValidatorHandler WinterFlowUnitTestResponse;
    public final ScheduledThreadPoolExecutor WinterFlowVariableVersionControl;
    public final WinterFlowUnitTestSystem WinterFlowArrayNetwork = new WinterFlowUnitTestSystem(0);
    public boolean WinterFlowTransactionManagerStrategy = false;

    public WinterFlowFunctionJSON(WinterFlowAdapterUnitTest winterFlowAdapterUnitTest, WinterFlowValidatorHandler winterFlowValidatorHandler, WinterFlowObjectPackage winterFlowObjectPackage, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.WinterFlowHookDataSource = winterFlowAdapterUnitTest;
        this.WinterFlowUnitTestResponse = winterFlowValidatorHandler;
        this.WinterFlowCacheManagerAgent = winterFlowObjectPackage;
        this.WinterFlowRouterStructure = context;
        this.WinterFlowVariableVersionControl = scheduledThreadPoolExecutor;
    }

    public final void WinterFlowCacheManagerAgent(long j) {
        this.WinterFlowVariableVersionControl.schedule(new com.google.firebase.messaging.WinterFlowArrayHandler(this, this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        WinterFlowRouterStructure(true);
    }

    public final boolean WinterFlowHookDataSource() {
        WinterFlowFunctionNetwork WinterFlowRouterStructure;
        while (true) {
            synchronized (this) {
                try {
                    WinterFlowRouterStructure = this.WinterFlowUnitTestResponse.WinterFlowRouterStructure();
                    if (WinterFlowRouterStructure == null) {
                        return true;
                    }
                } finally {
                }
            }
            WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowCacheManagerAgent;
            try {
                String str = WinterFlowRouterStructure.WinterFlowHookDataSource;
                String str2 = WinterFlowRouterStructure.WinterFlowRouterStructure;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        WinterFlowBackendComponent winterFlowBackendComponent = (WinterFlowBackendComponent) ((WinterFlowDatabaseSchemaBandwidth) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy);
                        String str3 = ((WinterFlowDeploymentComponent) WinterFlowObjectPackage.WinterFlowCacheManagerAgent(winterFlowBackendComponent.WinterFlowArrayNetwork())).WinterFlowRouterStructure;
                        ((FirebaseMessaging) winterFlowObjectPackage.WinterFlowRouterRouter).WinterFlowRouterStructure();
                        winterFlowObjectPackage.WinterFlowSingletonPlatform(str2, str3, (String) WinterFlowObjectPackage.WinterFlowCacheManagerAgent(winterFlowBackendComponent.WinterFlowCacheManagerAgent()), "unsubscribe");
                    }
                } else if (str.equals("S")) {
                    WinterFlowBackendComponent winterFlowBackendComponent2 = (WinterFlowBackendComponent) ((WinterFlowDatabaseSchemaBandwidth) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy);
                    String str4 = ((WinterFlowDeploymentComponent) WinterFlowObjectPackage.WinterFlowCacheManagerAgent(winterFlowBackendComponent2.WinterFlowArrayNetwork())).WinterFlowRouterStructure;
                    ((FirebaseMessaging) winterFlowObjectPackage.WinterFlowRouterRouter).WinterFlowRouterStructure();
                    winterFlowObjectPackage.WinterFlowSingletonPlatform(str2, str4, (String) WinterFlowObjectPackage.WinterFlowCacheManagerAgent(winterFlowBackendComponent2.WinterFlowCacheManagerAgent()), "subscribe");
                }
                WinterFlowValidatorHandler winterFlowValidatorHandler = this.WinterFlowUnitTestResponse;
                synchronized (winterFlowValidatorHandler) {
                    WinterFlowObjectPackage winterFlowObjectPackage2 = winterFlowValidatorHandler.WinterFlowRouterStructure;
                    String str5 = WinterFlowRouterStructure.WinterFlowCacheManagerAgent;
                    synchronized (((ArrayDeque) winterFlowObjectPackage2.WinterFlowUnitTestResponse)) {
                        if (((ArrayDeque) winterFlowObjectPackage2.WinterFlowUnitTestResponse).remove(str5)) {
                            ((ScheduledThreadPoolExecutor) winterFlowObjectPackage2.WinterFlowRouterRouter).execute(new WinterFlowServerConcurrency(10, winterFlowObjectPackage2));
                        }
                    }
                }
                synchronized (this.WinterFlowArrayNetwork) {
                    try {
                        String str6 = WinterFlowRouterStructure.WinterFlowCacheManagerAgent;
                        if (this.WinterFlowArrayNetwork.containsKey(str6)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.WinterFlowArrayNetwork.get(str6);
                            WinterFlowArrayEngine winterFlowArrayEngine = (WinterFlowArrayEngine) arrayDeque.poll();
                            if (winterFlowArrayEngine != null) {
                                winterFlowArrayEngine.WinterFlowRouterStructure(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.WinterFlowArrayNetwork.remove(str6);
                            }
                        }
                    } finally {
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    e.getMessage();
                    return false;
                }
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public final synchronized void WinterFlowRouterStructure(boolean z) {
        this.WinterFlowTransactionManagerStrategy = z;
    }
}
