package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3028cE extends QD {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29654v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RunnableFutureC3083dE f29655w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29656x;

    public C3028cE(RunnableFutureC3083dE runnableFutureC3083dE, BD bd) {
        this.f29655w = runnableFutureC3083dE;
        this.f29656x = bd;
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final Object a() {
        switch (this.f29654v) {
            case 0:
                BD bd = (BD) this.f29656x;
                J3.a a9 = bd.a();
                if (a9 != null) {
                    return a9;
                }
                throw new NullPointerException(AbstractC3194fG.u("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", bd));
            default:
                return ((Callable) this.f29656x).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final String c() {
        switch (this.f29654v) {
            case 0:
                return ((BD) this.f29656x).toString();
            default:
                return ((Callable) this.f29656x).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final boolean d() {
        switch (this.f29654v) {
        }
        return this.f29655w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final void e(Object obj) {
        switch (this.f29654v) {
            case 0:
                this.f29655w.n((J3.a) obj);
                break;
            default:
                this.f29655w.d(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final void f(Throwable th) {
        switch (this.f29654v) {
            case 0:
                this.f29655w.e(th);
                break;
            default:
                this.f29655w.e(th);
                break;
        }
    }

    public C3028cE(RunnableFutureC3083dE runnableFutureC3083dE, Callable callable) {
        Objects.requireNonNull(runnableFutureC3083dE);
        this.f29655w = runnableFutureC3083dE;
        callable.getClass();
        this.f29656x = callable;
    }
}
