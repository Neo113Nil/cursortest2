package io.appmetrica.analytics.push.impl;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;

/* loaded from: classes4.dex */
public class B {
    public static boolean a(NotificationManager notificationManager, String str) {
        NotificationChannelGroup notificationChannelGroup = notificationManager.getNotificationChannelGroup(A.a(notificationManager, str));
        return notificationChannelGroup != null && notificationChannelGroup.isBlocked();
    }
}
