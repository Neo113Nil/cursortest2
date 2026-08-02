package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m;
import defpackage.is6;
import defpackage.jyr;
import defpackage.q6k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                is6 is6Var = (is6) obj;
                is6Var.getClass();
                p pVar = this.b;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) pVar.d;
                i iVar = (i) pVar.b;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a b = iVar.b();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.e) iVar.g0.getValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g gVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g) iVar.i0.getValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a e = iVar.e();
                com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar = iVar.x;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.c(dVar, b, eVar, gVar, e, new k(0, fVar, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isPresaleEnabled", "isPresaleEnabled()Z", 0, 20), new k(0, fVar, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSilentInAppPaymentEnabled", "isSilentInAppPaymentEnabled()Z", 0, 21), q6k.l(is6Var), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c) iVar.L0.getValue());
            case 1:
                ((is6) obj).getClass();
                i iVar2 = (i) this.b.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j(iVar2.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.c) iVar2.C0.getValue(), iVar2.g(), (com.yandex.plus.pay.ui.webview.family.domain.a) iVar2.K.getValue(), (com.yandex.plus.pay.ui.webview.common.diagnostic.a) iVar2.T.getValue());
            case 2:
                ((is6) obj).getClass();
                i iVar3 = (i) this.b.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k(iVar3.b(), iVar3.g(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.d) iVar3.x0.getValue(), (com.yandex.plus.pay.ui.core.api.domain.a) iVar3.y0.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.a) iVar3.U.getValue(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isWebSuccessScreenEnabled", "isWebSuccessScreenEnabled()Z", 0, 22), iVar3.g, iVar3.s);
            case 3:
                ((is6) obj).getClass();
                i iVar4 = (i) this.b.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h(iVar4.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.c) iVar4.B0.getValue(), iVar4.g(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a) iVar4.R.getValue(), iVar4.g);
            case 4:
                ((is6) obj).getClass();
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a((com.yandex.plus.pay.ui.core.mobile.domain.b) ((i) this.b.b).e0.getValue());
            case 5:
                ((is6) obj).getClass();
                p pVar2 = this.b;
                i iVar5 = (i) pVar2.b;
                return new l(iVar5.b(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d) iVar5.p0.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d) iVar5.u0.getValue(), iVar5.g(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c) iVar5.z0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.k) iVar5.w0.getValue(), iVar5.e(), iVar5.f(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.silent.a) iVar5.P.getValue(), iVar5.g, iVar5.w.f().d, (com.yandex.plus.pay.ui.core.mobile.domain.a) ((jyr) ((com.yandex.passport.internal.entities.j) pVar2.c).e).getValue());
            case 6:
                ((is6) obj).getClass();
                p pVar3 = this.b;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) pVar3.d;
                i iVar6 = (i) pVar3.b;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a b2 = iVar6.b();
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d dVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d) iVar6.o0.getValue();
                jyr jyrVar = iVar6.r0;
                return new h0(dVar2, b2, dVar3, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d) jyrVar.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d) jyrVar.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.d) iVar6.t0.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d) iVar6.u0.getValue(), iVar6.g(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.k) iVar6.w0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c) iVar6.z0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a) iVar6.q0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h) iVar6.f0.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) iVar6.M.getValue(), iVar6.s, iVar6.f(), iVar6.g, iVar6.w.f().d, (com.yandex.plus.pay.ui.core.mobile.domain.a) ((jyr) ((com.yandex.passport.internal.entities.j) pVar3.c).e).getValue());
            case 7:
                ((is6) obj).getClass();
                i iVar7 = (i) this.b.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j(iVar7.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.a) iVar7.h0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g) iVar7.i0.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.a) iVar7.J.getValue(), iVar7.d(), iVar7.s);
            case 8:
                ((is6) obj).getClass();
                i iVar8 = (i) this.b.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k(iVar8.e(), iVar8.s, iVar8.d(), iVar8.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.c) iVar8.k0.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.a) iVar8.O.getValue());
            case 9:
                ((is6) obj).getClass();
                i iVar9 = (i) this.b.b;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a e2 = iVar9.e();
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a b3 = iVar9.b();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i iVar10 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i) iVar9.j0.getValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.f fVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.f) iVar9.l0.getValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.a aVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.a) iVar9.H0.getValue();
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d d = iVar9.d();
                jyr jyrVar2 = iVar9.m0;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k(e2, b3, iVar10, fVar2, aVar, d, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c) jyrVar2.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c) jyrVar2.getValue(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.d) iVar9.V.getValue());
            case 10:
                ((is6) obj).getClass();
                p pVar4 = this.b;
                i iVar11 = (i) pVar4.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k(iVar11.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.a) iVar11.H0.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.c) iVar11.I0.getValue(), (com.yandex.plus.pay.ui.core.api.domain.a) iVar11.y0.getValue(), iVar11.d(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.a) iVar11.W.getValue(), iVar11.s, iVar11.f(), iVar11.e(), new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(23, pVar4));
            case 11:
                ((is6) obj).getClass();
                p pVar5 = this.b;
                i iVar12 = (i) pVar5.b;
                return new m((com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.a) iVar12.A0.getValue(), iVar12.b(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d) iVar12.u0.getValue(), iVar12.g(), iVar12.f(), iVar12.d(), iVar12.s, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c) iVar12.z0.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d) iVar12.Q.getValue(), (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f) iVar12.S.getValue(), iVar12.g, iVar12.w.f().d, (com.yandex.plus.pay.ui.core.mobile.domain.a) ((jyr) ((com.yandex.passport.internal.entities.j) pVar5.c).e).getValue());
            default:
                ((is6) obj).getClass();
                i iVar13 = (i) this.b.b;
                return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.k(iVar13.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.d) iVar13.F0.getValue(), iVar13.g(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar13.L.getValue());
        }
    }
}
