package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class N extends HashMap {
    public N(NotificationActionInfo notificationActionInfo) {
        put("actionType", notificationActionInfo.actionType);
        put("pushId", notificationActionInfo.pushId);
    }
}
