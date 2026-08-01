package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f7581k;

    /* renamed from: l, reason: collision with root package name */
    private final m f7582l;

    /* renamed from: m, reason: collision with root package name */
    private volatile int f7583m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f7584n;

    private j(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9, long j10, int i6, m mVar2) {
        super(hVar, kVar, mVar, i, obj, j6, j9, com.anythink.basead.exoplayer.b.f6382b, j10);
        this.f7581k = i6;
        this.f7582l = mVar2;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        try {
            long a9 = this.i.a(this.f7526b.a(this.f7583m));
            if (a9 != -1) {
                a9 += this.f7583m;
            }
            com.anythink.basead.exoplayer.e.b bVar = new com.anythink.basead.exoplayer.e.b(this.i, this.f7583m, a9);
            b c9 = c();
            c9.a(0L);
            com.anythink.basead.exoplayer.e.m a10 = c9.a(this.f7581k);
            a10.a(this.f7582l);
            for (int i = 0; i != -1; i = a10.a(bVar, Integer.MAX_VALUE, true)) {
                this.f7583m += i;
            }
            a10.a(this.f7531g, 1, this.f7583m, 0, null);
            af.a(this.i);
            this.f7584n = true;
        } catch (Throwable th) {
            af.a(this.i);
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.b.c
    public final long d() {
        return this.f7583m;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final boolean f() {
        return this.f7584n;
    }
}
