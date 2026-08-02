package io.appmetrica.analytics.push.notification.providers;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class WhenProvider implements NotificationValueProvider<Long> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Long get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        Long when = notification != null ? notification.getWhen() : null;
        return when == null ? Long.valueOf(System.currentTimeMillis()) : when;
    }
}
