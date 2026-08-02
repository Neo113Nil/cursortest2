package io.appmetrica.analytics.push.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import defpackage.g8e;
import defpackage.oyr;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.settings.PushNotificationFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Pair;
import org.json.JSONArray;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.push.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1073s1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, PushNotificationFactory pushNotificationFactory, PushMessage pushMessage) {
        Integer num;
        W1 w1;
        String str;
        boolean a;
        Notification buildNotification = pushNotificationFactory.buildNotification(context, pushMessage);
        PushNotification notification = pushMessage.getNotification();
        if (notification == null || (num = notification.getNotificationId()) == null) {
            num = 0;
        }
        int intValue = num.intValue();
        PushNotification notification2 = pushMessage.getNotification();
        String notificationTag = notification2 != null ? notification2.getNotificationTag() : null;
        TrackersHub.getInstance().reportEvent("NotificationPublisher.publishNotification", kotlin.collections.b.i(new Pair("pushId", pushMessage.getNotificationId()), new Pair("isDefaultNotificationFactory", Boolean.valueOf(pushNotificationFactory == AbstractC1010a2.a))));
        if (buildNotification == null) {
            if (CoreUtils.isEmpty(pushMessage.getNotificationId())) {
                return;
            }
            Y1.b.onNotificationIgnored(pushMessage.getNotificationId(), "Notification is null", "", pushMessage.getPayload(), pushMessage.getTransport());
            return;
        }
        String notificationId = pushMessage.getNotificationId();
        String transport = pushMessage.getTransport();
        Iterator it = r.a(context).f().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                w1 = null;
                break;
            }
            w1 = (W1) it.next();
            String str2 = w1.c;
            if ((str2 == null && notificationTag == null) || (str2 != null && str2.equals(notificationTag))) {
                Integer num2 = w1.b;
                if (num2 != null && num2.equals(num)) {
                    break;
                }
            }
        }
        String str3 = w1 == null ? null : w1.a;
        boolean z = w1 != null && Boolean.TRUE.equals(w1.d);
        if (!AbstractC1035h.a(23) || (a = p2.a((NotificationManager) context.getSystemService("notification"), notificationTag, intValue)) == z) {
            str = null;
        } else {
            String str4 = z ? "" : "not ";
            String str5 = a ? "" : "not ";
            StringBuilder q = defpackage.n.q("Failed get active status for notification [", num, notificationTag, Extension.FIX_SPACE, "]. Preferences has pushId ");
            g8e.D(q, str3, Extension.O_BRAKE_SPACE, str4, "active), but notification in status bar is ");
            String t = oyr.t(q, str5, ClidProvider.APP_ACTIVE);
            str = null;
            TrackersHub.getInstance().reportError(t, null);
            PublicLogger.INSTANCE.error(t, new Object[0]);
            z = a;
        }
        if (!z) {
            str3 = str;
        }
        if (str3 != null) {
            ((C1077u) r.a(context).f.d()).onNotificationReplace(str3, notificationId, transport);
            r.a(context).f().b(str3);
        }
        if (!A.a(context, buildNotification)) {
            A.a(pushMessage, buildNotification);
            return;
        }
        try {
            Object systemService = context.getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : str;
            if (notificationManager != 0) {
                notificationManager.notify(notificationTag, intValue, buildNotification);
            }
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed show notification with tag " + notificationTag + " and id " + intValue, th);
        }
        if (CoreUtils.isNotEmpty(pushMessage.getNotificationId())) {
            Y1.b.onNotificationShown(pushMessage.getNotificationId(), pushMessage.getPayload(), pushMessage.getTransport());
            X1 f = r.a(context).f();
            f.a(pushMessage.getNotificationId(), num, notificationTag, true);
            if (pushMessage.getNotification() != null) {
                String channelId = pushMessage.getNotification().getChannelId();
                long timestamp = pushMessage.getTimestamp();
                LinkedList a2 = f.a(channelId);
                a2.add(Long.valueOf(timestamp));
                if (a2.size() > 50) {
                    a2.remove(0);
                }
                M1 m1 = f.a;
                String jSONArray = new JSONArray((Collection) a2).toString();
                m1.getClass();
                m1.a("shown_times_millis_by_channel_id" + channelId, jSONArray);
            }
        }
    }
}
