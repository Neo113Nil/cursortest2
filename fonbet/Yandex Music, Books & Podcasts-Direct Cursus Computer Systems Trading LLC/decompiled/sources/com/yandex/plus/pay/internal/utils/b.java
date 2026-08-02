package com.yandex.plus.pay.internal.utils;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public abstract class b {
    public static final String a(PlusPayCompositeOffers.Offer offer) {
        Object obj;
        String id;
        offer.getClass();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer != null) {
            if (tariffOffer.getVendor() != PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                tariffOffer = null;
            }
            if (tariffOffer != null && (id = tariffOffer.getId()) != null) {
                return id;
            }
        }
        Iterator<T> it = offer.getOptionOffers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PlusPayCompositeOffers.Offer.Option) obj).getVendor() == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                break;
            }
        }
        PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) obj;
        if (option != null) {
            return option.getId();
        }
        return null;
    }

    public static final String b(PlusPayCompositeOffers.Offer offer) {
        String id;
        offer.getClass();
        StringBuilder sb = new StringBuilder();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        String concat = (tariffOffer == null || (id = tariffOffer.getId()) == null) ? null : id.concat(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        sb.append(CollectionsKt.X(offer.getOptionOffers(), StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, new com.yandex.plus.home.feature.webviews.internal.webview.e(15), 30));
        return sb.toString();
    }
}
