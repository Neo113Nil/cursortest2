package com.yandex.metrica.push;

import com.yandex.metrica.push.core.notification.DefaultPushNotificationFactory;
import com.yandex.metrica.push.core.notification.PushNotificationFactory;

/* loaded from: classes3.dex */
public abstract class PushNotificationFactoryProvider {
    private static volatile PushNotificationFactory a;

    private PushNotificationFactoryProvider() {
    }

    public static PushNotificationFactory getPushNotificationFactory() {
        PushNotificationFactory pushNotificationFactory;
        PushNotificationFactory pushNotificationFactory2 = a;
        if (pushNotificationFactory2 != null) {
            return pushNotificationFactory2;
        }
        synchronized (PushNotificationFactoryProvider.class) {
            try {
                pushNotificationFactory = a;
                if (pushNotificationFactory == null) {
                    pushNotificationFactory = new DefaultPushNotificationFactory();
                    a = pushNotificationFactory;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pushNotificationFactory;
    }

    public static void setPushNotificationFactory(PushNotificationFactory pushNotificationFactory) {
        synchronized (PushNotificationFactoryProvider.class) {
            a = pushNotificationFactory;
        }
    }
}
