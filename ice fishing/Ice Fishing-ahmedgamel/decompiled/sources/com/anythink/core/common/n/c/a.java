package com.anythink.core.common.n.c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a extends x {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16618a = 65536;

    /* renamed from: b, reason: collision with root package name */
    static a f16619b;

    /* renamed from: d, reason: collision with root package name */
    private static final long f16620d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f16621e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16622f;

    /* renamed from: g, reason: collision with root package name */
    private a f16623g;

    /* renamed from: h, reason: collision with root package name */
    private long f16624h;

    /* renamed from: com.anythink.core.common.n.c.a$2, reason: invalid class name */
    public class AnonymousClass2 implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f16627a;

        public AnonymousClass2(w wVar) {
            this.f16627a = wVar;
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return a.this;
        }

        @Override // com.anythink.core.common.n.c.w
        public final long a_(c cVar, long j6) {
            a.this.c();
            try {
                try {
                    long a_ = this.f16627a.a_(cVar, j6);
                    a.this.a(true);
                    return a_;
                } catch (IOException e9) {
                    throw a.this.b(e9);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a.this.c();
            try {
                try {
                    this.f16627a.close();
                    a.this.a(true);
                } catch (IOException e9) {
                    throw a.this.b(e9);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f16627a + ")";
        }
    }

    /* renamed from: com.anythink.core.common.n.c.a$a, reason: collision with other inner class name */
    public static final class C0090a extends Thread {
        public C0090a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
        
            r1.a();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            while (true) {
                synchronized (a.class) {
                    try {
                        a e9 = a.e();
                        if (e9 != null) {
                            if (e9 == a.f16619b) {
                                a.f16619b = null;
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f16620d = millis;
        f16621e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private long b(long j6) {
        return this.f16624h - j6;
    }

    public static a e() {
        a aVar = f16619b.f16623g;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(f16620d);
            if (f16619b.f16623g != null || System.nanoTime() - nanoTime < f16621e) {
                return null;
            }
            return f16619b;
        }
        long nanoTime2 = aVar.f16624h - System.nanoTime();
        if (nanoTime2 > 0) {
            long j6 = nanoTime2 / 1000000;
            a.class.wait(j6, (int) (nanoTime2 - (1000000 * j6)));
            return null;
        }
        f16619b.f16623g = aVar.f16623g;
        aVar.f16623g = null;
        return aVar;
    }

    public void a() {
    }

    public final void c() {
        if (this.f16622f) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long i_ = i_();
        boolean f_ = f_();
        if (i_ != 0 || f_) {
            this.f16622f = true;
            a(this, i_, f_);
        }
    }

    public final boolean d() {
        if (!this.f16622f) {
            return false;
        }
        this.f16622f = false;
        return a(this);
    }

    private static synchronized void a(a aVar, long j6, boolean z6) {
        a aVar2;
        synchronized (a.class) {
            try {
                if (f16619b == null) {
                    f16619b = new a();
                    new C0090a().start();
                }
                long nanoTime = System.nanoTime();
                if (j6 != 0 && z6) {
                    aVar.f16624h = Math.min(j6, aVar.g_() - nanoTime) + nanoTime;
                } else if (j6 != 0) {
                    aVar.f16624h = j6 + nanoTime;
                } else {
                    if (!z6) {
                        throw new AssertionError();
                    }
                    aVar.f16624h = aVar.g_();
                }
                long j9 = aVar.f16624h - nanoTime;
                a aVar3 = f16619b;
                while (true) {
                    aVar2 = aVar3.f16623g;
                    if (aVar2 == null || j9 < aVar2.f16624h - nanoTime) {
                        break;
                    } else {
                        aVar3 = aVar2;
                    }
                }
                aVar.f16623g = aVar2;
                aVar3.f16623g = aVar;
                if (aVar3 == f16619b) {
                    a.class.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IOException b(IOException iOException) {
        return !d() ? iOException : a(iOException);
    }

    /* renamed from: com.anythink.core.common.n.c.a$1, reason: invalid class name */
    public class AnonymousClass1 implements v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f16625a;

        public AnonymousClass1(v vVar) {
            this.f16625a = vVar;
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(c cVar, long j6) {
            y.a(cVar.f16634c, 0L, j6);
            while (true) {
                long j9 = 0;
                if (j6 <= 0) {
                    return;
                }
                s sVar = cVar.f16633b;
                while (true) {
                    if (j9 >= 65536) {
                        break;
                    }
                    j9 += sVar.f16703e - sVar.f16702d;
                    if (j9 >= j6) {
                        j9 = j6;
                        break;
                    }
                    sVar = sVar.f16706h;
                }
                a.this.c();
                try {
                    try {
                        this.f16625a.a(cVar, j9);
                        j6 -= j9;
                        a.this.a(true);
                    } catch (IOException e9) {
                        throw a.this.b(e9);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a.this.c();
            try {
                try {
                    this.f16625a.close();
                    a.this.a(true);
                } catch (IOException e9) {
                    throw a.this.b(e9);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            a.this.c();
            try {
                try {
                    this.f16625a.flush();
                    a.this.a(true);
                } catch (IOException e9) {
                    throw a.this.b(e9);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f16625a + ")";
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return a.this;
        }
    }

    private static synchronized boolean a(a aVar) {
        synchronized (a.class) {
            a aVar2 = f16619b;
            while (aVar2 != null) {
                a aVar3 = aVar2.f16623g;
                if (aVar3 == aVar) {
                    aVar2.f16623g = aVar.f16623g;
                    aVar.f16623g = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    private v a(v vVar) {
        return new AnonymousClass1(vVar);
    }

    private w a(w wVar) {
        return new AnonymousClass2(wVar);
    }

    public final void a(boolean z6) {
        if (d() && z6) {
            throw a((IOException) null);
        }
    }

    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
