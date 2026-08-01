package com.anythink.basead.exoplayer.h.a;

import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.p;

/* loaded from: classes.dex */
final class d extends p {

    /* renamed from: c, reason: collision with root package name */
    private final a f7457c;

    public d(ae aeVar, a aVar) {
        super(aeVar);
        com.anythink.basead.exoplayer.k.a.b(aeVar.c() == 1);
        com.anythink.basead.exoplayer.k.a.b(aeVar.b() == 1);
        this.f7457c = aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z3) {
        this.f7759b.a(i, aVar, z3);
        aVar.a(aVar.f6342a, aVar.f6343b, aVar.f6344c, aVar.f6345d, aVar.b(), this.f7457c);
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
    public final ae.b a(int i, ae.b bVar, boolean z3, long j6) {
        ae.b a9 = super.a(i, bVar, z3, j6);
        if (a9.i == com.anythink.basead.exoplayer.b.f6382b) {
            a9.i = this.f7457c.f7413k;
        }
        return a9;
    }
}
