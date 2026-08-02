package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import com.yandex.plus.pay.repository.api.model.offers.Offer;
import com.yandex.plus.pay.repository.api.model.offers.Price;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class yad0 {
    public final oed0 a;
    public final gdd0 b;

    public yad0(oed0 oed0Var, gdd0 gdd0Var) {
        this.a = oed0Var;
        this.b = gdd0Var;
    }

    public static PlusPayCompositeOffers.Offer.Vendor b(Offer.Vendor vendor) {
        int i = xad0.b[vendor.ordinal()];
        if (i == 1) {
            return PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
        }
        if (i == 2) {
            return PlusPayCompositeOffers.Offer.Vendor.NATIVE;
        }
        if (i == 3 || i == 4 || i == 5) {
            return PlusPayCompositeOffers.Offer.Vendor.UNKNOWN;
        }
        w511.b();
        return null;
    }

    public final PlusPayCompositeOffers.Offer.Plan a(Offer.Plan plan) {
        boolean z = plan instanceof Offer.Plan.Intro;
        oed0 oed0Var = this.a;
        if (z) {
            Offer.Plan.Intro intro = (Offer.Plan.Intro) plan;
            String period = intro.getPeriod();
            Price price = intro.getPrice();
            oed0Var.getClass();
            return new PlusPayCompositeOffers.Offer.Plan.Intro(period, oed0.a(price), intro.getRepetitionCount());
        }
        if (plan instanceof Offer.Plan.IntroUntil) {
            Offer.Plan.IntroUntil introUntil = (Offer.Plan.IntroUntil) plan;
            Price price2 = introUntil.getPrice();
            oed0Var.getClass();
            return new PlusPayCompositeOffers.Offer.Plan.IntroUntil(oed0.a(price2), introUntil.getUntil());
        }
        if (plan instanceof Offer.Plan.Trial) {
            return new PlusPayCompositeOffers.Offer.Plan.Trial(((Offer.Plan.Trial) plan).getPeriod());
        }
        if (plan instanceof Offer.Plan.TrialUntil) {
            return new PlusPayCompositeOffers.Offer.Plan.TrialUntil(((Offer.Plan.TrialUntil) plan).getUntil());
        }
        w511.b();
        return null;
    }

    public final PlusPayCompositeOffers.Offer c(Offer offer, String str, String str2, String str3, boolean z) {
        PlusPayCompositeOffers.Offer.StructureType structureType;
        String str4;
        String positionId = offer.getPositionId();
        int i = xad0.a[offer.getStructureType().ordinal()];
        PlusPayCompositeOffers.Offer.Tariff tariff = null;
        if (i == 1) {
            structureType = PlusPayCompositeOffers.Offer.StructureType.TARIFF;
        } else if (i == 2) {
            structureType = PlusPayCompositeOffers.Offer.StructureType.OPTION;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            structureType = PlusPayCompositeOffers.Offer.StructureType.COMPOSITE;
        }
        String activeTariffId = offer.getActiveTariffId();
        Offer.Tariff tariffOffer = offer.getTariffOffer();
        oed0 oed0Var = this.a;
        if (tariffOffer != null) {
            String id = tariffOffer.getId();
            String name = tariffOffer.getName();
            String title = tariffOffer.getTitle();
            String description = tariffOffer.getDescription();
            String text = tariffOffer.getText();
            String additionalText = tariffOffer.getAdditionalText();
            Price commonPrice = tariffOffer.getCommonPrice();
            oed0Var.getClass();
            PlusPayPrice a = oed0.a(commonPrice);
            String commonPeriod = tariffOffer.getCommonPeriod();
            List<Offer.Plan> plans = tariffOffer.getPlans();
            str4 = positionId;
            ArrayList arrayList = new ArrayList(tcc.n(plans, 10));
            Iterator<T> it = plans.iterator();
            while (it.hasNext()) {
                arrayList.add(a((Offer.Plan) it.next()));
            }
            tariff = new PlusPayCompositeOffers.Offer.Tariff(id, name, title, description, text, additionalText, a, commonPeriod, arrayList, b(tariffOffer.getVendor()), tariffOffer.getPayload());
        } else {
            str4 = positionId;
        }
        List<Offer.Option> optionOffers = offer.getOptionOffers();
        ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers, 10));
        for (Offer.Option option : optionOffers) {
            String id2 = option.getId();
            String name2 = option.getName();
            String title2 = option.getTitle();
            String description2 = option.getDescription();
            String text2 = option.getText();
            String additionalText2 = option.getAdditionalText();
            Price commonPrice2 = option.getCommonPrice();
            oed0Var.getClass();
            PlusPayPrice a2 = oed0.a(commonPrice2);
            String commonPeriod2 = option.getCommonPeriod();
            List<Offer.Plan> plans2 = option.getPlans();
            ArrayList arrayList3 = new ArrayList(tcc.n(plans2, 10));
            Iterator<T> it2 = plans2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(a((Offer.Plan) it2.next()));
            }
            arrayList2.add(new PlusPayCompositeOffers.Offer.Option(id2, name2, title2, description2, text2, additionalText2, a2, commonPeriod2, arrayList3, b(option.getVendor()), option.getPayload()));
        }
        LegalInfo legalInfo = offer.getLegalInfo();
        this.b.getClass();
        PlusPayLegalInfo a3 = gdd0.a(legalInfo);
        List<Offer.Invoice> invoices = offer.getInvoices();
        ArrayList arrayList4 = new ArrayList(tcc.n(invoices, 10));
        for (Offer.Invoice invoice : invoices) {
            long timestamp = invoice.getTimestamp();
            Price price = invoice.getPrice();
            oed0Var.getClass();
            arrayList4.add(new PlusPayCompositeOffers.Offer.Invoice(timestamp, oed0.a(price)));
        }
        Offer.Assets assets = offer.getAssets();
        return new PlusPayCompositeOffers.Offer(str4, structureType, activeTariffId, tariff, arrayList2, a3, arrayList4, z, new PlusPayCompositeOffers.Offer.Assets(assets.getButtonText(), assets.getButtonTextWithDetails(), assets.getSubscriptionName()), offer.isSilentInvoiceAvailable(), new PlusPayCompositeOffers.Offer.Meta(str, str2, str3));
    }

    public final PlusPayCompositeOffers d(String str, iqd iqdVar) {
        String str2 = iqdVar.a;
        String str3 = iqdVar.b;
        ArrayList arrayList = iqdVar.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yad0 yad0Var = this;
            arrayList2.add(yad0Var.c((Offer) it.next(), str2, str, str3, false));
            this = yad0Var;
        }
        return new PlusPayCompositeOffers(str2, str3, arrayList2, str);
    }
}
