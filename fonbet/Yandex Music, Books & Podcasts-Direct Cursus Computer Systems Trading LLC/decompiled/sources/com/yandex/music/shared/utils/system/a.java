package com.yandex.music.shared.utils.system;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import defpackage.hrg;
import defpackage.ouj;
import defpackage.ssg;

/* loaded from: classes4.dex */
public abstract class a {
    public static void a(String str, NotificationManager notificationManager, int i, Notification notification) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ssg.a(4, "NotificationChecker:".concat(str), hrg.p("Checking notification for ", i, " and channel ", notification.getChannelId()), null);
        ssg.a(4, "NotificationChecker:".concat(str), "Dumping notification\n: " + notification, null);
        if (notification.getSmallIcon() == null) {
            ssg.a(7, "NotificationChecker:".concat(str), "No small icon", new NoSmallIconException(str.concat(": No small icon")));
        }
        if (notificationManager == null) {
            ssg.a(7, "NotificationChecker:".concat(str), "No notification manager", new NoNotificationManagerException(str.concat(": No notification manager")));
            return;
        }
        String channelId = notification.getChannelId();
        if (notificationManager.getNotificationChannel(channelId) == null) {
            String concat = "NotificationChecker:".concat(str);
            channelId.getClass();
            ssg.a(7, concat, "No notification channel ".concat(channelId), new NoNotificationChannelException(ouj.o(str, ": No notification channel ", channelId)));
        }
    }
}
