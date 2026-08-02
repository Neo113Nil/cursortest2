package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.q;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.featureflags.x;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internal.d;
import com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c;
import com.yandex.plus.home.feature.webviews.internal.purchase.pay.g;
import com.yandex.plus.home.feature.webviews.internal.webview.f;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.internal.di.z;
import com.yandex.plus.home.plaque.feature.internal.presentation.h;
import com.yandex.plus.home.t;
import com.yandex.plus.pay.adapter.internal.i;
import com.yandex.plus.pay.adapter.internal.o;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.w;
import defpackage.b8m;
import defpackage.ce5;
import defpackage.h4d;
import defpackage.jyr;
import defpackage.lbq;
import defpackage.sj;
import defpackage.tf6;
import defpackage.tpi;
import defpackage.ub7;
import defpackage.v75;
import defpackage.vso;
import defpackage.xdr;
import defpackage.y5m;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                float f = bVar.b;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, bVar.c, f);
                ofFloat.setDuration(3000L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setRepeatCount(-1);
                return ofFloat;
            case 1:
                d dVar = (d) obj;
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.b;
                String str = "open starting url=" + dVar.a;
                jyr jyrVar = e.a;
                e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, str, null);
                dVar.k(dVar.g);
                return Unit.a;
            case 2:
                ((com.yandex.plus.home.feature.webviews.internal.error.a) obj).a.invoke();
                return Unit.a;
            case 3:
                return new g(((c) obj).a);
            case 4:
                com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c) obj;
                return zsd.F0(zsd.Q(cVar.g, cVar.h, new ub7(12, cVar.d(), new com.yandex.passport.internal.ui.challenge.b(2, cVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c.class, "doOnSubscriptionInfo", "doOnSubscriptionInfo(Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo;)V", 4, 3)), new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.a(4, 4, com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c.class, cVar, "getButtonSectionState", "getButtonSectionState(ZZLcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo;)Lcom/yandex/plus/home/feature/webviews/internal/purchase/button/section/ButtonSectionState;")), cVar.f, lbq.b, null);
            case 5:
                return new com.yandex.plus.home.feature.webviews.internal.smart.c((com.yandex.plus.home.feature.webviews.internal.smart.e) obj);
            case 6:
                s sVar = (s) obj;
                Uri build = new Uri.Builder().scheme((String) sVar.f).authority("plus-home-sdk").path("home").build();
                build.getClass();
                long[] jArr = vso.a;
                return sVar.t(build, new tpi(), false, null);
            case 7:
                f fVar = (f) obj;
                return fVar.a ? fVar.l() : fVar.m();
            case 8:
                com.yandex.plus.home.repository.api.model.plusstate.f c = ((com.yandex.plus.home.graphql.plusstate.f) ((z) ((com.yandex.plus.bdui.plus.content.controller.f) obj).c).k.b).c();
                if (c != null) {
                    return c.a();
                }
                return null;
            case 9:
                ((com.yandex.plus.home.alerts.a) ((jyr) ((com.yandex.plus.home.plaque.feature.internal.presentation.b) obj).a).getValue()).getClass();
                return new a1(8);
            case 10:
                ce5 ce5Var = (ce5) obj;
                p pVar = (p) ce5Var.c;
                y yVar = (y) ce5Var.d;
                y yVar2 = (y) ce5Var.e;
                com.yandex.plus.bdui.flex.factory.e eVar = (com.yandex.plus.bdui.flex.factory.e) ce5Var.f;
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.a) ce5Var.g;
                j jVar = (j) ce5Var.k;
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar2 = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.d) ce5Var.h;
                com.yandex.plus.log.api.b bVar3 = (com.yandex.plus.log.api.b) ce5Var.l;
                tf6 tf6Var = (tf6) ce5Var.m;
                ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) ce5Var.n)).getClass();
                return new h(pVar, yVar, yVar2, eVar, aVar, jVar, dVar2, bVar3, tf6Var, com.yandex.plus.core.dispatcher.a.f, com.yandex.plus.core.dispatcher.a.d);
            case 11:
                com.yandex.plus.home.internal.di.e eVar2 = ((t) ((l) obj).a).c;
                eVar2.getClass();
                com.yandex.plus.home.benchmark.d dVar3 = eVar2.a;
                return new p(dVar3.b("Plaque.Shown"), new q(2, dVar3, com.yandex.plus.home.benchmark.d.class, "trackBenchmark", "trackBenchmark(Lcom/yandex/plus/core/benchmark/Benchmark;Ljava/util/Map;)V", 0, 21), (byte) 0);
            case 12:
                ((com.yandex.plus.home.plaque.plugin.internal.di.d) obj).a.b.getClass();
                return new com.yandex.plus.core.location.a();
            case 13:
                List<PlusPayCompositeOffers.Offer> offers = ((o) obj).a.getOffers();
                ArrayList arrayList = new ArrayList(v75.o(offers, 10));
                for (PlusPayCompositeOffers.Offer offer : offers) {
                    offer.getClass();
                    arrayList.add(new i(offer));
                }
                return arrayList;
            case 14:
                return (com.yandex.plus.pay.a) ((h4d) obj).invoke();
            case 15:
                com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) ((p) obj).c;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                if (bVar4.b(aVar2)) {
                    bVar4.c(aVar2, "WithConnectionEstablishmentOperationDecorator", "Connection flow cancelled");
                }
                return Unit.a;
            case 16:
                return new com.yandex.plus.pay.internal.model.mappers.h((com.yandex.plus.pay.internal.model.mappers.g) ((com.yandex.plus.pay.internal.feature.mailing.d) obj).c.getValue());
            case 17:
                com.yandex.plus.pay.internal.feature.offers.d dVar4 = (com.yandex.plus.pay.internal.feature.offers.d) obj;
                return new com.yandex.plus.pay.internal.model.mappers.a((com.yandex.plus.pay.internal.model.mappers.i) dVar4.d.getValue(), (com.yandex.plus.pay.internal.model.mappers.g) dVar4.e.getValue());
            case 18:
                com.yandex.plus.pay.internal.feature.offers.j jVar2 = (com.yandex.plus.pay.internal.feature.offers.j) obj;
                return new com.yandex.plus.pay.internal.model.mappers.c((com.yandex.plus.pay.internal.model.mappers.i) jVar2.h.getValue(), (com.yandex.plus.pay.internal.model.mappers.g) jVar2.i.getValue());
            case 19:
                return new com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b(((com.yandex.plus.pay.ui.core.debug.internal.common.di.b) obj).e.a);
            case 20:
                Object systemService = ((ErrorContentView) obj).getContext().getSystemService("clipboard");
                systemService.getClass();
                return (ClipboardManager) systemService;
            case 21:
                int i2 = com.yandex.plus.pay.ui.core.mobile.ui.kit.c.b;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((com.yandex.plus.pay.ui.core.mobile.ui.kit.c) obj, (Property<com.yandex.plus.pay.ui.core.mobile.ui.kit.c, Float>) ProgressBar.ROTATION, 0.0f, 360.0f);
                ofFloat2.setRepeatMode(1);
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setDuration(1000L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                return ofFloat2;
            case 22:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i iVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i) ((sj) obj).b;
                return new p(iVar.a().F, iVar.p, iVar.o);
            case 23:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.i iVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.i) ((p) obj).b;
                return Boolean.valueOf(iVar2.e == com.yandex.plus.core.strings.a.a && r1.l(((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) iVar2.x.a.a())).s));
            case 24:
                xdr xdrVar = ((h0) obj).B;
                w wVar = new w(null, false);
                xdrVar.getClass();
                xdrVar.m(null, wVar);
                return Unit.a;
            case 25:
                return new x(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j(0, 5, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.c.class, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d.c, "DEFAULT", "getDEFAULT()Lcom/yandex/plus/pay/ui/tarifficator/mobile/bdui/internal/featureflags/MobileBduiPlusTarifficatorUIFlags;"), new com.yandex.passport.sloth.ui.c(17, (com.yandex.plus.pay.ui.core.internal.tarifficator.a) obj));
            case 26:
                final y5m y5mVar = (y5m) obj;
                y5mVar.getClass();
                return new com.yandex.plus.bdui.analytics.a() { // from class: com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.a
                    @Override // com.yandex.plus.bdui.analytics.a
                    public final void a(com.yandex.plus.bdui.analytics.c cVar2) {
                        cVar2.getClass();
                        String str2 = cVar2.a;
                        Map map = cVar2.b;
                        b8m b8mVar = y5m.this.a;
                        str2.getClass();
                        b8mVar.a(str2, map);
                    }
                };
            case 27:
                return new com.yandex.plus.paymentsdk.api.b((com.yandex.plus.paymentsdk.api.c) obj);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                m mVar = (m) obj;
                return ((com.yandex.plus.paymentsdk.internal.a) mVar.b).a((Context) mVar.c, (com.yandex.plus.core.data.pay.d) mVar.d, (String) mVar.e, (String) mVar.f, (String) mVar.g, new com.yandex.plus.paymentsdk.internal.method.card.a(mVar, 0), true);
            default:
                m mVar2 = (m) obj;
                return ((com.yandex.plus.paymentsdk.internal.a) mVar2.b).a((Context) mVar2.d, (com.yandex.plus.core.data.pay.d) mVar2.e, (String) mVar2.f, (String) mVar2.g, (String) mVar2.h, new com.yandex.plus.paymentsdk.internal.method.card.a(mVar2, 1), false);
        }
    }
}
