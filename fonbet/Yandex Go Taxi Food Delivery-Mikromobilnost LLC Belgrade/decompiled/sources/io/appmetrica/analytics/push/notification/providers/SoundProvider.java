package io.appmetrica.analytics.push.notification.providers;

import android.media.RingtoneManager;
import android.net.Uri;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class SoundProvider implements NotificationValueProvider<Uri> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Uri get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        if (notification == null || !notification.isSoundEnabled()) {
            return null;
        }
        Uri soundUri = notification.getSoundUri();
        return soundUri != null ? soundUri : RingtoneManager.getDefaultUri(2);
    }
}
