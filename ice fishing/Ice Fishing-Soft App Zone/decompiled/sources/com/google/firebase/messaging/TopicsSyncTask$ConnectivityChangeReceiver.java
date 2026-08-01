package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
class TopicsSyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    public WinterFlowArrayHandler WinterFlowRouterStructure;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        WinterFlowArrayHandler winterFlowArrayHandler = this.WinterFlowRouterStructure;
        if (winterFlowArrayHandler == null) {
            return;
        }
        if (winterFlowArrayHandler.WinterFlowCacheManagerAgent()) {
            WinterFlowArrayHandler winterFlowArrayHandler2 = this.WinterFlowRouterStructure;
            winterFlowArrayHandler2.WinterFlowRouterRouter.WinterFlowVariableVersionControl.schedule(winterFlowArrayHandler2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.WinterFlowRouterStructure = null;
        }
    }
}
