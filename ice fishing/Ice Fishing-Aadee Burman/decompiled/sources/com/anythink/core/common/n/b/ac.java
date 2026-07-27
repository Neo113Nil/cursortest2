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
    final z f15471a;

    /* renamed from: b, reason: collision with root package name */
    final ad f15472b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f15473c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.b.j f15474d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15475e;

    public final class a extends com.anythink.core.common.n.b.a.b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ boolean f15476a = true;

        /* renamed from: d, reason: collision with root package name */
        private final f f15478d;

        /* renamed from: e, reason: collision with root package name */
        private volatile AtomicInteger f15479e;

        public a(f fVar) {
            super("%s %s", aa.f15462a, ac.this.i());
            this.f15479e = new AtomicInteger(0);
            this.f15478d = fVar;
        }

        private ad d() {
            return ac.this.f15472b;
        }

        private ac e() {
            return ac.this;
        }

        public final AtomicInteger a() {
            return this.f15479e;
        }

        public final String b() {
            return ac.this.f15472b.f15480a.f15734m;
        }

        @Override // com.anythink.core.common.n.b.a.b
        public final void c() {
            boolean z3;
            Throwable th;
            IOException e9;
            p pVar;
            ac.this.f15474d.b();
            try {
                try {
                    z3 = true;
                    try {
                        this.f15478d.a(ac.this.j());
                        pVar = ac.this.f15471a.f15781c;
                    } catch (IOException e10) {
                        e9 = e10;
                        if (z3) {
                            com.anythink.core.common.n.b.a.g.c.e().a(4, "Callback failure for " + ac.this.h(), e9);
                        } else {
                            this.f15478d.a(e9);
                        }
                        pVar = ac.this.f15471a.f15781c;
                        pVar.b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        ac.this.c();
                        if (!z3) {
                            IOException iOException = new IOException("canceled due to ".concat(String.valueOf(th)));
                            iOException.addSuppressed(th);
                            this.f15478d.a(iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    ac.this.f15471a.f15781c.b(this);
                    throw th3;
                }
            } catch (IOException e11) {
                z3 = false;
                e9 = e11;
            } catch (Throwable th4) {
                z3 = false;
                th = th4;
            }
            pVar.b(this);
        }

        public final void a(a aVar) {
            this.f15479e = aVar.f15479e;
        }

        public final void a(ExecutorService executorService) {
            if (!f15476a && Thread.holdsLock(ac.this.f15471a.f15781c)) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e9) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e9);
                    ac.this.f15474d.a(interruptedIOException);
                    this.f15478d.a(interruptedIOException);
                    ac.this.f15471a.f15781c.b(this);
                }
            } catch (Throwable th) {
                ac.this.f15471a.f15781c.b(this);
                throw th;
            }
        }
    }

    private ac(z zVar, ad adVar, boolean z3) {
        this.f15471a = zVar;
        this.f15472b = adVar;
        this.f15473c = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.core.common.n.b.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ac g() {
        return a(this.f15471a, this.f15472b, this.f15473c);
    }

    @Override // com.anythink.core.common.n.b.e
    public final af b() {
        synchronized (this) {
            if (this.f15475e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f15475e = true;
        }
        this.f15474d.b();
        this.f15474d.d();
        try {
            this.f15471a.f15781c.a(this);
            return j();
        } finally {
            this.f15471a.f15781c.b(this);
        }
    }

    @Override // com.anythink.core.common.n.b.e
    public final void c() {
        this.f15474d.i();
    }

    @Override // com.anythink.core.common.n.b.e
    public final synchronized boolean d() {
        return this.f15475e;
    }

    @Override // com.anythink.core.common.n.b.e
    public final boolean e() {
        return this.f15474d.j();
    }

    @Override // com.anythink.core.common.n.b.e
    public final com.anythink.core.common.n.c.x f() {
        return this.f15474d.a();
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15474d.j() ? "canceled " : "");
        sb.append(this.f15473c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(i());
        return sb.toString();
    }

    public final String i() {
        return this.f15472b.f15480a.l();
    }

    public final af j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15471a.f15785g);
        arrayList.add(new com.anythink.core.common.n.b.a.c.j(this.f15471a));
        arrayList.add(new com.anythink.core.common.n.b.a.c.a(this.f15471a.f15788k));
        z zVar = this.f15471a;
        c cVar = zVar.f15789l;
        arrayList.add(new com.anythink.core.common.n.b.a.a.a(cVar != null ? cVar.f15547a : zVar.f15790m));
        arrayList.add(new com.anythink.core.common.n.b.a.b.a(this.f15471a));
        if (!this.f15473c) {
            arrayList.addAll(this.f15471a.f15786h);
        }
        arrayList.add(new com.anythink.core.common.n.b.a.c.b(this.f15473c));
        com.anythink.core.common.n.b.a.b.j jVar = this.f15474d;
        ad adVar = this.f15472b;
        z zVar2 = this.f15471a;
        try {
            try {
                af a9 = new com.anythink.core.common.n.b.a.c.g(arrayList, jVar, null, 0, adVar, this, zVar2.f15777A, zVar2.f15778B, zVar2.f15779C).a(this.f15472b);
                if (this.f15474d.j()) {
                    com.anythink.core.common.n.b.a.c.a(a9);
                    throw new IOException("Canceled");
                }
                this.f15474d.a((IOException) null);
                return a9;
            } catch (IOException e9) {
                throw this.f15474d.a(e9);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                this.f15474d.a((IOException) null);
            }
            throw th;
        }
    }

    public static ac a(z zVar, ad adVar, boolean z3) {
        ac acVar = new ac(zVar, adVar, z3);
        acVar.f15474d = new com.anythink.core.common.n.b.a.b.j(zVar, acVar);
        return acVar;
    }

    @Override // com.anythink.core.common.n.b.e
    public final ad a() {
        return this.f15472b;
    }

    @Override // com.anythink.core.common.n.b.e
    public final void a(f fVar) {
        synchronized (this) {
            if (!this.f15475e) {
                this.f15475e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f15474d.d();
        this.f15471a.f15781c.a(new a(fVar));
    }
}
