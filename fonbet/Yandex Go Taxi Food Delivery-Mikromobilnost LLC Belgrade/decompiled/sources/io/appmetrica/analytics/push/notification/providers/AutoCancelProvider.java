package io.appmetrica.analytics.push.notification.providers;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class AutoCancelProvider implements NotificationValueProvider<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Boolean get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        Boolean autoCancel = notification != null ? notification.getAutoCancel() : null;
        return autoCancel == null ? Boolean.TRUE : autoCancel;
    }
}
