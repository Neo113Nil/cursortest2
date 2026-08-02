package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0573nn {
    public volatile long a;
    public Lh b;
    public TimeProvider c;

    public static C0573nn c() {
        return AbstractC0544mn.a;
    }

    public final synchronized void a(long j, Long l) {
        try {
            this.a = (j - this.c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.b.b(true)) {
                if (l != null) {
                    long abs = Math.abs(j - this.c.currentTimeMillis());
                    Lh lh = this.b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    lh.d(z);
                } else {
                    this.b.d(false);
                }
            }
            this.b.b(this.a);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        this.b.d(false);
    }

    public final synchronized long d() {
        return this.a;
    }

    public final synchronized void e() {
        a(Jb.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.b.b(true);
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.a;
    }

    public final void a(Lh lh, TimeProvider timeProvider) {
        this.b = lh;
        this.a = lh.a(0);
        this.c = timeProvider;
    }
}
