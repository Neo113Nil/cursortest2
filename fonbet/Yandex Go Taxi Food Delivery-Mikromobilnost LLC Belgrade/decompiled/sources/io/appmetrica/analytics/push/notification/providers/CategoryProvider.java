package io.appmetrica.analytics.push.notification.providers;

import android.text.TextUtils;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class CategoryProvider implements NotificationValueProvider<String> {
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public String get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        String category = notification != null ? notification.getCategory() : null;
        if (TextUtils.isEmpty(category)) {
            return null;
        }
        return category;
    }
}
