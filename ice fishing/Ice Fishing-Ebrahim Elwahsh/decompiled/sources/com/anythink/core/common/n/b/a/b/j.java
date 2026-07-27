package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0545a;
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
    static final /* synthetic */ boolean f15177b = true;

    /* renamed from: a, reason: collision with root package name */
    public e f15178a;

    /* renamed from: c, reason: collision with root package name */
    private final z f15179c;

    /* renamed from: d, reason: collision with root package name */
    private final f f15180d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15181e;

    /* renamed from: f, reason: collision with root package name */
    private final r f15182f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.core.common.n.c.a f15183g;

    /* renamed from: h, reason: collision with root package name */
    private Object f15184h;
    private ad i;

    /* renamed from: j, reason: collision with root package name */
    private d f15185j;

    /* renamed from: k, reason: collision with root package name */
    private c f15186k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15187l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15188m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15189n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15190o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15191p;

    public static final class a extends WeakReference<j> {

        /* renamed from: a, reason: collision with root package name */
        final Object f15193a;

        public a(j jVar, Object obj) {
            super(jVar);
            this.f15193a = obj;
        }
    }

    public j(z zVar, com.anythink.core.common.n.b.e eVar) {
        com.anythink.core.common.n.c.a aVar = new com.anythink.core.common.n.c.a() { // from class: com.anythink.core.common.n.b.a.b.j.1
            @Override // com.anythink.core.common.n.c.a
            public final void a() {
                j.this.i();
            }
        };
        this.f15183g = aVar;
        this.f15179c = zVar;
        this.f15180d = com.anythink.core.common.n.b.a.a.f15027a.a(zVar.m());
        this.f15181e = eVar;
        this.f15182f = zVar.s().create(eVar);
        aVar.a(zVar.a(), TimeUnit.MILLISECONDS);
    }

    public final x a() {
        return this.f15183g;
    }

    public final void b() {
        this.f15183g.c();
    }

    public final void c() {
        if (this.f15190o) {
            throw new IllegalStateException();
        }
        this.f15190o = true;
        this.f15183g.d();
    }

    public final void d() {
        this.f15184h = com.anythink.core.common.n.b.a.g.c.e().a("response.body().close()");
    }

    public final Socket e() {
        if (!f15177b && !Thread.holdsLock(this.f15180d)) {
            throw new AssertionError();
        }
        int size = this.f15178a.f15142e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f15178a.f15142e.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f15178a;
        eVar.f15142e.remove(i);
        this.f15178a = null;
        if (eVar.f15142e.isEmpty()) {
            eVar.f15143f = System.nanoTime();
            if (this.f15180d.b(eVar)) {
                return eVar.b();
            }
        }
        return null;
    }

    public final void f() {
        synchronized (this.f15180d) {
            try {
                if (this.f15191p) {
                    throw new IllegalStateException();
                }
                this.f15186k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        return this.f15185j.c() && this.f15185j.d();
    }

    public final boolean h() {
        boolean z8;
        synchronized (this.f15180d) {
            z8 = this.f15186k != null;
        }
        return z8;
    }

    public final void i() {
        c cVar;
        e a9;
        synchronized (this.f15180d) {
            try {
                this.f15189n = true;
                cVar = this.f15186k;
                d dVar = this.f15185j;
                a9 = (dVar == null || dVar.a() == null) ? this.f15178a : this.f15185j.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.f15114e.e();
        } else if (a9 != null) {
            a9.f();
        }
    }

    public final boolean j() {
        boolean z8;
        synchronized (this.f15180d) {
            z8 = this.f15189n;
        }
        return z8;
    }

    private IOException b(IOException iOException) {
        if (this.f15190o || !this.f15183g.d()) {
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
            if (com.anythink.core.common.n.b.a.c.a(adVar2.a(), adVar.a()) && this.f15185j.d()) {
                return;
            }
            if (this.f15186k != null) {
                throw new IllegalStateException();
            }
            if (this.f15185j != null) {
                a((IOException) null, true);
                this.f15185j = null;
            }
        }
        this.i = adVar;
        f fVar = this.f15180d;
        v a9 = adVar.a();
        if (a9.c()) {
            sSLSocketFactory = this.f15179c.h();
            hostnameVerifier = this.f15179c.i();
            gVar = this.f15179c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        this.f15185j = new d(this, fVar, new C0545a(a9.f(), a9.g(), this.f15179c.f(), this.f15179c.g(), sSLSocketFactory, hostnameVerifier, gVar, this.f15179c.l(), this.f15179c.c(), this.f15179c.q(), this.f15179c.r(), this.f15179c.d()), this.f15181e, this.f15182f);
    }

    private C0545a a(v vVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        com.anythink.core.common.n.b.g gVar;
        if (vVar.c()) {
            sSLSocketFactory = this.f15179c.h();
            hostnameVerifier = this.f15179c.i();
            gVar = this.f15179c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C0545a(vVar.f(), vVar.g(), this.f15179c.f(), this.f15179c.g(), sSLSocketFactory, hostnameVerifier, gVar, this.f15179c.l(), this.f15179c.c(), this.f15179c.q(), this.f15179c.r(), this.f15179c.d());
    }

    public final c a(w.a aVar, boolean z8) {
        synchronized (this.f15180d) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!this.f15191p) {
                    if (this.f15186k == null) {
                        c cVar = new c(this, this.f15181e, this.f15182f, this.f15185j, this.f15185j.a(this.f15179c, aVar, z8));
                        synchronized (this.f15180d) {
                            this.f15186k = cVar;
                            this.f15187l = false;
                            this.f15188m = false;
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
        if (!f15177b && !Thread.holdsLock(this.f15180d)) {
            throw new AssertionError();
        }
        if (this.f15178a == null) {
            this.f15178a = eVar;
            eVar.f15142e.add(new a(this, this.f15184h));
            return;
        }
        throw new IllegalStateException();
    }

    public final IOException a(c cVar, boolean z8, boolean z9, IOException iOException) {
        boolean z10;
        synchronized (this.f15180d) {
            try {
                c cVar2 = this.f15186k;
                if (cVar != cVar2) {
                    return iOException;
                }
                boolean z11 = true;
                if (z8) {
                    z10 = !this.f15187l;
                    this.f15187l = true;
                } else {
                    z10 = false;
                }
                if (z9) {
                    if (!this.f15188m) {
                        z10 = true;
                    }
                    this.f15188m = true;
                }
                if (this.f15187l && this.f15188m && z10) {
                    cVar2.a().f15141d++;
                    this.f15186k = null;
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
        synchronized (this.f15180d) {
            this.f15191p = true;
        }
        return a(iOException, false);
    }

    private IOException a(IOException iOException, boolean z8) {
        Socket e6;
        boolean z9;
        synchronized (this.f15180d) {
            if (z8) {
                try {
                    if (this.f15186k != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e6 = (this.f15178a != null && this.f15186k == null && (z8 || this.f15191p)) ? e() : null;
            z9 = this.f15191p && this.f15186k == null;
        }
        com.anythink.core.common.n.b.a.c.a(e6);
        if (!z9 || this.f15190o || !this.f15183g.d()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
