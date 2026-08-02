package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import com.connectsdk.service.config.AirPlayServiceConfig;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import com.yandex.pulse.metrics.o;
import defpackage.buu;
import defpackage.cdk;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.u75;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object[] objArr = 0;
        i iVar = this.b;
        switch (i) {
            case 0:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b((cdk) iVar.a.a);
            case 1:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.d(new y(iVar.c, iVar.k, (com.yandex.plus.pay.ui.webview.paymentwidget.ui.c) iVar.J0.getValue(), iVar.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b) iVar.N.getValue(), iVar.i, iVar.t, (com.yandex.plus.pay.ui.yb.web.api.b) iVar.s0.getValue(), iVar.q), iVar.g);
            case 2:
                com.yandex.plus.pay.internal.g gVar = iVar.w;
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d(u75.h(new com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.d(gVar), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.b(gVar), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.a(iVar.v)), u75.h(new com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.a((cdk) iVar.a.a), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.c(new com.yandex.plus.home.feature.webviews.internal.webview.a(1, iVar.c(), com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b.class, "setContext", "setContext(Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorContext;)V", 0, 28)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.j(iVar.b.b, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c) iVar.L0.getValue())), iVar.g);
            case 3:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a(iVar.b.e, iVar.e(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c) iVar.L0.getValue(), new k(0, iVar.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isPostPaymentYbEnabled", "isPostPaymentYbEnabled()Z", 0, 19));
            case 4:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.k(iVar.e(), new k(0, iVar.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isClosingOfferEnabled", "isClosingOfferEnabled()Z", 0, 17));
            case 5:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.f(iVar.w, iVar.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar.q).a);
            case 6:
                com.yandex.plus.domain.auth.impl.i iVar2 = iVar.k;
                ((com.yandex.plus.core.dispatcher.a) iVar.i).getClass();
                return new com.yandex.plus.pay.ui.core.api.domain.a(iVar2, com.yandex.plus.core.dispatcher.a.f, iVar.g);
            case 7:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c(iVar.b.e, iVar.e(), new k(0, iVar.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isCounterOffersEnabled", "isCounterOffersEnabled()Z", 0, 18));
            case 8:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.c(iVar.v, iVar.g);
            case 9:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.c(iVar.a().a(), iVar.c(), iVar.w, ((com.yandex.plus.pay.ui.design.plus.api.a) iVar.q).a);
            case 10:
                cdk cdkVar = (cdk) iVar.a.a;
                com.yandex.plus.pay.internal.g gVar2 = iVar.w;
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c(cdkVar, gVar2.f().b, gVar2.f().a, new k(0, iVar.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 11));
            case 11:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.e((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.a) iVar.b0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b) iVar.c0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.common.a) iVar.H.getValue());
            case 12:
                y yVar = new y(iVar.z, (com.yandex.plus.log.api.b) iVar.g);
                com.yandex.plus.pay.log.impl.b bVar = iVar.g;
                ((com.yandex.plus.core.dispatcher.a) iVar.i).getClass();
                return new com.yandex.plus.pay.ui.webview.family.ui.c(yVar, bVar, (com.yandex.plus.pay.ui.webview.common.diagnostic.a) iVar.T.getValue(), com.yandex.plus.core.dispatcher.a.c, com.yandex.plus.core.dispatcher.a.f, new k(0, iVar.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isFamilyWebViewTransparentBackgroundEnabled", "isFamilyWebViewTransparentBackgroundEnabled()Z", 0, 12));
            case 13:
                return new com.yandex.plus.pay.ui.webview.confirmation.c(iVar.g, (com.yandex.plus.pay.ui.core.mobile.domain.a) ((jyr) iVar.a.e).getValue());
            case 14:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.d(iVar.c(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.a) iVar.a0.getValue());
            case 15:
                return new com.yandex.plus.pay.ui.webview.paymentwidget.domain.k(iVar.z);
            case 16:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h(iVar.a().a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar.q).a, iVar.j, iVar.g);
            case 17:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.b(new com.yandex.plus.pay.ui.common.internal.error.content.d(iVar.f()), iVar.g);
            case 18:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j(0, 4, com.yandex.plus.domain.auth.api.e.class, iVar.k.h.getValue(), AirPlayServiceConfig.KEY_AUTH_TOKEN, "getAuthToken()Ljava/lang/String;");
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.k kVar = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.k) iVar.G0.getValue();
                com.yandex.plus.pay.log.impl.b bVar2 = iVar.g;
                ((com.yandex.plus.core.dispatcher.a) iVar.i).getClass();
                return new com.yandex.plus.pay.ui.webview.paymentwidget.ui.c(jVar, kVar, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar.X.getValue(), bVar2, com.yandex.plus.core.dispatcher.a.c, com.yandex.plus.core.dispatcher.a.f);
            case 19:
                x xVar = iVar.u;
                String str = iVar.c;
                com.yandex.plus.core.strings.a aVar = iVar.e;
                com.yandex.plus.pay.reporter.api.f fVar = iVar.h;
                ((com.yandex.plus.core.dispatcher.a) iVar.i).getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.b(xVar, xVar, new com.yandex.plus.pay.internal.benchmark.tarifficator.b(str, aVar, new f(iVar, 26), new buu(iVar, objArr == true ? 1 : 0, 9), fVar, com.yandex.plus.core.dispatcher.a.f), iVar.g);
            case 20:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b(iVar.b(), (cdk) iVar.a.a);
            case 21:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.a aVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.a) iVar.K0.getValue();
                PlusPayCompositeOffers.Offer offer = iVar.b.b;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.b bVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.b) aVar2;
                bVar3.getClass();
                offer.getClass();
                com.yandex.plus.log.api.b bVar4 = bVar3.d;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                if (bVar4.b(aVar3)) {
                    bVar4.c(aVar3, "PerformanceAnalyticsImpl", "Start performance session for offer = " + offer);
                }
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.e(offer, bVar3.a, bVar3.b, bVar3.c, bVar3.d);
            case 22:
                return new h(iVar);
            case 23:
                return new com.yandex.plus.pay.ui.webview.common.diagnostic.c(iVar.k, iVar.g);
            case 24:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.common.a(iVar.k.h);
            case 25:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.i(iVar.c(), (cdk) iVar.a.a, iVar.w.f().c);
            case 26:
                Object f = ((com.yandex.plus.experiments.impl.providers.h) iVar.w.a.getValue()).f();
                r7o r7oVar = z7o.b;
                return (com.yandex.plus.experiments.api.a) (f instanceof t7o ? null : f);
            case 27:
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b((cdk) iVar.a.a, iVar.w.f().a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.silent.b((cdk) iVar.a.a);
            default:
                cdk cdkVar2 = (cdk) iVar.a.a;
                com.yandex.plus.pay.internal.g gVar3 = iVar.w;
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e(cdkVar2, gVar3.f().e, gVar3.f().a);
        }
    }
}
