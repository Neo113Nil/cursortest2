package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0351g3 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ C0380h3 c;

    public RunnableC0351g3(C0380h3 c0380h3, Context context, Intent intent) {
        this.c = c0380h3;
        this.a = context;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.consume(this.a, this.b);
    }
}
