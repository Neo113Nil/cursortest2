package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.push.AppMetricaPush;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import io.appmetrica.analytics.push.intent.NotificationActionType;

/* renamed from: io.appmetrica.analytics.push.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1049k1 {
    public static void a(Context context, Intent intent) {
        C1080v c1080v = r.a(context).f;
        if (c1080v.e == null) {
            synchronized (c1080v.a) {
                try {
                    if (c1080v.e == null) {
                        c1080v.e = new O();
                        O o = c1080v.e;
                        o.a.put(NotificationActionType.CLEAR, new C());
                        O o2 = c1080v.e;
                        o2.a.put(NotificationActionType.CLICK, new C1());
                        O o3 = c1080v.e;
                        o3.a.put(NotificationActionType.ADDITIONAL_ACTION, new C1023e());
                        O o4 = c1080v.e;
                        o4.a.put(NotificationActionType.INLINE_ACTION, new R0());
                    }
                } finally {
                }
            }
        }
        O o5 = c1080v.e;
        o5.getClass();
        NotificationActionInfo notificationActionInfo = (NotificationActionInfo) intent.getParcelableExtra(AppMetricaPush.EXTRA_ACTION_INFO);
        if (notificationActionInfo == null) {
            TrackersHub.getInstance().reportEvent("No action info for DefaultNotificationActionProcessor");
            return;
        }
        InterfaceC1053l1 interfaceC1053l1 = (InterfaceC1053l1) o5.a.get(notificationActionInfo.actionType);
        if (interfaceC1053l1 != null) {
            interfaceC1053l1.a(context, intent);
        } else {
            TrackersHub.getInstance().reportEvent("No strategy", new N(notificationActionInfo));
        }
    }
}
