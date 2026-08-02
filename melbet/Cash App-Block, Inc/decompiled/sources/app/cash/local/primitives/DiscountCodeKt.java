package app.cash.local.primitives;

import app.cash.local.primitives.DiscountCode;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class DiscountCodeKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerProfileUsingCashtag.deepLinkSpecs;
    }

    public static final String getOfferToken(List list) {
        OfferToken offerToken;
        String str;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                offerToken = null;
                break;
            }
            DiscountCode discountCode = (DiscountCode) it.next();
            if (discountCode instanceof DiscountCode.BannerOffer) {
                str = ((DiscountCode.BannerOffer) discountCode).offerToken;
            } else if (discountCode instanceof DiscountCode.Entered) {
                str = null;
            } else {
                if (!(discountCode instanceof DiscountCode.MarketingOffer)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = ((DiscountCode.MarketingOffer) discountCode).offerDetails.offerToken;
            }
            offerToken = str != null ? new OfferToken(str) : null;
            if (offerToken != null) {
                break;
            }
        }
        if (offerToken != null) {
            return offerToken.value;
        }
        return null;
    }
}
