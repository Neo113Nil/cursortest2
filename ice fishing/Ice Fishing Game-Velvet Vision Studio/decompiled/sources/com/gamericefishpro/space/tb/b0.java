package com.gamericefishpro.space.tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends BroadcastReceiver {
    public c0 a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        c0 c0Var = this.a;
        if (c0Var == null) {
            return;
        }
        if (c0Var.c()) {
            Log.isLoggable("FirebaseMessaging", 3);
            c0 c0Var2 = this.a;
            c0Var2.v.f.schedule(c0Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
