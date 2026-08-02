package com.anythink.basead.exoplayer.h.a;

import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.p;

/* loaded from: classes.dex */
final class d extends p {

    /* renamed from: c, reason: collision with root package name */
    private final a f8243c;

    public d(ae aeVar, a aVar) {
        super(aeVar);
        com.anythink.basead.exoplayer.k.a.b(aeVar.c() == 1);
        com.anythink.basead.exoplayer.k.a.b(aeVar.b() == 1);
        this.f8243c = aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z6) {
        this.f8545b.a(i, aVar, z6);
        aVar.a(aVar.f7128a, aVar.f7129b, aVar.f7130c, aVar.f7131d, aVar.b(), this.f8243c);
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
    public final ae.b a(int i, ae.b bVar, boolean z6, long j6) {
        ae.b a9 = super.a(i, bVar, z6, j6);
        if (a9.i == com.anythink.basead.exoplayer.b.f7168b) {
            a9.i = this.f8243c.f8199k;
        }
        return a9;
    }
}
