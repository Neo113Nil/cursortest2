package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f8367k;

    /* renamed from: l, reason: collision with root package name */
    private final m f8368l;

    /* renamed from: m, reason: collision with root package name */
    private volatile int f8369m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f8370n;

    private j(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9, long j10, int i4, m mVar2) {
        super(hVar, kVar, mVar, i, obj, j6, j9, com.anythink.basead.exoplayer.b.f7168b, j10);
        this.f8367k = i4;
        this.f8368l = mVar2;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        try {
            long a9 = this.i.a(this.f8312b.a(this.f8369m));
            if (a9 != -1) {
                a9 += this.f8369m;
            }
            com.anythink.basead.exoplayer.e.b bVar = new com.anythink.basead.exoplayer.e.b(this.i, this.f8369m, a9);
            b c9 = c();
            c9.a(0L);
            com.anythink.basead.exoplayer.e.m a10 = c9.a(this.f8367k);
            a10.a(this.f8368l);
            for (int i = 0; i != -1; i = a10.a(bVar, Integer.MAX_VALUE, true)) {
                this.f8369m += i;
            }
            a10.a(this.f8317g, 1, this.f8369m, 0, null);
            af.a(this.i);
            this.f8370n = true;
        } catch (Throwable th) {
            af.a(this.i);
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.b.c
    public final long d() {
        return this.f8369m;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final boolean f() {
        return this.f8370n;
    }
}
