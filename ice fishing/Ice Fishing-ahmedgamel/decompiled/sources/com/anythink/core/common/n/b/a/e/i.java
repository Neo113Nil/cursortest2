package com.anythink.core.common.n.b.a.e;

import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.w;
import com.anythink.core.common.n.c.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f15284j = true;

    /* renamed from: a, reason: collision with root package name */
    long f15285a = 0;

    /* renamed from: b, reason: collision with root package name */
    long f15286b;

    /* renamed from: c, reason: collision with root package name */
    final int f15287c;

    /* renamed from: d, reason: collision with root package name */
    final f f15288d;

    /* renamed from: e, reason: collision with root package name */
    final a f15289e;

    /* renamed from: f, reason: collision with root package name */
    final c f15290f;

    /* renamed from: g, reason: collision with root package name */
    final c f15291g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.core.common.n.b.a.e.b f15292h;
    IOException i;

    /* renamed from: k, reason: collision with root package name */
    private final Deque<u> f15293k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15294l;

    /* renamed from: m, reason: collision with root package name */
    private final b f15295m;

    public final class a implements v {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f15296c = true;

        /* renamed from: e, reason: collision with root package name */
        private static final long f15297e = 16384;

        /* renamed from: a, reason: collision with root package name */
        boolean f15298a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15299b;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f15301f = new com.anythink.core.common.n.c.c();

        /* renamed from: g, reason: collision with root package name */
        private u f15302g;

        public a() {
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!f15296c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.f15298a) {
                    return;
                }
                if (!i.this.f15289e.f15299b) {
                    boolean z3 = this.f15301f.b() > 0;
                    if (this.f15302g != null) {
                        while (this.f15301f.b() > 0) {
                            a(false);
                        }
                        i iVar = i.this;
                        iVar.f15288d.a(iVar.f15287c, true, com.anythink.core.common.n.b.a.c.a(this.f15302g));
                    } else if (z3) {
                        while (this.f15301f.b() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar2 = i.this;
                        iVar2.f15288d.a(iVar2.f15287c, true, (com.anythink.core.common.n.c.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f15298a = true;
                }
                i.this.f15288d.f15207r.b();
                i.this.g();
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (!f15296c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.h();
            }
            while (this.f15301f.b() > 0) {
                a(false);
                i.this.f15288d.f15207r.b();
            }
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (!f15296c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f15301f.a(cVar, j6);
            while (this.f15301f.b() >= f15297e) {
                a(false);
            }
        }

        private void a(boolean z3) {
            i iVar;
            long min;
            i iVar2;
            boolean z6;
            synchronized (i.this) {
                i.this.f15291g.c();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f15286b > 0 || this.f15299b || this.f15298a || iVar.f15292h != null) {
                            break;
                        } else {
                            iVar.i();
                        }
                    } finally {
                        i.this.f15291g.b();
                    }
                }
                iVar.f15291g.b();
                i.this.h();
                min = Math.min(i.this.f15286b, this.f15301f.b());
                iVar2 = i.this;
                iVar2.f15286b -= min;
            }
            iVar2.f15291g.c();
            if (z3) {
                try {
                    if (min == this.f15301f.b()) {
                        z6 = true;
                        boolean z9 = z6;
                        i iVar3 = i.this;
                        iVar3.f15288d.a(iVar3.f15287c, z9, this.f15301f, min);
                        i.this.f15291g.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z6 = false;
            boolean z92 = z6;
            i iVar32 = i.this;
            iVar32.f15288d.a(iVar32.f15287c, z92, this.f15301f, min);
            i.this.f15291g.b();
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return i.this.f15291g;
        }
    }

    public final class b implements w {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f15303c = true;

        /* renamed from: a, reason: collision with root package name */
        boolean f15304a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15305b;

        /* renamed from: e, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f15307e = new com.anythink.core.common.n.c.c();

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f15308f = new com.anythink.core.common.n.c.c();

        /* renamed from: g, reason: collision with root package name */
        private final long f15309g;

        /* renamed from: h, reason: collision with root package name */
        private u f15310h;

        public b(long j6) {
            this.f15309g = j6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            r12 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
        @Override // com.anythink.core.common.n.c.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            Throwable th;
            long a_;
            if (j6 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
            }
            while (true) {
                synchronized (i.this) {
                    try {
                        i.this.f15290f.c();
                        try {
                            i iVar = i.this;
                            if (iVar.f15292h != null) {
                                th = iVar.i;
                                if (th == null) {
                                    th = new n(i.this.f15292h);
                                }
                            } else {
                                th = null;
                            }
                            if (this.f15304a) {
                                throw new IOException("stream closed");
                            }
                            if (this.f15308f.b() > 0) {
                                com.anythink.core.common.n.c.c cVar2 = this.f15308f;
                                a_ = cVar2.a_(cVar, Math.min(j6, cVar2.b()));
                                i iVar2 = i.this;
                                long j9 = iVar2.f15285a + a_;
                                iVar2.f15285a = j9;
                                if (th == null && j9 >= iVar2.f15288d.f15204o.e() / 2) {
                                    i iVar3 = i.this;
                                    iVar3.f15288d.a(iVar3.f15287c, iVar3.f15285a);
                                    i.this.f15285a = 0L;
                                }
                            } else {
                                if (this.f15305b || th != null) {
                                    break;
                                }
                                i.this.i();
                                i.this.f15290f.b();
                            }
                        } finally {
                            i.this.f15290f.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (a_ == -1) {
                    a(a_);
                    return a_;
                }
                if (th == null) {
                    return -1L;
                }
                throw th;
            }
            i.this.f15290f.b();
            if (a_ == -1) {
            }
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long b9;
            synchronized (i.this) {
                this.f15304a = true;
                b9 = this.f15308f.b();
                this.f15308f.z();
                i.this.notifyAll();
            }
            if (b9 > 0) {
                a(b9);
            }
            i.this.g();
        }

        private void a(long j6) {
            if (!f15303c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f15288d.a(j6);
        }

        public final void a(com.anythink.core.common.n.c.e eVar, long j6) {
            boolean z3;
            boolean z6;
            long j9;
            if (!f15303c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j6 > 0) {
                synchronized (i.this) {
                    z3 = this.f15305b;
                    z6 = this.f15308f.b() + j6 > this.f15309g;
                }
                if (z6) {
                    eVar.i(j6);
                    i.this.a(com.anythink.core.common.n.b.a.e.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z3) {
                    eVar.i(j6);
                    return;
                }
                long a_ = eVar.a_(this.f15307e, j6);
                if (a_ != -1) {
                    j6 -= a_;
                    synchronized (i.this) {
                        try {
                            if (this.f15304a) {
                                j9 = this.f15307e.b();
                                this.f15307e.z();
                            } else {
                                boolean z9 = this.f15308f.b() == 0;
                                this.f15308f.a((w) this.f15307e);
                                if (z9) {
                                    i.this.notifyAll();
                                }
                                j9 = 0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (j9 > 0) {
                        a(j9);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return i.this.f15290f;
        }
    }

    public i(int i, f fVar, boolean z3, boolean z6, u uVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f15293k = arrayDeque;
        this.f15290f = new c();
        this.f15291g = new c();
        if (fVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f15287c = i;
        this.f15288d = fVar;
        this.f15286b = fVar.f15205p.e();
        b bVar = new b(fVar.f15204o.e());
        this.f15295m = bVar;
        a aVar = new a();
        this.f15289e = aVar;
        bVar.f15305b = z6;
        aVar.f15299b = z3;
        if (uVar != null) {
            arrayDeque.add(uVar);
        }
        if (b() && uVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!b() && uVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private int j() {
        return this.f15287c;
    }

    private f k() {
        return this.f15288d;
    }

    private synchronized com.anythink.core.common.n.b.a.e.b l() {
        return this.f15292h;
    }

    private x m() {
        return this.f15290f;
    }

    private x n() {
        return this.f15291g;
    }

    public final synchronized boolean a() {
        try {
            if (this.f15292h != null) {
                return false;
            }
            b bVar = this.f15295m;
            if (!bVar.f15305b) {
                if (bVar.f15304a) {
                }
                return true;
            }
            a aVar = this.f15289e;
            if (aVar.f15299b || aVar.f15298a) {
                if (this.f15294l) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b() {
        return this.f15288d.f15196f == ((this.f15287c & 1) == 1);
    }

    public final synchronized u c() {
        this.f15290f.c();
        while (this.f15293k.isEmpty() && this.f15292h == null) {
            try {
                i();
            } catch (Throwable th) {
                this.f15290f.b();
                throw th;
            }
        }
        this.f15290f.b();
        if (this.f15293k.isEmpty()) {
            IOException iOException = this.i;
            if (iOException != null) {
                throw iOException;
            }
            throw new n(this.f15292h);
        }
        return this.f15293k.removeFirst();
    }

    public final synchronized u d() {
        try {
            if (this.f15292h != null) {
                IOException iOException = this.i;
                if (iOException != null) {
                    throw iOException;
                }
                throw new n(this.f15292h);
            }
            b bVar = this.f15295m;
            if (!bVar.f15305b || !bVar.f15307e.g() || !this.f15295m.f15308f.g()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            if (this.f15295m.f15310h != null) {
                return this.f15295m.f15310h;
            }
            return com.anythink.core.common.n.b.a.c.f15038c;
        } finally {
        }
    }

    public final w e() {
        return this.f15295m;
    }

    public final v f() {
        synchronized (this) {
            try {
                if (!this.f15294l && !b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15289e;
    }

    public final void g() {
        boolean z3;
        boolean a9;
        if (!f15284j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.f15295m;
                if (!bVar.f15305b && bVar.f15304a) {
                    a aVar = this.f15289e;
                    if (!aVar.f15299b) {
                        if (aVar.f15298a) {
                        }
                    }
                    z3 = true;
                    a9 = a();
                }
                z3 = false;
                a9 = a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            a(com.anythink.core.common.n.b.a.e.b.CANCEL, (IOException) null);
        } else {
            if (a9) {
                return;
            }
            this.f15288d.b(this.f15287c);
        }
    }

    public final void h() {
        a aVar = this.f15289e;
        if (aVar.f15298a) {
            throw new IOException("stream closed");
        }
        if (aVar.f15299b) {
            throw new IOException("stream finished");
        }
        if (this.f15292h != null) {
            IOException iOException = this.i;
            if (iOException == null) {
                throw new n(this.f15292h);
            }
        }
    }

    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public class c extends com.anythink.core.common.n.c.a {
        public c() {
        }

        @Override // com.anythink.core.common.n.c.a
        public final void a() {
            i.this.a(com.anythink.core.common.n.b.a.e.b.CANCEL);
            i.this.f15288d.c();
        }

        public final void b() {
            if (d()) {
                throw a((IOException) null);
            }
        }

        @Override // com.anythink.core.common.n.c.a
        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    private boolean b(com.anythink.core.common.n.b.a.e.b bVar, IOException iOException) {
        if (!f15284j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f15292h != null) {
                    return false;
                }
                if (this.f15295m.f15305b && this.f15289e.f15299b) {
                    return false;
                }
                this.f15292h = bVar;
                this.i = iOException;
                notifyAll();
                this.f15288d.b(this.f15287c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(List<com.anythink.core.common.n.b.a.e.c> list, boolean z3, boolean z6) {
        boolean z9;
        if (!f15284j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list != null) {
            synchronized (this) {
                z9 = true;
                try {
                    this.f15294l = true;
                    if (z3) {
                        this.f15289e.f15299b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z6) {
                synchronized (this.f15288d) {
                    if (this.f15288d.f15203n != 0) {
                        z9 = false;
                    }
                }
                z6 = z9;
            }
            this.f15288d.a(this.f15287c, z3, list);
            if (z6) {
                this.f15288d.f15207r.b();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public final synchronized void b(com.anythink.core.common.n.b.a.e.b bVar) {
        if (this.f15292h == null) {
            this.f15292h = bVar;
            notifyAll();
        }
    }

    private void a(u uVar) {
        synchronized (this) {
            try {
                if (!this.f15289e.f15299b) {
                    if (uVar.a() != 0) {
                        this.f15289e.f15302g = uVar;
                    } else {
                        throw new IllegalArgumentException("trailers.size() == 0");
                    }
                } else {
                    throw new IllegalStateException("already finished");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(com.anythink.core.common.n.b.a.e.b bVar, IOException iOException) {
        if (b(bVar, iOException)) {
            this.f15288d.b(this.f15287c, bVar);
        }
    }

    public final void a(com.anythink.core.common.n.b.a.e.b bVar) {
        if (b(bVar, null)) {
            this.f15288d.a(this.f15287c, bVar);
        }
    }

    public final void a(com.anythink.core.common.n.c.e eVar, int i) {
        if (!f15284j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f15295m.a(eVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:10:0x0012, B:14:0x001a, B:16:0x002b, B:17:0x002f, B:18:0x0036, B:24:0x0022), top: B:9:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u uVar, boolean z3) {
        boolean a9;
        if (!f15284j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f15294l && z3) {
                    this.f15295m.f15310h = uVar;
                    if (z3) {
                        this.f15295m.f15305b = true;
                    }
                    a9 = a();
                    notifyAll();
                }
                this.f15294l = true;
                this.f15293k.add(uVar);
                if (z3) {
                }
                a9 = a();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a9) {
            return;
        }
        this.f15288d.b(this.f15287c);
    }

    public final void a(long j6) {
        this.f15286b += j6;
        if (j6 > 0) {
            notifyAll();
        }
    }
}
