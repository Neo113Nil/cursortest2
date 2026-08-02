package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.analytics.tarifficator.v;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.aur;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.eta;
import defpackage.gdk;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.su4;
import defpackage.v75;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends aur implements Function2 {
    public xdr j;
    public int k;
    public final /* synthetic */ m l;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j m;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, Continuation continuation) {
        super(2, continuation);
        this.l = mVar;
        this.m = jVar;
        this.n = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        nm6 nm6Var;
        PlusPayCompositeUpsale plusPayCompositeUpsale;
        xdr xdrVar;
        Object a2;
        PlusPayRichText fromLegalInfo;
        nm6 nm6Var2 = nm6.a;
        int i = this.k;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = this.m;
        m mVar = this.l;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.a aVar = mVar.k;
            PlusPayCompositeOffers.Offer offer = jVar.a;
            this.k = 1;
            a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.c) aVar).a(offer, this);
            if (a == nm6Var2) {
                return nm6Var2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xdrVar = this.j;
                qgg.h0(obj);
                a2 = obj;
                f fVar = new f((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a) a2);
                xdrVar.getClass();
                xdrVar.m(null, fVar);
                return Unit.a;
            }
            qgg.h0(obj);
            a = obj;
        }
        PlusPayCompositeUpsale plusPayCompositeUpsale2 = (PlusPayCompositeUpsale) a;
        if (plusPayCompositeUpsale2 != null) {
            mVar.w = plusPayCompositeUpsale2;
            PlusPayCompositeOffers.Offer offer2 = plusPayCompositeUpsale2.getOffer();
            offer2.getClass();
            PlusPayCompositeOffers.Offer.Vendor b = com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer2);
            PlusPayCompositeOffers.Offer.Vendor vendor = PlusPayCompositeOffers.Offer.Vendor.NATIVE;
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar2 = this.n;
            if (b == vendor && jVar.c == null) {
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f fVar2 = mVar.t;
                fVar2.getClass();
                boolean z = aVar2.c().f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
                gdk gdkVar = fVar2.a;
                gdkVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("silent", String.valueOf(z));
                linkedHashMap.put("_meta", gdk.c(new HashMap()));
                gdkVar.d("Error.Upsale.NullPaymentMethodId", linkedHashMap);
                mVar.H();
            } else {
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) mVar.s;
                eVar.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = aVar2.c();
                PlusPayCompositeOffers.Offer offer3 = c.a;
                zck a3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer3);
                String str = c.c;
                if (a3 != null) {
                    cdk cdkVar = eVar.a;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar2.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer3.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String str2 = id == null ? "no_value" : id;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer3.getOptionOffers();
                    ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String str3 = str == null ? "no_value" : str;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayCompositeUpsale2.getOffer().getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    if (id2 == null) {
                        id2 = "no_value";
                    }
                    nm6Var = nm6Var2;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayCompositeUpsale2.getOffer().getOptionOffers();
                    plusPayCompositeUpsale = plusPayCompositeUpsale2;
                    ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    boolean z2 = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
                    PlusPayLegalInfo legalInfo = plusPayCompositeUpsale.getOffer().getLegalInfo();
                    String b2 = (legalInfo == null || (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.b.b(fromLegalInfo);
                    if (b2 == null) {
                        b2 = "no_value";
                    }
                    LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
                    t.put("product_id", str2);
                    dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
                    t.put("payment_option", a3.a);
                    eta.u(t, "payment_method_id", str3, false, "card_linked");
                    t.put("upsale_product_id", id2);
                    t.put("upsale_options_id", arrayList2);
                    t.put("upsale_legal_text", b2);
                    t.put("silent", String.valueOf(z2));
                    t.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("Upsale.Shown", t);
                } else {
                    nm6Var = nm6Var2;
                    plusPayCompositeUpsale = plusPayCompositeUpsale2;
                }
                com.yandex.plus.pay.api.analytics.tarifficator.g gVar = eVar.b;
                PlusPayCompositeOffers.Offer offer4 = plusPayCompositeUpsale.getOffer();
                v vVar = (v) gVar;
                vVar.getClass();
                offer4.getClass();
                pnb pnbVar = vVar.a;
                String sessionId = offer4.getMeta().getSessionId();
                pnbVar.getClass();
                sessionId.getClass();
                LinkedHashMap r = su4.r("session_id", sessionId);
                r.put("_meta", pnb.a(new HashMap()));
                pnbVar.e("PlusPayment.Step.Upsale.Start", r);
                com.yandex.plus.pay.api.analytics.tarifficator.e.d(eVar.c, plusPayCompositeUpsale.getOffer(), 0, "upsale_offer", "checkout_upsale_page", null);
                xdrVar = mVar.y;
                this.j = xdrVar;
                this.k = 2;
                a2 = m.a(mVar, plusPayCompositeUpsale, this);
                nm6 nm6Var3 = nm6Var;
                if (a2 == nm6Var3) {
                    return nm6Var3;
                }
                f fVar3 = new f((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a) a2);
                xdrVar.getClass();
                xdrVar.m(null, fVar3);
            }
        } else {
            mVar.H();
        }
        return Unit.a;
    }
}
