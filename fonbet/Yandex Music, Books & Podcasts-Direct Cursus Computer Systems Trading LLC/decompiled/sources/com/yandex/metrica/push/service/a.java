package com.yandex.metrica.push.service;

import com.yandex.metrica.push.common.utils.TrackersHub;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;

/* loaded from: classes3.dex */
class a {
    public static void a(String str, long j, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_ACTION, str);
        hashMap.put("service_type", str3);
        if (j != -1) {
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        }
        if (str2 != null) {
            hashMap.put("push_id", str2);
        }
        TrackersHub.getInstance().reportEvent("ActionDuration", hashMap);
    }
}
