package io.appmetrica.analytics.push.notification.providers;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class VibrateProvider implements NotificationValueProvider<long[]> {
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public long[] get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        if (notification != null) {
            return notification.getVibrate();
        }
        return null;
    }
}
