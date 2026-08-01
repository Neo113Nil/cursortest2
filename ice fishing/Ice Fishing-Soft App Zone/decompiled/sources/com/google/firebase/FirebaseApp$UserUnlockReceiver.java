package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.datatransport.WinterFlowBandwidthNetwork;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
class FirebaseApp$UserUnlockReceiver extends BroadcastReceiver {
    public static final AtomicReference WinterFlowHookDataSource = new AtomicReference();
    public final Context WinterFlowRouterStructure;

    public FirebaseApp$UserUnlockReceiver(Context context) {
        this.WinterFlowRouterStructure = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (WinterFlowSyntaxEvent.WinterFlowResponseEngine) {
            try {
                Iterator it = ((WinterFlowBandwidthNetwork) WinterFlowSyntaxEvent.WinterFlowTransactionAgent.values()).iterator();
                while (it.hasNext()) {
                    ((WinterFlowSyntaxEvent) it.next()).WinterFlowArrayNetwork();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.WinterFlowRouterStructure.unregisterReceiver(this);
    }
}
