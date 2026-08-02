package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;

/* loaded from: classes4.dex */
public abstract class C2 {
    public static D2 a(PushMessage pushMessage, String str, String str2) {
        return new D2(pushMessage, PushFilter.FilterResult.silence(str, str2));
    }

    public abstract D2 a(PushMessage pushMessage);
}
