package defpackage;

import java.io.IOException;
import java.util.concurrent.locks.Lock;

/* loaded from: classes5.dex */
public abstract class bt1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bt1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ct1 ct1Var = (ct1) this.b;
                try {
                    if (ct1Var.i == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    a();
                    return;
                } catch (Exception e) {
                    ct1Var.d.o(e);
                    return;
                }
            case 1:
                we6 we6Var = (we6) this.b;
                we6 b = we6Var.b();
                try {
                    b();
                    return;
                } finally {
                    we6Var.D(b);
                }
            default:
                nww nwwVar = (nww) this.b;
                Lock lock = nwwVar.b;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e2) {
                        sww swwVar = nwwVar.a.k;
                        swwVar.sendMessage(swwVar.obtainMessage(2, e2));
                    }
                    return;
                } finally {
                    lock.unlock();
                }
        }
    }
}
