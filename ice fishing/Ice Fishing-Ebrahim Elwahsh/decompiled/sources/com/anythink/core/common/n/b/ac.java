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
    final z f15629a;

    /* renamed from: b, reason: collision with root package name */
    final ad f15630b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f15631c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.b.j f15632d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15633e;

    public final class a extends com.anythink.core.common.n.b.a.b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ boolean f15634a = true;

        /* renamed from: d, reason: collision with root package name */
        private final f f15636d;

        /* renamed from: e, reason: collision with root package name */
        private volatile AtomicInteger f15637e;

        public a(f fVar) {
            super("%s %s", aa.f15620a, ac.this.i());
            this.f15637e = new AtomicInteger(0);
            this.f15636d = fVar;
        }

        private ad d() {
            return ac.this.f15630b;
        }

        private ac e() {
            return ac.this;
        }

        public final AtomicInteger a() {
            return this.f15637e;
        }

        public final String b() {
            return ac.this.f15630b.f15638a.f15892m;
        }

        @Override // com.anythink.core.common.n.b.a.b
        public final void c() {
            boolean z8;
            Throwable th;
            IOException e6;
            p pVar;
            ac.this.f15632d.b();
            try {
                try {
                    z8 = true;
                    try {
                        this.f15636d.a(ac.this.j());
                        pVar = ac.this.f15629a.f15939c;
                    } catch (IOException e9) {
                        e6 = e9;
                        if (z8) {
                            com.anythink.core.common.n.b.a.g.c.e().a(4, "Callback failure for " + ac.this.h(), e6);
                        } else {
                            this.f15636d.a(e6);
                        }
                        pVar = ac.this.f15629a.f15939c;
                        pVar.b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        ac.this.c();
                        if (!z8) {
                            IOException iOException = new IOException("canceled due to ".concat(String.valueOf(th)));
                            iOException.addSuppressed(th);
                            this.f15636d.a(iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    ac.this.f15629a.f15939c.b(this);
                    throw th3;
                }
            } catch (IOException e10) {
                z8 = false;
                e6 = e10;
            } catch (Throwable th4) {
                z8 = false;
                th = th4;
            }
            pVar.b(this);
        }

        public final void a(a aVar) {
            this.f15637e = aVar.f15637e;
        }

        public final void a(ExecutorService executorService) {
            if (!f15634a && Thread.holdsLock(ac.this.f15629a.f15939c)) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e6) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e6);
                    ac.this.f15632d.a(interruptedIOException);
                    this.f15636d.a(interruptedIOException);
                    ac.this.f15629a.f15939c.b(this);
                }
            } catch (Throwable th) {
                ac.this.f15629a.f15939c.b(this);
                throw th;
            }
        }
    }

    private ac(z zVar, ad adVar, boolean z8) {
        this.f15629a = zVar;
        this.f15630b = adVar;
        this.f15631c = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.core.common.n.b.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ac g() {
        return a(this.f15629a, this.f15630b, this.f15631c);
    }

    @Override // com.anythink.core.common.n.b.e
    public final af b() {
        synchronized (this) {
            if (this.f15633e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f15633e = true;
        }
        this.f15632d.b();
        this.f15632d.d();
        try {
            this.f15629a.f15939c.a(this);
            return j();
        } finally {
            this.f15629a.f15939c.b(this);
        }
    }

    @Override // com.anythink.core.common.n.b.e
    public final void c() {
        this.f15632d.i();
    }

    @Override // com.anythink.core.common.n.b.e
    public final synchronized boolean d() {
        return this.f15633e;
    }

    @Override // com.anythink.core.common.n.b.e
    public final boolean e() {
        return this.f15632d.j();
    }

    @Override // com.anythink.core.common.n.b.e
    public final com.anythink.core.common.n.c.x f() {
        return this.f15632d.a();
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15632d.j() ? "canceled " : "");
        sb.append(this.f15631c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(i());
        return sb.toString();
    }

    public final String i() {
        return this.f15630b.f15638a.l();
    }

    public final af j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15629a.f15943g);
        arrayList.add(new com.anythink.core.common.n.b.a.c.j(this.f15629a));
        arrayList.add(new com.anythink.core.common.n.b.a.c.a(this.f15629a.f15946k));
        z zVar = this.f15629a;
        c cVar = zVar.f15947l;
        arrayList.add(new com.anythink.core.common.n.b.a.a.a(cVar != null ? cVar.f15705a : zVar.f15948m));
        arrayList.add(new com.anythink.core.common.n.b.a.b.a(this.f15629a));
        if (!this.f15631c) {
            arrayList.addAll(this.f15629a.f15944h);
        }
        arrayList.add(new com.anythink.core.common.n.b.a.c.b(this.f15631c));
        com.anythink.core.common.n.b.a.b.j jVar = this.f15632d;
        ad adVar = this.f15630b;
        z zVar2 = this.f15629a;
        try {
            try {
                af a9 = new com.anythink.core.common.n.b.a.c.g(arrayList, jVar, null, 0, adVar, this, zVar2.f15935A, zVar2.f15936B, zVar2.f15937C).a(this.f15630b);
                if (this.f15632d.j()) {
                    com.anythink.core.common.n.b.a.c.a(a9);
                    throw new IOException("Canceled");
                }
                this.f15632d.a((IOException) null);
                return a9;
            } catch (IOException e6) {
                throw this.f15632d.a(e6);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                this.f15632d.a((IOException) null);
            }
            throw th;
        }
    }

    public static ac a(z zVar, ad adVar, boolean z8) {
        ac acVar = new ac(zVar, adVar, z8);
        acVar.f15632d = new com.anythink.core.common.n.b.a.b.j(zVar, acVar);
        return acVar;
    }

    @Override // com.anythink.core.common.n.b.e
    public final ad a() {
        return this.f15630b;
    }

    @Override // com.anythink.core.common.n.b.e
    public final void a(f fVar) {
        synchronized (this) {
            if (!this.f15633e) {
                this.f15633e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f15632d.d();
        this.f15629a.f15939c.a(new a(fVar));
    }
}
