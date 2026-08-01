package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.kg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3467kg implements N3.a {

    /* renamed from: n, reason: collision with root package name */
    public final XD f31479n = new XD();

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f31479n.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean d2 = this.f31479n.d(obj);
        if (!d2) {
            C4835j.f39733C.f39743h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return d2;
    }

    public final void c(Throwable th) {
        if (this.f31479n.e(th)) {
            return;
        }
        C4835j.f39733C.f39743h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        return this.f31479n.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31479n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31479n.f33220n instanceof C2911aD;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31479n.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f31479n.get(j6, timeUnit);
    }
}
