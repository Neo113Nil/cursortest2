package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0417l implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C0475n b;

    public RunnableC0417l(C0475n c0475n, Activity activity) {
        this.b = c0475n;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
