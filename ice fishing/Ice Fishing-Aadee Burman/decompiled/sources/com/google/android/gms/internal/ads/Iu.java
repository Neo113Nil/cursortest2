package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Iu implements N3.a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f25613n;

    /* renamed from: u, reason: collision with root package name */
    public final String f25614u;

    /* renamed from: v, reason: collision with root package name */
    public final N3.a f25615v;

    public Iu(Object obj, String str, N3.a aVar) {
        this.f25613n = obj;
        this.f25614u = str;
        this.f25615v = aVar;
    }

    @Override // N3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f25615v.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f25615v.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f25615v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f25615v.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f25615v.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.f25614u;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f25615v.get(j6, timeUnit);
    }
}
