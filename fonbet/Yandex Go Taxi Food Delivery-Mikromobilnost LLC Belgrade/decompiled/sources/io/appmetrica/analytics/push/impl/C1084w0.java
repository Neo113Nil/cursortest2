package io.appmetrica.analytics.push.impl;

import android.content.Context;
import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.x4e;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1084w0 {
    public static void a(Context context, PushMessage pushMessage) {
        PublicLogger publicLogger = PublicLogger.INSTANCE;
        publicLogger.info("Process push with notificationId = %s", pushMessage.getNotificationId());
        TrackersHub.getInstance().reportEvent("Process push", x4e.p("notification_Id", pushMessage.getNotificationId()));
        C1080v c1080v = r.a(context).f;
        String notificationId = pushMessage.getNotificationId();
        if (CoreUtils.isNotEmpty(notificationId) && c1080v.a().trackingReceiveAction) {
            Y1.b.onMessageReceived(notificationId, pushMessage.getPayload(), pushMessage.getTransport());
        }
        z2 z2Var = new z2();
        new A2(context, z2Var);
        D2 a = z2Var.a(pushMessage);
        boolean isShow = a.a.isShow();
        PushMessage pushMessage2 = a.b;
        if (isShow) {
            C1080v c1080v2 = r.a(context).f;
            if (c1080v2.b == null) {
                synchronized (c1080v2.a) {
                    try {
                        if (c1080v2.b == null) {
                            c1080v2.b = new C1081v0();
                        }
                    } finally {
                    }
                }
            }
            c1080v2.b.getClass();
            InterfaceC1026e2 c1050k2 = pushMessage2.isSilent() ? CoreUtils.isEmpty(pushMessage2.getPushIdToRemove()) ? new C1050k2() : new C1034g2() : pushMessage2.getNotification() != null ? new N0(new C1073s1()) : null;
            if (c1050k2 != null) {
                c1050k2.a(context, pushMessage2);
            } else {
                String notificationId2 = pushMessage2.getNotificationId();
                publicLogger.warning("%s with pushId = %s", "Receive push with wrong format", notificationId2);
                HashMap hashMap = new HashMap();
                hashMap.put("notification_Id", notificationId2);
                TrackersHub.getInstance().reportEvent("Receive push with wrong format", hashMap);
                a(pushMessage2, "Push data format is invalid", "Receive push with wrong format");
            }
        } else {
            PushFilter.FilterResult filterResult = a.a;
            a(pushMessage2, filterResult.category, filterResult.details);
        }
        X1 f = r.a(context).f();
        PushMessage pushMessage3 = a.b;
        f.getClass();
        if (!CoreUtils.isEmpty(pushMessage3.getNotificationId())) {
            String notificationId3 = pushMessage3.getNotificationId();
            LinkedList b = f.b();
            b.remove(notificationId3);
            b.add(notificationId3);
            if (b.size() > 50) {
                b.remove(0);
            }
            JSONArray jSONArray = new JSONArray();
            try {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject().put("push_id", (String) it.next()));
                }
            } catch (JSONException unused) {
            }
            f.a.a("refated_push_notification_ids", jSONArray.toString());
        }
        Filters filters = pushMessage3.getFilters();
        if (filters == null || CoreUtils.isEmpty(filters.getContentId())) {
            return;
        }
        String contentId = filters.getContentId();
        LinkedList a2 = f.a();
        a2.remove(contentId);
        a2.add(contentId);
        if (a2.size() > 50) {
            a2.remove(0);
        }
        JSONArray jSONArray2 = new JSONArray();
        try {
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(new JSONObject().put(DownloadService.KEY_CONTENT_ID, (String) it2.next()));
            }
        } catch (JSONException unused2) {
        }
        f.a.a("refated_content_notification_ids", jSONArray2.toString());
    }

    public static void a(PushMessage pushMessage, String str, String str2) {
        PublicLogger.INSTANCE.info("Push filtered out. Category: %s. Details: %s", str, str2);
        String notificationId = pushMessage.getNotificationId();
        if (CoreUtils.isNotEmpty(notificationId)) {
            Y1.b.onNotificationIgnored(notificationId, str, str2, pushMessage.getPayload(), pushMessage.getTransport());
        }
    }
}
