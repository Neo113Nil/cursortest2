package com.yandex.passport.internal.push;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.Collections;

/* loaded from: classes4.dex */
public abstract class q {
    public static final androidx.core.app.y a(androidx.core.app.u0 u0Var) {
        NotificationChannelGroup c;
        u0Var.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup c2 = u0Var.c();
            if (c2 != null) {
                return new androidx.core.app.y(c2, Collections.EMPTY_LIST);
            }
            return null;
        }
        if (i < 26 || (c = u0Var.c()) == null) {
            return null;
        }
        return new androidx.core.app.y(c, i >= 26 ? androidx.core.app.u.r(u0Var.b) : Collections.EMPTY_LIST);
    }

    public static final boolean b(androidx.core.app.u0 u0Var) {
        NotificationChannel b;
        if (Build.VERSION.SDK_INT >= 26 && (b = u0Var.b("sign_in_notification_channel_id")) != null) {
            return b.canBypassDnd();
        }
        return false;
    }
}
