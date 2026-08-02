package com.yandex.plus.pay.internal.di;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.bck;
import defpackage.jyr;
import defpackage.x3f;
import defpackage.ybk;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 7;
        int i3 = 5;
        e eVar = this.b;
        switch (i) {
            case 0:
                i iVar = eVar.a;
                String uri = ((com.yandex.plus.core.network.urls.b) ((jyr) iVar.D.e).getValue()).getUrl().toString();
                uri.getClass();
                x3f a = iVar.a();
                com.yandex.plus.core.network.error.a aVar = (com.yandex.plus.core.network.error.a) iVar.F.getValue();
                com.yandex.plus.core.network.error.b bVar = (com.yandex.plus.core.network.error.b) iVar.E.getValue();
                ((com.yandex.plus.network.okhttp.logger.a) com.yandex.plus.network.okhttp.logger.b.a.getValue()).getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.m mVar = new com.yandex.plus.home.feature.webviews.internal.stories.m(4, eVar);
                int i4 = d.a;
                a.getClass();
                aVar.getClass();
                bVar.getClass();
                com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l(new com.yandex.plus.bdui.plus.content.controller.f(i3, new com.yandex.plus.core.network.retrofit.client.a(uri, a, aVar, bVar, mVar), (Function0[]) Arrays.copyOf(new Function0[]{new com.yandex.plus.metrica.utils.n(0, (com.yandex.plus.core.network.urls.b) ((jyr) iVar.D.e).getValue(), com.yandex.plus.core.network.okhttp.utils.a.class, "asNetworkCallInterceptor", "asNetworkCallInterceptor(Lcom/yandex/plus/core/network/urls/UrlProvider;)Lcom/yandex/plus/core/network/okhttp/interceptor/OkHttpNetworkCallInterceptor;", 1, 20)}, 1)));
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.d a2 = com.yandex.plus.core.analytics.logging.e.a(com.yandex.plus.core.analytics.logging.b.a);
                ((com.yandex.plus.core.dispatcher.a) iVar.q).getClass();
                return new com.yandex.plus.analytics.dwh.a(lVar, a2, com.yandex.plus.core.dispatcher.a.e);
            case 1:
                return new com.yandex.plus.pay.internal.analytics.evgen.b((com.yandex.plus.pay.internal.analytics.g) eVar.n.getValue(), (ybk) eVar.i.getValue());
            case 2:
                String uuid = eVar.e.a.toString();
                uuid.getClass();
                return uuid;
            case 3:
                return eVar.a.b().a();
            case 4:
                return eVar.a.m.a();
            case 5:
                String uuid2 = eVar.e.a.toString();
                uuid2.getClass();
                return uuid2;
            case 6:
                return eVar.a.b().a();
            case 7:
                return Boolean.valueOf(r1.l(((com.yandex.plus.pay.common.internal.featureflags.a) ((com.yandex.plus.pay.common.internal.featureflags.c) eVar.b.invoke())).j));
            case 8:
                return new com.yandex.plus.pay.reporter.impl.a((com.yandex.plus.analytics.dwh.a) eVar.c.getValue(), eVar.a.v, new a(eVar, i2));
            case 9:
                com.yandex.plus.pay.common.api.model.a h = com.yandex.plus.home.plaque.animator.internal.utils.a.h(com.yandex.plus.pay.common.api.model.a.b, eVar.a.j);
                com.yandex.plus.pay.internal.analytics.evgen.d dVar = (com.yandex.plus.pay.internal.analytics.evgen.d) eVar.f.getValue();
                com.yandex.plus.pay.internal.analytics.evgen.a aVar2 = new com.yandex.plus.pay.internal.analytics.evgen.a(h, dVar, (com.yandex.plus.pay.reporter.api.f) eVar.d.getValue());
                return new bck(new com.yandex.plus.home.plaque.plugin.internal.proxy.a(i2, aVar2), dVar, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(aVar2, (byte) 0));
            case 10:
                com.yandex.plus.pay.common.api.model.a h2 = com.yandex.plus.home.plaque.animator.internal.utils.a.h(com.yandex.plus.pay.common.api.model.a.b, eVar.a.j);
                com.yandex.plus.pay.internal.analytics.evgen.c cVar = (com.yandex.plus.pay.internal.analytics.evgen.c) eVar.g.getValue();
                com.yandex.plus.pay.internal.analytics.evgen.a aVar3 = new com.yandex.plus.pay.internal.analytics.evgen.a(h2, cVar, (com.yandex.plus.pay.reporter.api.f) eVar.d.getValue());
                return new ybk(new com.yandex.plus.home.plaque.plugin.internal.proxy.a(i3, aVar3), cVar, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(aVar3));
            case 11:
                bck bckVar = (bck) eVar.h.getValue();
                bckVar.getClass();
                return new com.yandex.plus.pay.diagnostic.impl.b(bckVar);
            case 12:
                return new com.yandex.plus.pay.internal.analytics.i((com.yandex.plus.pay.internal.analytics.g) eVar.n.getValue());
            case 13:
                return new com.yandex.plus.pay.internal.analytics.evgen.e((com.yandex.plus.pay.internal.analytics.g) eVar.n.getValue(), (ybk) eVar.i.getValue());
            default:
                return ((com.yandex.plus.pay.internal.analytics.evgen.c) eVar.g.getValue()).a().a;
        }
    }
}
