package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h8.d;
import pc.j;
import xa.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class UpgradeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        j.e(context, "context");
        j.e(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        j.d(applicationContext, "context.applicationContext");
        if (d.b(applicationContext)) {
            ((c) d.a().getService(c.class)).beginEnqueueingWork(context, true);
        }
    }
}
