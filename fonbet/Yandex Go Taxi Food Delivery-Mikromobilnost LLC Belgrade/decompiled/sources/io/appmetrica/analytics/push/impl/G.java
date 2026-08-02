package io.appmetrica.analytics.push.impl;

import defpackage.g8e;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class G {
    public static void a(String str, long j, String str2, String str3) {
        HashMap u = g8e.u("action", str, "service_type", str3);
        if (j != -1) {
            u.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        }
        if (str2 != null) {
            u.put("push_id", str2);
        }
        TrackersHub.getInstance().reportEvent("ActionDuration", u);
    }
}
