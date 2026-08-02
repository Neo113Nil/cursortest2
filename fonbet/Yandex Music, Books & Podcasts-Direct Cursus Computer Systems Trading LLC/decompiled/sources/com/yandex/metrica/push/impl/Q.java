package com.yandex.metrica.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.core.model.PushMessage;
import com.yandex.metrica.push.impl.C0080q;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class Q implements P {
    @Override // com.yandex.metrica.push.impl.P
    public void a(Context context, PushMessage pushMessage) {
        C0080q.a aVar;
        if (CoreUtils.isEmpty(pushMessage.getNotificationId())) {
            return;
        }
        C0080q g = C0077n.a(context).g();
        String pushIdToRemove = pushMessage.getPushIdToRemove();
        if (pushIdToRemove != null) {
            Iterator<C0080q.a> it = g.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                } else {
                    aVar = it.next();
                    if (aVar.a.equals(pushIdToRemove)) {
                        break;
                    }
                }
            }
            if (aVar != null) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    if (com.yandex.metrica.push.utils.f.a(23) ? !com.yandex.metrica.push.utils.j.a(notificationManager, aVar.c, aVar.b.intValue()) : false) {
                        a(pushMessage, "Notification not found", "Removed by user");
                    } else {
                        notificationManager.cancel(aVar.c, aVar.b.intValue());
                    }
                    a(pushMessage, "Ok", null);
                    C0077n.a(context).g().a(aVar.a, false);
                    return;
                }
                return;
            }
        }
        if (((LinkedList) g.b()).contains(pushIdToRemove)) {
            a(pushMessage, "Notification not found", "Notification was replaced");
        } else {
            a(pushMessage, "Notification not found", null);
        }
    }

    private void a(PushMessage pushMessage, String str, String str2) {
        com.yandex.metrica.push.core.tracking.h.a().onRemovingSilentPushProcessed(pushMessage.getNotificationId(), str, str2, pushMessage.getPayload(), pushMessage.getTransport());
    }
}
