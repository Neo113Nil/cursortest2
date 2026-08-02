package io.appmetrica.analytics.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.model.PushMessage;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.push.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1034g2 implements InterfaceC1026e2 {
    @Override // io.appmetrica.analytics.push.impl.InterfaceC1026e2
    public final void a(Context context, PushMessage pushMessage) {
        W1 w1;
        if (CoreUtils.isEmpty(pushMessage.getNotificationId())) {
            return;
        }
        X1 f = r.a(context).f();
        String pushIdToRemove = pushMessage.getPushIdToRemove();
        if (pushIdToRemove != null) {
            Iterator it = f.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    w1 = null;
                    break;
                } else {
                    w1 = (W1) it.next();
                    if (w1.a.equals(pushIdToRemove)) {
                        break;
                    }
                }
            }
            if (w1 != null) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    if (!AbstractC1035h.a(23) || p2.a(notificationManager, w1.c, w1.b.intValue())) {
                        notificationManager.cancel(w1.c, w1.b.intValue());
                    } else {
                        Y1.b.onRemovingSilentPushProcessed(pushMessage.getNotificationId(), "Notification not found", "Removed by user", pushMessage.getPayload(), pushMessage.getTransport());
                    }
                    Y1.b.onRemovingSilentPushProcessed(pushMessage.getNotificationId(), "Ok", null, pushMessage.getPayload(), pushMessage.getTransport());
                    r.a(context).f().b(w1.a);
                    return;
                }
                return;
            }
        }
        if (f.b().contains(pushIdToRemove)) {
            Y1.b.onRemovingSilentPushProcessed(pushMessage.getNotificationId(), "Notification not found", "Notification was replaced", pushMessage.getPayload(), pushMessage.getTransport());
        } else {
            Y1.b.onRemovingSilentPushProcessed(pushMessage.getNotificationId(), "Notification not found", null, pushMessage.getPayload(), pushMessage.getTransport());
        }
    }
}
