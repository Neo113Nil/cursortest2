package io.appmetrica.analytics.push.notification.providers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.impl.AbstractC1035h;
import io.appmetrica.analytics.push.impl.AbstractC1038h2;
import io.appmetrica.analytics.push.impl.F1;
import io.appmetrica.analytics.push.internal.receiver.TtlBroadcastReceiver;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class TimeoutProvider implements NotificationValueProvider<Long> {
    private final Context a;

    public TimeoutProvider(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Long get(PushMessage pushMessage) {
        Long l;
        Long l2;
        AlarmManager alarmManager;
        PushNotification notification = pushMessage.getNotification();
        if (notification != null) {
            l2 = notification.getNotificationTtl();
            l = notification.getTimeToHideMillis();
        } else {
            l = null;
            l2 = null;
        }
        if (l2 != null && l != null) {
            l2 = Long.valueOf(Math.min(l2.longValue(), l.longValue() - System.currentTimeMillis()));
        } else if (l != null) {
            l2 = Long.valueOf(l.longValue() - System.currentTimeMillis());
        }
        if (AbstractC1035h.a(26)) {
            return l2;
        }
        if (l2 != null && (alarmManager = (AlarmManager) this.a.getSystemService("alarm")) != null) {
            Integer notificationId = pushMessage.getNotification() == null ? null : pushMessage.getNotification().getNotificationId();
            alarmManager.set(1, l2.longValue() + System.currentTimeMillis(), PendingIntent.getBroadcast(this.a, AbstractC1038h2.a(this.a), new Intent(this.a, (Class<?>) TtlBroadcastReceiver.class).setAction(TtlBroadcastReceiver.EXPIRED_BY_TTL_ACTION).putExtra("io.appmetrica.analytics.push.extra.PUSH_ID", pushMessage.getNotificationId()).putExtra("io.appmetrica.analytics.push.extra.NOTIFICATION_ID", notificationId == null ? 0 : notificationId.intValue()).putExtra("io.appmetrica.analytics.push.extra.NOTIFICATION_TAG", pushMessage.getNotification() == null ? null : pushMessage.getNotification().getNotificationTag()).putExtra("io.appmetrica.analytics.push.extra.PAYLOAD", pushMessage.getPayload()).putExtra(CoreConstants.EXTRA_TRANSPORT, pushMessage.getTransport()), F1.a(false)));
        }
        return null;
    }
}
