package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.push.impl.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1015c extends HashMap {
    public C1015c(NotificationActionInfo notificationActionInfo) {
        put("actionId", notificationActionInfo.actionId);
        put("notificationId", Integer.valueOf(notificationActionInfo.notificationId));
        put("notificationTag", notificationActionInfo.notificationTag);
        put("pushId", notificationActionInfo.pushId);
    }
}
