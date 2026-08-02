package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0783v2 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ C0812w2 b;

    public RunnableC0783v2(C0812w2 c0812w2, Context context) {
        this.b = c0812w2;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.c(this.a);
    }
}
