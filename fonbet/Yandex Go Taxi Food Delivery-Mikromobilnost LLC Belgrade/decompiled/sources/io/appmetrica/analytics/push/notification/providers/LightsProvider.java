package io.appmetrica.analytics.push.notification.providers;

import io.appmetrica.analytics.push.model.LedLights;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class LightsProvider implements NotificationValueProvider<List<Integer>> {
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public List<Integer> get(PushMessage pushMessage) {
        LedLights ledLights;
        PushNotification notification = pushMessage.getNotification();
        if (notification == null || (ledLights = notification.getLedLights()) == null || !ledLights.isValid()) {
            return null;
        }
        return Arrays.asList(ledLights.getColor(), ledLights.getOnMs(), ledLights.getOffMs());
    }
}
