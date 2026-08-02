package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes9.dex */
public final class S0 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ T0 b;

    public S0(T0 t0, Context context) {
        this.b = t0;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0369gl c0369gl = this.b.g;
        Context context = this.a;
        c0369gl.getClass();
        V4.l().l.a(context);
    }
}
