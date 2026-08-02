package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Vm {
    public volatile long a;
    public C0724vh b;
    public TimeProvider c;

    public static Vm c() {
        return Um.a;
    }

    public final synchronized void a(long j, Long l) {
        try {
            this.a = (j - this.c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.b.b(true)) {
                if (l != null) {
                    long abs = Math.abs(j - this.c.currentTimeMillis());
                    C0724vh c0724vh = this.b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    c0724vh.d(z);
                } else {
                    this.b.d(false);
                }
            }
            this.b.d(this.a);
            this.b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        this.b.d(false);
        this.b.b();
    }

    public final synchronized long d() {
        return this.a;
    }

    public final synchronized void e() {
        a(C0747wb.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.b.b(true);
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.a;
    }

    public final void a(C0724vh c0724vh, TimeProvider timeProvider) {
        this.b = c0724vh;
        this.a = c0724vh.a(0);
        this.c = timeProvider;
    }
}
