package io.appmetrica.analytics.push.notification.providers;

import android.graphics.Bitmap;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class LargeIconProvider implements NotificationValueProvider<Bitmap> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Bitmap get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        if (notification != null) {
            return notification.getLargeIcon();
        }
        return null;
    }
}
