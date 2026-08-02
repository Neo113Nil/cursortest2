package io.appmetrica.analytics.push.impl;

import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1066q extends AbstractC1074t {
    public final String c;
    public final C1039i d;

    public C1066q(String str, String str2, C1039i c1039i) {
        super(2, str2);
        this.c = str;
        this.d = c1039i;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, this.c);
            jSONObject.put("action", this.d.a());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
