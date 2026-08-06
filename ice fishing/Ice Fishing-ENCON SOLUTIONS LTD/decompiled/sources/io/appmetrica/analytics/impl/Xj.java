package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Xj {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f5400a;

    /* renamed from: b, reason: collision with root package name */
    public Ze f5401b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f5402c;

    public static Xj c() {
        return Wj.f5313a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f5400a;
    }

    public final synchronized void b() {
        this.f5401b.d(false);
        this.f5401b.b();
    }

    public final synchronized long d() {
        return this.f5400a;
    }

    public final synchronized void e() {
        a(C0610na.f6575I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f5401b.b(true);
    }

    public final synchronized void a(long j2, Long l2) {
        try {
            this.f5400a = (j2 - this.f5402c.currentTimeMillis()) / 1000;
            boolean z2 = true;
            if (this.f5401b.b(true)) {
                if (l2 != null) {
                    long abs = Math.abs(j2 - this.f5402c.currentTimeMillis());
                    Ze ze = this.f5401b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l2.longValue())) {
                        z2 = false;
                    }
                    ze.d(z2);
                } else {
                    this.f5401b.d(false);
                }
            }
            this.f5401b.d(this.f5400a);
            this.f5401b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(Ze ze, TimeProvider timeProvider) {
        this.f5401b = ze;
        this.f5400a = ze.a(0);
        this.f5402c = timeProvider;
    }
}
