package y8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static final y f41996d = new y();

    /* renamed from: a, reason: collision with root package name */
    public boolean f41997a;

    /* renamed from: b, reason: collision with root package name */
    public long f41998b;

    /* renamed from: c, reason: collision with root package name */
    public long f41999c;

    public z a() {
        this.f41997a = false;
        return this;
    }

    public z b() {
        this.f41999c = 0L;
        return this;
    }

    public long c() {
        if (this.f41997a) {
            return this.f41998b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j6) {
        this.f41997a = true;
        this.f41998b = j6;
        return this;
    }

    public boolean e() {
        return this.f41997a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f41997a && this.f41998b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j6) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        if (j6 >= 0) {
            this.f41999c = unit.toNanos(j6);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j6).toString());
    }
}
