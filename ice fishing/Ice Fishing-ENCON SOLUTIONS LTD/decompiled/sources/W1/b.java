package W1;

import java.util.concurrent.locks.ReentrantLock;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e b2;
        while (true) {
            try {
                reentrantLock = e.f1864h;
                reentrantLock.lock();
                try {
                    b2 = AbstractC1050a.b();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (b2 == e.f1868l) {
                e.f1868l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (b2 != null) {
                    b2.j();
                }
            }
        }
    }
}
