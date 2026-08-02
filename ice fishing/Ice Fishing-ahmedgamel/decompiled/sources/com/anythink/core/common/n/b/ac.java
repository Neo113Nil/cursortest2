package com.anythink.core.common.n.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class ac implements e {

    /* renamed from: a, reason: collision with root package name */
    final z f16258a;

    /* renamed from: b, reason: collision with root package name */
    final ad f16259b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f16260c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.b.j f16261d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16262e;

    public final class a extends com.anythink.core.common.n.b.a.b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ boolean f16263a = true;

        /* renamed from: d, reason: collision with root package name */
        private final f f16265d;

        /* renamed from: e, reason: collision with root package name */
        private volatile AtomicInteger f16266e;

        public a(f fVar) {
            super("%s %s", aa.f16249a, ac.this.i());
            this.f16266e = new AtomicInteger(0);
            this.f16265d = fVar;
        }

        private ad d() {
            return ac.this.f16259b;
        }

        private ac e() {
            return ac.this;
        }

        public final AtomicInteger a() {
            return this.f16266e;
        }

        public final String b() {
            return ac.this.f16259b.f16267a.f16521m;
        }

        @Override // com.anythink.core.common.n.b.a.b
        public final void c() {
            boolean z6;
            Throwable th;
            IOException e9;
            p pVar;
            ac.this.f16261d.b();
            try {
                try {
                    z6 = true;
                    try {
                        this.f16265d.a(ac.this.j());
                        pVar = ac.this.f16258a.f16568c;
                    } catch (IOException e10) {
                        e9 = e10;
                        if (z6) {
                            com.anythink.core.common.n.b.a.g.c.e().a(4, "Callback failure for " + ac.this.h(), e9);
                        } else {
                            this.f16265d.a(e9);
                        }
                        pVar = ac.this.f16258a.f16568c;
                        pVar.b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        ac.this.c();
                        if (!z6) {
                            IOException iOException = new IOException("canceled due to ".concat(String.valueOf(th)));
                            iOException.addSuppressed(th);
                            this.f16265d.a(iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    ac.this.f16258a.f16568c.b(this);
                    throw th3;
                }
            } catch (IOException e11) {
                z6 = false;
                e9 = e11;
            } catch (Throwable th4) {
                z6 = false;
                th = th4;
            }
            pVar.b(this);
        }

        public final void a(a aVar) {
            this.f16266e = aVar.f16266e;
        }

        public final void a(ExecutorService executorService) {
            if (!f16263a && Thread.holdsLock(ac.this.f16258a.f16568c)) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e9) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e9);
                    ac.this.f16261d.a(interruptedIOException);
                    this.f16265d.a(interruptedIOException);
                    ac.this.f16258a.f16568c.b(this);
                }
            } catch (Throwable th) {
                ac.this.f16258a.f16568c.b(this);
                throw th;
            }
        }
    }

    private ac(z zVar, ad adVar, boolean z6) {
        this.f16258a = zVar;
        this.f16259b = adVar;
        this.f16260c = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.core.common.n.b.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ac g() {
        return a(this.f16258a, this.f16259b, this.f16260c);
    }

    @Override // com.anythink.core.common.n.b.e
    public final af b() {
        synchronized (this) {
            if (this.f16262e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f16262e = true;
        }
        this.f16261d.b();
        this.f16261d.d();
        try {
            this.f16258a.f16568c.a(this);
            return j();
        } finally {
            this.f16258a.f16568c.b(this);
        }
    }

    @Override // com.anythink.core.common.n.b.e
    public final void c() {
        this.f16261d.i();
    }

    @Override // com.anythink.core.common.n.b.e
    public final synchronized boolean d() {
        return this.f16262e;
    }

    @Override // com.anythink.core.common.n.b.e
    public final boolean e() {
        return this.f16261d.j();
    }

    @Override // com.anythink.core.common.n.b.e
    public final com.anythink.core.common.n.c.x f() {
        return this.f16261d.a();
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16261d.j() ? "canceled " : "");
        sb.append(this.f16260c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(i());
        return sb.toString();
    }

    public final String i() {
        return this.f16259b.f16267a.l();
    }

    public final af j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f16258a.f16572g);
        arrayList.add(new com.anythink.core.common.n.b.a.c.j(this.f16258a));
        arrayList.add(new com.anythink.core.common.n.b.a.c.a(this.f16258a.f16575k));
        z zVar = this.f16258a;
        c cVar = zVar.f16576l;
        arrayList.add(new com.anythink.core.common.n.b.a.a.a(cVar != null ? cVar.f16334a : zVar.f16577m));
        arrayList.add(new com.anythink.core.common.n.b.a.b.a(this.f16258a));
        if (!this.f16260c) {
            arrayList.addAll(this.f16258a.f16573h);
        }
        arrayList.add(new com.anythink.core.common.n.b.a.c.b(this.f16260c));
        com.anythink.core.common.n.b.a.b.j jVar = this.f16261d;
        ad adVar = this.f16259b;
        z zVar2 = this.f16258a;
        try {
            try {
                af a9 = new com.anythink.core.common.n.b.a.c.g(arrayList, jVar, null, 0, adVar, this, zVar2.f16564A, zVar2.f16565B, zVar2.f16566C).a(this.f16259b);
                if (this.f16261d.j()) {
                    com.anythink.core.common.n.b.a.c.a(a9);
                    throw new IOException("Canceled");
                }
                this.f16261d.a((IOException) null);
                return a9;
            } catch (IOException e9) {
                throw this.f16261d.a(e9);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                this.f16261d.a((IOException) null);
            }
            throw th;
        }
    }

    public static ac a(z zVar, ad adVar, boolean z6) {
        ac acVar = new ac(zVar, adVar, z6);
        acVar.f16261d = new com.anythink.core.common.n.b.a.b.j(zVar, acVar);
        return acVar;
    }

    @Override // com.anythink.core.common.n.b.e
    public final ad a() {
        return this.f16259b;
    }

    @Override // com.anythink.core.common.n.b.e
    public final void a(f fVar) {
        synchronized (this) {
            if (!this.f16262e) {
                this.f16262e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f16261d.d();
        this.f16258a.f16568c.a(new a(fVar));
    }
}
