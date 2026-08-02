package defpackage;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class ryj {
    public int a;
    public int b;
    public ExecutorService c;
    public final ArrayDeque d;
    public final ArrayDeque e;
    public final ArrayDeque f;

    public ryj() {
        this.a = 64;
        this.b = 5;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    public static void c(ryj ryjVar, kci0 kci0Var, nci0 nci0Var, kci0 kci0Var2, int i) {
        cot cotVar;
        kci0 kci0Var3;
        if ((i & 1) != 0) {
            kci0Var = null;
        }
        if ((i & 2) != 0) {
            nci0Var = null;
        }
        if ((i & 4) != 0) {
            kci0Var2 = null;
        }
        ryjVar.getClass();
        TimeZone timeZone = bg61.a;
        boolean isShutdown = ryjVar.a().isShutdown();
        synchronized (ryjVar) {
            if (nci0Var != null) {
                try {
                    if (!ryjVar.f.remove(nci0Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (kci0Var2 != null) {
                kci0Var2.b.decrementAndGet();
                if (!ryjVar.e.remove(kci0Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (kci0Var != null) {
                ryjVar.d.add(kci0Var);
                nci0 nci0Var2 = kci0Var.c;
                if (!nci0Var2.c) {
                    String str = nci0Var2.b.a.d;
                    Iterator it = ryjVar.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            kci0Var3 = (kci0) it.next();
                            if (jl40.l(kci0Var3.c.b.a.d, str)) {
                                break;
                            }
                        } else {
                            Iterator it2 = ryjVar.d.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    kci0Var3 = (kci0) it2.next();
                                    if (jl40.l(kci0Var3.c.b.a.d, str)) {
                                        break;
                                    }
                                } else {
                                    kci0Var3 = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (kci0Var3 != null) {
                        kci0Var.b = kci0Var3.b;
                    }
                }
            }
            if ((nci0Var != null || kci0Var2 != null) && (isShutdown || ryjVar.e.isEmpty())) {
                ryjVar.f.isEmpty();
            }
            int i2 = 19;
            if (isShutdown) {
                List J0 = a.J0(ryjVar.d);
                ryjVar.d.clear();
                cotVar = new cot(i2, J0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ryjVar.d.iterator();
                while (it3.hasNext()) {
                    kci0 kci0Var4 = (kci0) it3.next();
                    if (ryjVar.e.size() >= ryjVar.a) {
                        break;
                    }
                    if (kci0Var4.b.get() < ryjVar.b) {
                        it3.remove();
                        kci0Var4.b.incrementAndGet();
                        arrayList.add(kci0Var4);
                        ryjVar.e.add(kci0Var4);
                    }
                }
                cotVar = new cot(i2, arrayList);
            }
        }
        int size = ((List) cotVar.b).size();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            kci0 kci0Var5 = (kci0) ((List) cotVar.b).get(i3);
            if (kci0Var5 == kci0Var) {
                z = false;
            } else {
                nci0 nci0Var3 = kci0Var5.c;
                nci0Var3.x.dispatcherQueueEnd(nci0Var3, ryjVar);
            }
            if (isShutdown) {
                kci0Var5.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                nci0 nci0Var4 = kci0Var5.c;
                nci0Var4.g(interruptedIOException);
                kci0Var5.a.onFailure(nci0Var4, interruptedIOException);
            } else {
                ExecutorService a = ryjVar.a();
                nci0 nci0Var5 = kci0Var5.c;
                TimeZone timeZone2 = bg61.a;
                try {
                    try {
                        a.execute(kci0Var5);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        nci0 nci0Var6 = kci0Var5.c;
                        nci0Var6.g(interruptedIOException2);
                        kci0Var5.a.onFailure(nci0Var6, interruptedIOException2);
                        nci0Var5.a.a.b(kci0Var5);
                    }
                } catch (Throwable th2) {
                    nci0Var5.a.a.b(kci0Var5);
                    throw th2;
                }
            }
        }
        if (!z || kci0Var == null) {
            return;
        }
        nci0 nci0Var7 = kci0Var.c;
        nci0Var7.x.dispatcherQueueStart(nci0Var7, ryjVar);
    }

    public final synchronized ExecutorService a() {
        try {
            if (this.c == null) {
                this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ag61(bg61.b + " Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final void b(kci0 kci0Var) {
        c(this, null, null, kci0Var, 3);
    }

    public final void d(int i) {
        if (i < 1) {
            w511.f(oyr.i(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.a = i;
        }
        c(this, null, null, null, 7);
    }

    public final void e() {
        synchronized (this) {
            this.b = 8;
        }
        c(this, null, null, null, 7);
    }

    public ryj(ExecutorService executorService) {
        this();
        this.c = executorService;
    }
}
