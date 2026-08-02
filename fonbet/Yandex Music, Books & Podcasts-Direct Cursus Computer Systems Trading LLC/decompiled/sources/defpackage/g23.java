package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class g23 {
    public Thread a;
    public int b;
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();

    public static void b(ja8 ja8Var) {
        if (ja8Var instanceof f23) {
            ((f23) ja8Var).close();
        } else {
            kac.j(ja8Var, "Incorrect entrance handle: ");
        }
    }

    public final f23 a() {
        Thread currentThread = Thread.currentThread();
        do {
            synchronized (this.d) {
                Thread thread = this.a;
                if (thread == null) {
                    this.a = currentThread;
                    this.b = 1;
                    return new f23(this);
                }
                if (thread.equals(currentThread)) {
                    this.b++;
                    return new f23(this);
                }
                if (!this.c.contains(currentThread)) {
                    this.c.add(currentThread);
                }
                LockSupport.park();
                synchronized (this.d) {
                    this.c.remove(currentThread);
                }
            }
        } while (!Thread.interrupted());
        Thread.currentThread().interrupt();
        b6e.h();
        return null;
    }

    public final void c(Thread thread) {
        synchronized (this.d) {
            try {
                Thread thread2 = this.a;
                if (thread2 == null) {
                    this.a = thread;
                } else if (!thread2.equals(thread)) {
                    throw new IllegalStateException("Critical section is held by " + this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.d) {
            this.a = Thread.currentThread();
        }
    }
}
