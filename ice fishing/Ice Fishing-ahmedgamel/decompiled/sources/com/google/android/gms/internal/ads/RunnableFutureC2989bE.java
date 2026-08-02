package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.bE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableFutureC2989bE extends HD implements RunnableFuture {

    /* renamed from: A, reason: collision with root package name */
    public volatile PD f30035A;

    public RunnableFutureC2989bE(Callable callable) {
        this.f30035A = new C2935aE(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final void f() {
        PD pd;
        if (m() && (pd = this.f30035A) != null) {
            pd.g();
        }
        this.f30035A = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final String g() {
        PD pd = this.f30035A;
        if (pd == null) {
            return super.g();
        }
        String pd2 = pd.toString();
        return D.x.p(new StringBuilder(pd2.length() + 7), "task=[", pd2, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        PD pd = this.f30035A;
        if (pd != null) {
            pd.run();
        }
        this.f30035A = null;
    }
}
