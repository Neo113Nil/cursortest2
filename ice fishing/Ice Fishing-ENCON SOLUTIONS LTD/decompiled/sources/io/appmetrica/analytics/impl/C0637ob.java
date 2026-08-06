package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637ob {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6670a;

    /* renamed from: b, reason: collision with root package name */
    public final I2 f6671b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0663pb f6672c;

    public C0637ob(Handler handler, I2 i2) {
        this.f6670a = handler;
        this.f6671b = i2;
        this.f6672c = new RunnableC0663pb(handler, i2);
    }

    public static void a(Handler handler, I2 i2, Runnable runnable) {
        handler.removeCallbacks(runnable, i2.f4495b.f4459b.getApiKey());
        handler.postAtTime(runnable, i2.f4495b.f4459b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(i2.f4495b.f4459b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
