package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3929tA {

    /* renamed from: a, reason: collision with root package name */
    public final Cy f34221a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f34222b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public long f34223c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f34224d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f34225e = null;

    /* renamed from: f, reason: collision with root package name */
    public final int f34226f;

    public C3929tA(int i, Cy cy) {
        this.f34226f = i;
        this.f34221a = cy;
    }

    public final void a() {
        if (this.f34222b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f34223c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.f34222b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f34225e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f34222b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f34224d = SystemClock.uptimeMillis();
        ((Gy) this.f34221a).a(this.f34226f - 1, atomicBoolean.get() ? this.f34224d - this.f34223c : -1L, this.f34225e, null);
    }
}
