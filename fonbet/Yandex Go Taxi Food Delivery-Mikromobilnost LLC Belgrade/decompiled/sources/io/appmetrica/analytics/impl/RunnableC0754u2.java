package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0754u2 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ long b;
    public final /* synthetic */ C0812w2 c;

    public RunnableC0754u2(C0812w2 c0812w2, Context context, long j) {
        this.c = c0812w2;
        this.a = context;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
