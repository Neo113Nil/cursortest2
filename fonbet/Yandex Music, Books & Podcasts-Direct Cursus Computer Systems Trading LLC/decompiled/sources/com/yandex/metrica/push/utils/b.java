package com.yandex.metrica.push.utils;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;

/* loaded from: classes3.dex */
public class b {
    public static boolean a(NotificationManager notificationManager, String str) {
        NotificationChannelGroup notificationChannelGroup = notificationManager.getNotificationChannelGroup(a.a(notificationManager, str));
        return notificationChannelGroup != null && notificationChannelGroup.isBlocked();
    }
}
