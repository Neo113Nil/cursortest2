package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0565a;
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
    static final /* synthetic */ boolean f15806b = true;

    /* renamed from: a, reason: collision with root package name */
    public e f15807a;

    /* renamed from: c, reason: collision with root package name */
    private final z f15808c;

    /* renamed from: d, reason: collision with root package name */
    private final f f15809d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15810e;

    /* renamed from: f, reason: collision with root package name */
    private final r f15811f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.core.common.n.c.a f15812g;

    /* renamed from: h, reason: collision with root package name */
    private Object f15813h;
    private ad i;

    /* renamed from: j, reason: collision with root package name */
    private d f15814j;

    /* renamed from: k, reason: collision with root package name */
    private c f15815k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15816l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15817m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15818n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15819o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15820p;

    public static final class a extends WeakReference<j> {

        /* renamed from: a, reason: collision with root package name */
        final Object f15822a;

        public a(j jVar, Object obj) {
            super(jVar);
            this.f15822a = obj;
        }
    }

    public j(z zVar, com.anythink.core.common.n.b.e eVar) {
        com.anythink.core.common.n.c.a aVar = new com.anythink.core.common.n.c.a() { // from class: com.anythink.core.common.n.b.a.b.j.1
            @Override // com.anythink.core.common.n.c.a
            public final void a() {
                j.this.i();
            }
        };
        this.f15812g = aVar;
        this.f15808c = zVar;
        this.f15809d = com.anythink.core.common.n.b.a.a.f15656a.a(zVar.m());
        this.f15810e = eVar;
        this.f15811f = zVar.s().create(eVar);
        aVar.a(zVar.a(), TimeUnit.MILLISECONDS);
    }

    public final x a() {
        return this.f15812g;
    }

    public final void b() {
        this.f15812g.c();
    }

    public final void c() {
        if (this.f15819o) {
            throw new IllegalStateException();
        }
        this.f15819o = true;
        this.f15812g.d();
    }

    public final void d() {
        this.f15813h = com.anythink.core.common.n.b.a.g.c.e().a("response.body().close()");
    }

    public final Socket e() {
        if (!f15806b && !Thread.holdsLock(this.f15809d)) {
            throw new AssertionError();
        }
        int size = this.f15807a.f15771e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f15807a.f15771e.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f15807a;
        eVar.f15771e.remove(i);
        this.f15807a = null;
        if (eVar.f15771e.isEmpty()) {
            eVar.f15772f = System.nanoTime();
            if (this.f15809d.b(eVar)) {
                return eVar.b();
            }
        }
        return null;
    }

    public final void f() {
        synchronized (this.f15809d) {
            try {
                if (this.f15820p) {
                    throw new IllegalStateException();
                }
                this.f15815k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        return this.f15814j.c() && this.f15814j.d();
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f15809d) {
            z6 = this.f15815k != null;
        }
        return z6;
    }

    public final void i() {
        c cVar;
        e a9;
        synchronized (this.f15809d) {
            try {
                this.f15818n = true;
                cVar = this.f15815k;
                d dVar = this.f15814j;
                a9 = (dVar == null || dVar.a() == null) ? this.f15807a : this.f15814j.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.f15743e.e();
        } else if (a9 != null) {
            a9.f();
        }
    }

    public final boolean j() {
        boolean z6;
        synchronized (this.f15809d) {
            z6 = this.f15818n;
        }
        return z6;
    }

    private IOException b(IOException iOException) {
        if (this.f15819o || !this.f15812g.d()) {
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
            if (com.anythink.core.common.n.b.a.c.a(adVar2.a(), adVar.a()) && this.f15814j.d()) {
                return;
            }
            if (this.f15815k != null) {
                throw new IllegalStateException();
            }
            if (this.f15814j != null) {
                a((IOException) null, true);
                this.f15814j = null;
            }
        }
        this.i = adVar;
        f fVar = this.f15809d;
        v a9 = adVar.a();
        if (a9.c()) {
            sSLSocketFactory = this.f15808c.h();
            hostnameVerifier = this.f15808c.i();
            gVar = this.f15808c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        this.f15814j = new d(this, fVar, new C0565a(a9.f(), a9.g(), this.f15808c.f(), this.f15808c.g(), sSLSocketFactory, hostnameVerifier, gVar, this.f15808c.l(), this.f15808c.c(), this.f15808c.q(), this.f15808c.r(), this.f15808c.d()), this.f15810e, this.f15811f);
    }

    private C0565a a(v vVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        com.anythink.core.common.n.b.g gVar;
        if (vVar.c()) {
            sSLSocketFactory = this.f15808c.h();
            hostnameVerifier = this.f15808c.i();
            gVar = this.f15808c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C0565a(vVar.f(), vVar.g(), this.f15808c.f(), this.f15808c.g(), sSLSocketFactory, hostnameVerifier, gVar, this.f15808c.l(), this.f15808c.c(), this.f15808c.q(), this.f15808c.r(), this.f15808c.d());
    }

    public final c a(w.a aVar, boolean z6) {
        synchronized (this.f15809d) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!this.f15820p) {
                    if (this.f15815k == null) {
                        c cVar = new c(this, this.f15810e, this.f15811f, this.f15814j, this.f15814j.a(this.f15808c, aVar, z6));
                        synchronized (this.f15809d) {
                            this.f15815k = cVar;
                            this.f15816l = false;
                            this.f15817m = false;
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
        if (!f15806b && !Thread.holdsLock(this.f15809d)) {
            throw new AssertionError();
        }
        if (this.f15807a == null) {
            this.f15807a = eVar;
            eVar.f15771e.add(new a(this, this.f15813h));
            return;
        }
        throw new IllegalStateException();
    }

    public final IOException a(c cVar, boolean z6, boolean z9, IOException iOException) {
        boolean z10;
        synchronized (this.f15809d) {
            try {
                c cVar2 = this.f15815k;
                if (cVar != cVar2) {
                    return iOException;
                }
                boolean z11 = true;
                if (z6) {
                    z10 = !this.f15816l;
                    this.f15816l = true;
                } else {
                    z10 = false;
                }
                if (z9) {
                    if (!this.f15817m) {
                        z10 = true;
                    }
                    this.f15817m = true;
                }
                if (this.f15816l && this.f15817m && z10) {
                    cVar2.a().f15770d++;
                    this.f15815k = null;
                } else {
                    z11 = false;
                }
                return z11 ? a(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IOException a(IOException iOException) {
        synchronized (this.f15809d) {
            this.f15820p = true;
        }
        return a(iOException, false);
    }

    private IOException a(IOException iOException, boolean z6) {
        Socket e9;
        boolean z9;
        synchronized (this.f15809d) {
            if (z6) {
                try {
                    if (this.f15815k != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e9 = (this.f15807a != null && this.f15815k == null && (z6 || this.f15820p)) ? e() : null;
            z9 = this.f15820p && this.f15815k == null;
        }
        com.anythink.core.common.n.b.a.c.a(e9);
        if (!z9 || this.f15819o || !this.f15812g.d()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
