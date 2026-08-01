package com.google.android.datatransport;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.EnhancedIntentService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerOrchestration extends Binder {
    public final WinterFlowJSONDecorator WinterFlowCacheManagerAgent;

    public WinterFlowUserManagerOrchestration(WinterFlowJSONDecorator winterFlowJSONDecorator) {
        this.WinterFlowCacheManagerAgent = winterFlowJSONDecorator;
    }

    public final void WinterFlowRouterStructure(WinterFlowTransactionTransaction winterFlowTransactionTransaction) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = winterFlowTransactionTransaction.WinterFlowRouterStructure;
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
        int i = EnhancedIntentService.WinterFlowResponseEngine;
        WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
        enhancedIntentService.WinterFlowVariableVersionControl.execute(new WinterFlowVariableVersionControl(enhancedIntentService, intent, winterFlowArrayEngine, 2));
        winterFlowArrayEngine.WinterFlowRouterStructure.WinterFlowRouterStructure(new WinterFlowOrchestrationSession(1), new WinterFlowExceptionBandwidth(9, winterFlowTransactionTransaction));
    }
}
