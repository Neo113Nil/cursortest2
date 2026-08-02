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
    final j f15739a;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.core.common.n.b.e f15740b;

    /* renamed from: c, reason: collision with root package name */
    final r f15741c;

    /* renamed from: d, reason: collision with root package name */
    final d f15742d;

    /* renamed from: e, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.c.c f15743e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15744f;

    public final class b extends com.anythink.core.common.n.c.i {

        /* renamed from: b, reason: collision with root package name */
        private final long f15751b;

        /* renamed from: c, reason: collision with root package name */
        private long f15752c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15753d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15754e;

        public b(w wVar, long j6) {
            super(wVar);
            this.f15751b = j6;
            if (j6 == 0) {
                a(null);
            }
        }

        private IOException a(IOException iOException) {
            if (this.f15753d) {
                return iOException;
            }
            this.f15753d = true;
            return c.this.a(true, false, iOException);
        }

        @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f15754e) {
                throw new IllegalStateException("closed");
            }
            try {
                long a_ = b().a_(cVar, j6);
                if (a_ == -1) {
                    a(null);
                    return -1L;
                }
                long j9 = this.f15752c + a_;
                long j10 = this.f15751b;
                if (j10 != -1 && j9 > j10) {
                    throw new ProtocolException("expected " + this.f15751b + " bytes but received " + j9);
                }
                this.f15752c = j9;
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
            if (this.f15754e) {
                return;
            }
            this.f15754e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e9) {
                throw a(e9);
            }
        }
    }

    public c(j jVar, com.anythink.core.common.n.b.e eVar, r rVar, d dVar, com.anythink.core.common.n.b.a.c.c cVar) {
        this.f15739a = jVar;
        this.f15740b = eVar;
        this.f15741c = rVar;
        this.f15742d = dVar;
        this.f15743e = cVar;
    }

    private static void k() {
    }

    private static void l() {
    }

    private void m() {
        this.f15739a.c();
    }

    private void n() {
        this.f15743e.e();
    }

    public final e a() {
        return this.f15743e.a();
    }

    public final boolean b() {
        return this.f15744f;
    }

    public final void c() {
        try {
            this.f15743e.b();
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final void d() {
        try {
            this.f15743e.c();
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final u e() {
        return this.f15743e.d();
    }

    public final a.e f() {
        this.f15739a.c();
        return this.f15743e.a().a(this);
    }

    public final void g() {
        a(true, true, null);
    }

    public final void h() {
        this.f15743e.a().e();
    }

    public final void i() {
        this.f15743e.e();
        this.f15739a.a(this, true, true, null);
    }

    public final void j() {
        this.f15739a.a(this, true, false, null);
    }

    public final void a(ad adVar) {
        try {
            this.f15743e.a(adVar);
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final v b(ad adVar) {
        this.f15744f = false;
        long b9 = adVar.d().b();
        return new a(this.f15743e.a(adVar, b9), b9);
    }

    public final af.a a(boolean z6) {
        try {
            af.a a9 = this.f15743e.a(z6);
            if (a9 == null) {
                return a9;
            }
            com.anythink.core.common.n.b.a.a.f15656a.a(a9, this);
            return a9;
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    public final class a extends com.anythink.core.common.n.c.h {

        /* renamed from: b, reason: collision with root package name */
        private boolean f15746b;

        /* renamed from: c, reason: collision with root package name */
        private long f15747c;

        /* renamed from: d, reason: collision with root package name */
        private long f15748d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15749e;

        public a(v vVar, long j6) {
            super(vVar);
            this.f15747c = j6;
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f15749e) {
                throw new IllegalStateException("closed");
            }
            long j9 = this.f15747c;
            if (j9 == -1 || this.f15748d + j6 <= j9) {
                try {
                    super.a(cVar, j6);
                    this.f15748d += j6;
                    return;
                } catch (IOException e9) {
                    throw a(e9);
                }
            }
            throw new ProtocolException("expected " + this.f15747c + " bytes but received " + (this.f15748d + j6));
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15749e) {
                return;
            }
            this.f15749e = true;
            long j6 = this.f15747c;
            if (j6 != -1 && this.f15748d != j6) {
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
            if (this.f15746b) {
                return iOException;
            }
            this.f15746b = true;
            return c.this.a(false, true, iOException);
        }
    }

    public final ag a(af afVar) {
        try {
            String a9 = afVar.a("Content-Type");
            long a10 = this.f15743e.a(afVar);
            return new com.anythink.core.common.n.b.a.c.h(a9, a10, n.a(new b(this.f15743e.b(afVar), a10)));
        } catch (IOException e9) {
            a(e9);
            throw e9;
        }
    }

    private void a(IOException iOException) {
        this.f15742d.b();
        this.f15743e.a().a(iOException);
    }

    public final IOException a(boolean z6, boolean z9, IOException iOException) {
        if (iOException != null) {
            a(iOException);
        }
        return this.f15739a.a(this, z9, z6, iOException);
    }
}
