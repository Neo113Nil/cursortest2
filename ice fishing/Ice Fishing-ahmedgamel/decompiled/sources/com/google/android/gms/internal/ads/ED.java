package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ED extends PD {

    /* renamed from: v, reason: collision with root package name */
    public final Executor f25322v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FD f25323w;

    /* renamed from: x, reason: collision with root package name */
    public final Callable f25324x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ FD f25325y;

    public ED(FD fd, Callable callable, Executor executor) {
        this.f25325y = fd;
        this.f25323w = fd;
        executor.getClass();
        this.f25322v = executor;
        this.f25324x = callable;
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final Object a() {
        return this.f25324x.call();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final String c() {
        return this.f25324x.toString();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final boolean d() {
        return this.f25323w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void e(Object obj) {
        this.f25323w.f25513I = null;
        this.f25325y.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public final void f(Throwable th) {
        FD fd = this.f25323w;
        fd.f25513I = null;
        if (th instanceof ExecutionException) {
            fd.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            fd.cancel(false);
        } else {
            fd.e(th);
        }
    }
}
