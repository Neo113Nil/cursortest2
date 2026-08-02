package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.f0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class i5s {
    public final Context a;
    public final j5s b;

    public i5s(Context context, o4s o4sVar, j5s j5sVar) {
        this.a = context;
        this.b = j5sVar;
    }

    public final void a() {
        try {
            b().cancel("ru.yandex.music.notifications.berizaryad", 9364);
        } catch (Throwable th) {
            if (!c9g.J(th)) {
                throw th;
            }
            ssg.a(6, null, "Dead system raise", th);
        }
    }

    public final NotificationManager b() {
        Object systemService = this.a.getSystemService("notification");
        systemService.getClass();
        return (NotificationManager) systemService;
    }

    public final void c() {
        if (!b().areNotificationsEnabled()) {
            ssg.a(5, null, "Notifications disabled", null);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 26) {
            String string = context.getString(R.string.take_charge_notification_channel_title);
            string.getClass();
            String string2 = context.getString(R.string.take_charge_notification_channel_description);
            string2.getClass();
            NotificationChannel notificationChannel = new NotificationChannel("ru.yandex.music.notifications.berizaryad", string, 2);
            notificationChannel.setDescription(string2);
            b().createNotificationChannel(notificationChannel);
        }
        Context context2 = this.b.a;
        Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage(context2.getPackageName());
        PendingIntent Q = launchIntentForPackage != null ? pcg.Q(launchIntentForPackage, context, 0, 67108864) : null;
        f0 f0Var = new f0(context, "ru.yandex.music.notifications.berizaryad");
        f0Var.K.icon = 2131232117;
        f0Var.e = f0.c(context.getString(R.string.take_charge_notification_title));
        f0Var.f = f0.c(context.getString(R.string.take_charge_notification_text));
        f0Var.k = 0;
        f0Var.g = Q;
        f0Var.g(16, true);
        f0Var.L = true;
        NotificationManager b = b();
        Notification o = v7g.o(f0Var);
        o.getClass();
        try {
            b.notify("ru.yandex.music.notifications.berizaryad", 9364, o);
        } catch (Throwable th) {
            if (!c9g.J(th)) {
                throw th;
            }
            ssg.a(6, null, "Dead system raise", th);
        }
    }
}
