package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f7731k;

    /* renamed from: l, reason: collision with root package name */
    private final long f7732l;

    /* renamed from: m, reason: collision with root package name */
    private final d f7733m;

    /* renamed from: n, reason: collision with root package name */
    private volatile int f7734n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f7735o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f7736p;

    private h(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j9, long j10, long j11, long j12, int i4, long j13, d dVar) {
        super(hVar, kVar, mVar, i, obj, j9, j10, j11, j12);
        this.f7731k = i4;
        this.f7732l = j13;
        this.f7733m = dVar;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
        this.f7735o = true;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        k a9 = this.f7683b.a(this.f7734n);
        try {
            com.anythink.basead.exoplayer.j.h hVar = this.i;
            com.anythink.basead.exoplayer.e.b bVar = new com.anythink.basead.exoplayer.e.b(hVar, a9.f8296e, hVar.a(a9));
            if (this.f7734n == 0) {
                b c4 = c();
                c4.a(this.f7732l);
                d dVar = this.f7733m;
                long j9 = this.f7677a;
                dVar.a(c4, j9 == com.anythink.basead.exoplayer.b.f6539b ? 0L : j9 - this.f7732l);
            }
            try {
                com.anythink.basead.exoplayer.e.e eVar = this.f7733m.f7690a;
                int i = 0;
                while (i == 0 && !this.f7735o) {
                    i = eVar.a(bVar, (com.anythink.basead.exoplayer.e.j) null);
                }
                C0544a.b(i != 1);
                this.f7734n = (int) (bVar.c() - this.f7683b.f8296e);
                af.a(this.i);
                this.f7736p = true;
            } catch (Throwable th) {
                this.f7734n = (int) (bVar.c() - this.f7683b.f8296e);
                throw th;
            }
        } catch (Throwable th2) {
            af.a(this.i);
            throw th2;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.b.c
    public final long d() {
        return this.f7734n;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final long e() {
        return this.f7737j + this.f7731k;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final boolean f() {
        return this.f7736p;
    }
}
