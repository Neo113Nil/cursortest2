package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider;
import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes4.dex */
public final class K implements LazyPushTransformRuleProvider {
    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider
    public final LazyPushTransformRule getRule(PushMessage pushMessage) {
        LazyPushTransformRuleProvider lazyPushTransformRuleProvider = AbstractC1013b1.a;
        if (lazyPushTransformRuleProvider != null) {
            return lazyPushTransformRuleProvider.getRule(pushMessage);
        }
        return null;
    }
}
