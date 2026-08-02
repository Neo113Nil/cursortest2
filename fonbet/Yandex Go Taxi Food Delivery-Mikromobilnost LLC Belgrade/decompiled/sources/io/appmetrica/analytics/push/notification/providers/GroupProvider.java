package io.appmetrica.analytics.push.notification.providers;

import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class GroupProvider implements NotificationValueProvider<String> {
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public String get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        if (notification == null) {
            return null;
        }
        String group = notification.getGroup();
        if (CoreUtils.isEmpty(group)) {
            return null;
        }
        return group;
    }
}
