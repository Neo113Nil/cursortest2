package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ND implements P3.a {

    /* renamed from: u, reason: collision with root package name */
    public static final ND f27257u = new ND(null);

    /* renamed from: v, reason: collision with root package name */
    public static final QD f27258v = new QD(ND.class);

    /* renamed from: n, reason: collision with root package name */
    public final Object f27259n;

    public ND(Object obj) {
        this.f27259n = obj;
    }

    @Override // P3.a
    public final void a(Runnable runnable, Executor executor) {
        AbstractC2792Sd.J(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e9) {
            Logger a9 = f27258v.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a9.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", com.IceFishing.LiveIceFishing.k.r(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e9);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f27259n;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f27259n);
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(obj).length() + 25 + valueOf.length() + 2), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f27259n;
    }
}
