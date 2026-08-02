package io.appmetrica.analytics.push.notification.providers;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class OngoingProvider implements NotificationValueProvider<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Boolean get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        if (notification != null) {
            return notification.getOngoing();
        }
        return null;
    }
}
