package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class T1 implements LazyPushTransformRule {
    public final String a;

    public T1(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRule
    public final String getNewValue(String str) {
        if (CoreUtils.isEmpty(this.a)) {
            throw new B2("PushId is empty", null);
        }
        return this.a;
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRule
    public final List getPatternList() {
        return Collections.singletonList("pushId");
    }
}
