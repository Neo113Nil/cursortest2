package com.anythink.core.common.n.b.a.k;

import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.f;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.x;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    final boolean f16235a;

    /* renamed from: b, reason: collision with root package name */
    final Random f16236b;

    /* renamed from: c, reason: collision with root package name */
    final com.anythink.core.common.n.c.d f16237c;

    /* renamed from: d, reason: collision with root package name */
    final com.anythink.core.common.n.c.c f16238d;

    /* renamed from: e, reason: collision with root package name */
    boolean f16239e;

    /* renamed from: f, reason: collision with root package name */
    final com.anythink.core.common.n.c.c f16240f = new com.anythink.core.common.n.c.c();

    /* renamed from: g, reason: collision with root package name */
    final a f16241g = new a();

    /* renamed from: h, reason: collision with root package name */
    boolean f16242h;
    private final byte[] i;

    /* renamed from: j, reason: collision with root package name */
    private final c.a f16243j;

    public d(boolean z6, com.anythink.core.common.n.c.d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f16235a = z6;
        this.f16237c = dVar;
        this.f16238d = dVar.c();
        this.f16236b = random;
        this.i = z6 ? new byte[4] : null;
        this.f16243j = z6 ? new c.a() : null;
    }

    public final void a(f fVar) {
        b(9, fVar);
    }

    public final void b(f fVar) {
        b(10, fVar);
    }

    private void b(int i, f fVar) {
        if (this.f16239e) {
            throw new IOException("closed");
        }
        int j6 = fVar.j();
        if (j6 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f16238d.l(i | 128);
        if (this.f16235a) {
            this.f16238d.l(j6 | 128);
            this.f16236b.nextBytes(this.i);
            this.f16238d.d(this.i);
            if (j6 > 0) {
                long b9 = this.f16238d.b();
                this.f16238d.d(fVar);
                this.f16238d.a(this.f16243j);
                this.f16243j.a(b9);
                b.a(this.f16243j, this.i);
                this.f16243j.close();
            }
        } else {
            this.f16238d.l(j6);
            this.f16238d.d(fVar);
        }
        this.f16237c.flush();
    }

    public final void a(int i, f fVar) {
        f fVar2 = f.f16645b;
        if (i != 0 || fVar != null) {
            if (i != 0) {
                b.b(i);
            }
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            cVar.k(i);
            if (fVar != null) {
                cVar.d(fVar);
            }
            fVar2 = cVar.t();
        }
        try {
            b(8, fVar2);
        } finally {
            this.f16239e = true;
        }
    }

    public final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        int f16244a;

        /* renamed from: b, reason: collision with root package name */
        long f16245b;

        /* renamed from: c, reason: collision with root package name */
        boolean f16246c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16247d;

        public a() {
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f16247d) {
                throw new IOException("closed");
            }
            d.this.f16240f.a(cVar, j6);
            boolean z6 = this.f16246c && this.f16245b != -1 && d.this.f16240f.b() > this.f16245b - 8192;
            long j9 = d.this.f16240f.j();
            if (j9 <= 0 || z6) {
                return;
            }
            d.this.a(this.f16244a, j9, this.f16246c, false);
            this.f16246c = false;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f16247d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f16244a, dVar.f16240f.b(), this.f16246c, true);
            this.f16247d = true;
            d.this.f16242h = false;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (this.f16247d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f16244a, dVar.f16240f.b(), this.f16246c, false);
            this.f16246c = false;
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return d.this.f16237c.a();
        }
    }

    private v a(int i, long j6) {
        if (!this.f16242h) {
            this.f16242h = true;
            a aVar = this.f16241g;
            aVar.f16244a = i;
            aVar.f16245b = j6;
            aVar.f16246c = true;
            aVar.f16247d = false;
            return aVar;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public final void a(int i, long j6, boolean z6, boolean z9) {
        if (!this.f16239e) {
            if (!z6) {
                i = 0;
            }
            if (z9) {
                i |= 128;
            }
            this.f16238d.l(i);
            int i4 = this.f16235a ? 128 : 0;
            if (j6 <= 125) {
                this.f16238d.l(((int) j6) | i4);
            } else if (j6 <= 65535) {
                this.f16238d.l(i4 | com.anythink.expressad.video.module.a.a.f22514Q);
                this.f16238d.k((int) j6);
            } else {
                this.f16238d.l(i4 | com.anythink.expressad.video.module.a.a.f22515R);
                this.f16238d.q(j6);
            }
            if (this.f16235a) {
                this.f16236b.nextBytes(this.i);
                this.f16238d.d(this.i);
                if (j6 > 0) {
                    long b9 = this.f16238d.b();
                    this.f16238d.a(this.f16240f, j6);
                    this.f16238d.a(this.f16243j);
                    this.f16243j.a(b9);
                    b.a(this.f16243j, this.i);
                    this.f16243j.close();
                }
            } else {
                this.f16238d.a(this.f16240f, j6);
            }
            this.f16237c.f();
            return;
        }
        throw new IOException("closed");
    }
}
