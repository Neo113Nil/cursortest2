package com.yandex.passport.internal.di.module;

import com.yandex.passport.internal.analytics.z;
import defpackage.rzm;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class m implements rzm {
    public final /* synthetic */ int a;
    public final h b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;
    public final rzm h;
    public final rzm i;
    public final rzm j;

    public /* synthetic */ m(h hVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, int i) {
        this.a = i;
        this.b = hVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
        this.h = rzmVar6;
        this.i = rzmVar7;
        this.j = rzmVar8;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                OkHttpClient okHttpClient = (OkHttpClient) this.c.get();
                com.yandex.passport.internal.network.d dVar = (com.yandex.passport.internal.network.d) this.d.get();
                com.yandex.passport.internal.network.a aVar = (com.yandex.passport.internal.network.a) this.e.get();
                z zVar = (z) this.f.get();
                com.yandex.passport.common.analytics.k kVar = (com.yandex.passport.common.analytics.k) this.g.get();
                com.yandex.passport.internal.f fVar = (com.yandex.passport.internal.f) this.h.get();
                com.yandex.passport.common.common.a aVar2 = (com.yandex.passport.common.common.a) this.i.get();
                com.yandex.passport.internal.credentials.g gVar = (com.yandex.passport.internal.credentials.g) this.j.get();
                this.b.getClass();
                okHttpClient.getClass();
                dVar.getClass();
                aVar.getClass();
                zVar.getClass();
                kVar.getClass();
                fVar.getClass();
                aVar2.getClass();
                gVar.getClass();
                com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
                return new com.yandex.passport.internal.network.client.g(okHttpClient, new com.yandex.passport.common.network.n(11, bVar, dVar), gVar.b(bVar), aVar, zVar, kVar, fVar, aVar2);
            case 1:
                OkHttpClient okHttpClient2 = (OkHttpClient) this.c.get();
                com.yandex.passport.internal.network.d dVar2 = (com.yandex.passport.internal.network.d) this.d.get();
                com.yandex.passport.internal.network.a aVar3 = (com.yandex.passport.internal.network.a) this.e.get();
                z zVar2 = (z) this.f.get();
                com.yandex.passport.common.analytics.k kVar2 = (com.yandex.passport.common.analytics.k) this.g.get();
                com.yandex.passport.internal.f fVar2 = (com.yandex.passport.internal.f) this.h.get();
                com.yandex.passport.common.common.a aVar4 = (com.yandex.passport.common.common.a) this.i.get();
                com.yandex.passport.internal.credentials.g gVar2 = (com.yandex.passport.internal.credentials.g) this.j.get();
                this.b.getClass();
                okHttpClient2.getClass();
                dVar2.getClass();
                aVar3.getClass();
                zVar2.getClass();
                kVar2.getClass();
                fVar2.getClass();
                aVar4.getClass();
                gVar2.getClass();
                com.yandex.passport.common.core.b bVar2 = com.yandex.passport.common.core.b.g;
                return new com.yandex.passport.internal.network.client.g(okHttpClient2, new com.yandex.passport.common.network.n(11, bVar2, dVar2), gVar2.b(bVar2), aVar3, zVar2, kVar2, fVar2, aVar4);
            case 2:
                OkHttpClient okHttpClient3 = (OkHttpClient) this.c.get();
                com.yandex.passport.internal.network.d dVar3 = (com.yandex.passport.internal.network.d) this.d.get();
                com.yandex.passport.internal.network.a aVar5 = (com.yandex.passport.internal.network.a) this.e.get();
                z zVar3 = (z) this.f.get();
                com.yandex.passport.common.analytics.k kVar3 = (com.yandex.passport.common.analytics.k) this.g.get();
                com.yandex.passport.internal.f fVar3 = (com.yandex.passport.internal.f) this.h.get();
                com.yandex.passport.common.common.a aVar6 = (com.yandex.passport.common.common.a) this.i.get();
                com.yandex.passport.internal.credentials.g gVar3 = (com.yandex.passport.internal.credentials.g) this.j.get();
                this.b.getClass();
                okHttpClient3.getClass();
                dVar3.getClass();
                aVar5.getClass();
                zVar3.getClass();
                kVar3.getClass();
                fVar3.getClass();
                aVar6.getClass();
                gVar3.getClass();
                com.yandex.passport.common.core.b bVar3 = com.yandex.passport.common.core.b.d;
                return new com.yandex.passport.internal.network.client.g(okHttpClient3, new com.yandex.passport.common.network.n(11, bVar3, dVar3), gVar3.b(bVar3), aVar5, zVar3, kVar3, fVar3, aVar6);
            case 3:
                OkHttpClient okHttpClient4 = (OkHttpClient) this.c.get();
                com.yandex.passport.internal.network.d dVar4 = (com.yandex.passport.internal.network.d) this.d.get();
                com.yandex.passport.internal.network.a aVar7 = (com.yandex.passport.internal.network.a) this.e.get();
                z zVar4 = (z) this.f.get();
                com.yandex.passport.common.analytics.k kVar4 = (com.yandex.passport.common.analytics.k) this.g.get();
                com.yandex.passport.internal.f fVar4 = (com.yandex.passport.internal.f) this.h.get();
                com.yandex.passport.common.common.a aVar8 = (com.yandex.passport.common.common.a) this.i.get();
                com.yandex.passport.internal.credentials.g gVar4 = (com.yandex.passport.internal.credentials.g) this.j.get();
                this.b.getClass();
                okHttpClient4.getClass();
                dVar4.getClass();
                aVar7.getClass();
                zVar4.getClass();
                kVar4.getClass();
                fVar4.getClass();
                aVar8.getClass();
                gVar4.getClass();
                com.yandex.passport.common.core.b bVar4 = com.yandex.passport.common.core.b.f;
                return new com.yandex.passport.internal.network.client.g(okHttpClient4, new com.yandex.passport.common.network.n(11, bVar4, dVar4), gVar4.b(bVar4), aVar7, zVar4, kVar4, fVar4, aVar8);
            default:
                OkHttpClient okHttpClient5 = (OkHttpClient) this.c.get();
                com.yandex.passport.internal.network.d dVar5 = (com.yandex.passport.internal.network.d) this.d.get();
                com.yandex.passport.internal.network.a aVar9 = (com.yandex.passport.internal.network.a) this.e.get();
                z zVar5 = (z) this.f.get();
                com.yandex.passport.common.analytics.k kVar5 = (com.yandex.passport.common.analytics.k) this.g.get();
                com.yandex.passport.internal.f fVar5 = (com.yandex.passport.internal.f) this.h.get();
                com.yandex.passport.common.common.a aVar10 = (com.yandex.passport.common.common.a) this.i.get();
                com.yandex.passport.internal.credentials.g gVar5 = (com.yandex.passport.internal.credentials.g) this.j.get();
                this.b.getClass();
                okHttpClient5.getClass();
                dVar5.getClass();
                aVar9.getClass();
                zVar5.getClass();
                kVar5.getClass();
                fVar5.getClass();
                aVar10.getClass();
                gVar5.getClass();
                com.yandex.passport.common.core.b bVar5 = com.yandex.passport.common.core.b.e;
                return new com.yandex.passport.internal.network.client.g(okHttpClient5, new com.yandex.passport.common.network.n(11, bVar5, dVar5), gVar5.b(bVar5), aVar9, zVar5, kVar5, fVar5, aVar10);
        }
    }
}
