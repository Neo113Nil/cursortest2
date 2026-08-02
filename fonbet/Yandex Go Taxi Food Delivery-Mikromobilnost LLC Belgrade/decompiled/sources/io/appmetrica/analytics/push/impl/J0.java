package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;

/* loaded from: classes4.dex */
public final class J0 extends C2 {
    public final Context a;

    public J0(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.impl.C2
    public final D2 a(PushMessage pushMessage) {
        PushFilter.FilterResult filter = r.a(this.a).e().a.filter(pushMessage);
        return filter.isShow() ? new D2(pushMessage, PushFilter.FilterResult.show()) : C2.a(pushMessage, filter.category, filter.details);
    }
}
