package io.appmetrica.analytics.push.notification.providers;

import android.app.PendingIntent;
import android.content.Context;
import io.appmetrica.analytics.push.intent.NotificationActionType;
import io.appmetrica.analytics.push.internal.IntentHelper;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class ContentIntentProvider implements NotificationValueProvider<PendingIntent> {
    private final Context a;

    public ContentIntentProvider(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public PendingIntent get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        return IntentHelper.getPendingIntentForOpenAction(this.a, notification, IntentHelper.createNotificationActionInfo(NotificationActionType.CLICK, pushMessage, notification != null ? notification.getOpenActionUrl() : null));
    }
}
