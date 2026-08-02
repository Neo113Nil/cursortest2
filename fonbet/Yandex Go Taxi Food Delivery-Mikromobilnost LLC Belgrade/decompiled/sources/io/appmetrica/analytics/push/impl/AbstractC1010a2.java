package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.internal.notification.DefaultPushNotificationFactory;
import io.appmetrica.analytics.push.settings.PushNotificationFactory;

/* renamed from: io.appmetrica.analytics.push.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1010a2 {
    public static final DefaultPushNotificationFactory a;
    public static volatile PushNotificationFactory b;

    static {
        DefaultPushNotificationFactory defaultPushNotificationFactory = new DefaultPushNotificationFactory();
        a = defaultPushNotificationFactory;
        b = defaultPushNotificationFactory;
    }
}
