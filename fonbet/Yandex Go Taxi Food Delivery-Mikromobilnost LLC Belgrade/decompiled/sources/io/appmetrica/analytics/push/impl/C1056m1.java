package io.appmetrica.analytics.push.impl;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: io.appmetrica.analytics.push.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1056m1 {
    public final NotificationManager a;
    public final NotificationChannel b;

    public C1056m1(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.a = notificationManager;
        if (AbstractC1035h.a(26)) {
            this.b = A.a(notificationManager);
        } else {
            this.b = null;
        }
    }
}
