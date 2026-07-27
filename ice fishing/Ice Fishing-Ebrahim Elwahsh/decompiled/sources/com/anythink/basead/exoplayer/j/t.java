package com.anythink.basead.exoplayer.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.ad;
import com.anythink.basead.exoplayer.k.af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8391a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8392b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8393c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8394d = 3;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f8395e;

    /* renamed from: f, reason: collision with root package name */
    private b<? extends c> f8396f;

    /* renamed from: g, reason: collision with root package name */
    private IOException f8397g;

    public interface a<T extends c> {
        int a(T t9, long j9, long j10, IOException iOException);

        void a(T t9, long j9, long j10);

        void a(T t9, long j9, long j10, boolean z8);
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
        private final d f8413a;

        public e(d dVar) {
            this.f8413a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8413a.g();
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
        this.f8395e = af.a(str);
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
        private static final String f8398c = "LoadTask";

        /* renamed from: d, reason: collision with root package name */
        private static final int f8399d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8400e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f8401f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8402g = 3;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8403h = 4;

        /* renamed from: a, reason: collision with root package name */
        public final int f8404a;
        private final T i;

        /* renamed from: j, reason: collision with root package name */
        private final long f8406j;

        /* renamed from: k, reason: collision with root package name */
        private a<T> f8407k;

        /* renamed from: l, reason: collision with root package name */
        private IOException f8408l;

        /* renamed from: m, reason: collision with root package name */
        private int f8409m;

        /* renamed from: n, reason: collision with root package name */
        private volatile Thread f8410n;

        /* renamed from: o, reason: collision with root package name */
        private volatile boolean f8411o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f8412p;

        public b(Looper looper, T t9, a<T> aVar, int i, long j9) {
            super(looper);
            this.i = t9;
            this.f8407k = aVar;
            this.f8404a = i;
            this.f8406j = j9;
        }

        private void b() {
            t.this.f8396f = null;
        }

        private long c() {
            return Math.min((this.f8409m - 1) * 1000, 5000);
        }

        public final void a(int i) {
            IOException iOException = this.f8408l;
            if (iOException != null && this.f8409m > i) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f8412p) {
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
            long j9 = elapsedRealtime - this.f8406j;
            if (this.f8411o) {
                this.f8407k.a((a<T>) this.i, elapsedRealtime, j9, false);
                return;
            }
            int i4 = message.what;
            if (i4 == 1) {
                this.f8407k.a((a<T>) this.i, elapsedRealtime, j9, false);
                return;
            }
            if (i4 == 2) {
                try {
                    this.f8407k.a(this.i, elapsedRealtime, j9);
                    return;
                } catch (RuntimeException e6) {
                    Log.e(f8398c, "Unexpected exception handling load completed", e6);
                    t.this.f8397g = new g(e6);
                    return;
                }
            }
            if (i4 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f8408l = iOException;
            int a9 = this.f8407k.a((a<T>) this.i, elapsedRealtime, j9, iOException);
            if (a9 == 3) {
                t.this.f8397g = this.f8408l;
            } else if (a9 != 2) {
                this.f8409m = a9 == 1 ? 1 : this.f8409m + 1;
                a(Math.min((r12 - 1) * 1000, 5000));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f8410n = Thread.currentThread();
                if (!this.f8411o) {
                    ad.a("load:".concat(this.i.getClass().getSimpleName()));
                    try {
                        this.i.b();
                        ad.a();
                    } catch (Throwable th) {
                        ad.a();
                        throw th;
                    }
                }
                if (this.f8412p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e6) {
                if (this.f8412p) {
                    return;
                }
                obtainMessage(3, e6).sendToTarget();
            } catch (Error e9) {
                Log.e(f8398c, "Unexpected error loading stream", e9);
                if (!this.f8412p) {
                    obtainMessage(4, e9).sendToTarget();
                }
                throw e9;
            } catch (InterruptedException unused) {
                C0544a.b(this.f8411o);
                if (this.f8412p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e10) {
                Log.e(f8398c, "Unexpected exception loading stream", e10);
                if (this.f8412p) {
                    return;
                }
                obtainMessage(3, new g(e10)).sendToTarget();
            } catch (OutOfMemoryError e11) {
                Log.e(f8398c, "OutOfMemory error loading stream", e11);
                if (this.f8412p) {
                    return;
                }
                obtainMessage(3, new g(e11)).sendToTarget();
            }
        }

        public final void a(long j9) {
            C0544a.b(t.this.f8396f == null);
            t.this.f8396f = this;
            if (j9 > 0) {
                sendEmptyMessageDelayed(0, j9);
            } else {
                a();
            }
        }

        public final void a(boolean z8) {
            this.f8412p = z8;
            this.f8408l = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z8) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f8411o = true;
                this.i.a();
                if (this.f8410n != null) {
                    this.f8410n.interrupt();
                }
            }
            if (z8) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f8407k.a((a<T>) this.i, elapsedRealtime, elapsedRealtime - this.f8406j, true);
                this.f8407k = null;
            }
        }

        private void a() {
            this.f8408l = null;
            t.this.f8395e.execute(t.this.f8396f);
        }
    }

    public final void b() {
        this.f8396f.a(false);
    }

    public final <T extends c> long a(T t9, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C0544a.b(myLooper != null);
        this.f8397g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t9, aVar, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public final boolean a() {
        return this.f8396f != null;
    }

    public final void a(d dVar) {
        b<? extends c> bVar = this.f8396f;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.f8395e.execute(new e(dVar));
        }
        this.f8395e.shutdown();
    }

    @Override // com.anythink.basead.exoplayer.j.u
    public final void a(int i) {
        IOException iOException = this.f8397g;
        if (iOException == null) {
            b<? extends c> bVar = this.f8396f;
            if (bVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bVar.f8404a;
                }
                bVar.a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}
