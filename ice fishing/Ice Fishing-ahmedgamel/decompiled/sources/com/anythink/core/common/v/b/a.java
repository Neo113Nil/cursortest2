package com.anythink.core.common.v.b;

import android.os.Handler;
import android.os.HandlerThread;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.q;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17469a = "TaskBusinessThreads";

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f17470b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f17471c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f17472d;

    /* renamed from: e, reason: collision with root package name */
    private volatile ExecutorService f17473e;

    /* renamed from: f, reason: collision with root package name */
    private volatile ExecutorService f17474f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorService f17475g;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentHashMap<String, Handler> f17476h = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.core.common.v.b.a$a, reason: collision with other inner class name */
    public class RejectedExecutionHandlerC0100a implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC0100a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Objects.toString(threadPoolExecutor);
            a.this.f17470b.execute(runnable);
        }

        public /* synthetic */ RejectedExecutionHandlerC0100a(a aVar, byte b9) {
            this();
        }
    }

    public a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f17470b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, new SynchronousQueue(), new c());
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        byte b9 = 0;
        this.f17471c = new ThreadPoolExecutor(availableProcessors + 1, availableProcessors * 2, 60L, timeUnit, new LinkedBlockingQueue(100), new c(), new RejectedExecutionHandlerC0100a(this, b9));
        this.f17472d = new ThreadPoolExecutor(0, 5, 60L, timeUnit, new LinkedBlockingQueue(), new c(), new RejectedExecutionHandlerC0100a(this, b9));
        this.f17475g = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), new c(), new RejectedExecutionHandlerC0100a(this, b9));
    }

    private synchronized Handler b(String str) {
        Handler handler;
        Handler handler2 = this.f17476h.get(str);
        if (handler2 != null) {
            return handler2;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.setPriority(5);
            handlerThread.start();
            Thread.currentThread().getId();
            Thread.currentThread().getName();
            handler = new Handler(handlerThread.getLooper());
            try {
                this.f17476h.put(str, handler);
            } catch (Throwable th) {
                th = th;
                handler2 = handler;
                th.getMessage();
                com.anythink.core.common.u.e.b("create handler thread error", th.getMessage() + ", " + q.a(th.getStackTrace()), t.b().r());
                handler = handler2;
                return handler;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return handler;
    }

    private static void c() {
    }

    private static void d() {
    }

    public final Handler a(int i) {
        return b(b(i));
    }

    public final void a(d dVar, int i) {
        String b9 = b(i);
        dVar.a(b9);
        if (i != 1) {
            if (i != 13) {
                if (i != 3) {
                    if (i == 4) {
                        this.f17472d.execute(dVar);
                        return;
                    }
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 16) {
                                    if (i != 17) {
                                        this.f17470b.execute(dVar);
                                        return;
                                    } else {
                                        this.f17475g.execute(dVar);
                                        return;
                                    }
                                }
                                if (this.f17474f == null) {
                                    synchronized (a.class) {
                                        try {
                                            if (this.f17474f == null) {
                                                this.f17474f = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c());
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                this.f17474f.execute(dVar);
                                return;
                            }
                        }
                    }
                }
                Handler b10 = b(b9);
                if (b10 != null) {
                    b10.post(dVar);
                    return;
                }
                return;
            }
            this.f17471c.execute(dVar);
            return;
        }
        if (this.f17473e == null) {
            synchronized (a.class) {
                try {
                    if (this.f17473e == null) {
                        this.f17473e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f17473e.execute(dVar);
    }

    public static String b(int i) {
        String concat = "def_t_".concat(String.valueOf(i));
        switch (i) {
            case 1:
                concat = "s_p";
                break;
            case 2:
                concat = "n_p";
                break;
            case 3:
                concat = "h_t_l";
                break;
            case 4:
                concat = "i_p";
                break;
            case 5:
                concat = "s_p_p_t";
                break;
            case 6:
                concat = "n_p_n_r";
                break;
            case 7:
                concat = "l_p_s_i";
                break;
            case 8:
                concat = "h_a_e";
                break;
            case 9:
                concat = "h_a_t";
                break;
            case 10:
                concat = "n_p_h_r";
                break;
            case 11:
                concat = "h_p_s";
                break;
            case 12:
                concat = com.anythink.expressad.f.a.b.dX;
                break;
            case 13:
                concat = "l_p_o_s_t";
                break;
            case 14:
                concat = "h_a_l";
                break;
            case 15:
                concat = "h_s_p";
                break;
            case 16:
                concat = "s_p_s_r_f_i";
                break;
            case 17:
                concat = "s_p_i";
                break;
            case 18:
                concat = "h_a_d_u";
                break;
        }
        return AbstractC5128c.f("anythink_", concat);
    }

    private Handler a(String str) {
        return b(str);
    }

    public final Executor a() {
        return this.f17471c;
    }

    private void a(d dVar, String str) {
        Handler b9 = b(str);
        if (b9 != null) {
            b9.post(dVar);
        }
    }

    public final ExecutorService b() {
        return this.f17470b;
    }
}
