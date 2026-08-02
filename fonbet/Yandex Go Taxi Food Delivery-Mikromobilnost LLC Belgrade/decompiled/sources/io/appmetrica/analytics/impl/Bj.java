package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes9.dex */
public final class Bj implements Y6 {
    public final Context a;
    public final U4 b;
    public final IHandlerExecutor c = Jb.k().w().g();

    public Bj(Context context, U4 u4) {
        this.a = context;
        this.b = u4;
    }

    public final void a(K6 k6, Bundle bundle) {
        if (k6.m()) {
            return;
        }
        this.c.execute(new Yj(this.a, k6, bundle, this.b));
    }

    public final void a(J4 j4, K6 k6, C0468k5 c0468k5) {
        this.b.a(j4, c0468k5).a(k6, c0468k5);
        this.b.a(j4.b, j4.c, j4.d);
    }
}
