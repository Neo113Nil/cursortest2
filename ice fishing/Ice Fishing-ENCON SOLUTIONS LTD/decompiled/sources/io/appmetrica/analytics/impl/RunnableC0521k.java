package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0521k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f6332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0573m f6333b;

    public RunnableC0521k(C0573m c0573m, Activity activity) {
        this.f6333b = c0573m;
        this.f6332a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6333b.a(this.f6332a);
    }
}
