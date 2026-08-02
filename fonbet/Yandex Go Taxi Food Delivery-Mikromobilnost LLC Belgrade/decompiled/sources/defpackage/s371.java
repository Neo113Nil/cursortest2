package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import yads.rn0;

/* loaded from: classes7.dex */
public final class s371 {
    public final i071 a;
    public final rn0 b;
    public final xb71 c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;

    public s371(rn0 rn0Var, i071 i071Var, xb71 xb71Var, Looper looper) {
        this.b = rn0Var;
        this.a = i071Var;
        this.f = looper;
        this.c = xb71Var;
    }

    public final void a() {
        if (this.g) {
            ny61.k();
            return;
        }
        this.g = true;
        rn0 rn0Var = this.b;
        synchronized (rn0Var) {
            if (!rn0Var.z && rn0Var.j.isAlive()) {
                rn0Var.i.b(14, this).b();
                return;
            }
            nba1.e();
            c(false);
        }
    }

    public final synchronized void b(long j) {
        boolean z;
        if (!this.g) {
            throw new IllegalStateException();
        }
        if (this.f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        this.c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.h;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            this.c.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void c(boolean z) {
        this.h = true;
        notifyAll();
    }
}
