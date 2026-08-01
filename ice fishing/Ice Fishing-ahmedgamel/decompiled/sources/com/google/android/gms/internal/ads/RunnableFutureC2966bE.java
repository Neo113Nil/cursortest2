package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.bE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableFutureC2966bE extends HD implements RunnableFuture {

    /* renamed from: A, reason: collision with root package name */
    public volatile PD f29247A;

    public RunnableFutureC2966bE(Callable callable) {
        this.f29247A = new C2912aE(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final void f() {
        PD pd;
        if (m() && (pd = this.f29247A) != null) {
            pd.g();
        }
        this.f29247A = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final String g() {
        PD pd = this.f29247A;
        if (pd == null) {
            return super.g();
        }
        String pd2 = pd.toString();
        return D.y.s(new StringBuilder(pd2.length() + 7), "task=[", pd2, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        PD pd = this.f29247A;
        if (pd != null) {
            pd.run();
        }
        this.f29247A = null;
    }
}
