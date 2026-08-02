package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.analytics.tarifficator.v;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.bfu;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.eta;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.su4;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class m extends bfu {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.a k;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a l;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d m;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a n;
    public final com.yandex.plus.pay.ui.core.api.common.a o;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d p;
    public final y q;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c r;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d s;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f t;
    public boolean u;
    public boolean v;
    public PlusPayCompositeUpsale w;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.c x;
    public final xdr y;
    public final xdr z;

    public m(com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar2, com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d dVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a aVar3, com.yandex.plus.pay.ui.core.api.common.a aVar4, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2, y yVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c cVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d dVar3, com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f fVar, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.api.analytics.tarifficator.a aVar5, com.yandex.plus.pay.ui.core.mobile.domain.a aVar6) {
        aVar.getClass();
        aVar2.getClass();
        dVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        dVar2.getClass();
        cVar.getClass();
        dVar3.getClass();
        fVar.getClass();
        bVar.getClass();
        aVar5.getClass();
        aVar6.getClass();
        this.k = aVar;
        this.l = aVar2;
        this.m = dVar;
        this.n = aVar3;
        this.o = aVar4;
        this.p = dVar2;
        this.q = yVar;
        this.r = cVar;
        this.s = dVar3;
        this.t = fVar;
        this.x = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.c(ot0.F(this), aVar5, aVar6, bVar);
        xdr a = ydr.a(g.a);
        this.y = a;
        this.z = a;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = aVar2.a.a();
        x97.y(ot0.F(this), null, null, new k(this, a2.b(), a2, null), 3);
    }

    public static final void G(m mVar, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a aVar) {
        mVar.x.b();
        xdr xdrVar = mVar.y;
        com.yandex.plus.pay.ui.core.api.common.a aVar2 = mVar.o;
        h hVar = new h(aVar, aVar2.get(R.string.PlusPay_Payment_Loader_ProcessingOrder_Title), aVar2.get(R.string.PlusPay_Payment_Loader_ProcessingOrder_Subtitle));
        xdrVar.getClass();
        xdrVar.m(null, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, PlusPayCompositeUpsale plusPayCompositeUpsale, cg6 cg6Var) {
        j jVar;
        int i;
        String subtitle;
        String offerText;
        String additionalOfferText;
        CharSequence charSequence;
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList2;
        String str8;
        mVar.getClass();
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.t = i2 - Integer.MIN_VALUE;
                Object obj = jVar.r;
                nm6 nm6Var = nm6.a;
                i = jVar.t;
                if (i != 0) {
                    qgg.h0(obj);
                    String title = plusPayCompositeUpsale.getTemplate().getTitle();
                    subtitle = plusPayCompositeUpsale.getTemplate().getSubtitle();
                    offerText = plusPayCompositeUpsale.getTemplate().getOfferText();
                    additionalOfferText = plusPayCompositeUpsale.getTemplate().getAdditionalOfferText();
                    String rejectButtonText = plusPayCompositeUpsale.getTemplate().getRejectButtonText();
                    String acceptButtonText = plusPayCompositeUpsale.getTemplate().getAcceptButtonText();
                    List<String> benefits = plusPayCompositeUpsale.getTemplate().getBenefits();
                    ArrayList arrayList3 = new ArrayList(v75.o(benefits, 10));
                    Iterator<T> it = benefits.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.c((CharSequence) it.next()));
                    }
                    String mobileUrl = plusPayCompositeUpsale.getTemplate().getMainImage().getMobileUrl();
                    PlusPayLegalInfo legalInfo = plusPayCompositeUpsale.getOffer().getLegalInfo();
                    if (legalInfo == null) {
                        charSequence = null;
                        str = title;
                        str2 = rejectButtonText;
                        str3 = acceptButtonText;
                        str4 = mobileUrl;
                        arrayList = arrayList3;
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a(str, subtitle, offerText, additionalOfferText, str2, str3, arrayList, str4, charSequence);
                    }
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar = mVar.p;
                    PlusPayRichText fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo);
                    com.yandex.plus.pay.internal.feature.counter_offers.f fVar = new com.yandex.plus.pay.internal.feature.counter_offers.f(6, mVar);
                    jVar.j = title;
                    jVar.k = subtitle;
                    jVar.l = offerText;
                    jVar.m = additionalOfferText;
                    jVar.n = rejectButtonText;
                    jVar.o = acceptButtonText;
                    jVar.p = arrayList3;
                    jVar.q = mobileUrl;
                    jVar.t = 1;
                    Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(fromLegalInfo, fVar, jVar);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    str5 = title;
                    str6 = rejectButtonText;
                    str7 = acceptButtonText;
                    arrayList2 = arrayList3;
                    obj = a;
                    str8 = mobileUrl;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str8 = jVar.q;
                    arrayList2 = jVar.p;
                    str7 = jVar.o;
                    str6 = jVar.n;
                    additionalOfferText = jVar.m;
                    offerText = jVar.l;
                    subtitle = jVar.k;
                    str5 = jVar.j;
                    qgg.h0(obj);
                }
                str4 = str8;
                charSequence = (CharSequence) obj;
                str = str5;
                arrayList = arrayList2;
                str3 = str7;
                str2 = str6;
                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a(str, subtitle, offerText, additionalOfferText, str2, str3, arrayList, str4, charSequence);
            }
        }
        jVar = new j(mVar, cg6Var);
        Object obj2 = jVar.r;
        nm6 nm6Var2 = nm6.a;
        i = jVar.t;
        if (i != 0) {
        }
        str4 = str8;
        charSequence = (CharSequence) obj2;
        str = str5;
        arrayList = arrayList2;
        str3 = str7;
        str2 = str6;
        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a(str, subtitle, offerText, additionalOfferText, str2, str3, arrayList, str4, charSequence);
    }

    public final void H() {
        this.x.b();
        this.n.b(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.b.a);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        PlusPayCompositeUpsale plusPayCompositeUpsale = this.w;
        if (plusPayCompositeUpsale != null) {
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.l.a.a();
            boolean z = this.v;
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d dVar = this.s;
            if (!z) {
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) dVar;
                eVar.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a.c();
                PlusPayCompositeOffers.Offer offer = c.a;
                zck a2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
                String str = c.c;
                if (a2 != null) {
                    cdk cdkVar = eVar.a;
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
                    if (str == null) {
                        str = "no_value";
                    }
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayCompositeUpsale.getOffer().getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    String str2 = id2 != null ? id2 : "no_value";
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayCompositeUpsale.getOffer().getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    boolean z2 = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
                    LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
                    t.put("product_id", id);
                    dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
                    t.put("payment_option", a2.a);
                    eta.u(t, "payment_method_id", str, false, "card_linked");
                    t.put("upsale_product_id", str2);
                    t.put("upsale_options_id", arrayList2);
                    t.put("silent", String.valueOf(z2));
                    t.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("Upsale.Cancelled", t);
                }
            }
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) dVar;
            eVar2.getClass();
            com.yandex.plus.pay.api.analytics.tarifficator.g gVar = eVar2.b;
            PlusPayCompositeOffers.Offer offer2 = plusPayCompositeUpsale.getOffer();
            v vVar = (v) gVar;
            vVar.getClass();
            offer2.getClass();
            pnb pnbVar = vVar.a;
            String sessionId = offer2.getMeta().getSessionId();
            pnbVar.getClass();
            sessionId.getClass();
            LinkedHashMap r = su4.r("session_id", sessionId);
            r.put("_meta", pnb.a(new HashMap()));
            pnbVar.e("PlusPayment.Step.Upsale.Stop", r);
        }
        super.onCleared();
    }
}
