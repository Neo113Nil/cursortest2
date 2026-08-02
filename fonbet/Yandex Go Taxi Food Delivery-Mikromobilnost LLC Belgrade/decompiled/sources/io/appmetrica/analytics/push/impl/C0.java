package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider;
import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes4.dex */
public final class C0 implements LazyPushTransformRuleProvider {
    public final Context a;

    public C0(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider
    public final LazyPushTransformRule getRule(PushMessage pushMessage) {
        return new B0(this.a);
    }
}
