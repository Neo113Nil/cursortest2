package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.repository.api.model.offers.j1;
import com.yandex.plus.pay.repository.api.model.offers.k1;
import com.yandex.plus.pay.repository.api.model.offers.n0;
import defpackage.b6e;
import defpackage.n8g;
import defpackage.t75;
import defpackage.v75;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class k {
    public static n8g a(PlusPayCompositeOffers.Offer offer) {
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        k1 k1Var = null;
        if (tariffOffer != null) {
            if (tariffOffer.getVendor() != PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                tariffOffer = null;
            }
            if (tariffOffer != null) {
                List<PlusPayCompositeOffers.Offer.Plan> plans = tariffOffer.getPlans();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = plans.iterator();
                while (it.hasNext()) {
                    j1 b = b((PlusPayCompositeOffers.Offer.Plan) it.next(), tariffOffer.getCommonPrice().getCurrency());
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                String commonPeriod = tariffOffer.getCommonPeriod();
                PlusPayPrice commonPrice = tariffOffer.getCommonPrice();
                k1Var = new k1(tariffOffer.getId(), CollectionsKt.h0(arrayList, new j1(commonPeriod, new n0(commonPrice.getAmount(), commonPrice.getCurrency()), 0)));
            }
        }
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : optionOffers) {
            if (((PlusPayCompositeOffers.Offer.Option) obj).getVendor() == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) it2.next();
            List<PlusPayCompositeOffers.Offer.Plan> plans2 = option.getPlans();
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it3 = plans2.iterator();
            while (it3.hasNext()) {
                j1 b2 = b((PlusPayCompositeOffers.Offer.Plan) it3.next(), option.getCommonPrice().getCurrency());
                if (b2 != null) {
                    arrayList4.add(b2);
                }
            }
            String commonPeriod2 = option.getCommonPeriod();
            PlusPayPrice commonPrice2 = option.getCommonPrice();
            arrayList3.add(new k1(option.getId(), CollectionsKt.h0(arrayList4, new j1(commonPeriod2, new n0(commonPrice2.getAmount(), commonPrice2.getCurrency()), 0))));
        }
        n8g b3 = t75.b();
        if (k1Var != null) {
            b3.add(k1Var);
        }
        b3.addAll(arrayList3);
        return t75.a(b3);
    }

    public static j1 b(PlusPayCompositeOffers.Offer.Plan plan, String str) {
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Intro) {
            PlusPayCompositeOffers.Offer.Plan.Intro intro = (PlusPayCompositeOffers.Offer.Plan.Intro) plan;
            String period = intro.getPeriod();
            PlusPayPrice price = intro.getPrice();
            return new j1(period, new n0(price.getAmount(), price.getCurrency()), intro.getRepetitionCount());
        }
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Trial) {
            String period2 = ((PlusPayCompositeOffers.Offer.Plan.Trial) plan).getPeriod();
            BigDecimal valueOf = BigDecimal.valueOf(0L);
            valueOf.getClass();
            return new j1(period2, new n0(valueOf, str), 1);
        }
        if ((plan instanceof PlusPayCompositeOffers.Offer.Plan.IntroUntil) || (plan instanceof PlusPayCompositeOffers.Offer.Plan.TrialUntil)) {
            return null;
        }
        b6e.s();
        return null;
    }
}
