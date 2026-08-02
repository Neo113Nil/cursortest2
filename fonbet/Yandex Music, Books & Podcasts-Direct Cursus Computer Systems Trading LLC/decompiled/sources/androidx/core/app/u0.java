package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class u0 {
    public static String d;
    public static t0 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public u0(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            u.d(this.b, notificationChannel);
        }
    }

    public final NotificationChannel b(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return u.q(this.b, str);
        }
        return null;
    }

    public final NotificationChannelGroup c() {
        int i = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = this.b;
        if (i >= 28) {
            return x.c(notificationManager);
        }
        if (i < 26) {
            return null;
        }
        for (NotificationChannelGroup notificationChannelGroup : i >= 26 ? notificationManager.getNotificationChannelGroups() : Collections.EMPTY_LIST) {
            if (notificationChannelGroup.getId().equals("passport_channel_group_id")) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public final void d(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.b.notify(str, i, notification);
            return;
        }
        q0 q0Var = new q0(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new t0(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, q0Var).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(str, i);
    }
}
