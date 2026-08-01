package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0546a;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.v;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f15019b = true;

    /* renamed from: a, reason: collision with root package name */
    public e f15020a;

    /* renamed from: c, reason: collision with root package name */
    private final z f15021c;

    /* renamed from: d, reason: collision with root package name */
    private final f f15022d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15023e;

    /* renamed from: f, reason: collision with root package name */
    private final r f15024f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.core.common.n.c.a f15025g;

    /* renamed from: h, reason: collision with root package name */
    private Object f15026h;
    private ad i;

    /* renamed from: j, reason: collision with root package name */
    private d f15027j;

    /* renamed from: k, reason: collision with root package name */
    private c f15028k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15029l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15030m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15031n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15032o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15033p;

    public static final class a extends WeakReference<j> {

        /* renamed from: a, reason: collision with root package name */
        final Object f15035a;

        public a(j jVar, Object obj) {
            super(jVar);
            this.f15035a = obj;
        }
    }

    public j(z zVar, com.anythink.core.common.n.b.e eVar) {
        com.anythink.core.common.n.c.a aVar = new com.anythink.core.common.n.c.a() { // from class: com.anythink.core.common.n.b.a.b.j.1
            @Override // com.anythink.core.common.n.c.a
            public final void a() {
                j.this.i();
            }
        };
        this.f15025g = aVar;
        this.f15021c = zVar;
        this.f15022d = com.anythink.core.common.n.b.a.a.f14869a.a(zVar.m());
        this.f15023e = eVar;
        this.f15024f = zVar.s().create(eVar);
        aVar.a(zVar.a(), TimeUnit.MILLISECONDS);
    }

    public final x a() {
        return this.f15025g;
    }

    public final void b() {
        this.f15025g.c();
    }

    public final void c() {
        if (this.f15032o) {
            throw new IllegalStateException();
        }
        this.f15032o = true;
        this.f15025g.d();
    }

    public final void d() {
        this.f15026h = com.anythink.core.common.n.b.a.g.c.e().a("response.body().close()");
    }

    public final Socket e() {
        if (!f15019b && !Thread.holdsLock(this.f15022d)) {
            throw new AssertionError();
        }
        int size = this.f15020a.f14984e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f15020a.f14984e.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f15020a;
        eVar.f14984e.remove(i);
        this.f15020a = null;
        if (eVar.f14984e.isEmpty()) {
            eVar.f14985f = System.nanoTime();
            if (this.f15022d.b(eVar)) {
                return eVar.b();
            }
        }
        return null;
    }

    public final void f() {
        synchronized (this.f15022d) {
            try {
                if (this.f15033p) {
                    throw new IllegalStateException();
                }
                this.f15028k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        return this.f15027j.c() && this.f15027j.d();
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f15022d) {
            z3 = this.f15028k != null;
        }
        return z3;
    }

    public final void i() {
        c cVar;
        e a9;
        synchronized (this.f15022d) {
            try {
                this.f15031n = true;
                cVar = this.f15028k;
                d dVar = this.f15027j;
                a9 = (dVar == null || dVar.a() == null) ? this.f15020a : this.f15027j.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.f14956e.e();
        } else if (a9 != null) {
            a9.f();
        }
    }

    public final boolean j() {
        boolean z3;
        synchronized (this.f15022d) {
            z3 = this.f15031n;
        }
        return z3;
    }

    private IOException b(IOException iOException) {
        if (this.f15032o || !this.f15025g.d()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void a(ad adVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        com.anythink.core.common.n.b.g gVar;
        ad adVar2 = this.i;
        if (adVar2 != null) {
            if (com.anythink.core.common.n.b.a.c.a(adVar2.a(), adVar.a()) && this.f15027j.d()) {
                return;
            }
            if (this.f15028k != null) {
                throw new IllegalStateException();
            }
            if (this.f15027j != null) {
                a((IOException) null, true);
                this.f15027j = null;
            }
        }
        this.i = adVar;
        f fVar = this.f15022d;
        v a9 = adVar.a();
        if (a9.c()) {
            sSLSocketFactory = this.f15021c.h();
            hostnameVerifier = this.f15021c.i();
            gVar = this.f15021c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        this.f15027j = new d(this, fVar, new C0546a(a9.f(), a9.g(), this.f15021c.f(), this.f15021c.g(), sSLSocketFactory, hostnameVerifier, gVar, this.f15021c.l(), this.f15021c.c(), this.f15021c.q(), this.f15021c.r(), this.f15021c.d()), this.f15023e, this.f15024f);
    }

    private C0546a a(v vVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        com.anythink.core.common.n.b.g gVar;
        if (vVar.c()) {
            sSLSocketFactory = this.f15021c.h();
            hostnameVerifier = this.f15021c.i();
            gVar = this.f15021c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C0546a(vVar.f(), vVar.g(), this.f15021c.f(), this.f15021c.g(), sSLSocketFactory, hostnameVerifier, gVar, this.f15021c.l(), this.f15021c.c(), this.f15021c.q(), this.f15021c.r(), this.f15021c.d());
    }

    public final c a(w.a aVar, boolean z3) {
        synchronized (this.f15022d) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!this.f15033p) {
                    if (this.f15028k == null) {
                        c cVar = new c(this, this.f15023e, this.f15024f, this.f15027j, this.f15027j.a(this.f15021c, aVar, z3));
                        synchronized (this.f15022d) {
                            this.f15028k = cVar;
                            this.f15029l = false;
                            this.f15030m = false;
                        }
                        return cVar;
                    }
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                throw new IllegalStateException("released");
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void a(e eVar) {
        if (!f15019b && !Thread.holdsLock(this.f15022d)) {
            throw new AssertionError();
        }
        if (this.f15020a == null) {
            this.f15020a = eVar;
            eVar.f14984e.add(new a(this, this.f15026h));
            return;
        }
        throw new IllegalStateException();
    }

    public final IOException a(c cVar, boolean z3, boolean z6, IOException iOException) {
        boolean z9;
        synchronized (this.f15022d) {
            try {
                c cVar2 = this.f15028k;
                if (cVar != cVar2) {
                    return iOException;
                }
                boolean z10 = true;
                if (z3) {
                    z9 = !this.f15029l;
                    this.f15029l = true;
                } else {
                    z9 = false;
                }
                if (z6) {
                    if (!this.f15030m) {
                        z9 = true;
                    }
                    this.f15030m = true;
                }
                if (this.f15029l && this.f15030m && z9) {
                    cVar2.a().f14983d++;
                    this.f15028k = null;
                } else {
                    z10 = false;
                }
                return z10 ? a(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IOException a(IOException iOException) {
        synchronized (this.f15022d) {
            this.f15033p = true;
        }
        return a(iOException, false);
    }

    private IOException a(IOException iOException, boolean z3) {
        Socket e9;
        boolean z6;
        synchronized (this.f15022d) {
            if (z3) {
                try {
                    if (this.f15028k != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e9 = (this.f15020a != null && this.f15028k == null && (z3 || this.f15033p)) ? e() : null;
            z6 = this.f15033p && this.f15028k == null;
        }
        com.anythink.core.common.n.b.a.c.a(e9);
        if (!z6 || this.f15032o || !this.f15025g.d()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
