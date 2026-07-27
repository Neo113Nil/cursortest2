package com.anythink.basead.exoplayer.k;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8649a = -1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8650b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8651c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8652d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8653e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8654f = 4;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private q() {
    }

    private static void a(Context context, String str, int i, int i4) {
        if (af.f8503a >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            A.v();
            notificationManager.createNotificationChannel(P.c.e(i4, str, context.getString(i)));
        }
    }

    private static void a(Context context, int i, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i, notification);
        } else {
            notificationManager.cancel(i);
        }
    }
}
