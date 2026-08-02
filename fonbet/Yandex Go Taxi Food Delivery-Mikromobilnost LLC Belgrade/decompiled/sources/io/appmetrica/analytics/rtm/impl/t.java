package io.appmetrica.analytics.rtm.impl;

import io.appmetrica.analytics.rtm.internal.service.RtmAppHostStaticsInitializer;

/* loaded from: classes9.dex */
public final class t implements A {
    public final RtmAppHostStaticsInitializer a;

    public t(RtmAppHostStaticsInitializer rtmAppHostStaticsInitializer) {
        this.a = rtmAppHostStaticsInitializer;
    }

    @Override // io.appmetrica.analytics.rtm.impl.A
    public final void a(String str) {
        this.a.updateUploadUrl(RtmAppHostStaticsInitializer.Scope.MAIN, str);
    }
}
