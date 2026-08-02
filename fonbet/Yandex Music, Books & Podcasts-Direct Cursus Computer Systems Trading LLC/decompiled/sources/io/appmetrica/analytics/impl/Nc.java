package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes5.dex */
public final class Nc {
    public final Handler a;
    public final AbstractC0768x3 b;
    public final Oc c;

    public Nc(Handler handler, AbstractC0768x3 abstractC0768x3) {
        this.a = handler;
        this.b = abstractC0768x3;
        this.c = new Oc(handler, abstractC0768x3);
    }

    public static void a(Handler handler, AbstractC0768x3 abstractC0768x3, Runnable runnable) {
        handler.removeCallbacks(runnable, abstractC0768x3.b.b.getApiKey());
        handler.postAtTime(runnable, abstractC0768x3.b.b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(abstractC0768x3.b.b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
