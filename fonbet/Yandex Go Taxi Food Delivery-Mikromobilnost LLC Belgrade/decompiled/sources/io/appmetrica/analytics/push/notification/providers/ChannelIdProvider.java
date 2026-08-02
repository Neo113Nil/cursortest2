package io.appmetrica.analytics.push.notification.providers;

import android.content.Context;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.impl.A;
import io.appmetrica.analytics.push.impl.AbstractC1035h;
import io.appmetrica.analytics.push.impl.C1056m1;
import io.appmetrica.analytics.push.impl.r;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class ChannelIdProvider implements NotificationValueProvider<String> {
    private final Context a;

    public ChannelIdProvider(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public String get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        String channelId = notification != null ? notification.getChannelId() : null;
        if (!CoreUtils.isEmpty(channelId)) {
            return channelId;
        }
        C1056m1 b = r.a(this.a).b();
        b.getClass();
        if (!AbstractC1035h.a(26)) {
            return "appmetrica_push";
        }
        A.a(b.a, b.b);
        return "appmetrica_push";
    }
}
