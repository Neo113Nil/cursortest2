package com.yandex.metrica.push.core.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.f0;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.core.model.PushMessage;
import com.yandex.metrica.push.core.tracking.h;
import com.yandex.metrica.push.impl.C0077n;
import com.yandex.metrica.push.impl.C0078o;
import defpackage.k5r;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class PushNotificationFactory {
    private String a;

    public Notification buildNotification(Context context, PushMessage pushMessage) {
        f0 createNotificationBuilder = createNotificationBuilder(context, pushMessage);
        if (createNotificationBuilder == null) {
            return null;
        }
        return createNotificationBuilder.b();
    }

    public void checkPreviousNotification(Context context, String str, int i, String str2, String str3) {
        String a = new g(context).a(str, i);
        if (a != null) {
            ((C0078o) C0077n.a(context).i()).n().onNotificationReplace(a, str2, str3);
            C0077n.a(context).g().a(a, false);
        }
    }

    public abstract f0 createNotificationBuilder(Context context, PushMessage pushMessage);

    public void publishNotification(Context context, Notification notification, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            try {
                notificationManager.notify(this.a, i, notification);
            } catch (Throwable th) {
                Locale locale = Locale.US;
                TrackersHub.getInstance().reportError(k5r.l("Failed show notification with tag ", i, this.a, " and id "), th);
            }
        }
    }

    public void showNotification(Context context, PushMessage pushMessage) {
        Integer notificationId = pushMessage.getNotification() == null ? null : pushMessage.getNotification().getNotificationId();
        int intValue = notificationId == null ? 0 : notificationId.intValue();
        Integer valueOf = Integer.valueOf(intValue);
        this.a = pushMessage.getNotification() != null ? pushMessage.getNotification().getNotificationTag() : null;
        Notification buildNotification = buildNotification(context, pushMessage);
        if (buildNotification != null) {
            checkPreviousNotification(context, this.a, intValue, pushMessage.getNotificationId(), pushMessage.getTransport());
            int i = Build.VERSION.SDK_INT;
            if (!(i >= 26 ? com.yandex.metrica.push.utils.a.a(context, buildNotification) : true)) {
                if (i >= 26) {
                    com.yandex.metrica.push.utils.a.a(pushMessage, buildNotification);
                }
            } else {
                publishNotification(context, buildNotification, intValue);
                if (CoreUtils.isEmpty(pushMessage.getNotificationId())) {
                    return;
                }
                h.a().onNotificationShown(pushMessage.getNotificationId(), pushMessage.getPayload(), pushMessage.getTransport());
                C0077n.a(context).g().a(pushMessage.getNotificationId(), valueOf, this.a, true);
                C0077n.a(context).g().b(pushMessage);
            }
        }
    }
}
