package io.appmetrica.analytics.push.coreutils.impl;

import android.content.Context;
import io.appmetrica.analytics.push.coreutils.internal.service.PushServiceCommandLauncher;

/* loaded from: classes9.dex */
public final class f implements g {
    public final c a;

    public f(Context context) {
        this.a = new c(context);
    }

    @Override // io.appmetrica.analytics.push.coreutils.impl.g
    public final PushServiceCommandLauncher a() {
        return this.a;
    }
}
