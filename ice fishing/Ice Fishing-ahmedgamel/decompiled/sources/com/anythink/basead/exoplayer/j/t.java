package com.anythink.basead.exoplayer.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.basead.exoplayer.k.ad;
import com.anythink.basead.exoplayer.k.af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9020a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9021b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9022c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9023d = 3;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f9024e;

    /* renamed from: f, reason: collision with root package name */
    private b<? extends c> f9025f;

    /* renamed from: g, reason: collision with root package name */
    private IOException f9026g;

    public interface a<T extends c> {
        int a(T t6, long j6, long j9, IOException iOException);

        void a(T t6, long j6, long j9);

        void a(T t6, long j6, long j9, boolean z6);
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
        void g();
    }

    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final d f9042a;

        public e(d dVar) {
            this.f9042a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9042a.g();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public t(String str) {
        this.f9024e = af.a(str);
    }

    private void d() {
        a((d) null);
    }

    @Override // com.anythink.basead.exoplayer.j.u
    public final void c() {
        a(Integer.MIN_VALUE);
    }

    public final class b<T extends c> extends Handler implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        private static final String f9027c = "LoadTask";

        /* renamed from: d, reason: collision with root package name */
        private static final int f9028d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f9029e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f9030f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f9031g = 3;

        /* renamed from: h, reason: collision with root package name */
        private static final int f9032h = 4;

        /* renamed from: a, reason: collision with root package name */
        public final int f9033a;
        private final T i;

        /* renamed from: j, reason: collision with root package name */
        private final long f9035j;

        /* renamed from: k, reason: collision with root package name */
        private a<T> f9036k;

        /* renamed from: l, reason: collision with root package name */
        private IOException f9037l;

        /* renamed from: m, reason: collision with root package name */
        private int f9038m;

        /* renamed from: n, reason: collision with root package name */
        private volatile Thread f9039n;

        /* renamed from: o, reason: collision with root package name */
        private volatile boolean f9040o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f9041p;

        public b(Looper looper, T t6, a<T> aVar, int i, long j6) {
            super(looper);
            this.i = t6;
            this.f9036k = aVar;
            this.f9033a = i;
            this.f9035j = j6;
        }

        private void b() {
            t.this.f9025f = null;
        }

        private long c() {
            return Math.min((this.f9038m - 1) * 1000, 5000);
        }

        public final void a(int i) {
            IOException iOException = this.f9037l;
            if (iOException != null && this.f9038m > i) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f9041p) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                a();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = elapsedRealtime - this.f9035j;
            if (this.f9040o) {
                this.f9036k.a((a<T>) this.i, elapsedRealtime, j6, false);
                return;
            }
            int i4 = message.what;
            if (i4 == 1) {
                this.f9036k.a((a<T>) this.i, elapsedRealtime, j6, false);
                return;
            }
            if (i4 == 2) {
                try {
                    this.f9036k.a(this.i, elapsedRealtime, j6);
                    return;
                } catch (RuntimeException e9) {
                    Log.e(f9027c, "Unexpected exception handling load completed", e9);
                    t.this.f9026g = new g(e9);
                    return;
                }
            }
            if (i4 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f9037l = iOException;
            int a9 = this.f9036k.a((a<T>) this.i, elapsedRealtime, j6, iOException);
            if (a9 == 3) {
                t.this.f9026g = this.f9037l;
            } else if (a9 != 2) {
                this.f9038m = a9 == 1 ? 1 : this.f9038m + 1;
                a(Math.min((r12 - 1) * 1000, 5000));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f9039n = Thread.currentThread();
                if (!this.f9040o) {
                    ad.a("load:".concat(this.i.getClass().getSimpleName()));
                    try {
                        this.i.b();
                        ad.a();
                    } catch (Throwable th) {
                        ad.a();
                        throw th;
                    }
                }
                if (this.f9041p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e9) {
                if (this.f9041p) {
                    return;
                }
                obtainMessage(3, e9).sendToTarget();
            } catch (Error e10) {
                Log.e(f9027c, "Unexpected error loading stream", e10);
                if (!this.f9041p) {
                    obtainMessage(4, e10).sendToTarget();
                }
                throw e10;
            } catch (InterruptedException unused) {
                com.anythink.basead.exoplayer.k.a.b(this.f9040o);
                if (this.f9041p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e11) {
                Log.e(f9027c, "Unexpected exception loading stream", e11);
                if (this.f9041p) {
                    return;
                }
                obtainMessage(3, new g(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                Log.e(f9027c, "OutOfMemory error loading stream", e12);
                if (this.f9041p) {
                    return;
                }
                obtainMessage(3, new g(e12)).sendToTarget();
            }
        }

        public final void a(long j6) {
            com.anythink.basead.exoplayer.k.a.b(t.this.f9025f == null);
            t.this.f9025f = this;
            if (j6 > 0) {
                sendEmptyMessageDelayed(0, j6);
            } else {
                a();
            }
        }

        public final void a(boolean z6) {
            this.f9041p = z6;
            this.f9037l = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z6) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f9040o = true;
                this.i.a();
                if (this.f9039n != null) {
                    this.f9039n.interrupt();
                }
            }
            if (z6) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f9036k.a((a<T>) this.i, elapsedRealtime, elapsedRealtime - this.f9035j, true);
                this.f9036k = null;
            }
        }

        private void a() {
            this.f9037l = null;
            t.this.f9024e.execute(t.this.f9025f);
        }
    }

    public final void b() {
        this.f9025f.a(false);
    }

    public final <T extends c> long a(T t6, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        com.anythink.basead.exoplayer.k.a.b(myLooper != null);
        this.f9026g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t6, aVar, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public final boolean a() {
        return this.f9025f != null;
    }

    public final void a(d dVar) {
        b<? extends c> bVar = this.f9025f;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.f9024e.execute(new e(dVar));
        }
        this.f9024e.shutdown();
    }

    @Override // com.anythink.basead.exoplayer.j.u
    public final void a(int i) {
        IOException iOException = this.f9026g;
        if (iOException == null) {
            b<? extends c> bVar = this.f9025f;
            if (bVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bVar.f9033a;
                }
                bVar.a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}
