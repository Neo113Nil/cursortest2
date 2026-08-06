package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0731s2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0757t2 f6879c;

    public RunnableC0731s2(C0757t2 c0757t2, Context context, Intent intent) {
        this.f6879c = c0757t2;
        this.f6877a = context;
        this.f6878b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6879c.f6930a.consume(this.f6877a, this.f6878b);
    }
}
