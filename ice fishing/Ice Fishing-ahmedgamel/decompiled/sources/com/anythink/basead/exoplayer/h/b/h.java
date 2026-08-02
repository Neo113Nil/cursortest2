package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f8360k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8361l;

    /* renamed from: m, reason: collision with root package name */
    private final d f8362m;

    /* renamed from: n, reason: collision with root package name */
    private volatile int f8363n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f8364o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f8365p;

    private h(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9, long j10, long j11, int i4, long j12, d dVar) {
        super(hVar, kVar, mVar, i, obj, j6, j9, j10, j11);
        this.f8360k = i4;
        this.f8361l = j12;
        this.f8362m = dVar;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
        this.f8364o = true;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        k a9 = this.f8312b.a(this.f8363n);
        try {
            com.anythink.basead.exoplayer.j.h hVar = this.i;
            com.anythink.basead.exoplayer.e.b bVar = new com.anythink.basead.exoplayer.e.b(hVar, a9.f8925e, hVar.a(a9));
            if (this.f8363n == 0) {
                b c9 = c();
                c9.a(this.f8361l);
                d dVar = this.f8362m;
                long j6 = this.f8306a;
                dVar.a(c9, j6 == com.anythink.basead.exoplayer.b.f7168b ? 0L : j6 - this.f8361l);
            }
            try {
                com.anythink.basead.exoplayer.e.e eVar = this.f8362m.f8319a;
                int i = 0;
                while (i == 0 && !this.f8364o) {
                    i = eVar.a(bVar, (com.anythink.basead.exoplayer.e.j) null);
                }
                com.anythink.basead.exoplayer.k.a.b(i != 1);
                this.f8363n = (int) (bVar.c() - this.f8312b.f8925e);
                af.a(this.i);
                this.f8365p = true;
            } catch (Throwable th) {
                this.f8363n = (int) (bVar.c() - this.f8312b.f8925e);
                throw th;
            }
        } catch (Throwable th2) {
            af.a(this.i);
            throw th2;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.b.c
    public final long d() {
        return this.f8363n;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final long e() {
        return this.f8366j + this.f8360k;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final boolean f() {
        return this.f8365p;
    }
}
