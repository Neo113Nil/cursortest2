package io.appmetrica.analytics.push.coreutils.internal.service;

import android.content.Context;
import io.appmetrica.analytics.push.coreutils.impl.e;
import io.appmetrica.analytics.push.coreutils.impl.f;
import io.appmetrica.analytics.push.coreutils.impl.g;

/* loaded from: classes9.dex */
public class PushServiceControllerProvider {
    private final g a;
    private final e b;

    public PushServiceControllerProvider(Context context) {
        this.a = a(context);
        this.b = new e(context);
    }

    private static g a(Context context) {
        return new f(context);
    }

    public PushServiceCommandLauncher getPushServiceCommandLauncher(boolean z) {
        return z ? this.a.a() : this.b.a;
    }

    public PushServiceCommandLauncher getPushServiceCommandLauncher() {
        return getPushServiceCommandLauncher(true);
    }
}
