package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ED extends PD {

    /* renamed from: v, reason: collision with root package name */
    public final Executor f24561v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FD f24562w;

    /* renamed from: x, reason: collision with root package name */
    public final Callable f24563x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ FD f24564y;

    public ED(FD fd, Callable callable, Executor executor) {
        this.f24564y = fd;
        this.f24562w = fd;
        executor.getClass();
        this.f24561v = executor;
        this.f24563x = callable;
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final Object a() {
        return this.f24563x.call();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final String c() {
        return this.f24563x.toString();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final boolean d() {
        return this.f24562w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void e(Object obj) {
        this.f24562w.f24757I = null;
        this.f24564y.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void f(Throwable th) {
        FD fd = this.f24562w;
        fd.f24757I = null;
        if (th instanceof ExecutionException) {
            fd.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            fd.cancel(false);
        } else {
            fd.e(th);
        }
    }
}
