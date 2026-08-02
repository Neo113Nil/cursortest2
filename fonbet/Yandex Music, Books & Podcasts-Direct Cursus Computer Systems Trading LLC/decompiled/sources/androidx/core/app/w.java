package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class w {
    public final String a;
    public final int b;

    public w(NotificationChannel notificationChannel) {
        String j = u.j(notificationChannel);
        int l = u.l(notificationChannel);
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        j.getClass();
        this.a = j;
        this.b = l;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        u.p(notificationChannel);
        u.h(notificationChannel);
        u.i(notificationChannel);
        u.b(notificationChannel);
        u.s(notificationChannel);
        u.f(notificationChannel);
        u.B(notificationChannel);
        u.m(notificationChannel);
        u.C(notificationChannel);
        u.t(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            v.b(notificationChannel);
            v.a(notificationChannel);
        }
        u.a(notificationChannel);
        u.n(notificationChannel);
        if (i >= 29) {
            g.a(notificationChannel);
        }
        if (i >= 30) {
            v.c(notificationChannel);
        }
    }
}
