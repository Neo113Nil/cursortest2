package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.aE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2935aE extends PD {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29810v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RunnableFutureC2989bE f29811w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29812x;

    public C2935aE(RunnableFutureC2989bE runnableFutureC2989bE, AD ad) {
        this.f29811w = runnableFutureC2989bE;
        this.f29812x = ad;
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final Object a() {
        switch (this.f29810v) {
            case 0:
                AD ad = (AD) this.f29812x;
                P3.a c9 = ad.c();
                if (c9 != null) {
                    return c9;
                }
                throw new NullPointerException(AbstractC2659Kg.x("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ad));
            default:
                return ((Callable) this.f29812x).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final String c() {
        switch (this.f29810v) {
            case 0:
                return ((AD) this.f29812x).toString();
            default:
                return ((Callable) this.f29812x).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final boolean d() {
        switch (this.f29810v) {
        }
        return this.f29811w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void e(Object obj) {
        switch (this.f29810v) {
            case 0:
                this.f29811w.n((P3.a) obj);
                break;
            default:
                this.f29811w.d(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void f(Throwable th) {
        switch (this.f29810v) {
            case 0:
                this.f29811w.e(th);
                break;
            default:
                this.f29811w.e(th);
                break;
        }
    }

    public C2935aE(RunnableFutureC2989bE runnableFutureC2989bE, Callable callable) {
        Objects.requireNonNull(runnableFutureC2989bE);
        this.f29811w = runnableFutureC2989bE;
        callable.getClass();
        this.f29812x = callable;
    }
}
