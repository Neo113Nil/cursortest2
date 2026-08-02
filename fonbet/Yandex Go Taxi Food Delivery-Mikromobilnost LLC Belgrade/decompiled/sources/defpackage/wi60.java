package defpackage;

import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.s0;
import kotlin.a;

/* loaded from: classes8.dex */
public final class wi60 {
    public final Context a;
    public final SharedPreferences b;
    public final dh60 c;
    public final i3y d = a.a(new csz(19, this));

    public wi60(Context context, SharedPreferences sharedPreferences, dh60 dh60Var) {
        this.a = context;
        this.b = sharedPreferences;
        this.c = dh60Var;
    }

    public final boolean a() {
        return !this.b.getBoolean("disable_all_notifications", false);
    }

    public final boolean b() {
        if (!c() || !a()) {
            return false;
        }
        s0 s0Var = (s0) this.d.getValue();
        this.c.getClass();
        NotificationChannelGroup notificationChannelGroup = s0Var.b.getNotificationChannelGroup("messenger_notifications_group");
        return notificationChannelGroup == null ? true : notificationChannelGroup.isBlocked() ^ true;
    }

    public final boolean c() {
        return ((s0) this.d.getValue()).b.areNotificationsEnabled() && (Build.VERSION.SDK_INT < 33 || qke.h(this.a, "android.permission.POST_NOTIFICATIONS") == 0);
    }
}
