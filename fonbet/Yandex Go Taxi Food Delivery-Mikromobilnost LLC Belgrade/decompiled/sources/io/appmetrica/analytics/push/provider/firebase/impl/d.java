package io.appmetrica.analytics.push.provider.firebase.impl;

import io.appmetrica.analytics.push.provider.api.PushServiceExecutionRestrictions;

/* loaded from: classes4.dex */
public final class d extends PushServiceExecutionRestrictions {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    @Override // io.appmetrica.analytics.push.provider.api.PushServiceExecutionRestrictions
    public final Long getMaxTaskExecutionDurationSeconds() {
        return Long.valueOf(this.a.b);
    }
}
