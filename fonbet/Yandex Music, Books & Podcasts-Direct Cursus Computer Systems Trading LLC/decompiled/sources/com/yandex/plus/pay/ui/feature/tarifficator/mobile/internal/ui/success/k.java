package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.u;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.bfu;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.ot0;
import defpackage.pnb;
import defpackage.su4;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ydr;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class k extends bfu {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a k;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a l;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.d m;
    public final com.yandex.plus.pay.ui.core.api.domain.a n;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.a o;
    public final com.yandex.plus.pay.ui.core.api.common.a p;
    public final com.yandex.plus.pay.log.impl.b q;
    public final y r;
    public final xdr s;
    public final xdr t;

    public k(com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.d dVar, com.yandex.plus.pay.ui.core.api.domain.a aVar3, com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.a aVar4, com.yandex.plus.pay.ui.core.api.common.a aVar5, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar, com.yandex.plus.pay.log.impl.b bVar, y yVar) {
        aVar.getClass();
        aVar2.getClass();
        dVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        bVar.getClass();
        this.k = aVar;
        this.l = aVar2;
        this.m = dVar;
        this.n = aVar3;
        this.o = aVar4;
        this.p = aVar5;
        this.q = bVar;
        this.r = yVar;
        g gVar = g.a;
        xdr a = ydr.a(gVar);
        this.s = a;
        this.t = a;
        aVar.a.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b bVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b) aVar4;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = bVar2.a.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a2.c();
        PlusPayCompositeOffers.Offer offer = c.a;
        zck a3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
        String str = c.c;
        Continuation continuation = null;
        if (a3 != null) {
            cdk cdkVar = bVar2.b;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            id = id == null ? "no_value" : id;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
            ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            str = str == null ? "no_value" : str;
            boolean z = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
            LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
            t.put("product_id", id);
            dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
            t.put("payment_option", a3.a);
            t.put("payment_method_id", str);
            t.put("silent", String.valueOf(z));
            t.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("PaymentProcess.SuccessScreen.Shown", t);
        }
        u uVar = (u) bVar2.c;
        uVar.getClass();
        pnb pnbVar = uVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Success.Start", r);
        if (!((Boolean) kVar.invoke()).booleanValue()) {
            H();
            return;
        }
        xdr xdrVar = this.s;
        xdrVar.getClass();
        xdrVar.m(null, gVar);
        x97.y(ot0.F(this), null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(this, continuation, 7), 3);
    }

    public final void G() {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.k.a.a();
        String str = this.p.get(R.string.PlusPay_Success_Button);
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b bVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b) this.o;
        bVar.getClass();
        str.getClass();
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a.c();
        PlusPayCompositeOffers.Offer offer = c.a;
        zck a2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
        String str2 = c.c;
        if (a2 != null) {
            cdk cdkVar = bVar.b;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            if (id == null) {
                id = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
            ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            if (str2 == null) {
                str2 = "no_value";
            }
            boolean z = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
            LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
            t.put("product_id", id);
            dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
            t.put("payment_option", a2.a);
            t.put("payment_method_id", str2);
            t.put("button_text", str);
            t.put("silent", String.valueOf(z));
            t.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("PaymentProcess.SuccessScreen.ContinueButton.Clicked", t);
        }
        this.l.b(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.b.e);
    }

    public final void H() {
        PlusPayCompositeOfferDetails.SuccessScreenDetails successScreen;
        PlusPayCompositeOfferDetails.SuccessScreenDetails successScreen2;
        List<PlusPayCompositeOfferDetails.OptionOfferDetails> optionOffersDetails;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffDetails;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = this.k.a.a().c().b;
        ArrayList arrayList = new ArrayList();
        if (plusPayCompositeOfferDetails != null && (tariffDetails = plusPayCompositeOfferDetails.getTariffDetails()) != null) {
            arrayList.add(new com.yandex.plus.core.data.common.y(tariffDetails.getLightImageUrl(), tariffDetails.getDarkImageUrl()));
        }
        if (plusPayCompositeOfferDetails != null && (optionOffersDetails = plusPayCompositeOfferDetails.getOptionOffersDetails()) != null) {
            for (PlusPayCompositeOfferDetails.OptionOfferDetails optionOfferDetails : optionOffersDetails) {
                arrayList.add(new com.yandex.plus.core.data.common.y(optionOfferDetails.getLightImageUrl(), optionOfferDetails.getDarkImageUrl()));
            }
        }
        String title = (plusPayCompositeOfferDetails == null || (successScreen2 = plusPayCompositeOfferDetails.getSuccessScreen()) == null) ? null : successScreen2.getTitle();
        if (title == null) {
            title = "";
        }
        String message = (plusPayCompositeOfferDetails == null || (successScreen = plusPayCompositeOfferDetails.getSuccessScreen()) == null) ? null : successScreen.getMessage();
        h hVar = new h(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.a(title, message != null ? message : "", this.p.get(R.string.PlusPay_Success_Button), arrayList));
        xdr xdrVar = this.s;
        xdrVar.getClass();
        xdrVar.m(null, hVar);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.k.a.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b bVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b) this.o;
        bVar.getClass();
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a.c();
        com.yandex.plus.pay.api.analytics.tarifficator.f fVar = bVar.c;
        PlusPayCompositeOffers.Offer offer = c.a;
        u uVar = (u) fVar;
        uVar.getClass();
        offer.getClass();
        pnb pnbVar = uVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Success.Stop", r);
        super.onCleared();
    }
}
