package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ys1 {
    public static final ys1 f;
    public static final ThreadPoolExecutor g;
    public static final C1318t h;
    public static final ThreadPoolExecutor i;
    public static final WeakHashMap j;
    public fmq a;
    public String b;
    public int c;
    public PriorityQueue d;
    public Thread e;

    static {
        ys1 ys1Var = new ys1();
        ys1Var.c = 0;
        ys1Var.d = new PriorityQueue(1, C1318t.c);
        ys1Var.b = "AsyncServer";
        f = ys1Var;
        rwi rwiVar = new rwi("AsyncServer-worker-");
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        g = new ThreadPoolExecutor(1, 4, 10L, timeUnit, linkedBlockingQueue, rwiVar);
        h = new C1318t(22);
        i = new ThreadPoolExecutor(1, 4, 10L, timeUnit, new LinkedBlockingQueue(), new rwi("AsyncServer-resolver-"));
        j = new WeakHashMap();
    }

    public static long b(ys1 ys1Var, PriorityQueue priorityQueue) {
        xs1 xs1Var;
        long j2 = Long.MAX_VALUE;
        while (true) {
            synchronized (ys1Var) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    xs1Var = null;
                    if (priorityQueue.size() > 0) {
                        xs1 xs1Var2 = (xs1) priorityQueue.remove();
                        long j3 = xs1Var2.b;
                        if (j3 <= currentTimeMillis) {
                            xs1Var = xs1Var2;
                        } else {
                            priorityQueue.add(xs1Var2);
                            j2 = j3 - currentTimeMillis;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (xs1Var == null) {
                ys1Var.c = 0;
                return j2;
            }
            xs1Var.a.run();
        }
    }

    public static void g(ys1 ys1Var, fmq fmqVar, PriorityQueue priorityQueue) {
        while (true) {
            try {
                i(ys1Var, fmqVar, priorityQueue);
            } catch (vs1 e) {
                Log.i("NIO", "Selector exception, shutting down", e);
                try {
                    ((AbstractSelector) fmqVar.c).close();
                } catch (Exception unused) {
                }
            }
            synchronized (ys1Var) {
                try {
                    if (!((AbstractSelector) fmqVar.c).isOpen() || (((AbstractSelector) fmqVar.c).keys().size() <= 0 && priorityQueue.size() <= 0)) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            for (SelectionKey selectionKey : ((AbstractSelector) fmqVar.c).keys()) {
                wdg.H(selectionKey.channel());
                try {
                    selectionKey.cancel();
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
        }
        try {
            ((AbstractSelector) fmqVar.c).close();
        } catch (Exception unused4) {
        }
        if (ys1Var.a == fmqVar) {
            ys1Var.d = new PriorityQueue(1, C1318t.c);
            ys1Var.a = null;
            ys1Var.e = null;
        }
        WeakHashMap weakHashMap = j;
        synchronized (weakHashMap) {
            weakHashMap.remove(Thread.currentThread());
        }
    }

    public static void i(ys1 ys1Var, fmq fmqVar, PriorityQueue priorityQueue) {
        boolean z;
        SelectionKey selectionKey;
        long b = b(ys1Var, priorityQueue);
        try {
            synchronized (ys1Var) {
                try {
                    if (((AbstractSelector) fmqVar.c).selectNow() != 0) {
                        z = false;
                    } else if (((AbstractSelector) fmqVar.c).keys().size() == 0 && b == Long.MAX_VALUE) {
                        return;
                    } else {
                        z = true;
                    }
                    if (z) {
                        Semaphore semaphore = (Semaphore) fmqVar.d;
                        if (b == Long.MAX_VALUE) {
                            try {
                                semaphore.drainPermits();
                                ((AbstractSelector) fmqVar.c).select(0L);
                                semaphore.release(Integer.MAX_VALUE);
                            } finally {
                            }
                        } else {
                            try {
                                semaphore.drainPermits();
                                ((AbstractSelector) fmqVar.c).select(b);
                                semaphore.release(Integer.MAX_VALUE);
                            } finally {
                            }
                        }
                    }
                    Set<SelectionKey> selectedKeys = ((AbstractSelector) fmqVar.c).selectedKeys();
                    for (SelectionKey selectionKey2 : selectedKeys) {
                        try {
                            SocketChannel socketChannel = null;
                            if (selectionKey2.isAcceptable()) {
                                try {
                                    SocketChannel accept = ((ServerSocketChannel) selectionKey2.channel()).accept();
                                    if (accept == null) {
                                        continue;
                                    } else {
                                        try {
                                            accept.configureBlocking(false);
                                            selectionKey = accept.register((AbstractSelector) fmqVar.c, 1);
                                        } catch (IOException unused) {
                                            selectionKey = null;
                                        }
                                        try {
                                            if (selectionKey2.attachment() != null) {
                                                throw new ClassCastException();
                                            }
                                            ms1 ms1Var = new ms1();
                                            ms1Var.e = new aa(1);
                                            a3r a3rVar = new a3r();
                                            accept.configureBlocking(false);
                                            a3rVar.a = accept;
                                            a3rVar.b = accept;
                                            ms1Var.a = a3rVar;
                                            ms1Var.c = ys1Var;
                                            ms1Var.b = selectionKey;
                                            selectionKey.attach(ms1Var);
                                            throw null;
                                        } catch (IOException unused2) {
                                            socketChannel = accept;
                                            wdg.H(socketChannel);
                                            if (selectionKey != null) {
                                                selectionKey.cancel();
                                            }
                                        }
                                    }
                                } catch (IOException unused3) {
                                    selectionKey = null;
                                }
                            } else if (selectionKey2.isReadable()) {
                                ((ms1) selectionKey2.attachment()).f();
                            } else if (selectionKey2.isWritable()) {
                                ms1 ms1Var2 = (ms1) selectionKey2.attachment();
                                ms1Var2.a.getClass();
                                SelectionKey selectionKey3 = ms1Var2.b;
                                selectionKey3.interestOps(selectionKey3.interestOps() & (-5));
                                d6w d6wVar = ms1Var2.g;
                                if (d6wVar != null) {
                                    d6wVar.o();
                                }
                            } else {
                                if (!selectionKey2.isConnectable()) {
                                    Log.i("NIO", "wtf");
                                    throw new RuntimeException("Unknown key state.");
                                }
                                ws1 ws1Var = (ws1) selectionKey2.attachment();
                                SocketChannel socketChannel2 = (SocketChannel) selectionKey2.channel();
                                selectionKey2.interestOps(1);
                                try {
                                    socketChannel2.finishConnect();
                                    ms1 ms1Var3 = new ms1();
                                    ms1Var3.c = ys1Var;
                                    ms1Var3.b = selectionKey2;
                                    ms1Var3.e = new aa(1);
                                    a3r a3rVar2 = new a3r();
                                    socketChannel2.configureBlocking(false);
                                    a3rVar2.a = socketChannel2;
                                    a3rVar2.b = socketChannel2;
                                    ms1Var3.a = a3rVar2;
                                    selectionKey2.attach(ms1Var3);
                                    try {
                                        if (ws1Var.k(null, ms1Var3)) {
                                            ws1Var.i.g(null, ms1Var3);
                                        }
                                    } catch (Exception e) {
                                        throw new RuntimeException(e);
                                    }
                                } catch (IOException e2) {
                                    selectionKey2.cancel();
                                    wdg.H(socketChannel2);
                                    if (ws1Var.k(e2, null)) {
                                        ws1Var.i.g(e2, null);
                                    }
                                }
                            }
                        } catch (CancelledKeyException unused4) {
                        }
                    }
                    selectedKeys.clear();
                } finally {
                }
            }
        } catch (Exception e3) {
            throw new vs1(e3);
        }
    }

    public final ws1 a(InetSocketAddress inetSocketAddress, m56 m56Var) {
        ws1 ws1Var = new ws1();
        c(new t5(this, ws1Var, m56Var, inetSocketAddress, 1));
        return ws1Var;
    }

    public final void c(Runnable runnable) {
        d(runnable, 0L);
    }

    public final xs1 d(Runnable runnable, long j2) {
        xs1 xs1Var;
        synchronized (this) {
            long j3 = 0;
            try {
                if (j2 > 0) {
                    j3 = System.currentTimeMillis() + j2;
                } else if (j2 == 0) {
                    int i2 = this.c;
                    this.c = i2 + 1;
                    j3 = i2;
                } else if (this.d.size() > 0) {
                    j3 = Math.min(0L, ((xs1) this.d.peek()).b - 1);
                }
                PriorityQueue priorityQueue = this.d;
                xs1Var = new xs1();
                xs1Var.a = runnable;
                xs1Var.b = j3;
                priorityQueue.add(xs1Var);
                if (this.a == null) {
                    f();
                }
                if (!(this.e == Thread.currentThread())) {
                    g.execute(new q9(7, this.a));
                }
            } finally {
            }
        }
        return xs1Var;
    }

    public final void e(Object obj) {
        synchronized (this) {
            this.d.remove(obj);
        }
    }

    public final void f() {
        synchronized (this) {
            if (this.a != null) {
                Log.i("NIO", "Reentrant call");
                fmq fmqVar = this.a;
                PriorityQueue priorityQueue = this.d;
                try {
                    i(this, fmqVar, priorityQueue);
                    return;
                } catch (vs1 e) {
                    Log.i("NIO", "Selector closed", e);
                    try {
                        ((AbstractSelector) fmqVar.c).close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            try {
                AbstractSelector openSelector = SelectorProvider.provider().openSelector();
                fmq fmqVar2 = new fmq(9, false);
                fmqVar2.d = new Semaphore(0);
                fmqVar2.c = openSelector;
                this.a = fmqVar2;
                this.e = new us1(this, this.b, fmqVar2, this.d);
                WeakHashMap weakHashMap = j;
                synchronized (weakHashMap) {
                    if (((ys1) weakHashMap.get(this.e)) == null) {
                        weakHashMap.put(this.e, this);
                        this.e.start();
                    } else {
                        try {
                            ((AbstractSelector) this.a.c).close();
                        } catch (Exception unused2) {
                        }
                        this.a = null;
                        this.e = null;
                    }
                }
            } catch (IOException unused3) {
            }
        }
    }

    public final void h(Runnable runnable) {
        if (Thread.currentThread() == this.e) {
            c(runnable);
            b(this, this.d);
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        c(new x8x(10, runnable, semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            Log.e("NIO", "run", e);
        }
    }
}
