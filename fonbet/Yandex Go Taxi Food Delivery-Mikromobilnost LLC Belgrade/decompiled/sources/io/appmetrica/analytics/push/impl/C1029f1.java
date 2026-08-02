package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider;
import io.appmetrica.analytics.push.model.LazyPushRequestInfo;
import io.appmetrica.analytics.push.model.PushMessage;

/* renamed from: io.appmetrica.analytics.push.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1029f1 implements LazyPushTransformRuleProvider {
    public final Context a;

    public C1029f1(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider
    public final LazyPushTransformRule getRule(PushMessage pushMessage) {
        LazyPushRequestInfo lazyPushRequestInfo = pushMessage.getLazyPushRequestInfo();
        if (lazyPushRequestInfo != null) {
            return new C1025e1(this.a, lazyPushRequestInfo.getLocationRequestInfo());
        }
        return null;
    }
}
