package com.google.android.datatransport;

import android.os.StrictMode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowInterfaceSystem implements WinterFlowHookInheritance {
    public final /* synthetic */ int WinterFlowRouterStructure;

    @Override // com.google.android.datatransport.WinterFlowHookInheritance
    public final Object get() {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Collections.EMPTY_SET;
            case 1:
                WinterFlowRendererTransaction winterFlowRendererTransaction = ExecutorsRegistrar.WinterFlowRouterStructure;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new WinterFlowProxyThreadPool(Executors.newFixedThreadPool(4, new WinterFlowProxyTool("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.WinterFlowArrayNetwork.get());
            case 2:
                WinterFlowRendererTransaction winterFlowRendererTransaction2 = ExecutorsRegistrar.WinterFlowRouterStructure;
                return new WinterFlowProxyThreadPool(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new WinterFlowProxyTool("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.WinterFlowArrayNetwork.get());
            case 3:
                WinterFlowRendererTransaction winterFlowRendererTransaction3 = ExecutorsRegistrar.WinterFlowRouterStructure;
                return new WinterFlowProxyThreadPool(Executors.newCachedThreadPool(new WinterFlowProxyTool("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.WinterFlowArrayNetwork.get());
            case 4:
                WinterFlowRendererTransaction winterFlowRendererTransaction4 = ExecutorsRegistrar.WinterFlowRouterStructure;
                return Executors.newSingleThreadScheduledExecutor(new WinterFlowProxyTool("Firebase Scheduler", 0, null));
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
            default:
                return null;
        }
    }
}
