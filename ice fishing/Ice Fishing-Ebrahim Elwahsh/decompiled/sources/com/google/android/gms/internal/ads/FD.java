package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class FD extends QD {

    /* renamed from: v, reason: collision with root package name */
    public final Executor f24927v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GD f24928w;

    /* renamed from: x, reason: collision with root package name */
    public final Callable f24929x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ GD f24930y;

    public FD(GD gd, Callable callable, Executor executor) {
        this.f24930y = gd;
        this.f24928w = gd;
        executor.getClass();
        this.f24927v = executor;
        this.f24929x = callable;
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final Object a() {
        return this.f24929x.call();
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final String c() {
        return this.f24929x.toString();
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final boolean d() {
        return this.f24928w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final void e(Object obj) {
        this.f24928w.f25114I = null;
        this.f24930y.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.QD
    public final void f(Throwable th) {
        GD gd = this.f24928w;
        gd.f25114I = null;
        if (th instanceof ExecutionException) {
            gd.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            gd.cancel(false);
        } else {
            gd.e(th);
        }
    }
}
