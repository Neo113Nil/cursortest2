package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3952tA {

    /* renamed from: a, reason: collision with root package name */
    public final Cy f35007a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f35008b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public long f35009c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f35010d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f35011e = null;

    /* renamed from: f, reason: collision with root package name */
    public final int f35012f;

    public C3952tA(int i, Cy cy) {
        this.f35012f = i;
        this.f35007a = cy;
    }

    public final void a() {
        if (this.f35008b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f35009c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.f35008b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f35011e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f35008b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f35010d = SystemClock.uptimeMillis();
        ((Gy) this.f35007a).a(this.f35012f - 1, atomicBoolean.get() ? this.f35010d - this.f35009c : -1L, this.f35011e, null);
    }
}
