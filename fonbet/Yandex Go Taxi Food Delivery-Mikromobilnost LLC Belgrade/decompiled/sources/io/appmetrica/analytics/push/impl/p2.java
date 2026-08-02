package io.appmetrica.analytics.push.impl;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;

/* loaded from: classes15.dex */
public class p2 {
    public static boolean a(NotificationManager notificationManager, String str, int i) {
        for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
            if (statusBarNotification.getId() == i && ((str == null && statusBarNotification.getTag() == null) || str.equals(statusBarNotification.getTag()))) {
                return true;
            }
        }
        return false;
    }
}
