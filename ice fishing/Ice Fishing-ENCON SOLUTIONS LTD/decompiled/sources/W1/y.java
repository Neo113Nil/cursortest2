package W1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f1911d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1912a;

    /* renamed from: b, reason: collision with root package name */
    public long f1913b;

    /* renamed from: c, reason: collision with root package name */
    public long f1914c;

    public y a() {
        this.f1912a = false;
        return this;
    }

    public y b() {
        this.f1914c = 0L;
        return this;
    }

    public long c() {
        if (this.f1912a) {
            return this.f1913b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j2) {
        this.f1912a = true;
        this.f1913b = j2;
        return this;
    }

    public boolean e() {
        return this.f1912a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f1912a && this.f1913b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j2, TimeUnit unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (j2 >= 0) {
            this.f1914c = unit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
