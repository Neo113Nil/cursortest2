package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class ydz0 {
    public static final xdz0 d = new xdz0();
    public boolean a;
    public long b;
    public long c;

    public ydz0 a() {
        this.a = false;
        return this;
    }

    public ydz0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        ny61.r("No deadline");
        return 0L;
    }

    public ydz0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public ydz0 g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        w511.f(qv10.j(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }
}
