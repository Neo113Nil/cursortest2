package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0491l implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C0549n b;

    public RunnableC0491l(C0549n c0549n, Activity activity) {
        this.b = c0549n;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
