package io.appmetrica.analytics.push.internal.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.impl.Y1;
import io.appmetrica.analytics.push.impl.r;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;

/* loaded from: classes4.dex */
public class TtlBroadcastReceiver extends BroadcastReceiver {
    public static final String EXPIRED_BY_TTL_ACTION = "io.appmetrica.analytics.push.action.EXPIRED_BY_TTL_ACTION";

    private static void a(Context context, Bundle bundle) {
        String string = bundle.getString("io.appmetrica.analytics.push.extra.PUSH_ID");
        int i = bundle.getInt("io.appmetrica.analytics.push.extra.NOTIFICATION_ID");
        String string2 = bundle.getString("io.appmetrica.analytics.push.extra.NOTIFICATION_TAG");
        String string3 = bundle.getString("io.appmetrica.analytics.push.extra.PAYLOAD");
        String string4 = bundle.getString(CoreConstants.EXTRA_TRANSPORT);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            PublicLogger.INSTANCE.info("Canceling notification with id %d", Integer.valueOf(i));
            notificationManager.cancel(string2, i);
            if (!CoreUtils.isEmpty(string)) {
                Y1.b.onNotificationExpired(string, "by ttl", string3, string4);
            }
            r.a(context).f().b(string);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        try {
            if (!EXPIRED_BY_TTL_ACTION.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
                return;
            }
            a(context, extras);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle ttl", th);
        }
    }
}
