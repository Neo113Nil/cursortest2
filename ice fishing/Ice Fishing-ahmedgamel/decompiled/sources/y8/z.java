package y8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static final y f41970d = new y();

    /* renamed from: a, reason: collision with root package name */
    public boolean f41971a;

    /* renamed from: b, reason: collision with root package name */
    public long f41972b;

    /* renamed from: c, reason: collision with root package name */
    public long f41973c;

    public z a() {
        this.f41971a = false;
        return this;
    }

    public z b() {
        this.f41973c = 0L;
        return this;
    }

    public long c() {
        if (this.f41971a) {
            return this.f41972b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j6) {
        this.f41971a = true;
        this.f41972b = j6;
        return this;
    }

    public boolean e() {
        return this.f41971a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f41971a && this.f41972b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j6) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        if (j6 >= 0) {
            this.f41973c = unit.toNanos(j6);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j6).toString());
    }
}
