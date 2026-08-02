package io.appmetrica.analytics.push.notification;

import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes9.dex */
public interface NotificationValueProvider<T> {
    T get(PushMessage pushMessage);
}
