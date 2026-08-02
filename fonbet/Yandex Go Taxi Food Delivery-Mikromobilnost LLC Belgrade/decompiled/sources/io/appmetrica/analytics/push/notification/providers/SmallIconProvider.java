package io.appmetrica.analytics.push.notification.providers;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class SmallIconProvider implements NotificationValueProvider<Integer> {
    private final Context a;

    public SmallIconProvider(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Integer get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        Integer num = null;
        Integer iconResId = notification != null ? notification.getIconResId() : null;
        if (iconResId == null) {
            Bundle metaData = CoreUtils.getMetaData(this.a);
            if (metaData != null && metaData.containsKey("io.appmetrica.analytics.push.default_notification_icon")) {
                num = Integer.valueOf(metaData.getInt("io.appmetrica.analytics.push.default_notification_icon"));
            }
        } else {
            num = iconResId;
        }
        return num == null ? Integer.valueOf(this.a.getApplicationInfo().icon) : num;
    }
}
