package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.aE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2912aE extends PD {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29040v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RunnableFutureC2966bE f29041w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29042x;

    public C2912aE(RunnableFutureC2966bE runnableFutureC2966bE, AD ad) {
        this.f29041w = runnableFutureC2966bE;
        this.f29042x = ad;
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final Object a() {
        switch (this.f29040v) {
            case 0:
                AD ad = (AD) this.f29042x;
                N3.a c9 = ad.c();
                if (c9 != null) {
                    return c9;
                }
                throw new NullPointerException(AbstractC2639Kg.x("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ad));
            default:
                return ((Callable) this.f29042x).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final String c() {
        switch (this.f29040v) {
            case 0:
                return ((AD) this.f29042x).toString();
            default:
                return ((Callable) this.f29042x).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final boolean d() {
        switch (this.f29040v) {
        }
        return this.f29041w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void e(Object obj) {
        switch (this.f29040v) {
            case 0:
                this.f29041w.n((N3.a) obj);
                break;
            default:
                this.f29041w.d(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void f(Throwable th) {
        switch (this.f29040v) {
            case 0:
                this.f29041w.e(th);
                break;
            default:
                this.f29041w.e(th);
                break;
        }
    }

    public C2912aE(RunnableFutureC2966bE runnableFutureC2966bE, Callable callable) {
        Objects.requireNonNull(runnableFutureC2966bE);
        this.f29041w = runnableFutureC2966bE;
        callable.getClass();
        this.f29042x = callable;
    }
}
