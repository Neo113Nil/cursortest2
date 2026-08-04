package com.gamericefishpro.space.tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends BroadcastReceiver {
    public w a;
    public Context b;

    public final void a() {
        Log.isLoggable("FirebaseMessaging", 3);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        w wVar = this.a;
        if (wVar != null) {
            Context context = wVar.i.b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        w wVar = this.a;
        if (wVar != null && wVar.a()) {
            Log.isLoggable("FirebaseMessaging", 3);
            w wVar2 = this.a;
            wVar2.i.getClass();
            FirebaseMessaging.b(wVar2, 0L);
            Context context2 = this.b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}
