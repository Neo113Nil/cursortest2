package io.appmetrica.analytics.push.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.push.coreutils.internal.PushServiceFacade;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;

/* loaded from: classes4.dex */
public class AppMetricaPushNotificationStatusChangeHandler extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            PublicLogger.INSTANCE.info("Notification block state change with action %s and bundle %s", action, intent.getExtras());
            if (!"android.app.action.APP_BLOCK_STATE_CHANGED".equals(action) && !"android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED".equals(action) && !"android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED".equals(action)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            PushServiceFacade pushServiceFacade = PushServiceFacade.INSTANCE;
            PushServiceFacade.sendSystemInfo(context, Long.valueOf(currentTimeMillis));
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle change notification status", th);
        }
    }
}
