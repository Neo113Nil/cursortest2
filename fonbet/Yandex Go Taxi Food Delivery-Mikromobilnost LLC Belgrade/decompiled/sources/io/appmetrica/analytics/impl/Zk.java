package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes9.dex */
public final class Zk implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ C0225bl b;

    public Zk(C0225bl c0225bl, Context context) {
        this.b = c0225bl;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F0 f0 = this.b.b;
        Context context = this.a;
        f0.getClass();
        E0.a(context);
    }
}
