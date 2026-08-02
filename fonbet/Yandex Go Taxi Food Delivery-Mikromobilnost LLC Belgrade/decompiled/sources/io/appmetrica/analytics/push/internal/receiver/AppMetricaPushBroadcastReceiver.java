package io.appmetrica.analytics.push.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.impl.C1049k1;
import io.appmetrica.analytics.push.impl.r;

/* loaded from: classes4.dex */
public class AppMetricaPushBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION_BROADCAST_ACTION = "io.appmetrica.analytics.push.action.NOTIFICATION_ACTION";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (ACTION_BROADCAST_ACTION.equals(intent.getAction())) {
                Context applicationContext = context.getApplicationContext();
                r.a(applicationContext).f.b().getClass();
                C1049k1.a(applicationContext, intent);
            }
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle notification action", th);
        }
    }
}
