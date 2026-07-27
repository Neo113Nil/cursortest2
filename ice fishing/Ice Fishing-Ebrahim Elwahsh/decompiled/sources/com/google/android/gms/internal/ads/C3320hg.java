package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.hg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3320hg implements J3.a {

    /* renamed from: n, reason: collision with root package name */
    public final ZD f31242n = new ZD();

    public final boolean a(Object obj) {
        boolean d2 = this.f31242n.d(obj);
        if (!d2) {
            p2.j.f39798C.f39808h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return d2;
    }

    public final void b(Throwable th) {
        if (this.f31242n.e(th)) {
            return;
        }
        p2.j.f39798C.f39808h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        this.f31242n.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.f31242n.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31242n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31242n.f33992n instanceof C2973bD;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31242n.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f31242n.get(j9, timeUnit);
    }
}
