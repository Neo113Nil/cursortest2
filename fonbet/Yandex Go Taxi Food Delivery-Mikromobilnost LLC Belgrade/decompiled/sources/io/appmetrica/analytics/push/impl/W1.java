package io.appmetrica.analytics.push.impl;

import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes4.dex */
public final class W1 {
    public final String a;
    public final Integer b;
    public final String c;
    public final Boolean d;

    public W1(String str, Integer num, String str2, Boolean bool) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = bool;
    }

    public static JSONObject a(W1 w1) {
        w1.getClass();
        return new JSONObject().put("push_id", w1.a).put(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, w1.b).put(CancelNotificationBroadcastReceiver.NOTIFICATION_TAG, w1.c).put(ClidProvider.APP_ACTIVE, w1.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W1.class == obj.getClass()) {
            W1 w1 = (W1) obj;
            if (!this.b.equals(w1.b)) {
                return false;
            }
            String str = this.c;
            String str2 = w1.c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
