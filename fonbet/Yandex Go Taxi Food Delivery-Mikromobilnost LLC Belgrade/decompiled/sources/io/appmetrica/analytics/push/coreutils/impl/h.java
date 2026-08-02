package io.appmetrica.analytics.push.coreutils.impl;

import android.content.Context;
import io.appmetrica.analytics.push.coreutils.internal.service.PushServiceCommandLauncher;

/* loaded from: classes4.dex */
public final class h implements g {
    public final d a;

    public h(Context context) {
        this.a = new d(context);
    }

    @Override // io.appmetrica.analytics.push.coreutils.impl.g
    public final PushServiceCommandLauncher a() {
        return this.a;
    }
}
