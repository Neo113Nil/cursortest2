package io.appmetrica.analytics.push.impl;

import defpackage.oyr;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class q2 {
    public final HashMap a = new HashMap();

    public final String a(String str) {
        for (Map.Entry entry : this.a.entrySet()) {
            String p = oyr.p("[{]", (String) entry.getKey(), "[}]");
            if (str.matches(".*" + p + ".*")) {
                str = str.replaceAll(p, ((LazyPushTransformRule) entry.getValue()).getNewValue((String) entry.getKey()));
            }
        }
        return str;
    }
}
