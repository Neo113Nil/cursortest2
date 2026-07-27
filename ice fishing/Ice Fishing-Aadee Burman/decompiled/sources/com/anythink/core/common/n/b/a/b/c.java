package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.a.k.a;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.c.n;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.w;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final j f14952a;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.core.common.n.b.e f14953b;

    /* renamed from: c, reason: collision with root package name */
    final r f14954c;

    /* renamed from: d, reason: collision with root package name */
    final d f14955d;

    /* renamed from: e, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.c.c f14956e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14957f;

    public final class b extends com.anythink.core.common.n.c.i {

        /* renamed from: b, reason: collision with root package name */
        private final long f14964b;

        /* renamed from: c, reason: collision with root package name */
        private long f14965c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f14966d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14967e;

        public b(w wVar, long j6) {
            super(wVar);
            this.f14964b = j6;
            if (j6 == 0) {
                a(null);
            }
        }

        private IOException a(IOException iOException) {
            if (this.f14966d) {
                return iOException;
            }
            this.f14966d = true;
            return c.this.a(true, false, iOException);
        }

        @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f14967e) {
                throw new IllegalStateException("closed");
            }
            try {
                long a_ = b().a_(cVar, j6);
                if (a_ == -1) {
                    a(null);
                    return -1L;
                }
                long j9 = this.f14965c + a_;
                long j10 = this.f14964b;
                if (j10 != -1 && j9 > j10) {
                    throw new ProtocolException("expected " + this.f14964b + " bytes but received " + j9);
                }
                this.f14965c = j9;
                if (j9 == j10) {
                    a(null);
                }
                return a_;
            } catch (IOException e9) {
                throw a(e9);
            }
        }

        @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14967e) {
                return;
            }
            this.f14967e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e9) {
                throw a(e9);
            }
        }
    }

    public c(j jVar, com.anythink.core.common.n.b.e eVar, r rVar, d dVar, com.anythink.core.common.n.b.a.c.c cVar) {
        this.f14952a = jVar;
        this.f14953b = eVar;
        this.f14954c = rVar;
        this.f14955d = dVar;
        this.f14956e = cVar;
    }

    private static void k() {
    }

    private static void l() {
    }

    private void m() {
        this.f14952a.c();
    }

    private void n() {
        this.f14956e.e();
    }

    public final e a() {
        return this.f14956e.a();
    }

    public final boolean b() {
        return this.f14957f;
    }

    public final void c() {
        try {
            this.f14956e.b();
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final void d() {
        try {
            this.f14956e.c();
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final u e() {
        return this.f14956e.d();
    }

    public final a.e f() {
        this.f14952a.c();
        return this.f14956e.a().a(this);
    }

    public final void g() {
        a(true, true, null);
    }

    public final void h() {
        this.f14956e.a().e();
    }

    public final void i() {
        this.f14956e.e();
        this.f14952a.a(this, true, true, null);
    }

    public final void j() {
        this.f14952a.a(this, true, false, null);
    }

    public final void a(ad adVar) {
        try {
            this.f14956e.a(adVar);
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final v b(ad adVar) {
        this.f14957f = false;
        long b9 = adVar.d().b();
        return new a(this.f14956e.a(adVar, b9), b9);
    }

    public final af.a a(boolean z3) {
        try {
            af.a a9 = this.f14956e.a(z3);
            if (a9 == null) {
                return a9;
            }
            com.anythink.core.common.n.b.a.a.f14869a.a(a9, this);
            return a9;
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final class a extends com.anythink.core.common.n.c.h {

        /* renamed from: b, reason: collision with root package name */
        private boolean f14959b;

        /* renamed from: c, reason: collision with root package name */
        private long f14960c;

        /* renamed from: d, reason: collision with root package name */
        private long f14961d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14962e;

        public a(v vVar, long j6) {
            super(vVar);
            this.f14960c = j6;
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f14962e) {
                throw new IllegalStateException("closed");
            }
            long j9 = this.f14960c;
            if (j9 == -1 || this.f14961d + j6 <= j9) {
                try {
                    super.a(cVar, j6);
                    this.f14961d += j6;
                    return;
                } catch (IOException e9) {
                    throw a(e9);
                }
            }
            throw new ProtocolException("expected " + this.f14960c + " bytes but received " + (this.f14961d + j6));
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f14962e) {
                return;
            }
            this.f14962e = true;
            long j6 = this.f14960c;
            if (j6 != -1 && this.f14961d != j6) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e9) {
                throw a(e9);
            }
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e9) {
                throw a(e9);
            }
        }

        private IOException a(IOException iOException) {
            if (this.f14959b) {
                return iOException;
            }
            this.f14959b = true;
            return c.this.a(false, true, iOException);
        }
    }

    public final ag a(af afVar) {
        try {
            String a9 = afVar.a("Content-Type");
            long a10 = this.f14956e.a(afVar);
            return new com.anythink.core.common.n.b.a.c.h(a9, a10, n.a(new b(this.f14956e.b(afVar), a10)));
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    private void a(IOException iOException) {
        this.f14955d.b();
        this.f14956e.a().a(iOException);
    }

    public final IOException a(boolean z3, boolean z6, IOException iOException) {
        if (iOException != null) {
            a(iOException);
        }
        return this.f14952a.a(this, z6, z3, iOException);
    }
}
