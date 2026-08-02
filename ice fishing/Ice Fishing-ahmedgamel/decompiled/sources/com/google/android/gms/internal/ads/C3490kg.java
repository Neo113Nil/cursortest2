package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.kg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3490kg implements P3.a {

    /* renamed from: n, reason: collision with root package name */
    public final XD f32256n = new XD();

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f32256n.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean d9 = this.f32256n.d(obj);
        if (!d9) {
            C4906k.f40186C.f40196h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return d9;
    }

    public final void c(Throwable th) {
        if (this.f32256n.e(th)) {
            return;
        }
        C4906k.f40186C.f40196h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.f32256n.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f32256n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f32256n.f34004n instanceof C2934aD;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f32256n.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f32256n.get(j6, timeUnit);
    }
}
