package y8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static final y f41999d = new y();

    /* renamed from: a, reason: collision with root package name */
    public boolean f42000a;

    /* renamed from: b, reason: collision with root package name */
    public long f42001b;

    /* renamed from: c, reason: collision with root package name */
    public long f42002c;

    public z a() {
        this.f42000a = false;
        return this;
    }

    public z b() {
        this.f42002c = 0L;
        return this;
    }

    public long c() {
        if (this.f42000a) {
            return this.f42001b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j6) {
        this.f42000a = true;
        this.f42001b = j6;
        return this;
    }

    public boolean e() {
        return this.f42000a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f42000a && this.f42001b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j6) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        if (j6 >= 0) {
            this.f42002c = unit.toNanos(j6);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j6).toString());
    }
}
