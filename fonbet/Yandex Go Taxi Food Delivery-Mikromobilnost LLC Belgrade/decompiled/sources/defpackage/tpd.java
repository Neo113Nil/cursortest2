package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class tpd {
    public static final String a(PlusPayCompositeOffers.Offer offer) {
        PlusPayPrice commonPrice;
        PlusPayPrice commonPrice2;
        String currency;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer != null && (commonPrice2 = tariffOffer.getCommonPrice()) != null && (currency = commonPrice2.getCurrency()) != null) {
            return currency;
        }
        PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) a.R(offer.getOptionOffers());
        if (option == null || (commonPrice = option.getCommonPrice()) == null) {
            return null;
        }
        return commonPrice.getCurrency();
    }

    public static final PlusPayCompositeOffers.Offer.Vendor b(PlusPayCompositeOffers.Offer offer) {
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer != null && (vendor = tariffOffer.getVendor()) != null) {
            return vendor;
        }
        PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) a.R(offer.getOptionOffers());
        return option != null ? option.getVendor() : PlusPayCompositeOffers.Offer.Vendor.UNKNOWN;
    }
}
