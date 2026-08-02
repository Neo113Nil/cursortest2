package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0332fd;
import io.appmetrica.analytics.impl.C0672r7;
import io.appmetrica.analytics.impl.C0823wd;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.impl.L6;

/* loaded from: classes4.dex */
public final class CounterAttribute {
    private final C0672r7 a;

    public CounterAttribute(String str, C0332fd c0332fd, C0823wd c0823wd) {
        this.a = new C0672r7(str, c0332fd, c0823wd);
    }

    public UserProfileUpdate<? extends Hr> withDelta(double d) {
        return new UserProfileUpdate<>(new L6(this.a.c, d));
    }
}
