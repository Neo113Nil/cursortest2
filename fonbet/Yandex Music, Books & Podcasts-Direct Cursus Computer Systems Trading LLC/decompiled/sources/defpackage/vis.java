package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class vis {
    public static final uis d = new uis();
    public boolean a;
    public long b;
    public long c;

    public vis a() {
        this.a = false;
        return this;
    }

    public vis b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        xq0.q("No deadline");
        return 0L;
    }

    public vis d(long j) {
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

    public vis g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        xq0.o(dfi.d(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }
}
