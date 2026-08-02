package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;

/* loaded from: classes4.dex */
public final class D2 {
    public final PushFilter.FilterResult a;
    public final PushMessage b;

    public D2(PushMessage pushMessage, PushFilter.FilterResult filterResult) {
        this.a = filterResult;
        this.b = pushMessage;
    }
}
