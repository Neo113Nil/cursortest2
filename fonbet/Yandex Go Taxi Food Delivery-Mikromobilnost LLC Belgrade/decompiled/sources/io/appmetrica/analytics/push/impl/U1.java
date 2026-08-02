package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider;
import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes4.dex */
public final class U1 implements LazyPushTransformRuleProvider {
    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider
    public final LazyPushTransformRule getRule(PushMessage pushMessage) {
        return new T1(pushMessage.getNotificationId());
    }
}
