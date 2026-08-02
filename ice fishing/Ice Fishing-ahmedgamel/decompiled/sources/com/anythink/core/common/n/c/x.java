package com.anythink.core.common.n.c;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f16712c = new x() { // from class: com.anythink.core.common.n.c.x.1
        @Override // com.anythink.core.common.n.c.x
        public final x a(long j6) {
            return this;
        }

        @Override // com.anythink.core.common.n.c.x
        public final void g() {
        }

        @Override // com.anythink.core.common.n.c.x
        public final x a(long j6, TimeUnit timeUnit) {
            return this;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private boolean f16713a;

    /* renamed from: b, reason: collision with root package name */
    private long f16714b;

    /* renamed from: d, reason: collision with root package name */
    private long f16715d;

    private static long a(long j6, long j9) {
        return (j6 != 0 && (j9 == 0 || j6 < j9)) ? j6 : j9;
    }

    private x b(long j6, TimeUnit timeUnit) {
        if (j6 <= 0) {
            throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(j6)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return a(timeUnit.toNanos(j6) + System.nanoTime());
    }

    public x f() {
        this.f16713a = false;
        return this;
    }

    public boolean f_() {
        return this.f16713a;
    }

    public void g() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f16713a && this.f16714b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long g_() {
        if (this.f16713a) {
            return this.f16714b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x h_() {
        this.f16715d = 0L;
        return this;
    }

    public long i_() {
        return this.f16715d;
    }

    public x a(long j6, TimeUnit timeUnit) {
        if (j6 < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j6)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f16715d = timeUnit.toNanos(j6);
        return this;
    }

    public x a(long j6) {
        this.f16713a = true;
        this.f16714b = j6;
        return this;
    }

    private void a(Object obj) {
        try {
            boolean f_ = f_();
            long i_ = i_();
            long j6 = 0;
            if (!f_ && i_ == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (f_ && i_ != 0) {
                i_ = Math.min(i_, g_() - nanoTime);
            } else if (f_) {
                i_ = g_() - nanoTime;
            }
            if (i_ > 0) {
                long j9 = i_ / 1000000;
                obj.wait(j9, (int) (i_ - (1000000 * j9)));
                j6 = System.nanoTime() - nanoTime;
            }
            if (j6 >= i_) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
