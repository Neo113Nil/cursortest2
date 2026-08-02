package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener;

import com.yandex.plus.pay.api.feature.tarifficator.payment.k;
import com.yandex.plus.pay.api.feature.tarifficator.payment.l;
import com.yandex.plus.pay.api.feature.tarifficator.payment.m;
import com.yandex.plus.pay.api.feature.tarifficator.payment.n;
import com.yandex.plus.pay.api.feature.tarifficator.payment.o;
import com.yandex.plus.pay.api.feature.tarifficator.payment.p;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.e;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.f;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.g;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.h;
import defpackage.adk;
import defpackage.b6e;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.pxm;
import defpackage.v75;
import defpackage.zck;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements b {
    public final cdk a;

    public a(cdk cdkVar) {
        cdkVar.getClass();
        this.a = cdkVar;
    }

    public static boolean d(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        j c = aVar.c();
        j jVar = aVar.b;
        if (!Intrinsics.d(jVar.a, c.a)) {
            jVar = null;
        }
        if (jVar != null) {
            c = jVar;
        }
        return c.f == i.b;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b
    public final Unit a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, p pVar) {
        if (pVar instanceof n) {
            e(aVar);
        } else if (pVar instanceof m) {
            e(aVar);
        } else if (!(pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.j) && !(pVar instanceof o) && !(pVar instanceof l) && !(pVar instanceof k) && !(pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.i)) {
            b6e.s();
            return null;
        }
        return Unit.a;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b
    public final Unit b(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        UUID uuid;
        PlusPayCompositeOffers.Offer offer;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails;
        j jVar = aVar.b;
        UUID uuid2 = aVar.a;
        d dVar = jVar.e;
        pxm b = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.b(dVar, aVar.d);
        PlusPayCompositeOffers.Offer offer2 = jVar.a;
        zck a = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer2);
        String str = jVar.c;
        PlusPayCompositeOfferDetails.PaymentMethod a2 = (str == null || (plusPayCompositeOfferDetails = jVar.b) == null) ? null : com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.a.a(plusPayCompositeOfferDetails, str);
        cdk cdkVar = this.a;
        if (a != null) {
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(uuid2);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer2.getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            String str2 = id == null ? "no_value" : id;
            PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = a2;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer2.getOptionOffers();
            uuid = uuid2;
            offer = offer2;
            ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            if (str == null) {
                str = "no_value";
            }
            String str3 = b.a;
            if (str3 == null) {
                str3 = "no_value";
            }
            String str4 = b.b;
            if (str4 == null) {
                str4 = "no_value";
            }
            adk e = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.e(dVar);
            boolean d2 = d(aVar);
            String bankName = paymentMethod != null ? paymentMethod.getBankName() : null;
            String str5 = bankName == null ? "no_value" : bankName;
            LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
            t.put("product_id", str2);
            dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
            t.put("payment_option", a.a);
            t.put("payment_method_id", str);
            t.put(Constants.KEY_PAGE, str4);
            t.put("place", str3);
            t.put("source_type", e.a);
            t.put("bank_name", str5);
            t.put("silent", String.valueOf(d2));
            t.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("PaymentProcess.Opened", t);
        } else {
            uuid = uuid2;
            offer = offer2;
        }
        if (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
            String d3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(uuid);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer.getTariffOffer();
            String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
            String str6 = id2 == null ? "no_value" : id2;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer.getOptionOffers();
            ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
            Iterator<T> it2 = optionOffers2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            LinkedHashMap t2 = com.appsflyer.internal.k.t(cdkVar, d3, "purchase_session_id", d3);
            t2.put("product_id", str6);
            t2.put("options_id", arrayList2);
            t2.put("is_tarifficator", String.valueOf(true));
            t2.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("InAppPayment.Shown", t2);
        }
        return Unit.a;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b
    public final Unit c(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, h hVar) {
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails;
        boolean z = hVar instanceof g;
        cdk cdkVar = this.a;
        if (z) {
            String str = ((g) hVar).b;
            j jVar = aVar.b;
            d dVar = jVar.e;
            pxm b = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.b(dVar, aVar.d);
            PlusPayCompositeOffers.Offer offer = jVar.a;
            zck a = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
            boolean z2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
            PlusPayCompositeOfferDetails.PaymentMethod a2 = (str == null || (plusPayCompositeOfferDetails = jVar.b) == null) ? null : com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.a.a(plusPayCompositeOfferDetails, str);
            if (a != null) {
                String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                String id = tariffOffer != null ? tariffOffer.getId() : null;
                String str2 = id == null ? "no_value" : id;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = a2;
                boolean z3 = z2;
                ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                String str3 = str == null ? z3 ? "in_app" : "no_value" : str;
                String str4 = b.a;
                if (str4 == null) {
                    str4 = "no_value";
                }
                String str5 = b.b;
                if (str5 == null) {
                    str5 = "no_value";
                }
                adk e = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.e(dVar);
                boolean d2 = d(aVar);
                String bankName = paymentMethod != null ? paymentMethod.getBankName() : null;
                String str6 = bankName == null ? "no_value" : bankName;
                LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
                t.put("product_id", str2);
                dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
                t.put("payment_option", a.a);
                t.put("payment_method_id", str3);
                t.put(Constants.KEY_PAGE, str5);
                t.put("place", str4);
                t.put("source_type", e.a);
                t.put("bank_name", str6);
                t.put("silent", String.valueOf(d2));
                t.put("_meta", cdk.c(new HashMap()));
                cdkVar.f("PaymentProcess.Success", t);
            }
        } else if (hVar instanceof f) {
            com.yandex.plus.pay.ui.api.feature.payment.g gVar = ((f) hVar).a;
            j jVar2 = aVar.b;
            d dVar2 = jVar2.e;
            pxm b2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.b(dVar2, aVar.d);
            PlusPayCompositeOffers.Offer offer2 = jVar2.a;
            zck a3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer2);
            String str7 = jVar2.c;
            if (a3 != null) {
                String d3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer2.getTariffOffer();
                String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                String str8 = id2 == null ? "no_value" : id2;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer2.getOptionOffers();
                ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
                Iterator<T> it2 = optionOffers2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                }
                String str9 = str7 == null ? "no_value" : str7;
                String c = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.c(gVar);
                String str10 = b2.a;
                String str11 = str10 == null ? "no_value" : str10;
                String str12 = b2.b;
                this.a.e(d3, str8, arrayList2, a3, str9, c, str12 == null ? "no_value" : str12, str11, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.e(dVar2), d(aVar));
            }
        } else {
            if (!(hVar instanceof e)) {
                b6e.s();
                return null;
            }
            PlusPayCompositeOffers.Offer offer3 = aVar.b.a;
            if (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer3) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                String d4 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer3.getTariffOffer();
                String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                String str13 = id3 == null ? "no_value" : id3;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer3.getOptionOffers();
                ArrayList arrayList3 = new ArrayList(v75.o(optionOffers3, 10));
                Iterator<T> it3 = optionOffers3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                }
                LinkedHashMap t2 = com.appsflyer.internal.k.t(cdkVar, d4, "purchase_session_id", d4);
                t2.put("product_id", str13);
                t2.put("options_id", arrayList3);
                t2.put("is_tarifficator", String.valueOf(true));
                t2.put("_meta", cdk.c(new HashMap()));
                cdkVar.f("InAppPayment.Cancelled", t2);
            }
        }
        return Unit.a;
    }

    public final void e(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        j jVar = aVar.b;
        PlusPayCompositeOffers.Offer offer = jVar.a;
        zck a = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
        String str = jVar.c;
        if (a != null) {
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
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
            boolean d2 = d(aVar);
            cdk cdkVar = this.a;
            cdkVar.getClass();
            d.getClass();
            LinkedHashMap m = dfi.m("purchase_session_id", d, "product_id", id);
            dfi.u(m, "options_id", arrayList, true, "is_tarifficator");
            m.put("payment_option", a.a);
            m.put("payment_method_id", str);
            m.put("silent", String.valueOf(d2));
            m.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("PaymentProcess.Loader.Shown", m);
        }
    }
}
