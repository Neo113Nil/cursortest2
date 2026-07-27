package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Ku implements J3.a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f26061n;

    /* renamed from: u, reason: collision with root package name */
    public final String f26062u;

    /* renamed from: v, reason: collision with root package name */
    public final J3.a f26063v;

    public Ku(Object obj, String str, J3.a aVar) {
        this.f26061n = obj;
        this.f26062u = str;
        this.f26063v = aVar;
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        this.f26063v.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return this.f26063v.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f26063v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26063v.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26063v.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.f26062u;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f26063v.get(j9, timeUnit);
    }
}
