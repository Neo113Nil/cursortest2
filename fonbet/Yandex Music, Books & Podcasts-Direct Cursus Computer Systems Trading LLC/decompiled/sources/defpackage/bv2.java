package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public final class bv2 implements Future {
    public volatile boolean a;
    public volatile boolean b;
    public volatile u3o c;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (this.a) {
                    return false;
                }
                this.a = true;
                this.b = true;
                notifyAll();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized Object get(long j, TimeUnit timeUnit) {
        bg3.P(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        long currentTimeMillis = millis <= 0 ? 0L : System.currentTimeMillis();
        if (this.a) {
            return this.c;
        }
        if (millis <= 0) {
            throw new TimeoutException();
        }
        long j2 = millis;
        do {
            wait(j2);
            if (this.a) {
                return this.c;
            }
            j2 = millis - (System.currentTimeMillis() - currentTimeMillis);
        } while (j2 > 0);
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final synchronized Object get() {
        while (!this.a) {
            try {
                wait();
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.c;
    }
}
