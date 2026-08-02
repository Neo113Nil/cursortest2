package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class H implements D {
    public final D a;
    public final F b;
    public final CountDownLatch c = new CountDownLatch(1);
    public final Handler d = new Handler(Looper.getMainLooper());

    public H(D d, F f) {
        this.a = d;
        this.b = f;
    }

    @Override // io.appmetrica.analytics.push.impl.D
    public final void a(Context context, Bundle bundle) {
        long a = this.b.a(context, bundle);
        Handler handler = this.d;
        com.yandex.passport.internal.n nVar = new com.yandex.passport.internal.n(12, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        handler.postDelayed(nVar, timeUnit.toMillis(a));
        this.a.a(context, bundle);
        try {
            this.c.await(a, timeUnit);
        } catch (Throwable unused) {
        }
    }

    public static final void a(H h) {
        h.c.countDown();
    }
}
