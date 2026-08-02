package defpackage;

import android.os.Process;
import com.google.android.gms.measurement.internal.g;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class t9a1 extends Thread {
    public final Object a;
    public final BlockingQueue b;
    public boolean c = false;
    public final /* synthetic */ aaa1 w;

    public t9a1(aaa1 aaa1Var, String str, BlockingQueue blockingQueue) {
        this.w = aaa1Var;
        cvw.l(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        aaa1 aaa1Var = this.w;
        synchronized (aaa1Var.C) {
            try {
                if (!this.c) {
                    aaa1Var.D.release();
                    aaa1Var.C.notifyAll();
                    if (this == aaa1Var.w) {
                        aaa1Var.w = null;
                    } else if (this == aaa1Var.x) {
                        aaa1Var.x = null;
                    } else {
                        y1a1 y1a1Var = ((g) aaa1Var.b).y;
                        g.g(y1a1Var);
                        y1a1Var.z.a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
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
                this.w.D.acquire();
                z = true;
            } catch (InterruptedException e) {
                y1a1 y1a1Var = ((g) this.w.b).y;
                g.g(y1a1Var);
                y1a1Var.C.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                n9a1 n9a1Var = (n9a1) blockingQueue.poll();
                if (n9a1Var != null) {
                    Process.setThreadPriority(true != n9a1Var.b ? 10 : threadPriority);
                    n9a1Var.run();
                } else {
                    Object obj = this.a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.w.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                y1a1 y1a1Var2 = ((g) this.w.b).y;
                                g.g(y1a1Var2);
                                y1a1Var2.C.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.w.C) {
                        if (this.b.peek() == null) {
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
