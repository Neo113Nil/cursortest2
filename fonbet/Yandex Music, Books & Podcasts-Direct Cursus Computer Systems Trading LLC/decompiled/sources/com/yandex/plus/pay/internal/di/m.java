package com.yandex.plus.pay.internal.di;

import com.yandex.plus.pay.api.model.SyncType;
import defpackage.c5b;
import defpackage.jyr;
import defpackage.q5b;
import defpackage.u75;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ m(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                return new com.yandex.plus.pay.internal.feature.topup.c((com.yandex.plus.pay.internal.feature.topup.b) nVar.b.z.getValue());
            case 1:
                return new com.yandex.plus.pay.internal.feature.user.listener.b(new com.yandex.plus.pay.internal.feature.user.listener.c[]{new com.yandex.plus.pay.internal.feature.user.listener.b(nVar.c()), new com.yandex.plus.pay.internal.feature.user.listener.g(new m(nVar, 16)), new com.yandex.plus.pay.internal.feature.user.listener.b(nVar.a.t)});
            case 2:
                return new com.yandex.plus.pay.internal.feature.success.d((com.yandex.plus.pay.internal.feature.success.e) nVar.b.A.getValue());
            case 3:
                return new com.yandex.plus.pay.internal.feature.presale.c((com.yandex.plus.pay.internal.feature.presale.f) nVar.b.D.getValue(), nVar.b(), (com.yandex.plus.pay.internal.analytics.tarifficator.k) ((jyr) nVar.d.s).getValue());
            case 4:
                com.yandex.plus.pay.graphql.offers.j jVar = (com.yandex.plus.pay.graphql.offers.j) nVar.b.r.getValue();
                List b = nVar.b();
                e eVar = nVar.c;
                return new com.yandex.plus.pay.internal.feature.presale.k(jVar, b, eVar.e, (com.yandex.plus.pay.internal.analytics.j) eVar.m.getValue(), (com.yandex.plus.pay.internal.analytics.tarifficator.j) ((jyr) nVar.d.g).getValue());
            case 5:
                return new com.yandex.plus.pay.internal.feature.closing.d((com.yandex.plus.pay.internal.feature.closing.f) nVar.b.B.getValue(), nVar.b(), (com.yandex.plus.pay.internal.analytics.tarifficator.f) ((jyr) nVar.d.q).getValue());
            case 6:
                return new com.yandex.plus.pay.internal.feature.counter_offers.d((com.yandex.plus.pay.internal.feature.counter_offers.g) nVar.b.C.getValue(), nVar.b(), (com.yandex.plus.pay.internal.analytics.tarifficator.h) ((jyr) nVar.d.r).getValue());
            case 7:
                return new com.yandex.plus.pay.internal.feature.experiments.listener.b(new com.yandex.plus.pay.internal.feature.experiments.listener.b[]{new com.yandex.plus.pay.internal.feature.experiments.listener.b(nVar.a.t)});
            case 8:
                com.yandex.plus.pay.internal.feature.subscription.b bVar = (com.yandex.plus.pay.internal.feature.subscription.b) nVar.b.p.getValue();
                e eVar2 = nVar.c;
                return new com.yandex.plus.pay.internal.feature.subscription.e(bVar, eVar2.e, (com.yandex.plus.pay.diagnostic.impl.d) ((com.yandex.plus.pay.diagnostic.impl.b) eVar2.j.getValue()).c.getValue());
            case 9:
                com.yandex.plus.pay.inapp.api.b d = nVar.b.d();
                ((com.yandex.plus.core.dispatcher.a) nVar.a.q).getClass();
                return new com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b(d, com.yandex.plus.core.dispatcher.a.f, new m(nVar, 17));
            case 10:
                l lVar = nVar.b;
                com.yandex.plus.pay.graphql.offers.j jVar2 = (com.yandex.plus.pay.graphql.offers.j) lVar.r.getValue();
                c5b c5bVar = c5b.a;
                List b2 = nVar.b();
                com.yandex.plus.experiments.impl.providers.h b3 = lVar.b();
                e eVar3 = nVar.c;
                return new com.yandex.plus.pay.internal.feature.offers.j(jVar2, c5bVar, b2, b3, eVar3.e, (com.yandex.plus.pay.internal.analytics.j) eVar3.m.getValue(), (com.yandex.plus.pay.internal.analytics.tarifficator.j) ((jyr) nVar.d.g).getValue());
            case 11:
                com.yandex.plus.pay.log.impl.b bVar2 = nVar.c.e;
                l lVar2 = nVar.b;
                return new com.yandex.plus.pay.internal.feature.cache.b(bVar2, (com.yandex.plus.pay.internal.feature.user.h) lVar2.n.getValue(), (com.yandex.plus.pay.internal.feature.user.f) lVar2.o.getValue(), (com.yandex.plus.pay.graphql.offers.j) lVar2.r.getValue());
            case 12:
                return new com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.a) nVar.b.E.getValue());
            case 13:
                l lVar3 = nVar.b;
                return new com.yandex.plus.pay.internal.feature.upsale.d((com.yandex.plus.pay.graphql.upsale.c) lVar3.q.getValue(), (com.yandex.plus.pay.internal.analytics.tarifficator.m) ((jyr) nVar.d.m).getValue(), lVar3.d(), nVar.c.e);
            case 14:
                return new com.yandex.plus.pay.internal.feature.user.j(nVar.a.w.h, (com.yandex.plus.pay.graphql.avatar.b) nVar.b.t.getValue(), nVar.c.e);
            case 15:
                e eVar4 = nVar.c;
                return u75.h(new com.yandex.plus.pay.internal.feature.offers.post.e(eVar4.e), new com.yandex.plus.pay.internal.feature.offers.post.d(nVar.b.d(), eVar4.e, (com.yandex.plus.pay.diagnostic.impl.f) ((com.yandex.plus.pay.diagnostic.impl.b) eVar4.j.getValue()).a.getValue()));
            case 16:
                return nVar.a(SyncType.INSTANCE.all());
            case 17:
                Set set = (Set) ((com.yandex.plus.pay.common.internal.featureflags.a) ((com.yandex.plus.pay.common.internal.featureflags.c) nVar.e.invoke())).h.getValue();
                return set == null ? q5b.a : set;
            case 18:
                return new com.yandex.plus.pay.internal.feature.offers.smart.f((com.yandex.plus.pay.internal.feature.offers.smart.g) nVar.b.s.getValue(), nVar.b(), (com.yandex.plus.pay.internal.analytics.tarifficator.d) ((jyr) nVar.d.h).getValue());
            case 19:
                String str = nVar.a.a;
                com.yandex.plus.pay.graphql.invoice.e eVar5 = (com.yandex.plus.pay.graphql.invoice.e) nVar.b.u.getValue();
                e eVar6 = nVar.c;
                return new com.yandex.plus.pay.internal.feature.payment.common.d(str, eVar5, (com.yandex.plus.pay.internal.analytics.h) eVar6.k.getValue(), (com.yandex.plus.pay.internal.model.mappers.f) nVar.f.getValue(), eVar6.e);
            case 20:
                return new com.yandex.plus.pay.internal.feature.payment.common.i((com.yandex.plus.pay.graphql.invoice.e) nVar.b.u.getValue(), (com.yandex.plus.pay.internal.model.mappers.f) nVar.f.getValue(), nVar.c.e);
            case 21:
                l lVar4 = nVar.b;
                return new com.yandex.plus.pay.internal.feature.payment.common.r((com.yandex.plus.pay.graphql.invoice.e) lVar4.u.getValue(), (com.yandex.plus.pay.graphql.user.c) lVar4.v.getValue(), (com.yandex.plus.pay.internal.model.mappers.f) nVar.f.getValue(), nVar.c.e);
            case 22:
                l lVar5 = nVar.b;
                return new com.yandex.plus.pay.internal.feature.offers.d((com.yandex.plus.pay.graphql.offers.j) lVar5.r.getValue(), lVar5.d(), nVar.c.e);
            case 23:
                return new com.yandex.plus.pay.internal.feature.family.b((com.yandex.plus.pay.graphql.family.b) nVar.b.w.getValue(), nVar.c.e);
            case 24:
                return new com.yandex.plus.pay.internal.feature.mailing.d((com.yandex.plus.pay.graphql.offers.m) nVar.b.x.getValue(), nVar.c.e);
            default:
                return new com.yandex.plus.pay.internal.feature.contacts.b((com.yandex.plus.pay.graphql.contacts.b) nVar.b.y.getValue(), nVar.c.e);
        }
    }
}
