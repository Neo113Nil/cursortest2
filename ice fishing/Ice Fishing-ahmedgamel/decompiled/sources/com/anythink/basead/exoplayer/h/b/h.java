package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f7574k;

    /* renamed from: l, reason: collision with root package name */
    private final long f7575l;

    /* renamed from: m, reason: collision with root package name */
    private final d f7576m;

    /* renamed from: n, reason: collision with root package name */
    private volatile int f7577n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f7578o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f7579p;

    private h(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9, long j10, long j11, int i6, long j12, d dVar) {
        super(hVar, kVar, mVar, i, obj, j6, j9, j10, j11);
        this.f7574k = i6;
        this.f7575l = j12;
        this.f7576m = dVar;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
        this.f7578o = true;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        k a9 = this.f7526b.a(this.f7577n);
        try {
            com.anythink.basead.exoplayer.j.h hVar = this.i;
            com.anythink.basead.exoplayer.e.b bVar = new com.anythink.basead.exoplayer.e.b(hVar, a9.f8139e, hVar.a(a9));
            if (this.f7577n == 0) {
                b c9 = c();
                c9.a(this.f7575l);
                d dVar = this.f7576m;
                long j6 = this.f7520a;
                dVar.a(c9, j6 == com.anythink.basead.exoplayer.b.f6382b ? 0L : j6 - this.f7575l);
            }
            try {
                com.anythink.basead.exoplayer.e.e eVar = this.f7576m.f7533a;
                int i = 0;
                while (i == 0 && !this.f7578o) {
                    i = eVar.a(bVar, (com.anythink.basead.exoplayer.e.j) null);
                }
                com.anythink.basead.exoplayer.k.a.b(i != 1);
                this.f7577n = (int) (bVar.c() - this.f7526b.f8139e);
                af.a(this.i);
                this.f7579p = true;
            } catch (Throwable th) {
                this.f7577n = (int) (bVar.c() - this.f7526b.f8139e);
                throw th;
            }
        } catch (Throwable th2) {
            af.a(this.i);
            throw th2;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.b.c
    public final long d() {
        return this.f7577n;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final long e() {
        return this.f7580j + this.f7574k;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final boolean f() {
        return this.f7579p;
    }
}
