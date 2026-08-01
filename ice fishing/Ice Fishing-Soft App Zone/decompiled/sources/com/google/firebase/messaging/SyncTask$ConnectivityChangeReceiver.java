package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
class SyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    public Context WinterFlowHookDataSource;
    public WinterFlowSyntaxEvent WinterFlowRouterStructure;

    public final void WinterFlowRouterStructure() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        if (winterFlowSyntaxEvent != null) {
            Context context = winterFlowSyntaxEvent.WinterFlowUnitTestResponse.WinterFlowHookDataSource;
            this.WinterFlowHookDataSource = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        if (winterFlowSyntaxEvent != null && winterFlowSyntaxEvent.WinterFlowRouterStructure()) {
            WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowRouterStructure;
            FirebaseMessaging firebaseMessaging = winterFlowSyntaxEvent2.WinterFlowUnitTestResponse;
            FirebaseMessaging.WinterFlowHookDataSource(winterFlowSyntaxEvent2, 0L);
            Context context2 = this.WinterFlowHookDataSource;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.WinterFlowRouterStructure = null;
        }
    }
}
