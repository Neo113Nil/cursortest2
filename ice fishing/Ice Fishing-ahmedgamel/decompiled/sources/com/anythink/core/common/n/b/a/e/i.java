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
    static final /* synthetic */ boolean f16071j = true;

    /* renamed from: a, reason: collision with root package name */
    long f16072a = 0;

    /* renamed from: b, reason: collision with root package name */
    long f16073b;

    /* renamed from: c, reason: collision with root package name */
    final int f16074c;

    /* renamed from: d, reason: collision with root package name */
    final f f16075d;

    /* renamed from: e, reason: collision with root package name */
    final a f16076e;

    /* renamed from: f, reason: collision with root package name */
    final c f16077f;

    /* renamed from: g, reason: collision with root package name */
    final c f16078g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.core.common.n.b.a.e.b f16079h;
    IOException i;

    /* renamed from: k, reason: collision with root package name */
    private final Deque<u> f16080k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16081l;

    /* renamed from: m, reason: collision with root package name */
    private final b f16082m;

    public final class a implements v {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f16083c = true;

        /* renamed from: e, reason: collision with root package name */
        private static final long f16084e = 16384;

        /* renamed from: a, reason: collision with root package name */
        boolean f16085a;

        /* renamed from: b, reason: collision with root package name */
        boolean f16086b;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f16088f = new com.anythink.core.common.n.c.c();

        /* renamed from: g, reason: collision with root package name */
        private u f16089g;

        public a() {
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!f16083c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.f16085a) {
                    return;
                }
                if (!i.this.f16076e.f16086b) {
                    boolean z6 = this.f16088f.b() > 0;
                    if (this.f16089g != null) {
                        while (this.f16088f.b() > 0) {
                            a(false);
                        }
                        i iVar = i.this;
                        iVar.f16075d.a(iVar.f16074c, true, com.anythink.core.common.n.b.a.c.a(this.f16089g));
                    } else if (z6) {
                        while (this.f16088f.b() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar2 = i.this;
                        iVar2.f16075d.a(iVar2.f16074c, true, (com.anythink.core.common.n.c.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f16085a = true;
                }
                i.this.f16075d.f15994r.b();
                i.this.g();
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (!f16083c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.h();
            }
            while (this.f16088f.b() > 0) {
                a(false);
                i.this.f16075d.f15994r.b();
            }
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (!f16083c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f16088f.a(cVar, j6);
            while (this.f16088f.b() >= f16084e) {
                a(false);
            }
        }

        private void a(boolean z6) {
            i iVar;
            long min;
            i iVar2;
            boolean z9;
            synchronized (i.this) {
                i.this.f16078g.c();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f16073b > 0 || this.f16086b || this.f16085a || iVar.f16079h != null) {
                            break;
                        } else {
                            iVar.i();
                        }
                    } finally {
                        i.this.f16078g.b();
                    }
                }
                iVar.f16078g.b();
                i.this.h();
                min = Math.min(i.this.f16073b, this.f16088f.b());
                iVar2 = i.this;
                iVar2.f16073b -= min;
            }
            iVar2.f16078g.c();
            if (z6) {
                try {
                    if (min == this.f16088f.b()) {
                        z9 = true;
                        boolean z10 = z9;
                        i iVar3 = i.this;
                        iVar3.f16075d.a(iVar3.f16074c, z10, this.f16088f, min);
                        i.this.f16078g.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z9 = false;
            boolean z102 = z9;
            i iVar32 = i.this;
            iVar32.f16075d.a(iVar32.f16074c, z102, this.f16088f, min);
            i.this.f16078g.b();
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return i.this.f16078g;
        }
    }

    public final class b implements w {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f16090c = true;

        /* renamed from: a, reason: collision with root package name */
        boolean f16091a;

        /* renamed from: b, reason: collision with root package name */
        boolean f16092b;

        /* renamed from: e, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f16094e = new com.anythink.core.common.n.c.c();

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f16095f = new com.anythink.core.common.n.c.c();

        /* renamed from: g, reason: collision with root package name */
        private final long f16096g;

        /* renamed from: h, reason: collision with root package name */
        private u f16097h;

        public b(long j6) {
            this.f16096g = j6;
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
                        i.this.f16077f.c();
                        try {
                            i iVar = i.this;
                            if (iVar.f16079h != null) {
                                th = iVar.i;
                                if (th == null) {
                                    th = new n(i.this.f16079h);
                                }
                            } else {
                                th = null;
                            }
                            if (this.f16091a) {
                                throw new IOException("stream closed");
                            }
                            if (this.f16095f.b() > 0) {
                                com.anythink.core.common.n.c.c cVar2 = this.f16095f;
                                a_ = cVar2.a_(cVar, Math.min(j6, cVar2.b()));
                                i iVar2 = i.this;
                                long j9 = iVar2.f16072a + a_;
                                iVar2.f16072a = j9;
                                if (th == null && j9 >= iVar2.f16075d.f15991o.e() / 2) {
                                    i iVar3 = i.this;
                                    iVar3.f16075d.a(iVar3.f16074c, iVar3.f16072a);
                                    i.this.f16072a = 0L;
                                }
                            } else {
                                if (this.f16092b || th != null) {
                                    break;
                                }
                                i.this.i();
                                i.this.f16077f.b();
                            }
                        } finally {
                            i.this.f16077f.b();
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
            i.this.f16077f.b();
            if (a_ == -1) {
            }
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long b9;
            synchronized (i.this) {
                this.f16091a = true;
                b9 = this.f16095f.b();
                this.f16095f.z();
                i.this.notifyAll();
            }
            if (b9 > 0) {
                a(b9);
            }
            i.this.g();
        }

        private void a(long j6) {
            if (!f16090c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f16075d.a(j6);
        }

        public final void a(com.anythink.core.common.n.c.e eVar, long j6) {
            boolean z6;
            boolean z9;
            long j9;
            if (!f16090c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j6 > 0) {
                synchronized (i.this) {
                    z6 = this.f16092b;
                    z9 = this.f16095f.b() + j6 > this.f16096g;
                }
                if (z9) {
                    eVar.i(j6);
                    i.this.a(com.anythink.core.common.n.b.a.e.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z6) {
                    eVar.i(j6);
                    return;
                }
                long a_ = eVar.a_(this.f16094e, j6);
                if (a_ != -1) {
                    j6 -= a_;
                    synchronized (i.this) {
                        try {
                            if (this.f16091a) {
                                j9 = this.f16094e.b();
                                this.f16094e.z();
                            } else {
                                boolean z10 = this.f16095f.b() == 0;
                                this.f16095f.a((w) this.f16094e);
                                if (z10) {
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
            return i.this.f16077f;
        }
    }

    public i(int i, f fVar, boolean z6, boolean z9, u uVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f16080k = arrayDeque;
        this.f16077f = new c();
        this.f16078g = new c();
        if (fVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f16074c = i;
        this.f16075d = fVar;
        this.f16073b = fVar.f15992p.e();
        b bVar = new b(fVar.f15991o.e());
        this.f16082m = bVar;
        a aVar = new a();
        this.f16076e = aVar;
        bVar.f16092b = z9;
        aVar.f16086b = z6;
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
        return this.f16074c;
    }

    private f k() {
        return this.f16075d;
    }

    private synchronized com.anythink.core.common.n.b.a.e.b l() {
        return this.f16079h;
    }

    private x m() {
        return this.f16077f;
    }

    private x n() {
        return this.f16078g;
    }

    public final synchronized boolean a() {
        try {
            if (this.f16079h != null) {
                return false;
            }
            b bVar = this.f16082m;
            if (!bVar.f16092b) {
                if (bVar.f16091a) {
                }
                return true;
            }
            a aVar = this.f16076e;
            if (aVar.f16086b || aVar.f16085a) {
                if (this.f16081l) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b() {
        return this.f16075d.f15983f == ((this.f16074c & 1) == 1);
    }

    public final synchronized u c() {
        this.f16077f.c();
        while (this.f16080k.isEmpty() && this.f16079h == null) {
            try {
                i();
            } catch (Throwable th) {
                this.f16077f.b();
                throw th;
            }
        }
        this.f16077f.b();
        if (this.f16080k.isEmpty()) {
            IOException iOException = this.i;
            if (iOException != null) {
                throw iOException;
            }
            throw new n(this.f16079h);
        }
        return this.f16080k.removeFirst();
    }

    public final synchronized u d() {
        try {
            if (this.f16079h != null) {
                IOException iOException = this.i;
                if (iOException != null) {
                    throw iOException;
                }
                throw new n(this.f16079h);
            }
            b bVar = this.f16082m;
            if (!bVar.f16092b || !bVar.f16094e.g() || !this.f16082m.f16095f.g()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            if (this.f16082m.f16097h != null) {
                return this.f16082m.f16097h;
            }
            return com.anythink.core.common.n.b.a.c.f15825c;
        } finally {
        }
    }

    public final w e() {
        return this.f16082m;
    }

    public final v f() {
        synchronized (this) {
            try {
                if (!this.f16081l && !b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f16076e;
    }

    public final void g() {
        boolean z6;
        boolean a9;
        if (!f16071j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.f16082m;
                if (!bVar.f16092b && bVar.f16091a) {
                    a aVar = this.f16076e;
                    if (!aVar.f16086b) {
                        if (aVar.f16085a) {
                        }
                    }
                    z6 = true;
                    a9 = a();
                }
                z6 = false;
                a9 = a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            a(com.anythink.core.common.n.b.a.e.b.CANCEL, (IOException) null);
        } else {
            if (a9) {
                return;
            }
            this.f16075d.b(this.f16074c);
        }
    }

    public final void h() {
        a aVar = this.f16076e;
        if (aVar.f16085a) {
            throw new IOException("stream closed");
        }
        if (aVar.f16086b) {
            throw new IOException("stream finished");
        }
        if (this.f16079h != null) {
            IOException iOException = this.i;
            if (iOException == null) {
                throw new n(this.f16079h);
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
            i.this.f16075d.c();
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
        if (!f16071j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f16079h != null) {
                    return false;
                }
                if (this.f16082m.f16092b && this.f16076e.f16086b) {
                    return false;
                }
                this.f16079h = bVar;
                this.i = iOException;
                notifyAll();
                this.f16075d.b(this.f16074c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(List<com.anythink.core.common.n.b.a.e.c> list, boolean z6, boolean z9) {
        boolean z10;
        if (!f16071j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list != null) {
            synchronized (this) {
                z10 = true;
                try {
                    this.f16081l = true;
                    if (z6) {
                        this.f16076e.f16086b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z9) {
                synchronized (this.f16075d) {
                    if (this.f16075d.f15990n != 0) {
                        z10 = false;
                    }
                }
                z9 = z10;
            }
            this.f16075d.a(this.f16074c, z6, list);
            if (z9) {
                this.f16075d.f15994r.b();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public final synchronized void b(com.anythink.core.common.n.b.a.e.b bVar) {
        if (this.f16079h == null) {
            this.f16079h = bVar;
            notifyAll();
        }
    }

    private void a(u uVar) {
        synchronized (this) {
            try {
                if (!this.f16076e.f16086b) {
                    if (uVar.a() != 0) {
                        this.f16076e.f16089g = uVar;
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
            this.f16075d.b(this.f16074c, bVar);
        }
    }

    public final void a(com.anythink.core.common.n.b.a.e.b bVar) {
        if (b(bVar, null)) {
            this.f16075d.a(this.f16074c, bVar);
        }
    }

    public final void a(com.anythink.core.common.n.c.e eVar, int i) {
        if (!f16071j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f16082m.a(eVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:10:0x0012, B:14:0x001a, B:16:0x002b, B:17:0x002f, B:18:0x0036, B:24:0x0022), top: B:9:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u uVar, boolean z6) {
        boolean a9;
        if (!f16071j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f16081l && z6) {
                    this.f16082m.f16097h = uVar;
                    if (z6) {
                        this.f16082m.f16092b = true;
                    }
                    a9 = a();
                    notifyAll();
                }
                this.f16081l = true;
                this.f16080k.add(uVar);
                if (z6) {
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
        this.f16075d.b(this.f16074c);
    }

    public final void a(long j6) {
        this.f16073b += j6;
        if (j6 > 0) {
            notifyAll();
        }
    }
}
