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
    public static final int f8234a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8235b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8236c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8237d = 3;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f8238e;

    /* renamed from: f, reason: collision with root package name */
    private b<? extends c> f8239f;

    /* renamed from: g, reason: collision with root package name */
    private IOException f8240g;

    public interface a<T extends c> {
        int a(T t6, long j6, long j9, IOException iOException);

        void a(T t6, long j6, long j9);

        void a(T t6, long j6, long j9, boolean z3);
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
        private final d f8256a;

        public e(d dVar) {
            this.f8256a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8256a.g();
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
        this.f8238e = af.a(str);
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
        private static final String f8241c = "LoadTask";

        /* renamed from: d, reason: collision with root package name */
        private static final int f8242d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8243e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f8244f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8245g = 3;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8246h = 4;

        /* renamed from: a, reason: collision with root package name */
        public final int f8247a;
        private final T i;

        /* renamed from: j, reason: collision with root package name */
        private final long f8249j;

        /* renamed from: k, reason: collision with root package name */
        private a<T> f8250k;

        /* renamed from: l, reason: collision with root package name */
        private IOException f8251l;

        /* renamed from: m, reason: collision with root package name */
        private int f8252m;

        /* renamed from: n, reason: collision with root package name */
        private volatile Thread f8253n;

        /* renamed from: o, reason: collision with root package name */
        private volatile boolean f8254o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f8255p;

        public b(Looper looper, T t6, a<T> aVar, int i, long j6) {
            super(looper);
            this.i = t6;
            this.f8250k = aVar;
            this.f8247a = i;
            this.f8249j = j6;
        }

        private void b() {
            t.this.f8239f = null;
        }

        private long c() {
            return Math.min((this.f8252m - 1) * 1000, 5000);
        }

        public final void a(int i) {
            IOException iOException = this.f8251l;
            if (iOException != null && this.f8252m > i) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f8255p) {
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
            long j6 = elapsedRealtime - this.f8249j;
            if (this.f8254o) {
                this.f8250k.a((a<T>) this.i, elapsedRealtime, j6, false);
                return;
            }
            int i6 = message.what;
            if (i6 == 1) {
                this.f8250k.a((a<T>) this.i, elapsedRealtime, j6, false);
                return;
            }
            if (i6 == 2) {
                try {
                    this.f8250k.a(this.i, elapsedRealtime, j6);
                    return;
                } catch (RuntimeException e9) {
                    Log.e(f8241c, "Unexpected exception handling load completed", e9);
                    t.this.f8240g = new g(e9);
                    return;
                }
            }
            if (i6 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f8251l = iOException;
            int a9 = this.f8250k.a((a<T>) this.i, elapsedRealtime, j6, iOException);
            if (a9 == 3) {
                t.this.f8240g = this.f8251l;
            } else if (a9 != 2) {
                this.f8252m = a9 == 1 ? 1 : this.f8252m + 1;
                a(Math.min((r12 - 1) * 1000, 5000));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f8253n = Thread.currentThread();
                if (!this.f8254o) {
                    ad.a("load:".concat(this.i.getClass().getSimpleName()));
                    try {
                        this.i.b();
                        ad.a();
                    } catch (Throwable th) {
                        ad.a();
                        throw th;
                    }
                }
                if (this.f8255p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e9) {
                if (this.f8255p) {
                    return;
                }
                obtainMessage(3, e9).sendToTarget();
            } catch (Error e10) {
                Log.e(f8241c, "Unexpected error loading stream", e10);
                if (!this.f8255p) {
                    obtainMessage(4, e10).sendToTarget();
                }
                throw e10;
            } catch (InterruptedException unused) {
                com.anythink.basead.exoplayer.k.a.b(this.f8254o);
                if (this.f8255p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e11) {
                Log.e(f8241c, "Unexpected exception loading stream", e11);
                if (this.f8255p) {
                    return;
                }
                obtainMessage(3, new g(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                Log.e(f8241c, "OutOfMemory error loading stream", e12);
                if (this.f8255p) {
                    return;
                }
                obtainMessage(3, new g(e12)).sendToTarget();
            }
        }

        public final void a(long j6) {
            com.anythink.basead.exoplayer.k.a.b(t.this.f8239f == null);
            t.this.f8239f = this;
            if (j6 > 0) {
                sendEmptyMessageDelayed(0, j6);
            } else {
                a();
            }
        }

        public final void a(boolean z3) {
            this.f8255p = z3;
            this.f8251l = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z3) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f8254o = true;
                this.i.a();
                if (this.f8253n != null) {
                    this.f8253n.interrupt();
                }
            }
            if (z3) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f8250k.a((a<T>) this.i, elapsedRealtime, elapsedRealtime - this.f8249j, true);
                this.f8250k = null;
            }
        }

        private void a() {
            this.f8251l = null;
            t.this.f8238e.execute(t.this.f8239f);
        }
    }

    public final void b() {
        this.f8239f.a(false);
    }

    public final <T extends c> long a(T t6, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        com.anythink.basead.exoplayer.k.a.b(myLooper != null);
        this.f8240g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t6, aVar, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public final boolean a() {
        return this.f8239f != null;
    }

    public final void a(d dVar) {
        b<? extends c> bVar = this.f8239f;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.f8238e.execute(new e(dVar));
        }
        this.f8238e.shutdown();
    }

    @Override // com.anythink.basead.exoplayer.j.u
    public final void a(int i) {
        IOException iOException = this.f8240g;
        if (iOException == null) {
            b<? extends c> bVar = this.f8239f;
            if (bVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bVar.f8247a;
                }
                bVar.a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}
