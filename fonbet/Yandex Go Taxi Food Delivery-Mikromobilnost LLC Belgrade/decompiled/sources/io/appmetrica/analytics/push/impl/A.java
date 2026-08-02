package io.appmetrica.analytics.push.impl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes4.dex */
public class A {
    public static void a(PushMessage pushMessage, Notification notification) {
        if (CoreUtils.isEmpty(pushMessage.getNotificationId())) {
            return;
        }
        Y1.b.onNotificationIgnored(pushMessage.getNotificationId(), "Notification channel is missing", notification.getChannelId(), pushMessage.getPayload(), pushMessage.getTransport());
    }

    public static int b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            return notificationChannel.getImportance();
        }
        return -1000;
    }

    public static boolean a(Context context, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        return notificationManager == null || notificationManager.getNotificationChannel(notification.getChannelId()) != null;
    }

    public static String a(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null) {
            return null;
        }
        return notificationChannel.getGroup();
    }

    public static NotificationChannel a(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("appmetrica_push");
        return notificationChannel == null ? new NotificationChannel("appmetrica_push", "Default", 2) : notificationChannel;
    }

    public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        if (notificationChannel != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
