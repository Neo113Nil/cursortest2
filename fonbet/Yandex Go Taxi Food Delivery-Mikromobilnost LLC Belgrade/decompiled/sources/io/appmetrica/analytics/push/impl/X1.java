package io.appmetrica.analytics.push.impl;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public final class X1 {
    public final M1 a;

    public X1(M1 m1) {
        this.a = m1;
    }

    public final void a(String str, Integer num, String str2, boolean z) {
        LinkedList c = c();
        W1 w1 = new W1(str, num, str2, Boolean.valueOf(z));
        c.remove(w1);
        c.add(w1);
        if (c.size() > 50) {
            c.remove(0);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                jSONArray.put(W1.a((W1) it.next()));
            }
        } catch (JSONException unused) {
        }
        this.a.a("refated_push_notification_info_list", jSONArray.toString());
    }

    public final LinkedList b() {
        M1 m1 = this.a;
        String string = m1.a.getSharedPreferences(m1.b, 0).getString("refated_push_notification_ids", "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedList.add(jSONArray.getJSONObject(i).getString("push_id"));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    public final LinkedList c() {
        M1 m1 = this.a;
        String string = m1.a.getSharedPreferences(m1.b, 0).getString("refated_push_notification_info_list", "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                linkedList.add(new W1(jSONObject.getString("push_id"), Integer.valueOf(jSONObject.getInt(CancelNotificationBroadcastReceiver.NOTIFICATION_ID)), jSONObject.has(CancelNotificationBroadcastReceiver.NOTIFICATION_TAG) ? jSONObject.getString(CancelNotificationBroadcastReceiver.NOTIFICATION_TAG) : null, jSONObject.has(ClidProvider.APP_ACTIVE) ? Boolean.valueOf(jSONObject.getBoolean(ClidProvider.APP_ACTIVE)) : null));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    public final void b(String str) {
        W1 w1;
        Iterator it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                w1 = null;
                break;
            } else {
                w1 = (W1) it.next();
                if (w1.a.equals(str)) {
                    break;
                }
            }
        }
        if (w1 != null) {
            a(str, w1.b, w1.c, false);
        }
    }

    public final LinkedList a() {
        M1 m1 = this.a;
        String string = m1.a.getSharedPreferences(m1.b, 0).getString("refated_content_notification_ids", "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedList.add(jSONArray.getJSONObject(i).getString(DownloadService.KEY_CONTENT_ID));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    public final LinkedList a(String str) {
        M1 m1 = this.a;
        m1.getClass();
        String string = m1.a.getSharedPreferences(m1.b, 0).getString("shown_times_millis_by_channel_id" + str, "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedList.add(Long.valueOf(jSONArray.getLong(i)));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }
}
