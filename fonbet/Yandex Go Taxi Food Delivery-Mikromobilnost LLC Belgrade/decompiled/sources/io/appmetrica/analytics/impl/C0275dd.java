package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0275dd {
    public final Handler a;
    public final AbstractC0842x3 b;
    public final RunnableC0303ed c;

    public C0275dd(Handler handler, AbstractC0842x3 abstractC0842x3) {
        this.a = handler;
        this.b = abstractC0842x3;
        this.c = new RunnableC0303ed(handler, abstractC0842x3);
    }

    public static void a(Handler handler, AbstractC0842x3 abstractC0842x3, Runnable runnable) {
        handler.removeCallbacks(runnable, abstractC0842x3.b.b.getApiKey());
        handler.postAtTime(runnable, abstractC0842x3.b.b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(abstractC0842x3.b.b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
