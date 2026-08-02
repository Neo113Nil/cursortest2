package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.push.impl.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1019d extends HashMap {
    public C1019d(NotificationActionInfo notificationActionInfo) {
        put("actionId", notificationActionInfo.actionId);
        put("pushId", notificationActionInfo.pushId);
    }
}
