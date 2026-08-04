package com.gamericefishpro.space.n9;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends Thread {
    public final Object d;
    public final BlockingQueue e;
    public boolean i = false;
    public final /* synthetic */ p1 v;

    public o1(p1 p1Var, String str, BlockingQueue blockingQueue) {
        this.v = p1Var;
        com.gamericefishpro.space.v8.c0.g(blockingQueue);
        this.d = new Object();
        this.e = blockingQueue;
        setName(str);
    }

    public final void a() {
        p1 p1Var = this.v;
        synchronized (p1Var.B) {
            try {
                if (!this.i) {
                    p1Var.C.release();
                    p1Var.B.notifyAll();
                    if (this == p1Var.i) {
                        p1Var.i = null;
                    } else if (this == p1Var.v) {
                        p1Var.v = null;
                    } else {
                        v0 v0Var = ((r1) p1Var.d).y;
                        r1.l(v0Var);
                        v0Var.y.a("Current scheduler thread is neither worker nor network");
                    }
                    this.i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.v.C.acquire();
                z = true;
            } catch (InterruptedException e) {
                v0 v0Var = ((r1) this.v.d).y;
                r1.l(v0Var);
                v0Var.B.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.e;
                n1 n1Var = (n1) blockingQueue.poll();
                if (n1Var != null) {
                    Process.setThreadPriority(true != n1Var.e ? 10 : threadPriority);
                    n1Var.run();
                } else {
                    Object obj = this.d;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.v.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                v0 v0Var2 = ((r1) this.v.d).y;
                                r1.l(v0Var2);
                                v0Var2.B.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.v.B) {
                        if (this.e.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
