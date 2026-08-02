package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Iu implements P3.a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f26366n;

    /* renamed from: u, reason: collision with root package name */
    public final String f26367u;

    /* renamed from: v, reason: collision with root package name */
    public final P3.a f26368v;

    public Iu(Object obj, String str, P3.a aVar) {
        this.f26366n = obj;
        this.f26367u = str;
        this.f26368v = aVar;
    }

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f26368v.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f26368v.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f26368v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26368v.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26368v.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.f26367u;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f26368v.get(j6, timeUnit);
    }
}
