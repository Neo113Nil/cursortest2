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
    final boolean f15448a;

    /* renamed from: b, reason: collision with root package name */
    final Random f15449b;

    /* renamed from: c, reason: collision with root package name */
    final com.anythink.core.common.n.c.d f15450c;

    /* renamed from: d, reason: collision with root package name */
    final com.anythink.core.common.n.c.c f15451d;

    /* renamed from: e, reason: collision with root package name */
    boolean f15452e;

    /* renamed from: f, reason: collision with root package name */
    final com.anythink.core.common.n.c.c f15453f = new com.anythink.core.common.n.c.c();

    /* renamed from: g, reason: collision with root package name */
    final a f15454g = new a();

    /* renamed from: h, reason: collision with root package name */
    boolean f15455h;
    private final byte[] i;

    /* renamed from: j, reason: collision with root package name */
    private final c.a f15456j;

    public d(boolean z3, com.anythink.core.common.n.c.d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f15448a = z3;
        this.f15450c = dVar;
        this.f15451d = dVar.c();
        this.f15449b = random;
        this.i = z3 ? new byte[4] : null;
        this.f15456j = z3 ? new c.a() : null;
    }

    public final void a(f fVar) {
        b(9, fVar);
    }

    public final void b(f fVar) {
        b(10, fVar);
    }

    private void b(int i, f fVar) {
        if (this.f15452e) {
            throw new IOException("closed");
        }
        int j6 = fVar.j();
        if (j6 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f15451d.l(i | 128);
        if (this.f15448a) {
            this.f15451d.l(j6 | 128);
            this.f15449b.nextBytes(this.i);
            this.f15451d.d(this.i);
            if (j6 > 0) {
                long b9 = this.f15451d.b();
                this.f15451d.d(fVar);
                this.f15451d.a(this.f15456j);
                this.f15456j.a(b9);
                b.a(this.f15456j, this.i);
                this.f15456j.close();
            }
        } else {
            this.f15451d.l(j6);
            this.f15451d.d(fVar);
        }
        this.f15450c.flush();
    }

    public final void a(int i, f fVar) {
        f fVar2 = f.f15858b;
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
            this.f15452e = true;
        }
    }

    public final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        int f15457a;

        /* renamed from: b, reason: collision with root package name */
        long f15458b;

        /* renamed from: c, reason: collision with root package name */
        boolean f15459c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15460d;

        public a() {
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f15460d) {
                throw new IOException("closed");
            }
            d.this.f15453f.a(cVar, j6);
            boolean z3 = this.f15459c && this.f15458b != -1 && d.this.f15453f.b() > this.f15458b - 8192;
            long j9 = d.this.f15453f.j();
            if (j9 <= 0 || z3) {
                return;
            }
            d.this.a(this.f15457a, j9, this.f15459c, false);
            this.f15459c = false;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15460d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f15457a, dVar.f15453f.b(), this.f15459c, true);
            this.f15460d = true;
            d.this.f15455h = false;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (this.f15460d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f15457a, dVar.f15453f.b(), this.f15459c, false);
            this.f15459c = false;
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return d.this.f15450c.a();
        }
    }

    private v a(int i, long j6) {
        if (!this.f15455h) {
            this.f15455h = true;
            a aVar = this.f15454g;
            aVar.f15457a = i;
            aVar.f15458b = j6;
            aVar.f15459c = true;
            aVar.f15460d = false;
            return aVar;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public final void a(int i, long j6, boolean z3, boolean z6) {
        if (!this.f15452e) {
            if (!z3) {
                i = 0;
            }
            if (z6) {
                i |= 128;
            }
            this.f15451d.l(i);
            int i6 = this.f15448a ? 128 : 0;
            if (j6 <= 125) {
                this.f15451d.l(((int) j6) | i6);
            } else if (j6 <= 65535) {
                this.f15451d.l(i6 | com.anythink.expressad.video.module.a.a.f21727Q);
                this.f15451d.k((int) j6);
            } else {
                this.f15451d.l(i6 | com.anythink.expressad.video.module.a.a.f21728R);
                this.f15451d.q(j6);
            }
            if (this.f15448a) {
                this.f15449b.nextBytes(this.i);
                this.f15451d.d(this.i);
                if (j6 > 0) {
                    long b9 = this.f15451d.b();
                    this.f15451d.a(this.f15453f, j6);
                    this.f15451d.a(this.f15456j);
                    this.f15456j.a(b9);
                    b.a(this.f15456j, this.i);
                    this.f15456j.close();
                }
            } else {
                this.f15451d.a(this.f15453f, j6);
            }
            this.f15450c.f();
            return;
        }
        throw new IOException("closed");
    }
}
