package com.yandex.plus.pay.internal.di;

import com.yandex.plus.pay.data.acquisition.PlusPayAcquisitionApi;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.btf;
import defpackage.dp0;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l {
    public final jyr F;
    public final jyr H;
    public final i a;
    public final e b;
    public final com.yandex.plus.metrica.utils.n c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;
    public final jyr v;
    public final jyr g = btf.b(new j(this, 13));
    public final jyr h = btf.b(new j(this, 14));
    public final jyr i = btf.b(new j(this, 15));
    public final jyr j = btf.b(new j(this, 16));
    public final jyr k = btf.b(new j(this, 17));
    public final jyr l = btf.b(new j(this, 19));
    public final jyr m = btf.b(new j(this, 20));
    public final jyr n = btf.b(new j(this, 10));
    public final jyr o = btf.b(new j(this, 18));
    public final jyr p = btf.b(new j(this, 28));
    public final jyr q = btf.b(new j(this, 29));
    public final jyr w = btf.b(new j(this, 0));
    public final jyr x = btf.b(new j(this, 2));
    public final jyr y = btf.b(new j(this, 3));
    public final jyr z = btf.b(new j(this, 4));
    public final jyr A = btf.b(new j(this, 5));
    public final jyr B = btf.b(new j(this, 6));
    public final jyr C = btf.b(new j(this, 7));
    public final jyr D = btf.b(new j(this, 8));
    public final jyr E = btf.b(new j(this, 9));
    public final jyr G = btf.b(new j(this, 11));

    public l(i iVar, e eVar, com.yandex.plus.pay.internal.network.d dVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.home.plaque.animator.internal.utils.a aVar2, com.yandex.plus.metrica.utils.n nVar) {
        this.a = iVar;
        this.b = eVar;
        this.c = nVar;
        int i = 1;
        this.d = btf.b(new com.yandex.plus.pay.internal.d(i, this, aVar));
        this.e = btf.b(new j(this, i));
        this.f = btf.b(new com.yandex.plus.pay.internal.d(3, this, dVar));
        final int i2 = 0;
        this.r = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.k
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        l lVar = this.b;
                        dp0 a = lVar.a();
                        i iVar2 = lVar.a;
                        return new com.yandex.plus.pay.graphql.offers.j(a, iVar2.b(), iVar2.w.h, lVar.b());
                    case 1:
                        l lVar2 = this.b;
                        PlusPayAcquisitionApi plusPayAcquisitionApi = (PlusPayAcquisitionApi) lVar2.m.getValue();
                        com.yandex.plus.pay.inapp.api.b bVar = (com.yandex.plus.pay.inapp.api.b) lVar2.F.getValue();
                        i iVar3 = lVar2.a;
                        com.yandex.plus.core.location.a aVar3 = iVar3.n;
                        j jVar = new j(lVar2, 21);
                        j jVar2 = new j(lVar2, 22);
                        ((com.yandex.plus.core.dispatcher.a) iVar3.q).getClass();
                        return new com.yandex.plus.pay.internal.feature.offers.smart.l(plusPayAcquisitionApi, bVar, aVar3, jVar, jVar2, com.yandex.plus.core.dispatcher.a.e, lVar2.b.e);
                    case 2:
                        l lVar3 = this.b;
                        return new com.yandex.plus.pay.graphql.avatar.b(lVar3.a(), (com.yandex.plus.core.network.urls.b) ((jyr) lVar3.a.D.b).getValue());
                    case 3:
                        l lVar4 = this.b;
                        dp0 a2 = lVar4.a();
                        i iVar4 = lVar4.a;
                        return new com.yandex.plus.pay.graphql.invoice.e(a2, iVar4.b(), lVar4.b(), iVar4.a());
                    default:
                        return new com.yandex.plus.pay.graphql.user.c(this.b.a());
                }
            }
        });
        final int i3 = 1;
        this.s = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.k
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        l lVar = this.b;
                        dp0 a = lVar.a();
                        i iVar2 = lVar.a;
                        return new com.yandex.plus.pay.graphql.offers.j(a, iVar2.b(), iVar2.w.h, lVar.b());
                    case 1:
                        l lVar2 = this.b;
                        PlusPayAcquisitionApi plusPayAcquisitionApi = (PlusPayAcquisitionApi) lVar2.m.getValue();
                        com.yandex.plus.pay.inapp.api.b bVar = (com.yandex.plus.pay.inapp.api.b) lVar2.F.getValue();
                        i iVar3 = lVar2.a;
                        com.yandex.plus.core.location.a aVar3 = iVar3.n;
                        j jVar = new j(lVar2, 21);
                        j jVar2 = new j(lVar2, 22);
                        ((com.yandex.plus.core.dispatcher.a) iVar3.q).getClass();
                        return new com.yandex.plus.pay.internal.feature.offers.smart.l(plusPayAcquisitionApi, bVar, aVar3, jVar, jVar2, com.yandex.plus.core.dispatcher.a.e, lVar2.b.e);
                    case 2:
                        l lVar3 = this.b;
                        return new com.yandex.plus.pay.graphql.avatar.b(lVar3.a(), (com.yandex.plus.core.network.urls.b) ((jyr) lVar3.a.D.b).getValue());
                    case 3:
                        l lVar4 = this.b;
                        dp0 a2 = lVar4.a();
                        i iVar4 = lVar4.a;
                        return new com.yandex.plus.pay.graphql.invoice.e(a2, iVar4.b(), lVar4.b(), iVar4.a());
                    default:
                        return new com.yandex.plus.pay.graphql.user.c(this.b.a());
                }
            }
        });
        final int i4 = 2;
        this.t = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.k
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        l lVar = this.b;
                        dp0 a = lVar.a();
                        i iVar2 = lVar.a;
                        return new com.yandex.plus.pay.graphql.offers.j(a, iVar2.b(), iVar2.w.h, lVar.b());
                    case 1:
                        l lVar2 = this.b;
                        PlusPayAcquisitionApi plusPayAcquisitionApi = (PlusPayAcquisitionApi) lVar2.m.getValue();
                        com.yandex.plus.pay.inapp.api.b bVar = (com.yandex.plus.pay.inapp.api.b) lVar2.F.getValue();
                        i iVar3 = lVar2.a;
                        com.yandex.plus.core.location.a aVar3 = iVar3.n;
                        j jVar = new j(lVar2, 21);
                        j jVar2 = new j(lVar2, 22);
                        ((com.yandex.plus.core.dispatcher.a) iVar3.q).getClass();
                        return new com.yandex.plus.pay.internal.feature.offers.smart.l(plusPayAcquisitionApi, bVar, aVar3, jVar, jVar2, com.yandex.plus.core.dispatcher.a.e, lVar2.b.e);
                    case 2:
                        l lVar3 = this.b;
                        return new com.yandex.plus.pay.graphql.avatar.b(lVar3.a(), (com.yandex.plus.core.network.urls.b) ((jyr) lVar3.a.D.b).getValue());
                    case 3:
                        l lVar4 = this.b;
                        dp0 a2 = lVar4.a();
                        i iVar4 = lVar4.a;
                        return new com.yandex.plus.pay.graphql.invoice.e(a2, iVar4.b(), lVar4.b(), iVar4.a());
                    default:
                        return new com.yandex.plus.pay.graphql.user.c(this.b.a());
                }
            }
        });
        final int i5 = 3;
        this.u = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.k
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        l lVar = this.b;
                        dp0 a = lVar.a();
                        i iVar2 = lVar.a;
                        return new com.yandex.plus.pay.graphql.offers.j(a, iVar2.b(), iVar2.w.h, lVar.b());
                    case 1:
                        l lVar2 = this.b;
                        PlusPayAcquisitionApi plusPayAcquisitionApi = (PlusPayAcquisitionApi) lVar2.m.getValue();
                        com.yandex.plus.pay.inapp.api.b bVar = (com.yandex.plus.pay.inapp.api.b) lVar2.F.getValue();
                        i iVar3 = lVar2.a;
                        com.yandex.plus.core.location.a aVar3 = iVar3.n;
                        j jVar = new j(lVar2, 21);
                        j jVar2 = new j(lVar2, 22);
                        ((com.yandex.plus.core.dispatcher.a) iVar3.q).getClass();
                        return new com.yandex.plus.pay.internal.feature.offers.smart.l(plusPayAcquisitionApi, bVar, aVar3, jVar, jVar2, com.yandex.plus.core.dispatcher.a.e, lVar2.b.e);
                    case 2:
                        l lVar3 = this.b;
                        return new com.yandex.plus.pay.graphql.avatar.b(lVar3.a(), (com.yandex.plus.core.network.urls.b) ((jyr) lVar3.a.D.b).getValue());
                    case 3:
                        l lVar4 = this.b;
                        dp0 a2 = lVar4.a();
                        i iVar4 = lVar4.a;
                        return new com.yandex.plus.pay.graphql.invoice.e(a2, iVar4.b(), lVar4.b(), iVar4.a());
                    default:
                        return new com.yandex.plus.pay.graphql.user.c(this.b.a());
                }
            }
        });
        final int i6 = 4;
        this.v = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.k
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        l lVar = this.b;
                        dp0 a = lVar.a();
                        i iVar2 = lVar.a;
                        return new com.yandex.plus.pay.graphql.offers.j(a, iVar2.b(), iVar2.w.h, lVar.b());
                    case 1:
                        l lVar2 = this.b;
                        PlusPayAcquisitionApi plusPayAcquisitionApi = (PlusPayAcquisitionApi) lVar2.m.getValue();
                        com.yandex.plus.pay.inapp.api.b bVar = (com.yandex.plus.pay.inapp.api.b) lVar2.F.getValue();
                        i iVar3 = lVar2.a;
                        com.yandex.plus.core.location.a aVar3 = iVar3.n;
                        j jVar = new j(lVar2, 21);
                        j jVar2 = new j(lVar2, 22);
                        ((com.yandex.plus.core.dispatcher.a) iVar3.q).getClass();
                        return new com.yandex.plus.pay.internal.feature.offers.smart.l(plusPayAcquisitionApi, bVar, aVar3, jVar, jVar2, com.yandex.plus.core.dispatcher.a.e, lVar2.b.e);
                    case 2:
                        l lVar3 = this.b;
                        return new com.yandex.plus.pay.graphql.avatar.b(lVar3.a(), (com.yandex.plus.core.network.urls.b) ((jyr) lVar3.a.D.b).getValue());
                    case 3:
                        l lVar4 = this.b;
                        dp0 a2 = lVar4.a();
                        i iVar4 = lVar4.a;
                        return new com.yandex.plus.pay.graphql.invoice.e(a2, iVar4.b(), lVar4.b(), iVar4.a());
                    default:
                        return new com.yandex.plus.pay.graphql.user.c(this.b.a());
                }
            }
        });
        this.F = btf.b(new com.yandex.plus.pay.internal.d(2, aVar2, this));
        btf.b(new j(this, 12));
        this.H = btf.b(new g(1));
    }

    public final dp0 a() {
        return (dp0) this.j.getValue();
    }

    public final com.yandex.plus.experiments.impl.providers.h b() {
        return (com.yandex.plus.experiments.impl.providers.h) this.k.getValue();
    }

    public final ExternalMediaBillingApi c() {
        return (ExternalMediaBillingApi) this.l.getValue();
    }

    public final com.yandex.plus.pay.inapp.api.b d() {
        return (com.yandex.plus.pay.inapp.api.b) this.G.getValue();
    }
}
