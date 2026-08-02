package io.appmetrica.analytics.push.lazypush;

import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes4.dex */
public interface LazyPushTransformRuleProvider {
    LazyPushTransformRule getRule(PushMessage pushMessage);
}
